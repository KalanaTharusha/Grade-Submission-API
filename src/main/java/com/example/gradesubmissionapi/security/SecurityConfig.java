package com.example.gradesubmissionapi.security;

import com.example.gradesubmissionapi.security.filter.AuthenticationFilter;
import com.example.gradesubmissionapi.security.filter.ExceptionHandlerFilter;
import com.example.gradesubmissionapi.security.filter.JWTAuthorizationFilter;
import com.example.gradesubmissionapi.security.manager.CustomAuthenticationManager;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

    private final CustomAuthenticationManager customAuthenticationManager;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
        authenticationFilter.setFilterProcessesUrl("/authenticate");
        http
                .headers().frameOptions().disable()
                .and()
                .csrf().disable()
                .authorizeRequests()
                .requestMatchers("/h2/**").permitAll()
                .requestMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
                .addFilter(authenticationFilter)
                .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }

}
