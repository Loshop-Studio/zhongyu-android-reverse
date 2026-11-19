package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0, 0, 0, 0, 1}, m13598l = {660, 682}, m13599m = "uploadAnswer", m13600n = {"uploadDataList", "$this$forEach$iv", "element$iv", "uploadInfo", "$i$f$forEach", "$i$a$-forEach-NormalViewModel$uploadAnswer$2", "uploadDataList"}, m13601s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "L$0"})
/* loaded from: classes4.dex */
public final class NormalViewModel$uploadAnswer$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10130a;

    /* renamed from: b */
    public Object f10131b;

    /* renamed from: c */
    public Object f10132c;

    /* renamed from: d */
    public Object f10133d;

    /* renamed from: e */
    public Object f10134e;

    /* renamed from: f */
    public int f10135f;

    /* renamed from: g */
    public int f10136g;

    /* renamed from: h */
    public /* synthetic */ Object f10137h;

    /* renamed from: i */
    public final /* synthetic */ NormalViewModel f10138i;

    /* renamed from: j */
    public int f10139j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$uploadAnswer$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10138i = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10137h = obj;
        this.f10139j |= Integer.MIN_VALUE;
        return this.f10138i.m10291i1(this);
    }
}
