package com.makingdevs
import spock.lang.Specification 
class CalculatorServiceSpec extends Specification{
	private CalculatorService calculatorService
	def setup(){
		calculatorService=new CalculatorService()
	}
	def "Add two numbers"(){
		given:
			Integer a=2
			Integer b=3
		when:
			def sum=calculatorService.sum(a,b)

		then:
			sum==5
	}

	def "Multiply two numbers"(){
		given:
			Integer a=2
			Integer b=3
		when:
			def mult=calculatorService.mult(a,b)
			
		then:
			mult==6
	}
}