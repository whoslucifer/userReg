import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setBounds(140, 10, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(title);

        JLabel lName = new JLabel("Name:");
        lName.setBounds(30, 50, 80, 25);
        frame.add(lName);

        JTextField name = new JTextField();
        name.setBounds(120, 50, 150, 25);
        frame.add(name);

        JLabel lMobile = new JLabel("Mobile:");
        lMobile.setBounds(30, 90, 80, 25);
        frame.add(lMobile);

        JTextField mobile = new JTextField();
        mobile.setBounds(120, 90, 150, 25);
        frame.add(mobile);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(30, 130, 80, 25);
        frame.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(120, 130, 60, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(190, 130, 70, 25);

        ButtonGroup bGender = new ButtonGroup();
        bGender.add(male);
        bGender.add(female);

        frame.add(male);
        frame.add(female);

        JLabel DOB = new JLabel("DOB:");
        DOB.setBounds(30, 170, 80, 25);
        frame.add(DOB);

        String[] days = new String[31];
        /*for(int i = 1; i < 31; i++){
            days[i];
        } */
        JComboBox<String> day = new JComboBox<>(days);
        day.setBounds(120, 170, 30, 20);
        day.setBounds(120, 170, 50, 25);
        frame.add(day);

        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        JComboBox<String> month = new JComboBox<>(months);
        month.setBounds(180, 170, 60, 25);
        frame.add(month);

        String[] years = new String[101];
        for (int i = 1920; i <= 2020; i++) {
            years[i - 1920] = String.valueOf(i);
        }
        JComboBox<String> cbYear = new JComboBox<>(years);
        cbYear.setBounds(250, 170, 60, 25);
        frame.add(cbYear);

        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(30, 210, 80, 25);
        frame.add(lblAddress);

        JTextArea txtAddress = new JTextArea();
        txtAddress.setBounds(120, 210, 200, 60);
        frame.add(txtAddress);

        JCheckBox chkTerms = new JCheckBox("Accept Terms And Conditions.");
        chkTerms.setBounds(120, 280, 200, 25);
        frame.add(chkTerms);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 320, 80, 25);
        frame.add(submit);

        JButton reset = new JButton("Reset");
        reset.setBounds(210, 320, 80, 25);
        frame.add(reset);

        frame.setVisible(true);
    }
}
