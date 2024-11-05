import java.util.Arrays;

/**
 * This class simulates the Magic8Ball toy, as described at
 * <a href="https://magic-8ball.com/">magic-8ball.com</a>.
 * The default constructor creates a Magic8Ball that uses the
 * answers from the traditional 20-answer Magic8Ball, as listed
 * <a href="https://magic-8ball.com/magic-8-ball-answers/">here</a>.
 *
 */
public class Magic8Ball
{
    private final static String[] DEFAULT_ANSWERS = {
            "It is certain",
            "Reply hazy, try again",
            "Don’t count on it",
            "It is decidedly so",
            "Ask again later",
            "My reply is no",
            "Without a doubt",
            "Better not tell you now",
            "My sources say no",
            "Yes definitely",
            "Cannot predict now",
            "Outlook not so good",
            "You may rely on it",
            "Concentrate and ask again",
            "Very doubtful",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes"
    };
    private final String[] answers;

    /**
     * Creates a Magic8Ball that uses the provided array for its answers.
     * @param answers array of possible responses to user questions.
     */
    public Magic8Ball(String[] answers) {
        if (answers == null || answers.length == 0) {
            throw new IllegalArgumentException("'answers' array is empty.");
        }
        this.answers = Arrays.copyOf(answers, answers.length);
    }

    /**
     * Creates a Magic8Ball that uses the traditional Magic8Ball answers.
     */
    public Magic8Ball() {
        this(DEFAULT_ANSWERS);
    }

    /**
     * Randomly chooses an answer from the array the object was
     * constructed with.
     * @return an answer, chosen at random.
     */
    public String getAnswer() {
        int i = (int) (Math.random() * answers.length);
        return answers[i];
    }


}
