import java.io.*;
public class FileHandling {

     String fileName;

     // Function for creating new file
     public void createFile(String fileName) throws IOException {
         File file = new File(fileName);

         if(file.exists()){
             System.out.println("This File already exist ! ");
         }
         else{
             file.createNewFile();
             System.out.println("New File been created successfully ! ");
         }

         this.fileName = fileName;
     }



     // Function for writing data in a file
     public void writeFile(String data) throws IOException{
         FileWriter fw = new FileWriter(this.fileName);
         BufferedWriter bw = new BufferedWriter(fw);
         fw.write(data);
         fw.close();
     }



    // Function for reading data from a file
    public void readFile(String fileName) throws IOException{
         FileReader fr = new FileReader(fileName);
         BufferedReader br = new BufferedReader(fr);
         String data;
         while ((data = br.readLine()) != null) {
             System.out.println(data);
         }
         br.close();
    }



}
