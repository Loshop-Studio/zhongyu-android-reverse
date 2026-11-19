package p198o4;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.bean.ApiResp;
import com.zykj.study.bean.SmsReq;
import com.zykj.study.bean.TokenReq;
import com.zykj.study.bean.TokenResponse;
import com.zykj.study.bean.UpdatePwdReq;
import com.zykj.study.bean.UpdatePwdResponse;
import com.zykj.study.bean.UserResponse;
import com.zykj.study.provide.ClientCodeInterceptor;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8495i;
import p103fa.InterfaceC8501o;
import p179m7.InterfaceC9324c;

/* renamed from: o4.a */
/* loaded from: classes4.dex */
public interface InterfaceC9518a {
    @InterfaceC8501o("api/TokenAuth/SendNewDeviceSmsVerificationCode")
    /* renamed from: a */
    Object m17679a(@InterfaceC8487a SmsReq smsReq, @InterfaceC8495i(HttpHeaders.AUTHORIZATION) String str, InterfaceC9324c<? super ApiResp<Void>> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Account/Info")
    /* renamed from: b */
    Object m17680b(InterfaceC9324c<? super UserResponse> interfaceC9324c);

    @InterfaceC8501o("api/services/app/User/ChangePasswordAsync")
    /* renamed from: c */
    Object m17681c(@InterfaceC8487a UpdatePwdReq updatePwdReq, InterfaceC9324c<? super UpdatePwdResponse> interfaceC9324c);

    @InterfaceC8501o("api/TokenAuth/Login")
    /* renamed from: d */
    Object m17682d(@InterfaceC8487a TokenReq tokenReq, @InterfaceC8495i("AppName") String str, @InterfaceC8495i("AppVersion") int i10, @InterfaceC8495i(ClientCodeInterceptor.CLIENT_CODE) String str2, InterfaceC9324c<? super TokenResponse> interfaceC9324c);
}
