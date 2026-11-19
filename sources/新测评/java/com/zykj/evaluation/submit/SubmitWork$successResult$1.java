package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitWork", m13596f = "SubmitWork.kt", m13597i = {0, 1, 2}, m13598l = {155, 161, 163}, m13599m = "successResult", m13600n = {"key", "key", "key"}, m13601s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
public final class SubmitWork$successResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f8969a;

    /* renamed from: b */
    public /* synthetic */ Object f8970b;

    /* renamed from: c */
    public final /* synthetic */ SubmitWork f8971c;

    /* renamed from: d */
    public int f8972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitWork$successResult$1(SubmitWork submitWork, Continuation continuation) {
        super(continuation);
        this.f8971c = submitWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8970b = obj;
        this.f8972d |= Integer.MIN_VALUE;
        return this.f8971c.m8815n(null, this);
    }
}
