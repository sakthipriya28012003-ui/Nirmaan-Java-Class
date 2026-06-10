package bank;

public class Player {
	private int playerId;
	private String playname;
	private int NOF;
	private int NOS;
	
	public Player() {}

	public Player(int playerId, String playname, int nOF, int nOS) {
		super();
		this.playerId = playerId;
		this.playname = playname;
		this.NOF = nOF;
		this.NOS = nOS;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayname() {
		return playname;
	}

	public void setPlayname(String playname) {
		this.playname = playname;
	}

	public int getNOF() {
		return NOF;
	}

	public void setNOF(int nOF) {
		NOF = nOF;
	}

	public int getNOS() {
		return NOS;
	}

	public void setNOS(int nOS) {
		NOS = nOS;
	}
	
	
	
	

}
