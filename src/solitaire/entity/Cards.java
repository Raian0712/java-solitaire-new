package solitaire.entity;

import java.util.Objects;

public class Cards {
    private int number;

    public Cards(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        final Cards other = (Cards) obj;
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cards{" + "number=" + number + '}';
    }
    
    
}
