package me.sumithpuri.github.bangkok.diamondsyntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
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
public class jdk7_DiamondSyntax {
	
	public static void main(String[] args) {
	
		demonstrate();
	}
	
	public static void demonstrate() {
		
		//this is useful for manageable and readable code, pre-java 7 this would have been a longer line of code
		//with java 7, the generics types are inferred
		Map<String, Map<String, List<String>>> list = new HashMap<>();
	
		System.out.println("[Nothing to Demonstrate - Follow the Codebase to Understand]");
		
		List<String> aList = new ArrayList<String>();
		aList.add("09.10");
		aList.add("09.20");
		aList.add("09.22");
		
		Map<String, List<String>> iMap = new HashMap<>();
		iMap.put("radiac", aList);
		list.put("radia", iMap);
	}
}
