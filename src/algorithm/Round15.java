package algorithm;

import javax.xml.bind.DatatypeConverter;
public class Round15 {

	String temp="",temp1="",conv="",sub1="",sub2="",binKey="",hexKey="",strKey="";
	
	public Round15(String Bin){
	
		
		//System.out.println(Bin.length());
		int j,k=0;
		String[] str;
		
		str=new String[100];
		
		for(int i=0;i<Bin.length();i=i+4){
		
			//System.out.println(i);
			for(j=i;j<i+4;j++){
				
				temp=temp+Bin.charAt(j);
				
			}
			str[k]=temp;
			temp="";
			k++;
		}
		temp="";
		for(int i=0;i<32;i++){
			
			//System.out.println(str[i]);	//Working Properly
			temp1=str[i];
			char a=temp1.charAt(0),b,c=temp1.charAt(1),d,e=temp1.charAt(2),f,g=temp1.charAt(3),h;
			if(a=='0'){
				b='1';
			}
			else{
				b='0';
			}
			if(c=='0'){
				d='1';
			}
			else{
				d='0';
			}
			if(e=='0'){
				f='1';
			}
			else{
				f='0';
			}
			if(g=='0'){
				h='1';
			}
			else{
				h='0';
			}
			temp=String.valueOf(b)+String.valueOf(d)+String.valueOf(f)+String.valueOf(h);
			//System.out.println(temp);
			str[i]=temp;	//Converted
			conv=conv+str[i];
			temp="";
			temp1="";
		}
		//System.out.println(conv);
		
		sub1=conv.substring(0, 120);
		sub2=conv.substring(120, 128);
		binKey=sub2+sub1;
		//System.out.println(binKey.length());
		//Conversion Completed
		
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
