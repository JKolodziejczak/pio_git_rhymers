package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa zwraca konkretne instancje klas dzidziczących z DefaultCountingOutRhymer
 */

public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * @return odpowiada za zwrócenie nowej instancji klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return odpowiada za zwrócenie nowej instancji klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return odpowiada za zwrócenie nowej instancji klasy FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * @return odpowiada za zwrócenie nowej instancji klasy HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
