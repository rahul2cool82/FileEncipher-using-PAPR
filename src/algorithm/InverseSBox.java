package algorithm;


public class InverseSBox {
	
	String retVal;

	public InverseSBox(String val){
		
		
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
		sb[0][0]="52"; sb[0][1]="09"; sb[0][2]="6A"; sb[0][3]="D5"; sb[0][4]="30"; sb[0][5]="36"; sb[0][6]="A5"; sb[0][7]="38"; sb[0][8]="BF"; sb[0][9]="40"; sb[0][A]="A3"; sb[0][B]="9E"; sb[0][C]="81"; sb[0][D]="F3"; sb[0][E]="D7"; sb[0][F]="FB";
		sb[1][0]="7C"; sb[1][1]="E3"; sb[1][2]="39"; sb[1][3]="82"; sb[1][4]="9B"; sb[1][5]="2F"; sb[1][6]="FF"; sb[1][7]="87"; sb[1][8]="34"; sb[1][9]="8E"; sb[1][A]="43"; sb[1][B]="44"; sb[1][C]="C4"; sb[1][D]="DE"; sb[1][E]="E9"; sb[1][F]="CB";
		sb[2][0]="54"; sb[2][1]="7B"; sb[2][2]="94"; sb[2][3]="32"; sb[2][4]="A6"; sb[2][5]="C2"; sb[2][6]="23"; sb[2][7]="3D"; sb[2][8]="EE"; sb[2][9]="4C"; sb[2][A]="95"; sb[2][B]="0B"; sb[2][C]="42"; sb[2][D]="FA"; sb[2][E]="C3"; sb[2][F]="4E";
		sb[3][0]="08"; sb[3][1]="2E"; sb[3][2]="A1"; sb[3][3]="66"; sb[3][4]="28"; sb[3][5]="D9"; sb[3][6]="24"; sb[3][7]="B2"; sb[3][8]="76"; sb[3][9]="5B"; sb[3][A]="A2"; sb[3][B]="49"; sb[3][C]="6D"; sb[3][D]="8B"; sb[3][E]="D1"; sb[3][F]="25";
		sb[4][0]="72"; sb[4][1]="F8"; sb[4][2]="F6"; sb[4][3]="64"; sb[4][4]="86"; sb[4][5]="68"; sb[4][6]="98"; sb[4][7]="16"; sb[4][8]="D4"; sb[4][9]="A4"; sb[4][A]="5C"; sb[4][B]="CC"; sb[4][C]="5D"; sb[4][D]="65"; sb[4][E]="B6"; sb[4][F]="92";
		sb[5][0]="6C"; sb[5][1]="70"; sb[5][2]="48"; sb[5][3]="50"; sb[5][4]="FD"; sb[5][5]="ED"; sb[5][6]="B9"; sb[5][7]="DA"; sb[5][8]="5E"; sb[5][9]="15"; sb[5][A]="46"; sb[5][B]="57"; sb[5][C]="A7"; sb[5][D]="8D"; sb[5][E]="9D"; sb[5][F]="84";
		sb[6][0]="90"; sb[6][1]="D8"; sb[6][2]="AB"; sb[6][3]="00"; sb[6][4]="8C"; sb[6][5]="BC"; sb[6][6]="D3"; sb[6][7]="0A"; sb[6][8]="F7"; sb[6][9]="E4"; sb[6][A]="58"; sb[6][B]="05"; sb[6][C]="B8"; sb[6][D]="B3"; sb[6][E]="45"; sb[6][F]="06";
		sb[7][0]="D0"; sb[7][1]="2C"; sb[7][2]="1E"; sb[7][3]="8F"; sb[7][4]="CA"; sb[7][5]="3F"; sb[7][6]="0F"; sb[7][7]="02"; sb[7][8]="C1"; sb[7][9]="AF"; sb[7][A]="BD"; sb[7][B]="03"; sb[7][C]="01"; sb[7][D]="13"; sb[7][E]="8A"; sb[7][F]="6B";
		sb[8][0]="3A"; sb[8][1]="91"; sb[8][2]="11"; sb[8][3]="41"; sb[8][4]="4F"; sb[8][5]="67"; sb[8][6]="DC"; sb[8][7]="EA"; sb[8][8]="97"; sb[8][9]="F2"; sb[8][A]="CF"; sb[8][B]="CE"; sb[8][C]="F0"; sb[8][D]="B4"; sb[8][E]="E6"; sb[8][F]="73";
		sb[9][0]="96"; sb[9][1]="AC"; sb[9][2]="74"; sb[9][3]="22"; sb[9][4]="E7"; sb[9][5]="AD"; sb[9][6]="35"; sb[9][7]="85"; sb[9][8]="E2"; sb[9][9]="F9"; sb[9][A]="37"; sb[9][B]="E8"; sb[9][C]="1C"; sb[9][D]="75"; sb[9][E]="DF"; sb[9][F]="6E";
		sb[A][0]="47"; sb[A][1]="F1"; sb[A][2]="1A"; sb[A][3]="71"; sb[A][4]="1D"; sb[A][5]="29"; sb[A][6]="C5"; sb[A][7]="89"; sb[A][8]="6F"; sb[A][9]="B7"; sb[A][A]="62"; sb[A][B]="0E"; sb[A][C]="AA"; sb[A][D]="18"; sb[A][E]="BE"; sb[A][F]="1B";
		sb[B][0]="FC"; sb[B][1]="56"; sb[B][2]="3E"; sb[B][3]="4B"; sb[B][4]="C6"; sb[B][5]="D2"; sb[B][6]="79"; sb[B][7]="20"; sb[B][8]="9A"; sb[B][9]="DB"; sb[B][A]="C0"; sb[B][B]="FE"; sb[B][C]="78"; sb[B][D]="CD"; sb[B][E]="5A"; sb[B][F]="F4";
		sb[C][0]="1F"; sb[C][1]="DD"; sb[C][2]="A8"; sb[C][3]="33"; sb[C][4]="88"; sb[C][5]="07"; sb[C][6]="C7"; sb[C][7]="31"; sb[C][8]="B1"; sb[C][9]="12"; sb[C][A]="10"; sb[C][B]="59"; sb[C][C]="27"; sb[C][D]="80"; sb[C][E]="EC"; sb[C][F]="5F";
		sb[D][0]="60"; sb[D][1]="51"; sb[D][2]="7F"; sb[D][3]="A9"; sb[D][4]="19"; sb[D][5]="B5"; sb[D][6]="4A"; sb[D][7]="0D"; sb[D][8]="2D"; sb[D][9]="E5"; sb[D][A]="7A"; sb[D][B]="9F"; sb[D][C]="93"; sb[D][D]="C9"; sb[D][E]="9C"; sb[D][F]="EF";
		sb[E][0]="A0"; sb[E][1]="E0"; sb[E][2]="3B"; sb[E][3]="4D"; sb[E][4]="AE"; sb[E][5]="2A"; sb[E][6]="F5"; sb[E][7]="B0"; sb[E][8]="C8"; sb[E][9]="EB"; sb[E][A]="BB"; sb[E][B]="3C"; sb[E][C]="83"; sb[E][D]="53"; sb[E][E]="99"; sb[E][F]="61";
		sb[F][0]="17"; sb[F][1]="2B"; sb[F][2]="04"; sb[F][3]="7E"; sb[F][4]="BA"; sb[F][5]="77"; sb[F][6]="D6"; sb[F][7]="26"; sb[F][8]="E1"; sb[F][9]="69"; sb[F][A]="14"; sb[F][B]="63"; sb[F][C]="55"; sb[F][D]="21"; sb[F][E]="0C"; sb[F][F]="7D";
		
		/*
		for(int i=0;i<=F;i++){
			for(int j=0;j<=F;j++){
				System.out.print(sb[i][j]+" ");
			}System.out.println();
			
		}*/
		retVal=sb[c][d];
		//System.out.println(retVal);
	}
	
	public String returnVal(){
		return this.retVal;
	}
	
}
