package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.proto.C6066d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/d;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/d;)Lcom/zykj/huiwei/launcher/proto/d;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$loginSuccess$3", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class LoginViewModel$loginSuccess$3 extends SuspendLambda implements Function2<C6066d, Continuation<? super C6066d>, Object> {

    /* renamed from: a */
    public int f7190a;

    /* renamed from: b */
    public /* synthetic */ Object f7191b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$loginSuccess$3(boolean z6, Continuation continuation) {
        super(2, continuation);
        this.f7192c = z6;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6066d c6066d, Continuation continuation) {
        return ((LoginViewModel$loginSuccess$3) create(c6066d, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginViewModel$loginSuccess$3 loginViewModel$loginSuccess$3 = new LoginViewModel$loginSuccess$3(this.f7192c, continuation);
        loginViewModel$loginSuccess$3.f7191b = obj;
        return loginViewModel$loginSuccess$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6066d c6066d = (C6066d) this.f7191b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7190a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GeneratedMessageLite generatedMessageLiteBuild = ((C6066d.b) c6066d.toBuilder()).setIsLoginSuccess(true).setNeedCheckCrack(this.f7192c).build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
