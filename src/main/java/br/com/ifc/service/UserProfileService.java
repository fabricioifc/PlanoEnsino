package br.com.ifc.service;

import java.util.List;

import br.com.ifc.model.UserProfile;

public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}
