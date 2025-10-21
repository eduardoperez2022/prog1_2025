package ejercicio_501;

import java.util.ArrayList;

public class proceso {
    
    private ArrayList<alumno> ordenados = new ArrayList();
    
    public void trabajo() {
        
        System.out.println("--- trabajo entra");
        
        // leer archivo
        archivo arch = new archivo();
        arch.lectura();
        
        ArrayList<String> lineas_proceso = arch.getLineas();

        ArrayList<alumno> alumnos = new ArrayList<>();
        
        for(String unalinea : lineas_proceso) {
            String[] partes = unalinea.split(",");
            alumno alx = new alumno(partes[0], partes[2], partes[1], partes[3], partes[4]);
            // System.out.println(alx.toString());
            alumnos.add(alx);
        }
        
        
        // procesarlo
        alumnos = this.ordenar(alumnos);
        
        // mostrar el resultado
        setOrdenados(alumnos);
        
    }
    
    private ArrayList<alumno> ordenar(ArrayList<alumno> alumnos) {
        
        ArrayList<alumno> newarray = alumnos;
        
        //Ordenamiento
        for (int i = 0; i < newarray.size() - 1; i++) {
            for (int j = 0; j < (newarray.size() - 1 - i); j++) {
                // if (vec[j].getEdad() > vec[j + 1].getEdad()) {
                if (newarray.get(j).getDni().compareTo(newarray.get(j + 1).getDni()) > 0) {
                    alumno aux = newarray.get(j);

                    // vec[j] = vec[j + 1];
                    newarray.set(j, newarray.get(j + 1));

                    // vec[j + 1] = aux;
                    newarray.set(j + 1, aux);
                }
            }
        }

        return newarray;
    
    }

    public ArrayList<alumno> getOrdenados() {
        return ordenados;
    }

    public void setOrdenados(ArrayList<alumno> ordenados) {
        this.ordenados = ordenados;
    }
    

}
