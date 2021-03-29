
import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


/* TODO
Imports will be filling up as you need them. */


public class WebPage {
    public List<String> dom; // this actually has the html document model.

    public WebPage(){
        dom = new LinkedList<>();

        /* TODO
Initialize this to some kind of List */
    }

    public void addTitle(String title){
        dom.add( "<h1>" +  title + "</h1>");


        /* TODO 
Add a title to the DOM*/
    }
    public void addParagraph(String paragraph){
        dom.add("<p>" +paragraph + "</p>");
    }

    /* TODO 
implement addParagraph that receives a String and puts it in the dom 
surrounded by <p> and </p>*/
    public String toString(){
        String html = "<html>\n<head>\n</head>\n<body>";
        for(String name : dom){
            html = html + name +"\n";

      }

        /* TODO
Loop through the elemments of the dom and append them to html */
        return html+"</body>\n</html>";
    }

    public void save(String filename){
        try{
            FileWriter out = new FileWriter((filename));
            out.write(toString());
            out.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }

        /* TODO 
Save a string representation of this webpage to the filename provided.*/
    }
}
