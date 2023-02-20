public class test{
  public static void main(String[] args){
  
    for(int i=9 ;i >= 1;i--){
     switch(i){
        case 9:
        System.out.println("*********");
        break;
        case 7:
        System.out.println(" "+"*******");
        break;
        case 5:
        System.out.println("  "+"*****");
        break;
        case 3:
        System.out.println("   "+"***");
        break;
        case 1:
        System.out.println("    "+"*");
        break;
      }
    }
    
    for(int i = 0;i < 5 ;i++){
      for(int j =0; j < i ;j++){
        System.out.print("a");
      }
      for(int k= 0;k< 2*(5-i)-1;k++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}