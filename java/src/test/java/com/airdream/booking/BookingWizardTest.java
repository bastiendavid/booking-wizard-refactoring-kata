package com.airdream.booking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BookingWizardTest {

    @Test
    void test() {
        BookingWizard wizard = new BookingWizard();
        assertNotNull(wizard);
    }
}