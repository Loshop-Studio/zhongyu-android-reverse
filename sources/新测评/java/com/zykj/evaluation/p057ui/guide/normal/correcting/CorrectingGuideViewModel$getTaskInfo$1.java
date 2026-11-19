package com.zykj.evaluation.p057ui.guide.normal.correcting;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.correcting.CorrectingGuideViewModel", m13596f = "CorrectingGuideViewModel.kt", m13597i = {}, m13598l = {36}, m13599m = "getTaskInfo", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class CorrectingGuideViewModel$getTaskInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f9641a;

    /* renamed from: b */
    public final /* synthetic */ CorrectingGuideViewModel f9642b;

    /* renamed from: c */
    public int f9643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorrectingGuideViewModel$getTaskInfo$1(CorrectingGuideViewModel correctingGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9642b = correctingGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9641a = obj;
        this.f9643c |= Integer.MIN_VALUE;
        return this.f9642b.mo9863S(this);
    }
}
