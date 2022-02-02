package practice;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * User Registration using Swing
 * @author javaguides.net
 *
 */
public class MiradaForm extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField givenName;
    private JTextField addLine1;
    private JTextField town;
    private JTextField country;
    private JTextField mob;
    private JTextField emailAddress;
    private JTextField surName;
    private JTextField addLine2;
    private JTextField county;
    private JTextField postalCode;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	MiradaForm frame = new MiradaForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public MiradaForm() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1114, 787);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("User Registeration Form");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 425, 50);
        contentPane.add(lblNewUserRegister);

        JLabel givenNameLbl = new JLabel("Given name");
        givenNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        givenNameLbl.setBounds(69, 152, 135, 43);
      //  lblName.setBounds(69, 152, 99, 43);
        contentPane.add(givenNameLbl);

        JLabel addLine1Lbl = new JLabel("Address line 1");
        addLine1Lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addLine1Lbl.setBounds(69, 243, 140, 36);
        contentPane.add(addLine1Lbl);

        JLabel townLbl = new JLabel("Town");
        townLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
        townLbl.setBounds(69, 324, 135, 36);
        contentPane.add(townLbl);
        
        
        JLabel lblCountry = new JLabel("Country");
        lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCountry.setBounds(69, 413, 140, 36);
        contentPane.add(lblCountry);
        
        JLabel lblEmailAddress = new JLabel("Email Address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(69, 502, 140, 36);
        contentPane.add(lblEmailAddress);

        givenName = new JTextField();
        givenName.setFont(new Font("Tahoma", Font.PLAIN, 32));
        givenName.setBounds(214, 151, 228, 50);
        contentPane.add(givenName);
        givenName.setColumns(10);

        addLine1 = new JTextField();
        addLine1.setFont(new Font("Tahoma", Font.PLAIN, 32));
        addLine1.setBounds(214, 235, 228, 50);
        contentPane.add(addLine1);
        addLine1.setColumns(10);

        town = new JTextField();

        town.setFont(new Font("Tahoma", Font.PLAIN, 32));
        town.setBounds(214, 320, 228, 50);
        contentPane.add(town);
        town.setColumns(10);

        country = new JTextField();
        country.setFont(new Font("Tahoma", Font.PLAIN, 32));
        country.setBounds(214, 405, 228, 50);
        contentPane.add(country);
        country.setColumns(10);
        
        emailAddress = new JTextField();
        emailAddress.setFont(new Font("Tahoma", Font.PLAIN, 32));
        emailAddress.setBounds(214, 490, 228, 50);
        contentPane.add(emailAddress);
        emailAddress.setColumns(10);

        JLabel lblSurname = new JLabel("Surname");
        lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSurname.setBounds(542, 159, 99, 29);
        contentPane.add(lblSurname);

        JLabel lbladdLine2 = new JLabel("Address Line 2");
        lbladdLine2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbladdLine2.setBounds(542, 245, 135, 24);
        contentPane.add(lbladdLine2);

        JLabel lblCounty = new JLabel("County");
        lblCounty.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCounty.setBounds(542, 329, 139, 26);
        contentPane.add(lblCounty);
        
        JLabel lblPostalCode = new JLabel("Postal code");
        lblPostalCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPostalCode.setBounds(542, 413, 139, 26);
        contentPane.add(lblPostalCode);
        
        JLabel lblPhoneNumber = new JLabel("Phone number");
        lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPhoneNumber.setBounds(542, 497, 139, 26);
        contentPane.add(lblPhoneNumber);
        
        surName = new JTextField();
        surName.setFont(new Font("Tahoma", Font.PLAIN, 32));
        surName.setBounds(707, 150, 228, 50);
        contentPane.add(surName);
        surName.setColumns(10);
        
        addLine2 = new JTextField();
        addLine2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        addLine2.setBounds(707, 235, 228, 50);
        contentPane.add(addLine2);
        addLine2.setColumns(10);
        
        county = new JTextField();
        county.setFont(new Font("Tahoma", Font.PLAIN, 32));
        county.setBounds(707, 320, 228, 50);
        contentPane.add(county);
        county.setColumns(10);
        
        postalCode = new JTextField();
        postalCode.setFont(new Font("Tahoma", Font.PLAIN, 32));
        postalCode.setBounds(707, 405, 228, 50);
        contentPane.add(postalCode);
        postalCode.setColumns(10);
        
        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 490, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);


        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String givenNameValue = givenName.getText();
                String addLine1Value = addLine1.getText();
                String townValue = town.getText();
                String countryValue = country.getText();
                String emailAddressValue = emailAddress.getText();
                String surNameValue = surName.getText();
                String addLine2Value = addLine2.getText();
                String countyValue = county.getText();
                String postalCodeValue = postalCode.getText();
                String phNumberValue = mob.getText();
                
                
              
                if(givenNameValue == null || givenNameValue.isEmpty() || givenNameValue.trim().isEmpty()) {
                	JOptionPane.showMessageDialog(btnNewButton, "Enter a valid given name");
                }else if(surNameValue == null || surNameValue.isEmpty() || surNameValue.trim().isEmpty()) {
                	JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Surname");
                }else if(addLine1Value == null || addLine1Value.isEmpty() || addLine1Value.trim().isEmpty()) {
                	JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Address Line 1");
                }else if(townValue == null || townValue.isEmpty() || townValue.trim().isEmpty() || !townValue.matches("^[a-zA-Z]*")) {
                	JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Town");
                }else  if(townValue == null || townValue.isEmpty() || townValue.trim().isEmpty() || !townValue.matches("^[a-zA-Z]*")) {
                	JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Country");
                }else  if(!postalCodeValue.matches("^[A-Z]{1,2}[0-9][A-Z0-9]? ?[0-9][A-Z]{2}$")) {
                	JOptionPane.showMessageDialog(btnNewButton, "Enter a valid Postal Code");
                }else if(!emailAddressValue.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}")) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid email address");
                }else {
                	JOptionPane.showMessageDialog(btnNewButton, "User Registration Successful");
                }


            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 575, 259, 74);
        contentPane.add(btnNewButton);
    }
}
