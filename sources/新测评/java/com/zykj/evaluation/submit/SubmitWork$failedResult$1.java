package com.zykj.evaluation.submit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitWork", m13596f = "SubmitWork.kt", m13597i = {0, 0, 1, 1, 2, 2, 3, 3}, m13598l = {175, 182, 192, 197}, m13599m = "failedResult", m13600n = {"key", "extra", "key", "extra", "key", "extra", "key", "extra"}, m13601s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes4.dex */
public final class SubmitWork$failedResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f8962a;

    /* renamed from: b */
    public Object f8963b;

    /* renamed from: c */
    public /* synthetic */ Object f8964c;

    /* renamed from: d */
    public final /* synthetic */ SubmitWork f8965d;

    /* renamed from: e */
    public int f8966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitWork$failedResult$1(SubmitWork submitWork, Continuation continuation) {
        super(continuation);
        this.f8965d = submitWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8964c = obj;
        this.f8966e |= Integer.MIN_VALUE;
        return this.f8965d.m8812i(null, null, this);
    }
}
