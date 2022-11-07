import static org.junit.Assert.assertEquals;

class PersonTest {

    Person p1, p2, p3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new Person("00000A", "John", "Test1", "Mr.", 1999);
        p2 = new Person("00000B", "Jane", "Test2", "Miss.", 1990);
        p3 = new Person("00000C", "lionel", "Test3", "Mr.", 1991);
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        p1.setFirstName("John");
        p1.setLastName("Tester1");
        assertEquals("John Tester1", p1.fullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() {
    p1.setFirstName("Joe");
    p1.setLastName("Tester2");
    assertEquals("Mr. Joe Tester2", p1.formalName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        p2.setYOB(1980);
        assertEquals(42, p2.getAge());
    }

    @org.junit.jupiter.api.Test
    void getAgeFromYear() {
        p1.setYOB(1990);
        assertEquals(20, p1.getAgeFromYear(2010));
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
        assertEquals("00000A, John, Test1, Mr., 1999", p1.toCSV());
    }

    @org.junit.jupiter.api.Test
    void setIDnum() {
        p1.setIDnum("00000B");
        assertEquals("00000B", p1.getIDnum());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("John");
        assertEquals("John", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p2.setLastName("Tester2");
        assertEquals("Tester2", p2.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p3.setTitle("Lord");
        assertEquals("Lord", p3.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p3.setYOB(1970);
        assertEquals(1970, p3.getYOB());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        p1.setFirstName("Jon");
        assertEquals("Jon", p1.getFirstName());
    }
}