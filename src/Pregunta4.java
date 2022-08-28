public class Pregunta4 {
    public static void main (String[] args){
        String[] listaAlmacenes = {"Almacen1","Almacen2","Almacen3","Almacen4","Almacen5"};
        double[] listaVentas = {5000,2500,6800,6000,1500};

        double salesAverage = getSalesAverage(listaVentas);
        System.out.println("Promedio de ventas: " + salesAverage);
        salesMaxThanAverage(listaVentas, listaAlmacenes, salesAverage);
    }

    public static double getSalesAverage (double[] sales){
        double sum = 0;
        for(double sale: sales){
            sum += sale;
        }
        return (sum / sales.length);
    }

    public static void salesMaxThanAverage (double[] sales, String[] stores, double average){
        System.out.println("Almacenes con mayor venta:");
        for(int i=0; i < sales.length; i++){
            if(sales[i] > average) System.out.println(stores[i]);
        }
    }
}
