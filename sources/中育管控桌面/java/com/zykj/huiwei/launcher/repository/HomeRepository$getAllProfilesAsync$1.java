package com.zykj.huiwei.launcher.repository;

import com.zykj.huiwei.launcher.bean.AvatarItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/zykj/huiwei/launcher/bean/AvatarItem;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.HomeRepository$getAllProfilesAsync$1", m7918f = "HomeRepository.kt", m7919i = {0, 1}, m7920l = {72, 72}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "$this$flow"}, m7923s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class HomeRepository$getAllProfilesAsync$1 extends SuspendLambda implements Function2<FlowCollector<? super List<AvatarItem>>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6150a;

    /* renamed from: b */
    public int f6151b;

    /* renamed from: c */
    public /* synthetic */ Object f6152c;

    /* renamed from: d */
    public final /* synthetic */ HomeRepository f6153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$getAllProfilesAsync$1(HomeRepository homeRepository, Continuation continuation) {
        super(2, continuation);
        this.f6153d = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeRepository$getAllProfilesAsync$1 homeRepository$getAllProfilesAsync$1 = new HomeRepository$getAllProfilesAsync$1(this.f6153d, continuation);
        homeRepository$getAllProfilesAsync$1.f6152c = obj;
        return homeRepository$getAllProfilesAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<AvatarItem>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r2.emit(r6, r5) == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6152c
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.f6151b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L26
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r6)
            goto L59
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            java.lang.Object r2 = r5.f6150a
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L41
        L26:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.huiwei.launcher.repository.HomeRepository r6 = r5.f6153d
            com.zykj.huiwei.launcher.api.HomeService r6 = com.zykj.huiwei.launcher.repository.HomeRepository.m5414a(r6)
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f6152c = r2
            r5.f6150a = r0
            r5.f6151b = r4
            java.lang.Object r6 = r6.getAllProfilesAsync(r5)
            if (r6 != r1) goto L40
            goto L58
        L40:
            r2 = r0
        L41:
            com.zykj.http.bean.ApiResp r6 = (com.zykj.http.bean.ApiResp) r6
            java.lang.Object r6 = p004a3.AbstractC0009a.m12a(r6)
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f6152c = r0
            r0 = 0
            r5.f6150a = r0
            r5.f6151b = r3
            java.lang.Object r6 = r2.emit(r6, r5)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.HomeRepository$getAllProfilesAsync$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/HomeRepository$getAllProfilesAsync$1.smali:153
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((HomeRepository$getAllProfilesAsync$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
