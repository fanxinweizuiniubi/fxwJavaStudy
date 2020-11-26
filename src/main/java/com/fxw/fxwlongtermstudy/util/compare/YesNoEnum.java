package com.fxw.fxwlongtermstudy.util.compare;

/**
 * @author fanxinwei
 */
public enum YesNoEnum {
    //
    YES(0,"是"),
    NO(1,"否")
    ;

    private int code;
    private String desc;

    YesNoEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
