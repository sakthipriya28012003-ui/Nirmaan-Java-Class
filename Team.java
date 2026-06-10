package bank;

public class Team {
	private int teamid;
	private String teamname;
	
	public Team() {}

	public Team(int teamid, String teamname) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	
	

}
