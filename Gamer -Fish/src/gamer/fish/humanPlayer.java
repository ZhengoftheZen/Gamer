/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamer.fish;

import javax.swing.*;
import java.util.*;
public class humanPlayer {
    
    public static ArrayList<String> hand = new ArrayList<>();
    public ArrayList<Integer> points = new ArrayList<>();
    public Integer score = 0;
    public humanPlayer(ArrayList<String> hand) {
        this.hand = hand;
    }
    public humanPlayer() {
        // TODO Auto-generated constructor stub
    }
    
}