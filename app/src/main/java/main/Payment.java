package main;

public class Payment {
    public static int weekdayCharge = 200;
    public static int weekendCharge = 250;
    public int money;
    public double totalCharge;

    public Payment(Discount discount, String dateTime) {

        String week = InputNormalization.extractWeek(dateTime);
        System.out.println(week);

        switch (week) {
            case "�g�@":
            case "�g�G":
            case "�g�T":
            case "�g�|":
            case "�g��":
                money = weekdayCharge;
                break;
            case "�g��":
            case "�g��":
                money = weekendCharge;
                break;
        }

        totalCharge = money * discount.getDiscount();
    }

    public void print() {
        System.out.println("Please pay $" + (int) totalCharge + ".");
    }

    public double getTotalCharge(){
        return totalCharge;
    }
}
