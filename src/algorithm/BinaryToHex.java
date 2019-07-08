package algorithm;

//import javax.xml.bind.DatatypeConverter;


public class BinaryToHex {
	String Hexa="";
	public BinaryToHex(String Bin){
		//String Bin="10110110101110100111100000111111011110010011011011111000011110011011101111111000001101101011101001111001101110100110111001101110";
		
		String[] subBin;
		subBin=new String[100];
		int j=0,k=0,l=0;
		//System.out.println(Bin.length());
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
		//System.out.println(Hexa.length());
		//byte[] bytes = DatatypeConverter.parseHexBinary(Hexa);
		//String strKey=new String(bytes);
		//System.out.println(strKey);	
	}
	public String getReturn1(){
		return this.Hexa;
	}
	
}
