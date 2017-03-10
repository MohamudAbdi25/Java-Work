import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Scanner;

public class EncryptFileData

{

     public static void main(String args[]) throws IOException, FileNotFoundException

     {

          String inputFileName="input.txt";

          String outputFileName="EncryptedFile.txt";

          String decryptFileName="DecryptedFile.txt";

          byte codeValue;

          Scanner sc=new Scanner(System.in);

          //Accept code value from user

          System.out.println("Enter the value of code");

          codeValue=sc.nextByte();

          //Encrypt the input file

          encryptFileContent(inputFileName, codeValue,outputFileName);

          //Decrypt the input file

          decryptFileContent(outputFileName, codeValue,decryptFileName);

         

     }

     //function to encrypt the input file

     private static void encryptFileContent(String inputFileName,

              byte encodeValue, String outputFileName) throws IOException, FileNotFoundException{

          File file = new File(inputFileName);

         

          FileInputStream fin = new FileInputStream(file);

          FileOutputStream fout = new FileOutputStream(outputFileName);

         

          try{

              while(fin.available() != 0){

                   int inData = fin.read();

                   //For every character in input add code value and

                   //write result to file "EncryptedFile.txt"

                   fout.write(inData+encodeValue);

              }

          }finally{

              fin.close();

              fout.close();

          }

         

     }

     //function to decrypt the encrypted file

     private static void decryptFileContent(String inputFileName,

              byte encodeValue, String outputFileName) throws IOException, FileNotFoundException{

          File file = new File(inputFileName);

          FileInputStream fin = new FileInputStream(file);

          FileOutputStream fout = new FileOutputStream(outputFileName);

          try{

              while(fin.available() != 0){

                   int inData = fin.read();

                   //For every character in encrypted file

                   //subtract the code value from each character and

                   //write it to file "DecryptedFile.txt"

                   fout.write(inData-encodeValue);

              }

          }finally{         

              fin.close();

              fout.close();

          }

         

     }

}