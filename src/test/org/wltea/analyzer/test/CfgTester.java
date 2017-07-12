/**
 * 
 */
package org.wltea.analyzer.test;

import junit.framework.TestCase;
import org.wltea.analyzer.cfg.Configuration;



/**
 * @author Administrator
 *
 */
public class CfgTester extends TestCase {
	
	public void testCfgLoading(){
		System.out.println(Configuration.getExtDictionarys().size());
		System.out.println(Configuration.getExtStopWordDictionarys().size());
	}

}
