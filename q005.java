public class q005{
  public static void main(String[] args){
  
  // 自分のコード
  int n =5;
  for(int i=1 ; i<=n ; i++){
    for(int j=1 ; j<=n ; j++){
      System.out.print("★");
    }
    System.out.println();
  }
  
  System.out.println();
  
  // 回答例
  int row = 5; //行ループ
  int col = 5; //列ループ
  
  for(int i=1 ;i<=row ; i++){
    for(int j=1 ;j <= col;j++){
     System.out.print("●");
     }
     System.out.println();
    }
  }
}