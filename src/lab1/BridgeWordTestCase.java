package lab1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BridgeWordTestCase {
	
	Graph g = new Graph();
	Text t = new Text(g);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testQueryBridgeWords(){
		
		//int num2 = 1 / 0;
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(0).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
		
	}
	
	@Test
	public void testQueryBridgeWords2() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(1).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	public void testQueryBridgeWords3() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(2).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	public void testQueryBridgeWords4() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(3).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	public void testQueryBridgeWords5() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(4).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	public void testQueryBridgeWords6() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(5).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	public void testQueryBridgeWords7() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(6).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	@Test
	public void testQueryBridgeWords8() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(7).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	public void testQueryBridgeWords9() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(8).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	@Test
	public void testQueryBridgeWords10() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(9).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	@Test
	public void testQueryBridgeWords11() {
		
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testbridge.csv");
			if(file.isFile() && file.exists())
			{
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding
						);
				BufferedReader buffreader = new BufferedReader(read);
				String lineText = null;
				while((lineText = buffreader.readLine()) != null)
				{
					stringlist.add(lineText);
				}
				buffreader.close();
				read.close();
				String res = new String();
				String[] aa =stringlist.get(10).split(",");
				res = t.queryBridgeWords(aa[0], aa[1]);
				assertEquals(aa[2],res);
			}
			else
			{
				System.out.println("找不到该文件");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}

}

//for(int i=0;i<stringlist.size();i++)
//{
//	String[] aa =stringlist.get(i).split(",");
//	res = t.queryBridgeWords(aa[0], aa[1]);
//	assertEquals(aa[2],res);
//}