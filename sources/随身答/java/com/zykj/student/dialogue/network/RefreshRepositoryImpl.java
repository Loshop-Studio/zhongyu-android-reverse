package com.zykj.student.dialogue.network;

import com.zykj.http.bean.HeaderBean;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.message.server.bean.ServerInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p313z5.AbstractC10002a;

/* loaded from: classes5.dex */
public final class RefreshRepositoryImpl extends AbstractC10002a {

    /* renamed from: a */
    public final HeaderLiveData f10555a;

    /* renamed from: b */
    public final AtomicBoolean f10556b;

    /* renamed from: c */
    public StringBuffer f10557c;

    public RefreshRepositoryImpl(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "headerLiveData");
        this.f10555a = headerLiveData;
        this.f10556b = new AtomicBoolean(false);
        this.f10557c = new StringBuffer();
    }

    /* renamed from: c */
    public static final Unit m9975c(RefreshRepositoryImpl refreshRepositoryImpl, ServerInfo serverInfo) {
        HeaderBean headerBeanCopy$default;
        if (serverInfo != null) {
            HeaderBean value = refreshRepositoryImpl.f10555a.getValue();
            if (value != null && (headerBeanCopy$default = HeaderBean.copy$default(value, null, null, null, serverInfo.m9861c(), null, 23, null)) != null) {
                refreshRepositoryImpl.f10555a.postValue(headerBeanCopy$default);
            }
            refreshRepositoryImpl.f10557c.insert(0, serverInfo.m9861c());
        }
        refreshRepositoryImpl.f10556b.compareAndSet(true, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p313z5.AbstractC10002a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9976a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.student.dialogue.network.RefreshRepositoryImpl$refreshToken$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.student.dialogue.network.RefreshRepositoryImpl$refreshToken$1 r0 = (com.zykj.student.dialogue.network.RefreshRepositoryImpl$refreshToken$1) r0
            int r1 = r0.f10560c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10560c = r1
            goto L18
        L13:
            com.zykj.student.dialogue.network.RefreshRepositoryImpl$refreshToken$1 r0 = new com.zykj.student.dialogue.network.RefreshRepositoryImpl$refreshToken$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f10558a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10560c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f10556b
            r2 = 0
            boolean r7 = r7.compareAndSet(r2, r3)
            if (r7 != 0) goto L50
        L3d:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f10556b
            boolean r7 = r7.get()
            if (r7 == 0) goto L61
            r0.f10560c = r3
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r7 != r1) goto L3d
            return r1
        L50:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            r6.f10557c = r7
            com.zykj.message.client.MessageClient r7 = com.zykj.message.client.MessageClient.f10078a
            k6.h r0 = new k6.h
            r0.<init>()
            r7.mo9837n(r0)
        L61:
            java.lang.StringBuffer r7 = r6.f10557c
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.network.RefreshRepositoryImpl.mo9976a(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/network/RefreshRepositoryImpl.smali:208
    }
}
