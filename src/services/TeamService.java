package services;


import java.util.Scanner;


import respository.TeamRespositor;

public class TeamService {
	
	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");
		System.out.println("3.Get team details by team id");

		int input = sc.nextInt();
		System.err.println("You have selected option : " + input);
		

		switch (input) {
		//get All team details
		case 1: {
			System.out.println(TeamRespositor.getMITeamDetails());
			System.out.println(TeamRespositor.getRCBTeamDetails());
			System.out.println(TeamRespositor.getCSKTeamDetails());
			System.out.println(TeamRespositor.getDCTeamDetails());
			System.out.println(TeamRespositor.getGTTeamDetails());
			System.out.println(TeamRespositor.getKKRTeamDetails());
			System.out.println(TeamRespositor.getLSGTeamDetails());
			System.out.println(TeamRespositor.getPBKSTeamDetails());
			System.out.println(TeamRespositor.getRRTeamDetails());
			System.out.println(TeamRespositor.getSHTeamDetails());
			
			

			break;
		}
		//get team details by short Name
		case 2: {
			System.out.println("Please enter your fav team's short name : ");
			String teamShortName = sc.next();
			System.err.println("entered team short name is  : " + teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		case 3 : {
			//get team by id
			System.out.println("Please enter your fav team's id : ");
			int id=sc.nextInt();
			System.err.println("Enter team id is : " +id);
			getTeamById(id);
			sc.close();
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
			
			
		}
	}

	
	

	private void getTeamByShortName(String shortName) {
		
		switch (shortName) {
		case "MI": {
			System.out.println(TeamRespositor.getMITeamDetails());
			break;
		}
		case "RCB" : {
			System.out.println(TeamRespositor.getRCBTeamDetails());
			break;
		}
		case "CSK":{
			System.out.println(TeamRespositor.getCSKTeamDetails());
			break;
		}
		case "DC":{
			System.out.println(TeamRespositor.getDCTeamDetails());
			break;
		}
		case "GT":{
			System.out.println(TeamRespositor.getGTTeamDetails());
			break;
		}
		case "KKR":{
			System.out.println(TeamRespositor.getKKRTeamDetails());
			break;
		}
		case "LSG":{
			System.out.println(TeamRespositor.getLSGTeamDetails());
			break;
		}
		case "PBKS":{
			System.out.println(TeamRespositor.getPBKSTeamDetails());
			break;
		}
		case "RR":{
			System.out.println(TeamRespositor.getRRTeamDetails());
			break;
		}
		case "SRH":{
			System.out.println(TeamRespositor.getSHTeamDetails());
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + shortName);
		}

	}
	
	private void getTeamById(int id) {
		
		if(id==101) {
			System.out.println(TeamRespositor.getMITeamDetails());
		}
		else if(id==102) {
			System.out.println(TeamRespositor.getRCBTeamDetails());
		}
		else if(id==103) {
			System.out.println(TeamRespositor.getCSKTeamDetails());
		}
		else if(id==104) {
			System.out.println(TeamRespositor.getKKRTeamDetails());
		}
		else if(id==105) {
			System.out.println(TeamRespositor.getRRTeamDetails());
		}
		else if(id==106) {
			System.out.println(TeamRespositor.getSHTeamDetails());
		}
		else if(id==107) {
			System.out.println(TeamRespositor.getGTTeamDetails());
		}
		else if(id==108) {
			System.out.println(TeamRespositor.getDCTeamDetails());
		}
		else if(id==109) {
			System.out.println(TeamRespositor.getLSGTeamDetails());
		}
		else if(id==110) {
			System.out.println(TeamRespositor.getPBKSTeamDetails());
		}
		else {
            System.out.println("No team found with ID " +id);
        }
		
		
		
	}
}
	


