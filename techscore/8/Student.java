public class Student extends Human { // �����Human�N���X���p��
  private String school = null; // �C���X�^���X�ϐ�

  public String getSchool(){
    return school;
  }
  public void setSchool(String school){
    this.school = school;
  }

  public String toString() { // �I�[�o�[���C�h�ɂ�鏑������
    return "���O��" + getName() + "����ł��B�N��" + getAge() + "�΂ł��B�w�Z��" + school + "�ł��B";
  }
}
