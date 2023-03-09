public class q011{
  public static void main(String[] args){
  
  int loop = 8;  // 繰り返しの数
  
  for (int i = 0; i < loop; i++) {    // 行ループ
    for (int j = 8-i; 1< j; j--) {    // 列ループ
      System.out.print("■.");
    }
    System.out.println(); // 列ループが終われば改行
  }
  
  }
}