package JavaBasics;

public class ImmutableStringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=10;
		
		//String is a class and not a datatype
		String x="Bipin";
		String y="Rahul";
		System.out.println(a+b+x+y); //both results are different
		System.out.println(x+y+a+b);
		
		ImmutableStringConcept obj=new ImmutableStringConcept();
		obj.stringCapability();
		
		}
		
	/*String is an immutable or final class
	 * It is marked as immutable as similar values occupy the same memory location in string pool
	 * it is marked as final as it cannot be overridden and changed the value
	 */
	public void stringCapability()
	{
		String s1="Java"; //here both the s1 and s2 points to same value Java and not 2 values
		String s2="Java";
		//if string was mutable then if we change value of Java of s1 then s2 value will also change
		
		String s3=s2.concat(s1);
		System.out.println("String s3 : "+s3);
	}
	
}
