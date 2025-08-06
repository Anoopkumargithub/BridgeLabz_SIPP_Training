package Java_IO_Stream;

import java.io.*;

/**
* Demonstrates the use of FileInputStream to read raw bytes from a file.
*
* File I/O Concepts Covered:
*
* FileInputStream:
* - Reads bytes from a file (binary data)
* - Commonly used for binary files (images, audio, etc.)
* - Not suitable for character encoding-sensitive text
*
* File:
* - Represents a file or directory path
* - Methods: exists(), delete(), getName(), getAbsolutePath(), length()
*
* Common Methods Used:
* - read(): Reads one byte at a time, returns -1 at end of file
* - close(): Closes the stream
*
* Related Output Classes:
* - FileOutputStream: For writing bytes to a file
* - BufferedInputStream: Adds buffering to FileInputStream
* - DataInputStream: Reads primitive types in a machine-independent way
*/

public class ByteStreamExample {
public static void main(String[] args) {
// File object pointing to the file to be read
File file = new File("src/fileReading/byte-file.txt");

// Print file's absolute path
System.out.println("Looking for file at: " + file.getAbsolutePath());

// FileInputStream reads bytes one at a time
try (FileInputStream fis = new FileInputStream(file)) {
int data;

// Read each byte until end of file
while ((data = fis.read()) != -1) {
// Cast byte to char and print
System.out.print((char) data);
}

} catch (IOException e) {
// Handle file not found or read error
System.out.println("An error occurred while reading the file.");
e.printStackTrace();
}
}
}