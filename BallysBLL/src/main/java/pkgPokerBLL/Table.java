package pkgPokerBLL;

import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	// Change this from ArrayList to HashMap.
	private HashMap<UUID, Player> TablePlayers = new HashMap<UUID, Player>();

	public Object getHmPlayer;

	public Player getPlayer(UUID key){
		Player p = TablePlayers.get(key);
		return p;
	}

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		TablePlayers.put(p.getPlayerID(), p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		TablePlayers.remove(p.getPlayerID());
		return this;
	}
}
