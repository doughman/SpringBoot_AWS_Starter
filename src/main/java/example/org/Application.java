package example.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/*
 * @EnableJpaAuditing
 * - JPA Auditing 활성화
 ************************
 * @SpringBootApplication
 * - 스프링 부트의 자동 설정
 * - 스프링 Bean 읽기/생성 자동 설정.
 * 이 위치부터 설정을 읽기 때문에 항상 프로젝트의 최상단에 위치.
 */
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /*
         * SpringApplication.run()
         * - 내장 WAS 실행
         */
        SpringApplication.run(Application.class, args);
    }
}
