import java.io.*;

public class LogMonitor {
    public static void main(String[] args) throws Exception {
        File logFile = new File("system.log");
        long filePointer = 0;

        while (true) {
            Thread.sleep(2000); // check every 2 seconds
            RandomAccessFile reader = new RandomAccessFile(logFile, "r");
            reader.seek(filePointer);

            String line;
            while ((line = reader.readLine()) != null) {
                processLogLine(line);
            }

            filePointer = reader.getFilePointer();
            reader.close();
        }
    }

    private static void processLogLine(String line) {
        if (line.contains("Failed login") || line.toLowerCase().contains("sql injection")) {
            System.out.println("⚠️ Intrusion Detected: " + line);
        }
    }
}

