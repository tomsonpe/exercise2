package tp3Number2;

/**
 * Hello world!
 *
 */
public class main
{
       addition add = new addition(5, 7);
       division div = new division(4, 9);
       modulas mod = new modulas(6, 2);
       multiplication mult = new multiplication(6, 3);
       subtraction sub = new subtraction(10, 5);

       add.addNumbers();
       div.calDivision();
       mod.calModulas();
       mult.multiply();
       sub.subtractNumbers();
}
