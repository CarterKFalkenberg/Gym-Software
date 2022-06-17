import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Choose Option");
        frame.setSize(1300, 750);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);
        
        JLabel chooseOption = new JLabel();
        chooseOption.setText("Choose an option");
        chooseOption.setBounds(575, 0, 200, 100);
        chooseOption.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(chooseOption);
    
        JButton addMemberButton = new JButton("Add Member");
        addMemberButton.setFont(new Font("Arial", Font.PLAIN, 15));
        addMemberButton.setBounds(395, 100, 500, 100);
        frame.add(addMemberButton);

        frame.setVisible(true);

        
    }
}
