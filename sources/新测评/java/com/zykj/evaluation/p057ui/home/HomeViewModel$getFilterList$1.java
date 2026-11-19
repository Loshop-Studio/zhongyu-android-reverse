package com.zykj.evaluation.p057ui.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$getFilterList$1", m13596f = "HomeViewModel.kt", m13597i = {1}, m13598l = {208, 217}, m13599m = "invokeSuspend", m13600n = {"subjectList"}, m13601s = {"L$0"})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,715:1\n1563#2:716\n1634#2,3:717\n1563#2:720\n1634#2,3:721\n1563#2:727\n1634#2,3:728\n230#3,3:724\n233#3,2:731\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1\n*L\n208#1:716\n208#1:717,3\n217#1:720\n217#1:721,3\n228#1:727\n228#1:728,3\n226#1:724,3\n226#1:731,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$getFilterList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9852a;

    /* renamed from: b */
    public int f9853b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f9854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getFilterList$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9854c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$getFilterList$1(this.f9854c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[LOOP:0: B:22:0x00a0->B:24:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128 A[LOOP:1: B:26:0x00d1->B:41:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.home.HomeViewModel$getFilterList$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1.smali:146
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$getFilterList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
