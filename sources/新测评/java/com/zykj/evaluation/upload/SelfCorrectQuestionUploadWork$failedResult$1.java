package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork", m13596f = "SelfCorrectQuestionUploadWork.kt", m13597i = {0, 0}, m13598l = {232}, m13599m = "failedResult", m13600n = {"key", "extras"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class SelfCorrectQuestionUploadWork$failedResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10464a;

    /* renamed from: b */
    public Object f10465b;

    /* renamed from: c */
    public /* synthetic */ Object f10466c;

    /* renamed from: d */
    public final /* synthetic */ SelfCorrectQuestionUploadWork f10467d;

    /* renamed from: e */
    public int f10468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfCorrectQuestionUploadWork$failedResult$1(SelfCorrectQuestionUploadWork selfCorrectQuestionUploadWork, Continuation continuation) {
        super(continuation);
        this.f10467d = selfCorrectQuestionUploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10466c = obj;
        this.f10468e |= Integer.MIN_VALUE;
        return this.f10467d.m10501d(null, null, this);
    }
}
