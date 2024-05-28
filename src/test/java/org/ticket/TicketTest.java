package org.ticket;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void createTicket(){
        Ticket ticket= new Ticket(10, 20);
        assertEquals(10, ticket.getDistance());
        assertEquals(20, ticket.getAge());
        assertEquals(2.1, ticket.getPrice());

        Ticket ticket2= new Ticket(10, 10);
        assertEquals(1.68, ticket2.getPrice(), 0.01);

        Ticket ticket3= new Ticket(10, 70);
        assertEquals(1.26, ticket3.getPrice(), 0.01);

        assertThrows(IllegalArgumentException.class, ()-> new Ticket(0, 20));
        assertThrows(IllegalArgumentException.class, ()-> new Ticket(-1, 20));
        assertThrows(IllegalArgumentException.class, ()-> new Ticket(10, 160));
        assertThrows(IllegalArgumentException.class, ()-> new Ticket(10, -10));
    }
}