package com.zykj.huiwei.launcher.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.UserRepository", m7918f = "UserRepository.kt", m7919i = {}, m7920l = {35}, m7921m = "schoolInfoSettingsAsync", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class UserRepository$schoolInfoSettingsAsync$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f6204a;

    /* renamed from: b */
    public final /* synthetic */ UserRepository f6205b;

    /* renamed from: c */
    public int f6206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$schoolInfoSettingsAsync$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.f6205b = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6204a = obj;
        this.f6206c |= Integer.MIN_VALUE;
        return this.f6205b.m5434c(this);
    }
}
