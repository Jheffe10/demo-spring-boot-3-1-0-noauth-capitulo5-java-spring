package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {//implements CommandLineRunner{ //Para testar a cryptografia da senha
	
	//Para testar a cryptografia da senha
//	@Autowired //injeção de 
//	private PasswordEncoder passwordEncoder; //como coloquei o componente @Bean no método da classe SecurityConfig, já cria uma instância do BCrypt

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	//Para testar a cryptografia da senha
//	@Override
//	public void run(String... args) throws Exception {
//		//testar a criptografia da senha
//		System.out.println("Encode= " +passwordEncoder.encode("123456")); //como parâmetro passo a senha para codificação
//				//gerou esse hash: $2a$10$rCoTx58/8N0l1xG38EQUxOAChv7PgoAuju5qB4CbBXsINvAfDln4m
//				//No banco de dados salvo esse hash. na hora que o usuário vai logar e passa a sneha, comparo a senha com esse hash
//		//o Spring Security faz a comparação conforme abaixo:
//		boolean result = passwordEncoder.matches("123456", "$2a$10$rCoTx58/8N0l1xG38EQUxOAChv7PgoAuju5qB4CbBXsINvAfDln4m");
//		System.out.println("Result= " +result);
//	}

}
