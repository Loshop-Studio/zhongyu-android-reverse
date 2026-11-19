package com.zykj.huiwei.launcher.repository;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.GeneratedMessageLite;
import com.zykj.huiwei.launcher.bean.resp.TokenResp;
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
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.RefreshRepositoryImpl$refreshToken$3", m7918f = "RefreshRepositoryImpl.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class RefreshRepositoryImpl$refreshToken$3 extends SuspendLambda implements Function2<C6063a, Continuation<? super C6063a>, Object> {

    /* renamed from: a */
    public int f6196a;

    /* renamed from: b */
    public /* synthetic */ Object f6197b;

    /* renamed from: c */
    public final /* synthetic */ TokenResp f6198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$3(TokenResp tokenResp, Continuation continuation) {
        super(2, continuation);
        this.f6198c = tokenResp;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6063a c6063a, Continuation continuation) {
        return ((RefreshRepositoryImpl$refreshToken$3) create(c6063a, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RefreshRepositoryImpl$refreshToken$3 refreshRepositoryImpl$refreshToken$3 = new RefreshRepositoryImpl$refreshToken$3(this.f6198c, continuation);
        refreshRepositoryImpl$refreshToken$3.f6197b = obj;
        return refreshRepositoryImpl$refreshToken$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6063a c6063a = (C6063a) this.f6197b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6196a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GeneratedMessageLite generatedMessageLiteBuild = ((C6063a.b) c6063a.toBuilder()).setAccessToken(this.f6198c.getAccessToken()).setRefreshToken(this.f6198c.getRefreshToken()).build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
