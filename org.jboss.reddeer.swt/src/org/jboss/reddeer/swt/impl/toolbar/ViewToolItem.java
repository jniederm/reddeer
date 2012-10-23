package org.jboss.reddeer.swt.impl.toolbar;

import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarPushButton;
import org.hamcrest.Matcher;
import org.jboss.reddeer.swt.exception.Thrower;
import org.jboss.reddeer.swt.lookup.impl.ToolBarLookup;
import org.jboss.reddeer.swt.matcher.TextMatcher;
import org.jboss.reddeer.swt.util.Bot;


/**
 * ViewToolItem implementation. It expect view where toolbar should be found has 
 * @author Jiri Peterka
 *
 */
public class ViewToolItem extends AbstractToolItem {
 
		
	/**
	 * Lookup for ToolItem with given Tooltip
	 * @param tooltip assigned to a ToolItem
	 */
	public ViewToolItem(String tooltip) {
		this(new TextMatcher(tooltip));
	}
	
	public ViewToolItem(Matcher<String> matcher) {
		ToolBarLookup tl = new ToolBarLookup();
		ToolBar workbenchToolBar = tl.getViewToolbar();
		ToolItem ti = tl.getToolItem(workbenchToolBar, matcher);
		Thrower.objectIsNull(tl, "ToolItem with toolTip " + matcher.toString() + " cannot be found" );
		toolItem = ti;
	}
}
