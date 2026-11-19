package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadWork", m13596f = "UploadWork.kt", m13597i = {0, 0}, m13598l = {184}, m13599m = "successResult", m13600n = {"key", "extras"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class UploadWork$successResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10516a;

    /* renamed from: b */
    public Object f10517b;

    /* renamed from: c */
    public /* synthetic */ Object f10518c;

    /* renamed from: d */
    public final /* synthetic */ UploadWork f10519d;

    /* renamed from: e */
    public int f10520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$successResult$1(UploadWork uploadWork, Continuation continuation) {
        super(continuation);
        this.f10519d = uploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10518c = obj;
        this.f10520e |= Integer.MIN_VALUE;
        return this.f10519d.m10516j(null, null, this);
    }
}
