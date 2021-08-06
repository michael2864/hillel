package HW6;


//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
//        Phone: id, Фамилия, Имя, Отчество, Адрес, Номер телфона, Номер кредитной карточки, Дебет, Кредит, Время городских и междугородных разговоров, трафик интернета
//        Создать интерфейс и его реализацию для выборки данных и вывести эти данные на консоль.
//        a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
//        b) сведения об абонентах, которые пользовались междугородной связью;
//        c) сведения об абонентах в алфавитном порядке.
//        д) сведения об первых 10 абонентов у который самый большой трафик интернета

public class Phone<p1> {
    private int id;
    private String surName;
    private String name;
    private String familyName;
    private String address;
    private String number;
    private long cardId;
    private int debit;
    private int credit;
    private int townTime;
    private int intTime;
    private int size;

    public Phone(int id, String surName, String name, String familyName, String address, String number, long cardId, int debit, int credit, int townTime, int intTime, int size) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.familyName = familyName;
        this.address = address;
        this.number = number;
        this.cardId = cardId;
        this.debit = debit;
        this.credit = credit;
        this.townTime = townTime;
        this.intTime = intTime;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTownTime() {
        return townTime;
    }

    public void setTownTime(int townTime) {
        this.townTime = townTime;
    }

    public int getIntTime() {
        return intTime;
    }

    public void setIntTime(int intTime) {
        this.intTime = intTime;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", cardId=" + cardId +
                ", debit=" + debit +
                ", credit=" + credit +
                ", townTime=" + townTime +
                ", intTime=" + intTime +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Phone p1 = new Phone(1, "s", "y", "v", "hdfhdsh", "+215126126", 516835436, 240, 300, 2, 0, 2400);
        Phone p2 = new Phone(2, "h", "M", "v", "hdfhdsh", "+438348348", 516854836, 101, 400, 0, 102, 100);
        Phone p3 = new Phone(3, "s", "y", "v", "hdfhdsh", "+968576352", 516838956, 45, 300, 0, 0, 2);
        Phone p4 = new Phone(4, "g", "M", "v", "hdfhdsh", "+238734959", 516469579, 43, 100, 200, 102, 400);
        Phone p5 = new Phone(5, "a", "y", "v", "hdfhdsh", "+234161684", 516225474, 221, 250, 3, 1, 123);
        PhoneCalculate p = new PhoneCalculate();
        p.setMas(p1);
        p.setMas(p2);
        p.setMas(p3);
        p.setMas(p4);
        p.setMas(p5);

        p.biggestSize();
        p.excedsTown(10);
        p.usedInt();
        p.getUser();
    }


}


