package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.awt.SystemColor.text;

public class Main {

    public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder();
        String path = "D://Games//";

        File src = new File(path + "src");
        if (src.mkdir()) {
            sb.append("Директория src создана \n");
        }
        File res = new File(path + "res");
        if (res.mkdir()) {
            sb.append("Директория res создана \n");
        }
        File savegames = new File(path + "savegames");
        if (savegames.mkdir()) {
            sb.append("Директория savegames добавлена \n");
        }
        File temp = new File(path + "temp");
        if (temp.mkdir()) {
            sb.append("Директория temp добавлена \n");
        }
        File main = new File(path + "src//main");
        if (main.mkdir()) {
            sb.append("Директория main добавлена \n");
        }
        File test = new File(path + "src//test");
        if (main.mkdir()) {
            sb.append("Директория test добавлена \n");
        }
        File mainJava = new File(path + "src//main//Main.java");
        try {
            if (mainJava.createNewFile()) {
                sb.append("Файл Main.java создан \n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File utilsJava = new File(path + "src//main//Utils.java");
        try {
            if (utilsJava.createNewFile()) {
                sb.append("Файл Utils.java создан \n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File drawables = new File(path + "res//drawables");
        if (drawables.mkdir()) {
            sb.append("Директория drawables добавлена \n");
        }
        File vectors = new File(path + "res//vectors");
        if (vectors.mkdir()) {
            sb.append("Директория vectors добавлена \n");
        }
        File icons = new File(path + "res//icons");
        if (icons.mkdir()) {
            sb.append("Директория icons добавлена \n");
        }
        File tempTxt = new File(path + "temp//text.txt");
        try {
            if (tempTxt.createNewFile()) {
                sb.append("Файл text.txt создан \n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter(path + "temp//text.txt")) {
            writer.write(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }


    }
}
