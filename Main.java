public class Main{
public static void main(String[] args){
System.out.println("Hello World!");
System.out.println("Hello Java!");
System.out.println(5 + 2);
System.out.print(2); //改行されない
System.out.print(2);

double number = 2.5;
System.out.println(number);

    String name = "a";
    
    // 変数ageに、好きな年齢を代入してください
    int age = 2;
    
    // 変数heightに、好きな身長を代入してください（例: 1.2）
    double height = 180.8;
    
    // 変数weightに、好きな体重を代入してください（例: 20.0）
    double weight = 30.0;
    
    // 変数bmiに、BMIを計算して代入してください
    double BMI = weight / height / height;
    
    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は"+age + "歳です");
    System.out.println("身長は"+height + "mです" );
    System.out.println("体重は"+weight+"kgです");
    System.out.println("BMIは"+BMI+"です");
    
    //配列
    String[] languages ={"Ruby", "PHP", "Python"};
    System.out.println(languages[1]);
    languages[1] = "Java";
    System.out.println(languages[1]);
    
    //拡張for文
    String[] names = {"A", "B", "C"};
    for(String name: names){
      System.out.println("私の名前は"+name+"です");
    }
}
} 
