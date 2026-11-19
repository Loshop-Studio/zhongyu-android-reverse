package com.zykj.huiwei.launcher.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.UserRepository", m7918f = "UserRepository.kt", m7919i = {0}, m7920l = {50}, m7921m = "forceChangePasswordAsync", m7922n = {HintConstants.AUTOFILL_HINT_PASSWORD}, m7923s = {"L$0"})
/* loaded from: classes4.dex */
public final class UserRepository$forceChangePasswordAsync$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f6200a;

    /* renamed from: b */
    public /* synthetic */ Object f6201b;

    /* renamed from: c */
    public final /* synthetic */ UserRepository f6202c;

    /* renamed from: d */
    public int f6203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$forceChangePasswordAsync$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.f6202c = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6201b = obj;
        this.f6203d |= Integer.MIN_VALUE;
        return this.f6202c.m5433b(null, this);
    }
}
