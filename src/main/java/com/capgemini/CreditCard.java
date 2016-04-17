package com.capgemini;

import java.time.*;

/**
 * Created with IntelliJ IDEA.
 * User: skumbera
 * Date: 17.04.16
 * Time: 20:06
 * To change this template use File | Settings | File Templates.
 */
public class CreditCard {
    private Instant expiryDate;

    public CreditCard() {

        LocalDate now = LocalDate.now();
        LocalDate oneWeekLater = now.plusWeeks(1);

        expiryDate = oneWeekLater.atStartOfDay().toInstant(ZoneOffset.UTC);

    }

    public Instant getExpiryDate() {
        return expiryDate;
    }
}
