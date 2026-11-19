package com.zykj.evaluation.p057ui.guide.normal.done;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.done.DoneGuideViewModel", m13596f = "DoneGuideViewModel.kt", m13597i = {}, m13598l = {51}, m13599m = "getTaskInfo", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class DoneGuideViewModel$getTaskInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f9653a;

    /* renamed from: b */
    public final /* synthetic */ DoneGuideViewModel f9654b;

    /* renamed from: c */
    public int f9655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoneGuideViewModel$getTaskInfo$1(DoneGuideViewModel doneGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9654b = doneGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9653a = obj;
        this.f9655c |= Integer.MIN_VALUE;
        return this.f9654b.mo9863S(this);
    }
}
