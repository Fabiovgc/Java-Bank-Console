package javaBank.main;

import java.util.Scanner;

import javaBank.entity.User;
import javaBank.service.UserService;

public class Main {
        
        private static Scanner scanner = new Scanner(System.in);
        static UserService userService = new UserService();
        static Main main = new Main();

        
        public static void main(String[] args) {

                UserService userService = new UserService();


                // While true means that the code will run and repeat itself in a loop

                while(true){
                        System.out.println("Enter your username: ");
                        String username = scanner.next();
        
                        System.out.println("Enter your password: ");
                        String password = scanner.next();
        
                        System.out.println("Username: " + username + ". Password: " + password);
        
                        User user = userService.login(username, password);
        
                        // Checking if the information passed is equal to any user.
                        // Also checking if the user's role is admin (role: admin) or a commom user (role:user)
                        // If the username or password is not found, the log in fails
                        if(user!=null && user.getRole().equals("admin")){
        
                                main.initAdmin();
        
                        } else if (user!=null && user.getRole().equals("user")){
        
                                main.initCustomer();
        
                        } else {
        
                                System.out.println("Login failed");
        
                        }
                }
                
        }





        

        private void initAdmin(){

                boolean flag = true;

                while(flag){

                        System.out.println("1. Exit/Logout");
                        System.out.println("2. Create a customer accoount");
        
        
                        int selectedOption = scanner.nextInt();
        
                        switch (selectedOption) {
                                case 1:
                                        flag = false;
                                        System.out.println("Good Bye !");
                                        break;
                                case 2:
                                        main.addNewCustomer();
                                        break;
                                default:
                                        System.out.println("Wrong choice ! ");;
                        }

                }
 
        }

        private void addNewCustomer(){

                System.out.println("Enter username");
                String username = scanner.next();

                System.out.println("Enter password");
                String password = scanner.next();

                System.out.println("Enter contact number");
                String contactNumber = scanner.next();

                boolean result = userService.addNewCustomer(username, password, contactNumber);

                if(result){
                        System.out.println("New customer account successfully created.");
                } else{
                        System.out.println("customer account creation failed");
                }
        }

        private void initCustomer(){

                boolean flag = true;

                while(flag){
                        System.out.println("1. Exit/Logout");
                        int selectedOption = scanner.nextInt();

                        switch (selectedOption) {
                                case 1:
                                flag = false;
                                        System.out.println("Good Bye!");
                                        break;
                                default:
                                        break;
                        }

                }

        }

}
