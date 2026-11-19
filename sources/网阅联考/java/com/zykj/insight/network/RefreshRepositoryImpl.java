package com.zykj.insight.network;

import com.zykj.http.bean.HeaderLiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p116r1.AbstractC4494a;

/* loaded from: classes2.dex */
public final class RefreshRepositoryImpl extends AbstractC4494a {

    /* renamed from: a */
    public final HeaderLiveData f4161a;

    /* renamed from: b */
    public final AtomicBoolean f4162b;

    /* renamed from: c */
    public StringBuffer f4163c;

    public RefreshRepositoryImpl(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "headerLiveData");
        this.f4161a = headerLiveData;
        this.f4162b = new AtomicBoolean(false);
        this.f4163c = new StringBuffer();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p116r1.AbstractC4494a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4605a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$1 r0 = (com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$1) r0
            int r1 = r0.f4167d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4167d = r1
            goto L18
        L13:
            com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$1 r0 = new com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f4165b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4167d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f4164a
            com.zykj.insight.network.RefreshRepositoryImpl r0 = (com.zykj.insight.network.RefreshRepositoryImpl) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto La7
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f4164a
            com.zykj.insight.network.RefreshRepositoryImpl r2 = (com.zykj.insight.network.RefreshRepositoryImpl) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4d
        L41:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f4162b
            boolean r8 = r8.get()
            if (r8 == 0) goto L73
            r2 = r7
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.f4162b
            boolean r8 = r8.get()
            if (r8 == 0) goto La8
            int r8 = r2.hashCode()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r8 = " token正在获取中"
            r3.append(r8)
            r0.f4164a = r2
            r0.f4167d = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r8 != r1) goto L4d
            return r1
        L73:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f4162b
            r2 = 0
            r8.compareAndSet(r2, r4)
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            r7.f4163c = r8
            int r8 = r7.hashCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r8 = "  正在获取token"
            r2.append(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$2 r2 = new com.zykj.insight.network.RefreshRepositoryImpl$refreshToken$2
            r4 = 0
            r2.<init>(r7, r4)
            r0.f4164a = r7
            r0.f4167d = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto La6
            return r1
        La6:
            r0 = r7
        La7:
            r2 = r0
        La8:
            java.lang.StringBuffer r8 = r2.f4163c
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "accessToken.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.insight.network.RefreshRepositoryImpl.mo4605a(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/网阅联考/smali_classes2/com/zykj/insight/network/RefreshRepositoryImpl.smali:110
    }
}
