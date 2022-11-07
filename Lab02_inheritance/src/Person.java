import java.util.Calendar;


public class Person
{
private String IDnum;
private String firstName;
private String lastName;
private String title;
private int YOB;

    public Person(String IDnum, String firstName, String lastName, String title, int YOB) {
        this.IDnum = IDnum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public Person() {}
public String fullName()
    {
        return firstName + " " + lastName;
    }

public String formalName()
    {
        return title + " " + fullName();
    }

public int getAge ()
    {
        int age = Calendar.getInstance().get(Calendar.YEAR)- this.YOB;
        return age;
    }

public int getAgeFromYear(int year)
    {
        int age = year - this.YOB;
        return age;
    }

    public String toCSV()
    {
        return this.IDnum + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.YOB;
    }

    public String getIDnum() {
        return IDnum;
    }

    public void setIDnum(String IDnum) {
        this.IDnum = IDnum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDnum='" + IDnum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

   }