package com.matlab.portal.LAPLACE;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//직접 주입하는 방법. 스프링에서는 이런 식으로 안씀
/*		Calculation calculation=new Calculation();
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mult();
		calculation.div();*/
		
		//스프링에서 쓰는 방법
		String configLoc="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(configLoc);
		MyCalculator myCalculator=ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
	}
}