package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitTaskManger", m13596f = "SubmitTaskManger.kt", m13597i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m13598l = {186, 192}, m13599m = "startSubmitNormalWork", m13600n = {"uniqueWorkName", "tags", "userId", "taskId", "taskState", "uniqueWorkName", "tags", "userId", "taskId", "taskState"}, m13601s = {"L$0", "L$1", "J$0", "J$1", "I$0", "L$0", "L$1", "J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class SubmitTaskManger$startSubmitNormalWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8931a;

    /* renamed from: b */
    public long f8932b;

    /* renamed from: c */
    public int f8933c;

    /* renamed from: d */
    public Object f8934d;

    /* renamed from: e */
    public Object f8935e;

    /* renamed from: f */
    public /* synthetic */ Object f8936f;

    /* renamed from: g */
    public final /* synthetic */ SubmitTaskManger f8937g;

    /* renamed from: h */
    public int f8938h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaskManger$startSubmitNormalWork$1(SubmitTaskManger submitTaskManger, Continuation continuation) {
        super(continuation);
        this.f8937g = submitTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8936f = obj;
        this.f8938h |= Integer.MIN_VALUE;
        return this.f8937g.m8805k(0L, 0L, 0, null, null, this);
    }
}
