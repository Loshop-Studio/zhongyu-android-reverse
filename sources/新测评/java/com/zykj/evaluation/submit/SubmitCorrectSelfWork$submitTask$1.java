package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitCorrectSelfWork", m13596f = "SubmitCorrectSelfWork.kt", m13597i = {0}, m13598l = {70}, m13599m = "submitTask", m13600n = {"taskId"}, m13601s = {"J$0"})
/* loaded from: classes4.dex */
public final class SubmitCorrectSelfWork$submitTask$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8842a;

    /* renamed from: b */
    public /* synthetic */ Object f8843b;

    /* renamed from: c */
    public final /* synthetic */ SubmitCorrectSelfWork f8844c;

    /* renamed from: d */
    public int f8845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCorrectSelfWork$submitTask$1(SubmitCorrectSelfWork submitCorrectSelfWork, Continuation continuation) {
        super(continuation);
        this.f8844c = submitCorrectSelfWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8843b = obj;
        this.f8845d |= Integer.MIN_VALUE;
        return this.f8844c.mo8781m(this);
    }
}
