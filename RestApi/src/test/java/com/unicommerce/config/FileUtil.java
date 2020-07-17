package com.unicommerce.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class FileUtil {
    Properties prop=new Properties();
    FileInputStream input=null;
    String value;

    public static String separator=File.separator;
//public static String fileName = separator + "Constant.cfg";

    public String getConstants(String constant) throws FileNotFoundException
    {


        String path=System.getProperty("user.dir")+separator+"environment.cfg";


        File fw=new File(path);
        if(fw.exists())
        {
            input = new FileInputStream(path);
            System.out.println("file found");
        }
        try {
            prop.load(input);
            System.out.println("properties loaded");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        value=prop.getProperty("environment");

        path=System.getProperty("user.dir")+separator+value+".cfg";
        System.out.println(path);
        fw=new File(path);
        if(fw.exists())
        {
            input = new FileInputStream(path);

        }
        try {
            prop.load(input);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        value=prop.getProperty(constant);

        return value;


    }
    public String getEnvironment()
    {
        value=System.getProperty("os.name");
        return value;

    }
    public String getPath()
    {
        String value=System.getProperty("user.dir")+separator;
        return value;

    }
    public static String createFile(String fileName) {

        String userHome = System.getProperty("user.dir");

        try {

            //System.out.println(userHome + separator + fileName);
            File file = new File(userHome + separator + fileName);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public FileReader openOrCreateFileToRead(String filePath) throws IOException{
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file.getName());
        return fileReader;
    }

    public FileWriter openOrCreateFileToWrite(String filePath, boolean appendModeOrNot) throws IOException{
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file.getName(),appendModeOrNot);
        return fileWriter;
    }
}
