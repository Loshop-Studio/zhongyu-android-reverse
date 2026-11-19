package com.zykj.huiwei.launcher.repository;

import com.zykj.huiwei.launcher.api.UserService;
import com.zykj.huiwei.launcher.bean.req.UpdatePwdReq;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class UserRepository {

    /* renamed from: a */
    public final UserService f6199a;

    public UserRepository(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f6199a = userService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5433b(java.lang.String r5, kotlin.coroutines.Continuation r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.huiwei.launcher.repository.UserRepository$forceChangePasswordAsync$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.huiwei.launcher.repository.UserRepository$forceChangePasswordAsync$1 r0 = (com.zykj.huiwei.launcher.repository.UserRepository$forceChangePasswordAsync$1) r0
            int r1 = r0.f6203d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6203d = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.repository.UserRepository$forceChangePasswordAsync$1 r0 = new com.zykj.huiwei.launcher.repository.UserRepository$forceChangePasswordAsync$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6201b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6203d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f6200a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.huiwei.launcher.api.UserService r6 = r4.f6199a
            com.zykj.huiwei.launcher.bean.req.ForcePsdReq r2 = new com.zykj.huiwei.launcher.bean.req.ForcePsdReq
            r2.<init>(r5)
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.f6200a = r5
            r0.f6203d = r3
            java.lang.Object r6 = r6.forceChangePsdAsync(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.zykj.http.bean.ApiResp r6 = (com.zykj.http.bean.ApiResp) r6
            p004a3.AbstractC0009a.m13b(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.UserRepository.m5433b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/UserRepository.smali:55
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5434c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.repository.UserRepository$schoolInfoSettingsAsync$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.repository.UserRepository$schoolInfoSettingsAsync$1 r0 = (com.zykj.huiwei.launcher.repository.UserRepository$schoolInfoSettingsAsync$1) r0
            int r1 = r0.f6206c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6206c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.repository.UserRepository$schoolInfoSettingsAsync$1 r0 = new com.zykj.huiwei.launcher.repository.UserRepository$schoolInfoSettingsAsync$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6204a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6206c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.huiwei.launcher.api.UserService r5 = r4.f6199a
            r0.f6206c = r3
            java.lang.Object r5 = r5.schoolInfoSettingsAsync(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.zykj.http.bean.ApiResp r5 = (com.zykj.http.bean.ApiResp) r5
            java.lang.Object r5 = p004a3.AbstractC0009a.m12a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.UserRepository.m5434c(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/UserRepository.smali:239
    }

    /* renamed from: d */
    public final Flow m5435d(UpdatePwdReq updatePwdReq) {
        Intrinsics.checkNotNullParameter(updatePwdReq, "updatePwdReq");
        return FlowKt.flow(new UserRepository$updatePwd$1(this, updatePwdReq, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5436e(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.repository.UserRepository$userInfo$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.repository.UserRepository$userInfo$1 r0 = (com.zykj.huiwei.launcher.repository.UserRepository$userInfo$1) r0
            int r1 = r0.f6213c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6213c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.repository.UserRepository$userInfo$1 r0 = new com.zykj.huiwei.launcher.repository.UserRepository$userInfo$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6211a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6213c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.huiwei.launcher.api.UserService r5 = r4.f6199a
            r0.f6213c = r3
            java.lang.Object r5 = r5.userInfo(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.zykj.http.bean.ApiResp r5 = (com.zykj.http.bean.ApiResp) r5
            java.lang.Object r5 = p004a3.AbstractC0009a.m12a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.UserRepository.m5436e(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/UserRepository.smali:429
    }
}
