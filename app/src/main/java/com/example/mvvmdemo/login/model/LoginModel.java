package com.example.mvvmdemo.login.model;

/**
 * Created by Ajinkya on 12/21/2020.
 */
public class LoginModel {

    private String msg;

    private int otp;

    private String status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "msg='" + msg + '\'' +
                ", otp=" + otp +
                ", status='" + status + '\'' +
                '}';
    }
}
