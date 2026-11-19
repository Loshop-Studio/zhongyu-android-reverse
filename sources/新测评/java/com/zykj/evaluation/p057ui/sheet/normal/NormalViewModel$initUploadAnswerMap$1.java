package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {}, m13598l = {485}, m13599m = "initUploadAnswerMap", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class NormalViewModel$initUploadAnswerMap$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f10118a;

    /* renamed from: b */
    public final /* synthetic */ NormalViewModel f10119b;

    /* renamed from: c */
    public int f10120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$initUploadAnswerMap$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10119b = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10118a = obj;
        this.f10120c |= Integer.MIN_VALUE;
        return this.f10119b.m10283Z0(this);
    }
}
