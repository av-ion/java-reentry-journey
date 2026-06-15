public class TemperatureAdvisor {
    public static void main(String[] args) {
        int temperature = 18;

        String advice = getWeatherAdvice(temperature);

        System.out.println("Advice: " + advice);
    }

    public static String getWeatherAdvice(int temperature) {
        if (temperature >= 35) return "Stay hydrated";
        if (temperature >= 25) return "Pleasant weather";
        if (temperature >= 15) return "Carry a light jacket";

        return "Wear warm clothes";
    }
}
