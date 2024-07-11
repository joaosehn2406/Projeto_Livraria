package application.verification;

import model.entities.enums.BookGender;
import model.entities.exceptions.AnswerException;
import model.entities.order.Book;
import model.entities.order.Client;
import model.entities.order.Order;
import model.entities.order.OrderItem;
import model.entities.workers.Manager;
import model.entities.workers.SaleHelper;
import model.entities.workers.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Verify {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private List<Worker> workers = new ArrayList<>();

    public void managerDisplay() {
        System.out.println("Welcome Manager!");
        System.out.println("Choose an option: ");
        System.out.println("1. Close application");
        System.out.println("2. Contract worker");
        System.out.println("3. Show workers");
    }

    public void clientDisplay() {
        System.out.println("Welcome Client!");
        System.out.println("Choose an option: ");
        System.out.println("1. Close application");
        System.out.println("2. Buy a book");
        System.out.println("3. Show books");
    }

    public void verification(int answer, Scanner in) {
        int options;
        do {


            if (answer == 1) {
                managerDisplay();
                System.out.println("Enter the correspondent number to the action: ");
                options = in.nextInt();
                in.nextLine(); // Consume the newline character

                switch (options) {
                    case 1:
                        System.out.println("Closing...");
                        break;
                    case 2:
                        contractWorker(in);
                        break;
                    case 3:
                        showWorkers();
                        break;
                    default:
                        System.out.println("Fill the blanks correctly");
                        break;
                }
            } else {
                clientDisplay();
                System.out.println("Enter the correspondent number to the action: ");
                options = in.nextInt();
                in.nextLine();
                switch (options) {
                    case 1:
                        System.out.println("Closing...");
                        break;
                    case 2:
                        registerClient(in);
                        break;
                    case 3:
                        showBooks();
                        break;
                    default:
                        System.out.println("Choose a valid option");
                        break;
                }
            }
        } while (options != 1);
    }

    public void contractWorker(Scanner in) {
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("CPF: ");
        String cpf = in.nextLine();
        if (isValidCpf(cpf)) {
            System.out.println("Valid CPF.");
        } else {
            System.out.println("Invalid CPF.");
        }
        System.out.print("Birth Date (dd/MM/yyyy): ");
        String birthDateString = in.nextLine();
        Date birthDate;
        try {
            birthDate = sdf.parse(birthDateString);
        } catch (ParseException e) {
            throw new AnswerException("Need to follow (dd/MM/yyyy) pattern");
        }
        System.out.print("ID: ");
        int id = in.nextInt();
        in.nextLine(); // Consume the newline character
        System.out.print("Value per hour: ");
        double valuePerHour = in.nextDouble();
        System.out.print("Work hours: ");
        int workHours = in.nextInt();
        in.nextLine(); // Consume the newline character
        System.out.print("Role: ");
        String role = in.nextLine().toLowerCase();
        if (role.equals("salehelper")) {
            System.out.print("Sales quantity: ");
            int salesQuantity = in.nextInt();
            in.nextLine(); // Consume the newline character
            SaleHelper sl = new SaleHelper(valuePerHour, workHours, name, cpf, birthDate, id, salesQuantity);
            workers.add(sl);
        } else {
            System.out.print("Sales quantity for bonus calculation: ");
            int salesQuantity = in.nextInt();
            in.nextLine(); // Consume the newline character
            double bonus = salesQuantity > 100 ? 1000.0 : 500.0;
            Manager mn = new Manager(valuePerHour, workHours, name, cpf, birthDate, id, bonus);
            workers.add(mn);
        }
    }

    public void showWorkers() {
        if (workers.isEmpty()) {
            System.out.println("No workers found.");
        } else {
            for (Worker worker : workers) {
                System.out.println(worker);
            }
        }
    }

    public void registerClient(Scanner in) {
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Cpf: ");
        String cpf = in.nextLine();
        if (isValidCpf(cpf)) {
            System.out.println("Valid CPF.");
        } else {
            System.out.println("Invalid CPF.");
        }
        System.out.print("Birth Date (dd/MM/yyyy): ");
        String birthDateString = in.nextLine();
        Date birthDate;
        try {
            birthDate = sdf.parse(birthDateString);
        } catch (ParseException e) {
            throw new AnswerException("Need to follow (dd/MM/yyyy) pattern");
        }
        Client client = new Client(name, email, cpf, birthDate);
        itemsOrder(in, client);
    }

    public void showBooks() {
        Book book = new Book();
        System.out.println(book);
    }

    public boolean isValidCpf(String cpf) {
        String cpfPattern = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return cpf.matches(cpfPattern);
    }

    public void itemsOrder(Scanner in, Client client) {
        Order order = new Order(new Date(), client);
        System.out.print("How many items to this order? ");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Book name: ");
            String bookName = in.nextLine();
            System.out.print("Book price: ");
            double productPrice = in.nextDouble();
            in.nextLine();
            System.out.print("Book author: ");
            String bookAuthor = in.nextLine();
            System.out.print("Book gender: ");
            BookGender bk = BookGender.valueOf(in.nextLine().toUpperCase());

            Book book = new Book(bookAuthor, bookName, productPrice, bk);

            System.out.print("Quantity: ");
            int quantity = in.nextInt();
            in.nextLine();

            OrderItem orderItem = new OrderItem(quantity, productPrice, book);
            order.addItem(orderItem);
        }

        System.out.println("Order placed: " + order);
    }
}
