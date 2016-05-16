/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author JaVa
 */
public class Fraction 
{
    private int tu,mau;

    @Override
    public String toString() {
        return tu+"/"+mau;
    }
    
    
    public Fraction(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        this.RutGon();
    }

    public Fraction(int tu) {
        this.tu = tu;
        mau=1;
    }
    public Fraction(Fraction _ps ) {
        this.tu=_ps.tu;
        this.mau=_ps.mau;
    }

    public Fraction() {
        tu=mau=1;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
    public Fraction RutGon()
    {
	if(tu==0)// neu la dang 0/x thi dua ve 0/1 va thoat khoi ham
	{
		mau=1;
		return this;
	}
	
	if(mau==0) // neu la dang x/0 thi dua ve 1/0 va thoat
	{
		tu=1;
		return this;
	}
	
	int x,y;  // Gan tu va mau cho x,y sao cho x>=y       
	if(tu < mau)
	{
		x=mau;
		y=tu;
	}
	else
	{
		x=tu;
		y=mau;
	}
	int r=1;// thuat toan Euclid tim UCLN 2 so ke ca la so (-)
	while(r!=0)
	{
		r=x%y;
		if(r!=0)
		{
			x=y;
			y=r;
		}
	}
	// ket thuc while dc y la UCLN tu va mau
	tu=tu / y;
	mau=mau / y;
	return this;
    }

    public Fraction add(Fraction phanSo2)
    {
	Fraction tg=new Fraction();	
	tg.tu=tu*phanSo2.mau + phanSo2.tu*mau;  
	tg.mau=mau*phanSo2.mau;				
	return tg.RutGon();
    }
    
    public Fraction sub(Fraction phanSo2)
    {
	Fraction tg=new Fraction();		
	tg.tu=tu*phanSo2.mau - phanSo2.tu*mau; 
	tg.mau=mau*phanSo2.mau;			
	return tg.RutGon();
    }
    
}
