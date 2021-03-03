package com.company;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
public class ListToMap {
    public static void main(String[] args) {
        Employee e1=new Employee("Ram",35);
        Employee e2=new Employee("Mohan",30);
        Employee e3=new Employee("Shashi",40);
        l.add(e1);
        l.add(e2);
        l.add(e3);
        TreeMap<String,Employee> t=new TreeMap<String,Employee>();
        int i=101;
        for(Employee e:l){
            String empid=""+(i);
            t.put(empid,e);
            i++;
        }
        Set<String> s=t.keySet();
        for(String key:s){
            System.out.println("Empid:"+key+" "+t.get(key));
        }


    }
}
