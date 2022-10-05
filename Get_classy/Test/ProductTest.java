import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product P1, P2, P3;

    @BeforeEach
    void setUp() {
        P1 = new Product("000001","Apple","Red crisp apple",.50);
        P2 = new Product("000002","T-shirt","White tee shirt",3.00);
        P3 = new Product("000003","Phone case","Iphone case",15.00);
    }

    @Test
    void setIDNum() {
        P1.setIDNum("000001");
        assertEquals("000001", P1.getIDNum());
    }

    @Test
    void setProductName() {
        P2.setProductName("Graphic-tee");
        assertEquals("Graphic-tee", P2.getProductName());
    }

    @Test
    void setProductDesc() {
        P3.setProductDesc("Blue Iphone case");
        assertEquals("Blue Iphone case", P3.getProductDesc());
    }

    @Test
    void setProductCost() {
        P3.setProductCost(10.00);
        assertEquals(10.00, P3.getProductCost());
    }

    @Test
    void testToString() {
        P2.setIDNum("000003");
        assertEquals("000003", P2.getIDNum());
    }
}