import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        Scanner sc =  new Scanner(System.in);
        FileHandling f = new FileHandling();



       int choice;

        do {
            System.out.println("Press 1 to Create a New File ");
            System.out.println("Press 2 to write in a existing File ");
            System.out.println("Press 3 to read data existing from  ");
            System.out.println("Press 4 to Exit the program ");
            System.out.print("Enter your choice >>   ");
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Enter the name of File you want to create : ");
                    String nn = sc.nextLine();
                    f.createFile(nn);
                    break;

                case 2:
                    System.out.print("Enter data which you want to write in the file: ");
                    String data = sc.nextLine();
                    f.writeFile(data);
                    break;

                case 3:
                    System.out.print("Enter the File name from which you want to read data: ");
                    String fName = sc.nextLine();
                    f.readFile(fName);

                case 4:
                    System.out.println("You have successfully exited the program ");
                    System.exit(0);

            }

        }while (choice != 4);

    }
}
