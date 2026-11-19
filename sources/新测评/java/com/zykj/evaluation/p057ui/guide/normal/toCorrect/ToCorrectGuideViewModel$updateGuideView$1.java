package com.zykj.evaluation.p057ui.guide.normal.toCorrect;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel", m13596f = "ToCorrectGuideViewModel.kt", m13597i = {0}, m13598l = {83}, m13599m = "updateGuideView", m13600n = {"guideTaskInfo"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class ToCorrectGuideViewModel$updateGuideView$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f9676a;

    /* renamed from: b */
    public /* synthetic */ Object f9677b;

    /* renamed from: c */
    public final /* synthetic */ ToCorrectGuideViewModel f9678c;

    /* renamed from: d */
    public int f9679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectGuideViewModel$updateGuideView$1(ToCorrectGuideViewModel toCorrectGuideViewModel, Continuation continuation) {
        super(continuation);
        this.f9678c = toCorrectGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9677b = obj;
        this.f9679d |= Integer.MIN_VALUE;
        return this.f9678c.mo9869Y(null, this);
    }
}
