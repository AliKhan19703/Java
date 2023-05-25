
package problem2;


public class SpecialPerson extends Person {
    private Date DOB;
    private Address personAddress;
    private String classifyPerson;
    private String phoneNumber;

    public SpecialPerson(Date DOB, Address personAddress, String classifyPerson, String phoneNumber, String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
        this.DOB = DOB;
        this.personAddress = personAddress;
        this.classifyPerson = classifyPerson;
        this.phoneNumber = phoneNumber;
    }

    public String getClassifyPerson() {
        return classifyPerson;
    }

    public Date getDOB() {
        return DOB;
    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setClassifyPerson(String classifyPerson) {
        this.classifyPerson = classifyPerson;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        super.toString();
        String str = "DOB : "+DOB+" Person Address : "+personAddress+" Phone Number : "+phoneNumber+" Classify Person : "+classifyPerson;
        return str;
    }   

    
   
    
}
