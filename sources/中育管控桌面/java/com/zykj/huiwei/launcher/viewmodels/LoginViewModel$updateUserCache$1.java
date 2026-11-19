package com.zykj.huiwei.launcher.viewmodels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel", m7918f = "LoginViewModel.kt", m7919i = {0, 0, 1, 1, 1, 2, 2, 2}, m7920l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 329}, m7921m = "updateUserCache", m7922n = {"loginUrlResp", "loginResp", "loginUrlResp", "loginResp", "userInfo", "loginUrlResp", "loginResp", "userInfo"}, m7923s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class LoginViewModel$updateUserCache$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f7193a;

    /* renamed from: b */
    public Object f7194b;

    /* renamed from: c */
    public Object f7195c;

    /* renamed from: d */
    public /* synthetic */ Object f7196d;

    /* renamed from: e */
    public final /* synthetic */ LoginViewModel f7197e;

    /* renamed from: f */
    public int f7198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$updateUserCache$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(continuation);
        this.f7197e = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7196d = obj;
        this.f7198f |= Integer.MIN_VALUE;
        return this.f7197e.m6140z(null, null, this);
    }
}
