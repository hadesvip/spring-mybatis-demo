package com.domain;

import com.domain.base.BaseModel;
import lombok.Data;

/**
 * @author created by wangyong on 17-11-12
 */
@Data
public class User extends BaseModel<User> {

    private String userName;

    private String password;


}
