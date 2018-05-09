package fr.lcdlv.promo5;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static fr.lcdlv.promo5.SeminarDays.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculateBookingPriceTest {

    private CheckIn nominalCheckIn = new CheckIn(THURSDAY);
    private CheckOut nominalCheckOut = new CheckOut(SUNDAY, 15);
    private CheckIn lateCheckIn = new CheckIn(FRIDAY);
    private CheckOut earlyCheckOut = new CheckOut(SATURDAY, 11);

    @Test
    @Parameters(
        {
            "SINGLE, 610",
            "TWIN, 510"
        })
    public void should_return_full_price_when_booking_with_all_meals(Accommodation accommodation, int expectedPrice) {

        final Booking bookingWithAllMeals = new Booking(accommodation, nominalCheckIn, nominalCheckOut);
        final int price = bookingWithAllMeals.getPrice();
        assertThat(price).isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void should_return_decreased_when_first_meal_not_taken(Accommodation accommodation, int expectedPrice) {
        final Booking bookingWithoutFirstMeal = new Booking(accommodation, lateCheckIn, nominalCheckOut);
        final int price = bookingWithoutFirstMeal.getPrice();
        assertThat(price).isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 570",
            "TWIN, 470"
        })
    public void should_return_decreased_when_last_meal_not_taken(Accommodation accommodation, int expectedPrice) {
        final Booking bookingWithoutLastMeal = new Booking(accommodation, nominalCheckIn, earlyCheckOut);
        final int price = bookingWithoutLastMeal.getPrice();
        assertThat(price)
            .isEqualTo(expectedPrice);
    }

    @Test
    @Parameters(
        {
            "SINGLE, 530",
            "TWIN, 430"
        })
    public void should_return_decreased_when_both_first_and_last_meals_not_taken(Accommodation accommodation, int expectedPrice) {
        final Booking bookingWithoutBothFirstAndLastMeal = new Booking(accommodation, lateCheckIn, earlyCheckOut);
        final int price = bookingWithoutBothFirstAndLastMeal.getPrice();
        assertThat(price).isEqualTo(expectedPrice);
    }
    
}
