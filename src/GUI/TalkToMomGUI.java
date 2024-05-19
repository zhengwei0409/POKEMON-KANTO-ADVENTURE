package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TalkToMomGUI {
    public static void main(String[] args) {
        talkToMomGUI();
    }

    public static void talkToMomGUI() {
        // create a frame
        JFrame talkToMomF = new JFrame();
        talkToMomF.setSize(1080, 720);
        talkToMomF.setTitle("Talk to Mom");
        talkToMomF.setResizable(false);
        talkToMomF.setLayout(null);

        // -------------- panel ----------------
        JPanel bgPanel = new JPanel();
        bgPanel.setBounds(0, 0, 1080, 720);
        bgPanel.setBackground(new Color(255,255,255));
        bgPanel.setLayout(null);

        // ---- image label ----
        // background image 
        ImageIcon bgImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/TalktomomBG.png");
        JLabel bgL = new JLabel();
        bgL.setBounds(0, 0, 1080, 700);
        bgL.setIcon(bgImage);

        // -------------- Button --------------------
        JButton backBtn = new JButton("Thanks MOM!!!!!!!!");
        backBtn.setBounds(320, 597, 450, 50);
        backBtn.setFont(new Font("Arial", Font.BOLD, 15)); // Set font
        
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                talkToMomF.dispose();
            }
        });
        
        // add to panel
        bgPanel.add(backBtn);
        bgPanel.add(bgL);
        

        // add to frame
        talkToMomF.add(bgPanel);

        talkToMomF.setVisible(true);
        talkToMomF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
