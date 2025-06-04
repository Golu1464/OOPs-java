import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtTutorial /*extends Frame*/ {
    // Constructor name should match the class name
    public AwtTutorial() {
//        setSize(400, 300);
//        setVisible(true);
        Frame frame = new Frame("Hello, First gui");
        Label label = new Label("Hello friends");
        label.setBounds(20,90,150,30);
        frame.add(label);
        TextField textField = new TextField();
        textField.setBounds(20,120,100,30);
        frame.add(textField);
        Button button = new Button("Click me");
        button.setBounds(20,40,80,30);
        button.setBackground(Color.gray);
        button.setForeground(Color.BLUE);
        frame.add(button);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
//        new AwtTutorial();  // Instantiate the class with the correct name
        AwtTutorial ob1 = new AwtTutorial();
    }
}
