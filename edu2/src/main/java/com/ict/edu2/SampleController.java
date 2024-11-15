@RestController
public class SampleController {

    // 반환형이 String이면 String 자체가 출력
    @GetMapping
    public String getHello(){
        return "Hello World";
    }
    
    // 반환형이 String[] => 자동으로 json형식으로 출력
    @GetMapping
    public String[] getHello2(){
        return new String[] {"Hello", "World"};
    }
    
    // 반환형이 객체일때
    @GetMapping
    public String[] getHello3(){
        SampleVO svo = new SampleVO();
        svo.setName(name:"고길동");
        svo.setAge()
        return new String[] {"Hello", "World"};
    }
    
    @Post
}
