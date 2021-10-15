package org.yunai.online_class;

import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yunai.online_class.model.entity.User;
import org.yunai.online_class.utils.JWTUtils;

@SpringBootTest
class OnlineClassApplicationTests {

	@Test
	public void testGeneJwt(){


		User user = new User();
		user.setId(66);
		user.setName("johnny");
		user.setHeadImg("png");

		String token = JWTUtils.geneJsonWebToken(user);

		System.out.println(token);

		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Claims claims = JWTUtils.checkJWT(token);


		System.out.println(claims.get("name"));

	}

}
