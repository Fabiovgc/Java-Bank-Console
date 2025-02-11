package javaBank.entity;

public class User {
        
        private String username;
        private String password;
        private String contactNumber;
        private String role;
        private Double accountBalance;


        // Constructor
        public User(String username, String password, String contactNumber, String role, Double accountBalance ){
                this.username = username;
                this.password = password;
                this.contactNumber = contactNumber;
                this.role = role;
                this.accountBalance = accountBalance;
        }


        // Getters and Setters
        public String getUsername() {
                return username;
        }


        public void setUsername(String username) {
                this.username = username;
        }


        public String getPassword() {
                return password;
        }


        public void setPassword(String password) {
                this.password = password;
        }


        public String getContactNumber() {
                return contactNumber;
        }


        public void setContactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
        }


        public String getRole() {
                return role;
        }


        public void setRole(String role) {
                this.role = role;
        }


        public Double getAccountBalance() {
                return accountBalance;
        }


        public void setAccountBalance(Double accountBalance) {
                this.accountBalance = accountBalance;
        }


        // Using Equals And Hashcode to compare the username, password and contact number. Those properties can not repeat.


        @Override
        public String toString() {
                return "User [username=" + username + ", password=" + password + ", contactNumber=" + contactNumber
                                + ", role=" + role + ", accountBalance=" + accountBalance + "]";
        }


        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((username == null) ? 0 : username.hashCode());
                result = prime * result + ((password == null) ? 0 : password.hashCode());
                result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
                return result;
        }


        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                User other = (User) obj;
                if (username == null) {
                        if (other.username != null)
                                return false;
                } else if (!username.equals(other.username))
                        return false;
                if (password == null) {
                        if (other.password != null)
                                return false;
                } else if (!password.equals(other.password))
                        return false;
                if (contactNumber == null) {
                        if (other.contactNumber != null)
                                return false;
                } else if (!contactNumber.equals(other.contactNumber))
                        return false;
                return true;
        }

        

}
