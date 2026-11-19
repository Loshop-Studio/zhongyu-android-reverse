package com.zykj.huiwei.launcher.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.UserRepository", m7918f = "UserRepository.kt", m7919i = {}, m7920l = {31}, m7921m = "userInfo", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class UserRepository$userInfo$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f6211a;

    /* renamed from: b */
    public final /* synthetic */ UserRepository f6212b;

    /* renamed from: c */
    public int f6213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$userInfo$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.f6212b = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6211a = obj;
        this.f6213c |= Integer.MIN_VALUE;
        return this.f6212b.m5436e(this);
    }
}
