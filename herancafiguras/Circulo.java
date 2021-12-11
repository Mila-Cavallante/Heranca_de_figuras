
package herancafiguras;

/**
 *
 * @author camil
 */
public class Circulo extends Figura{ // O extends faz a herança de Figura

    @Override//Polimorfismo
    public void drawShape() {
        System.out.println("Desenhando círculo");
    }
    
    public void showRaio(){
        System.out.println("O raio é de 20cm."); // metódo pertence somente a classe Círculo.
    }

}
