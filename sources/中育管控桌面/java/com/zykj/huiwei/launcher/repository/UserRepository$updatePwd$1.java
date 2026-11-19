package com.zykj.huiwei.launcher.repository;

import com.zykj.huiwei.launcher.bean.req.UpdatePwdReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.UserRepository$updatePwd$1", m7918f = "UserRepository.kt", m7919i = {0, 1}, m7920l = {40, 41}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "$this$flow"}, m7923s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
public final class UserRepository$updatePwd$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6207a;

    /* renamed from: b */
    public /* synthetic */ Object f6208b;

    /* renamed from: c */
    public final /* synthetic */ UserRepository f6209c;

    /* renamed from: d */
    public final /* synthetic */ UpdatePwdReq f6210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$updatePwd$1(UserRepository userRepository, UpdatePwdReq updatePwdReq, Continuation continuation) {
        super(2, continuation);
        this.f6209c = userRepository;
        this.f6210d = updatePwdReq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserRepository$updatePwd$1 userRepository$updatePwd$1 = new UserRepository$updatePwd$1(this.f6209c, this.f6210d, continuation);
        userRepository$updatePwd$1.f6208b = obj;
        return userRepository$updatePwd$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r6, r5) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6208b
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.f6207a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L38
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.huiwei.launcher.repository.UserRepository r6 = r5.f6209c
            com.zykj.huiwei.launcher.api.UserService r6 = com.zykj.huiwei.launcher.repository.UserRepository.m5432a(r6)
            com.zykj.huiwei.launcher.bean.req.UpdatePwdReq r2 = r5.f6210d
            r5.f6208b = r0
            r5.f6207a = r4
            java.lang.Object r6 = r6.updatePwd(r2, r5)
            if (r6 != r1) goto L38
            goto L4f
        L38:
            com.zykj.http.bean.ApiResp r6 = (com.zykj.http.bean.ApiResp) r6
            p004a3.AbstractC0009a.m13b(r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f6208b = r2
            r5.f6207a = r3
            java.lang.Object r6 = r0.emit(r6, r5)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.UserRepository$updatePwd$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/UserRepository$updatePwd$1.smali:155
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((UserRepository$updatePwd$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
