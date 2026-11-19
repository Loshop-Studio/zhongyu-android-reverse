package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkSecurityLevelAndNavigate$1", m7918f = "HomeViewModel.kt", m7919i = {1}, m7920l = {368, 369}, m7921m = "invokeSuspend", m7922n = {"level"}, m7923s = {"I$0"})
/* loaded from: classes4.dex */
public final class HomeViewModel$checkSecurityLevelAndNavigate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7090a;

    /* renamed from: b */
    public int f7091b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f7092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkSecurityLevelAndNavigate$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7092c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$checkSecurityLevelAndNavigate$1(this.f7092c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r1.emit(r3, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f7091b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L30
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.huiwei.launcher.viewmodels.HomeViewModel r5 = r4.f7092c
            com.zykj.huiwei.launcher.repository.HomeRepository r5 = com.zykj.huiwei.launcher.viewmodels.HomeViewModel.m6066i(r5)
            r4.f7091b = r3
            java.lang.Object r5 = r5.m5418e(r4)
            if (r5 != r0) goto L30
            goto L4a
        L30:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            com.zykj.huiwei.launcher.viewmodels.HomeViewModel r1 = r4.f7092c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.zykj.huiwei.launcher.viewmodels.HomeViewModel.m6071n(r1)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            r4.f7090a = r5
            r4.f7091b = r2
            java.lang.Object r5 = r1.emit(r3, r4)
            if (r5 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$checkSecurityLevelAndNavigate$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkSecurityLevelAndNavigate$1.smali:140
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$checkSecurityLevelAndNavigate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
