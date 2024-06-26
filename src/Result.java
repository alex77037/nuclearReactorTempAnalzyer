import java.util.Objects;

public class Result {
    private double average;
    private int difference;
    private double averageOfTheLastTen;
    private double averageFromEveryHundredth;
    private boolean isAlarm;
    private boolean isWarning;

    public Result() {
    }

    public Result(double average, int difference, double averageOfTheLastTen,
                  double averageFromEveryHundredth, boolean isAlarm, boolean isWarning) {
        this.average = average;
        this.difference = difference;
        this.averageOfTheLastTen = averageOfTheLastTen;
        this.averageFromEveryHundredth = averageFromEveryHundredth;
        this.isAlarm = isAlarm;
        this.isWarning = isWarning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(average, result.average) == 0
                && difference == result.difference
                && Double.compare(averageOfTheLastTen, result.averageOfTheLastTen) == 0
                && Double.compare(averageFromEveryHundredth, result.averageFromEveryHundredth) == 0
                && isAlarm == result.isAlarm && isWarning == result.isWarning;
    }

    @Override
    public int hashCode() {
        return Objects.hash(average, difference, averageOfTheLastTen,
                averageFromEveryHundredth, isAlarm, isWarning);
    }

    @Override
    public String toString() {
        return "Result:\n" +
                "Average temperature of the nuclear reactor over ALL time: "
                + average + " degrees Celsius\n" +
                "Current input temperature differs from the previous by: "
                + difference + " degrees Celsius\n" +
                "Average temperature over the last 10 measurements: "
                + averageOfTheLastTen + " degrees Celsius\n" +
                "Average temperature of every 100th measurement: "
                + averageFromEveryHundredth + " degrees Celsius\n";
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }

    public boolean isWarning() {
        return isWarning;
    }

    public void setWarning(boolean warning) {
        isWarning = warning;
    }

    public double getAverageOfTheLastTen() {
        return averageOfTheLastTen;
    }

    public void setAverageOfTheLastTen(double averageOfTheLastTen) {
        this.averageOfTheLastTen = averageOfTheLastTen;
    }

    public double getAverageFromEveryHundredth() {
        return averageFromEveryHundredth;
    }

    public void setAverageFromEveryHundredth(double averageFromEveryHundredth) {
        this.averageFromEveryHundredth = averageFromEveryHundredth;
    }
}
