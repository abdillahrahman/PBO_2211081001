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
public class MyDouble implements Relation {
    public boolean isGreater(Object a, Object b){
        return ((double) a > (double)b);
    }
    public boolean isLess(Object a, Object b){
        return ((double) a < (double)b);
    }
    public boolean isEqual(Object a, Object b){
        return ((double) a == (double)b);
    }
}
