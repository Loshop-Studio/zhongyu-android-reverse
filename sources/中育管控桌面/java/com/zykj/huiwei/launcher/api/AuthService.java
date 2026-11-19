package com.zykj.huiwei.launcher.api;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.bean.req.LoginReq;
import com.zykj.huiwei.launcher.bean.resp.LoginResp;
import com.zykj.huiwei.launcher.bean.resp.TokenResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4518i;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4534y;

@Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/AuthService;", "", "getToken", "Lcom/zykj/http/bean/ApiResp;", "Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;", "serverUrl", "", "req", "Lcom/zykj/huiwei/launcher/bean/req/LoginReq;", "appName", "versionCode", "", "(Ljava/lang/String;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;", "authorization", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface AuthService {
    @InterfaceC4524o
    Object getToken(@InterfaceC4534y String str, @InterfaceC4510a LoginReq loginReq, @InterfaceC4518i("AppName") String str2, @InterfaceC4518i("AppVersion") int i6, Continuation<? super ApiResp<LoginResp>> continuation);

    @InterfaceC4524o
    Object refreshToken(@InterfaceC4534y String str, @InterfaceC4518i("AppName") String str2, @InterfaceC4518i("AppVersion") int i6, @InterfaceC4518i(HttpHeaders.AUTHORIZATION) String str3, @InterfaceC4518i("RefreshToken") String str4, Continuation<? super ApiResp<TokenResp>> continuation);
}
