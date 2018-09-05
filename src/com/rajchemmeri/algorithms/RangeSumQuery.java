package array;

public class RangeSumQuery {
	
	int[] data;
	//[ 1,2,3,4,5,6,7]
	
	public RangeSumQuery(int[] input) {
        this.data = input;
        if ( this.data != null && this.data.length > 1) {
          for( int j=1;j<data.length;++j) {
            data[j] = data[j-1] + data[j];
          }
        }
	}
	
	public int rangeQuery(int i, int j) {
        int x = 0;
        int y = 0;

        x =  ( i ==  0 )?x = 0 : data[i-1];
        y = data[j];

        return y - x;
	}
	
	public int getItem(int pos) {
		
		    return (pos==0)?data[0]:(data[pos] -data[pos-1]);
	}

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] data = new int[] {1,2,3,4,5,6,7};
        RangeSumQuery range = new RangeSumQuery(data);
        System.out.println("Range : "+range.rangeQuery(2, 5));

        System.out.println(" No at position 5 is "+ range.getItem(0));
		
	}

}
