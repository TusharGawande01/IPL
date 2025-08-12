package services;

import entity.Team;
import respository.TeamRespositor;

public class TeamService {
	
	public void printTeamDetails() {
		
		Team team = TeamRespositor.getMITeamDetails();
	
		
		
		
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getId());
		System.out.println(team.getNrr());
		System.out.println(team.isQualified());
		
			
			
			
			
			
			
			
		
		
		
		
		
		
	}
	
	

}
