package estudiante;

/**
 *
 * @author Tamayo
 */
public class OrdenamientoObjectos {

    public static void main(String[] args) {
        Estudiante[] arrayEstudiante = new Estudiante[5];
       //Se cargan los Objectos
        arrayEstudiante[0] = new Estudiante ("Juan","Perez","123",5,  5.0);
        arrayEstudiante[1] = new Estudiante ("Camilo","Polania","1234",4,  4.5);
        arrayEstudiante[2] = new Estudiante ("Carlos","Gutierrez","1235",3,  4.8);
        arrayEstudiante[3] = new Estudiante ("Edwin","Perdomo","1236",2,  4.2);
        arrayEstudiante[4] = new Estudiante ("Fernano","Perelta","1237",1, 3.5);
        
        //Ordenar los Objectos por nota y luego Organiza por el puesto
        int temp;
        for(int i=1; i<arrayEstudiante.length; i++){
            for(int j =1 ; j<arrayEstudiante.length; j++){
                if(arrayEstudiante[j].getNota()< arrayEstudiante[j+1].getNota()){
                    temp=arrayEstudiante[j].getPuesto();
                    arrayEstudiante[j].setPuesto(arrayEstudiante[j+1].getPuesto());
                    arrayEstudiante[j+1].setPuesto(temp);
                }
            }
        }
        
    }
}
