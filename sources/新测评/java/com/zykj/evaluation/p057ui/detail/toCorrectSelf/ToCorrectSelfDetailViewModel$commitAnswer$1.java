package com.zykj.evaluation.p057ui.detail.toCorrectSelf;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel", m13596f = "ToCorrectSelfDetailViewModel.kt", m13597i = {1, 1, 1, 1, 1, 1}, m13598l = {414, 486}, m13599m = "commitAnswer", m13600n = {"questionUpload", "answerMap", "localAnswerUploadDataList", "answerUploadDataList", "examAnswerMap", "commitSelfCorrectReqList"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes4.dex */
public final class ToCorrectSelfDetailViewModel$commitAnswer$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f9456a;

    /* renamed from: b */
    public Object f9457b;

    /* renamed from: c */
    public Object f9458c;

    /* renamed from: d */
    public Object f9459d;

    /* renamed from: e */
    public Object f9460e;

    /* renamed from: f */
    public Object f9461f;

    /* renamed from: g */
    public /* synthetic */ Object f9462g;

    /* renamed from: h */
    public final /* synthetic */ ToCorrectSelfDetailViewModel f9463h;

    /* renamed from: i */
    public int f9464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectSelfDetailViewModel$commitAnswer$1(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, Continuation continuation) {
        super(continuation);
        this.f9463h = toCorrectSelfDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9462g = obj;
        this.f9464i |= Integer.MIN_VALUE;
        return this.f9463h.m9707N0(this);
    }
}
