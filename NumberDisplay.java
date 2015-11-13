
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
    
    /**
     * Método que devuelve el valor actual del display en forma de cadena de 2 caracteres
     * Si el valor es menor que diez, pasara cero
     */
    public String getDisplayValue()
    {
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }
    
    /**
     * Return the current value.
     */
    public int getValue()
    {
        return value;
    }
}
