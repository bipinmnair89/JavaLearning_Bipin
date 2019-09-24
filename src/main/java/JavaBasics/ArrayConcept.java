package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*disadv of 1D and 2D array is that its size is fixed and only one datatype can be used
		 * to solve the size issue we use collections
		 * to solve the datatype issue we use object arrays
		 */
		
		//one dimensional array (static array as size is fixed)
		int i[]=new int[4];
		i[0]=3;
		i[1]=5;
		i[2]=6;
		i[3]=7;
		System.out.println("Length of the array is : "+i.length);
		for(int j=0;j<i.length;j++) //always the condition will be < and not <= for array
		{
		System.out.println(i[j]);		
		}
		System.out.println("**************************************************************");
		//two dimensional array (static array as size is fixed)
		int x[][]=new int[2][2];
		x[0][0]=5;
		x[0][1]=3;
		
		x[1][0]=9;
		x[1][1]=7;
		
		System.out.println("Number of rows : "+x.length);
		System.out.println("Number of columns :"+x[0].length);
		for(int y=0;y<x.length;y++)
		{
			for(int z=0;z<x[0].length;z++)
			{
				System.out.println(x[y][z]);
			}
		}
		
		System.out.println("**************************************************************");
		//object array -- solves the datatype issue by allowing multiple datatypes
		Object ob[][]=new Object[2][3];
		ob[0][0]=1;
		ob[0][1]="bipin";
		ob[0][2]='A';
		ob[1][0]=2;
		ob[1][1]="Rahul";
		ob[1][2]='B';
		
		System.out.println("Number of rows :"+ob.length);
		System.out.println("Number of columns :"+ob[0].length);
		for(int a=0;a<ob.length;a++)
		{
			for(int b=0;b<ob[0].length;b++)
			{
				System.out.println(ob[a][b]);
			}
		}
	}

}
