package com.efs.sdk.base.p020a.p021a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2946c;
import com.efs.sdk.base.p020a.p031h.p033b.C2951b;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.d */
/* loaded from: classes2.dex */
public final class C2904d extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.d$a */
    public static class a {

        /* renamed from: a */
        private static final C2904d f1024a = new C2904d(0);
    }

    public /* synthetic */ C2904d(byte b4) {
        this();
    }

    /* renamed from: b */
    private static void m2069b(HttpResponse httpResponse) {
        C2967f.a.f1173a.m2237a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    /* renamed from: c */
    private static void m2070c(HttpResponse httpResponse) {
        int i4;
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (!TextUtils.isEmpty(str) && (i4 = Integer.parseInt(str)) > C2916c.m2097a().f1065d.f1056a) {
                C2916c.m2097a().m2107a(i4);
            }
        }
    }

    @Override // com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2945b
    /* renamed from: a */
    public final /* synthetic */ void mo2063a(@NonNull InterfaceC2946c<HttpResponse> interfaceC2946c, @Nullable HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C2951b c2951b = (C2951b) interfaceC2946c;
            ((Map) httpResponse2.extra).putAll(c2951b.f1146f);
            c2951b.f1146f.clear();
            C2901a.m2055a();
            C2901a.m2057a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@Nullable HttpResponse httpResponse) {
        m2068a(httpResponse);
        if (httpResponse == null) {
            return;
        }
        m2069b(httpResponse);
        m2070c(httpResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // com.efs.sdk.base.http.AbsHttpListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(@android.support.annotation.NonNull com.efs.sdk.base.http.HttpResponse r6) {
        /*
            r5 = this;
            T r0 = r6.extra
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "flow_limit"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L20
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r0 = r0.toString()
            T r2 = r6.extra
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r2.get(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
        L20:
            T r0 = r6.extra
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "type"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L37
            T r0 = r6.extra
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L39
        L37:
            java.lang.String r0 = ""
        L39:
            T r1 = r6.extra
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "size"
            boolean r1 = r1.containsKey(r2)
            r3 = 0
            if (r1 == 0) goto L5b
            T r1 = r6.extra
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5b
            int r1 = java.lang.Integer.parseInt(r1)
            goto L5c
        L5b:
            r1 = r3
        L5c:
            com.efs.sdk.base.a.e.b r2 = com.efs.sdk.base.p020a.p027e.HandlerC2924b.m2136a()
            android.os.Message r4 = android.os.Message.obtain()
            r4.what = r3
            r4.obj = r0
            r4.arg1 = r1
            r2.sendMessage(r4)
        L6d:
            m2069b(r6)
            com.efs.sdk.base.a.i.f r0 = com.efs.sdk.base.p020a.p035i.C2967f.a.m2238a()
            com.efs.sdk.base.a.i.d r0 = r0.f1171c
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f1164b
            r0.incrementAndGet()
            m2070c(r6)
            m2068a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p020a.p021a.C2904d.onSuccess(com.efs.sdk.base.http.HttpResponse):void");
    }

    private C2904d() {
    }

    /* renamed from: a */
    public static C2904d m2067a() {
        return a.f1024a;
    }

    /* renamed from: a */
    private static void m2068a(@Nullable HttpResponse httpResponse) {
        String str;
        if (C2921a.m2128a().f1043f) {
            if (httpResponse == null) {
                str = "upload result : false";
            } else {
                str = "upload result : " + httpResponse.succ + ", resp is " + httpResponse.toString();
            }
            C2957d.m2212a("efs.px.api", str);
        }
    }
}
