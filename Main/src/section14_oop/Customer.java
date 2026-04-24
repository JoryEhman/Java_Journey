package section14_oop;

public class Customer {
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;

    private int customerIndex = 0;

    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(){
        customerIndex++;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
            this.name = "Place Holder";
        } else {
            this.name = name;
        }
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        if (address.isEmpty()){
            this.address = "Place Holder Lane";
        } else {
            this.address = address;
        }
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.isEmpty()){
            this.phoneNumber = "123-456-7890";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public Customer(){
        setCustomerId();
        setName("");
        setAddress("");
        setPhoneNumber("");
    }

    public Customer(String name){
        setCustomerId();
        setName(name);
        setAddress("");
        setPhoneNumber("");
    }

    public Customer(String name, String address){
        setCustomerId();
        setName(name);
        setAddress(address);
        setPhoneNumber("");
    }

    public Customer(String name, String address, String phoneNumber){
        setCustomerId();
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }
}
