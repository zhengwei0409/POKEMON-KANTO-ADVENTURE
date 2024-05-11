package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowMapGUI {
    // public static void main(String[] args) {
    //     showMap("Lavender Town");
    // }

    public static void showMap(String currentLocation) {
        // create a frame
        JFrame mapF = new JFrame();
        mapF.setSize(1080, 720);
        mapF.setTitle("Kanto Region Map");
        mapF.setResizable(false);
        mapF.setLayout(null);

        // -------------- panel ----------------
        JPanel upper = new JPanel();
        upper.setBounds(0, 0, 1080, 100);
        upper.setBackground(new Color(255,246,164));
        upper.setLayout(null);
        
        JPanel lower = new JPanel();
        lower.setBackground(new Color(255,255,255));
        lower.setBounds(0, 100, 1080, 620);
        lower.setLayout(null);

        // -------------- label --------------------
        JLabel title = new JLabel();
        title.setText("KANTO REGION");
        title.setFont(new Font("Arial", Font.BOLD, 35)); // set font of text
        title.setForeground(new Color(33,56,110));
        int xCoordinate = (upper.getWidth() - title.getPreferredSize().width) / 2;
        title.setBounds(xCoordinate, 0, 650, 80);

        JLabel title2 = new JLabel();
        title2.setText("MAP");
        title2.setFont(new Font("Arial", Font.BOLD, 15)); // set font of text
        title2.setForeground(new Color(33,56,110));
        int xCoordinate2 = (upper.getWidth() - title2.getPreferredSize().width) / 2;
        title2.setBounds(xCoordinate2, 60, 650, 20);

        // -------------- Button --------------------
        JButton backBtn = new JButton("BACK");
        backBtn.setBounds(850, 500, 150, 55);
        backBtn.setFont(new Font("Arial", Font.BOLD, 15)); // Set font
        
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mapF.dispose();
            }
        });

        // --------------- image -----------------
        
        // add image to upper panel
        ImageIcon currentLocationImg = new ImageIcon();
        switch (currentLocation) {
            case "Pallet Town":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Pallet Town.png");
                break;
            case "Viridian City":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Viridian City.png");
                break;
            case "Pewter City":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Pewter City.png");
                break;
            case "Cerulean City":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Cerulean City.png");
                break;
            case "Celadon City":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Celadon City.png");
                break;
            case "Saffron City":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Saffron City.png");
                break;
            case "Lavender Town":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Lavender Town.png");
                break;
            case "Vermilion City":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Vermilion City.png");
                break;
            case "Fuschia City": 
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Fuchsia City.png");
                break;
            case "Cinnabar Island":
                currentLocationImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Cinnabar Island.png");
                break;
            default:
                break;
        }
        // Resize the image
        Image resizedImage = currentLocationImg.getImage().getScaledInstance(1080, 580, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        
        JLabel mapImg = new JLabel();
        mapImg.setBounds(0, -20, 1080, 620);
        mapImg.setIcon(resizedIcon);

        // add to panel
        lower.add(backBtn);
        lower.add(mapImg);
        
        upper.add(title);
        upper.add(title2);

        // add to frame 
        mapF.add(upper);
        mapF.add(lower);

        mapF.setVisible(true);
        mapF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}
