package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel", m7918f = "LoginViewModel.kt", m7919i = {0}, m7920l = {261}, m7921m = "gatewayBean", m7922n = {"schoolCode"}, m7923s = {"L$0"})
/* loaded from: classes4.dex */
public final class LoginViewModel$gatewayBean$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f7152a;

    /* renamed from: b */
    public /* synthetic */ Object f7153b;

    /* renamed from: c */
    public final /* synthetic */ LoginViewModel f7154c;

    /* renamed from: d */
    public int f7155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$gatewayBean$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(continuation);
        this.f7154c = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7153b = obj;
        this.f7155d |= Integer.MIN_VALUE;
        return this.f7154c.m6122h(null, this);
    }
}
