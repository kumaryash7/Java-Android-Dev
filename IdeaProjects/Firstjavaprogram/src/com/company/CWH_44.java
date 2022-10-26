package com.company;  // ACCESS MODIFIERS
class C1{
    public  int x =5;
    protected int y =45;
    int z=6; // DEFAULT MODIFIER
    private int a =78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
        }
        class C2 extends C1{
    int p ;
    int q;

            public int getP() {
                return p;
            }

            public void setP(int p) {
                this.p = p;
            }

            public int getQ() {
                return q;
            }

            public void setQ(int q) {
                this.q = q;
            }
        }
public class CWH_44 {
    public static void main(String[] args) {
 C1 c = new C1();
 c.meth1();
C2 y = new C2();
y.setP(5);
        System.out.println(y.getP());
        y.meth1();
    }
}
