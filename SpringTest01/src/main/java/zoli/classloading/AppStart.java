package zoli.classloading;

public class AppStart {

	
	public static void main(String ... args){
		
		MyClassLoader mcl = new MyClassLoader();
		mcl.invokeClassMethod("zoli.classloading.ClassLoadingZoli", "sayHi");
		
	}
}
