package life.liquide.utils;

import com.fasterxml.jackson.annotation.JsonGetter;

public class DeleteAPIPojo {
    private String mobile;
    private String otp;

    @JsonGetter("mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    @JsonGetter("otp")
    public String getOtp() {
        return otp;
    }

    public void setOtp( String otp ) {
        this.otp = otp;
    }
}
