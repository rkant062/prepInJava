public class RearrangeArray {
	
	    public int[] solve(int[] A) {
	        int b[]=new int[A.length];
	        for(int i=0;i<A.length;i++)
	            b[A[i]]=i;
	        return b;
	    }
}
