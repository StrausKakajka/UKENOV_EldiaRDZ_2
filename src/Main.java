public class Main {
    public static void main(String[] args) {
        System.out.println(redHealth(22, -5));
        System.out.println(redHealth(78, 17));
        System.out.println(redHealth(18, 22));
        System.out.println(redHealth(22, -20));
        System.out.println(redHealth(29, 30));
        System.out.println(redHealth(generateRandomAge(), 10));
    }

    public static String redHealth(int yearsOld, int weather) {
        if ((yearsOld > 20) && (yearsOld < 45) && (weather > -20) && (weather < 30)) {
            return "Можно ийти гулять";
        } else if ((yearsOld < 20) && (weather > 0) && (weather < 28)) {
            return "Можно ийти гулять";
        } else if ((yearsOld > 45) && (weather > -10) && (weather < 25)) {
            return "Можно ийти гулять";
        } else {
            return "Остовайтесь дома";
        }
    }

    public static int generateRandomAge() {
        double b = Math.random() * (75 - 0) + 0;
        return (int) b;
    }
}