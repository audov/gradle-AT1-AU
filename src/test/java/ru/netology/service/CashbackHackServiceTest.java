package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void ifAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void ifAmountAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void ifAmountEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void ifAmountEqual1000x2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}