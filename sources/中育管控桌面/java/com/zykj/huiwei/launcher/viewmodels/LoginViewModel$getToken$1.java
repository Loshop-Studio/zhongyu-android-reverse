package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel", m7918f = "LoginViewModel.kt", m7919i = {0, 0}, m7920l = {285}, m7921m = "getToken", m7922n = {"loginUrlResp", "loginReq"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class LoginViewModel$getToken$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f7159a;

    /* renamed from: b */
    public Object f7160b;

    /* renamed from: c */
    public /* synthetic */ Object f7161c;

    /* renamed from: d */
    public final /* synthetic */ LoginViewModel f7162d;

    /* renamed from: e */
    public int f7163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$getToken$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(continuation);
        this.f7162d = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7161c = obj;
        this.f7163e |= Integer.MIN_VALUE;
        return this.f7162d.m6130p(null, null, this);
    }
}
