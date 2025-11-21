import java.io.Serializable;
    /**
     * Person base class
     */
    public class Person implements FileData, Serializable {
        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

        /**
         * Default constructor
         */


        public Person() {}

        /**
         * Parameterized Constructor
         */
        public Person( String id, String firstName, String lastName, String email, String phone) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phone = phone;
        }

        //Getters and Setters
        public String getId() {return id;}
        public void setId(String id) { this.id = id;}
        public String getFirstName() {return firstName;}
        public void setFirstName(String firstName) {this.firstName = firstName;}
        public String getLastName() {return lastName;}
        public void setLastName(String lastName) {this.lastName = lastName;}
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        /**
         * Returns CSV line for a Person (id, first, last, email, phone)
         */
        @Override
        public String getFileData() {
            return safe(id) + "," + safe(firstName) + "," + safe(lastName) + "," + safe(email) + "," + safe(phone);
        }

        private String safe(String s) {
            return (s == null) ? "" : s.replace(",", " "); 
        }
     }
