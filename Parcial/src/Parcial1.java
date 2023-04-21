import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Parcial extends JFrame implements ActionListener {
    private JLabel label_Hora;
    private Timer timer;
    private JButton Boton_Activar, Boton_Detener;
    private JSlider slider_Velocidad;
    private int velocidad = 1000;

    public Hora() {
        
        super("Hora");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
