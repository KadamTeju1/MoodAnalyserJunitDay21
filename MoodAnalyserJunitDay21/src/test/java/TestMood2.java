import org.junit.Assert;
import org.junit.Test;

public class TestMood2 {
    @Test
    public void  testCase(){
        Assert.assertEquals("Sad Mood.", MoodAnalyser.analyserMood("I am in Sad  Mood."));
        Assert.assertEquals("Happy Mood.", MoodAnalyser.analyserMood("I am in Any Mood"));

        Assert.assertEquals("Happy Mood.", MoodAnalyser.analyserMood("I am in null Mood"));

        Assert.assertEquals("Happy Mood.", MoodAnalyser.analyserMood("I am in Empty Mood"));
    }
}
