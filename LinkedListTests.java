import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests {
    @Test
    public void testprepend()
    {
        LinkedList ll = new LinkedList();
        ll.prepend(1);
        ll.prepend(2);
        ll.prepend(3);
        assertEquals(3, ll.first());
    }

    @Test
    public void testappend()
    {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        assertEquals(1, ll.first());
    }

    @Test
    public void testfirst()
    {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        assertEquals(1, ll.first());
    }

    @Test
    public void testlast()
    {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        assertEquals(3, ll.last());
    }

    @Test
    public void testfirstEmpty()
    {
        LinkedList ll = new LinkedList();
        try {
            ll.first();
            fail("Should have thrown an exception");
        } catch(NoSuchElementException e) {
            // OK
        }
    }
}
