public class kadai1{
  public static void main(String[] args){
    //課題1-1 1から100までの整数をすべて足す
    //繰り返し100まで 
    int loopCount = 100;
     //初期値
    int num = 0;
    
    for(int i= 1;i <= loopCount ; i++ ){
      num += i;
    }
    System.out.println(num);
    
    // 課題1-2 2から100までの偶数のみを足す
    //初期値
    int evenNum = 0;
    
    for(int i= 1; i <= loopCount ; i++){
      if(i % 2 == 0){
        evenNum += i ;
    }
    }
    System.out.println(evenNum);
  }
}