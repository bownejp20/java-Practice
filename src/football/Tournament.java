package football;


public class Tournament {
    String name;
    String teams;
    String matches;
    public Tournament(String name, String teams, String matches){
        this.name = name;
        this.teams = teams;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTeams(){
        return this.teams;
    }
    public void setTeams( String teams){
        this.teams = teams;
    }
    public String getMatches(){
        return this.matches;
    }
    public void setMatches(String matches){
        this.matches = matches;
    }

}