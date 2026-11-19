package com.efs.sdk.base.p020a.p021a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2946c;
import com.efs.sdk.base.p020a.p035i.C2963b;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.b */
/* loaded from: classes2.dex */
public final class C2902b extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.b$a */
    public static class a {

        /* renamed from: a */
        private static final C2902b f1011a = new C2902b(0);
    }

    public /* synthetic */ C2902b(byte b4) {
        this();
    }

    @Override // com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2945b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2063a(@NonNull InterfaceC2946c<HttpResponse> interfaceC2946c, @Nullable HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C2901a.m2055a();
            C2901a.m2057a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        m2062a(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(@NonNull HttpResponse httpResponse) throws NumberFormatException {
        m2062a(httpResponse);
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i4 = Integer.parseInt(str);
            C2967f c2967f = C2967f.a.f1173a;
            if (c2967f.f1170b == null || !C2921a.m2128a().f1041d) {
                return;
            }
            C2963b c2963b = new C2963b("efs_core", "config_coverage", c2967f.f1169a.f1163c);
            c2963b.put("cver", Integer.valueOf(i4));
            c2967f.f1170b.m2133a(c2963b);
        }
    }

    private C2902b() {
    }

    /* renamed from: a */
    public static C2902b m2061a() {
        return a.f1011a;
    }

    /* renamed from: a */
    private static void m2062a(@NonNull HttpResponse httpResponse) {
        C2967f.a.f1173a.m2237a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }
}
