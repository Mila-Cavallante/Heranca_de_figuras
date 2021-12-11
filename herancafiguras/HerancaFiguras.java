//Aula de 08/09 
//Exercício 4
package herancafiguras;

/**
 * @author camil
 */
public class HerancaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.draw(); // recebe por herança o metodo draw de figura
        
        Circulo circ= new Circulo();
        circ.draw();
        circ.showRaio(); //Pertencente somente a classe Círculo
        
        Triangulo tri =new Triangulo();
        tri.draw();
        
        passaParametroPorHeranca(quadrado);
        //passaParametroPorHeranca(circ);
        //passaParametroPorHeranca(tri);

    }
    public static void passaParametroPorHeranca(Figura fig) 
    {
     fig.drawShape();
    }
}
