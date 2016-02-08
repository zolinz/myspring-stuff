package zoli.classloading;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyClassLoader extends ClassLoader {
	
	
	public void invokeClassMethod(String classBinName, String methodName){
		try{
			ClassLoader cl = this.getClass().getClassLoader();
			
			Class<ClassLoadingZoli> myLoadedClass = (Class<ClassLoadingZoli>) cl.loadClass(classBinName);
			System.out.println("my loaded class: " + myLoadedClass.getName());
			Constructor con = myLoadedClass.getConstructor();
			
			Object obj = con.newInstance();
			
			Method method = myLoadedClass.getMethod(methodName);
			
			method.invoke(obj);
			
		}catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
