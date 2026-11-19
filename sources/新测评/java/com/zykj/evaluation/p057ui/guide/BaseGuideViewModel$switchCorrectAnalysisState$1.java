package com.zykj.evaluation.p057ui.guide;

import com.blankj.utilcode.util.SPUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p111h6.C7630a;
import p133j6.AbstractC7797a;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.BaseGuideViewModel$switchCorrectAnalysisState$1", m13596f = "BaseGuideViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class BaseGuideViewModel$switchCorrectAnalysisState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9557a;

    /* renamed from: b */
    public final /* synthetic */ BaseGuideViewModel f9558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGuideViewModel$switchCorrectAnalysisState$1(BaseGuideViewModel baseGuideViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9558b = baseGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseGuideViewModel$switchCorrectAnalysisState$1(this.f9558b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9557a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AbstractC7797a abstractC7797aM12602c = this.f9558b.m9774o().m12602c();
        AbstractC7797a abstractC7797a = AbstractC7797a.b.f13460c;
        boolean zAreEqual = Intrinsics.areEqual(abstractC7797aM12602c, abstractC7797a);
        BaseGuideViewModel baseGuideViewModel = this.f9558b;
        C7630a c7630aM9774o = baseGuideViewModel.m9774o();
        if (zAreEqual) {
            abstractC7797a = AbstractC7797a.c.f13461c;
        }
        baseGuideViewModel.m9781v(c7630aM9774o.m12601a((12543 & 1) != 0 ? c7630aM9774o.f12823a : null, (12543 & 2) != 0 ? c7630aM9774o.f12824b : null, (12543 & 4) != 0 ? c7630aM9774o.f12825c : null, (12543 & 8) != 0 ? c7630aM9774o.f12826d : null, (12543 & 16) != 0 ? c7630aM9774o.f12827e : false, (12543 & 32) != 0 ? c7630aM9774o.f12828f : null, (12543 & 64) != 0 ? c7630aM9774o.f12829g : null, (12543 & 128) != 0 ? c7630aM9774o.f12830h : false, (12543 & 256) != 0 ? c7630aM9774o.f12831i : null, (12543 & 512) != 0 ? c7630aM9774o.f12832j : null, (12543 & 1024) != 0 ? c7630aM9774o.f12833k : null, (12543 & 2048) != 0 ? c7630aM9774o.f12834l : null, (12543 & 4096) != 0 ? c7630aM9774o.f12835m : null, (12543 & 8192) != 0 ? c7630aM9774o.f12836n : abstractC7797a));
        SPUtils.getInstance().put("isCorrectShowAnalysis", zAreEqual);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseGuideViewModel$switchCorrectAnalysisState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
