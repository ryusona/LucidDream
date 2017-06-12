package kr.re.kitri.LucidDream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * /bbs ..전체보기
 *  /bbs/15 ..상세보기(15번 글)
 *  /bbs/15/modify ..수정(15번 글 수정)
 *  /bbs/15/remove ..삭제(15번 글 삭제)
 *
 *  /bbs/write ..글 작성화면 로딩
 *  /bbs/write/do ..글 작성하기
 */

@Controller
public class BbsController {

    @RequestMapping("/bbs")
    public String viewAll() {
        return "bbs/view_all";
    }

    @RequestMapping("/bbs/{articleId}") // <- 경로 변수 글자를 변수로 사용가능! 이 번호같은걸 가지고 db에서 값조회가능
    public ModelAndView viewDetail(@PathVariable("articleId") String articleId) { // 이거 PathVariable 유의하셈
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/view_detail");
        mav.addObject("articleId", articleId);
        return mav;
    }

    @RequestMapping(value = "/bbs/write", method= RequestMethod.GET) // <-요청 파라미터
    public String loading() {
        return "bbs/loading";
    }


    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST) // 요게 스프링 기본이라능 // 전에는 get,set 으로 했는데 되게 달라지네 ㅇㅁㅇ...
    public ModelAndView doWrite(@RequestParam("article_id") String articleId,
                          @RequestParam("title") String title,
                          @RequestParam("author") String author,
                          @RequestParam("content") String content) {

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/do_write");  // 아래 데이터가 같이 넘어감 do_write페이지로
        mav.addObject("articleId", articleId);
        mav.addObject("title", title);
        mav.addObject("author", author);
        mav.addObject("content", content); // 초록색 안에 있는 이름이 파라메터명

        return mav;
    }

//    @RequestMapping("/bbs/write/do")
//    public String doWrite(HttpServletRequest request) {
//
//        String articleId = request.getParameter("article_id");
//        String title = request.getParameter("title");
//        String author = request.getParameter("author");
//        String content = request.getParameter("content");
//
//        System.out.println(articleId);
//        System.out.println(title);
//        System.out.println(author);
//        System.out.println(content);
//
//        return "do_write";
//    }

}
