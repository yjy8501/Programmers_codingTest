package Programmers;

import java.util.HashMap;

public class Hash_map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Solution {
		    public String solution(String[] participant, String[] completion) {
		        String answer = "";

		        // 해시맵 선언
		        HashMap<String, Integer> hm = new HashMap<String, Integer>();

		        // 참가자 선수 입력
		        for( String people : participant  ) {

		        	if( hm.containsKey(people) == true ) {
		        		hm.put(people, hm.get(people) + 1);
		        	}
		        	else{
		        		hm.put(people, 1);
		        	}
		        }

		        // 완주자 선수 비교
		        for( String people : completion  ) {
		        	hm.put(people, hm.get(people) - 1);
		        }

		        // 완주하지 못한 선수 솎아내기
		        for(String i : hm.keySet()){ //저장된 key값 확인
		            if(hm.get(i) != 0) {
		            	answer = i;
		            }
		        }

		        return answer;
		    }
		}

	}

}
