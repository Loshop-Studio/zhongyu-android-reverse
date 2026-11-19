package com.efs.sdk.base.p035a.p046h.p048b;

import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1317b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.d */
/* loaded from: classes.dex */
public final class C1325d {

    /* renamed from: a */
    public C1323b f7119a;

    /* renamed from: b */
    private List<InterfaceC1317b<HttpResponse>> f7120b;

    public C1325d(String str) {
        C1323b c1323b = new C1323b();
        this.f7119a = c1323b;
        c1323b.f7111a = str;
    }

    /* renamed from: a */
    public final C1325d m5561a(Map<String, String> map) {
        this.f7119a.f7112b = map;
        return this;
    }

    /* renamed from: a */
    public final C1325d m5560a(String str, String str2) {
        C1323b c1323b = this.f7119a;
        if (c1323b.f7116f == null) {
            c1323b.f7116f = new HashMap(5);
        }
        this.f7119a.f7116f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C1325d m5559a(AbsHttpListener absHttpListener) {
        if (this.f7120b == null) {
            this.f7120b = new ArrayList(5);
        }
        this.f7120b.add(absHttpListener);
        return this;
    }

    /* renamed from: a */
    public final C1324c m5558a() {
        C1324c c1324c = new C1324c(this.f7119a);
        List<InterfaceC1317b<HttpResponse>> list = this.f7120b;
        if (list != null && list.size() > 0) {
            c1324c.m5538a(this.f7120b);
        }
        List<InterfaceC1317b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            c1324c.m5538a(httpListenerList);
        }
        return c1324c;
    }
}
