
package ScreenRecorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



/**
 *
 * @author goryl
 */
public class ScreenRecorderpanel extends javax.swing.JPanel {

   
    public ScreenRecorderpanel() {
        initComponents();
    }

    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents




	public static void main(String[] args) {

		
		
		

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,5,10));
		
		frame.add(new JButton("Start Recording"));
		frame.add(new JButton("Pause Recording"));
		
		
		frame.setVisible(true);

	}
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

