package com.efs.sdk.base.p039a.p050h.p052b;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5685b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.d */
/* loaded from: classes3.dex */
public final class C5693d {

    /* renamed from: a */
    public C5691b f4753a;

    /* renamed from: b */
    private List<InterfaceC5685b<HttpResponse>> f4754b;

    public C5693d(@NonNull String str) {
        C5691b c5691b = new C5691b();
        this.f4753a = c5691b;
        c5691b.f4745a = str;
    }

    /* renamed from: a */
    public final C5693d m4171a(@NonNull Map<String, String> map) {
        this.f4753a.f4746b = map;
        return this;
    }

    /* renamed from: a */
    public final C5693d m4170a(String str, String str2) {
        C5691b c5691b = this.f4753a;
        if (c5691b.f4750f == null) {
            c5691b.f4750f = new HashMap(5);
        }
        this.f4753a.f4750f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C5693d m4169a(@NonNull AbsHttpListener absHttpListener) {
        if (this.f4754b == null) {
            this.f4754b = new ArrayList(5);
        }
        this.f4754b.add(absHttpListener);
        return this;
    }

    /* renamed from: a */
    public final C5692c m4168a() {
        C5692c c5692c = new C5692c(this.f4753a);
        List<InterfaceC5685b<HttpResponse>> list = this.f4754b;
        if (list != null && list.size() > 0) {
            c5692c.m4148a(this.f4754b);
        }
        List<InterfaceC5685b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            c5692c.m4148a(httpListenerList);
        }
        return c5692c;
    }
}
