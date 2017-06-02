/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author steffen
 */
public class KeyManager implements KeyListener {

    private final int up = KeyEvent.VK_W;
    private final int down = KeyEvent.VK_S;
    private final int left = KeyEvent.VK_A;
    private final int right = KeyEvent.VK_D;
    private final int attack = KeyEvent.VK_SPACE;
    
    private final int upperEnemy = KeyEvent.VK_NUMPAD8;
    private final int upperEnemy2 = KeyEvent.VK_UP;
    
    private final int pause = KeyEvent.VK_P;
    private final int esc = KeyEvent.VK_ESCAPE;
    
    private boolean[] keys;
    //public boolean up, down, left, right;
    //public boolean esc;
    //public boolean pause;
    public KeyManager() {
        this.keys = new boolean[256];
    }
    
    public void update() {
        /*
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
        esc = keys[KeyEvent.VK_ESCAPE];
        pause = keys[KeyEvent.VK_P];
                */
    }
    
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        //keys[e.getKeyCode()] = true; 
        
       // keyAction(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keys[e.getKeyCode()] = true; 
        
       // System.out.println("Pressed");
        
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
     // keys[e.getKeyCode()] = false; 
     //   System.out.println("Released");
        keyAction(e);
       

    }
    
    public void keyAction(KeyEvent e) {
       int keyCode = e.getKeyCode();
        switch (keyCode) {
            // Movement
            case up:
                // to inputhandler
                System.out.println("Up");
                break;
            case down:
                System.out.println("Down");
                break;
            case left:
                System.out.println("Left");
                break;
            case right:
                System.out.println("Right");
                break;
            // Battle Commands
                
            // Info
                
                
            // System Commands
            case pause:
                System.out.println("Pause");
                break;
            case esc:
                System.out.println("Esc");
                break;

        }
        
        
    }
    
}
