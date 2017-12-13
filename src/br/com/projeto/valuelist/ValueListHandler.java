package br.com.projeto.valuelist;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ValueListHandler implements ValueListIterator {
	protected List list;
	protected ListIterator listIterator;
	 
	 
	 
	protected void setList(List list)  {
		 if(list!=null) {
			    this.list = list;
			    listIterator =  list.listIterator();
		 }
	}
	
	public Collection getList(){
	    return list;
	  }
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size = 0;
	    if (list != null)
	      size = list.size();
	    return size;
	}

	@Override
	public Object getCurrentElement() {
		// TODO Auto-generated method stub
		Object obj = null;
	    // Will not advance iterator
	    if (list != null)
	    {
	      int currIndex = listIterator.nextIndex();
	      obj = list.get(currIndex);
	    }
	    return obj;
	}

	@Override
	public List getPreviousElements(int count) {
		// TODO Auto-generated method stub
		int i = 0;
	    Object object = null;
	    LinkedList list = new LinkedList();
	    if (listIterator != null) {
	      while (listIterator.hasPrevious() && (i < count)){
	        object = listIterator.previous();
	        list.add(object);
	        i++;
	      }
	    }
	    return list;
	}

	@Override
	public List getNextElements(int count) {
		// TODO Auto-generated method stub
		int i = 0;
	    Object object = null;
	    LinkedList list = new LinkedList();
	    if(listIterator != null){
	      while(  listIterator.hasNext() && (i < count) ){
	        object = listIterator.next();
	        list.add(object);
	        i++;
	      }
	    } 
	    return list;
	}

	@Override
	public void resetIndex() {
		 if(listIterator != null){
		      listIterator = list.listIterator();
		   }
	}

}
