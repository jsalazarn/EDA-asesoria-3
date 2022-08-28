public class Pregunta3 {

    public static void main (String[] args){
        String[] alumnos = {"Jimmy","Robert","Juan","Pepito","Fiorella"};

        String alumno = findAlumnoByName(alumnos, "Juan");

        if(alumno.equals("")){
            System.out.println("Alumno no encontrado");
        }else{
            System.out.println("Alumno encontrado: " + alumno);
        }
    }

    public static String findAlumnoByName (String[] alumnos, String name){
        for(String alumno: alumnos){
            if(alumno.equalsIgnoreCase(name)) return name;
        }
        return "";
    }
}
