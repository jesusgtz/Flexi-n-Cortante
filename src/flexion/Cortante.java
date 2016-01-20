
package flexion;

/**
 *
 * @author jesusgtz
 */
public class Cortante {
    //Atributos
    private float Vd;
    private double Uu;
    private String Smax;
    private float As;
    private double Vc;
    private String secc;
    private String E;
    private double I3;
    private double I4;
    private double I5;
    private double Eval;
    private Flexion f;
    
    /**
     * Constructor
     * @param Vd
     * @param As
     * @param f 
     */
    public Cortante(float Vd, float As, Flexion f) {
        this.f = f;
        this.Vd = Vd;
        this.Uu = Vd*f.U/(0.85*f.b*f.d)-Math.sqrt(f.fc)*0.53;
        this.Smax = calcSmax(this.Uu);
        this.As = As;
        this.Vc = (0.53*Math.sqrt(f.fc)*f.b*f.d*0.85)/f.U;
        this.secc = calcSecc(this.Uu);
        this.E = calcE(As);
        this.I3 = calcI3(Vd, Uu, As,f);
        this.I4 = calcI4(Uu, f);
        this.I5 = calcI5(this.I3);
        this.Eval = calcEval(Uu, I4, I5);
    }
    
    /**
     * Funcion para calcular la cadena Smax
     * @param Uu
     * @return Smax
     */
    private String calcSmax(double Uu) {
        if(Uu<0) {
            return "d";
        } else if(Uu < Math.sqrt(f.fc)) {
            return "d/2";
        } else return "d/4";
    }
    
    /**
     * Funcion para calcular la cadena seccion
     * @param Uu
     * @return 
     */
    private String calcSecc(double Uu) {
        if(Uu>29.7) {
            return "Cambiar seccion";
        } else return "Seccion correcta";
    }
    
    /**
     * Funcion para calcular la etiqueta de la seccion
     * @param As
     * @return 
     */
    private String calcE(float As) {
        if(As == (float)0.71) {
            return "E#3@";
        } else if(As == (float)1.27) {
            return "E#4@";
        } else if(As == (float)1.98) {
            return "E#5@";
        } else if(As == (float)2.54) {
            return "(4 ramas)E#4@";
        } else if(As == (float)1.42) {
            return "(4 ramas)E#3@";
        } else if(As == (float)3.96) {
            return "(4 ramas)E#5@";
        } else return "E#6@";
    }
    
    /**
     * Funcion para calcular el valor auxiliar I3
     * @param Vd
     * @param Uu
     * @param As
     * @param f
     * @return 
     */
    private double calcI3(float Vd, double Uu, float As, Flexion f) {
        if(Uu<0) {
            return f.d;
        } else 
            return (2*As*f.Fy/((Vd*f.U/(0.85*f.b*f.d)-0.53*Math.sqrt(f.fc))*f.b));
    }
    
    /**
     * Funcion para calcular el valor auxiliar I4
     * @param Uu
     * @param f
     * @return 
     */
    private double calcI4(double Uu, Flexion f) {
        if(Uu>14.14) {
            return f.d/4;
        } else return f.d/2;
    }
    
    /**
     * Funcion para calcular el valor auxiliar I5
     * @param I3
     * @return 
     */
    private double calcI5(double I3) {
        if(I3>45) {
            return 45;
        } else return I3;
    }
    
    /**
     * Funcion para calcular el valor a evaluar
     * @param Uu
     * @param I4
     * @param I5
     * @return 
     */
    private double calcEval(double Uu, double I4, double I5) {
        if(Uu<0) {
            return I5;
        } else if(I4<I5) {
            return I4;
        } else return I5;
    }
    
    
        // Getters and Setters
    
    public float getVd() {
        return Vd;
    }

    public void setVd(float Vd) {
        this.Vd = Vd;
    }

    public double getUu() {
        return Uu;
    }

    public void setUu(double Uu) {
        this.Uu = Uu;
    }

    public String getSmax() {
        return Smax;
    }

    public void setSmax(String Smax) {
        this.Smax = Smax;
    }

    public float getAs() {
        return As;
    }

    public void setAs(float As) {
        this.As = As;
    }

    public double getVc() {
        return Vc;
    }

    public void setVc(double Vc) {
        this.Vc = Vc;
    }

    public String getSecc() {
        return secc;
    }

    public void setSecc(String secc) {
        this.secc = secc;
    }

    public String getE() {
        return E;
    }

    public void setE(String E) {
        this.E = E;
    }

    public double getI3() {
        return I3;
    }

    public void setI3(double I3) {
        this.I3 = I3;
    }

    public double getI4() {
        return I4;
    }

    public void setI4(double I4) {
        this.I4 = I4;
    }

    public double getI5() {
        return I5;
    }

    public void setI5(double I5) {
        this.I5 = I5;
    }

    public double getEval() {
        return Eval;
    }

    public void setEval(double Eval) {
        this.Eval = Eval;
    }

    public Flexion getF() {
        return f;
    }

    public void setF(Flexion f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "Cortante{" + "Vd=" + Vd + ", Uu=" + Uu + ", Smax=" + Smax + ", As=" + As + ", Vc=" + Vc + ", secc=" + secc + ", E=" + E + ", I3=" + I3 + ", I4=" + I4 + ", I5=" + I5 + ", Eval=" + Eval + ", f=" + f + '}';
    }
    
}
