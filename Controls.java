public class Controls implements IControls {

    /** move directions represented by a string */
    private String s;


    /** Basic constructor */
    public Controls(String s) {
        
    }

    /* Accessors & Mutators */
    public String getControls() {
        return this.s;
    }

    public void setS(String s) throws Exception {
        String[] input = s.split("");

        for (String s1 : input) {
            if(!(s1.contains("L") 
            || s1.contains("M") 
            || s.contains("R"))) {
                throw new IllegalArgumentException(s + " not valid input");
            } 
        }
          this.s = s; 
    }
} // class Controls