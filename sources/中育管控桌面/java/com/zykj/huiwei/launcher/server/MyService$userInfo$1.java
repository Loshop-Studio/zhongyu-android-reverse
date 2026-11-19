package com.zykj.huiwei.launcher.server;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "Lcom/zykj/message/server/bean/UserInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.server.MyService$userInfo$1", m7918f = "MyService.kt", m7919i = {1, 1}, m7920l = {258, 259}, m7921m = "invokeSuspend", m7922n = {"it", "$i$a$-let-MyService$userInfo$1$1"}, m7923s = {"L$0", "I$0"})
/* loaded from: classes4.dex */
public final class MyService$userInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserInfo>, Object> {

    /* renamed from: a */
    public Object f6266a;

    /* renamed from: b */
    public int f6267b;

    /* renamed from: c */
    public int f6268c;

    /* renamed from: d */
    public final /* synthetic */ MyService f6269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyService$userInfo$1(MyService myService, Continuation continuation) {
        super(2, continuation);
        this.f6269d = myService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyService$userInfo$1(this.f6269d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super UserInfo> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f6268c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r9.f6266a
            com.zykj.huiwei.launcher.proto.m r0 = (com.zykj.huiwei.launcher.proto.C6075m) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L54
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L38
        L22:
            kotlin.ResultKt.throwOnFailure(r10)
            com.zykj.huiwei.launcher.server.MyService r10 = r9.f6269d
            androidx.datastore.core.DataStore r10 = r10.m5493n()
            kotlinx.coroutines.flow.Flow r10 = r10.getData()
            r9.f6268c = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r10, r9)
            if (r10 != r0) goto L38
            goto L51
        L38:
            com.zykj.huiwei.launcher.server.MyService r1 = r9.f6269d
            com.zykj.huiwei.launcher.proto.m r10 = (com.zykj.huiwei.launcher.proto.C6075m) r10
            androidx.datastore.core.DataStore r1 = r1.m5491l()
            kotlinx.coroutines.flow.Flow r1 = r1.getData()
            r9.f6266a = r10
            r3 = 0
            r9.f6267b = r3
            r9.f6268c = r2
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r9)
            if (r1 != r0) goto L52
        L51:
            return r0
        L52:
            r0 = r10
            r10 = r1
        L54:
            com.zykj.huiwei.launcher.proto.a r10 = (com.zykj.huiwei.launcher.proto.C6063a) r10
            com.zykj.message.server.bean.UserInfo r1 = new com.zykj.message.server.bean.UserInfo
            java.lang.String r2 = r0.getId()
            java.lang.String r3 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L72
            java.lang.String r2 = r0.getId()
            java.lang.String r3 = "getId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            long r2 = java.lang.Long.parseLong(r2)
            goto L74
        L72:
            r2 = 0
        L74:
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            java.lang.String r3 = r10.getSchoolCode()
            java.lang.String r4 = r0.getUserName()
            java.lang.String r5 = r0.getRealName()
            java.lang.String r6 = r0.getPassword()
            java.lang.String r7 = r0.getAvatar()
            com.zykj.huiwei.launcher.proto.RoleType r10 = r0.getRole()
            int r10 = r10.ordinal()
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.server.MyService$userInfo$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/server/MyService$userInfo$1.smali:146
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MyService$userInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
