package com.alibaba.sdk.android.error;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ErrorCode implements Serializable {
    private final Code code;
    private String detail;
    private String msg;
    private String[] solutions;

    public ErrorCode(Code code) {
        this.code = code;
        this.msg = null;
        this.detail = null;
        this.solutions = null;
    }

    public static String docContent(ErrorCode[] errorCodeArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SignParameters.NEW_LINE);
        for (ErrorCode errorCode : errorCodeArr) {
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(errorCode.code);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(errorCode.msg);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            if (errorCode.solutions != null) {
                int i10 = 0;
                while (i10 < errorCode.solutions.length) {
                    if (i10 != 0) {
                        sb2.append("<br />");
                    }
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    sb2.append(". ");
                    sb2.append(errorCode.solutions[i10]);
                    i10 = i11;
                }
            }
            sb2.append("|\n");
        }
        return sb2.toString();
    }

    public static String docTitle() {
        return SignParameters.NEW_LINE + "| 错误码 | 错误描述 | 备注            |" + SignParameters.NEW_LINE + "| ------ | -------- | ------------------- |" + SignParameters.NEW_LINE;
    }

    private static String toStringWithAllInfo(ErrorCode errorCode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("错误码：");
        sb2.append(errorCode.code);
        sb2.append(", ");
        sb2.append("错误：");
        sb2.append(errorCode.msg);
        String str = errorCode.detail;
        if (str != null && !str.isEmpty()) {
            sb2.append("(");
            sb2.append(errorCode.detail);
            sb2.append("), ");
        }
        String[] strArr = errorCode.solutions;
        if (strArr != null && strArr.length > 0) {
            sb2.append("请检查一下几点：");
            for (String str2 : errorCode.solutions) {
                sb2.append(str2);
                sb2.append("; ");
            }
        }
        return sb2.toString();
    }

    public ErrorBuilder copy() {
        ErrorBuilder errorBuilderBuilder = ErrorBuilder.builder(this.code);
        String str = this.msg;
        if (str != null) {
            errorBuilderBuilder.msg(str);
        }
        String str2 = this.detail;
        if (str2 != null) {
            errorBuilderBuilder.detail(str2);
        }
        String[] strArr = this.solutions;
        if (strArr != null) {
            errorBuilderBuilder.solutions(strArr);
        }
        return errorBuilderBuilder;
    }

    @Deprecated
    public ErrorCode create(String str) {
        return create(str, false);
    }

    public String getCode() {
        return this.code.getCodeStr();
    }

    public int getCodeInt() {
        return this.code.getCodeInt();
    }

    public String getMsg() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.msg);
        String str = this.detail;
        if (str != null && !str.isEmpty()) {
            sb2.append("(");
            sb2.append(this.detail);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setSolutions(String[] strArr) {
        this.solutions = strArr;
    }

    public String toShortString() {
        return "(" + this.code + "," + this.msg + "," + this.detail + ")";
    }

    public String toString() {
        return toStringWithAllInfo(this);
    }

    @Deprecated
    public ErrorCode(String str, String str2, String str3, String[] strArr, boolean z10) {
        this.code = new Code(str, null);
        this.msg = str2;
        this.detail = str3;
        this.solutions = strArr;
    }

    @Deprecated
    public ErrorCode create(String str, boolean z10) {
        return new ErrorCode(this.code.getCodeStr(), this.msg, str, this.solutions, z10);
    }
}
