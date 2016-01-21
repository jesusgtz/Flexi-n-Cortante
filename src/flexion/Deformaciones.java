
package flexion;

/**
 *
 * @author jesusgtz
 */
public class Deformaciones {
    
    //Atributos
    Flexion f;
    float y;
    double ins;
    float L;
    double insMo;
    double P;
    
    /**
     * Constructor
     * @param f
     * @param y
     * @param L 
     */
    public Deformaciones(Flexion f, float y, float L) {
        this.f = f;
        this.y = y;
        this.L = L;
        this.ins = y/(f.b*Math.pow(f.h, (double)3)/12*14946*Math.sqrt(f.fc))*1000000;
        this.insMo = (f.Mo*100*Math.pow((double)L*100,(double)2))/(9.6*14946*Math.sqrt(f.fc)*f.b*Math.pow((double)f.h,(double)3)/12);
        this.P = L*100/240;
    }
    
    /**
     * Funcion para volver a calcular los valores después de editar algún 
     * atributo
     */
    public void recalculate() {
        this.ins = y/(f.b*Math.pow(f.h, (double)3)/12*14946*Math.sqrt(f.fc))*1000000;
        this.insMo = (f.Mo*100*Math.pow((double)L*100,(double)2))/(9.6*14946*Math.sqrt(f.fc)*f.b*Math.pow((double)f.h,(double)3)/12);
        this.P = L*100/240;
    }

    @Override
    public String toString() {
        return "Deformaciones{" + "f=" + f + ", y=" + y + ", ins=" + ins + ", L=" + L + ", insMo=" + insMo + ", P=" + P + '}';
    }
    
    
    //Getters and Setters

    public Flexion getF() {
        return f;
    }

    public void setF(Flexion f) {
        this.f = f;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double getIns() {
        return ins;
    }

    public void setIns(double ins) {
        this.ins = ins;
    }

    public float getL() {
        return L;
    }

    public void setL(float L) {
        this.L = L;
    }

    public double getInsMo() {
        return insMo;
    }

    public void setInsMo(double insMo) {
        this.insMo = insMo;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }
    
}
