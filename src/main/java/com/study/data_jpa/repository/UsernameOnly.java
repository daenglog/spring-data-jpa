package com.study.data_jpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

//    @Value("#{target.username + ' ' + target.age}") // 이 줄이 있으면 오픈 프로젝션, 없으면 클로즈 프로젝션
    String getUsername();
}
