package com.zykj.huiwei.launcher.repository;

import com.zykj.huiwei.launcher.bean.GetTaskListResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/zykj/huiwei/launcher/bean/GetTaskListResponse;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.HomeRepository$getTodoTasksList$1", m7918f = "HomeRepository.kt", m7919i = {0, 1}, m7920l = {36, 36}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "$this$flow"}, m7923s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class HomeRepository$getTodoTasksList$1 extends SuspendLambda implements Function2<FlowCollector<? super GetTaskListResponse>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6159a;

    /* renamed from: b */
    public int f6160b;

    /* renamed from: c */
    public /* synthetic */ Object f6161c;

    /* renamed from: d */
    public final /* synthetic */ HomeRepository f6162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$getTodoTasksList$1(HomeRepository homeRepository, Continuation continuation) {
        super(2, continuation);
        this.f6162d = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeRepository$getTodoTasksList$1 homeRepository$getTodoTasksList$1 = new HomeRepository$getTodoTasksList$1(this.f6162d, continuation);
        homeRepository$getTodoTasksList$1.f6161c = obj;
        return homeRepository$getTodoTasksList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super GetTaskListResponse> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r2.emit(r7, r6) == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6161c
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.f6160b
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L1f
            if (r2 != r3) goto L17
            kotlin.ResultKt.throwOnFailure(r7)
            goto L59
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            java.lang.Object r2 = r6.f6159a
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L42
        L27:
            kotlin.ResultKt.throwOnFailure(r7)
            com.zykj.huiwei.launcher.repository.HomeRepository r7 = r6.f6162d
            com.zykj.huiwei.launcher.api.HomeService r7 = com.zykj.huiwei.launcher.repository.HomeRepository.m5414a(r7)
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r6.f6161c = r2
            r6.f6159a = r0
            r6.f6160b = r5
            java.lang.Object r7 = com.zykj.huiwei.launcher.api.HomeService.getTodoTasksListWithUrgeCount$default(r7, r4, r6, r5, r4)
            if (r7 != r1) goto L41
            goto L58
        L41:
            r2 = r0
        L42:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p004a3.AbstractC0009a.m12a(r7)
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r6.f6161c = r0
            r6.f6159a = r4
            r6.f6160b = r3
            java.lang.Object r7 = r2.emit(r7, r6)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.HomeRepository$getTodoTasksList$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/HomeRepository$getTodoTasksList$1.smali:151
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((HomeRepository$getTodoTasksList$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
