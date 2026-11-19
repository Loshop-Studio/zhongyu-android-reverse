package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.bean.resp.GatewayBean;
import com.zykj.huiwei.launcher.bean.resp.LoginResp;
import com.zykj.huiwei.launcher.proto.C6063a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/a;", "it", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/a;)Lcom/zykj/huiwei/launcher/proto/a;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$loginSuccess$2", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class LoginViewModel$loginSuccess$2 extends SuspendLambda implements Function2<C6063a, Continuation<? super C6063a>, Object> {

    /* renamed from: a */
    public int f7186a;

    /* renamed from: b */
    public /* synthetic */ Object f7187b;

    /* renamed from: c */
    public final /* synthetic */ GatewayBean f7188c;

    /* renamed from: d */
    public final /* synthetic */ LoginResp f7189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$loginSuccess$2(GatewayBean gatewayBean, LoginResp loginResp, Continuation continuation) {
        super(2, continuation);
        this.f7188c = gatewayBean;
        this.f7189d = loginResp;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6063a c6063a, Continuation continuation) {
        return ((LoginViewModel$loginSuccess$2) create(c6063a, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginViewModel$loginSuccess$2 loginViewModel$loginSuccess$2 = new LoginViewModel$loginSuccess$2(this.f7188c, this.f7189d, continuation);
        loginViewModel$loginSuccess$2.f7187b = obj;
        return loginViewModel$loginSuccess$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6063a c6063a = (C6063a) this.f7187b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f7186a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C6063a.b serverUrl = ((C6063a.b) c6063a.toBuilder()).setSchoolCode(this.f7188c.getCode()).setServerUrl(this.f7188c.getServer());
        String webServer = this.f7188c.getWebServer();
        if (webServer == null) {
            webServer = "";
        }
        C6063a.b accessToken = serverUrl.setWebServerUrl(webServer).setAccessToken(this.f7189d.getAccessToken());
        String rongCloudToken = this.f7189d.getRongCloudToken();
        GeneratedMessageLite generatedMessageLiteBuild = accessToken.setImAccessToken(rongCloudToken != null ? rongCloudToken : "").setRefreshToken(this.f7189d.getRefreshToken()).build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
