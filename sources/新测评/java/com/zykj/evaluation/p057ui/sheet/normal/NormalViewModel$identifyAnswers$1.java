package com.zykj.evaluation.p057ui.sheet.normal;

import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0, 1, 1, 1, 1}, m13598l = {PointerIconCompat.TYPE_TEXT, 1026}, m13599m = "identifyAnswers", m13600n = {"bitmap", "points", "previewBitmap", "bitmap", "points", "previewBitmap", "resultPath"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes4.dex */
public final class NormalViewModel$identifyAnswers$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10073a;

    /* renamed from: b */
    public Object f10074b;

    /* renamed from: c */
    public Object f10075c;

    /* renamed from: d */
    public Object f10076d;

    /* renamed from: e */
    public /* synthetic */ Object f10077e;

    /* renamed from: f */
    public final /* synthetic */ NormalViewModel f10078f;

    /* renamed from: g */
    public int f10079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$identifyAnswers$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10078f = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10077e = obj;
        this.f10079g |= Integer.MIN_VALUE;
        return this.f10078f.m10273P0(null, null, null, this);
    }
}
