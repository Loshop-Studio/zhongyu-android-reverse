package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitTaskManger", m13596f = "SubmitTaskManger.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {230}, m13599m = "startSubmitCorrectSelfWork", m13600n = {"uniqueWorkName", "tags", "userId", "taskId", "taskState"}, m13601s = {"L$0", "L$1", "J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class SubmitTaskManger$startSubmitCorrectSelfWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8914a;

    /* renamed from: b */
    public long f8915b;

    /* renamed from: c */
    public int f8916c;

    /* renamed from: d */
    public Object f8917d;

    /* renamed from: e */
    public Object f8918e;

    /* renamed from: f */
    public /* synthetic */ Object f8919f;

    /* renamed from: g */
    public final /* synthetic */ SubmitTaskManger f8920g;

    /* renamed from: h */
    public int f8921h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaskManger$startSubmitCorrectSelfWork$1(SubmitTaskManger submitTaskManger, Continuation continuation) {
        super(continuation);
        this.f8920g = submitTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8919f = obj;
        this.f8921h |= Integer.MIN_VALUE;
        return this.f8920g.m8803g(0L, 0L, 0, null, null, this);
    }
}
