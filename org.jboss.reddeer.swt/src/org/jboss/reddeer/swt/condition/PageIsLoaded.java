package org.jboss.reddeer.swt.condition;

import org.jboss.reddeer.swt.api.Browser;
import org.jboss.reddeer.swt.condition.WaitCondition;
/**
 * Condition is fulfilled when page is fully loaded into Browser
 * @author Vlado Pakan
 *
 */
public class PageIsLoaded implements WaitCondition {
	
    private Browser browser;
    
    public PageIsLoaded(Browser browser){
    	this.browser = browser;
 	}

	@Override
	public boolean test() {
		return browser.isPageLoaded();
	}
	@Override
	public String description() {
		return "Page is fully loaded to browser";
	}

}
