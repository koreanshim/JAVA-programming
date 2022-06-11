package sec05.exam01_treeset;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args){
        TreeSet<Integer> scores = new TreeSet<Integer>();
        //scores.add(new Integer(87));
        scores.add(Integer.valueOf(87));
        //scores.add(new Integer(98));
        scores.add(Integer.valueOf(98));
        scores.add(Integer.valueOf("75"));
        scores.add(Integer.valueOf(95));
        scores.add(80);

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수: " + score);
        score = scores.last();
        System.out.println("가장 높은 점수: " + score + "\n");
        score = scores.higher(Integer.valueOf(95));
        System.out.println("95점 아래 점수: " + score);
        score = scores.lower(Integer.valueOf(95));
        System.out.println("95 위의 점수: " + score + "\n");
        score = scores.floor(Integer.valueOf(95));
        System.out.println("95 이하의 점수: " + score);
        score = scores.ceiling(Integer.valueOf(85));
        System.out.println("85점 이상의 점수: " + score + "\n");

        while(!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
        }
    }

}
