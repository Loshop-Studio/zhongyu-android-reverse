package com.alibaba.sdk.android.push.common.global;

import com.alibaba.sdk.android.error.CodeGenerator;
import com.alibaba.sdk.android.error.ErrorBuilder;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.error.ErrorDefine;
import com.taobao.agoo.p066a.p067a.AbstractC1807b;

/* renamed from: com.alibaba.sdk.android.push.common.global.c */
/* loaded from: classes.dex */
public class C1163c {

    /* renamed from: a */
    public static final ErrorCode f6718a;

    /* renamed from: b */
    public static final ErrorCode f6719b;

    /* renamed from: c */
    public static final ErrorCode f6720c;

    /* renamed from: d */
    public static final ErrorCode f6721d;

    /* renamed from: e */
    public static final ErrorCode f6722e;

    /* renamed from: f */
    public static final ErrorCode f6723f;

    /* renamed from: g */
    public static final ErrorCode f6724g;

    /* renamed from: h */
    public static final ErrorCode f6725h;

    /* renamed from: i */
    public static final ErrorCode f6726i;

    /* renamed from: j */
    public static final ErrorCode f6727j;

    /* renamed from: k */
    public static final ErrorCode f6728k;

    /* renamed from: l */
    public static final ErrorCode f6729l;

    /* renamed from: m */
    public static final ErrorCode f6730m;

    /* renamed from: n */
    public static final ErrorCode f6731n;

    /* renamed from: o */
    public static final ErrorCode f6732o;

    /* renamed from: p */
    public static final ErrorCode f6733p;

    /* renamed from: q */
    public static final ErrorCode f6734q;

    /* renamed from: r */
    public static final ErrorCode f6735r;

    /* renamed from: s */
    public static final ErrorCode f6736s;

    /* renamed from: t */
    public static final ErrorCode f6737t;

    /* renamed from: u */
    public static final ErrorCode f6738u;

    /* renamed from: v */
    public static final ErrorCode f6739v;

    /* renamed from: w */
    public static final ErrorCode f6740w;

    /* renamed from: x */
    public static final ErrorCode[] f6741x;

    /* renamed from: y */
    private static final ErrorDefine f6742y;

    /* renamed from: com.alibaba.sdk.android.push.common.global.c$a */
    private static class a extends CodeGenerator {
        private a() {
        }

        @Override // com.alibaba.sdk.android.error.CodeGenerator
        public String generateCodeStr(String str, String str2, String str3) {
            return str + "_" + str3;
        }
    }

    static {
        ErrorDefine errorDefine = new ErrorDefine("PUSH", new a());
        f6742y = errorDefine;
        ErrorCode errorCodeBuild = errorDefine.defineSdkError("00000").msg(AbstractC1807b.JSON_SUCCESS).build();
        f6718a = errorCodeBuild;
        ErrorCode errorCodeBuild2 = errorDefine.defineServerError("10101").msg("参数缺失").solution("请检查请求参数是否正确").build();
        f6719b = errorCodeBuild2;
        ErrorCode errorCodeBuild3 = errorDefine.defineServerError("10102").msg("参数无效").solution("请检查请求参数是否正确").build();
        f6720c = errorCodeBuild3;
        ErrorCode errorCodeBuild4 = errorDefine.defineServerError("10103").msg("服务端签名与客户端不匹配").solution("请检查推送配置是否正确").build();
        f6721d = errorCodeBuild4;
        ErrorCode errorCodeBuild5 = errorDefine.defineServerError("10104").msg("Tag相关错误").solution("请根据具体错误信息排查，如果不能解决，请联系阿里云技术支持").build();
        f6722e = errorCodeBuild5;
        ErrorCode errorCodeBuild6 = errorDefine.defineServerError("10105").msg("Alias相关错误").solution("请根据具体错误信息排查，如果不能解决，请联系阿里云技术支持").build();
        f6723f = errorCodeBuild6;
        ErrorCode errorCodeBuild7 = errorDefine.defineServerError("10106").msg("服务端内部错误").solution("请根据具体错误信息联系阿里云技术支持").build();
        f6724g = errorCodeBuild7;
        ErrorCode errorCodeBuild8 = errorDefine.defineAndroidError("10107").msg("网络IO错误").solution("请检查网络是否可用").solution("请根据具体错误信息排查，如果不能解决，请联系阿里云技术支持").build();
        f6725h = errorCodeBuild8;
        ErrorCode errorCodeBuild9 = errorDefine.defineSdkError("10108").msg("返回结果解析错误").solution("请保留具体错误信息，联系阿里云技术支持排查").build();
        f6726i = errorCodeBuild9;
        ErrorCode errorCodeBuild10 = errorDefine.defineSdkError("10109").msg("网络连接失败,请检查网络配置").solution("请检查网络是否可用").build();
        f6727j = errorCodeBuild10;
        ErrorCode errorCodeBuild11 = errorDefine.defineSdkError("10114").msg("内部错误").solution("请保留具体错误信息，联系阿里云技术支持排查").build();
        f6728k = errorCodeBuild11;
        ErrorCode errorCodeBuild12 = errorDefine.defineSdkError("10115").msg("通道注册状态异常").solution("请保留具体错误信息，联系阿里云技术支持排查").build();
        f6729l = errorCodeBuild12;
        ErrorCode errorCodeBuild13 = errorDefine.defineServerError("10118").msg("其它接口错误").solution("请根据具体错误信息联系阿里云技术支持").build();
        f6730m = errorCodeBuild13;
        ErrorCode errorCodeBuild14 = errorDefine.defineSdkError("10119").msg("非主进程不用初始化").solution("在非主进程执行初始化时触发，可以忽略").build();
        f6731n = errorCodeBuild14;
        ErrorCode errorCodeBuild15 = errorDefine.defineSdkError("10120").msg("推送注册超时").solution("请保留具体错误信息，联系阿里云技术支持排查").build();
        f6732o = errorCodeBuild15;
        ErrorCode errorCodeBuild16 = errorDefine.defineAndroidError("10121").msg("网络请求失败，请检查网络是否可用").solution("请检查网络是否可用").solution("请根据具体错误信息排查，如果不能解决，请联系阿里云技术支持").build();
        f6733p = errorCodeBuild16;
        ErrorCode errorCodeBuild17 = errorDefine.defineSdkError("20101").msg("参数输入非法").solution("请检查请求的输入参数是否正确").build();
        f6734q = errorCodeBuild17;
        ErrorCode errorCodeBuild18 = errorDefine.defineSdkError("20103").msg("appversion参数错误,请检查您的版本号,版本号不能为null或长度不能超过32位").solution("开启debug会检查此错误，请检查应用版本号是否过长").build();
        f6735r = errorCodeBuild18;
        ErrorCode errorCodeBuild19 = errorDefine.defineSdkError("20106").msg("核心组件未配置").solution("开启debug会检查此错误，请检查是否删除了推送组件的声明").build();
        f6736s = errorCodeBuild19;
        ErrorCode errorCodeBuild20 = errorDefine.defineSdkError("20107").msg("连续crash，推送服务关闭").solution("应用初始化推送后崩溃，会在下次启动关闭推送服务。请检查应用的崩溃记录").solution("开发测试场景下，人为触发的，请清除应用数据恢复").solution("线上场景会尝试自动恢复，如果仍然崩溃，需要升级应用版本才会恢复").build();
        f6737t = errorCodeBuild20;
        ErrorCode errorCodeBuild21 = errorDefine.defineSdkError("20108").msg("未初始化，请先调用 PushServiceFactory的init方法").solution("请确认是否正常初始化").build();
        f6738u = errorCodeBuild21;
        ErrorCode errorCodeBuild22 = errorDefine.defineSdkError("20109").msg("废弃接口").solution("请查看文档，使用合适的api").build();
        f6739v = errorCodeBuild22;
        ErrorCode errorCodeBuild23 = errorDefine.defineSdkError("20110").msg("已经调用注册，重复调用无效").solution("register方法如果失败了，会自动重试，一般情况下不需要重复调用").solution("如果希望内部重试失败的情况，由外部重新调用register，请至少在上一次register失败回调两次（确认内部重试还是失败）的情况下，先调用PushControlService的reset方法，然后再调用下一次register方法").build();
        f6740w = errorCodeBuild23;
        f6741x = new ErrorCode[]{errorCodeBuild, errorCodeBuild2, errorCodeBuild3, errorCodeBuild4, errorCodeBuild5, errorCodeBuild6, errorCodeBuild7, errorCodeBuild8, errorCodeBuild9, errorCodeBuild10, errorCodeBuild11, errorCodeBuild12, errorCodeBuild13, errorCodeBuild14, errorCodeBuild15, errorCodeBuild16, errorCodeBuild17, errorCodeBuild18, errorCodeBuild19, errorCodeBuild20, errorCodeBuild21, errorCodeBuild22, errorCodeBuild23, m5173a(123, "accs错误信息").solution("格式ACCS_123, 123为accs错误码，请结合accs错误码排查").build(), m5174a("xxx", "agoo错误信息").solution("格式AGOO_xxx, xxx为agoo错误码，请结合agoo错误码排查").build()};
    }

    /* renamed from: a */
    public static ErrorBuilder m5173a(int i4, String str) {
        return f6742y.defineSdkError("ACCS_" + i4).msg(str);
    }

    /* renamed from: a */
    public static ErrorBuilder m5174a(String str, String str2) {
        return f6742y.defineSdkError(str).msg(str2);
    }

    /* renamed from: b */
    public static ErrorCode m5175b(String str, String str2) {
        ErrorCode errorCode;
        ErrorBuilder errorBuilderMsg;
        str.hashCode();
        switch (str) {
            case "InternalError":
                errorCode = f6724g;
                break;
            case "MissingParam":
                errorCode = f6719b;
                break;
            case "TagError":
                errorCode = f6722e;
                break;
            case "SignNotMatch":
                errorCode = f6721d;
                break;
            case "OK":
                return f6718a;
            case "AliasError":
                errorCode = f6723f;
                break;
            case "InvalidParam":
                errorCode = f6720c;
                break;
            default:
                errorBuilderMsg = f6730m.copy().msg(str + ":" + str2);
                return errorBuilderMsg.build();
        }
        errorBuilderMsg = errorCode.copy().msg(str2);
        return errorBuilderMsg.build();
    }
}
