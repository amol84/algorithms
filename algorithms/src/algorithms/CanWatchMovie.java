package algorithms;

import java.util.HashSet;

public class CanWatchMovie {

    public boolean canWatchMovie(int[] movieLengths, int flightduration) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int firstMovieLength : movieLengths){
            int secondmovieExpected = flightduration-firstMovieLength;
            if(set.contains(secondmovieExpected)){
                return true;
            }
            set.add(firstMovieLength);
        }
        return false;
    }
}

