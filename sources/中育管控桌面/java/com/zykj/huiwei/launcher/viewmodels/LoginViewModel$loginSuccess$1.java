package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel", m7918f = "LoginViewModel.kt", m7919i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m7920l = {485, 497, 499}, m7921m = "loginSuccess", m7922n = {"loginReq", "loginUrlResp", "loginResp", "needCheckCrack", "loginReq", "loginUrlResp", "loginResp", "needCheckCrack", "loginReq", "loginUrlResp", "loginResp", "needCheckCrack"}, m7923s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes4.dex */
public final class LoginViewModel$loginSuccess$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f7179a;

    /* renamed from: b */
    public Object f7180b;

    /* renamed from: c */
    public Object f7181c;

    /* renamed from: d */
    public boolean f7182d;

    /* renamed from: e */
    public /* synthetic */ Object f7183e;

    /* renamed from: f */
    public final /* synthetic */ LoginViewModel f7184f;

    /* renamed from: g */
    public int f7185g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$loginSuccess$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(continuation);
        this.f7184f = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7183e = obj;
        this.f7185g |= Integer.MIN_VALUE;
        return this.f7184f.m6137w(null, null, null, false, this);
    }
}
