package br.com.projeto.valuelist;

import java.util.List;

public interface ValueListIterator {
	int getSize();
	Object getCurrentElement();
	List getPreviousElements(int count);
	List getNextElements(int count);
	void resetIndex();
}
