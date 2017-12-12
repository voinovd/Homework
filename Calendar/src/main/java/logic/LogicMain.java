package logic;

import java.util.Map;
import java.util.Set;

public class LogicMain {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Map<String, Set<Integer>> stringSetMap = calendar.calendarMapCreator();
        //System.out.println(stringSetMap.size());
        for (Map.Entry<String, Set<Integer>> entry : stringSetMap.entrySet())
        {
            System.out.println(entry.getKey());
            for (Integer day:entry.getValue()) {
                System.out.print(", " + day);
            }
            System.out.println();
        }


    }
}
