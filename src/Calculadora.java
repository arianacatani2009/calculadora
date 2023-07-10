import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends javax.swing.JFrame {
    private JTextField txt;
    JPanel panel;
    private JButton boton_7;
    private JButton boton_5;
    private JButton boton_9;
    private JButton boton_igual;
    private JButton boton_6;
    private JButton boton_0;
    private JButton boton_8;
    private JButton boton_2;
    private JButton boton_4;
    private JButton boton_1;
    private JButton boton_suma;
    private JButton boton_resta;
    private JButton boton_multiplicacion;
    private JButton boton_divicion;
    private JButton boton_sin;
    private JButton boton_cos;
    private JButton boton_tan;
    private JButton boton_raiz;
    private JButton boton_cot;
    private JButton boton_secante;
    private JButton boton_cosc;
    private JButton boton_cuadrado;
    private JButton boton_potencia;
    private JButton boton_3;
    private JButton boton_punto;
    private JButton boton_borrar;
    private JButton boton_borrato;
    Metodos metodox = new Metodos();

    public Calculadora() {

        this.setLocationRelativeTo(null);
        boton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("1"));
            }
        });

        boton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("2"));
            }
        });
        boton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("3"));
            }
        });

        boton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("4"));
            }
        });

        boton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("5"));
            }
        });
        boton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("6"));
            }
        });
        boton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("7"));
            }
        });
        boton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("8"));
            }
        });
        boton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("9"));
            }
        });
        boton_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("0"));
            }
        });
        boton_punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(metodox.concatenamiento("."));
            }
        });

        boton_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.suma(txt.getText());
            }
        });
        boton_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.resta(txt.getText());
            }
        });
        boton_multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.multiplicacion(txt.getText());
            }
        });
        boton_divicion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.division(txt.getText());
            }
        });
        boton_igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("" + metodox.resultado(txt.getText()));
            }
        });

        boton_sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.seno(txt.getText());
            }
        });
        boton_cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.coseno(txt.getText());
            }
        });
        boton_tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.tangente(txt.getText());
            }
        });
        boton_raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.raiz(txt.getText());
            }
        });
        boton_cot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.cotangente(txt.getText());
            }
        });
        boton_secante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.secante(txt.getText());
            }
        });
        boton_cosc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.cosecante(txt.getText());
            }
        });
        boton_cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.alcuadrado(txt.getText());
            }
        });
        boton_potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metodox.alapotencia(txt.getText());
            }
        });

        boton_borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("0");
            }
        });
        boton_borrato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(" ");
            }
        });

    }
}
