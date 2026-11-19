package com.zykj.evaluation.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.network.RefreshRepositoryImpl", m13596f = "RefreshRepositoryImpl.kt", m13597i = {0}, m13598l = {26}, m13599m = "refreshToken", m13600n = {"oldToken"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class RefreshRepositoryImpl$refreshToken$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f8805a;

    /* renamed from: b */
    public /* synthetic */ Object f8806b;

    /* renamed from: c */
    public final /* synthetic */ RefreshRepositoryImpl f8807c;

    /* renamed from: d */
    public int f8808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$1(RefreshRepositoryImpl refreshRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.f8807c = refreshRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8806b = obj;
        this.f8808d |= Integer.MIN_VALUE;
        return this.f8807c.mo8774a(null, this);
    }
}
