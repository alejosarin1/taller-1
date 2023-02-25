import javax.swing.JOptionPane;

public class Ejer2 {
    public static void main(String[] args) {
        int i,n,proceso;
        proceso=1;
        i=1;
        n= Integer.parseInt(JOptionPane.showInputDialog("digite n : "));
        
        while(i<=n){
            proceso=proceso*i;
            i++;



         }
         if(n>=0){
            JOptionPane.showMessageDialog(null,"El factorial de "+n+" es : "+proceso, "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
         }
         else{
            JOptionPane.showMessageDialog(null,"Digite un numero positivo", "RESULTADOS", JOptionPane.ERROR_MESSAGE);
         }
        

    }
    
}
