package control;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import entity.TextGraph;
public class CqueryBridgeWordsTest {

	public TextGraph g;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQueryBridgeWords(){
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		CqueryBridgeWords t = new CqueryBridgeWords(g);
		
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
		
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
		
		CqueryBridgeWords t = new CqueryBridgeWords(g);
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
