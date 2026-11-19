package com.efs.sdk.base.p035a.p036a;

import android.text.TextUtils;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1318c;
import com.efs.sdk.base.p035a.p050i.C1335b;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.b */
/* loaded from: classes.dex */
public final class C1274b extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.b$a */
    static class a {

        /* renamed from: a */
        private static final C1274b f6981a = new C1274b(0);
    }

    /* synthetic */ C1274b(byte b4) {
        this();
    }

    @Override // com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1317b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5422a(InterfaceC1318c<HttpResponse> interfaceC1318c, HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C1273a.m5414a();
            C1273a.m5416a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        m5421a(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(HttpResponse httpResponse) throws NumberFormatException {
        m5421a(httpResponse);
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i4 = Integer.parseInt(str);
            C1339f c1339f = C1339f.a.f7143a;
            if (c1339f.f7140b == null || !C1293a.m5487a().f7011d) {
                return;
            }
            C1335b c1335b = new C1335b("efs_core", "config_coverage", c1339f.f7139a.f7133c);
            c1335b.put("cver", Integer.valueOf(i4));
            c1339f.f7140b.m5492a(c1335b);
        }
    }

    private C1274b() {
    }

    /* renamed from: a */
    public static C1274b m5420a() {
        return a.f6981a;
    }

    /* renamed from: a */
    private static void m5421a(HttpResponse httpResponse) {
        C1339f.a.f7143a.m5596a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }
}
