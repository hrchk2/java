public class q009{
  public static void main(String[] args){
  
  int row = 6;  // 行（縦方向）の数
  int col = 10;  // 列（横方向）の数
        
  for (int i = 0; i < row; i++) {    // 行ループ
    if(i % 2 == 0){
      for(int j = 0;j < col;j++){
        if(j % 2 == 0){
          System.out.print("■");
        }else{
          System.out.print("　");
        }
      }
    }else{
      for(int j2 = 0; j2 < col; j2++){
        if(j2 % 2 == 0){
          System.out.print("　");
        }else{
          System.out.print("■");
        }
      }
      
    }
    System.out.println(); // 列ループが終われば改行
  }
  }
}