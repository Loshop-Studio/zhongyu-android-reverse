package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitTaskManger", m13596f = "SubmitTaskManger.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4}, m13598l = {44, 49, 52, 55, 87}, m13599m = "restartSubmitWork", m13600n = {"userId", "taskId", "taskState", "submitTask", "userId", "taskId", "taskState", "submitTask", "userId", "taskId", "taskState", "submitTask", "userId", "taskId", "taskState", "submitTask", "request", "it", "userId", "taskId", "taskState", "$i$a$-let-SubmitTaskManger$restartSubmitWork$2"}, m13601s = {"J$0", "J$1", "I$0", "L$0", "J$0", "J$1", "I$0", "L$0", "J$0", "J$1", "I$0", "L$0", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "I$1"})
/* loaded from: classes4.dex */
public final class SubmitTaskManger$restartSubmitWork$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8904a;

    /* renamed from: b */
    public long f8905b;

    /* renamed from: c */
    public int f8906c;

    /* renamed from: d */
    public int f8907d;

    /* renamed from: e */
    public Object f8908e;

    /* renamed from: f */
    public Object f8909f;

    /* renamed from: g */
    public Object f8910g;

    /* renamed from: h */
    public /* synthetic */ Object f8911h;

    /* renamed from: i */
    public final /* synthetic */ SubmitTaskManger f8912i;

    /* renamed from: j */
    public int f8913j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaskManger$restartSubmitWork$1(SubmitTaskManger submitTaskManger, Continuation continuation) {
        super(continuation);
        this.f8912i = submitTaskManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8911h = obj;
        this.f8913j |= Integer.MIN_VALUE;
        return this.f8912i.m8802f(0L, 0L, 0, this);
    }
}
