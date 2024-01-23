import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Principal<T>{
    BufferedReader br=null;
    FileReader reader=null;
    String line=null;
    public void cargarArchivo(String archivo){
        try{
            File doc = new File(archivo);
            reader = new FileReader(doc);
            br= new BufferedReader(reader);
            ArrayList<String> datos= new ArrayList<>();
            while ((line=br.readLine())!= null){
                datos.add(line.toString());
            }
            for (String num:datos){
                System.out.println(num);
            }
    }
    catch(Exception a){
        throw new RuntimeException("Error");
    }
}
}
