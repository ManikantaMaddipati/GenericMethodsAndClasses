package shopping;

import java.time.LocalDate;

public class UserPair {
    public static void main(String[] args) {

        //Observation 7:
        //Pair pair = new Pair("String", LocalDate.now());

        //Observation 8:
        //Pair<String> pair = new Pair("String", LocalDate.now());

        //Observation 9:

        //Now Below statement is getting Complication because string is not having getSize();
        Pair<String> pair = new Pair<String>("String", "String");

    }
}
