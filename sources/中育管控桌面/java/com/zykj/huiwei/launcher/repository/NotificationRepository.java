package com.zykj.huiwei.launcher.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.zykj.huiwei.launcher.api.NotificationService;
import com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource;
import com.zykj.huiwei.launcher.repository.NotificationRepository;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class NotificationRepository {

    /* renamed from: a */
    public final NotificationService f6175a;

    public NotificationRepository(NotificationService notificationService) {
        Intrinsics.checkNotNullParameter(notificationService, "notificationService");
        this.f6175a = notificationService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final PagingSource m5425e(NotificationRepository notificationRepository) {
        return new NotificationPagingSource(notificationRepository.f6175a, null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: c */
    public final Object m5426c(long j6, Continuation continuation) {
        return this.f6175a.getNotice(j6, continuation);
    }

    /* renamed from: d */
    public final Flow m5427d() {
        return new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), null, new Function0() { // from class: w3.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationRepository.m5425e(this.f10375a);
            }
        }, 2, null).getFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5428f(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.repository.NotificationRepository$getUnReadCount$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.repository.NotificationRepository$getUnReadCount$1 r0 = (com.zykj.huiwei.launcher.repository.NotificationRepository$getUnReadCount$1) r0
            int r1 = r0.f6178c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6178c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.repository.NotificationRepository$getUnReadCount$1 r0 = new com.zykj.huiwei.launcher.repository.NotificationRepository$getUnReadCount$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6176a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6178c
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
            com.zykj.huiwei.launcher.api.NotificationService r5 = r4.f6175a
            r0.f6178c = r3
            java.lang.Object r5 = r5.getMyUnreadMessageCount(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.zykj.http.bean.ApiResp r5 = (com.zykj.http.bean.ApiResp) r5
            java.lang.Object r5 = p004a3.AbstractC0009a.m12a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.NotificationRepository.m5428f(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/NotificationRepository.smali:188
    }

    /* renamed from: g */
    public final Flow m5429g(long j6) {
        return FlowKt.flow(new NotificationRepository$setMessageRead$1(this, j6, null));
    }
}
