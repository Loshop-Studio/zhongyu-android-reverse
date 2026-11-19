package com.zykj.evaluation.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.paging.SimplePagerKt$simplePager$1$1", m13596f = "SimplePager.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m13598l = {28, 35}, m13599m = "load", m13600n = {"params", "page", "$i$a$-runCatching-SimplePagerKt$simplePager$1$1$load$result$1", "params", "result", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "page", "$i$f$map", "$i$f$mapTo", "$i$a$-map-SimplePagerKt$simplePager$1$1$load$2"}, m13601s = {"L$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"})
/* loaded from: classes4.dex */
public final class SimplePagerKt$simplePager$1$1$load$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f8811a;

    /* renamed from: b */
    public Object f8812b;

    /* renamed from: c */
    public Object f8813c;

    /* renamed from: d */
    public Object f8814d;

    /* renamed from: e */
    public Object f8815e;

    /* renamed from: f */
    public Object f8816f;

    /* renamed from: g */
    public Object f8817g;

    /* renamed from: h */
    public Object f8818h;

    /* renamed from: i */
    public Object f8819i;

    /* renamed from: j */
    public Object f8820j;

    /* renamed from: k */
    public int f8821k;

    /* renamed from: l */
    public int f8822l;

    /* renamed from: m */
    public int f8823m;

    /* renamed from: n */
    public int f8824n;

    /* renamed from: o */
    public /* synthetic */ Object f8825o;

    /* renamed from: p */
    public final /* synthetic */ SimplePagerKt$simplePager$1$1 f8826p;

    /* renamed from: q */
    public int f8827q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePagerKt$simplePager$1$1$load$1(SimplePagerKt$simplePager$1$1 simplePagerKt$simplePager$1$1, Continuation continuation) {
        super(continuation);
        this.f8826p = simplePagerKt$simplePager$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8825o = obj;
        this.f8827q |= Integer.MIN_VALUE;
        return this.f8826p.load(null, this);
    }
}
