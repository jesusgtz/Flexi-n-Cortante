package flexion;

/**
 *
 * @author jesus
 */
public class AceroEnCompresion {
    //Atributos
    public float r;
    public double Aps;
    public double As;
    public Flexion f;
    
    /**
     * Constructor
     * @param r
     * @param f 
     */
    public AceroEnCompresion(float r, Flexion f) {
        this.r = r;
        this.f = f;
        this.Aps = (f.Mo*100*f.U-46.617*f.b*Math.pow(f.d, 2))/(0.9*f.Fy*(f.d-r));
        this.As = 0.0152*f.b*f.d+(f.Mo*100*f.U-46.617*f.b*Math.pow(f.d, 2))/(0.9*f.Fy*(f.d-r));
    }
    
    /**
     * Getters and Setters
     * @return 
     */
    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double getAps() {
        return Aps;
    }

    public void setAps(double Aps) {
        this.Aps = Aps;
    }

    public double getAs() {
        return As;
    }

    public void setAs(double As) {
        this.As = As;
    }

    public Flexion getF() {
        return f;
    }

    public void setF(Flexion f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "AceroEnCompresion{" + "r=" + r + ", Aps=" + Aps + ", As=" + As + ", f=" + f + '}';
    }
    
    public void recalculate() {
        this.Aps = (f.Mo*100*f.U-46.617*f.b*Math.pow(f.d, 2))/(0.9*f.Fy*(f.d-r));
        this.As = 0.0152*f.b*f.d+(f.Mo*100*f.U-46.617*f.b*Math.pow(f.d, 2))/(0.9*f.Fy*(f.d-r));
    }    
    
}
