import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;

public class ListTests {
    @Test 
    public void testFilter() {
        class MySC implements StringChecker {
            @Override
            public boolean checkString(String s) {
                return !s.equals("abc");
            }
        }

        ArrayList<String> myList = new ArrayList<>();
        myList.add("abc");
        myList.add("THIS");
        myList.add("abc");
        myList.add("should");
        myList.add("print");
        myList.add("abc");

        assertEquals("THIS",ListExamples.filter(myList, new MySC()).get(0));
    }

    @Test
    public void testMerge() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("e");
        list2.add("f");
        list2.add("g");

        assertEquals("b",ListExamples.merge(list1, list2).get(1));
    }
}
