package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.bean.HeaderBean;
import java.util.Iterator;
import je.C9738r;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9739s;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p379vd.InterfaceC11603l;

@Keep
/* loaded from: classes6.dex */
public final class HeadInterceptor implements InterfaceC9739s {
    public InterfaceC11603l headerBeanFlow;

    @HeaderBeanFlow
    public static /* synthetic */ void getHeaderBeanFlow$annotations() {
    }

    public final InterfaceC11603l getHeaderBeanFlow() {
        InterfaceC11603l interfaceC11603l = this.headerBeanFlow;
        if (interfaceC11603l != null) {
            return interfaceC11603l;
        }
        AbstractC9979u.m20312y("headerBeanFlow");
        return null;
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        C9738r c9738rM19470f;
        String str;
        AbstractC9979u.m20294g(chain, "chain");
        C9743w c9743wRequest = chain.request();
        C9743w.a aVarM19590h = c9743wRequest.m19590h();
        HeaderBean headerBean = (HeaderBean) getHeaderBeanFlow().getValue();
        String appName = headerBean.getAppName();
        if (appName != null) {
            aVarM19590h.m19600h("AppName", appName);
        }
        String versionCode = headerBean.getVersionCode();
        if (versionCode != null) {
            aVarM19590h.m19600h("AppVersion", versionCode);
        }
        String accessToken = headerBean.getAccessToken();
        if (accessToken != null) {
            aVarM19590h.m19600h("Authorization", "Bearer " + accessToken);
        }
        String serverUrl = headerBean.getServerUrl();
        if (serverUrl != null && (c9738rM19470f = C9738r.f22749k.m19470f(serverUrl)) != null) {
            C9738r.a aVarM19421k = c9738rM19470f.m19421k();
            String string = c9743wRequest.m19592j().toString();
            if (AbstractC10793c0.m23108U(string, "?", false, 2, null)) {
                str = "?" + AbstractC10793c0.m23091I0(string, new String[]{"?"}, false, 0, 6, null).get(1);
            } else {
                str = "";
            }
            Iterator it = c9743wRequest.m19592j().m19423m().iterator();
            while (it.hasNext()) {
                aVarM19421k.m19432b((String) it.next());
            }
            aVarM19590h.m19608p(aVarM19421k + str);
        }
        return chain.mo19477a(aVarM19590h.m19595b());
    }

    public final void setHeaderBeanFlow(InterfaceC11603l interfaceC11603l) {
        AbstractC9979u.m20294g(interfaceC11603l, "<set-?>");
        this.headerBeanFlow = interfaceC11603l;
    }
}
