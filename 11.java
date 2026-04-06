import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test extends JFrame implements ActionListener{
    JTextField t1, t2;
    JButton b;
    JLabel l;

    Test()
    {
        t1 = new JTextField();
        t2 = new JTextField();
        b = new JButton("Add");
        l = new JLabel();
        t1.setBounds(50,30,200,20);
        t2.setBounds(50,130,150,20);
        b.setBounds(50,170,80,25);
        l.setBounds(50,210,200,20);

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);
        setSize(300,300);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String S1 = t1.getText();
        String S2 = t2.getText();
        int a = Integer.parseInt(S1);
        int b = Integer.parseInt(S2);

        int sum = a+b;
        l.setText("Sum=" + sum);
    }
    public static void main(String args [])
    {
        new Test();
    }
}

