package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 1}, m13598l = {622, 625}, m13599m = "doSomethingBeforeChangeIndex$suspendImpl", m13600n = {"$this", "$this"}, m13601s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class NormalViewModel$doSomethingBeforeChangeIndex$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10035a;

    /* renamed from: b */
    public /* synthetic */ Object f10036b;

    /* renamed from: c */
    public final /* synthetic */ NormalViewModel f10037c;

    /* renamed from: d */
    public int f10038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$doSomethingBeforeChangeIndex$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10037c = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10036b = obj;
        this.f10038d |= Integer.MIN_VALUE;
        return NormalViewModel.m10232I0(this.f10037c, this);
    }
}
