package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0}, m13598l = {1385}, m13599m = "mergeBitmap", m13600n = {"resultPath", "pathArray", "resultBitmap"}, m13601s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class NormalViewModel$mergeBitmap$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10121a;

    /* renamed from: b */
    public Object f10122b;

    /* renamed from: c */
    public Object f10123c;

    /* renamed from: d */
    public /* synthetic */ Object f10124d;

    /* renamed from: e */
    public final /* synthetic */ NormalViewModel f10125e;

    /* renamed from: f */
    public int f10126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$mergeBitmap$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10125e = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10124d = obj;
        this.f10126f |= Integer.MIN_VALUE;
        return this.f10125e.m10285b1(null, null, this);
    }
}
