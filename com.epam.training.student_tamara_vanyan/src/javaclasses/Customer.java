package javaclasses;

public class Customer {
    private long id;
    private String name;
    private String surname;
    private String middlename;
    private String address;
    private long card;
    private long account;

    public Customer(long id, String name, String surname, String middlename, String address, long card, long account) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.address = address;
        this.card = card;
        this.account = account;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){return  surname;}
    public String getMiddlename(){return  middlename;}
    public String getAddress(){
        return address;
    }
    public long getCard(){
        return card;
    }
    public long getAccount(){
        return card;
    }
}