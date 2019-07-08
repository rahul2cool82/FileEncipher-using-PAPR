/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Writer;
import java.math.BigInteger;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import sun.misc.BASE64Encoder;

 /**
 *
 * @author Ra
 */
public class Crypto {
    String Hexa;
    String[] data,cipher;
    int blocks;
    int zeros;
    String newString="",Cipher="";
    
    
       public Crypto(String key, String ipfile, String opfile, String ext){
        
        Encrypt encryption;
	File inputFile = new File(ipfile);
	File encryptedFile = new File(opfile+"\\encrypted file"+ext);
	try{
            FileInputStream inputStream=new FileInputStream(inputFile);
            byte[] inputBytes=new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);
            Hexa=DatatypeConverter.printHexBinary(inputBytes);
            zeros=Hexa.length()%32;
            System.out.println(Hexa.length());
            //System.out.println(zeros);
            for(int i=0;i<32-zeros;i++){
                newString+=0;
            }
            Hexa=newString+Hexa;
            inputStream.close();
            System.out.println(Hexa.length());
            
        }catch(Exception e){
            
        }
        
        blocks=Hexa.length()/32;
           System.out.println(blocks);
        data=new String[blocks];
        cipher=new String[blocks];
        int a,b;
        for(int i=0;i<blocks;i++){
            data[i]="";
            a=i*32;
            b=((i+1)*32);
            data[i]=Hexa.substring(a, b);            //System.out.println(data[i]);
            
            //encryption=new Encryption1(data[i]);
            //cipher[i]=encryption.returnValue();
            //System.out.println(cipher[i]);
            
        }
        
        String Key=key;
	int y=0,z=32;
	String keys[];
	keys=new String[16];
	int flag=Key.length()/32;
	//System.out.println(Key.length());
	if(Key.length()>=32){
		for(int i=0;i<16;i++){
			if(flag>=1){
				//System.out.println("Flag="+flag);
				keys[i]=Key.substring(y, z);
				y=y+32;
				z=z+32;
				//System.out.println(key[i].length());
				flag--;
			}else{
				//System.out.println("Flag Over");
				
                                keys[i]="";
				//System.out.println(key[i]);
			}
		}
	}
		
	String hk0,hk1,hk2,hk3,hk4,hk5,hk6,hk7,hk8,hk9,hk10,hk11,hk12,hk13,hk14,hk15;
		
		
	HexaToBinary htb=new HexaToBinary(Key);
	hk0=htb.Key0(keys[0]);
	hk1=htb.Key1(keys[1]);
	hk2=htb.Key2(keys[2]);
	hk3=htb.Key3(keys[3]);
	hk4=htb.Key4(keys[4]);
	hk5=htb.Key5(keys[5]);
	hk6=htb.Key6(keys[6]);
	hk7=htb.Key7(keys[7]);
	hk8=htb.Key8(keys[8]);
	hk9=htb.Key9(keys[9]);
	hk10=htb.Key10(keys[10]);
	hk11=htb.Key11(keys[11]);
	hk12=htb.Key12(keys[12]);
	hk13=htb.Key13(keys[13]);
	hk14=htb.Key14(keys[14]);
	hk15=htb.Key15(keys[15]);
        System.out.println("Data is: "+data[1]);
        //System.out.println(cipher[blocks-12]);
       
       
        for(int i=0;i<blocks;i++){
            
            
            encryption=new Encrypt(data[i],hk0,hk1,hk2,hk3,hk4,hk5,hk6,hk7,hk8,hk9,hk10,hk11,hk12,hk13,hk14,hk15);
            cipher[i]=encryption.returnValue();
            //System.out.println(cipher[i]);
            Cipher=Cipher+cipher[i];
            
        }
        
        byte[] outputBytes=DatatypeConverter.parseHexBinary(Cipher);
        //System.out.println(outputBytes.length);
        try{
            
            FileOutputStream outputStream=new FileOutputStream(encryptedFile);
            
            outputStream.write(outputBytes);
            outputStream.close();
            
        }catch(Exception e){
            
        }
            
        //System.out.println("Cipher is: "+newString);
    }
	
     
}
