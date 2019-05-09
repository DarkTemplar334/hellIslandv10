package gr.gcc.hellIsland.Invetory;
public class Key implements Item{

	private int keyId;
	private boolean pickable;

	public Key(int keyId,boolean pickable) {
		this.keyId = keyId;
		this.pickable=pickable;
	}


	@Override
	public int getId(Item item) {
		return keyId;
	}

	@Override
	public String getDescription(Item item) {
		return null;
	}

	@Override
	public int getlifePoints(Item item) {
		return 0;
	}


	@Override
	public boolean pickable(Item pick) {
		return this.pickable;
	}

	@Override
	public int attack() {
		return 0;
	}
}
