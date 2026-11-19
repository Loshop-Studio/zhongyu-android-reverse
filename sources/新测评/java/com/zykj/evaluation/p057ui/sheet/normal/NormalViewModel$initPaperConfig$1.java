package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, m13598l = {266, 269}, m13599m = "initPaperConfig", m13600n = {"address", "localConfigPath", "testPaperId", "$i$a$-ifEmpty-NormalViewModel$initPaperConfig$2", "$i$a$-runCatching-NormalViewModel$initPaperConfig$2$1", "address", "localConfigPath", "testPaperId", "$i$a$-ifEmpty-NormalViewModel$initPaperConfig$2"}, m13601s = {"L$0", "L$1", "J$0", "I$0", "I$1", "L$0", "L$1", "J$0", "I$0"})
/* loaded from: classes4.dex */
public final class NormalViewModel$initPaperConfig$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10109a;

    /* renamed from: b */
    public Object f10110b;

    /* renamed from: c */
    public Object f10111c;

    /* renamed from: d */
    public long f10112d;

    /* renamed from: e */
    public int f10113e;

    /* renamed from: f */
    public int f10114f;

    /* renamed from: g */
    public /* synthetic */ Object f10115g;

    /* renamed from: h */
    public final /* synthetic */ NormalViewModel f10116h;

    /* renamed from: i */
    public int f10117i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$initPaperConfig$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10116h = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10115g = obj;
        this.f10117i |= Integer.MIN_VALUE;
        return this.f10116h.m10280W0(null, 0L, this);
    }
}
