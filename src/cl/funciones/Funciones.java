package cl.funciones;

import javax.swing.JOptionPane;

public class Funciones {
    
    private final String TITULO_JOPTION = "Convertidor de Temp-Moneda";
   
    public String InputBoxDialog(String message, int icon)
    {
        return JOptionPane.showInputDialog(null, message, TITULO_JOPTION, icon);
    }
	
    public void MessageBox(String message, int icon) 
    {
        JOptionPane.showMessageDialog(null, message, TITULO_JOPTION, icon);
    }    
    
    public String ComboBoxDialog(String message, int button, String[] data) 
    {
        return (String) JOptionPane.showInputDialog(null, 
            message,                
            TITULO_JOPTION,         
            button,                 
            null,                   
            data,                   
            data[0]                 
        );  
    }
    
    public boolean fieldEmpty(String... campos) 
    {
        for (String campo : campos) {
            if (campo.equals("")) {
                return true;
            }
        }        
        return false;
    }
    
}
