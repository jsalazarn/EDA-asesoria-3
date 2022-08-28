public class Pregunta6 {
    public static void main (String[] args){
        double[] salesPerDay = {100,230,500,420,190,900,100};
        int day = getDayWithMaxSale(salesPerDay);
        System.out.println("El día con más ventas es el día: " + getDayName(day));
    }

    public static int getDayWithMaxSale(double[] salesPerDay){
        int day = 0;
        double maxSale = 0;
        for(int i=0; i < salesPerDay.length; i++ ){
            if(salesPerDay[i] > maxSale) {
                maxSale = salesPerDay[i];
                day = i;
            }
        }
        return day;
    }

    public static String getDayName(int dayNumber){
        String[] days = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
        return days[dayNumber];
    }
}
