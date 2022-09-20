package haskMap;

public class Student {
private String name;
private int age;
private String qualification;
private long adharNo;
public Student(String name,int age,String qualification,long adharNo) {
	this.name=name;
	this.age=age;
	this.qualification=qualification;
	this.adharNo=adharNo;
}
public String toString() {
	return name+" "+age+" "+qualification+" "+adharNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public long getAdharNo() {
	return adharNo;
}
public void setAdharNo(long adharNo) {
	this.adharNo = adharNo;
}
}
