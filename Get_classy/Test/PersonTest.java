import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person P1, P2, P3;

    @BeforeEach
    void setUp()
    {
        P1 = new Person("000001","Mckelvin","Frimpong","Mr.", 2003);
        P2 = new Person("000002","Mickey","Frimpong","Mr.",2002);
        P3 = new Person("000003","Kwasi","Frimpong","Mr.",2001);
    }

    @Test
    void setIDnum()
    {
        P1.setIDnum("000001");
        assertEquals("000001", P1.getIDnum());
    }

    @Test
    void setFirstName()
    {
        P1.setFirstName("Mckelvin");
        assertEquals("Mckelvin", P1.getFirstName());
    }

    @Test
    void setLastName()
    {
        P1.setLastName("Ofosu");
        assertEquals("Ofosu", P1.getLastName());
    }

    @Test
    void setTitle() {
        P2.setTitle("Mr.");
        assertEquals("Mr.", P2.getTitle());
    }

    @Test
    void setYOB() {
        P3.setYOB(2003);
        assertEquals(2003,P3.getYOB());
    }

    @Test
    void fullName() {
        Person P2 = new Person();
        P2.setFirstName("Mckelvin");
        P2.setLastName("Frimpong");
        assertEquals (P2.fullName(), "Mckelvin Frimpong");
    }

    @Test
    void formalName() {
        Person P3 = new Person();
        P3.setTitle("Mr.");
        P3.setFirstName("Mckelvin");
        P3.setLastName("Frimpong");
        assertEquals(P3.formalName(), "Mr. Mckelvin Frimpong");
    }

    @Test
    void testToString()
    {
        P2.setFirstName("Nick");
        assertEquals("Nick", P2.getFirstName());
    }

    @Test
    void getAge() {
        P2.setYOB(2000);
        assertEquals(22, P2.getAge());
    }

    @Test
    void getAgeFromYear()
    {
        P1.getAgeFromYear(2003);
        assertEquals(9, P2.getAgeFromYear(2011));
    }

    @Test
    void toCSV()
    {
        assertEquals("000001, Mckelvin, Frimpong, Mr., 2003", P1.toCSV());
    }
}
