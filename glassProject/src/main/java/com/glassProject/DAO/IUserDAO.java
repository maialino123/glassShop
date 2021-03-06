package com.glassProject.DAO;

import com.glassProject.loger.ILoger;
import com.glassProject.model.userModel;

public interface IUserDAO extends GenericDAO<userModel> {
  userModel findByUserNameAndPasswordAndStatus(ILoger iLoger);
}
