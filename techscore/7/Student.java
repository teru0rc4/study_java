public class Student extends Human { // これでHumanクラスを継承
  private String school = null; // インスタンス変数

  public String getSchool(){
    return school;
  }
  public void setSchool(String school){
    this.school = school;
  }

  public String toString() { // オーバーライドによる書き換え
    return "名前は" + getName() + "さんです。年は" + getAge() + "歳です。学校は" + school + "です。";
  }
}
