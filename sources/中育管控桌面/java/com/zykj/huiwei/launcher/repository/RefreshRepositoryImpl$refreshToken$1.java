package com.zykj.huiwei.launcher.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.RefreshRepositoryImpl", m7918f = "RefreshRepositoryImpl.kt", m7919i = {0, 1, 2, 2, 3, 3, 3, 4}, m7920l = {41, 44, 52, 66, 81}, m7921m = "refreshToken", m7922n = {"oldToken", "oldToken", "oldToken", "serverBean", "oldToken", "serverBean", "tokenResp", "oldToken"}, m7923s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes4.dex */
public final class RefreshRepositoryImpl$refreshToken$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f6190a;

    /* renamed from: b */
    public Object f6191b;

    /* renamed from: c */
    public Object f6192c;

    /* renamed from: d */
    public /* synthetic */ Object f6193d;

    /* renamed from: e */
    public final /* synthetic */ RefreshRepositoryImpl f6194e;

    /* renamed from: f */
    public int f6195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$1(RefreshRepositoryImpl refreshRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.f6194e = refreshRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6193d = obj;
        this.f6195f |= Integer.MIN_VALUE;
        return this.f6194e.mo5430a(null, this);
    }
}
