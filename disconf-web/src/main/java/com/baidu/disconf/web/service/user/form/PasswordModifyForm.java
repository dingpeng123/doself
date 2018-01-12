package com.baidu.disconf.web.service.user.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

import org.hibernate.validator.constraints.NotEmpty;

import com.baidu.dsp.common.form.RequestFormBase;

/**
 * @author liaoqiqi
 * @version 2014-1-24
 */
@Data
public class PasswordModifyForm extends RequestFormBase {

    /**
     *
     */
    @NotNull(message = "password.empty")
    @NotEmpty(message = "password.empty")
    private String old_password;
    public static final String OLD_PASSWORD = "old_password";

    @NotNull(message = "password.empty")
    @NotEmpty(message = "password.empty")
    private String new_password;
    public static final String NEW_PASSWORD = "new_password";

    @NotNull(message = "password.empty")
    @NotEmpty(message = "password.empty")
    private String new_password_2;
    public static final String NEW_PASSWORD_2 = "new_password_2";

    public String getOld_password() {
        return old_password;
    }

    public String getNew_password_2() {
        return new_password_2;
    }

    public String getNew_password() {
        return new_password;
    }

}
