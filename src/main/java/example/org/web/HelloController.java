package example.org.web;

import example.org.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController
 * - 컨트롤러 > JSON 반환 컨트롤러로 변경.
 */
@RestController
public class HelloController {

    /*
     * @GetMapping
     * - HTTP Method 인 Get 의 요청을 받을 수 있는 API 생성.
     *************************
     * @RequestParam(key)
     * - 단일 파라미터 전달받음.
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}


