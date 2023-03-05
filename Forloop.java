public class Forloop {
    public static void main(String[] args) {
        String[] str = {"India", "Australia", "korea", "England", "Srilanka", "Pakistan", "NewZealand", "Bangladesh", "Italy", "UAE"};
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }

        System.out.println();

    }
}
