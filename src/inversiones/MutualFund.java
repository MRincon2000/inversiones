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
public class MutualFund extends ShareAsset{
private double totalShares;
public double getMarketValue(){
    return this.totalShares*this.currentPrice;
}
public double getProfit(){
    return this.totalShares*this.currentPrice-this.totalCost;
}    
}
