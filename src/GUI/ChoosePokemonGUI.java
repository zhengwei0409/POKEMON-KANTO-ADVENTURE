package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CLI.Account;
import Pokemons.Bulbasaur;
import Pokemons.Charmander;
import Pokemons.Squirtle;

public class ChoosePokemonGUI {
    // public static void main(String[] args) {
    //     ChoosePokemon(null);
    // }

    public static void ChoosePokemon(Account account) {
        
        JFrame choosePokemonF = new JFrame();
        choosePokemonF.setSize(1080, 720);
        choosePokemonF.setTitle("Welcome Trainer");
        choosePokemonF.setResizable(false);
        choosePokemonF.setLayout(null);

        // -------------- panel ----------------
        JPanel bgPanel = new JPanel();
        bgPanel.setBounds(0, 0, 1080, 720);
        bgPanel.setBackground(new Color(255,255,255));
        bgPanel.setLayout(null);
        
        // --- text field ----
        JTextField nameTF = new JTextField();
        nameTF.setBounds(77, 383, 360, 45);
        nameTF.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        //nameTF.setBackground(new Color(255, 236, 78)); // You can customize the color

        // --- combo box ----
        String[] pokemon = {"Bulbasaur [Grass - Level 1]", "Squirtle [Water - Level 1]", "Charmander [Fire - Level 1]"} ;
        JComboBox pokemonList = new JComboBox(pokemon);
        pokemonList.setBounds(77,528,360,35);

        // -------------- Button --------------------
        JButton doneBtn = new JButton("DONE");
        doneBtn.setBounds(77, 600, 150, 55);
        doneBtn.setFont(new Font("Arial", Font.BOLD, 15)); // Set font
        
        doneBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTF.getText();

                if(name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did not enter your name.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    account.setName(name);
                    String pokemonSelected = (String) pokemonList.getSelectedItem();
                    // assign the right pokemon chosen by the user
                    switch(pokemonSelected) {
                        case "Bulbasaur [Grass - Level 1]": 
                            account.addPokemon(new Bulbasaur());
                            break;
                        case "Squirtle [Water - Level 1]":
                            account.addPokemon(new Squirtle());
                            break;
                        case"Charmander [Fire - Level 1]":
                            account.addPokemon(new Charmander());
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "OAK: An amazing choice. Best of luck!", "Result", JOptionPane.INFORMATION_MESSAGE);
                    choosePokemonF.dispose();
                } 
            }
        });

        // ---- image label ----
        // background image 
        ImageIcon bgImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/ChoosePokemonBG.png");
        JLabel bgL = new JLabel();
        bgL.setBounds(0, 0, 1080, 700);
        bgL.setIcon(bgImage);
        
        // add to panel
        bgPanel.add(nameTF);
        bgPanel.add(pokemonList);
        bgPanel.add(doneBtn);
        bgPanel.add(bgL);
        

        // add to frame
        choosePokemonF.add(bgPanel);

        choosePokemonF.setVisible(true);
        choosePokemonF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
