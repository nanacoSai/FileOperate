package cn.chx.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileUtils {
    public static void fromFileToNewFile(String sourcePath, String newPath, String keyWord) {
        File file = new File(sourcePath);
        File newFile =new File(newPath);

        try{
            if(!file.exists()){
                System.err.println("source file not found..." + file.getAbsolutePath());
                return;
            }
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            //使用true，即进行append file
            FileWriter fileWritter = new FileWriter(newFile.getAbsoluteFile(),false);

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));//构造一个BufferedReader类来读取文件
            String line = null;
            while((line = br.readLine())!=null){//使用readLine方法，一次读一行
                if (line.contains(keyWord)) {
                    fileWritter.write(line);
                    fileWritter.write("\r\n");
                }
            }
            br.close();
            fileWritter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
