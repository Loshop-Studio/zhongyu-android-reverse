package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitNoStemWork", m13596f = "SubmitNoStemWork.kt", m13597i = {0, 0, 0}, m13598l = {101}, m13599m = "submitTask", m13600n = {"gson", "list", "taskId"}, m13601s = {"L$0", "L$1", "J$0"})
/* loaded from: classes4.dex */
public final class SubmitNoStemWork$submitTask$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f8863a;

    /* renamed from: b */
    public Object f8864b;

    /* renamed from: c */
    public long f8865c;

    /* renamed from: d */
    public /* synthetic */ Object f8866d;

    /* renamed from: e */
    public final /* synthetic */ SubmitNoStemWork f8867e;

    /* renamed from: f */
    public int f8868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitNoStemWork$submitTask$1(SubmitNoStemWork submitNoStemWork, Continuation continuation) {
        super(continuation);
        this.f8867e = submitNoStemWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8866d = obj;
        this.f8868f |= Integer.MIN_VALUE;
        return this.f8867e.mo8781m(this);
    }
}
