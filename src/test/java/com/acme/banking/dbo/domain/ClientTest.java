package com.acme.banking.dbo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class ClientTest {

    @Test
    void shouldThrowWhenIdIncorrect() {
        assertThrows(IllegalArgumentException.class, () -> new Client(-11, "BBB"));
    }

    @Test
    void shouldThrowWhenNameIncorrect() {
        assertThrows(IllegalArgumentException.class, () -> new Client(12, null));
        assertThrows(IllegalArgumentException.class, () -> new Client(12, ""));
    }

    @Test
    void shouldGetIdWhenConstructClient() {
        Client client = new Client(12, "AAA");

        assumeTrue(client != null);

        assertEquals(12, client.getId());
    }

    @Test
    void shouldGetNameWhenConstructClient() {
        Client client = new Client(12, "BBB");

        assumeTrue(client != null);

        assertEquals("BBB", client.getName());
    }
}