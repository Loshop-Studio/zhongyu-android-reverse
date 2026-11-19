package com.efs.sdk.base.p039a.p040a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5686c;
import com.efs.sdk.base.p039a.p054i.C5703b;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.b */
/* loaded from: classes3.dex */
public final class C5642b extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.b$a */
    public static class a {

        /* renamed from: a */
        private static final C5642b f4615a = new C5642b(0);
    }

    public /* synthetic */ C5642b(byte b10) {
        this();
    }

    @Override // com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5685b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4032a(@NonNull InterfaceC5686c<HttpResponse> interfaceC5686c, @Nullable HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C5641a.m4024a();
            C5641a.m4026a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        m4031a(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(@NonNull HttpResponse httpResponse) throws NumberFormatException {
        m4031a(httpResponse);
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i9 = Integer.parseInt(str);
            C5707f c5707f = C5707f.a.f4777a;
            if (c5707f.f4774b == null || !C5661a.m4097a().f4645d) {
                return;
            }
            C5703b c5703b = new C5703b("efs_core", "config_coverage", c5707f.f4773a.f4767c);
            c5703b.put("cver", Integer.valueOf(i9));
            c5707f.f4774b.m4102a(c5703b);
        }
    }

    private C5642b() {
    }

    /* renamed from: a */
    public static C5642b m4030a() {
        return a.f4615a;
    }

    /* renamed from: a */
    private static void m4031a(@NonNull HttpResponse httpResponse) {
        C5707f.a.f4777a.m4206a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }
}
