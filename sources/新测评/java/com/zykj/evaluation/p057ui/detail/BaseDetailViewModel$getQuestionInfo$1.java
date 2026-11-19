package com.zykj.evaluation.p057ui.detail;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel", m13596f = "BaseDetailViewModel.kt", m13597i = {0, 1}, m13598l = {600, TypedValues.MotionType.TYPE_EASING}, m13599m = "getQuestionInfo", m13600n = {"guideQuestion", "guideQuestion"}, m13601s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$getQuestionInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f9116a;

    /* renamed from: b */
    public /* synthetic */ Object f9117b;

    /* renamed from: c */
    public final /* synthetic */ BaseDetailViewModel f9118c;

    /* renamed from: d */
    public int f9119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$getQuestionInfo$1(BaseDetailViewModel baseDetailViewModel, Continuation continuation) {
        super(continuation);
        this.f9118c = baseDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9117b = obj;
        this.f9119d |= Integer.MIN_VALUE;
        return this.f9118c.m9275R(null, this);
    }
}
