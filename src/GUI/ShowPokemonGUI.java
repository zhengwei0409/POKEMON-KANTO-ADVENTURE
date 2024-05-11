package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import CLI.Account;
import Pokemons.Pokemon;

public class ShowPokemonGUI {
    
    // public static void main(String[] args) {
    //     showPokemon(null);
    // }


    public static void showPokemon(Account userAccount) {
        Pokemon pokemon = userAccount.getPokemonTeam().get(0);
        String pokemonName = pokemon.toString();
        int level = pokemon.getLevel();
        String type = pokemon.getType();
        int Hp = pokemon.getMaxHp();
        int currentXp = pokemon.getCurrentXp();
        int Xp = pokemon.getXp();
        String xp = currentXp + " / " + Xp;
        String move1 = pokemon.getMove().getMove1() + " [" + pokemon.getMove().getMove1Damage() + " damage]";
        String move2 = pokemon.getMove().getMove2() + " [" + pokemon.getMove().getMove2Damage() + " damage]";
        String strong1 = pokemon.getStrength()[0];
        String strong2 = pokemon.getStrength()[1];
        String strong3 = pokemon.getStrength()[2];
        String weak1 = pokemon.getWeakness()[0];
        String weak2 = pokemon.getWeakness()[1];
        String weak3 = pokemon.getWeakness()[2];
        

        // create a frame
        JFrame showPokemonF = new JFrame();
        showPokemonF.setSize(1080, 720);
        showPokemonF.setTitle("My Pokemon");
        showPokemonF.setResizable(false);
        showPokemonF.setLayout(null);

        // -------------- panel ----------------
        JPanel upper = new JPanel();
        upper.setBounds(0, 0, 1080, 100);
        upper.setBackground(new Color(252, 227, 75));
        upper.setLayout(null);
        
        JPanel lower = new JPanel();
        lower.setBounds(0, 100, 1080, 620);
        lower.setBackground(new Color(217,217,217));
        lower.setLayout(null);

        // -------------- label --------------------
        JLabel title = new JLabel();
        title.setText("MY POKEMON");
        title.setFont(new Font("Arial", Font.BOLD, 35)); // set font of text
        title.setForeground(new Color(33,56,110));
        int xCoordinate = (upper.getWidth() - title.getPreferredSize().width) / 2;
        title.setBounds(xCoordinate - 50, 0, 650, 80);

        JLabel title2 = new JLabel();
        title2.setText(pokemonName);
        title2.setFont(new Font("Arial", Font.BOLD, 15)); // set font of text
        title2.setForeground(new Color(33,56,110));
        int xCoordinate2 = (upper.getWidth() - title2.getPreferredSize().width) / 2;
        title2.setBounds(xCoordinate2 - 50, 60, 650, 20);

        JLabel levelL = new JLabel();
        levelL.setText("" + level);
        levelL.setFont(new Font("Helvetica Neue", Font.BOLD, 18)); // set font of text
        levelL.setBounds(650, 92, 100, 30);

        JLabel typeL = new JLabel();
        typeL.setText(type);
        typeL.setFont(new Font("Helvetica Neue", Font.BOLD, 18)); // set font of text
        typeL.setBounds(880, 92, 100, 30);

        JLabel hpL = new JLabel();
        hpL.setText("" + Hp);
        hpL.setFont(new Font("Helvetica Neue", Font.BOLD, 18)); // set font of text
        hpL.setBounds(650, 182, 100, 30);

        JLabel xpL = new JLabel();
        xpL.setText(xp);
        xpL.setFont(new Font("Helvetica Neue", Font.BOLD, 18)); // set font of text
        xpL.setBounds(880, 182, 100, 30);

        JLabel move1L = new JLabel();
        move1L.setText(move1);
        move1L.setFont(new Font("Helvetica Neue", Font.BOLD, 18)); // set font of text
        move1L.setBounds(650, 272, 500, 30);

        JLabel move2L = new JLabel();
        move2L.setText(move2);
        move2L.setFont(new Font("Helvetica Neue", Font.BOLD, 18)); // set font of text
        move2L.setBounds(650, 362, 500, 30);

        JLabel strong1L = new JLabel();
        strong1L.setText("- " + strong1);
        strong1L.setFont(new Font("Helvetica Neue", Font.BOLD, 15)); // set font of text
        strong1L.setBounds(650, 425, 100, 20);

        JLabel strong2L = new JLabel();
        strong2L.setText("- " + strong2);
        strong2L.setFont(new Font("Helvetica Neue", Font.BOLD, 15)); // set font of text
        strong2L.setBounds(650, 455, 100, 20);

        JLabel strong3L = new JLabel();
        strong3L.setText("- " + strong3);
        strong3L.setFont(new Font("Helvetica Neue", Font.BOLD, 15)); // set font of text
        strong3L.setBounds(650, 485, 100, 20);

        JLabel weak1L = new JLabel();
        weak1L.setText("- " + weak1);
        weak1L.setFont(new Font("Helvetica Neue", Font.BOLD, 15)); // set font of text
        weak1L.setBounds(880, 425, 100, 20);

        JLabel weak2L = new JLabel();
        weak2L.setText("- " + weak2);
        weak2L.setFont(new Font("Helvetica Neue", Font.BOLD, 15)); // set font of text
        weak2L.setBounds(880, 455, 100, 20);

        JLabel weak3L = new JLabel();
        weak3L.setText("- " + weak3);
        weak3L.setFont(new Font("Helvetica Neue", Font.BOLD, 15)); // set font of text
        weak3L.setBounds(880, 485, 100, 20);

        // -------------- Button --------------------
        JButton backBtn = new JButton("BACK TO MAIN MENU");
        backBtn.setBounds(450, 540, 200, 35);
        backBtn.setFont(new Font("Helvetica Neue", Font.BOLD, 12)); // Set font
        
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPokemonF.dispose();
            }
        });

        // -------------- image label --------------------
        // pokemonball image
        ImageIcon pokemonBallImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/pokemonBall.png");
    
        // Resize the image
        Image resizedImage = pokemonBallImage.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel pokemonBallL = new JLabel();
        pokemonBallL.setBounds(630, 0, 100, 100);
        pokemonBallL.setIcon(resizedIcon);

        //pokemon image
        ImageIcon currentPokemonImg = new ImageIcon();
        switch (pokemonName) {
            case "Squirtle":
                currentPokemonImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Squirtle.png");
                break;
            case "Bulbasaur":
                currentPokemonImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Bulbasaur.png");
                break;
            case "Charmander":
                currentPokemonImg = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/Charmander.png");
                break;
            default:
                break;
        }
        JLabel pokemonImg = new JLabel();
        pokemonImg.setBounds(15, 20, 520, 520);
        pokemonImg.setIcon(currentPokemonImg);

        // ---- level up icon
        ImageIcon lovelUpImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/LevelIcon.png");
    
        // Resize the image
        resizedImage = lovelUpImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel levelUpL = new JLabel();
        levelUpL.setBounds(550, 80, 50, 50);
        levelUpL.setIcon(resizedIcon);

        //  ----- type icon
        ImageIcon typeImage = new ImageIcon();

        switch (pokemonName) {
            case "Squirtle":
                typeImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/waterTypeIcon.png");
                break;
            case "Bulbasaur":
                typeImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/grassTypeIcon.png");
                break;
            case "Charmander":
                typeImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/fireTypeIcon.png");
                break;
            default:
                break;
        }
        
    
        // Resize the image
        resizedImage = typeImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel typeIconL = new JLabel();
        typeIconL.setBounds(780, 80, 50, 50);
        typeIconL.setIcon(resizedIcon);

        //  ----- Hp icon
        ImageIcon hpImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/hpIcon.png");
    
        // Resize the image
        resizedImage = hpImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel hpIconL = new JLabel();
        hpIconL.setBounds(550, 170, 50, 50);
        hpIconL.setIcon(resizedIcon);

        //  ----- Xp icon
        ImageIcon xpImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/xpIcon.png");
    
        // Resize the image
        resizedImage = xpImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel xpIconL = new JLabel();
        xpIconL.setBounds(780, 170, 50, 50);
        xpIconL.setIcon(resizedIcon);

        //  ----- Moves1 icon
        ImageIcon movesImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/movesIcon.png");
    
        // Resize the image
        resizedImage = movesImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel movesIconL = new JLabel();
        movesIconL.setBounds(550, 260, 50, 50);
        movesIconL.setIcon(resizedIcon);

        //  ----- Moves2 icon
        ImageIcon moves2Image = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/movesIcon2.png");
    
        // Resize the image
        resizedImage = moves2Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel moves2IconL = new JLabel();
        moves2IconL.setBounds(550, 350, 50, 50);
        moves2IconL.setIcon(resizedIcon);

        //  ----- Strong icon
        ImageIcon strongImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/strengthIcon.png");
    
        // Resize the image
        resizedImage = strongImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel strongIconL = new JLabel();
        strongIconL.setBounds(550, 440, 50, 50);
        strongIconL.setIcon(resizedIcon);

        //  ----- Weak icon
        ImageIcon weakImage = new ImageIcon("/Users/zhengwei/Documents/Pokemon/Pokemon/src/Image/weaknessIcon.png");
    
        // Resize the image
        resizedImage = weakImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(resizedImage);

        JLabel weakIconL = new JLabel();
        weakIconL.setBounds(780, 440, 50, 50);
        weakIconL.setIcon(resizedIcon);

        // add to panel
        upper.add(title);
        upper.add(title2);
        upper.add(pokemonBallL);
        
        lower.add(pokemonImg);
        lower.add(levelUpL);
        lower.add(typeIconL);
        lower.add(hpIconL);
        lower.add(xpIconL);
        lower.add(movesIconL);
        lower.add(moves2IconL);
        lower.add(strongIconL);
        lower.add(weakIconL);
        lower.add(levelL);
        lower.add(typeL);
        lower.add(hpL);
        lower.add(xpL);
        lower.add(move1L);
        lower.add(move2L);
        lower.add(strong1L);
        lower.add(strong2L);
        lower.add(strong3L);
        lower.add(weak1L);
        lower.add(weak2L);
        lower.add(weak3L);
        lower.add(backBtn);

        // add to frame
        showPokemonF.add(upper);
        showPokemonF.add(lower);


        showPokemonF.setVisible(true);
        showPokemonF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}


