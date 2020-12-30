import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatQuestionsCanBeDisplayed(){
        Quiz quiz= new Quiz();
        quiz.getQuestion();
    }
    @Test
    void testThatQuestionsCanBeRandomized(){
        Quiz quiz= new Quiz();
        quiz.getQuestion();
    }
    @Test
    void testThatTotalScoreCanBeDisplayed(){
        Quiz quiz= new Quiz();
        quiz.getQuestion();

    }
}