package com.ou.film.security.service;


import com.ou.film.entities.Role;
import com.ou.film.services.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}