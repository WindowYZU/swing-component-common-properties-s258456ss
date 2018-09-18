/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.componentproperties;

import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class PreferredSizeSample extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, getWidth(), getHeight());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(700, 100);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //試試看改成 BorderLayout
        frame.setLayout(new FlowLayout());
        ////////////////////////
        
        for(int i=0; i<10; i++){
            PreferredSizeSample c=new PreferredSizeSample();
            c.setPreferredSize(new Dimension(100,50));
            //設定 preferredSize 為 50, 50 跟 100, 100 跟 150, 150
            //觀察看看
            /////////////////////////////////////////////
            frame.add(c);
        }
        frame.setVisible(true);
    }
    
}
