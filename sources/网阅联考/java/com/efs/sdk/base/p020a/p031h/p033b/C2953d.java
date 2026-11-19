package com.efs.sdk.base.p020a.p031h.p033b;

import android.support.annotation.NonNull;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2945b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.d */
/* loaded from: classes2.dex */
public final class C2953d {

    /* renamed from: a */
    public C2951b f1149a;

    /* renamed from: b */
    private List<InterfaceC2945b<HttpResponse>> f1150b;

    public C2953d(@NonNull String str) {
        C2951b c2951b = new C2951b();
        this.f1149a = c2951b;
        c2951b.f1141a = str;
    }

    /* renamed from: a */
    public final C2953d m2202a(@NonNull Map<String, String> map) {
        this.f1149a.f1142b = map;
        return this;
    }

    /* renamed from: a */
    public final C2953d m2201a(String str, String str2) {
        C2951b c2951b = this.f1149a;
        if (c2951b.f1146f == null) {
            c2951b.f1146f = new HashMap(5);
        }
        this.f1149a.f1146f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C2953d m2200a(@NonNull AbsHttpListener absHttpListener) {
        if (this.f1150b == null) {
            this.f1150b = new ArrayList(5);
        }
        this.f1150b.add(absHttpListener);
        return this;
    }

    /* renamed from: a */
    public final C2952c m2199a() {
        C2952c c2952c = new C2952c(this.f1149a);
        List<InterfaceC2945b<HttpResponse>> list = this.f1150b;
        if (list != null && list.size() > 0) {
            c2952c.m2179a(this.f1150b);
        }
        List<InterfaceC2945b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            c2952c.m2179a(httpListenerList);
        }
        return c2952c;
    }
}
