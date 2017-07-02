import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rechner extends JFrame implements ActionListener
{
    private JLabel txtFirstNumber, txtSecondNumber, txtAnswer;
    private JTextField inFirstNumber, inSecondNumber;
    private JButton btnAdd, btnSub, btnMul, btnDiv, btnClose;

    public Rechner() {
        super("Rechner");
        this.setSize(450, 300);
        this.setLocation(200, 200);
        this.setLayout(null);

        //Label
        txtFirstNumber = new JLabel("Geben Sie die erste Zahl ein:");
        txtFirstNumber.setSize(200, 20);
        txtFirstNumber.setLocation(10, 10);
        this.add(txtFirstNumber);

        txtSecondNumber = new JLabel("Geben Sie die zweite Zahl ein:");
        txtSecondNumber.setSize(200, 20);
        txtSecondNumber.setLocation(10, 30);
        this.add(txtSecondNumber);

        txtAnswer = new JLabel("Das Ergebnis lautet: ");
        txtAnswer.setSize(400, 20);
        txtAnswer.setLocation(10, 150);
        this.add(txtAnswer);

        //Input
        inFirstNumber = new JTextField();
        inFirstNumber.setSize(150, 20);
        inFirstNumber.setLocation(250, 10);
        this.add(inFirstNumber);

        inSecondNumber = new JTextField();
        inSecondNumber.setSize(150, 20);
        inSecondNumber.setLocation(250, 30);
        this.add(inSecondNumber);


        //Btn
        btnAdd = new JButton("Addiern");
        btnAdd.setSize(120, 20);
        btnAdd.setLocation(10, 60);
        this.add(btnAdd);
        btnAdd.addActionListener(this);

        btnSub = new JButton("Subtrahieren");
        btnSub.setSize(120, 20);
        btnSub.setLocation(10, 85);
        this.add(btnSub);
        btnSub.addActionListener(this);

        btnMul = new JButton("Multiplizieren");
        btnMul.setSize(120, 20);
        btnMul.setLocation(150, 60);
        this.add(btnMul);
        btnMul.addActionListener(this);

        btnDiv = new JButton("Dividieren");
        btnDiv.setSize(120, 20);
        btnDiv.setLocation(150, 85);
        this.add(btnDiv);
        btnDiv.addActionListener(this);

        btnClose = new JButton("Beenden");
        btnClose.setSize(100, 20);
        btnClose.setLocation(300, 200);
        this.add(btnClose);
        btnClose.addActionListener(this);

        sichtbarMachen();
    }

    public void sichtbarMachen() {
        this.setVisible(true); 
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnClose) {
            System.exit(0);
        }

        //Check input
        double a,b = 0d;
        try {
            a = Double.parseDouble(inFirstNumber.getText());
            b = Double.parseDouble(inSecondNumber.getText());
        } catch (NumberFormatException ignored) {
            txtAnswer.setText("Wrong format!");
            return;
        }


        if(e.getSource() == this.btnAdd) {
            txtAnswer.setText("Das Ergebnis lautet:    " + (a+b));
        }
        else if(e.getSource() == this.btnSub) {
            txtAnswer.setText("Das Ergebnis lautet:    " + (a-b));
        }
        else if(e.getSource() == this.btnMul) {
            txtAnswer.setText("Das Ergebnis lautet:    " + (a*b));
        }
        else if(e.getSource() == this.btnDiv) {
            txtAnswer.setText("Das Ergebnis lautet:    " + (a/b));
        }
    } 
}
