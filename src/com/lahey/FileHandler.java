package com.lahey;

import java.io.*;
/**
 * @author jack lahey
 */
public class FileHandler {

    private static String fileName = "Resume.txt";

    private static FileWriter fileWriter = null;
    private static BufferedWriter bufferedWriter = null;
    private static FileReader fileReader = null;
    private static BufferedReader bufferedReader = null;
    private static boolean bAppend = false;


    //*************************************************************************
    //* Constructors
    //*************************************************************************

    /**
     * Default constructor opens file
     */
    public FileHandler() {

        openFile();
    }

    /**
     * Overloaded constructor takes a file name as a string and opens that file
     *
     * @param newFileName   name of file to open
     */
    public FileHandler(String newFileName ) {

        fileName = newFileName;
        openFile();
    }


    /**
     * Overloaded constructor takes a file name as a string and opens that file
     * also takes a boolean to determine whether to append if exists
     * or to the file
     * @param newFileName   name of file to open
     * @param append        if file exists, append if true, truncate if false
     */
    public FileHandler(String newFileName, boolean append) {

        fileName = newFileName;
        bAppend = append;
        openFile();
    }


    //*************************************************************************
    //* other methods
    //*************************************************************************

    /**
     * Open file
     *
     * if file exists && append is true, appends to the file
     * if file exists && append is false, truncates the file
     */
    private void openFile() {


        try {
            // Assume default encoding.
            fileWriter = new FileWriter(fileName, bAppend);

            // Always wrap FileWriter in BufferedWriter.
            bufferedWriter = new BufferedWriter(fileWriter);

            // FileReader reads text files in the default encoding.
            fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            bufferedReader = new BufferedReader(fileReader);

        } catch (IOException e) {

            System.out.println("Error opening file '" + fileName + "'");
            e.printStackTrace();
        }

    }//end private void openFile()


    /**
     * Write to file
     *
     * @param sOutputString data to write to file
     */
    public void writeToFile(String sOutputString) {

        try {

            bufferedWriter.write(sOutputString);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {

            System.out.println("Error writing to file '" + fileName + "'");
            e.printStackTrace();
        }

    }//end public void writeToFile(String sElizaOut)


    /**
     * Write to file
     */
    public void writeToFile() {

        String sOutput = "";

        try {
            while ((sOutput = bufferedReader.readLine()) != null) {

                System.out.println(sOutput);
            }

        } catch (IOException e) {

            System.out.println("Error writing to file '" + fileName + "'");
            e.printStackTrace();
        }

    }//end public String readFile()


    /**
     * Close file
     */
    public void closeFile() {

        try {

            bufferedWriter.close();

        } catch (IOException e) {

            System.out.println("Error writing to file '" + fileName + "'");
            e.printStackTrace();
        }

    }//end public void closeFile()


}//end public class FileHandler