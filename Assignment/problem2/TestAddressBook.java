
package problem2;


public class TestAddressBook {
    public static void main(String[] args)
    {
        AddressBook obj = new AddressBook();
        Date d = new Date("19","July","2003");
        Address a= new Address("Bakhshipull","Peshawar","KPK",2500);
        
        SpecialPerson person = new SpecialPerson(d,a,"friend","348","Ali","Khan","Male");
        obj.loadData(person);
        obj.searchByLastName("Khan");
    }
    
}
