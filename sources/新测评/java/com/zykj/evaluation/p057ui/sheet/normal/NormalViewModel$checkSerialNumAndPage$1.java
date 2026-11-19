package com.zykj.evaluation.p057ui.sheet.normal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0, 0}, m13598l = {963}, m13599m = "checkSerialNumAndPage", m13600n = {"bitmap", "points", "previewBitmap", "result"}, m13601s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes4.dex */
public final class NormalViewModel$checkSerialNumAndPage$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10011a;

    /* renamed from: b */
    public Object f10012b;

    /* renamed from: c */
    public Object f10013c;

    /* renamed from: d */
    public Object f10014d;

    /* renamed from: e */
    public /* synthetic */ Object f10015e;

    /* renamed from: f */
    public final /* synthetic */ NormalViewModel f10016f;

    /* renamed from: g */
    public int f10017g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$checkSerialNumAndPage$1(NormalViewModel normalViewModel, Continuation continuation) {
        super(continuation);
        this.f10016f = normalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10015e = obj;
        this.f10017g |= Integer.MIN_VALUE;
        return this.f10016f.m10264F0(null, null, null, this);
    }
}
