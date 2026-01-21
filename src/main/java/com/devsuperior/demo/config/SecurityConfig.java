package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//Como adicionei as dependências do security no projeto (no arquivo .pom) já não consigo mais acessar os endpoints
//Aí posso liberar provisoriamente os endpoints através da criação dessa classe
//Com isso não ocorre mais o erro 401 - falta de autorização e os endpoints ficam liberados
@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable());//desabilitando ataques do tipo csrf
		http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());//permissões para os meus endpoints (requisições). Estou permitindo tudo para qualquer requisição
										//e aí as rotas que preciso de restrição configuro a nível de rota (controle de aceso por rota). Poderia fazer aqui, mas aqui é mais geral
		return http.build();
	}
}


