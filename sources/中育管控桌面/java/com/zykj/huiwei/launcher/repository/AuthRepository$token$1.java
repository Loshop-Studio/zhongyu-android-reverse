package com.zykj.huiwei.launcher.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.AuthRepository", m7918f = "AuthRepository.kt", m7919i = {0, 0}, m7920l = {23}, m7921m = "token", m7922n = {"serverUrl", "loginReq"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class AuthRepository$token$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f6144a;

    /* renamed from: b */
    public Object f6145b;

    /* renamed from: c */
    public /* synthetic */ Object f6146c;

    /* renamed from: d */
    public final /* synthetic */ AuthRepository f6147d;

    /* renamed from: e */
    public int f6148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepository$token$1(AuthRepository authRepository, Continuation continuation) {
        super(continuation);
        this.f6147d = authRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6146c = obj;
        this.f6148e |= Integer.MIN_VALUE;
        return this.f6147d.m5413a(null, null, this);
    }
}
