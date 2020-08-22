package solitaire.entity;

public class Player implements Comparable<Player>{
    int score;
    int move;
    String name;
    
    public Player() {
    
    }
 
    public Player(int score,int move,String name) {
     this.score = score;
     this.move= move;
     this.name=name;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.score != other.score) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Player o) {
        return this.score -  o.score;
    }

    @Override
    public String toString() {
        return "Score:" + score + "Move:"+ move +"Name :"+ name;
    }

    
    
}
