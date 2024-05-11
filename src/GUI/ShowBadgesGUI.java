package GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class ShowBadgesGUI {
    public static void main(String[] args) {
        
        showBadges(null);
    }

    public static void showBadges(ArrayList<String> badges) {
        boolean boulder = false;
        boolean cascade = false;
        boolean thunder = false;
        boolean rainbow = false;
        boolean soul = false;
        boolean marsh = false;
        boolean volcano = false;
        boolean earth = false;

        if(badges != null) {
            for(String i : badges) {
                if(i.equals("Boulder")) {
                    boulder = true;
                } else if (i.equals("Cascade")) {
                    cascade = true;
                } else if (i.equals("Thunder")) {
                    thunder = true; 
                } else if (i.equals("Rainbow")) {
                    rainbow = true;
                } else if (i.equals("Soul")) {
                    soul = true;
                } else if (i.equals("Marsh")) {
                    marsh = true;
                } else if (i.equals("Volcano")) {
                    volcano = true;
                } else if (i.equals("Earth")) {
                    earth = true;
                }
            }
        }
        
        
        // create a frame
        JFrame badgesF = new JFrame();
        badgesF.setSize(1080, 720);
        badgesF.setTitle("My Badges");
        badgesF.setResizable(false);
        badgesF.setLayout(null);

        // -------------- panel ----------------
        JPanel upper = new JPanel();
        upper.setBounds(0, 0, 1080, 100);
        upper.setBackground(new Color(252, 227, 75));
        upper.setLayout(null);
        
        JPanel lower = new JPanel();
        lower.setBackground(new Color(255,255,255));
        lower.setBounds(0, 100, 1080, 620);
        lower.setLayout(null);  

        // -------------- label --------------------
        JLabel title = new JLabel();
        title.setText("MY BADGES");
        title.setFont(new Font("Arial", Font.BOLD, 35)); // set font of text
        title.setForeground(new Color(33,56,110));
        int xCoordinate = (upper.getWidth() - title.getPreferredSize().width) / 2;
        title.setBounds(xCoordinate - 50, 0, 650, 80);

        JLabel title2 = new JLabel();
        title2.setText("KANTO REGION");
        title2.setFont(new Font("Arial", Font.BOLD, 15)); // set font of text
        title2.setForeground(new Color(33,56,110));
        int xCoordinate2 = (upper.getWidth() - title2.getPreferredSize().width) / 2;
        title2.setBounds(xCoordinate2 - 50, 60, 650, 20);

        // -------------- Button --------------------
        JButton backBtn = new JButton("BACK TO MAIN MENU");
        backBtn.setBounds(450, 545, 200, 35);
        backBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 12)); // Set font
        
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                badgesF.dispose();
            }
        });

        // -------------- image label --------------------
        // badges icon image
        ImageIcon badgesIconImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/BadgesIcon.png");
    
        // Resize the image
        Image resizedImage = badgesIconImage.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel badgesIconL = new JLabel();
        badgesIconL.setBounds(630, 0, 100, 100);
        badgesIconL.setIcon(resizedIcon);
            
        // background image 
        ImageIcon bgImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/BadgesBG.png");
        // Resize the image
        resizedImage = bgImage.getImage().getScaledInstance(1080, 580, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel bgL = new JLabel();
        bgL.setBounds(0, -20, 1080, 620);
        bgL.setIcon(resizedIcon);

        // ---- badges image -------
        // boulder
        ImageIcon boulderImage = new ImageIcon();
        if(boulder) {
            boulderImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Boulder_Badge.png");
        } else {
            boulderImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Boulder.png");
        }
        
        // Resize the image
        resizedImage = boulderImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel boulderL = new JLabel();
        boulderL.setBounds(55, 30, 167, 167);
        boulderL.setIcon(resizedIcon);

        // cascade
        ImageIcon cascadeImage = new ImageIcon();
        if(cascade) {
            cascadeImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Cascade_Badge.png");
        } else {
            cascadeImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Cascade.png");
        }
        
        // Resize the image
        resizedImage = cascadeImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel cascadeL = new JLabel();
        cascadeL.setBounds(325, 30, 167, 167);
        cascadeL.setIcon(resizedIcon);

        // thunder
        ImageIcon thunderImage = new ImageIcon();
        if(thunder) {
            thunderImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Thunder_Badge.png");
        } else {
            thunderImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Thunder.png");
        }
        
        // Resize the image
        resizedImage = thunderImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel thunderL = new JLabel();
        thunderL.setBounds(595, 30, 167, 167);
        thunderL.setIcon(resizedIcon);

        // rainbow
        ImageIcon rainbowImage = new ImageIcon();
        if(rainbow) {
            rainbowImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Rainbow_Badge.png");
        } else {
            rainbowImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Rainbow.png");
        }
        
        // Resize the image
        resizedImage = rainbowImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel rainbowL = new JLabel();
        rainbowL.setBounds(865, 30, 167, 167);
        rainbowL.setIcon(resizedIcon);

        // soul
        ImageIcon soulImage = new ImageIcon();
        if(soul) {
            soulImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Soul_Badge.png");
        } else {
            soulImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Soul.png");
        }
        
        // Resize the image
        resizedImage = soulImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel soulL = new JLabel();
        soulL.setBounds(55, 285, 167, 167);
        soulL.setIcon(resizedIcon);

        // marsh
        ImageIcon marshImage = new ImageIcon();
        if(marsh) {
            marshImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Marsh_Badge.png");
        } else {
            marshImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Marsh.png");
        }
        
        // Resize the image
        resizedImage = marshImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel marshL = new JLabel();
        marshL.setBounds(325, 285, 167, 167);
        marshL.setIcon(resizedIcon);

        // Volcano
        ImageIcon volcanoImage = new ImageIcon();
        if(volcano) {
            volcanoImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Volcano_Badge.png");
        } else {
            volcanoImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Volcano.png");
        }
        
        // Resize the image
        resizedImage = volcanoImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel volcanoL = new JLabel();
        volcanoL.setBounds(595, 285, 167, 167);
        volcanoL.setIcon(resizedIcon);

        // earth
        ImageIcon earthImage = new ImageIcon();
        if(earth) {
            earthImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Earth_Badge.png");
        } else {
            earthImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Earth.png");
        }
        
        // Resize the image
        resizedImage = earthImage.getImage().getScaledInstance(167, 167, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);
                
        JLabel earthL = new JLabel();
        earthL.setBounds(865, 285, 167, 167);
        earthL.setIcon(resizedIcon);


        // add to panel
        lower.add(boulderL);
        lower.add(cascadeL);
        lower.add(thunderL);
        lower.add(rainbowL);
        lower.add(soulL);
        lower.add(marshL);
        lower.add(volcanoL);
        lower.add(earthL);
        lower.add(backBtn);

        lower.add(bgL);
        
        upper.add(title);
        upper.add(title2);
        upper.add(badgesIconL);

        // add to frame
        badgesF.add(upper);
        badgesF.add(lower);

        badgesF.setVisible(true);
        badgesF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
