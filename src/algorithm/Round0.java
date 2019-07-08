package algorithm;

import javax.xml.bind.DatatypeConverter;


public class Round0 {

	String sub1="",sub2="",binKey="",hexKey="",strKey="";
	public Round0(String Bin){
		
		
		
		sub1=Bin.substring(0, 120);
		sub2=Bin.substring(120, 128);
		binKey=sub2+sub1;
		//System.out.println(binKey);
		BinaryToHex binarytohex=new BinaryToHex(binKey);
		hexKey=binarytohex.getReturn1();
		//System.out.println(hexKey);
		byte[] bytes = DatatypeConverter.parseHexBinary(hexKey);
		strKey=new String(bytes);
		//System.out.println(strKey);
		
	}
	
	public String Return0(){
		return this.binKey;
	}
	
	public String Return1(){
		return this.hexKey;
	}
	
	public String Return2(){
		return this.strKey;
	}
	
}
