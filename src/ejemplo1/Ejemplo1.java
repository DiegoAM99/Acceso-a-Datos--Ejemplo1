/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xp
 */
public class Ejemplo1 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f= new File("proyecto\\1.txt");
        
        if(f.exists()){
            System.out.println ("Nombre: " + f.getName() );
            System.out.println ("Directorio padre: " + f.getParent() );
            System.out.println ("Ruta relativa: " + f.getPath() );
            System.out.println ("Ruta absoluta: " + f.getAbsolutePath() );
        }
        
        System.out.println("----------------------------");
        
        Ejemplo1 obj_fichero = new Ejemplo1();
        
        System.out.println("LOL");
        obj_fichero.EscribeFicheroTextoFileWriter();
        obj_fichero.LeerFichero();
        
        System.out.println("------------------------------");
        
    }
    
    public void EscribeFicheroTextoFileWriter() {
        //Crea el String con la cadena XML
        String texto = "Hola";
            //Guarda en la variable nombre el nombre del archivo que se creará.
        String nombre = "1.xml";
            try{
                //Se crea un Nuevo objeto FileWriter
                    FileWriter fichero = new FileWriter (nombre);
                //Se escribe el fichero
                       fichero.write(texto + "\r\n");
                //Se cierra el fichero
                        fichero.close();
                }catch (IOException ex){
                    System.out.println("error al acceder al fichero"); }
    }
    public int LeerFichero() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("1.xml");
        int aux = fr.read();
        while(aux !=-1){
           fr.read();    
        }
            return -1;
    }
//    //public void EscribeFicheroTextoFileWriter() {
///////////////////////Crea el String con la cadena XML
//                    String texto = "vamos a escribir en el fichero";
///////////////////////Guarda en la variable nombre el nombre del archivo que se creará.
//                    String nombre = "pepe.txt";
//                    try{
//////////////////////Se crea un Nuevo objeto FileWriter
//                    FileWriter fichero = new FileWriter ("pepe.txt");
//////////////////////Se escribe el fichero
//                    fichero.write(texto + "\r\n");
//                    while (equals(texto)){
//                        
//                    
//                    
//                    }
//////////////////////// Se cierra el fichero
//                    fichero.close();
//                    }catch (IOException ex){
//                    System.out.println("error al acceder al fichero"); 
//                    }
//}
//            public void LeerFicheroTextoFileReader() {
//////////////////////// se hace un try para poder acceder al fichero guardandolo en un buffer que tiene un strin en blanco.                 
//                    try{
//                   FileReader fichero = new FileReader ("pepe.txt");
//                   BufferedReader miBuffer =new  BufferedReader(fichero);
//                   String linea=" ";
////////////////////////  while  para leer fichero almacenandolo en un buffer todo el texto y que valla leyendo mas rapido de linea en linea                
//                           while(linea!=null){
//                            linea=miBuffer.readLine();
//                            
//                             if(linea!=null)   
//                            System.out.println(linea);
//                        }
////                        fichero.close();
//                           
//                           
//////////////////////// while para leer el fichero de letra en letra el ordenado busca una letra en el fichero y vuelve a si todo el rato                          
////                        int c=0; 
////                        while(c!=-1){
////                            c=fichero.read();
////                            char leer =(char)c;
////                            System.out.print(leer);   
////                        }
////                        fichero.close();
// 
//                    }catch (IOException ex){
//                    System.out.println("error al acceder al fichero"); }
//}
}
