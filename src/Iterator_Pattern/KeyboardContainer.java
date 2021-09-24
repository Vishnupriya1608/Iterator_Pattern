package Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;


public class KeyboardContainer implements IContainer {

private List<String> keyboardlist = new ArrayList<String>();
	
	public KeyboardContainer() {
		keyboardlist.add("Gaming Keyboard");
		keyboardlist.add("International Keyboard");
		keyboardlist.add("QWERTY Keyboard");
		keyboardlist.add("Wireless Keyboard");
	}
	public IIterator createIterator() {
		KeyboardIterator result = new KeyboardIterator();
		return result;	
	}
	private class KeyboardIterator implements IIterator {
		
		public boolean hasNext() {
			
			if (keyboardlist.size()> 0)
				return true;
			else
				return false;
		}
		public Object next() {
			if (this.hasNext()) {
				String keyboard = keyboardlist.get(0);
				keyboardlist.remove(0);
				return keyboard;	
			}	
			else
				return null;
		}
		
	}

}
