/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

/**
 *
 * @author Estudiante
 */
public class Cash implements Asset {
    private int amount;
    public double getMarketValue(){
        return this.amount;
    }
public double getProfit(){
    return 0;
}
}
