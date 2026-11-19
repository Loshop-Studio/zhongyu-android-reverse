package com.zykj.huiwei.launcher.server;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.server.MyService$refreshToken$1", m7918f = "MyService.kt", m7919i = {1, 1}, m7920l = {280, 284}, m7921m = "invokeSuspend", m7922n = {"settings", "serverInfo"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class MyService$refreshToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6257a;

    /* renamed from: b */
    public Object f6258b;

    /* renamed from: c */
    public int f6259c;

    /* renamed from: d */
    public final /* synthetic */ MyService f6260d;

    /* renamed from: e */
    public final /* synthetic */ Function1 f6261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyService$refreshToken$1(MyService myService, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f6260d = myService;
        this.f6261e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyService$refreshToken$1(this.f6260d, this.f6261e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r3.mo5430a(r4, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f6259c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r5.f6258b
            com.zykj.message.server.bean.ServerInfo r0 = (com.zykj.message.server.bean.ServerInfo) r0
            java.lang.Object r0 = r5.f6257a
            com.zykj.huiwei.launcher.proto.d r0 = (com.zykj.huiwei.launcher.proto.C6066d) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6d
        L1a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3c
        L26:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.huiwei.launcher.server.MyService r6 = r5.f6260d
            androidx.datastore.core.DataStore r6 = r6.m5492m()
            kotlinx.coroutines.flow.Flow r6 = r6.getData()
            r5.f6259c = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r6, r5)
            if (r6 != r0) goto L3c
            goto L6c
        L3c:
            com.zykj.huiwei.launcher.proto.d r6 = (com.zykj.huiwei.launcher.proto.C6066d) r6
            com.zykj.huiwei.launcher.server.MyService r1 = r5.f6260d
            com.zykj.message.server.bean.ServerInfo r1 = r1.mo5487c()
            boolean r3 = r6.getIsLoginSuccess()
            if (r3 == 0) goto L83
            com.zykj.huiwei.launcher.server.MyService r3 = r5.f6260d
            q3.a r3 = r3.m5490k()
            java.lang.String r4 = r1.m6221a()
            if (r4 != 0) goto L58
            java.lang.String r4 = ""
        L58:
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.f6257a = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r5.f6258b = r6
            r5.f6259c = r2
            java.lang.Object r6 = r3.mo5430a(r4, r5)
            if (r6 != r0) goto L6d
        L6c:
            return r0
        L6d:
            com.zykj.huiwei.launcher.server.MyService r6 = r5.f6260d     // Catch: java.lang.Exception -> L7e
            com.zykj.message.server.bean.ServerInfo r6 = r6.mo5487c()     // Catch: java.lang.Exception -> L7e
            kotlin.jvm.functions.Function1 r0 = r5.f6261e     // Catch: java.lang.Exception -> L7e
            com.zykj.message.server.MessageManage r1 = com.zykj.message.server.MessageManage.f7396a     // Catch: java.lang.Exception -> L7e
            r1.mo6208c(r6)     // Catch: java.lang.Exception -> L7e
            r0.invoke(r6)     // Catch: java.lang.Exception -> L7e
            goto Laf
        L7e:
            r6 = move-exception
            r6.printStackTrace()
            goto Laf
        L83:
            com.zykj.huiwei.launcher.server.MyService$a r6 = com.zykj.huiwei.launcher.server.MyService.INSTANCE
            java.lang.String r6 = r6.m5495a()
            java.lang.String r0 = "refreshToken 可能是空的"
            android.util.Log.i(r6, r0)
            kotlin.jvm.functions.Function1 r6 = r5.f6261e
            com.zykj.message.server.bean.ServerInfo r0 = new com.zykj.message.server.bean.ServerInfo
            r0.<init>()
            r6.invoke(r0)
            com.zykj.huiwei.launcher.server.MyService r6 = r5.f6260d
            com.zykj.huiwei.launcher.app.App$a r0 = com.zykj.huiwei.launcher.app.App.INSTANCE
            com.zykj.huiwei.launcher.app.App r0 = r0.m5206a()
            r1 = 2131820696(0x7f110098, float:1.9274114E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.zykj.huiwei.launcher.server.MyService.m5484j(r6, r0)
        Laf:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.server.MyService$refreshToken$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/server/MyService$refreshToken$1.smali:152
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MyService$refreshToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
