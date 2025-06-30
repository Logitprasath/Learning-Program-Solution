public class FinancialForecast {

    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000;   // Initial investment amount
        double growthRate = 0.08;           // Annual growth rate (8%)
        int totalYears = 5;                 // Number of years

        double result = calculateFutureValue(initialInvestment, growthRate, totalYears);
        System.out.printf("Future Value after %d years: Rs.%.2f\n", totalYears, result);
    }
}
