public class kadai1{
  public static void main(String[] args){
    //課題1-1 1から100までの整数を全て足す
    //繰り返し100まで
    int loopCount = 100;
     //初期値
    int sum = 0;

    for(int i= 1;i <= loopCount ; i++ ){
      sum += i;
    }
    System.out.println("1から100までを全て足すと" + sum + "になります。");

    // 課題1-2 2から100までの偶数のみを足す
    //初期値
    int evenSum = 0;

    for(int i= 1; i <= loopCount ; i++){
      if(i % 2 == 0){
        evenSum += i ;
      }
    }
    System.out.println("2から100までの偶数を全て足すと" + evenSum + "になります。");
  }
}