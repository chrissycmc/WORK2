package package2;

import javax.xml.namespace.QName;

public class Dept {
 int DeptCode;
 String DeptName;

 public Dept(int DeptCode,String DeptName){
     this.DeptCode= DeptCode;
     this.DeptName=DeptName;
 }
public void displayDeptInfo(){
    System.out.println("The department name:"+ DeptName);
    System.out.println("The department name:"+ DeptCode);
}
}

