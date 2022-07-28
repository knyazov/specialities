package akzholedu.kz.specialities.api;

import akzholedu.kz.specialities.entities.QuizResult;
import akzholedu.kz.specialities.entities.SpecialityQuiz;
import akzholedu.kz.specialities.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/mamandyq")
public class RestController {
    @Autowired
    private SpecialityService specialityService;

    @GetMapping("/")
    public ResponseEntity<List<SpecialityQuiz>> getQuiz() {
        return new ResponseEntity<>(specialityService.allQuestions(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<QuizResult> getQuizResult(@PathVariable(value = "code") String code){
        if (specialityService.getQuizResult(code)!=null){
            return new ResponseEntity<>(specialityService.getQuizResult(code), HttpStatus.OK);
        }
        else return new ResponseEntity<>(specialityService.getQuizResult(code), HttpStatus.SERVICE_UNAVAILABLE);
    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<QuizResult>> getAllQuizResults(){
//        return new ResponseEntity<>(specialityService.allQuizResult(), HttpStatus.OK);
//    }
}
