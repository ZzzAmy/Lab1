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

public class CcalcShortestPathTest {

	public TextGraph g;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcShortestPath1(){
		CcalcShortestPath t = new CcalcShortestPath(g);
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
				System.out.println(aa[0]);
				System.out.println(aa[1]);
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
		CcalcShortestPath t = new CcalcShortestPath(g);
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
	
	@Test
	public void testCalcShortestPath3(){
		CcalcShortestPath t = new CcalcShortestPath(g);
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
		CcalcShortestPath t = new CcalcShortestPath(g);
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
	
	
	@Test
	public void testCalcShortestPath5(){
		CcalcShortestPath t = new CcalcShortestPath(g);
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
		CcalcShortestPath t = new CcalcShortestPath(g);
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
		CcalcShortestPath t = new CcalcShortestPath(g);
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
		CcalcShortestPath t = new CcalcShortestPath(g);
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
