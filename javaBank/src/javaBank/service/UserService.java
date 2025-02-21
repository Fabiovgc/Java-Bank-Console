package javaBank.service;


import javaBank.entity.User;
import javaBank.repository.UserRepository;

public class UserService {

        private UserRepository userRepository = new UserRepository();

        public void printUsers(){
                userRepository.printUsers();
        }

        public User login(String username, String password){
                return userRepository.login(username, password);
        }

        public boolean addNewCustomer(String username, String password, String contactNumber){
                return userRepository.addNewCustomer(username, password, contactNumber);
        }


        public Double checkBankBalance(String userId){
                return userRepository.checkBankBalance(userId);
        }



        //         public User findByUsername(String username){
        //                 return userRepository.findByUsername(username);
        // }

        // public static double getAccountBalance(UserRepository userRepository, String username){
        //         User FindUsername = userRepository.findByUsername(username);        
        //         return FindUsername.getAccountBalance();
                
        // }


}
