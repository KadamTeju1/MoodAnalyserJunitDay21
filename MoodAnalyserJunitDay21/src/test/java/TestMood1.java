import org.junit.Assert;
import org.junit.Test;

public class TestMood1 {
    @Test
    public void  testCase(){
        Assert.assertEquals("Sad Mood.", MoodAnalyser.analyserMood("I am in Sad  Mood."));
        Assert.assertEquals("Happy Mood.",MoodAnalyser.analyserMood("I am in Any Mood"));

        Assert.assertEquals("Happy Mood.",MoodAnalyser.analyserMood("I am in null Mood"));
    }
}
