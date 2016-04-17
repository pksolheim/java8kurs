package com.capgemini;

import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 17.04.16
 * Time: 20:22
 * To change this template use File | Settings | File Templates.
 */
public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void init() {
        creditCard = new CreditCard();
    }

    @Test
    public void testCreditCardExpiry() {
        Instant now = LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC);
        assertThat(creditCard.getExpiryDate().isAfter(now), is(true));

        Instant twoWeeksFromNow = LocalDate.now().plusWeeks(2).atStartOfDay().toInstant(ZoneOffset.UTC);
        assertThat(creditCard.getExpiryDate().isBefore(twoWeeksFromNow), is(true));

        Instant oneWeekFromNow = LocalDate.now().plusWeeks(1).atStartOfDay().toInstant(ZoneOffset.UTC);
        assertThat(creditCard.getExpiryDate().equals(oneWeekFromNow), is(true));
    }
}
