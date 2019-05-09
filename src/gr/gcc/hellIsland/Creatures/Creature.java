package gr.gcc.hellIsland.Creatures;

public interface Creature {
	
	public int setLife(int life);
	public int getLife();
	public int getDamage();
	public int setDamage(int damage);
	public String getAction();
	public void damage();
	public void life();
	public void level();
}
