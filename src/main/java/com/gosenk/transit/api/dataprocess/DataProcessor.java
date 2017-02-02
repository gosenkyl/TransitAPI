package com.gosenk.transit.api.dataprocess;

import com.gosenk.transit.api.exception.UnexpectedDataException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;

abstract class DataProcessor implements BaseDataProcess {

    private String className;
    private String fileName;
    private String expectedColumns;
    private String fileLocation = "data";

    public DataProcessor(String className, String fileName, String expectedColumns){
        this.className = className;
        this.fileName = fileName;
        this.expectedColumns = expectedColumns;
    }

    public DataProcessor(String className, String fileName, String expectedColumns, String fileLocation){
        this.className = className;
        this.fileName = fileName;
        this.expectedColumns = expectedColumns;
        this.fileLocation = fileLocation;
    }

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public String process() throws Exception{
        return getData();
    }

    protected String getData() throws Exception {
        FileReader fileReader = new FileReader(fileLocation + "/" + fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        int i = 0;
        while((line = bufferedReader.readLine()) != null){

            if(line.trim().length() == 0){
                continue;
            }

            System.out.println(line);

            String[] columns = line.trim().split(",", -1);

            if(i == 0){
                if(expectedColumns.equals(line.trim()) == false){
                    throw new UnexpectedDataException(expectedColumns, line.trim());
                }
            } else {
                processData(columns);
            }

            i++;
        }

        return formatResults(i);
    }

    private String formatResults(int i){
        int count = i > 0 ? i - 1 : 0;

        StringBuffer sb = new StringBuffer();
        sb.append(className + ": ");
        sb.append("\t" + count);

        return sb.toString();
    }

    protected void processData(String[] columns) throws Exception{
        // Override this
    }
}
