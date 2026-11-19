package com.taobao.agoo;

import com.alibaba.sdk.android.error.ErrorBuilder;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.error.ErrorDefine;
import com.taobao.agoo.p087a.p088a.AbstractC7706b;
import com.taobao.sophix.PatchStatus;

/* renamed from: com.taobao.agoo.a */
/* loaded from: classes5.dex */
public class C7703a {
    public static final ErrorCode ACCS_CHECK_ERROR;
    public static final ErrorCode AGOO_NOT_BIND;
    public static final ErrorCode INVALID_ARG;
    public static final ErrorCode REGISTER_DATA_ERROR;
    public static final ErrorCode REMOVE_ALIAS_FAIL_NO_ALIAS;
    public static final ErrorCode REMOVE_ALIAS_FAIL_NO_TOKEN;
    public static final ErrorCode SUCCESS;

    /* renamed from: a */
    private static final ErrorDefine f13251a;
    public static final ErrorCode[] codes;

    static {
        ErrorDefine errorDefine = new ErrorDefine("EAGOO");
        f13251a = errorDefine;
        ErrorCode errorCodeBuild = errorDefine.defineSdkError(AbstractC7706b.JSON_SUCCESS).msg(AbstractC7706b.JSON_SUCCESS).build();
        SUCCESS = errorCodeBuild;
        ErrorCode errorCodeBuild2 = errorDefine.defineSdkError("remove_alias_fail_no_token").msg("移除别名失败，本地没有别名记录").solution("请检查输入的别名是否正确").solution("低版本推送有概率出现，添加别名后，应用的数据被清除，导致sdk内部存储的别名信息丢失，无法移除").build();
        REMOVE_ALIAS_FAIL_NO_TOKEN = errorCodeBuild2;
        ErrorCode errorCodeBuild3 = errorDefine.defineSdkError("remove_alias_fail_no_alias").msg("移除别名失败，本地没有别名记录").solution("请检查输入的别名是否正确").solution("低版本推送有概率出现，添加别名后，应用的数据被清除，导致sdk内部存储的别名信息丢失，无法移除").build();
        REMOVE_ALIAS_FAIL_NO_ALIAS = errorCodeBuild3;
        ErrorCode errorCodeBuild4 = errorDefine.defineSdkError("invalid_arg").msg("请求参数错误").solution("请检查输入参数").build();
        INVALID_ARG = errorCodeBuild4;
        ErrorCode errorCodeBuild5 = errorDefine.defineSdkError("accs_disabled").msg("accs检查不通过").solution("请检查初始化是否成功").solution("请检查配置是否正确").solution("请检查请求是否是在主进程").build();
        ACCS_CHECK_ERROR = errorCodeBuild5;
        ErrorCode errorCodeBuild6 = errorDefine.defineSdkError("agoo_not_bind").msg("请先注册初始化agoo").solution("请检查初始化是否成功").build();
        AGOO_NOT_BIND = errorCodeBuild6;
        REGISTER_DATA_ERROR = errorDefine.defineSdkError("register_data_error").msg("构造注册数据失败").solution("请检查配置参数是否正确，初始化是否成功").build();
        codes = new ErrorCode[]{errorCodeBuild, errorCodeBuild2, errorCodeBuild3, errorCodeBuild4, errorCodeBuild5, errorCodeBuild6, m10188a(PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, "accs 错误信息").solution("格式EAGOO_ACCS_123, 123为accs错误码，请结合accs错误码排查").build(), m10189a("XXX", "服务错误信息").solution("格式EAGOO_SERVER_XXX, XXX为agoo服务错误码，请联系阿里云技术支持排查").build()};
    }

    /* renamed from: a */
    public static ErrorBuilder m10188a(int i10, String str) {
        return f13251a.defineError("ACCS", String.valueOf(i10)).msg(str).solution("accs底层错误，需要根据错误码排查");
    }

    /* renamed from: a */
    public static ErrorBuilder m10189a(String str, String str2) {
        return f13251a.defineServerError(str).msg(str2).solution("agoo 服务报错，请联系技术支持排查");
    }
}
