package HW12.src.test.java;

import HW8.StringCollection;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionTest {

    public String s [] = new String[10];
    private int count=0;



    @org.junit.jupiter.api.Test
    void testAdd() {
        String ss = "1111";
        Assert.assertEquals(true, StringCollection.add(ss));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        String ss = "11111";
        Assert.assertTrue(StringCollection.delete(ss));
    }

    @org.junit.jupiter.api.Test
    void get() {
        Assert.assertNotNull(StringCollection.get(0));
    }

    @org.junit.jupiter.api.Test
    void contain() {
        String ss = "sssss";
        Assert.assertNotNull( StringCollection.contain(ss));
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        StringCollection str = new StringCollection();
        Assert.assertEquals(true,StringCollection.equals(str));

    }

    @org.junit.jupiter.api.Test
    void clear() {
        assertTrue(StringCollection.clear());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Assertions.assertEquals(0, StringCollection.size());
    }
}