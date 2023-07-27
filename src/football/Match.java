package football;

public class Match{
    Object team1;
    Object team2;
    int score1;
    int score2;
    Object winner;
    public Match(Object team1, Object team2, int score1, int score2, Object winner){
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.winner = winner;
    }
    public Object getTeam1(){
        return this.team1;
    }
    public void setTeam1(Object team1){
        this.team1 = team1;
    }
    public Object getTeam2(){
        return this.team2;
    }
    public void setTeam2(Object team2){
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

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }
}