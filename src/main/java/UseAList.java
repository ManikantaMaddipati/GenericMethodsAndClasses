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

        for (Object o: names) {
            System.out.println(o);
        }

    }


}
