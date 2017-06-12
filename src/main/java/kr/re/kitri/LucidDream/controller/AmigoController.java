package kr.re.kitri.LucidDream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-12.
 */
@Controller
public class AmigoController {
    @RequestMapping(value = "/amigo/regist", method= RequestMethod.GET)
    public String address() {
        return "amigo/address";
    }

    @RequestMapping("/amigo/{amigoName}")
    public ModelAndView viewDetail (@PathVariable String amigoName){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/view_detail");
        mav.addObject("amigoName",amigoName);
        return mav;
    }

    // 일반적인 post는 한글이 깨짐!
    @RequestMapping(value =  "/amigo/regist", method = RequestMethod.POST) // JSP네임명과 JAVA에서의 네임명이 같으면 바로 요렇게 해도 된댜능 ㅇㅁㅇ...!!!
    public ModelAndView doWrite(@RequestParam String amigoName,
                                @RequestParam String amigoPhone,
                                @RequestParam String amigoEmail) {

        System.out.println(amigoName);
        System.out.println(amigoPhone);
        System.out.println(amigoEmail);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/address_write");  // 아래 데이터가 같이 넘어감 do_write페이지로
        mav.addObject("amigoName", amigoName);
        mav.addObject("amigoPhone", amigoPhone);
        mav.addObject("amigoEmail", amigoEmail); // 초록색 안에 있는 이름이 파라메터명

        return mav;
    }

}
