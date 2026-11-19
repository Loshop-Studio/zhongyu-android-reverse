package com.zykj.evaluation.p057ui.guide.noStem;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel", m13596f = "NoStemViewModel.kt", m13597i = {0, 0, 0}, m13598l = {324}, m13599m = "loadFailedUuids", m13600n = {"userId", "taskId", "state"}, m13601s = {"J$0", "J$1", "I$0"})
/* loaded from: classes4.dex */
public final class NoStemViewModel$loadFailedUuids$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f9580a;

    /* renamed from: b */
    public long f9581b;

    /* renamed from: c */
    public int f9582c;

    /* renamed from: d */
    public /* synthetic */ Object f9583d;

    /* renamed from: e */
    public final /* synthetic */ NoStemViewModel f9584e;

    /* renamed from: f */
    public int f9585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel$loadFailedUuids$1(NoStemViewModel noStemViewModel, Continuation continuation) {
        super(continuation);
        this.f9584e = noStemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9583d = obj;
        this.f9585f |= Integer.MIN_VALUE;
        return this.f9584e.m9829X(0L, 0L, 0, this);
    }
}
