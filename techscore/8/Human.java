public class Human {
  private String name = null; // �C���X�^���X�ϐ�
  private int age = -1; // �C���X�^���X�ϐ�
  private static int NUM_EYE = 2; // �N���X�ϐ�

  public String getName(){
    return name; // this.name�Ƃ��Ă��悢
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
    return "���O��" + name + "����ł��B�N��" + age + "�΂ł��B";
  }
}
