package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник
public class Directory <E extends Employee>{
    private List<E> list = new LinkedList<>();
    private int size= 0;

    public Directory add(E el){
        list.add(el);
        this.size++;
        return this;
    }
    public List<E> findByExp(int experience){
        if(size==0){
            return null;
        }
        List<E> res = new ArrayList<>();
        for (E el:list) {
            if(el.getExperienceMonth()==experience){
                res.add(el);
            }
        }
        return res;
    }
    public List<String> findPhoneByName(String name){
        if(size==0){
            return null;
        }
        List<String> res = new ArrayList<>();
        for (E el:list) {
            if(el.getName().equals(name)){
                res.add(el.getPhone());
            }
        }
        return res;
    }
    public E findByTabNumber(int number){
        if(size==0){
            return null;
        }
        for (E el:list) {
            if(el.getTabNumber()==number){
                return el;
            }
        }
        return null;
    }
}
