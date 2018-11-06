package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line = in.readLine();
        String xxx = new String("");
        while (line != null) {
            xxx = xxx + line;
            line = in.readLine();
            if (line != null) xxx = xxx + "\n";
        }
        in.close();
        return xxx;
    }

    public static void writeContentToFile(String path, String content) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(path, false));//false là ghi lại từ đầu - true là bổ xung nội dung mới vào cuối tệp
        //out.write("\n"); //remove comment nếu để thuộc tính append là true
        out.write(content);
        out.close();
    }

    public static File findFileByName(String folderPath, String fileName) {
        File dir = new File(folderPath);
        String[] children = dir.list();
        String file = null;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(fileName)) file = folderPath;
        }
        if (file == null) return new File("");
        else {
            file = file + "\\" + fileName;
            File findedFile = new File(file);
            return findedFile;
        }
    }

    public static void main(String[] args) {
        try {
            String path = "D:\\Documents\\Java\\oop2018\\src\\week9\\read.txt";
            String read = readContentFromFile(path);
            //System.out.println(read);
            System.out.println("..............................................");

            String path1 = "D:\\Documents\\Java\\oop2018\\src\\week9\\write.txt";
            writeContentToFile(path1, read);

            System.out.println("..............................................");

            String folferPath = "D:\\Documents\\Java\\oop2018\\src\\week9";
            String fileName = "read.txt";
            File file = findFileByName(folferPath, fileName);
            System.out.println(file.exists());
            //System.out.println(readContentFromFile(file.getPath()));
        } catch (IOException e) {
            System.out.println("ERROR!!! Kiểm tra lại đường dẫn hoặc tên file");
        }
    }
}
