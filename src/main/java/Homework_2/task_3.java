package Homework_2;

// Напишите метод, который определит тип (расширение) файлов из текущей папки и
// выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

import java.io.File;

public class task_3 {
    public static void main(String[] args){
        File folder = new File("F:\\курс разработчик\\курс java\\Homework");
        getFileExtensionInFolder(folder);
    }

    public static void getFileExtensionInFolder(File folder){
        if(folder.isDirectory()){
            File[] folderFile = folder.listFiles();
            if (folderFile != null){
                for (File file : folderFile){
                    if(file.isDirectory()){
                        getFileExtensionInFolder(file);
                    }else{
                        String fileName = file.getName();
                        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0){

                            System.out.printf("Расширение файла: %s\n", fileName.substring(fileName.lastIndexOf(".")+1));
                        }
                    }
                }
            }
        }
    }
}
