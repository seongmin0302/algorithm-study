package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.HashMap;

public class _10_출석체크 {
    public static void main(String[] args) {
        System.out.println("test1: ");
        // 정답 = 지효, 나연, 미나, 정연
        String[] allStudents = {"나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위"};
        String[] presentStudents = {"모모", "채영", "쯔위", "사나", "다현"};
        getAbsentStudent(allStudents, presentStudents);
        
        System.out.println();
        System.out.println("test2: ");
        // 정답 = 예지 
        getAbsentStudent(new String[]{"류진","예지","채령","리아","유나"}, new String[]{"리아","류진","채령","유나"});
        
        System.out.println();
        System.out.println("test3: ");
        // 정답 = RM 
        getAbsentStudent(new String[]{"정국","진","뷔","슈가","지민","RM"}, new String[]{"뷔","정국","지민","진","슈가"});

        System.out.println();
        System.out.println("test4: ");
        // 정답 = RM, 진, 슈가
        getAbsentStudent(new String[]{"정국","진","뷔","슈가","지민","RM"}, new String[]{"뷔","정국","지민"});
    }

    public static void getAbsentStudent(String[] allStudents, String[] presentStudents) {
        HashMap<String,Boolean> map= new HashMap<String,Boolean>();

        for(String student:allStudents) {
            map.put(student,true);
        }

        for(String presentStudent:presentStudents) {
            map.remove(presentStudent);
        }

        System.out.println(map);
        for(String notPresentStudnet:map.keySet()) {
            System.out.println(notPresentStudnet);
        }

    }
}
