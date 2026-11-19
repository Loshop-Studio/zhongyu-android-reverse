package com.efs.sdk.base.p039a.p040a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5686c;
import com.efs.sdk.base.p039a.p050h.p052b.C5691b;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.d */
/* loaded from: classes3.dex */
public final class C5644d extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.d$a */
    public static class a {

        /* renamed from: a */
        private static final C5644d f4628a = new C5644d(0);
    }

    public /* synthetic */ C5644d(byte b10) {
        this();
    }

    /* renamed from: b */
    private static void m4038b(HttpResponse httpResponse) {
        C5707f.a.f4777a.m4206a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    /* renamed from: c */
    private static void m4039c(HttpResponse httpResponse) {
        int i9;
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (!TextUtils.isEmpty(str) && (i9 = Integer.parseInt(str)) > C5656c.m4066a().f4669d.f4660a) {
                C5656c.m4066a().m4076a(i9);
            }
        }
    }

    @Override // com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5685b
    /* renamed from: a */
    public final /* synthetic */ void mo4032a(@NonNull InterfaceC5686c<HttpResponse> interfaceC5686c, @Nullable HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C5691b c5691b = (C5691b) interfaceC5686c;
            ((Map) httpResponse2.extra).putAll(c5691b.f4750f);
            c5691b.f4750f.clear();
            C5641a.m4024a();
            C5641a.m4026a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@Nullable HttpResponse httpResponse) {
        m4037a(httpResponse);
        if (httpResponse == null) {
            return;
        }
        m4038b(httpResponse);
        m4039c(httpResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // com.efs.sdk.base.http.AbsHttpListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(@androidx.annotation.NonNull com.efs.sdk.base.http.HttpResponse r6) {
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
            com.efs.sdk.base.a.e.b r2 = com.efs.sdk.base.p039a.p046e.HandlerC5664b.m4105a()
            android.os.Message r4 = android.os.Message.obtain()
            r4.what = r3
            r4.obj = r0
            r4.arg1 = r1
            r2.sendMessage(r4)
        L6d:
            m4038b(r6)
            com.efs.sdk.base.a.i.f r0 = com.efs.sdk.base.p039a.p054i.C5707f.a.m4207a()
            com.efs.sdk.base.a.i.d r0 = r0.f4775c
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f4768b
            r0.incrementAndGet()
            m4039c(r6)
            m4037a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p039a.p040a.C5644d.onSuccess(com.efs.sdk.base.http.HttpResponse):void");
    }

    private C5644d() {
    }

    /* renamed from: a */
    public static C5644d m4036a() {
        return a.f4628a;
    }

    /* renamed from: a */
    private static void m4037a(@Nullable HttpResponse httpResponse) {
        String str;
        if (C5661a.m4097a().f4647f) {
            if (httpResponse == null) {
                str = "upload result : false";
            } else {
                str = "upload result : " + httpResponse.succ + ", resp is " + httpResponse.toString();
            }
            C5697d.m4181a("efs.px.api", str);
        }
    }
}
