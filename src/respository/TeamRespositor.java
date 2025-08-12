package respository;

import entity.Team;

public class TeamRespositor {
	
	public static Team getMITeamDetails() {
		
		Team team =new Team();
		
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setId(101);
		team.setNrr(3.22f);
		team.setQualified(false);
		return team;
		
		
		
		
	}
	
	

}
