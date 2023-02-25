import javax.swing.JOptionPane;

public class Ejer1 {
    public static void main(String[] args){
        double c1,c2,c3,total;
        int i;
        i=0;
        
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital necesario para el negocio : "));
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital de pedro : "));
        c2= Integer.parseInt(JOptionPane.showInputDialog("Digite el capital de juan: "));
        total=c1+c2;

        while(total<c3 ){
            c1=((c1*3)/100)+c1;
            c2=((c2*4)/100)+c2;
            i=i+1;
            total=c1+c2;
        }
        
        JOptionPane.showMessageDialog(null,"Tendran la plata para el negocio en "+ i +" meses", "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}
