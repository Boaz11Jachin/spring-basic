package org.codenova.spring.aop;

/*
    메서드들이 작동될때 마다 먼가 로그를 남기고 싶음.
    해결하는 가장 쉬운 방법은 메서드마다 다 sout 설정해두면 됨.
    그러다가 나중에 필요가 없어지면..? 다시 지워야됨...

    이런 상황을 AOP로 해결이 가능.
    로그를 남기는 작업을 따로 만들어두고, 이걸 Spring에게 호출 위임을 시키면 됨. (필요업어지면 위임 해제)

    + spring aop 라이브러리가 필요 ( mvnrepository 에서 6.2.3 )
 */
public class LoggingAspect {
    public void log (){
        System.out.println("LoggingAspect.log()");
    }
}
