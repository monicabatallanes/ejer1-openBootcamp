public class Main {

    public static void main(String[] args) {

        suma(5, 9, 6);
       
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    } 

       
    public static void suma(int a, int b, int c){
        int resultado ; 
        resultado = a + b + c ;

        System.out.println(resultado);
    }

}


class Coche{
    public int puertas = 0;
        public void SumarPuertas(){
           this.puertas ++;
        }
}

