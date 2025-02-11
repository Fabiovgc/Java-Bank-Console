package javaBank.main;

import java.util.Scanner;

import javaBank.entity.User;
import javaBank.service.UserService;

public class Main {
        
        private static Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {

                UserService userService = new UserService();
                
                System.out.println("Enter your username: ");
                String username = scanner.next();

                System.out.println("Enter your password: ");
                String password = scanner.next();

                System.out.println("Username: " + username + ". Password: " + password);

                User user = userService.login(username, password);
                if(user!=null){
                        System.out.println("You are Logged in successfully.");
                } else {
                        System.out.println("Login failed");
                }


        }
}
