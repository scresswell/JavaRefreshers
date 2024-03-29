
public class CasesAndIf {

	public static void ifHelloWorld (int langID)
    {
           if (langID == 1)
           {
                  System.out.println("Spanish selected");
                  System.out.println("Hola Mundo!");
           }
           else if (langID == 2)
           {
                  System.out.println("German selected");
                  System.out.println("Hallo Welt!");
           }
           else if (langID == 3)
           {
                  System.out.println("French selected");
                  System.out.println("Bonjour le monde!");
           }     
           else
           {
                  System.out.println("English default");
                  System.out.println("Hello world!");            
           }
    }
   
    public static void switchHelloWorld (String lang)
    {
			  switch (lang)
			  {
			         case "Spanish":
			               System.out.println("Hola Mundo!");
			               break;
			         case "German":
			               System.out.println("Hallo Welt!");
			               break;
			         case "French":
			               System.out.println("Bonjour le monde!");
			               break;
			         case "Kiwi":
			         case "Rarotongan":
			               System.out.println("kia ora!");
			               break;
			         default:
			               System.out.println("Hello world! (Eng)");     
			  }
    }
   
    public static void main(String[] args) {
          
           System.out.println("USING IF STATEMENTS");
          
           ifHelloWorld(0);
           ifHelloWorld(1);
           ifHelloWorld(2);
           ifHelloWorld(3);
  
           System.out.println();
           System.out.println("SWITCH STATEMENT");
           switchHelloWorld("French");
           switchHelloWorld("Kiwi");
           switchHelloWorld("German");
           switchHelloWorld("Spanish");
           switchHelloWorld("American");
           switchHelloWorld("Rarotongan");
    }

}
