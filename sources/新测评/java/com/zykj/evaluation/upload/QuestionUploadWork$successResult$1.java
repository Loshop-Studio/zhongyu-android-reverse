package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.QuestionUploadWork", m13596f = "QuestionUploadWork.kt", m13597i = {0, 0}, m13598l = {257}, m13599m = "successResult", m13600n = {"key", "extras"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class QuestionUploadWork$successResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10433a;

    /* renamed from: b */
    public Object f10434b;

    /* renamed from: c */
    public /* synthetic */ Object f10435c;

    /* renamed from: d */
    public final /* synthetic */ QuestionUploadWork f10436d;

    /* renamed from: e */
    public int f10437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionUploadWork$successResult$1(QuestionUploadWork questionUploadWork, Continuation continuation) {
        super(continuation);
        this.f10436d = questionUploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10435c = obj;
        this.f10437e |= Integer.MIN_VALUE;
        return this.f10436d.m10496f(null, null, this);
    }
}
