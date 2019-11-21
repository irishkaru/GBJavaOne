package ru.geekbrains.java1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private static final int WIDTH = 507;
    private static final int HEIGHT = 555;
    private static final int POSX = 650;
    private static final int POSY = 250;

    private GameMap map;
    private Settings settings;

    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Игра Крестили-нолики");
        setBounds(POSX,POSY,WIDTH,HEIGHT);
        setResizable(false);

        JButton butExit = new JButton("Выход");
        JButton butNewGame = new JButton("Новая игра");
        JPanel jPan = new JPanel(new GridLayout(1,2));

        jPan.add(butNewGame);
        jPan.add(butExit);

        butExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        butNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });


        map = new GameMap();
        settings = new Settings(this);
        add(map, BorderLayout.CENTER);
        add(jPan, BorderLayout.SOUTH);
        setVisible(true);

    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        map.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }
}
