package football;

public class Player{
    String name;
    int age;
    String position;
    Team team;
    public Player(String name, int age, String position, Team team){
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPosition(){
        return this.position;
    }
    public void setPosition(){
        this.position = position;
    }
    public Object getTeam(){
        return this.team;
    }
    public void setTeam(Team team){
        this.team = team;
    }
    public String getPlayerInfo(){
        return this.name + " " + this.age + " " + this.position + " " + this.team.getName();
    }
}
