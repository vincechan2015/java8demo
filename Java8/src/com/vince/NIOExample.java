package com.vince;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOExample {

	public static void main(String[] args){
		new NIOExample().doNow();
	}
	
	private void doNow(){
		RandomAccessFile aFile;
		try {
			aFile = new RandomAccessFile("/Users/vincechan/Documents/workspace/javaStudy/Java8/src/com/vince/niodata.txt", "rw");
			
			FileChannel inChannel = aFile.getChannel();

		    ByteBuffer buf = ByteBuffer.allocate(48);

		    int bytesRead = inChannel.read(buf);
		    while (bytesRead != -1) {

		      System.out.println("Read " + bytesRead);
		      buf.flip();

		      while(buf.hasRemaining()){
		          System.out.print((char) buf.get());
		      }

		      buf.clear();
		      bytesRead = inChannel.read(buf);
		    }
		    aFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}
	
}


