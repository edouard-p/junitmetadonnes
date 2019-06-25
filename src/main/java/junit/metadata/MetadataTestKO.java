package junit.metadata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MetadataTestKO {

    @Test
    @TFMetadata( key = "éàùôöîïèë", value = {"éééàùôöîïè"})
    @TFMetadata( key = "àààéàùôöîïè")
    @TFMetadata( key = "ùùùùéàùôöîïè", value = {"ùùone", "ééétwo", "ààààthree"})
    public void accent (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_K-E.Y&~#{}=+°|$£¤*%§!?;", value = {"vv&~#{}=+°|$£¤*%§!?;"})
    @TFMetadata( key = "22&~#{}=+°|$£¤*%§!?;")
    @TFMetadata( key = "multi&~#{}=+°|$£¤*%§!?;", value = {"first&~#{}=+°|$£¤*%§!?;", "second&~#{}=+°|$£¤*%§!?;", "third&~#{}=+°|$£¤*%§!?;"})
    public void specialChar (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_K-E.Y", value = {""})
    @TFMetadata( key = "mu.l-ti_Key", value = {"first","two",})
    public void noValue (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }
}
