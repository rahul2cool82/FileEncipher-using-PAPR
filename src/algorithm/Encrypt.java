package algorithm;


public class Encrypt {
	
	String c0,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	
	public Encrypt(String Plain,String k0,String k1,String k2,String k3,String k4,String k5,String k6,String k7,String k8,String k9,String k10,String k11,String k12,String k13,String k14,String k15){
		
		
		String Key=k0;
		
		String cipher="";
		int A=10,B=11,C=12,D=13,E=14,F=15;
		String[][] block=new String[4][4];
				
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				int k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
				
		//Round 0==================================================================================================
				
				Plain="";
				
				SBox sbox=new SBox(block[1][0]);
				block[1][0]=sbox.returnVal();
				sbox=new SBox(block[2][1]);
				block[2][1]=sbox.returnVal();
				sbox=new SBox(block[3][2]);
				block[3][2]=sbox.returnVal();
				//System.out.println(block[0][0]);
				
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						//System.out.print(block[i][j]+" ");
						Plain=Plain+block[i][j];
					}//System.out.println();
				}//System.out.println("S Box   conversion="+Plain);
				
				Xor xor=new Xor(Plain,Key);
				cipher=xor.returnVal();
                                c0=cipher;
				//System.out.println("Round0  conversion="+cipher);
				
		//Round 0 completed========================================================================================
		
		//System.out.println("bawa yeh plain new h="+Plain);
				//Correct******************************************************************************************
		//Convert Plain to Block-----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		
		//Round 1==================================================================================================
		
		Plain="";
		Key=k1;
		
		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);
		
		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c1=cipher;
		//System.out.println("Round1  conversion="+cipher);
		
		//Round 1 completed========================================================================================
			
				//Correct******************************************************************************************
		
		Plain=cipher;
		//Convert Cipher to Block----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=cipher.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
		
		//Round 2==================================================================================================
		
		Plain=cipher;
		Key=k2;
		Plain="";
		
		
		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		//System.out.println(block[0][0]);
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);
		
		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c2=cipher;
		//System.out.println("Round2  conversion="+cipher);
		
		//Round 2 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=cipher.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		//Round 3==================================================================================================
		
		Plain=cipher;
		Key=k3;
		Plain="";
				
				
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		//System.out.println(block[0][0]);
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);
		
		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c3=cipher;
		//System.out.println("Round3  conversion="+cipher);
		
		//Round 3 Completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
			
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 4==================================================================================================

		Plain=cipher;
		Key=k4;
		Plain="";
		
		
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c4=cipher;
		//System.out.println("Round4  conversion="+cipher);

		//Round 4 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=cipher.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
		
		//Round 5==================================================================================================

		
		Key=k5;
		Plain="";
	
	
		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c5=cipher;
		//System.out.println("Round5  conversion="+cipher);

		
		//Round 5 Completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 6==================================================================================================


		Key=k6;
		Plain="";


		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c6=cipher;
		//System.out.println("Round6  conversion="+cipher);

		//Round6 completed=========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 7==================================================================================================


		Key=k7;
		Plain="";


		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c7=cipher;
		//System.out.println("Round7  conversion="+cipher);

		//Round7 completed=========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 8==================================================================================================


		Key=k8;
		Plain="";


		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c8=cipher;
		//System.out.println("Round8 conversion="+cipher);

		//Round8 completed=========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 9==================================================================================================


		Key=k9;
		Plain="";


		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c9=cipher;
		//System.out.println("Round9 conversion="+cipher);

		//Round9 completed=========================================================================================
		
				//Correct******************************************************************************************
		
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 10=================================================================================================


		Key=k10;
		Plain="";


		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c10=cipher;
		//System.out.println("Round10 conversion="+cipher);

		//Round10 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 11=================================================================================================


		Key=k11;
		Plain="";
		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c11=cipher;
		//System.out.println("Round11 conversion="+cipher);

		//Round11 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 12=================================================================================================


		Key=k12;
		Plain="";
		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		sbox=new SBox(block[3][2]);
		block[3][2]=sbox.returnVal();
		sbox=new SBox(block[3][3]);
		block[3][3]=sbox.returnVal();
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c12=cipher;
		//System.out.println("Round12 conversion="+cipher);

		//Round12 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 13=================================================================================================


		Key=k13;
		Plain="";
		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[2][1]);
		block[2][1]=sbox.returnVal();
		sbox=new SBox(block[2][2]);
		block[2][2]=sbox.returnVal();
		sbox=new SBox(block[2][3]);
		block[2][3]=sbox.returnVal();
		
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c13=cipher;
		//System.out.println("Round13 conversion="+cipher);

		//Round13 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 14=================================================================================================


		Key=k14;
		Plain="";
		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[1][0]);
		block[1][0]=sbox.returnVal();
		sbox=new SBox(block[1][1]);
		block[1][1]=sbox.returnVal();
		sbox=new SBox(block[1][2]);
		block[1][2]=sbox.returnVal();
		sbox=new SBox(block[1][3]);
		block[1][3]=sbox.returnVal();
		sbox=new SBox(block[3][0]);
		block[3][0]=sbox.returnVal();
		
		
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c14=cipher;
		//System.out.println("Round14 conversion="+cipher);

		//Round14 completed========================================================================================
		
				//Correct******************************************************************************************
		
		Plain=cipher;
		
		//Convert Cipher to Block----------------------------------------------------------------------------------
		k=0;
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				block[i][j]=cipher.substring(k, k+2);
				k=k+2;
				//System.out.println(block[i][j]);
			}
		}
		//Round 15=================================================================================================


		Key=k15;
		Plain="";
		sbox=new SBox(block[0][0]);
		block[0][0]=sbox.returnVal();
		sbox=new SBox(block[0][1]);
		block[0][1]=sbox.returnVal();
		sbox=new SBox(block[0][2]);
		block[0][2]=sbox.returnVal();
		sbox=new SBox(block[0][3]);
		block[0][3]=sbox.returnVal();
		sbox=new SBox(block[2][0]);
		block[2][0]=sbox.returnVal();
		sbox=new SBox(block[3][1]);
		block[3][1]=sbox.returnVal();
		
		//System.out.println(block[0][0]);

		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				Plain=Plain+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+Plain);

		xor=new Xor(Plain,Key);
		cipher=xor.returnVal();
                c15=cipher;
		//System.out.println("Round15 conversion="+cipher);

		//Round15 completed========================================================================================
		
				//Correct******************************************************************************************
		
	}
        
        public String returnValue(){
            return this.c15;
        }
	

	
}
