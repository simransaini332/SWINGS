import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class javaFrame {
	javaFrame(){    
		JFrame f=new JFrame("Example"); 
					
		JButton b=new JButton("click");   //click button 
		b.setBounds(100,100,140, 40);    
					
		JLabel label = new JLabel();	//enter textfield label	
		label.setText("textfield ");
		label.setBounds(10, 10, 100, 100);
					
	

			
		JTextField textfield= new JTextField();		//textfield to display text
		textfield.setBounds(110, 50, 130, 30);
					

		f.add(textfield);//add to frame
		f.add(label);
		f.add(b);    
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
							
		b.addActionListener(new ActionListener() {//action listener
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					textfield.setText("Welcome to java");				
			}          
	      });
		}         
	
	
		public static void main(String[] args) {    
		    new javaFrame();    
		}    
}
