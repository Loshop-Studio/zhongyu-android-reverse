package com.zykj.evaluation.p057ui.guide.normal.toCorrect;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel", m13596f = "ToCorrectGuideViewModel.kt", m13597i = {}, m13598l = {60}, m13599m = "getTaskInfo", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectGuideViewModel$getTaskInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f9671a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectGuideViewModel f9672b;

    /* renamed from: c */
    public int f9673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectGuideViewModel$getTaskInfo$1(ToCorrectGuideViewModel toCorrectGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9672b = toCorrectGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9671a = obj;
        this.f9673c |= Integer.MIN_VALUE;
        return this.f9672b.mo9863S(this);
    }
}
