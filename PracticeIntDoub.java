public class PracticeIntDoub {
   public static void main(String[] args) {
      String numM = "14";
      String numN = "32";
      int numO = 4;
      int numP = 5;
      double numQ = 3;
      double numR = 2;
      int totalA = numO - numP;
      System.out.println(totalA);     // Answer ; -1
      double totalB = numQ + numP*2;
      System.out.println(totalB);  // Answer ; 13.0
      String totalC = numR + numP + numN;
      System.out.println(totalC);  // Answer ; 7.032
      double totalD = numP + numR;
      System.out.println(totalD); // Answer ; We will get an error with int totalD cause numR is a double and has more storage than int so if we write double totalD we will get the answer 7.0.
      String totalE = numQ + numO + numM;
      System.out.println(totalE); // Answer ; 7.014
      String totalF = numN + numO + numP;
      System.out.println(totalF);   // Answer ; 3245
      int totalG = numP/numO;
      System.out.println(totalG);  //Answer ; 1 as int/int = 1
      double totalH = numP/numO;
      System.out.println(totalH); // Answer 1.0
      
      int i = -8;
      int j = 3;
      int k = i/j;
      System.out.println(k); // Answer -2

      int m = 5 + i/j;
      System.out.println(m); // answer ; 3

      String bla = numO + numP + numM + numQ + i;
      System.out.println(bla); //Answer ; 9143.0-8

   }
}
