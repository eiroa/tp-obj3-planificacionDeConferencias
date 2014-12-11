package extensions

import java.util.List
import ar.unq.edu.objetos3.pdc.Actividad

class Cursor {
	
	Integer index
	List _list
	new(List list){
		index = 0
		_list = list
	}
	
	def current(){
		return _list.get(index)
	}
	
	def hasNext(){
		return index < _list.size -1
	}
	
	def next(){
		if(hasNext){		
			index++
			return  _list.get(index)
		}
		throw new Exception('Out of index')
	}
}