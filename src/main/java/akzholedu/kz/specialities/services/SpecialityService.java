package akzholedu.kz.specialities.services;


import akzholedu.kz.specialities.entities.QuizResult;
import akzholedu.kz.specialities.entities.SpecialityQuiz;

import java.util.List;

public interface SpecialityService {
    List<SpecialityQuiz> allQuestions();
    QuizResult getQuizResult(String code);
    List<QuizResult> allQuizResult();
}
