package p198o4;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.bean.ApiResp;
import com.zykj.study.bean.TokenResp;
import com.zykj.study.provide.ClientCodeInterceptor;
import p103fa.InterfaceC8495i;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8511y;
import p179m7.InterfaceC9324c;

/* renamed from: o4.h */
/* loaded from: classes4.dex */
public interface InterfaceC9525h {
    @InterfaceC8501o
    /* renamed from: a */
    Object m17729a(@InterfaceC8511y String str, @InterfaceC8495i("AppName") String str2, @InterfaceC8495i("AppVersion") int i10, @InterfaceC8495i(HttpHeaders.AUTHORIZATION) String str3, @InterfaceC8495i("RefreshToken") String str4, @InterfaceC8495i(ClientCodeInterceptor.CLIENT_CODE) String str5, InterfaceC9324c<? super ApiResp<TokenResp>> interfaceC9324c);
}
