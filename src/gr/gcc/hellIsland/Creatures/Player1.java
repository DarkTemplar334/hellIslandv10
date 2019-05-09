package gr.gcc.hellIsland.Creatures;

import java.util.Scanner;

public class Player1 implements Creature{

	private int life;
	private int damage;

	@Override
	public int setLife(int life) {
		return this.life = life;
	}

	@Override
	public int getLife() {
		return(life);
	}

	@Override
	public int getDamage() {
		return (damage);
	}

	@Override
	public int setDamage(int damage) {
		return this.damage = damage;
	}
	
	@Override
	public String getAction() {
		Scanner  act = new Scanner(System.in);
		System.out.println("Enter action for Player1: ");
	    String action = act.nextLine();
	    //System.out.println("Action is: " + action);
	    
		return action; 
	}

	@Override
	public void damage() {
		int lf;
		lf= this.getLife() - 5;
		this.setLife(lf);
		this.setDamage(5);
	}

	@Override
	public void level() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void life() {
		// TODO Auto-generated method stub
		
	}
}
