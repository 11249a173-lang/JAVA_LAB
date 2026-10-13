
import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Frame {
    ColorPalette() {
        setTitle("Color Palette");
        setSize(400, 300);
        setLayout(new FlowLayout());

        Button red = new Button("Red");
        Button green = new Button("Green");
        Button blue = new Button("Blue");

        red.addActionListener(e -> setBackground(Color.RED));
        green.addActionListener(e -> setBackground(Color.GREEN));
        blue.addActionListener(e -> setBackground(Color.BLUE));

        add(red);
        add(green);
        add(blue);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}
