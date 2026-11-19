package com.zykj.huiwei.launcher.repository;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.NotificationRepository$setMessageRead$1", m7918f = "NotificationRepository.kt", m7919i = {0, 1}, m7920l = {55, 56}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "$this$flow"}, m7923s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class NotificationRepository$setMessageRead$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6179a;

    /* renamed from: b */
    public /* synthetic */ Object f6180b;

    /* renamed from: c */
    public final /* synthetic */ NotificationRepository f6181c;

    /* renamed from: d */
    public final /* synthetic */ long f6182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$setMessageRead$1(NotificationRepository notificationRepository, long j6, Continuation continuation) {
        super(2, continuation);
        this.f6181c = notificationRepository;
        this.f6182d = j6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NotificationRepository$setMessageRead$1 notificationRepository$setMessageRead$1 = new NotificationRepository$setMessageRead$1(this.f6181c, this.f6182d, continuation);
        notificationRepository$setMessageRead$1.f6180b = obj;
        return notificationRepository$setMessageRead$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6180b
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.f6179a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r8)
            goto L50
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L38
        L22:
            kotlin.ResultKt.throwOnFailure(r8)
            com.zykj.huiwei.launcher.repository.NotificationRepository r8 = r7.f6181c
            com.zykj.huiwei.launcher.api.NotificationService r8 = com.zykj.huiwei.launcher.repository.NotificationRepository.m5424b(r8)
            long r5 = r7.f6182d
            r7.f6180b = r0
            r7.f6179a = r4
            java.lang.Object r8 = r8.setMessageRead(r5, r7)
            if (r8 != r1) goto L38
            goto L4f
        L38:
            com.zykj.http.bean.ApiResp r8 = (com.zykj.http.bean.ApiResp) r8
            p004a3.AbstractC0009a.m13b(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r7.f6180b = r2
            r7.f6179a = r3
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.NotificationRepository$setMessageRead$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/NotificationRepository$setMessageRead$1.smali:155
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((NotificationRepository$setMessageRead$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
