public class q013{
  public static void main(String[] args){
  
  int loop = 8;  // 繰り返しの数
  
  for (int i = 0; i < loop; i++) {    // 行ループ
    for (int j = 0 ; j< loop; j++) {    // 列ループ
      int x = i + j; 
      if(x == 7){
        System.out.print("■.");
        break; // breakを入れることでその時点でループが終了する。
      }else{
        System.out.print("　");
      }
    }
    System.out.println(); // 列ループが終われば改行
  }
  }
}

//模範解答
// if文の中を(j == loop - i - 1)にする。