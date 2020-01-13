
import java.util.Scanner;

public class Profiling {

    public static void main(String[] args) {
        Scanner jess = new Scanner(System.in);

        int n = 100;
        int i = 0;

        String[] username = new String[n];
        String[] Password = new String[n];
        int[] Age = new int[n];
        String[] Gender = new String[n];
        String[] Contactnom = new String[n];

        System.out.println("What do you want to do?");
        System.out.println("1. Add Profile");
        System.out.println("2. Exit");
        System.out.println("---------------------------");
        int c = jess.nextInt();

        switch (c) {
            case 1:
                boolean hunt = true;
                int u = 1;
                hunt:
                while (hunt) {

                    System.out.println("Enter profile #" + u);
                    System.out.print("Username:");
                    jess.nextLine();
                    username[i] = jess.nextLine();
                    System.out.print("Password:");
                    Password[i] = jess.nextLine();
                    System.out.print("Age:");
                    Age[i] = jess.nextInt();
                   jess.nextLine();
                    System.out.print("Gender:");
                    Gender[i] = jess.nextLine();
                    System.out.print("Contact Number:");
                    Contactnom[i] = jess.nextLine();
                    i++;
                    System.out.println("--------------------------");

                    System.out.println("Do you want to add more?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("----------------------");
                    int b = jess.nextInt();
                
                    switch (b) {
                        case 1:
                            u++;
                            continue;
                        case 2:
                            boolean kill = true;
                            kill:
                            while (kill) {
                                System.out.println("----------------------------");
                                System.out.println("What do you intend to do.");
                                System.out.println("1. Add Profile");
                                System.out.println("2. Search Profile");
                                System.out.println("3. Show Profile");
                                System.out.println("4. Edit");
                                System.out.println("5. Exit");
                                System.out.println("---------------------------");
                                int ch = jess.nextInt();
                                switch (ch) {
                                    case 1:
                                        continue hunt;
                                    case 2:
                                        System.out.println("Enter name that you wish to search:");
                                        jess.nextLine();
                                        String k = jess.nextLine();
                                        for (int j = 0; j < username.length; j++) {
                                            if (k.equals(username[j])) {
                                                System.out.println("Name:" + username[j]);
                                                System.out.println("Password:" + Password[j]);
                                                System.out.println("Age:" + Age[j]);
                                                System.out.println("Gender:" + Gender[j]);
                                                System.out.println("Contact:" + Contactnom[j]);
                                                continue kill;
                                            }
                                        }
                                        System.out.println("Profile Not Found!");
                                        continue;
                                    case 3:
                                        for (int j = 0; j <= u-1; j++) {
                    System.out.println("Name: " + username[j] + "\nUsername: " + username[j] + "\nPassword: " + Password[j] + "\nAge: " + Age[j]);
                }break;
                                    case 4:
                                        int p = 0;
                                        for (int z = 1; z <= i; z++) {
                                            System.out.println("Select " + p + " to edit profile " + z + ". " + username[p]);
                                            p++;
                                        }

                                        int y = jess.nextInt();

                                        System.out.println("Name: " + username[y]);
                                        System.out.println("Password: " + Password[y]);
                                }
                            }
                    }
                }
        }
    }
}

                           
                    
                
        
                    