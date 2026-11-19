package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.QuestionUploadWork", m13596f = "QuestionUploadWork.kt", m13597i = {0, 0}, m13598l = {274}, m13599m = "failedResult", m13600n = {"key", "extras"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class QuestionUploadWork$failedResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10428a;

    /* renamed from: b */
    public Object f10429b;

    /* renamed from: c */
    public /* synthetic */ Object f10430c;

    /* renamed from: d */
    public final /* synthetic */ QuestionUploadWork f10431d;

    /* renamed from: e */
    public int f10432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionUploadWork$failedResult$1(QuestionUploadWork questionUploadWork, Continuation continuation) {
        super(continuation);
        this.f10431d = questionUploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10430c = obj;
        this.f10432e |= Integer.MIN_VALUE;
        return this.f10431d.m10495d(null, null, this);
    }
}
