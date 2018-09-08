/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdsm.ejemplogradle.dao;

/**
 *
 * @author corre_000
 */
import com.bancodebogota.fdsm.ejemplogradle.entities.UserEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByLogin(String login);
}