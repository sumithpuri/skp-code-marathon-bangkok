/**
 * 
 */
package me.sumithpuri.github.bangkok.main;

import java.io.IOException;

import me.sumithpuri.github.bangkok.diamondsyntax.jdk7_DiamondSyntax;
import me.sumithpuri.github.bangkok.literals.jdk7_Literals;
import me.sumithpuri.github.bangkok.multipleexception.jdk7_MultipleExceptionHandling;
import me.sumithpuri.github.bangkok.stringsinswitch.jdk7_StringSwitch;
import me.sumithpuri.github.bangkok.trywithresources.jdk7_TryWithResources;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri
 *
 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/05/java-se-7-whats-new-part-0304.html	
 * Blog Short URL		https://goo.gl/hFXXuw
 * Package Prefix 		me.sumithpuri.github.bangkok
 * Project Codename		bangkok
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sublicense,and/or sell copies of the Software, and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/* 
 * You may run this main class to run all the Demo Code of the [Bangkok] Project. It demonstrates most important changes 
 * in Java 7.
 */
public class jdk7_Bangkok {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Bangkok");
		System.out.println("Project Description   Java 7 Companion Code Samples");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/hFXXuw");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[01. String Switch]");
		stringSwitch();
		System.out.println("------------------------------------------------------------");
		System.out.println("[02. Multiple Exception Handling]");
		multipleExceptionHandling();
		System.out.println("------------------------------------------------------------");
		System.out.println("[03. Literals]");
		literals();
		System.out.println("------------------------------------------------------------");
		System.out.println("[04. Diamond Syntax]");
		diamondSyntax();
		System.out.println("------------------------------------------------------------");
		System.out.println("[05. Try with Resources]");
		try {
			
			tryWithResources();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			//so that the exception prints out correctly, adding this sleep here!
			Thread.sleep(5);
			System.out.println("------------------------------------------------------------");
		}
	}	
	
	private static void stringSwitch() {
		
		jdk7_StringSwitch stringSwitch = new jdk7_StringSwitch();
		stringSwitch.demonstrate();
	}
	
	private static void multipleExceptionHandling() {
		
		jdk7_MultipleExceptionHandling multipleExceptionHandling = new jdk7_MultipleExceptionHandling();
		multipleExceptionHandling.demonstrate();
	}
	
	private static void literals() {
		
		jdk7_Literals literals = new jdk7_Literals();
		literals.demonstrate();
	}
	
	private static void diamondSyntax() {
		
		jdk7_DiamondSyntax diamondSyntax = new jdk7_DiamondSyntax();
		diamondSyntax.demonstrate();
	}
	
	private static void tryWithResources() throws IOException {
		
		jdk7_TryWithResources tryWithResources = new jdk7_TryWithResources();
		tryWithResources.demonstrate();
	}
}
