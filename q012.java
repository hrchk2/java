public class q012{
  public static void main(String[] args){
  
  int loop = 8;  // 繰り返しの数
  
  for (int i = 0; i < loop; i++) {    // 行ループ
    for (int j = 0 ; j< loop; j++) {    // 列ループ
      if(i == j){
        System.out.print("■.");
      }else{
        System.out.print("　");
      }
    }
    System.out.println(); // 列ループが終われば改行
  }
  }
}