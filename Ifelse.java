public class Ifelse {
    public static void main(String[] args) {
      int num[] = {1, 4, 89, 92, 54};

      for(int i=0; i<num.length; i++){
       System.out.println(num[i]);
      }

      if(num[0]>num[1] && num[0]>num[2] && num[0]>num[3] && num[0]>num[4]){
        System.out.println(num[0] + " is greatest among the array");
    }

    else if(num[1]>num[0] && num[1]>num[2] && num[1]>num[3] && num[1]>num[4]){
        System.out.println(num[1] + " is Greatest among the array");
    }

    else if(num[2]>num[0] && num[2]>num[1] && num[2]>num[3] && num[2]>num[4]){
        System.out.println(num[2] + " is Greatest among the array");
    }

    else if(num[3]>num[0] && num[3]>num[1] && num[3]>num[2] && num[3]>num[4]){
        System.out.println(num[3] + " is Greatest among the array");
    }

    else{
        System.out.println(num[4] + " is Greatest among the array");
    }

    }
}
