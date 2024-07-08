/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081005.p270424;

/**
 *
 * @author hp
 */
public class Luas implements Relation {
    private double p;
    private double l;
    
    public Luas(){
        
    }
    public Luas(double p, double l){
        this.p = p;
        this.l = l;
        
    }
    public double getLuas(){
        double luas = p * l;
        return luas;
    }
    public boolean isGreater( Object a, Object b){
        double aLuas = ((Luas)a).getLuas();
        double bLuas = ((Luas)b).getLuas();
        return (aLuas > bLuas);
    }
    public boolean isLess( Object a, Object b){
        double aLuas = ((Luas)a).getLuas();
        double bLuas= ((Luas)b).getLuas();
        return (aLuas < bLuas);
    }
    public boolean isEqual( Object a, Object b){
        double aLuas = ((Luas)a).getLuas();
        double bLuas= ((Luas)b).getLuas();
        return (aLuas == bLuas);
    }
    
    
    
    
}
