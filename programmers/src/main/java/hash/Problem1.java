package hash;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "mislav", "ana"};

        String playerName = solution(participant, completion);
        System.out.println(playerName);
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String playerName : participant) {
            participantMap.compute(playerName, (s, integer) -> {
                if (participantMap.containsKey(s)) {
                    return participantMap.get(s) + 1;
                }
                return 1;
            });
        }

        for (String playerName : completion) {
            if (participantMap.containsKey(playerName)) {
                int count = participantMap.get(playerName);
                if (count > 1) {
                    participantMap.put(playerName, count-1);
                } else {
                    participantMap.remove(playerName);
                }
            }
        }

        return participantMap.entrySet().iterator().next().getKey();
    }
}
