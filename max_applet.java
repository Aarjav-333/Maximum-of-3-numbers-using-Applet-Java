/*
<applet code = "max.class" width = 300 height = 300 >
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class max extends Applet implements ActionListener {
    TextField t1, t2, t3;
    Button button;

    public void init() {
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        button = new Button("Find Max");
       
        add(t1);
        add(t2);
        add(t3);
        add(button);

        t1.setText("0");
        t2.setText("0");
        t3.setText("0");

        button.addActionListener(this);
    }

    public void paint(Graphics g) {
        int a, b, c, result;
        String str;

        g.drawString("Enter the value to check the maximum of 3", 10, 50);

        str = t1.getText();
        a = Integer.parseInt(str);
        str = t2.getText();
        b = Integer.parseInt(str);
        str = t3.getText();
        c = Integer.parseInt(str);

        g.setColor(Color.blue);

        if (a > b) {
            if (a > c)
                result = a;
            else
                result = c;
        } else {
            if (b > c)
                result = b;
            else
                result = c;
        }

        g.drawString("Maximum of 3 numbers is " + result, 10, 70);
        showStatus("Maximum of 3 numbers");
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
