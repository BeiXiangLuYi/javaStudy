package JanStudy;

import java.time.LocalDate;

public class Day {
    private LocalDate ld;
    private boolean situation;

    public Day() {
    }

    public Day(LocalDate ld) {
        this.ld = ld;
    }

    public Day(boolean situation) {
        this.situation = situation;
    }

    public Day(LocalDate ld, boolean situation) {
        this.ld = ld;
        this.situation = situation;
    }

    public LocalDate getLd() {
        return ld;
    }

    public void setLd(LocalDate ld) {
        this.ld = ld;
    }

    public boolean isSituation() {
        return situation;
    }

    public void setSituation(boolean situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "日期:"+ld +
                ", 休息情况:" + situation ;
    }
}
