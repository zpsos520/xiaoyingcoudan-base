import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shua1.xiaoyingcoudan.base.mapper.EmpInfoMapper;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
		EmpInfoMapper empInfoMapper = applicationContext.getBean(EmpInfoMapper.class);
		empInfoMapper.selectByPrimaryKey(1);
	}
}
