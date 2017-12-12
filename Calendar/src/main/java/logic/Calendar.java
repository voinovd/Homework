package logic;

import java.util.*;

public class Calendar {
    private Map<String, Integer> months = new HashMap();
    private Set<Integer> days = new HashSet();
    private Map<String, Set<Integer > > calendarMap = new HashMap();

    public Map<String, Set<Integer> > calendarMapCreator(){
        months = monthCreator();
        Map<String, Set<Integer> > temp = new HashMap<>();

        for (String month: months.keySet()) {

            Set<Integer> days = daysCreator(months.get(month));
            temp.put(month,days);

        }
        return temp;
    }

    private Set<Integer> daysCreator(Integer daysAmount) {
        Set<Integer> temp = new HashSet();
        for(int dayNumber = 1; dayNumber <= daysAmount; dayNumber++){
            temp.add(dayNumber);
        }
        return temp;
    }

    private Map<String, Integer> monthCreator(){
        Map<String, Integer> temp = new HashMap<>();
        temp.put("January", 31);
        temp.put("February", 28);
        temp.put("March", 31);
        temp.put("April", 30);
        temp.put("May", 31);
        temp.put("June", 30);
        temp.put("Jule", 31);
        temp.put("August", 31);
        temp.put("September", 30);
        temp.put("October", 31);
        temp.put("November", 30);
        temp.put("December", 31);
        return temp;
    }


}
