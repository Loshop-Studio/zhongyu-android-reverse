package com.zykj.huiwei.launcher.server;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.message.server.bean.ServerInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "Lcom/zykj/message/server/bean/ServerInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.server.MyService$serverInfo$1", m7918f = "MyService.kt", m7919i = {1, 1}, m7920l = {105, 108}, m7921m = "invokeSuspend", m7922n = {"it", "$i$a$-let-MyService$serverInfo$1$1"}, m7923s = {"L$0", "I$0"})
/* loaded from: classes4.dex */
public final class MyService$serverInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ServerInfo>, Object> {

    /* renamed from: a */
    public Object f6262a;

    /* renamed from: b */
    public int f6263b;

    /* renamed from: c */
    public int f6264c;

    /* renamed from: d */
    public final /* synthetic */ MyService f6265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyService$serverInfo$1(MyService myService, Continuation continuation) {
        super(2, continuation);
        this.f6265d = myService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyService$serverInfo$1(this.f6265d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ServerInfo> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f6264c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r7.f6262a
            com.zykj.huiwei.launcher.proto.a r0 = (com.zykj.huiwei.launcher.proto.C6063a) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L54
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L38
        L22:
            kotlin.ResultKt.throwOnFailure(r8)
            com.zykj.huiwei.launcher.server.MyService r8 = r7.f6265d
            androidx.datastore.core.DataStore r8 = r8.m5491l()
            kotlinx.coroutines.flow.Flow r8 = r8.getData()
            r7.f6264c = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r7)
            if (r8 != r0) goto L38
            goto L51
        L38:
            com.zykj.huiwei.launcher.server.MyService r1 = r7.f6265d
            com.zykj.huiwei.launcher.proto.a r8 = (com.zykj.huiwei.launcher.proto.C6063a) r8
            androidx.datastore.core.DataStore r1 = r1.m5492m()
            kotlinx.coroutines.flow.Flow r1 = r1.getData()
            r7.f6262a = r8
            r3 = 0
            r7.f6263b = r3
            r7.f6264c = r2
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r7)
            if (r1 != r0) goto L52
        L51:
            return r0
        L52:
            r0 = r8
            r8 = r1
        L54:
            com.zykj.huiwei.launcher.proto.d r8 = (com.zykj.huiwei.launcher.proto.C6066d) r8
            boolean r8 = r8.getIsLoginSuccess()
            if (r8 == 0) goto L6f
            java.lang.String r8 = r0.getServerUrl()
            java.lang.String r1 = "getServerUrl(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            int r8 = r8.length()
            if (r8 <= 0) goto L6f
            com.zykj.message.server.bean.Status r8 = com.zykj.message.server.bean.Status.LOGIN
        L6d:
            r2 = r8
            goto L72
        L6f:
            com.zykj.message.server.bean.Status r8 = com.zykj.message.server.bean.Status.LOGOUT
            goto L6d
        L72:
            java.lang.String r3 = r0.getServerUrl()
            java.lang.String r4 = r0.getAccessToken()
            java.lang.String r5 = r0.getImAccessToken()
            java.lang.String r6 = r0.getWebServerUrl()
            com.zykj.message.server.bean.ServerInfo r1 = new com.zykj.message.server.bean.ServerInfo
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.server.MyService$serverInfo$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/server/MyService$serverInfo$1.smali:146
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MyService$serverInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
