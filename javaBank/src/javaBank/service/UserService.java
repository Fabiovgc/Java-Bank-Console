package javaBank.service;


import javaBank.entity.User;
import javaBank.repository.UserRepositoy;

public class UserService {

        private UserRepositoy userRepositoy = new UserRepositoy();

        public void printUsers(){
                userRepositoy.printUsers();
        }

        public User login(String username, String password){
                return userRepositoy.login(username, password);
        }

        public boolean addNewCustomer(String username, String password, String contactNumber){
                return userRepositoy.addNewCustomer(username, password, contactNumber);
        }
}
