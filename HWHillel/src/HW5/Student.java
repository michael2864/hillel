package HW5;

//Создать класс, спецификация которого приведена ниже. Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
// В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//        Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.

//        Создать массив объектов.
//        Вывести:
//        a) список студентов заданного факультета; - Факульет
//        b) списки студентов для каждого факультета и курса; - Факультет, Группа
//        c) список студентов, родившихся после заданного года; - Год рождения
//        d) список учебной группы. - Группа

public class Student {
    private int id;
    private String name;
    private String surname;
    private String familyname;
    private int yearOfBirth;
    private String address;
    private String number;
    private String faculty;
    private String course;
    private String group;

    public Student(int id, String name, String surname, String familyname, int yearOfBirth, String address, String number, String faculty, String course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.familyname = familyname;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFamilyname() {
        return familyname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", familyname='" + familyname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Student st1 = new Student (1,"Alex","M","V",2000,"Odessa","1435678574","ICS","3","AT-182");
        Student st2 = new Student (2,"Vano","S","K",2000,"Odessa","6438742389","ICS","3","AT-182");
        Student st3 = new Student (3,"fdjfd","m","h",1999,"Odessa","547548924","ICS","4","AS-182");
        Student st4 = new Student (4,"sdsdj","l","t",1999,"Odessa","3485728438","ICS","4","AS-182");
        Student [] studMas = new Student [3];
        int i = 0;
        studMas[0]=st1;
        studMas[1]=st2;
        studMas[2]=st3;
        studMas[3]=st4;
        //        a) список студентов заданного факультета; - Факульет
        String faculty = "ИКС";   //заданный факультет
        for (i=0;i< studMas.length;i++) {
            if (faculty.equals(studMas[i].faculty)) {
                studMas[i].toString();

            }
        }
        //        b) списки студентов для каждого факультета и курса; - Факультет, Группа
        for (i=0;i< studMas.length;i++) {
            studMas[i].toString();
        }
        //        c) список студентов, родившихся после заданного года; - Год рождения
        int year = 2000;
        for (i=0;i< studMas.length;i++) {
            if (year == studMas[i].yearOfBirth) {
                studMas[i].toString();

            }
        }
        //        d) список учебной группы. - Группа
        String group = "AT-182";
        for (i=0;i< studMas.length;i++) {
            if (group.equals(studMas[i].group)) {
                studMas[i].getName();
                studMas[i].getSurname();
            }
        }
    }
}