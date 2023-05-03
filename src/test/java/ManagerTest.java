import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void testSortTickets() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Ticket ticket1 = new Ticket(1, 600, "DME", "EGO", 100);
        Ticket ticket2 = new Ticket(2, 400, "DME", "EGO", 110);
        Ticket ticket3 = new Ticket(3, 200, "DME", " FRU", 150);
        Ticket ticket4 = new Ticket(4, 300, "FRU", "DME", 130);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);


        Ticket[] expected = {ticket2, ticket1};
        Ticket[] actual = manager.findAll("DME", "EGO");
        Assertions.assertArrayEquals(expected, actual);
    }
}

