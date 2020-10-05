import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Sławek";
        String lastName = "Oleksy";
        final String pesel = "12312312";
        int age = 25;
        double height = 195.5;

        System.out.print("Cześć ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.println(lastName);

        System.out.println("Poniżej jest kilka infomracji o tobie:");
        System.out.print("Twój PESEL to:");
        System.out.println(pesel);
        System.out.print("Masz ");
        System.out.print(age);
        System.out.println(" lat");
        System.out.print("Twój  wzrost to: " + height + " cm.");

    }
}
