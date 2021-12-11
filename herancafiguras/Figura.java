
package herancafiguras;

/**
 *
 * @author camil
 */
public abstract class Figura { //é uma classe abstrata, não é instanciavel.
    public void draw(){
        System.out.println("Desenhando...");
    }
    
    public abstract void drawShape(); 
}
