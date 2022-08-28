public class Pregunta7 {
    public static void main (String[] args){
        String[] names = {"Erika","Maria","Fernanda","Alison"};
        int[] hours = {10,20,50,40};
        double[] salaries = getSalaries(hours);

        System.out.println("Promedio de sueldos: " + getSalariesAverage(salaries));
        System.out.println("Enfermera con mayor sueldo: " + names[getMaxMinSalary(salaries, true)]);
        System.out.println("Enfermera con menor sueldo: " + names[getMaxMinSalary(salaries, false)]);
    }

    public static double[] getSalaries(int[] hours){
        double[] salaries = new double[hours.length];
        double COST_PER_HOUR = 50;

        for(int i=0; i < hours.length; i++ ){
            salaries[i] = hours[i] * COST_PER_HOUR;
        }
        return salaries;
    }

    public static double getSalariesAverage(double[] salaries){
        double sum = 0;
        for(double salary: salaries){
            sum += salary;
        }
        return (sum / salaries.length);
    }

    public static int getMaxMinSalary(double[] salaries, boolean isMinSalary){
        double minMaxSales = salaries[0];
        int index = 0;

        for (int i = 0; i < salaries.length; i++){
            if(isMinSalary){
                if(minMaxSales < salaries[i]) {
                    minMaxSales = salaries[i];
                    index = i;
                }
            }else{
                if(minMaxSales > salaries[i]) {
                    minMaxSales = salaries[i];
                    index = i;
                }
            }
        }
        return index;
    }
}
