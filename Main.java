import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> a = new ArrayList<>();
        a.add(9);
        a.add(9);
        a.add(9);
        a.add(7);
        a.add(9);

        ArrayList<Integer> b = new ArrayList<>();

        b.add(9);
        b.add(9);
        b.add(9);
        b.add(9);
        b.add(9);
        b.add(5);
        b.add(8);
        b.add(6);


        System.out.println(result(a,b));
    }

    public static ArrayList<Integer> result(ArrayList<Integer> a, ArrayList<Integer> b){
        int[] res = new int[Math.max(a.size()+3, b.size()+3)];

        Collections.reverse(a);
        Collections.reverse(b);

        for (int i = 0; i < a.size(); i++) {
            res[i] = a.get(i);
        }
        for (int i = 0; i < b.size(); i++) {
            res[i]+= b.get(i);
        }


        for (int i = 0; i < res.length; i++) {
            if(res[i] >= 10){
                res[i] %= 10;
                res[i+1]++;
            }
        }


        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            ret.add(res[i]);
        }

        Collections.reverse(ret);

        while(ret.get(0) == 0){
            ret.remove(0);
        }

        return ret;

    }
}
