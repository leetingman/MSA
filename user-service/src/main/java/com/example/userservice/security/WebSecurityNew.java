//package com.example.userservice.security;
//
//import com.example.userservice.service.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.servlet.Filter;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurity {
//
//
//    AuthenticationManager authenticationManager;
//    private UserService userService;
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//    private Environment env;
//    public WebSecurity(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder,Environment env) {
//        this.userService = userService;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//        this.env=env;
//    }
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer(){
//        return web -> web.ignoring().antMatchers("/resources/**");
//    }
//
//
//
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        AuthenticationManagerBuilder authenticationManagerBuilder =http.getSharedObject(AuthenticationManagerBuilder.class);
//        authenticationManagerBuilder.userDetailsService(userService);
//        authenticationManager = authenticationManagerBuilder.build();
//
//        return http.csrf().disable()
//                .authorizeRequests().antMatchers("/**").
//                hasIpAddress("172.30.75.45")
////                        hasIpAddress(env.getProperty("gateway.ip"))
//                .and().addFilter(getAuthenticationFilter())
//                .headers().frameOptions().disable().and()
//                .authenticationManager(authenticationManager)
//                .build()
//                ;
//
//    }
//
//    private AuthenticationFilter getAuthenticationFilter() throws Exception{
//        AuthenticationFilter authenticationFilter = new AuthenticationFilter();
////        authenticationFilter.setAuthenticationManager(authenticationManager);
////        authenticationFilter.setAuthenticationManager(authenticationManager);
//        return authenticationFilter;
//
//
//    }
//
////    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//
//        authProvider.setUserDetailsService(userService);
////        authProvider.setPasswordEncoder(passwordEncoder());
//        return authProvider;
//    }
//
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//
//
//
//
//}
