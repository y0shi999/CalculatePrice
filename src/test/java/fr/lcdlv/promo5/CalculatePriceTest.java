package fr.lcdlv.promo5;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static fr.lcdlv.promo5.Days.FRIDAY;
import static fr.lcdlv.promo5.Days.SUNDAY;
import static fr.lcdlv.promo5.Days.THURSDAY;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatePriceTest {

    private CheckIn nominalCheckIn = new CheckIn(THURSDAY);
    private CheckOut nominalCheckOut = new CheckOut(SUNDAY, 15);
    private CheckIn lateCheckIn = new CheckIn(FRIDAY);
    private CheckOut earlyCheckOut = new CheckOut(SUNDAY, 11);

    @Test
    @Parameters(
        {
            "SINGLE, 610",
            "TWIN, 510"
        })
    public void should_return_full_price_when_booking_with_all_meals(Accommodation accommodation, int expectedPrice) {
        assertThat(new Booking(accommodation, nominalCheckIn, nominalCheckOut).getPrice())
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void should_return_decreased_when_first_meal_not_taken(Accommodation accommodation, int expectedPrice) {
        assertThat(new Booking(accommodation, lateCheckIn, nominalCheckOut).getPrice())
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void should_return_decreased_when_last_meal_not_taken(Accommodation accommodation, int expectedPrice) {
        assertThat(new Booking(accommodation, nominalCheckIn, earlyCheckOut).getPrice())
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 530"
        })
    public void should_return_decreased_when_both_first_and_last_meals_not_taken(Accommodation accommodation, int expectedPrice) {
        assertThat(new Booking(accommodation, lateCheckIn, earlyCheckOut).getPrice()).isEqualTo(expectedPrice);
    }
}
