package com.zykj.huiwei.launcher.repository;

import com.zykj.huiwei.launcher.api.AuthService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AuthRepository {

    /* renamed from: a */
    public final AuthService f6143a;

    public AuthRepository(AuthService authService) {
        Intrinsics.checkNotNullParameter(authService, "authService");
        this.f6143a = authService;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5413a(java.lang.String r8, com.zykj.huiwei.launcher.bean.req.LoginReq r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.zykj.huiwei.launcher.repository.AuthRepository$token$1
            if (r0 == 0) goto L14
            r0 = r10
            com.zykj.huiwei.launcher.repository.AuthRepository$token$1 r0 = (com.zykj.huiwei.launcher.repository.AuthRepository$token$1) r0
            int r1 = r0.f6148e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6148e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.zykj.huiwei.launcher.repository.AuthRepository$token$1 r0 = new com.zykj.huiwei.launcher.repository.AuthRepository$token$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f6146c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f6148e
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r8 = r6.f6145b
            com.zykj.huiwei.launcher.bean.req.LoginReq r8 = (com.zykj.huiwei.launcher.bean.req.LoginReq) r8
            java.lang.Object r8 = r6.f6144a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.ResultKt.throwOnFailure(r10)
            com.zykj.huiwei.launcher.api.AuthService r1 = r7.f6143a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r3 = "/api/TokenAuth/Login"
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r6.f6144a = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r6.f6145b = r8
            r6.f6148e = r2
            java.lang.String r4 = "com.zykj.manage"
            r5 = 10034(0x2732, float:1.406E-41)
            r3 = r9
            r2 = r10
            java.lang.Object r10 = r1.getToken(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L6c
            return r0
        L6c:
            com.zykj.http.bean.ApiResp r10 = (com.zykj.http.bean.ApiResp) r10
            java.lang.Object r8 = p004a3.AbstractC0009a.m12a(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.AuthRepository.m5413a(java.lang.String, com.zykj.huiwei.launcher.bean.req.LoginReq, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/AuthRepository.smali:44
    }
}
