import java.util.Scanner;

    public class Minutos {
        public static void main(String[] args) {
            long MINUTES = 9257;
            long DAY = MINUTES/1440;
            double HOUR = DAY / 60;
            double MINUTE = HOUR / 60;
            

            System.out.println("Dias:"+DAY+" Horas:"+HOUR+" Minutos:"+MINUTE);
        }
}
