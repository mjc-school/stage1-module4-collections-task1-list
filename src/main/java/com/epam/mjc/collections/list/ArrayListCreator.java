package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList <String> answer=new ArrayList<>();
        for (int i =2;i<sourceList.size();i=i+3){
            answer.add(sourceList.get(i));
            answer.add(sourceList.get(i));
        }
        return  answer;
    }
}
