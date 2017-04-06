package patterns.incapsulamento;

public class Data {
private int giorno;
private int mese;
private int anno;

public void setGiorno(int g){
	if( (g>0) && (g<=31) ){
		giorno=g;
	}else System.out.println("giorno non valido");
	
}
public int getGiorno(){
	return giorno;
}
public void setMese(int m){
	if (m>0 && m<=12){
		mese=m;
	}else System.out.println("Mese invalido");
}
public int getMese(){
	return mese;
}
public int getAnno(){
	return anno;
}
public void setAnno(int a){
	anno=a;
}

}
