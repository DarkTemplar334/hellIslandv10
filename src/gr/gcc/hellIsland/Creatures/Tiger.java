package gr.gcc.hellIsland.Creatures;

import java.util.Scanner;

public class Tiger implements Creature{

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
		System.out.println("Enter action for Tiger: ");
	    String action = act.nextLine();
	    //System.out.println("Action is: " + action);
	    
		return action; 
	}

	@Override
	public void damage() {
		int lf;
		if(this.getAction().equals("firewood")) {
			lf = this.getLife() - 15;
			this.setLife(lf);
			this.setDamage(15);
		}
		else if(this.getAction().equals("wood")) {
			lf = this.getLife() - 5;
			this.setLife(lf);
			this.setDamage(5);
		}
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
