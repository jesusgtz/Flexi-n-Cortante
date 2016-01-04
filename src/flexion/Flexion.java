/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexion;

/**
 *
 * @author jesus
 */
public class Flexion {
    
    //Atributos
    public float Mo;
    public float h; 
    public float d; 
    public float b; 
    public float U;
    public float fc;
    public float Fy = 4200;
    public double As;
    public double xivFy;
    public double AsT;
    public double Fductil;
    public double dMo;
    
    /**
     * Constructor
     * @param Mo 
     * @param h
     * @param d
     * @param b
     * @param U
     * @param fc 
     */
    public Flexion(float Mo, float h, float d, float b, float U, float fc) {
        this.Mo = Mo;
        this.h = h;
        this.d = d;
        this.b = b;
        this.U = U;
        this.fc = fc;
        this.As = b*d/(Fy/(0.85*fc))-Math.sqrt(Math.pow(b*d/((Fy/(0.85*fc))),2)-2*Mo*100*U*b/(0.9*(Fy/(0.85*fc)*Fy)));
        this.xivFy = 14.5*b*d/this.Fy;
        this.AsT = 0.002*b*h;
        this.Fductil = As/(b*d);
        this.dMo = Math.sqrt(Mo*100*U/(0.9*51.29*b));
    }
    
    /**
     * Constructor por defecto
     */
    public Flexion() {
    }
    
    /**
     * Getters and Setters
     */
    public float getMo() {
        return Mo;
    }

    public void setMo(float Mo) {
        this.Mo = Mo;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getU() {
        return U;
    }

    public void setU(float U) {
        this.U = U;
    }

    public float getFc() {
        return fc;
    }

    public void setFc(float fc) {
        this.fc = fc;
    }

    public float getFy() {
        return Fy;
    }

    public void setFy(float Fy) {
        this.Fy = Fy;
    }

    public double getAs() {
        return As;
    }

    public void setAs(float As) {
        this.As = As;
    }

    public double getXivFy() {
        return xivFy;
    }

    public void setXivFy(float xivFy) {
        this.xivFy = xivFy;
    }

    public double getAsT() {
        return AsT;
    }

    public void setAsT(float AsT) {
        this.AsT = AsT;
    }

    public double getFductil() {
        return Fductil;
    }

    public void setFductil(float Fductil) {
        this.Fductil = Fductil;
    }

    public double getdMo() {
        return dMo;
    }

    public void setdMo(float dMo) {
        this.dMo = dMo;
    }
 
}
