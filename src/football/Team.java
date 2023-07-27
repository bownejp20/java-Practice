package football;

public class Team{
    String name;
    String player;
    public Team(String name, String player){
        this.name = name;
        this.player = player;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPlayer(){
        return this.player;
    }
    public void setString(String player){
        this.player = player;
    }
    public String getTeamDetails(){
        return String.format("Team Name: %s, Player Name: %s", this.name, this.player);
    }
}
