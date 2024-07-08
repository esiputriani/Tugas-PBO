/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2301081005.p080624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class BukuDao {
    private List<Buku> data = new ArrayList<>();
    
     public BukuDao(){
        data.add(new Buku("A001","Cahaya ilahi","Agnes","Falcon Publising",2004));
        data.add(new Buku("A002","Mariene","Risa Saraswati","Buku KU",2013));
    }
    
     public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){ // Corrected the method signature
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll() { // Added method to retrieve all data
        return data;
    }
}
