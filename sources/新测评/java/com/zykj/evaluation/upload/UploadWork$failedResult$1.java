package com.zykj.evaluation.upload;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadWork", m13596f = "UploadWork.kt", m13597i = {0, 0}, m13598l = {192}, m13599m = "failedResult", m13600n = {"key", "extras"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class UploadWork$failedResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10511a;

    /* renamed from: b */
    public Object f10512b;

    /* renamed from: c */
    public /* synthetic */ Object f10513c;

    /* renamed from: d */
    public final /* synthetic */ UploadWork f10514d;

    /* renamed from: e */
    public int f10515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork$failedResult$1(UploadWork uploadWork, Continuation continuation) {
        super(continuation);
        this.f10514d = uploadWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10513c = obj;
        this.f10515e |= Integer.MIN_VALUE;
        return this.f10514d.m10515f(null, null, this);
    }
}
