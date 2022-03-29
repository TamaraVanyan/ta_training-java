package javaclasses;

class Patient {
    private long id;
    private String name;
    private String surname;
    private String middlename;
    private String address;
    private String tell;
    private int number;
    private String diacnosis;

    public Patient(long id, String name, String surname, String middleName, String address, String tell, int number, String diacnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.address = address;
        this.tell = tell;
        this.number = number;
        this.diacnosis = diacnosis;
    }
    public long getId(){return id;}
    public String getName(){ return name; }
    public String getSurname(){return surname;}
    public String getMiddlename(){return middlename;}
    public String getAddress(){return address;}
    public String getTell(){return tell;}
    public int getNumber(){return number;}
    public String getDiacnosis(){return diacnosis;}

}
