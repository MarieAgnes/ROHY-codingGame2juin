
import java.util.ArrayList;
import java.util.List;

public class Exercice1 {
    public boolean sontOpp(double a,double b) {
        boolean rep=false;
        if(a+b==0) {
            rep=true;
        }
        return rep;
    }
    public boolean sontInv(double a,double b) {
        boolean rep=false;
        if(a*b==1) {
            rep=true;
        }
        return rep;
    }
    public boolean sontInvOuOpp(double a,double b) {
        if(this.sontOpp(a,b) || this.sontInv(a, b)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean existeOppConsecutifs(double[] T) {
        boolean rep=false;
        for(int i=0;i<T.length;i++) {
            if(T[i]==T[i+1]-1 && this.sontOpp(T[i],T[i+1]) || T[i]==T[i+1]+1 && this.sontOpp(T[i],T[i+1])) {
                rep=true;
                return rep;
            }
        }
        return rep;
    }
    
    public boolean existeInvConsecutifs(double[] T) {
        boolean rep=false;
        for(int i=0;i<T.length;i++) {
            if(T[i]==T[i+1]-1 && this.sontInv(T[i],T[i+1]) || T[i]==T[i+1]+1 && this.sontInv(T[i],T[i+1])) {
                rep=true;
                return rep;
            }
        }
        return rep;
    }
        
    public boolean existeInvOuOppConsecutifs(double[] T) {
        if(existeInvConsecutifs(T) || existeOppConsecutifs(T)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean existeOpp(double[] T) {
        boolean rep=false;
        for(int i=0;i<T.length;i++) {
            for(int j=0;j<T.length;j++) {
                if(i!=j && this.sontOpp(T[i],T[j])) {
                    return true;
                }
            }
        }
        return rep;
    }
     public boolean existeInv(double[] T) {
        boolean rep=false;
        for(int i=0;i<T.length;i++) {
            for(int j=0;j<T.length;j++) {
                if(i!=j && this.sontInv(T[i],T[j])) {
                    return true;
                }
            }
        }
        return rep;
    }
     public boolean existeInvouOpp(double[] T) {
        if(existeInv(T) || existeOpp(T)) {
            return true;
        }
        else {
            return false;
        }
    }
    public List<int[]> nbInvOuOpp(double[]T) {
        ArrayList rep=new ArrayList(); 
         for(int i=0;i<T.length;i++) {
            for(int j=0;j<T.length;j++) {
                if(i<j && this.sontInv(T[i],T[j]) || i<j && this.sontOpp(T[i],T[j])) {
                   int[] value=new int[2];
                   value[0]=i;value[1]=j;
                   rep.add(value);
                } 
            }
        }
        return rep;
    }
}