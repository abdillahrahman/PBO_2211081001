/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdi130423;

/**
 *
 * @author LABP1KOMP
 */
public class MyInteger implements Relation {
    public boolean isGreater(Object a, Object b){
        return ((int) a > (int)b);
    }
    public boolean isLess(Object a, Object b){
        return ((int) a < (int)b);
    }
    public boolean isEqual(Object a, Object b){
        return ((int) a == (int)b);
    }
}