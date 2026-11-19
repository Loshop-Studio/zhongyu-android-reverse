package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitTaskManger", m13596f = "SubmitTaskManger.kt", m13597i = {0, 0, 0, 0, 0, 0}, m13598l = {117}, m13599m = "startSubmitNoStemWork", m13600n = {"reqList", "uniqueWorkName", "tags", "gson", "userId", "taskId"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "J$0", "J$1"})
/* loaded from: classes4.dex */
public final class SubmitTaskManger$startSubmitNoStemWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8922a;

    /* renamed from: b */
    public long f8923b;

    /* renamed from: c */
    public Object f8924c;

    /* renamed from: d */
    public Object f8925d;

    /* renamed from: e */
    public Object f8926e;

    /* renamed from: f */
    public Object f8927f;

    /* renamed from: g */
    public /* synthetic */ Object f8928g;

    /* renamed from: h */
    public final /* synthetic */ SubmitTaskManger f8929h;

    /* renamed from: i */
    public int f8930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaskManger$startSubmitNoStemWork$1(SubmitTaskManger submitTaskManger, Continuation continuation) {
        super(continuation);
        this.f8929h = submitTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8928g = obj;
        this.f8930i |= Integer.MIN_VALUE;
        return this.f8929h.m8804i(0L, 0L, null, null, null, this);
    }
}
