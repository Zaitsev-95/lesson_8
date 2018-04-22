import java.util.Arrays;
import java.util.List;

public class SpaceParceText implements ParceText {
    @Override
    public List<String> handle(String text) {
        return Arrays.asList(text.split(" "));
    }
}