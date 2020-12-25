package com.glassProject.service;

import com.glassProject.loger.ILoger;
import com.glassProject.model.userModel;

public interface IUserService {
 userModel findByUserNameAndPasswordAndStatus(ILoger iLoger);
}
