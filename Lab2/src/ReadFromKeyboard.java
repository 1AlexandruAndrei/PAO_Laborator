import java.util.Scanner;

public class ReadFromKeyboard {
    private Scanner scanner = new Scanner(System.in);
    private DataStorage dataStorage = new DataStorage();

    public static void main(String[] args)
    {
        new ReadFromKeyboard().start();
    }

    private void start()
    {
        while (true)
        {
            System.out.println("Enter command >>> ");
            String cmd = scanner.nextLine();

            switch (cmd)
            {
                case "create":
                    create();
                    break;
                case "read":
                    read();
                    break;
                case "update":
                    update();
                    break;
                case "delete":
                    delete();
                    break;
                case "quit":
                    scanner.close();
                    return;
                case "help":
                    help();
                    break;
                default:
                    System.out.println("INVALID");
                    break;
            }
        }
    }

    private void create()
    {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Sold: ");
        int sold = scanner.nextInt();
        scanner.nextLine();

        POJO newUser = new POJO();
        newUser.setName(username);
        newUser.setSold(sold);
        DataStorage.put(username, newUser);
        System.out.println("User was created.");
    }

    private void read()
    {
        System.out.print("Username you want to read: ");
        String username = scanner.nextLine();
        POJO user = DataStorage.get(username);

        if (user != null)
        {
            System.out.println("Username: " + user.getName());
            System.out.println("Sold: " + user.getSold());
        }
        else
        {
            System.out.println("NOT FOUND");
        }
    }

    private void update()
    {
        System.out.print("Username you want to update: ");
        String username = scanner.nextLine();
        POJO user = dataStorage.get(username);

        if (user != null)
        {
            System.out.print("new sold: ");
            int newSold = scanner.nextInt();
            scanner.nextLine();
            user.setSold(newSold);
            System.out.println("User was updated.");
        }
        else
        {
            System.out.println("NOT FOUND");
        }
    }

    private void delete()
    {
        System.out.print("Username you want to delete: ");
        String username = scanner.nextLine();
        if (dataStorage.get(username) != null) {
            dataStorage.remove(username);
            System.out.println("User was deleted.");
        }
        else
        {
            System.out.println("NOT FOUND");
        }
    }

    private void help()
    {
        System.out.println("Command received: help\n" +
                "\n" +
                "\tAccepted commands:\n" +
                "\t\thelp: Instructions on how to use the application\n" +
                "\t\tupdate: Update data. Can receive two parameters: username and sold.\n" +
                "\t\tdelete: Delete the user's data.  Receive the username.\n" +
                "\t\tquit: Close the application.");
    }
}
