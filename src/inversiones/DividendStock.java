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
public class DividendStock extends Stock{
    private double dividends;
    public double getMarketValue(){
        return this.totalShares*this.currentPrice+this.dividends;
    }
}
