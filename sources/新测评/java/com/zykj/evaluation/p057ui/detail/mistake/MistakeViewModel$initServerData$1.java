package com.zykj.evaluation.p057ui.detail.mistake;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$initServerData$1", m13596f = "MistakeViewModel.kt", m13597i = {1, 2, 2}, m13598l = {122, 132, 134}, m13599m = "invokeSuspend", m13600n = {"topicList", "topicList", "tagList"}, m13601s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,585:1\n1563#2:586\n1634#2,3:587\n1563#2:593\n1634#2,3:594\n230#3,3:590\n233#3,2:597\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1\n*L\n122#1:586\n122#1:587,3\n143#1:593\n143#1:594,3\n136#1:590,3\n136#1:597,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MistakeViewModel$initServerData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9313a;

    /* renamed from: b */
    public Object f9314b;

    /* renamed from: c */
    public int f9315c;

    /* renamed from: d */
    public final /* synthetic */ MistakeViewModel f9316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeViewModel$initServerData$1(MistakeViewModel mistakeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9316d = mistakeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MistakeViewModel$initServerData$1(this.f9316d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b A[LOOP:1: B:35:0x0105->B:37:0x010b, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.mistake.MistakeViewModel$initServerData$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1.smali:155
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MistakeViewModel$initServerData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
