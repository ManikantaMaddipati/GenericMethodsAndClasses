import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseAList {
    public static void main(String[] args) {
        //By telling compiler that we are going to add only string
        List<String> names = new ArrayList();
        names.add("KING");
        names.add("Queen");
        //Observation1 : This List can take anything;
        //Observation3 : Now compilation error is thrown
        //names.add(LocalDate.now());
        breakList(names);

        //Observation 2 : Explicit casting is needed.
        //Observation 4 : and no explicit casting is needed.
        String s = names.get(0); // Observation 5 : implicit casting is present

        List<LocalDate> localDates =  new ArrayList();
        localDates.add(LocalDate.now());

        for (Object o: names) {
            System.out.println(o);
        }

    }

    //Observation 5:Generic Type is Missing in parameter section but list names is accepting LocalDate
    private static void breakList(List names) {
        names.add(LocalDate.now());
    }

    //Do generic Classes on our Own.



}
