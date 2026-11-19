package com.zykj.evaluation.p057ui.guide.normal.revising;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.revising.RevisingGuideViewModel", m13596f = "RevisingGuideViewModel.kt", m13597i = {}, m13598l = {39}, m13599m = "getTaskInfo", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class RevisingGuideViewModel$getTaskInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f9659a;

    /* renamed from: b */
    public final /* synthetic */ RevisingGuideViewModel f9660b;

    /* renamed from: c */
    public int f9661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevisingGuideViewModel$getTaskInfo$1(RevisingGuideViewModel revisingGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9660b = revisingGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9659a = obj;
        this.f9661c |= Integer.MIN_VALUE;
        return this.f9660b.mo9863S(this);
    }
}
