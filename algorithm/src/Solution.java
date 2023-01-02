import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution_Hash {
	
	// 1. 문제 단순화 하기
	// 두 배열의 값을 비교하여 없는 값 1개를 찾으면 된다.
	
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(); // 해쉬 맵을 제작한다. 
        
        for (String player : participant) // 해쉬 맵에 배열크기 만큼 해쉬 맵에 데이터를 넣는다.
        	
        	map.put(player, map.getOrDefault(player, 0) + 1); // 해쉬 맵 key에 참가자 명을 넣고, value에 
        	// key값이 있다 -> 동명이인이 있다. 그 수에 + 1을 한다. 
        	// 없다 -> 0을 반환한다. -> + 1한다. 
        	// 동명이인 = 2, 사람 = 1
        	
        
        
        for (String player : completion) 
            map.put(player, map.get(player) - 1);
        
        	// 달성자는 -1을 해준다 
        	// 완주자 = 0, 동명이인 1<=, 완주못함 = 1
        	// 이때 동명이인이 3명이면 어떻게 해결하죠 ??
        
        for (int i = 0; i < map.size(); i++) {
			
        	
        	
		}
        

//            Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
//
//        while(iter.hasNext()){
//            Map.Entry<String, Integer> entry = iter.next();
//            if (entry.getValue() != 0){
//                answer = entry.getKey();
//                break;
//            }
//        }
        return answer;
    }
    
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution_Hash sol = new Solution_Hash();
        System.out.println(sol.solution(part, comp));
    }
}