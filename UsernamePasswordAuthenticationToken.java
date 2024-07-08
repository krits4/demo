/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;


public class UsernamePasswordAuthenticationToken {

    public UsernamePasswordAuthenticationToken(UserDetails userDetails, Object object, Collection<? extends GrantedAuthority> authorities) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDetails(WebAuthenticationDetails buildDetails) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
