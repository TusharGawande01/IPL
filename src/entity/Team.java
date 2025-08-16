package entity;

public class Team {
	
	private int id;
	
	private String teamName;
	
	private String captainName;
	
	private String coachName;
	
	private float nrr;
	
	private boolean isQualified;
	
	private String shortName;
	
	// toString() - >converts object toString
	// right click -> source -> generate toString()
	
	
	
	//setter getter
	
	public String getShortName() {
		return shortName;
	}
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", captainName=" + captainName + ", coachName=" + coachName
				+ ", nrr=" + nrr + ", isQualified=" + isQualified + ", shortName=" + shortName + "]";
	}

	public void setShortName(String shortName) {
		this.shortName=shortName;
	}
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public float getNrr() {
		return nrr;
	}

	public void setNrr(float nrr) {
		this.nrr = nrr;
	}

	public boolean isQualified() {
		return isQualified;
	}

	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		
		return id;
	}
	
	

}
