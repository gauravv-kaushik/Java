/*Using AWT, write a program to create two buttons named “Red” and “Blue”. 
When a button is pressed the background color should be set to the color named 
by the button’s label.  */

import java.awt.*;
import java.awt.event.*;
public class Q10AwtButton extends Frame {
    Button btn1 ;
    Button btn2;
    Q10AwtButton(){
        setSize(600,600);
        setLayout(null);
        setBackground(Color.YELLOW);
        setVisible(true);
         btn1 = new Button("Red");
         btn1.setBackground(Color.RED);
        btn1.setBounds(50,50,50,50);
        add(btn1);

        btn2 = new Button("Blue");
        btn2.setBackground(Color.BLUE);
        btn2.setBounds(180,50,50,50);
        add(btn2);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE);
            }
        });
    }
    public static void main(String[] args) {
        Q10AwtButton obj = new Q10AwtButton();
    }
}
