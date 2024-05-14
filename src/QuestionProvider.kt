import QuizQuestion
import kotlin.random.Random

class QuestionProvider {
        fun getQuestion(): Question {
            val questions = QuizQuestion.quizQuesstions
            var randomIndex = Random.nextInt(questions.size)
            var currentQuestion = QuestionProvider[randomIndex]
            return currentQuestion
    }
}