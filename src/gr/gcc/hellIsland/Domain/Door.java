package gr.gcc.hellIsland.Domain;

import gr.gcc.hellIsland.Invetory.Key;

public class Door {
	private Key key;
	private boolean locked;
	private int doorId;


	public Door(int doorId) {
		this.doorId = doorId;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public int getDoorId() {
		return doorId;
	}

	public boolean unlock(Key key)
	{
		if (this.key.equals(key)) {
			setLocked(false);
		}
		return !isLocked();
	}
}
