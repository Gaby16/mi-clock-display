
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    private int limit;
    private int value;
    
    /**
     * Constructor que recibe por parámetro el límite del display 
     * y que fija el valor actual del display a 0.
     */
    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 0;
    }
    
    /**
     * Método setter que fija el valor actual del display al valor pasado como parámetro.
     * Si el valor es menor que cero no hace nada
     */
    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }
}
