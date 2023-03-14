package com.acme.banking.dbo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class SavingAccountTest {

    @Test
    void shouldThrowWhenIdIncorrect() {
        Client client = new Client(12, "AAA");

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(-11, client, 12.0));
    }

    @Test
    void shouldThrowWhenClientIsNull() {
        Client client = null;

        assertThrows(NullPointerException.class, () -> new SavingAccount(12, client, 12.0));
    }

    @Test
    void shouldThrowWhenAmountIncorrect() {
        Client client = new Client(12, "AAA");

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(11, client, -12.0));
    }

    @Test
    void shouldGetAmountWhenConstructAccount() {
        Client client = new Client(12, "AAA");
        SavingAccount account = new SavingAccount(11, client, 12.9);

        assumeTrue(account != null);

        assertEquals(12.9, account.getAmount());
    }

    @Test
    void shouldGetIdWhenConstructAccount() {
        Client client = new Client(12, "AAA");
        SavingAccount account = new SavingAccount(11, client, 12.9);

        assumeTrue(account != null);

        assertEquals(11, account.getId());
    }

    @Test
    void shouldGetClientWhenConstructAccount() {
        Client client = new Client(12, "AAA");
        SavingAccount account = new SavingAccount(11, client, 12.9);

        assumeTrue(account != null);

        assertNotNull(account.getClient());
        assertEquals(client, account.getClient());
    }
}