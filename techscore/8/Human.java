public class Human {
  private String name = null; // インスタンス変数
  private int age = -1; // インスタンス変数
  private static int NUM_EYE = 2; // クラス変数

  public String getName(){
    return name; // this.nameとしてもよい
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String toString(){
    return "名前は" + name + "さんです。年は" + age + "歳です。";
  }
}
