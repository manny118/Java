

package javaapplication1.mygame;

///import com.sun.java.util.jar.pack.Attribute.Layout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;



public class Interface {
    
     static JFrame jf ;
    static JPanel jp;
    static JButton t ;
    
     public static void main(String[] args) {
      
         
      
          jp = new JPanel();
         
          jf = new JFrame("New Window");
         
  //       new Layout(new FlowLayout());
         
         //jp.add(jf);
         jf.setVisible(true);
      
       
         
         jf.add(jp);
         
         jf.add(t);
        
         
      //  t.addActionListener( ActionListener actionListener(){});
       
          //private void tActionPerformed(java.awt.event.ActionEvent evt) {  }      
  
         
           
          
      //   public class
  ///t.addActionListener                                    
     
     
         
         
       //  jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         
         
     }
    
         
  public void actionPerformed(ActionEvent e){ 
    
      
      t = new JButton("Click me");
  ///t.
  
  }
          
       
    
     
    
}
