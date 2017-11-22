package org.learning.core;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		AbstractClass a1=new based();
	
		Class myclassobj=AbstractClass.class;
		
		//Class Name
		System.out.println(myclassobj.getName());
		
		//Class modifiers
		System.out.println(myclassobj.getModifiers());
		System.out.println(Modifier.isFinal(1025));
		
		//Class package Info
		System.out.println(myclassobj.getPackage());
		
		//Class super class
		System.out.println(myclassobj.getSuperclass());
		
		//get Constructor
		Constructor[] constructor=myclassobj.getConstructors();
		System.out.println(constructor.length);
		//Constructor parameter list
		Class[] parameterTypes = constructor[0].getParameterTypes();
		System.out.println(parameterTypes.length);
		
		//get constructor that takes a String as argument
//		Constructor constructor1 = myclassobj.getConstructor(String.class);
//		AbstractClass myObject = (MyObject)
//		        constructor.newInstance("constructor-arg1");
		//get fields from class
		Field[] f=myclassobj.getFields();
		System.out.println(f[0].getName());

		//set field variable
		Field fv=myclassobj.getField("msg");
		
		Object value=fv.get(a1);
		
		System.out.println("Value"+value);
		
		//@@*****@@ Accessing private fields 
		//to access private field we needs  Class.getDeclaredFields
		Box2d object = new Box2d(10);
		
		Field privateStringField = object.getClass().
		            getDeclaredField("len");

		privateStringField.setAccessible(true);

		Integer fieldValue = (Integer) privateStringField.get(object);
		System.out.println("fieldValue = " + fieldValue);
//		Field[] privateStringField = object.getClass().
//	            getDeclaredFields();
//		System.out.println(privateStringField[0]);
		
		//for generic classes 
		
//		Method method = MyClass.class.getMethod("getStringList", null);
//
//		Type returnType = method.getGenericReturnType();
//
//		if(returnType instanceof ParameterizedType){
//		    ParameterizedType type = (ParameterizedType) returnType;
//		    Type[] typeArguments = type.getActualTypeArguments();
//		    for(Type typeArgument : typeArguments){
//		        Class typeArgClass = (Class) typeArgument;
//		        System.out.println("typeArgClass = " + typeArgClass);
//		    }
//		}

	 
		
	}

}
