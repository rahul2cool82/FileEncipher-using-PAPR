package algorithm;


public class Decrypt {
    
        String p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15;
	
	public Decrypt(String cipher,String k0,String k1,String k2,String k3,String k4,String k5,String k6,String k7,String k8,String k9,String k10,String k11,String k12,String k13,String k14,String k15){
		
		
		String Key=k15;
		String Plain="";
		InverseSBox isbox;
		
		int A=10,B=11,C=12,D=13,E=14,F=15;
		String[][] block=new String[4][4];
		
		
		//Round 0==================================================================================================
		
		
		Xor xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round0  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				int k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
		
		isbox=new InverseSBox(block[0][0]);
		block[0][0]=isbox.returnVal();
		isbox=new InverseSBox(block[0][1]);
		block[0][1]=isbox.returnVal();
		isbox=new InverseSBox(block[0][2]);
		block[0][2]=isbox.returnVal();
		isbox=new InverseSBox(block[0][3]);
		block[0][3]=isbox.returnVal();
		isbox=new InverseSBox(block[2][0]);
		block[2][0]=isbox.returnVal();
		isbox=new InverseSBox(block[3][1]);
		block[3][1]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p0=cipher;
		
		
		//Round 0 completed========================================================================================
		
		
		//Round 1==================================================================================================
		
		Key=k14;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round1  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
		
		isbox=new InverseSBox(block[0][1]);
		block[0][1]=isbox.returnVal();
		isbox=new InverseSBox(block[0][2]);
		block[0][2]=isbox.returnVal();
		isbox=new InverseSBox(block[0][3]);
		block[0][3]=isbox.returnVal();
		isbox=new InverseSBox(block[1][0]);
		block[1][0]=isbox.returnVal();
		isbox=new InverseSBox(block[1][1]);
		block[1][1]=isbox.returnVal();
		isbox=new InverseSBox(block[1][2]);
		block[1][2]=isbox.returnVal();
		isbox=new InverseSBox(block[1][3]);
		block[1][3]=isbox.returnVal();
		isbox=new InverseSBox(block[3][0]);
		block[3][0]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p1=cipher;
		
		//Round 1 completed========================================================================================

		//Round 2==================================================================================================
		
		Key=k13;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round2  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
		isbox=new InverseSBox(block[0][0]);
		block[0][0]=isbox.returnVal();
		isbox=new InverseSBox(block[0][1]);
		block[0][1]=isbox.returnVal();
		isbox=new InverseSBox(block[0][3]);
		block[0][3]=isbox.returnVal();
		isbox=new InverseSBox(block[1][1]);
		block[1][1]=isbox.returnVal();
		isbox=new InverseSBox(block[1][2]);
		block[1][2]=isbox.returnVal();
		isbox=new InverseSBox(block[1][3]);
		block[1][3]=isbox.returnVal();
		isbox=new InverseSBox(block[2][0]);
		block[2][0]=isbox.returnVal();
		isbox=new InverseSBox(block[2][1]);
		block[2][1]=isbox.returnVal();
		isbox=new InverseSBox(block[2][2]);
		block[2][2]=isbox.returnVal();
		isbox=new InverseSBox(block[2][3]);
		block[2][3]=isbox.returnVal();

		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p2=cipher;
                
		//Round 2 completed========================================================================================
		
		//Round 3==================================================================================================
		
		Key=k12;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round3  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
		isbox=new InverseSBox(block[0][0]);
		block[0][0]=isbox.returnVal();
		isbox=new InverseSBox(block[0][2]);
		block[0][2]=isbox.returnVal();
		isbox=new InverseSBox(block[0][3]);
		block[0][3]=isbox.returnVal();
		isbox=new InverseSBox(block[1][0]);
		block[1][0]=isbox.returnVal();
		isbox=new InverseSBox(block[1][1]);
		block[1][1]=isbox.returnVal();

		isbox=new InverseSBox(block[1][3]);
		block[1][3]=isbox.returnVal();

		isbox=new InverseSBox(block[2][1]);
		block[2][1]=isbox.returnVal();
		isbox=new InverseSBox(block[2][2]);
		block[2][2]=isbox.returnVal();
		isbox=new InverseSBox(block[2][3]);
		block[2][3]=isbox.returnVal();
		isbox=new InverseSBox(block[3][0]);
		block[3][0]=isbox.returnVal();
		isbox=new InverseSBox(block[3][1]);
		block[3][1]=isbox.returnVal();
		isbox=new InverseSBox(block[3][2]);
		block[3][2]=isbox.returnVal();
		isbox=new InverseSBox(block[3][3]);
		block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p3=cipher;
		
		//Round 3 completed========================================================================================
		
		//Round 4==================================================================================================
		
		Key=k11;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round4  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][0]);
				block[0][0]=isbox.returnVal();
				isbox=new InverseSBox(block[0][1]);
				block[0][1]=isbox.returnVal();
				isbox=new InverseSBox(block[0][2]);
				block[0][2]=isbox.returnVal();
				
				isbox=new InverseSBox(block[1][0]);
				block[1][0]=isbox.returnVal();
				isbox=new InverseSBox(block[1][2]);
				block[1][2]=isbox.returnVal();
				isbox=new InverseSBox(block[1][3]);
				block[1][3]=isbox.returnVal();
				isbox=new InverseSBox(block[2][0]);
				block[2][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][1]);
				block[2][1]=isbox.returnVal();
				isbox=new InverseSBox(block[2][3]);
				block[2][3]=isbox.returnVal();
				isbox=new InverseSBox(block[3][1]);
				block[3][1]=isbox.returnVal();
				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p4=cipher;
                
		//Round 4 completed========================================================================================
		
		//Round 5==================================================================================================
		
		Key=k10;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round5  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][2]);
				block[0][2]=isbox.returnVal();
				isbox=new InverseSBox(block[0][3]);
				block[0][3]=isbox.returnVal();
				isbox=new InverseSBox(block[1][0]);
				block[1][0]=isbox.returnVal();
				isbox=new InverseSBox(block[1][1]);
				block[1][1]=isbox.returnVal();
				isbox=new InverseSBox(block[1][2]);
				block[1][2]=isbox.returnVal();
				isbox=new InverseSBox(block[2][0]);
				block[2][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][2]);
				block[2][2]=isbox.returnVal();
				isbox=new InverseSBox(block[2][3]);
				block[2][3]=isbox.returnVal();
				isbox=new InverseSBox(block[3][0]);
				block[3][0]=isbox.returnVal();
				isbox=new InverseSBox(block[3][1]);
				block[3][1]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p5=cipher;
                
		//Round 5 completed========================================================================================

		//Round 6==================================================================================================
		
		Key=k9;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round6  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][1]);
				block[0][1]=isbox.returnVal();
				isbox=new InverseSBox(block[0][3]);
				block[0][3]=isbox.returnVal();
				isbox=new InverseSBox(block[1][2]);
				block[1][2]=isbox.returnVal();
				isbox=new InverseSBox(block[1][3]);
				block[1][3]=isbox.returnVal();
				isbox=new InverseSBox(block[2][0]);
				block[2][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][1]);
				block[2][1]=isbox.returnVal();
				isbox=new InverseSBox(block[2][2]);
				block[2][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][0]);
				block[3][0]=isbox.returnVal();
				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p6=cipher;
                
		//Round 6 completed========================================================================================
		
		//Round 7==================================================================================================
		
		Key=k8;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round7  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][1]);
				block[0][1]=isbox.returnVal();
				isbox=new InverseSBox(block[0][2]);
				block[0][2]=isbox.returnVal();
				isbox=new InverseSBox(block[1][1]);
				block[1][1]=isbox.returnVal();
				isbox=new InverseSBox(block[1][3]);
				block[1][3]=isbox.returnVal();
				isbox=new InverseSBox(block[2][2]);
				block[2][2]=isbox.returnVal();
				isbox=new InverseSBox(block[2][3]);
				block[2][3]=isbox.returnVal();
				isbox=new InverseSBox(block[3][0]);
				block[3][0]=isbox.returnVal();
				isbox=new InverseSBox(block[3][1]);
				block[3][1]=isbox.returnVal();
				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();
				
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p7=cipher;
                
		//Round 7 completed========================================================================================
		
		//Round 8==================================================================================================
		
		Key=k7;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round8  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][0]);
				block[0][0]=isbox.returnVal();
				isbox=new InverseSBox(block[0][3]);
				block[0][3]=isbox.returnVal();
				isbox=new InverseSBox(block[1][1]);
				block[1][1]=isbox.returnVal();
				isbox=new InverseSBox(block[1][2]);
				block[1][2]=isbox.returnVal();
				isbox=new InverseSBox(block[2][1]);
				block[2][1]=isbox.returnVal();
				isbox=new InverseSBox(block[2][3]);
				block[2][3]=isbox.returnVal();
				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p8=cipher;
                
		//Round 8 completed========================================================================================
		
		//Round 9==================================================================================================
		
		Key=k6;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round9  conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][0]);
				block[0][0]=isbox.returnVal();
				isbox=new InverseSBox(block[0][2]);
				block[0][2]=isbox.returnVal();
				isbox=new InverseSBox(block[1][0]);
				block[1][0]=isbox.returnVal();
				isbox=new InverseSBox(block[1][3]);
				block[1][3]=isbox.returnVal();
				isbox=new InverseSBox(block[2][1]);
				block[2][1]=isbox.returnVal();
				isbox=new InverseSBox(block[2][2]);
				block[2][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][1]);
				block[3][1]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
		p9=cipher;
                
		//Round 9 completed========================================================================================
		
		//Round10==================================================================================================
		
		Key=k5;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round10 conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][0]);
				block[0][0]=isbox.returnVal();
				isbox=new InverseSBox(block[0][1]);
				block[0][1]=isbox.returnVal();
				isbox=new InverseSBox(block[1][0]);
				block[1][0]=isbox.returnVal();
				isbox=new InverseSBox(block[1][2]);
				block[1][2]=isbox.returnVal();
				isbox=new InverseSBox(block[2][0]);
				block[2][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][3]);
				block[2][3]=isbox.returnVal();
				isbox=new InverseSBox(block[3][1]);
				block[3][1]=isbox.returnVal();
				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();
				
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p10=cipher;
		
		//Round10 completed========================================================================================
		
		//Round11==================================================================================================
		
		Key=k4;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round11 conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][3]);
				block[0][3]=isbox.returnVal();
				isbox=new InverseSBox(block[1][0]);
				block[1][0]=isbox.returnVal();
				isbox=new InverseSBox(block[1][1]);
				block[1][1]=isbox.returnVal();
				isbox=new InverseSBox(block[2][0]);
				block[2][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][2]);
				block[2][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][0]);
				block[3][0]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p11=cipher;
		
		//Round11 completed========================================================================================
		
		//Round12==================================================================================================
		
		Key=k3;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round12 conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		

				isbox=new InverseSBox(block[0][2]);
				block[0][2]=isbox.returnVal();

				isbox=new InverseSBox(block[1][3]);
				block[1][3]=isbox.returnVal();
				isbox=new InverseSBox(block[2][0]);
				block[2][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][1]);
				block[2][1]=isbox.returnVal();

				isbox=new InverseSBox(block[3][0]);
				block[3][0]=isbox.returnVal();

				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();

		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p12=cipher;
		
		//Round12 completed========================================================================================
		
		//Round13==================================================================================================
		
		Key=k2;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round13 conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][1]);
				block[0][1]=isbox.returnVal();
				isbox=new InverseSBox(block[1][2]);
				block[1][2]=isbox.returnVal();
				isbox=new InverseSBox(block[2][3]);
				block[2][3]=isbox.returnVal();
				isbox=new InverseSBox(block[3][0]);
				block[3][0]=isbox.returnVal();
				isbox=new InverseSBox(block[3][1]);
				block[3][1]=isbox.returnVal();
				
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p13=cipher;
		
		//Round13 completed========================================================================================
		
		//Round14==================================================================================================
		
		Key=k1;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round14 conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[0][0]);
				block[0][0]=isbox.returnVal();
				isbox=new InverseSBox(block[1][1]);
				block[1][1]=isbox.returnVal();
				isbox=new InverseSBox(block[2][2]);
				block[2][2]=isbox.returnVal();
				isbox=new InverseSBox(block[3][3]);
				block[3][3]=isbox.returnVal();
				
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p14=cipher;
		
		//Round14 completed========================================================================================
		
		//Round15==================================================================================================
		
		Key=k0;
		
		xor=new Xor(cipher,Key);
		Plain=xor.returnVal();
		//System.out.println("Round15 conversion="+Plain);
		cipher="";
		
		//Convert Plain to Block-----------------------------------------------------------------------------------
				k=0;
				for(int i=0;i<=3;i++){
					for(int j=0;j<=3;j++){
						block[i][j]=Plain.substring(k, k+2);
						k=k+2;
						//System.out.println(block[i][j]);
					}
				}
		
				isbox=new InverseSBox(block[1][0]);
				block[1][0]=isbox.returnVal();
				isbox=new InverseSBox(block[2][1]);
				block[2][1]=isbox.returnVal();
				isbox=new InverseSBox(block[3][2]);
				block[3][2]=isbox.returnVal();
		
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			//System.out.print(block[i][j]+" ");
				cipher=cipher+block[i][j];
			}//System.out.println();
		}//System.out.println("S Box   conversion="+cipher);
                p15=cipher;
		
		//Round15 completed========================================================================================

		
	}
        
        public String returnValue(){
            return this.p15;
        }
        

}
