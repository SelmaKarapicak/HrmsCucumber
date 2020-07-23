package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features"  // features klasorundeki tum filelari calistiriyor 
		, glue  = {"steps"} //filelardaki steplerin uygulandigi yer
		, dryRun = false  //steplerin implemented olup olmadigina bakiyor run etmek istiyorsak false oluyor, hangileri uygulanmis uygulanmamis kontrol etmek istiyorsak true oluyor
		//, tags ="smoke" //testlerdeki butun smoke testleri uyguluyor, birden fazla tagde tanimlayabiliriz
		//, monochrome = true  //consoldaki ciktilarin daha okunabilir olmasini sagliyor
		)

public class Runner {   //Runner class testcaseleri calistirdigimiz yer. Listener classa benziyor
	
	
	

}
