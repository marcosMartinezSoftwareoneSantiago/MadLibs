public class MadLibs {
    /*
      This program generates a mad libbed story.
        Author: Marcos
        Date: 27/07/2022
    */
        public static void main(String[] args){
        String name1 = "Paco";
  
        String adjective1 = "cool";
        String adjective2 = "great";
        String adjective3 = "awesome";
  
        String verb1 = "dance";
  
        String noun1 = "people";
        String noun2 = "ice";
        String noun3 = "heavy metal";
        String noun4 = "proteste";
        String noun5 = "dinosaur";
  
        String noun6 = "penguins";
        String name2 = "Farruco";
  
        int number = 8976;
        
        String place1 = "Saturn";
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
      }       
  }
  