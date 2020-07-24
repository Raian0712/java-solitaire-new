package solitaire.entity;

import java.util.Objects;

public class Cards {
    private String number;
    private String suite;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
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
        if (!Objects.equals(this.suite, other.suite)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cards{" + "number=" + number + ", suite=" + suite + '}';
    }
    
    
}
