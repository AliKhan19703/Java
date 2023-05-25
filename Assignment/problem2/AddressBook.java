
package problem2;

public class AddressBook {
    SpecialPerson[] entries = new SpecialPerson[5];
    int size = 0;

    public AddressBook() {
    }
    
    
    
    public void loadData(SpecialPerson entry)
    {
        if(size<entries.length)
        {
            entries[size] = entry;
            size++;
        }
        else
        {
            System.out.println("The AddressBook is full! ");
        }
    }
    public void searchByLastName(String lName)
    {
        for(int i = 0;i<entries.length;i++)
        {
            if(entries[i].getLastName().equals(lName))
            {
                System.out.println(entries[i].toString());
            }
        }
    }
    public void birhtdaysInGivenMonth(String month)
    {
        for(int i =0;i<entries.length;i++)
        {
            if(entries[i].getDOB().equals(month))
            {
                System.out.println(entries[i].getFirstName()+entries[i].getLastName());
            }
        }
    }

}