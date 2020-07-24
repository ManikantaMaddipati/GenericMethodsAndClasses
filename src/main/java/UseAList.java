import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseAList {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("KING");
        names.add("Queen");
        //Observation1 : This List can take anything;
        names.add(LocalDate.now());

        //Observation 2 : Explicit casting is needed.
        String s = (String) names.get(0);

        for (Object o: names) {
            System.out.println(o);
        }

    }


}
