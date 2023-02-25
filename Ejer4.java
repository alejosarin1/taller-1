import javax.swing.JOptionPane;
public class Ejer4 {
    public static void main(String[] args) {
        int n,a,cifra,inverso=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        a=n;
        while (a!=0){
            cifra = a % 10;
            inverso = inverso * 10 + cifra;
            a = a / 10;}
            
            if(n == inverso){
                JOptionPane.showMessageDialog(null,"El numero es capicua", "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"El numero no es capicua", "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
            }
    }
    
}
