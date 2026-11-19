package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitNormalWork", m13596f = "SubmitNormalWork.kt", m13597i = {0, 0, 0, 0}, m13598l = {77}, m13599m = "submitTask", m13600n = {"taskId", "taskState", "userId", "isRevising"}, m13601s = {"J$0", "I$0", "J$1", "I$1"})
/* loaded from: classes4.dex */
public final class SubmitNormalWork$submitTask$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f8883a;

    /* renamed from: b */
    public long f8884b;

    /* renamed from: c */
    public int f8885c;

    /* renamed from: d */
    public int f8886d;

    /* renamed from: e */
    public /* synthetic */ Object f8887e;

    /* renamed from: f */
    public final /* synthetic */ SubmitNormalWork f8888f;

    /* renamed from: g */
    public int f8889g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitNormalWork$submitTask$1(SubmitNormalWork submitNormalWork, Continuation continuation) {
        super(continuation);
        this.f8888f = submitNormalWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8887e = obj;
        this.f8889g |= Integer.MIN_VALUE;
        return this.f8888f.mo8781m(this);
    }
}
