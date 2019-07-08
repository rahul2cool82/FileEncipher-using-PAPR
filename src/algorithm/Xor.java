package algorithm;


public class Xor {
	
	String retVal;
	public Xor(String Plain,String Key){
		String Hexa=Plain;
		String Hexa1=Key;
		String binCipher="";
		String Bin="",Bin1="";
		char a;
		for(int i=0;i<Hexa.length();i++){
			
			a=Hexa.charAt(i);
			if(a=='0'){
				Bin=Bin+"0000";
			}
			else if(a=='1'){
				Bin=Bin+"0001";
			}
			else if(a=='2'){
				Bin=Bin+"0010";
			}
			else if(a=='3'){
				Bin=Bin+"0011";
			}
			else if(a=='4'){
				Bin=Bin+"0100";
			}
			else if(a=='5'){
				Bin=Bin+"0101";
			}
			else if(a=='6'){
				Bin=Bin+"0110";
			}
			else if(a=='7'){
				Bin=Bin+"0111";
			}
			else if(a=='8'){
				Bin=Bin+"1000";
			}
			else if(a=='9'){
				Bin=Bin+"1001";
			}
			else if(a=='A'){
				Bin=Bin+"1010";
			}
			else if(a=='B'){
				Bin=Bin+"1011";
			}
			else if(a=='C'){
				Bin=Bin+"1100";
			}
			else if(a=='D'){
				Bin=Bin+"1101";
			}
			else if(a=='E'){
				Bin=Bin+"1110";
			}
			else if(a=='F'){
				Bin=Bin+"1111";
			}
			
		}//System.out.println(Bin);
		
		char a1;
		for(int i=0;i<Hexa1.length();i++){
			
			a1=Hexa1.charAt(i);
			if(a1=='0'){
				Bin1=Bin1+"0000";
			}
			else if(a1=='1'){
				Bin1=Bin1+"0001";
			}
			else if(a1=='2'){
				Bin1=Bin1+"0010";
			}
			else if(a1=='3'){
				Bin1=Bin1+"0011";
			}
			else if(a1=='4'){
				Bin1=Bin1+"0100";
			}
			else if(a1=='5'){
				Bin1=Bin1+"0101";
			}
			else if(a1=='6'){
				Bin1=Bin1+"0110";
			}
			else if(a1=='7'){
				Bin1=Bin1+"0111";
			}
			else if(a1=='8'){
				Bin1=Bin1+"1000";
			}
			else if(a1=='9'){
				Bin1=Bin1+"1001";
			}
			else if(a1=='A'){
				Bin1=Bin1+"1010";
			}
			else if(a1=='B'){
				Bin1=Bin1+"1011";
			}
			else if(a1=='C'){
				Bin1=Bin1+"1100";
			}
			else if(a1=='D'){
				Bin1=Bin1+"1101";
			}
			else if(a1=='E'){
				Bin1=Bin1+"1110";
			}
			else if(a1=='F'){
				Bin1=Bin1+"1111";
			}
			
		}//System.out.println(Bin1);
		
		for(int i=0;i<Bin.length();i++){
			
			if(Bin.charAt(i)==Bin1.charAt(i)){
				binCipher=binCipher+"0";
			}
			else
				binCipher=binCipher+"1";
		}
		//System.out.println(binCipher);
		
		String[] subBin;
		subBin=new String[100];
		int j=0,k=0,l=0;
		
		Bin=binCipher;
		Hexa="";
		
		for(int i=0;i<Bin.length();i=i+4){
			j=i;
			k=i+4;
			subBin[l]=Bin.substring(j, k);
			//System.out.println("subBin["+l+"]="+subBin[l]);
			if(subBin[l].equals("0000")){
				Hexa=Hexa+"0";
			}
			else if(subBin[l].equals("0001")){
				Hexa=Hexa+"1";
			}
			else if(subBin[l].equals("0010")){
				Hexa=Hexa+"2";
			}
			else if(subBin[l].equals("0011")){
				Hexa=Hexa+"3";
			}
			else if(subBin[l].equals("0100")){
				Hexa=Hexa+"4";
			}
			else if(subBin[l].equals("0101")){
				Hexa=Hexa+"5";
			}
			else if(subBin[l].equals("0110")){
				Hexa=Hexa+"6";
			}
			else if(subBin[l].equals("0111")){
				Hexa=Hexa+"7";
			}
			else if(subBin[l].equals("1000")){
				Hexa=Hexa+"8";
			}
			else if(subBin[l].equals("1001")){
				Hexa=Hexa+"9";
			}
			else if(subBin[l].equals("1010")){
				Hexa=Hexa+"A";
			}
			else if(subBin[l].equals("1011")){
				Hexa=Hexa+"B";
			}
			else if(subBin[l].equals("1100")){
				Hexa=Hexa+"C";
			}
			else if(subBin[l].equals("1101")){
				Hexa=Hexa+"D";
			}
			else if(subBin[l].equals("1110")){
				Hexa=Hexa+"E";
			}
			else if(subBin[l].equals("1111")){
				Hexa=Hexa+"F";
			}
			//System.out.println("Hexa="+Hexa+" and l="+l);
			l++;
		}
		
		retVal=Hexa;
	}
	
	public String returnVal(){
		return this.retVal;
	}
	
}
