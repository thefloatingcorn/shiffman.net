/* Daniel Shiffman               */
/* Programming from A to Z       */
/* Spring 2006                   */
/* http://www.shiffman.net       */
/* daniel.shiffman@nyu.edu       */

/* A Class to describe an
 LSystem Rule                  */


public class Rule {
    private char match;
    private String replace;
    
    public Rule(char a_, String b_) {
        match = a_;
        replace = b_; 
    }
    
    public char getMatch() {
        return match;
    }
    
    public String getReplace() {
        return replace;
    }
}
