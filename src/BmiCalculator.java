import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BmiCalculator {

	public static void main(String[] args) {
		
		JFrame frame= new JFrame("BMI Calculator(Body Mass Index)");
		frame.setSize(800,600);
		frame.setLocation(500,100);
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		 ImageIcon icon = new ImageIcon("C:\\Users\\Hp\\eclipse-workspace\\BmiCalculator\\src\\image\\bmichart2.jpg");
	     JLabel pic = new JLabel();
	     pic.setIcon(icon);
	     pic.setBounds(470,10,297,159);
	     frame.add(pic);
		
		JLabel l1=new JLabel("Height");
		JLabel l2=new JLabel("Feet");
		JLabel l3=new JLabel("Inch");
		JLabel l4=new JLabel("Weight");
		JLabel l5=new JLabel("Kilogram");
		JLabel l6=new JLabel("Result");
		JLabel l7=new JLabel("Comment");
		JLabel l8= new JLabel("Gender");
		JLabel l9=new JLabel("Age");
		JLabel l10=new JLabel();
		
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t5=new JTextField();
		JTextField t6=new JTextField();
		JTextField t7=new JTextField();
		JTextField t9=new JTextField();
		
		JButton b1=new JButton("Reset");
		b1.setBounds(350, 280, 130, 50);
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.red);
		frame.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t2.setText(null);
				t3.setText(null);
				t5.setText(null);
				t6.setText(null);
				t7.setText(null);
				t9.setText(null);
				l10.setText(null);
				
			}
		});
		
	    JButton b2=new JButton("Submit");
	    b2.setBounds(530, 280, 130, 50);
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.DARK_GRAY);
		frame.add(b2);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double height,bmi;
		        DecimalFormat df2 = new DecimalFormat(".##");
		        try {
		            double n1 = Double.parseDouble(t2.getText());
		            double n2 = Double.parseDouble(t3.getText());
		            double n3 = Double.parseDouble(t5.getText());
		         
				height = (n1 * 12) + n2;
                height = (height * 2.54) / 100;
                bmi = n3 / (height * height);
                t6.setText(String.valueOf(df2.format(bmi)));
		        
                if (bmi < 18.5)
                    t7.setText("YOU ARE UNDERWEIGHT");
                else if (bmi >= 18.5 && bmi <= 24.9)
                    t7.setText("YOU ARE NORMAL");
                else if(bmi >=25 && bmi<=29.9)
                	t7.setText("YOU ARE OVERWEIGHT");
                else
                    t7.setText("YOU ARE OBESE");
		        }catch(Exception e1) {
		        	l10.setText("Error! Give Some Input !");
		        }			
			}
		});
		
		JRadioButton rb1= new JRadioButton("Male");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rb1.setBounds(120, 150, 100, 30);
		frame.add(rb1);
		
		JRadioButton rb2= new JRadioButton("Female");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rb2.setBounds(120, 200, 100, 30);
		frame.add(rb2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected()) {
					JOptionPane.showMessageDialog(null,"Male is selected !");
				}
						
			}
		} );
		rb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rb2.isSelected()) {
					JOptionPane.showMessageDialog(null,"Female is selected !");
				}
						
			}
		} );
		
	    
		
		
		l1.setBounds(10, 10, 100, 30);
		
		l2.setBounds(120, 10, 100, 30);
		t2.setBounds(180, 10, 100, 30);
		t2.setBackground(Color.green);
		
		l3.setBounds(300, 10, 100, 30);
		t3.setBounds(360, 10, 100, 30);
		t3.setBackground(Color.green);
		
		l4.setBounds(10, 80, 100, 30);
		
		l5.setBounds(120, 80, 100, 30);
		t5.setBounds(230, 80, 100, 30);
		t5.setBackground(Color.green);
		
		l6.setBounds(10, 400, 100, 30);
		t6.setBounds(120, 400, 100, 30);
		
		l7.setBounds(10, 460, 200, 30);
		t7.setBounds(120, 460, 200, 30);
		
		l8.setBounds(10, 150, 100, 30);
		
		l9.setBounds(10, 250, 100, 30);
		t9.setBounds(120, 250, 100, 30);
		
		l10.setBounds(10, 500, 200, 30);
		l10.setText("");
		
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		l2.setFont(new Font("Tahoma", Font.BOLD, 20));
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		l5.setFont(new Font("Tahoma", Font.BOLD, 20));
		l6.setFont(new Font("Tahoma", Font.BOLD, 20));
		l7.setFont(new Font("Tahoma", Font.BOLD, 20));
		l8.setFont(new Font("Tahoma", Font.BOLD, 20));
		l9.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		
		frame.add(t2);
		frame.add(t3);
		frame.add(t5);
		frame.add(t6);
		frame.add(t7);
		frame.add(t9);
				
		frame.setVisible(true);
		
		
		
	}

}
