package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0, 1, 1, 1}, m13598l = {1166, 1172}, m13599m = "confirmAnswerAndNext", m13600n = {"currentAnswerInfoMap", "currentPageAnswerData", "changedIdSet", "currentAnswerInfoMap", "currentPageAnswerData", "changedIdSet"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class NormalViewModel$confirmAnswerAndNext$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10029a;

    /* renamed from: b */
    public Object f10030b;

    /* renamed from: c */
    public Object f10031c;

    /* renamed from: d */
    public /* synthetic */ Object f10032d;

    /* renamed from: e */
    public final /* synthetic */ NormalViewModel f10033e;

    /* renamed from: f */
    public int f10034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$confirmAnswerAndNext$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10033e = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10032d = obj;
        this.f10034f |= Integer.MIN_VALUE;
        return this.f10033e.m10266H0(this);
    }
}
