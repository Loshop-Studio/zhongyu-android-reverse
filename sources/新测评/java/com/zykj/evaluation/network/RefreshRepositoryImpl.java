package com.zykj.evaluation.network;

import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.ServerInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p134j7.AbstractC7814a;

/* loaded from: classes4.dex */
public final class RefreshRepositoryImpl extends AbstractC7814a {

    /* renamed from: a */
    public final MutableStateFlow f8802a;

    /* renamed from: b */
    public final AtomicBoolean f8803b;

    /* renamed from: c */
    public StringBuffer f8804c;

    public RefreshRepositoryImpl(MutableStateFlow headerBeanFlow) {
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        this.f8802a = headerBeanFlow;
        this.f8803b = new AtomicBoolean(false);
        this.f8804c = new StringBuffer();
    }

    /* renamed from: c */
    public static final Unit m8773c(RefreshRepositoryImpl refreshRepositoryImpl, ServerInfo serverInfo) {
        Object value;
        if (serverInfo != null) {
            MutableStateFlow mutableStateFlow = refreshRepositoryImpl.f8802a;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, HeaderBean.copy$default((HeaderBean) value, null, null, null, serverInfo.m10597c(), null, 23, null)));
            refreshRepositoryImpl.f8804c.insert(0, serverInfo.m10597c());
        }
        refreshRepositoryImpl.f8803b.compareAndSet(true, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p134j7.AbstractC7814a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8774a(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.zykj.evaluation.network.RefreshRepositoryImpl$refreshToken$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.evaluation.network.RefreshRepositoryImpl$refreshToken$1 r0 = (com.zykj.evaluation.network.RefreshRepositoryImpl$refreshToken$1) r0
            int r1 = r0.f8808d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8808d = r1
            goto L18
        L13:
            com.zykj.evaluation.network.RefreshRepositoryImpl$refreshToken$1 r0 = new com.zykj.evaluation.network.RefreshRepositoryImpl$refreshToken$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8806b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8808d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f8805a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.f8803b
            r2 = 0
            boolean r8 = r8.compareAndSet(r2, r3)
            if (r8 != 0) goto L5a
        L41:
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.f8803b
            boolean r8 = r8.get()
            if (r8 == 0) goto L9c
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.f8805a = r8
            r0.f8808d = r3
            r4 = 100
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r8 != r1) goto L41
            return r1
        L5a:
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            r6.f8804c = r8
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.f8802a
            java.lang.Object r8 = r8.getValue()
            com.zykj.http.bean.HeaderBean r8 = (com.zykj.http.bean.HeaderBean) r8
            java.lang.String r0 = r8.getAccessToken()
            if (r0 == 0) goto L92
            int r0 = r0.length()
            if (r0 != 0) goto L76
            goto L92
        L76:
            java.lang.String r0 = r8.getAccessToken()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r7 != 0) goto L92
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f8803b
            r7.compareAndSet(r3, r2)
            java.lang.String r7 = r8.getAccessToken()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            return r7
        L92:
            com.zykj.message.client.MessageClient r7 = com.zykj.message.client.MessageClient.f10635a
            p5.o r8 = new p5.o
            r8.<init>()
            r7.mo10571r(r8)
        L9c:
            java.lang.StringBuffer r7 = r6.f8804c
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.network.RefreshRepositoryImpl.mo8774a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/network/RefreshRepositoryImpl.smali:203
    }
}
