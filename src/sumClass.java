import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.Scanner;
public class sumClass {
	
	JFrame f=new JFrame("Sum Example"); 
	JButton b=new JButton("add"); 
	JTextField textfield1= new JTextField();
	JTextField textfield2= new JTextField();
	JLabel label3 = new JLabel();
	static Scanner sc = new Scanner(System.in);
	int firstint;
	int secondint;
	sumClass(){    
		   
		b.setBounds(100,150,100, 40);    
		JLabel label1 = new JLabel();	
		JLabel label2 = new JLabel();
		label1.setText("Enter first integer :");
		label1.setBounds(10, 10, 200, 100);
		label2.setText("Enter second integer :");
		label2.setBounds(10, 45, 200, 100);	
		label3.setBounds(10, 170, 200, 100);
		textfield1.setBounds(130, 50, 130, 30);
		textfield2.setBounds(140, 85, 130, 30);
					
		f.add(label1);//add to frame
		f.add(label2);
		f.add(label3);
		f.add(textfield1);
		f.add(textfield2);
		f.add(b);    
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
							
		b.addActionListener(new ActionListener() {//action listener
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				      firstint=Integer.parseInt(textfield1.getText());
				      secondint=Integer.parseInt(textfield2.getText());
					label3.setText("Sum :"+ String.valueOf(firstint+secondint));				
			}          
	      });
		}         
	
	
		public static void main(String[] args) {    
		    new sumClass();    
		}  
}
