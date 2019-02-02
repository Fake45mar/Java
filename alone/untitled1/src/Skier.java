public class Skier {
    private int firstDay = 10;
    private double distance;
    private double weekDistance;
    private double amountDistanceOfDays;

    public Skier(int n) {
        distance = amountDistance();
        System.out.println("The distance of second, third and tenth is - " + distance);
        weekDistance = total();
        System.out.println("The total distance in seven days is  - " + weekDistance);
        amountDistanceOfDays = distanceOfDays(n);
        System.out.println("Distance of the days" + n + "equal - " + amountDistanceOfDays);
    }

    private double amountDistance() {
        return firstDay + (firstDay * 0.2) + firstDay + (firstDay * 0.3) + firstDay + firstDay;
    }

    private double total() {
        return firstDay + (firstDay * 0.1) + firstDay + (firstDay * 0.2) + firstDay + (firstDay * 0.3) + firstDay + (firstDay * 0.4) + firstDay + (firstDay * 0.5) + firstDay + (firstDay * 0.6) + firstDay + (firstDay * 0.7);
    }
    private double distanceOfDays(int number){
        double result = 0;
        for (int i = 0; i <= number; i++) {
            result += firstDay + (firstDay * i/10);
        }
        return  result;
    }
}
