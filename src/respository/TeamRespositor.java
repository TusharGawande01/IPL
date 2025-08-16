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
		team.setShortName("MI");
		return team;
			
	}
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		
		team.setId(102);
		team.setTeamName("Royal Challenge Banglore");
		team.setCaptainName("Virat Kohli");
		team.setCoachName("abc");
		team.setQualified(false);
		team.setNrr(4.3f);
		team.setShortName("RCB");
		return team;
	}
	
	public static Team getCSKTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoachName("Stephen Fleming");
		team.setId(103);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("CSK");
		return team;
		
		
	}
	
	public static Team getKKRTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Chandrakant Pandit");
		team.setId(104);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("KKR");
		return team;
		
		
	}
	
	public static Team getRRTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Kumar Sangakkara");
		team.setId(105);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("RR");
		return team;
		
		
	}
	
	public static Team getSHTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setId(106);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("SRH");
		return team;
		
		
	}
	
	public static Team getGTTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Gujarat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Ashish Nehra");
		team.setId(107);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("GT");
		return team;
		
		
	}
	
	public static Team getDCTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Ricky Ponting");
		team.setId(108);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("DC");
		return team;
		
		
	}
	
	public static Team getLSGTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("KL Rahul");
		team.setCoachName("Justin Langer");
		team.setId(109);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("LSG");
		return team;
		
		
	}
	
	public static Team getPBKSTeamDetails() {
		Team team = new Team();
		
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shikhar Dhawan");
		team.setCoachName("Trevor Bayliss");
		team.setId(110);
		team.setNrr(0.000f);
		team.setQualified(false);
		team.setShortName("PBKS");
		return team;
		
		
	}
	
	

}
