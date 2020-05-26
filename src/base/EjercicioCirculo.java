
package base;
import circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EjercicioCirculo {
    Scanner LeerTeclado = new Scanner(System.in);
    List<Circulo>circulos = new ArrayList<>();
    
    public static void main(String[] args) {
      EjercicioCirculo programa = new EjercicioCirculo();
      programa.inicio();
      
    }
    
    public double generarRandom(){
        return Math.random();
        
    }
    
    public void inicio(){
        int guardarRespuesta = 0;
        
        GenerarCirculos();
        guardarRespuesta = preguntaUsuario();
        
        
        if ( guardarRespuesta == 1)
            OrdenarAscendente();
        else 
            OrdenarDescendente();
        ImpresionLista();
    }
    
    public int preguntaUsuario(){
        int guardarNumerito = 0;
        boolean respuestaIncorrecta = false;
        
        System.out.println("Introduzca 1 para ordenar la lista de forma ascendente, pulse 2 para ordenarla de forma descendente");
        
        do{
          if(LeerTeclado.hasNextInt()){
             guardarNumerito = LeerTeclado.nextInt();
             if(guardarNumerito > 2 || guardarNumerito < 1){
                 System.out.println("No esta introduciendo un valor valido");
                 respuestaIncorrecta = true;
             }
             else{
                 respuestaIncorrecta = false;
             }
          } 
          else {
              System.out.println("No esta introduciendo un valor valido");
              LeerTeclado.next();
              respuestaIncorrecta = true;
          }
        }while (respuestaIncorrecta);
            
        return guardarNumerito;
    }
    
    public void ImpresionLista(){
        for (Circulo circulo : circulos) {
            System.out.println(circulo);
        }
    }
    
    public void OrdenarAscendente(){
        Collections.sort(circulos);
    }
    public void OrdenarDescendente(){
      Collections.sort(circulos, Collections.reverseOrder());
    }
    
    public void GenerarCirculos(){
        double guardarRadio = generarRandom();
        
        
        /*        for (int i = 0; i < 10; i++) {
        
        if (guardarRadio >= 0.01)
        circulos.add(new Circulo(guardarRadio));
        guardarRadio = generarRandom();
        }*/
        
        
        do {
        circulos.add(new Circulo(guardarRadio));
        guardarRadio = generarRandom();
        }while(guardarRadio > 0.01);
           
    }
}
