/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */

//ST10336285
public class EstateAgentTest {
    
    public EstateAgentTest() {
    }

    @Test
    public void calculateCommission_CalculatedSuccessfully() 
    {
        EstateAgent1 estateAgent1 = new EstateAgent1();

        //Assumed valid property price and commission percentage
        String propertyPrice = "100000"; //Example property price
        String commissionPercentage = "5"; //Example commission percentage

        double result = estateAgent1.CalculateCommission(propertyPrice, commissionPercentage);

        //Asserting the result is as expected
        assertEquals(5000.0, result, 0.001); //Using delta to allow for floating-point precision
        
    }//end of calculateCommission_CalculatedSuccessfully()

    @Test
    public void calculateCommission_CalculatedUnsuccessfully() 
    {
        EstateAgent1 estateAgent1 = new EstateAgent1();

        //Assumed invalid property price and valid commission percentage
        String propertyPrice = "-100000"; //Example invalid property price
        String commissionPercentage = "5"; //Example commission percentage

        double result = estateAgent1.CalculateCommission(propertyPrice, commissionPercentage);

        //Assert the result is not valid commission value
        assertTrue(result < 0);
        
    }//end of calculateCommission_CalculatedUnsuccessfully()

    @Test
    public void validationTest() 
    {
        EstateAgent1 estateAgent1 = new EstateAgent1();

        //Created Data object with valid data
        Data validData = new Data("CAPE TOWN", "John Doe", "100000", "5");

        boolean validationResult = estateAgent1.ValidateData(validData);

        //Assert the validation result is true for valid data
        assertTrue(validationResult);
        
    }//calculateCommission_CalculatedUnsuccessfully()
    
}//end of EstateAgentTest class
    
/*
Bibliography
Farrel, J. (2016). JAVA PROGRAMMING. Boston: Cengage Learning.
Farrell, J. (2018). Programming Logic & Design, Comprehensive. Boston: Cengage Learning; 9th edition.
Hamilton, T. (2023, October 28). GURU99. Retrieved from www.guru99.com: https://www.guru99.com/junit-tutorial.html
Niraj_Pandey. (2023, June 4). GeeksForGeeks. Retrieved from www.geeksforgeeks.org: https://www.geeksforgeeks.org/java-string-format-method-with-examples/
realcode4you. (2021, June 20). RealCode4You. Retrieved from www.realcode4you.com: https://www.realcode4you.com/post/create-a-simple-java-gui-application-using-the-netbeans
*/
