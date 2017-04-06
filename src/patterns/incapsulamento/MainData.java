package patterns.incapsulamento;

public class MainData {
	
public static void main(String [] args){
	
	Data data= new Data();
	
	data.setGiorno(43);
	data.setMese(6);
	data.setAnno(1998);
	System.out.println("La data di oggi è "+data.getGiorno()+","+data.getMese()+","+data.getAnno()
			);
}
	
}
