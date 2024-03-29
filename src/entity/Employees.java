package entity;

import java.util.Date;

public class Employees {

        private String firstname;
        private String lastName;
        private int id;
        private String dept;
        private Date DOB;
        private String email;
        private String designation;
        private String address;
        private String bloodGrp;
        private String gender;
        private long phoneNumber;
        private long emergencyContact;

        public String getFirstname() { return firstname; }
        public void setFirstname(String firstname) { this.firstname = firstname; }
        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getDept() { return dept; }
        public void setDept(String dept) { this.dept = dept; }
        public Date getDOB() { return DOB; }
        public void setDOB(Date DOB) { this.DOB = DOB; }
        public String getDesignation() {
            return designation;
        }
        public void setDesignation(String designation) {
            this.designation = designation;
        }
        public String getAddressl() {
            return address;
        }
        public void setAddressl(String addressl) {
            this.address = address;
        }
        public void setEmail(String email){ this.email = email; }
        public String getEmail(){ return email; }
        public void setBloodGrp(String email){ this.bloodGrp = bloodGrp; }
        public String getBloodGrp(){ return bloodGrp; }
        public void setGender(String gender){ this.gender = gender; }
        public String getGender(){ return gender; }
        public void setPhoneNumber(long phoneNumber){ this.phoneNumber = phoneNumber; }
        public long getPhoneNumber(){ return phoneNumber; }
        public void setEmergencyContact(long emergencyContact){ this.emergencyContact = emergencyContact; }
        public long getEmergencyContact(){ return emergencyContact; }
}
