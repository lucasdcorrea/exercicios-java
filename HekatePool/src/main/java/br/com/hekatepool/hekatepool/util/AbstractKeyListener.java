/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hekatepool.hekatepool.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author jessi
 */
public abstract class AbstractKeyListener implements KeyListener{
    
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}
    
}
