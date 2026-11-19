package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitTaskManger", m13596f = "SubmitTaskManger.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 1}, m13598l = {150, 157}, m13599m = "isNormalSubmitCommitting", m13600n = {"uniqueWorkName", "userId", "taskId", "uniqueWorkName", "submitTask", "userId", "taskId", "isDbCommitting"}, m13601s = {"L$0", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class SubmitTaskManger$isNormalSubmitCommitting$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8893a;

    /* renamed from: b */
    public long f8894b;

    /* renamed from: c */
    public Object f8895c;

    /* renamed from: d */
    public Object f8896d;

    /* renamed from: e */
    public int f8897e;

    /* renamed from: f */
    public /* synthetic */ Object f8898f;

    /* renamed from: g */
    public final /* synthetic */ SubmitTaskManger f8899g;

    /* renamed from: h */
    public int f8900h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaskManger$isNormalSubmitCommitting$1(SubmitTaskManger submitTaskManger, Continuation continuation) {
        super(continuation);
        this.f8899g = submitTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8898f = obj;
        this.f8900h |= Integer.MIN_VALUE;
        return this.f8899g.m8801e(0L, 0L, null, this);
    }
}
