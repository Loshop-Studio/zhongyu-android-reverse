package com.zykj.evaluation.p057ui.guide.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.GuideViewModel", m13596f = "GuideViewModel.kt", m13597i = {0}, m13598l = {105}, m13599m = "buildDetailBundleWithRequest", m13600n = {"taskId"}, m13601s = {"J$0"})
/* loaded from: classes4.dex */
public final class GuideViewModel$buildDetailBundleWithRequest$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f9623a;

    /* renamed from: b */
    public Object f9624b;

    /* renamed from: c */
    public /* synthetic */ Object f9625c;

    /* renamed from: d */
    public final /* synthetic */ GuideViewModel f9626d;

    /* renamed from: e */
    public int f9627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideViewModel$buildDetailBundleWithRequest$1(GuideViewModel guideViewModel, Continuation continuation) {
        super(continuation);
        this.f9626d = guideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9625c = obj;
        this.f9627e |= Integer.MIN_VALUE;
        return this.f9626d.m9856L(0L, this);
    }
}
