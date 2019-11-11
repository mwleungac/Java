package model;
import model.Student;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class print {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ariel");
        student.setAge(18);
        student.setGender("female");
        student.setStudentNumber(123456);
        System.out.println("name: " + student.getName()+", "+"age: "+student.getAge()+", gender: "+ student.getGender()+", student id: " +student.getStudentNumber());

    }
}
