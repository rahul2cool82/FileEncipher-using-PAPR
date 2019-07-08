package algorithm;


public class HexaToBinary {
	
	String Hexa,Bin,bk0,bk1,bk2,bk3,bk4,bk5,bk6,bk7,bk8,bk9,bk10,bk11,bk12,bk13,bk14,bk15;
	String hk0,hk1,hk2,hk3,hk4,hk5,hk6,hk7,hk8,hk9,hk10,hk11,hk12,hk13,hk14,hk15;
	String sk0,sk1,sk2,sk3,sk4,sk5,sk6,sk7,sk8,sk9,sk10,sk11,sk12,sk13,sk14,sk15;
	
	public HexaToBinary(String Key){
		
		Hexa=Key;	
		Bin="";
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
			
		}
		//System.out.println(Bin);
		Round0 r0=new Round0(Bin);
		bk0=r0.Return0();
		hk0=r0.Return1();
		sk0=r0.Return2();
		
		Round1 r1=new Round1(bk0);
		bk1=r1.Return0();
		hk1=r1.Return1();
		sk1=r1.Return2();

		Round2 r2=new Round2(bk1);
		bk2=r2.Return0();
		hk2=r2.Return1();
		sk2=r2.Return2();

		Round3 r3=new Round3(bk2);
		bk3=r3.Return0();
		hk3=r3.Return1();
		sk3=r3.Return2();

		Round4 r4=new Round4(bk3);
		bk4=r4.Return0();
		hk4=r4.Return1();
		sk4=r4.Return2();

		Round5 r5=new Round5(bk4);
		bk5=r5.Return0();
		hk5=r5.Return1();
		sk5=r5.Return2();

		Round6 r6=new Round6(bk5);
		bk6=r6.Return0();
		hk6=r6.Return1();
		sk6=r6.Return2();

		Round7 r7=new Round7(bk6);
		bk7=r7.Return0();
		hk7=r7.Return1();
		sk7=r7.Return2();
;
		Round8 r8=new Round8(bk7);
		bk8=r8.Return0();
		hk8=r8.Return1();
		sk8=r8.Return2();

		Round9 r9=new Round9(bk8);
		bk9=r9.Return0();
		hk9=r9.Return1();
		sk9=r9.Return2();

		Round10 r10=new Round10(bk9);
		bk10=r10.Return0();
		hk10=r10.Return1();
		sk10=r10.Return2();

		Round11 r11=new Round11(bk10);
		bk11=r11.Return0();
		hk11=r11.Return1();
		sk11=r11.Return2();

		Round12 r12=new Round12(bk11);
		bk12=r12.Return0();
		hk12=r12.Return1();
		sk12=r12.Return2();

		Round13 r13=new Round13(bk12);
		bk13=r13.Return0();
		hk13=r13.Return1();
		sk13=r13.Return2();

		Round14 r14=new Round14(bk13);
		bk14=r14.Return0();
		hk14=r14.Return1();
		sk14=r14.Return2();

		Round15 r15=new Round15(bk14);
		bk15=r15.Return0();
		hk15=r15.Return1();
		sk15=r15.Return2();
		
		/*
		System.out.println("Key 0 is "+hk0+"\n"+sk0);
		System.out.println("Key 1 is "+hk1+"\n"+sk1);
		System.out.println("Key 2 is "+hk2+"\n"+sk2);
		System.out.println("Key 3 is "+hk3+"\n"+sk3);
		System.out.println("Key 4 is "+hk4+"\n"+sk4);
		System.out.println("Key 5 is "+hk5+"\n"+sk5);
		System.out.println("Key 6 is "+hk6+"\n"+sk6);
		System.out.println("Key 7 is "+hk7+"\n"+sk7);
		System.out.println("Key 8 is "+hk8+"\n"+sk8);
		System.out.println("Key 9 is "+hk9+"\n"+sk9);
		System.out.println("Key 10 is "+hk10+"\n"+sk10);
		System.out.println("Key 11 is "+hk11+"\n"+sk11);
		System.out.println("Key 12 is "+hk12+"\n"+sk12);
		System.out.println("Key 13 is "+hk13+"\n"+sk13);
		System.out.println("Key 14 is "+hk14+"\n"+sk14);
		System.out.println("Key 15 is "+hk15+"\n"+sk15);
		*/
		
	}
	
	public String Key0(String k0){
		if(k0.equals("")){
			//System.out.println(k0);
			return this.hk0;
		}
		else{
			
			Xor xor=new Xor(k0, hk0);
			hk0=xor.returnVal();
			//System.out.println(hk0);
			return this.hk0;
		}
		
	}
	public String Key1(String k1){
		if(k1.equals("")){
			//System.out.println(k1);
			return this.hk1;
		}
		else{
			
			Xor xor=new Xor(k1, hk1);
			hk1=xor.returnVal();
			//System.out.println(hk1);
			return this.hk1;
		}
	}
	public String Key2(String k2){
		if(k2.equals("")){
			//System.out.println(k2);
			return this.hk2;
		}
		else{
			
			Xor xor=new Xor(k2, hk2);
			hk2=xor.returnVal();
			//System.out.println(hk2);
			return this.hk2;
		}
	}
	public String Key3(String k3){
		if(k3.equals("")){
			//System.out.println(k3);
			return this.hk3;
		}
		else{
			
			Xor xor=new Xor(k3, hk3);
			hk3=xor.returnVal();
			//System.out.println(hk3);
			return this.hk3;
		}
	}
	public String Key4(String k4){
		if(k4.equals("")){
			//System.out.println(k4);
			return this.hk4;
		}
		else{
			
			Xor xor=new Xor(k4, hk4);
			hk4=xor.returnVal();
			//System.out.println(hk4);
			return this.hk4;
		}
	}
	public String Key5(String k5){
		if(k5.equals("")){
			//System.out.println(k5);
			return this.hk5;
		}
		else{
			
			Xor xor=new Xor(k5, hk5);
			hk5=xor.returnVal();
			//System.out.println(hk5);
			return this.hk5;
		}
	}
	public String Key6(String k6){
		if(k6.equals("")){
			//System.out.println(k6);
			return this.hk6;
		}
		else{
			
			Xor xor=new Xor(k6, hk6);
			hk6=xor.returnVal();
			//System.out.println(hk6);
			return this.hk6;
		}
	}
	public String Key7(String k7){
		if(k7.equals("")){
			//System.out.println(k7);
			return this.hk7;
		}
		else{
			
			Xor xor=new Xor(k7, hk7);
			hk7=xor.returnVal();
			//System.out.println(hk7);
			return this.hk7;
		}
	}
	public String Key8(String k8){
		if(k8.equals("")){
			//System.out.println(k8);
			return this.hk8;
		}
		else{
			
			Xor xor=new Xor(k8, hk8);
			hk8=xor.returnVal();
			//System.out.println(hk8);
			return this.hk8;
		}
	}
	public String Key9(String k9){
		if(k9.equals("")){
			//System.out.println(k9);
			return this.hk9;
		}
		else{
			
			Xor xor=new Xor(k9, hk9);
			hk9=xor.returnVal();
			//System.out.println(hk9);
			return this.hk9;
		}
	}
	public String Key10(String k10){
		if(k10.equals("")){
			//System.out.println(k10);
			return this.hk10;
		}
		else{
			
			Xor xor=new Xor(k10, hk10);
			hk10=xor.returnVal();
			//System.out.println(hk10);
			return this.hk10;
		}
	}
	public String Key11(String k11){
		if(k11.equals("")){
			//System.out.println(k11);
			return this.hk11;
		}
		else{
			
			Xor xor=new Xor(k11, hk11);
			hk11=xor.returnVal();
			//System.out.println(hk11);
			return this.hk11;
		}
	}
	public String Key12(String k12){
		if(k12.equals("")){
			//System.out.println(k12);
			return this.hk12;
		}
		else{
			
			Xor xor=new Xor(k12, hk12);
			hk12=xor.returnVal();
			//System.out.println(hk12);
			return this.hk12;
		}
	}
	
	public String Key13(String k13){
		if(k13.equals("")){
			//System.out.println(k13);
			return this.hk13;
		}
		else{
			
			Xor xor=new Xor(k13, hk13);
			hk13=xor.returnVal();
			//System.out.println(hk13);
			return this.hk13;
		}
	}
	public String Key14(String k14){
		if(k14.equals("")){
			//System.out.println(k14);
			return this.hk14;
		}
		else{
			
			Xor xor=new Xor(k14, hk14);
			hk14=xor.returnVal();
			//System.out.println(hk14);
			return this.hk14;
		}
	}
	public String Key15(String k15){
		if(k15.equals("")){
			//System.out.println(k15);
			return this.hk15;
		}
		else{
			
			Xor xor=new Xor(k15, hk15);
			hk15=xor.returnVal();
			//System.out.println(hk15);
			return this.hk15;
		}
	}
	
}
