package z_exc;

abstract class Parent{

	abstract  int  getNumber( );

}

public class Child extends Parent {

	private  int  number = 100;

	/*private*/  int  getNumber() {   return  number;  }

}

