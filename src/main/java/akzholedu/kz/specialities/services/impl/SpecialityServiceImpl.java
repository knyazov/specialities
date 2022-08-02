package akzholedu.kz.specialities.services.impl;

import akzholedu.kz.specialities.entities.QuizResult;
import akzholedu.kz.specialities.entities.SpecialityQuiz;
import akzholedu.kz.specialities.exceptions.ApiRequestException;
import akzholedu.kz.specialities.repositories.QuizResultRepository;
import akzholedu.kz.specialities.repositories.SpecialityQuizRepository;
import akzholedu.kz.specialities.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {
    @Autowired
    private SpecialityQuizRepository specialityQuizRepository;

    @Autowired
    private QuizResultRepository quizResultRepository;

    @Override
    public List<SpecialityQuiz> allQuestions() {
        return specialityQuizRepository.findAll();
    }

    @Override
    public QuizResult getQuizResult(String code) {
        if((quizResultRepository.findByCode(code))!=null)
        return quizResultRepository.findByCode(code);
        else throw new ApiRequestException("Cannot find");
    }

    @Override
    public List<QuizResult> allQuizResult() {
        return quizResultRepository.findAll();
    }
}
