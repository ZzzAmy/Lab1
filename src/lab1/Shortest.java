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
public class Shortest {

	Graph g = new Graph();
	Text t = new Text(g);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcShortestPath1(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	public void testCalcShortestPath2(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	
	//@Test
	/*public void testCalcShortestPath3(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	public void testCalcShortestPath4(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	*/
	
	@Test
	public void testCalcShortestPath5(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	public void testCalcShortestPath6(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	public void testCalcShortestPath7(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
	public void testCalcShortestPath8(){
		List<String> stringlist = new ArrayList<String>();
		try
		{
			String encoding = "GBK";
			File file = new File("testshortest.csv");
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
				res = t.calcShortestPath(aa[0], aa[1]);
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
