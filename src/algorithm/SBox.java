package algorithm;


public class SBox {
	String retVal;
	public SBox(String val){
		
		String[][] sb;
		int A=10,B=11,C=12,D=13,E=14,F=15;
		sb=new String[16][16];
		String a,b;
		int c=0,d=0;
		a=val.substring(0, 1);
		b=val.substring(1, 2);
		//System.out.println(a+" "+b);
		if(a.equals("A")||a.equals("B")||a.equals("C")||a.equals("D")||a.equals("E")||a.equals("F")){
			if(a.equals("A")){
				c=A;
			}
			else if(a.equals("B")){
				c=B;
			}
			else if(a.equals("C")){
				c=C;
			}
			else if(a.equals("D")){
				c=D;
			}
			else if(a.equals("E")){
				c=E;
			}
			else if(a.equals("F")){
				c=F;
			}
		}
		else
			c=Integer.parseInt(a);
		
		if(b.equals("A")||b.equals("B")||b.equals("C")||b.equals("D")||b.equals("E")||b.equals("F")){
			if(b.equals("A")){
				d=A;
			}
			else if(b.equals("B")){
				d=B;
			}
			else if(b.equals("C")){
				d=C;
			}
			else if(b.equals("D")){
				d=D;
			}
			else if(b.equals("E")){
				d=E;
			}
			else if(b.equals("F")){
				d=F;
			}
		}
		else
			d=Integer.parseInt(b);
		
		//System.out.println(c+"  "+d);
		
		
		sb[0][0]="63"; sb[0][1]="7C"; sb[0][2]="77"; sb[0][3]="7B"; sb[0][4]="F2"; sb[0][5]="6B"; sb[0][6]="6F"; sb[0][7]="C5"; sb[0][8]="30"; sb[0][9]="01"; sb[0][A]="67"; sb[0][B]="2B"; sb[0][C]="FE"; sb[0][D]="D7"; sb[0][E]="AB"; sb[0][F]="76";
		sb[1][0]="CA"; sb[1][1]="82"; sb[1][2]="C9"; sb[1][3]="7D"; sb[1][4]="FA"; sb[1][5]="59"; sb[1][6]="47"; sb[1][7]="F0"; sb[1][8]="AD"; sb[1][9]="D4"; sb[1][A]="A2"; sb[1][B]="AF"; sb[1][C]="9C"; sb[1][D]="A4"; sb[1][E]="72"; sb[1][F]="C0";
		sb[2][0]="B7"; sb[2][1]="FD"; sb[2][2]="93"; sb[2][3]="26"; sb[2][4]="36"; sb[2][5]="3F"; sb[2][6]="F7"; sb[2][7]="CC"; sb[2][8]="34"; sb[2][9]="A5"; sb[2][A]="E5"; sb[2][B]="F1"; sb[2][C]="71"; sb[2][D]="D8"; sb[2][E]="31"; sb[2][F]="15";
		sb[3][0]="04"; sb[3][1]="C7"; sb[3][2]="23"; sb[3][3]="C3"; sb[3][4]="18"; sb[3][5]="96"; sb[3][6]="05"; sb[3][7]="9A"; sb[3][8]="07"; sb[3][9]="12"; sb[3][A]="80"; sb[3][B]="E2"; sb[3][C]="EB"; sb[3][D]="27"; sb[3][E]="B2"; sb[3][F]="75";
		sb[4][0]="09"; sb[4][1]="83"; sb[4][2]="2C"; sb[4][3]="1A"; sb[4][4]="1B"; sb[4][5]="6E"; sb[4][6]="5A"; sb[4][7]="A0"; sb[4][8]="52"; sb[4][9]="3B"; sb[4][A]="D6"; sb[4][B]="B3"; sb[4][C]="29"; sb[4][D]="E3"; sb[4][E]="2F"; sb[4][F]="84";
		sb[5][0]="53"; sb[5][1]="D1"; sb[5][2]="00"; sb[5][3]="ED"; sb[5][4]="20"; sb[5][5]="FC"; sb[5][6]="B1"; sb[5][7]="5B"; sb[5][8]="6A"; sb[5][9]="CB"; sb[5][A]="BE"; sb[5][B]="39"; sb[5][C]="4A"; sb[5][D]="4C"; sb[5][E]="58"; sb[5][F]="CF";
		sb[6][0]="D0"; sb[6][1]="EF"; sb[6][2]="AA"; sb[6][3]="FB"; sb[6][4]="43"; sb[6][5]="4D"; sb[6][6]="33"; sb[6][7]="85"; sb[6][8]="45"; sb[6][9]="F9"; sb[6][A]="02"; sb[6][B]="7F"; sb[6][C]="50"; sb[6][D]="3C"; sb[6][E]="9F"; sb[6][F]="A8";
		sb[7][0]="51"; sb[7][1]="A3"; sb[7][2]="40"; sb[7][3]="8F"; sb[7][4]="92"; sb[7][5]="9D"; sb[7][6]="38"; sb[7][7]="F5"; sb[7][8]="BC"; sb[7][9]="B6"; sb[7][A]="DA"; sb[7][B]="21"; sb[7][C]="10"; sb[7][D]="FF"; sb[7][E]="F3"; sb[7][F]="D2";
		sb[8][0]="CD"; sb[8][1]="0C"; sb[8][2]="13"; sb[8][3]="EC"; sb[8][4]="5F"; sb[8][5]="97"; sb[8][6]="44"; sb[8][7]="17"; sb[8][8]="C4"; sb[8][9]="A7"; sb[8][A]="7E"; sb[8][B]="3D"; sb[8][C]="64"; sb[8][D]="5D"; sb[8][E]="19"; sb[8][F]="73";
		sb[9][0]="60"; sb[9][1]="81"; sb[9][2]="4F"; sb[9][3]="DC"; sb[9][4]="22"; sb[9][5]="2A"; sb[9][6]="90"; sb[9][7]="88"; sb[9][8]="46"; sb[9][9]="EE"; sb[9][A]="B8"; sb[9][B]="14"; sb[9][C]="DE"; sb[9][D]="5E"; sb[9][E]="0B"; sb[9][F]="DB";
		sb[A][0]="E0"; sb[A][1]="32"; sb[A][2]="3A"; sb[A][3]="0A"; sb[A][4]="49"; sb[A][5]="06"; sb[A][6]="24"; sb[A][7]="5C"; sb[A][8]="C2"; sb[A][9]="D3"; sb[A][A]="AC"; sb[A][B]="62"; sb[A][C]="91"; sb[A][D]="95"; sb[A][E]="E4"; sb[A][F]="79";
		sb[B][0]="E7"; sb[B][1]="C8"; sb[B][2]="37"; sb[B][3]="6D"; sb[B][4]="8D"; sb[B][5]="D5"; sb[B][6]="4E"; sb[B][7]="A9"; sb[B][8]="6C"; sb[B][9]="56"; sb[B][A]="F4"; sb[B][B]="EA"; sb[B][C]="65"; sb[B][D]="7A"; sb[B][E]="AE"; sb[B][F]="08";
		sb[C][0]="BA"; sb[C][1]="78"; sb[C][2]="25"; sb[C][3]="2E"; sb[C][4]="1C"; sb[C][5]="A6"; sb[C][6]="B4"; sb[C][7]="C6"; sb[C][8]="E8"; sb[C][9]="DD"; sb[C][A]="74"; sb[C][B]="1F"; sb[C][C]="4B"; sb[C][D]="BD"; sb[C][E]="8B"; sb[C][F]="8A";
		sb[D][0]="70"; sb[D][1]="3E"; sb[D][2]="B5"; sb[D][3]="66"; sb[D][4]="48"; sb[D][5]="03"; sb[D][6]="F6"; sb[D][7]="0E"; sb[D][8]="61"; sb[D][9]="35"; sb[D][A]="57"; sb[D][B]="B9"; sb[D][C]="86"; sb[D][D]="C1"; sb[D][E]="1D"; sb[D][F]="9E";
		sb[E][0]="E1"; sb[E][1]="F8"; sb[E][2]="98"; sb[E][3]="11"; sb[E][4]="69"; sb[E][5]="D9"; sb[E][6]="8E"; sb[E][7]="94"; sb[E][8]="9B"; sb[E][9]="1E"; sb[E][A]="87"; sb[E][B]="E9"; sb[E][C]="CE"; sb[E][D]="55"; sb[E][E]="28"; sb[E][F]="DF";
		sb[F][0]="8C"; sb[F][1]="A1"; sb[F][2]="89"; sb[F][3]="0D"; sb[F][4]="BF"; sb[F][5]="E6"; sb[F][6]="42"; sb[F][7]="68"; sb[F][8]="41"; sb[F][9]="99"; sb[F][A]="2D"; sb[F][B]="0F"; sb[F][C]="B0"; sb[F][D]="54"; sb[F][E]="BB"; sb[F][F]="16";
		
		/*
		for(int i=0;i<=F;i++){
			for(int j=0;j<=F;j++){
				System.out.print(sb[i][j]+" ");
			}System.out.println();
			
		}*/
		
		retVal=sb[c][d];	
	}
	
	public String returnVal(){
		return this.retVal;
	}
}
