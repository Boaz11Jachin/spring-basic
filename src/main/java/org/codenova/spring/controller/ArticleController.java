package org.codenova.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    /*
    RequestMapping methods can be mapped using URL patterns.
    @RequestMapping 애너테이션을 사용하면 특정 URL 패턴에 대해 컨트롤러의 메서드를 매핑할 수 있다는 의미입니다.
     */

    @RequestMapping("/article/{id}")
    public void articleHandle() {
        System.out.println("articleHandle.articleHandle()");
    }
}
