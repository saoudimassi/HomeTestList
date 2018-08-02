import java.util.ArrayList;

public class ListHomeTest {
	
	public ArrayList<ArrayList<Integer>> partition(ArrayList list, int sizeSubList) throws PartitionExceptions {
		
		if(sizeSubList < 0)
		{
			throw new PartitionExceptions("The zise of sub list must be greather than 0 !");
		}
		
		if(list.size() == 0)
		{
			throw new PartitionExceptions("The inner list must be not empty !");
		}
		else if(list.size() < sizeSubList)
		{
			throw new PartitionExceptions("The zise of inner list must be greather than size of sub list !");
		}
		
		
		ArrayList<ArrayList<Integer>> outerList = new ArrayList<ArrayList<Integer>>();
		
		int sizeList = list.size();	
		int peerSizeList = 0;
		int rest = sizeList % sizeSubList; 	
		
		if(rest != 0)
		{
			peerSizeList = sizeList-rest;
		}
		else
		{
			peerSizeList = sizeList;
		}	
		
		for(int i=0; i < peerSizeList; i += sizeSubList)
		{
			int j = i+sizeSubList;
			ArrayList subList = new ArrayList<Integer> (list.subList(i, j));
			outerList.add(subList);
		}
		
	    if(rest != 0)
		{
			ArrayList subList = new ArrayList<Integer> (list.subList(peerSizeList, sizeList));
			outerList.add(subList);
		}	
		return outerList;
	}
	
	public void printList(ArrayList list) {
		 System.out.print(list);
    }
	
    public ArrayList<Integer> listFill(int nbElements)
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i < nbElements; i += 1)
		{
			list.add(i);   
		}
    	
    	return list;
    }
}
