public class Pregunta2 {

    public static void main (String[] args){
        int[] firstArray = {1,4,5,7};
        int[] secondArray = {1,4,5,7};
        boolean result = compareArrays(firstArray, secondArray);
        System.out.println("Son iguales: " + result);
    }

    public static boolean compareArrays (int[] firstArray, int[] secondArray){
        if(firstArray.length != secondArray.length) return false;
        for(int i=0; i < firstArray.length; i++){
            if(firstArray[i] != secondArray[i]) return false;
        }
        return true;
    }
}
