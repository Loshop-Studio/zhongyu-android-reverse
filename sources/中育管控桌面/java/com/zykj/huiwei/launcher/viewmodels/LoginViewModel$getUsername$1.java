package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {110}, m7921m = "getUsername", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class LoginViewModel$getUsername$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f7164a;

    /* renamed from: b */
    public final /* synthetic */ LoginViewModel f7165b;

    /* renamed from: c */
    public int f7166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$getUsername$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(continuation);
        this.f7165b = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7164a = obj;
        this.f7166c |= Integer.MIN_VALUE;
        return this.f7165b.m6133s(this);
    }
}
