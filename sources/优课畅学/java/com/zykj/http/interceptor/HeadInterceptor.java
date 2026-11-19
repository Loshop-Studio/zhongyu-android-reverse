package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.bean.HeaderBean;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8925w;
import p136i9.InterfaceC8926x;
import p169l8.InterfaceC9271h;

@Keep
/* loaded from: classes4.dex */
public final class HeadInterceptor implements InterfaceC8926x {

    @Inject
    public InterfaceC9271h headerBeanFlow;

    @Inject
    public HeadInterceptor() {
    }

    @HeaderBeanFlow
    public static /* synthetic */ void getHeaderBeanFlow$annotations() {
    }

    public final InterfaceC9271h getHeaderBeanFlow() {
        InterfaceC9271h interfaceC9271h = this.headerBeanFlow;
        if (interfaceC9271h != null) {
            return interfaceC9271h;
        }
        AbstractC9133u.m16151y("headerBeanFlow");
        return null;
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) {
        C8925w c8925wM15330d;
        String str;
        AbstractC9133u.m16133g(chain, "chain");
        C8899b0 c8899b0Mo15332a = chain.mo15332a();
        C8899b0.a aVarM15049i = c8899b0Mo15332a.m15049i();
        HeaderBean headerBean = (HeaderBean) getHeaderBeanFlow().getValue();
        String appName = headerBean.getAppName();
        if (appName != null) {
            aVarM15049i.m15067o("AppName", appName);
        }
        String versionCode = headerBean.getVersionCode();
        if (versionCode != null) {
            aVarM15049i.m15067o("AppVersion", versionCode);
        }
        String accessToken = headerBean.getAccessToken();
        if (accessToken != null) {
            aVarM15049i.m15067o(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        }
        String serverUrl = headerBean.getServerUrl();
        if (serverUrl != null && (c8925wM15330d = C8925w.f16797j.m15330d(serverUrl)) != null) {
            C8925w.a aVarM15286j = c8925wM15330d.m15286j();
            String string = c8899b0Mo15332a.m15052l().toString();
            if (AbstractC8661c0.m13973S(string, "?", false, 2, null)) {
                str = "?" + AbstractC8661c0.m13958I0(string, new String[]{"?"}, false, 0, 6, null).get(1);
            } else {
                str = "";
            }
            Iterator it = c8899b0Mo15332a.m15052l().m15288l().iterator();
            while (it.hasNext()) {
                aVarM15286j.m15302b((String) it.next());
            }
            aVarM15049i.m15074v(aVarM15286j + str);
        }
        return chain.mo15333b(aVarM15049i.m15055b());
    }

    public final void setHeaderBeanFlow(InterfaceC9271h interfaceC9271h) {
        AbstractC9133u.m16133g(interfaceC9271h, "<set-?>");
        this.headerBeanFlow = interfaceC9271h;
    }
}
