package football;

public class Match{
    Team team1;
    Team team2;
    int score1;
    int score2;
    Team winner;
    public Match(Team team1, Team team2, int score1, int score2, Team winner){
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.winner = winner;
    }
    public Team getTeam1(){
        return this.team1;
    }
    public void setTeam1(Team team1){
        this.team1 = team1;
    }
    public Team getTeam2(){
        return this.team2;
    }
    public void setTeam2(Team team2){
        this.team2 = team2;
    }
    public int getScore1(){
        return this.score1;
    }
    public void setScore1(int score1){
        this.score1 = score1;
    }
    public int getScore2(){
        return this.score2;
    }
    public void setScore2(int score2){
        this.score2 = score2;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }
    public String getMatchInfo(){
//        return this.team1.getName() + " " + this.team2.getName()+ " " + this.score1 + " " + this.score2 + " " + this.winner.getName();
        return String.format("%s : %d, %s : %d, %s", this.team1.getName(), this.score1, this.team2.getName(), this.score2, this.winner.getName());
    }
}