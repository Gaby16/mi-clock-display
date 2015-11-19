
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayDoceString;
    // simulates the actual display
    
    /** Constructor que crea un objeto de ClockDisplay 
     * ajustado alas 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(59);
        updateDisplay12h();

    }
    
    /**
     * Constructor que crea un objeto ClockDisplay ajustando la hora
     * con los parametros introducidos.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
    
    /**
     * Ajusta el tiempo en la pantalla con los parametros que se introduzcan.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay12h();
    }
    
    /**
     * Devuelve el tiempo actual en pantalla en formato HH:MM. 
     */
    public String getTime()
    {
        return displayDoceString;
    }
    
    /**
     * Metodo que hace el reloj avance un minuto adelante cada vez que 
     * se invoque.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay12h();
    }
    
    /**
     * Actualiza la hora en version 12h
     */
    private void updateDisplay12h()
    {
         
        if(hours.getValue() < 12)
         {
             displayDoceString = hours.getDisplayValue() + ":" +
            minutes.getDisplayValue() + " am";
         }
                 
       else if(hours.getValue() > 12 && hours.getValue() <24)
          {
            displayDoceString = Integer.toString(hours.getValue() - 12) + ":" + 
            minutes.getDisplayValue() + " pm";
          }
       else if(hours.getValue() == 0) 
         {
            hours.setValue(12); 
            displayDoceString = hours.getDisplayValue() + ":"+
            minutes.getDisplayValue() + " am";    
                       
         }  
              
       else
        {
         hours.setValue(12);
         displayDoceString = hours.getDisplayValue() + ":" + 
                    minutes.getDisplayValue() + " pm";
       }
   }
    
   
}
