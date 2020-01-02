package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;//poprawione

    int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) //poprawione
            totalRejected++;
        else //poprawione
            super.countIn(in); //poprawione
    }
}

//W Eclipse kombinacja tych klawiszy (alt+strzałka lewo/prawo) przechodzi odpowiednio do poprzedniego lub następnego słowa. W Intellij odpowiednikiem alt + strzałka jest ctrl + strzałka.