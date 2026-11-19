package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.huiwei.launcher.bean.req.LoginReq;
import com.zykj.huiwei.launcher.bean.resp.GatewayBean;
import com.zykj.huiwei.launcher.bean.resp.LoginResp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$login$1", m7918f = "LoginViewModel.kt", m7919i = {1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8}, m7920l = {167, 170, 171, 189, 209, 215, 216, 232, 239}, m7921m = "invokeSuspend", m7922n = {"e", "e", "loginUrlResp", "loginUrlResp", "deviceId", "loginReq", "loginUrlResp", "deviceId", "loginReq", "e", "loginUrlResp", "deviceId", "loginReq", "e", "loginUrlResp", "deviceId", "loginReq", "loginResp", "level", "loginUrlResp", "deviceId", "loginReq", "loginResp"}, m7923s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,518:1\n56#2:519\n59#2:523\n46#3:520\n51#3:522\n105#4:521\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1\n*L\n182#1:519\n182#1:523\n182#1:520\n182#1:522\n182#1:521\n*E\n"})
/* loaded from: classes4.dex */
public final class LoginViewModel$login$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f7167a;

    /* renamed from: b */
    public Object f7168b;

    /* renamed from: c */
    public Object f7169c;

    /* renamed from: d */
    public Object f7170d;

    /* renamed from: e */
    public int f7171e;

    /* renamed from: f */
    public int f7172f;

    /* renamed from: g */
    public final /* synthetic */ LoginViewModel f7173g;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$login$1$1", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {240}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.LoginViewModel$login$1$1 */
    public static final class C61881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f7174a;

        /* renamed from: b */
        public final /* synthetic */ LoginViewModel f7175b;

        /* renamed from: c */
        public final /* synthetic */ LoginReq f7176c;

        /* renamed from: d */
        public final /* synthetic */ GatewayBean f7177d;

        /* renamed from: e */
        public final /* synthetic */ LoginResp f7178e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61881(LoginViewModel loginViewModel, LoginReq loginReq, GatewayBean gatewayBean, LoginResp loginResp, Continuation continuation) {
            super(2, continuation);
            this.f7175b = loginViewModel;
            this.f7176c = loginReq;
            this.f7177d = gatewayBean;
            this.f7178e = loginResp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C61881(this.f7175b, this.f7176c, this.f7177d, this.f7178e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f7174a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginViewModel loginViewModel = this.f7175b;
                LoginReq loginReq = this.f7176c;
                GatewayBean gatewayBean = this.f7177d;
                LoginResp loginResp = this.f7178e;
                this.f7174a = 1;
                if (loginViewModel.m6137w(loginReq, gatewayBean, loginResp, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$login$1(LoginViewModel loginViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7173g = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginViewModel$login$1(this.f7173g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x033f, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r0, r7, r21) == r2) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c6 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:7:0x0028, B:12:0x0040, B:108:0x02f9, B:15:0x0055, B:102:0x02ae, B:103:0x02b3, B:105:0x02c6, B:110:0x0309, B:112:0x0313, B:115:0x0342, B:18:0x006e, B:99:0x0291, B:93:0x026e, B:95:0x0272, B:116:0x035b, B:26:0x0095, B:76:0x01b5, B:78:0x01bd, B:80:0x01ef, B:84:0x023d, B:83:0x022b, B:30:0x00a1, B:72:0x018a, B:73:0x018c, B:33:0x00ac, B:69:0x016a, B:58:0x012c, B:64:0x0155, B:66:0x0159, B:117:0x035c, B:35:0x00b1, B:62:0x0152, B:59:0x0139), top: B:129:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0309 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:7:0x0028, B:12:0x0040, B:108:0x02f9, B:15:0x0055, B:102:0x02ae, B:103:0x02b3, B:105:0x02c6, B:110:0x0309, B:112:0x0313, B:115:0x0342, B:18:0x006e, B:99:0x0291, B:93:0x026e, B:95:0x0272, B:116:0x035b, B:26:0x0095, B:76:0x01b5, B:78:0x01bd, B:80:0x01ef, B:84:0x023d, B:83:0x022b, B:30:0x00a1, B:72:0x018a, B:73:0x018c, B:33:0x00ac, B:69:0x016a, B:58:0x012c, B:64:0x0155, B:66:0x0159, B:117:0x035c, B:35:0x00b1, B:62:0x0152, B:59:0x0139), top: B:129:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035b A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:7:0x0028, B:12:0x0040, B:108:0x02f9, B:15:0x0055, B:102:0x02ae, B:103:0x02b3, B:105:0x02c6, B:110:0x0309, B:112:0x0313, B:115:0x0342, B:18:0x006e, B:99:0x0291, B:93:0x026e, B:95:0x0272, B:116:0x035b, B:26:0x0095, B:76:0x01b5, B:78:0x01bd, B:80:0x01ef, B:84:0x023d, B:83:0x022b, B:30:0x00a1, B:72:0x018a, B:73:0x018c, B:33:0x00ac, B:69:0x016a, B:58:0x012c, B:64:0x0155, B:66:0x0159, B:117:0x035c, B:35:0x00b1, B:62:0x0152, B:59:0x0139), top: B:129:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[PHI: r0 r8
      0x009a: PHI (r0v10 com.zykj.huiwei.launcher.bean.resp.GatewayBean) = (r0v7 com.zykj.huiwei.launcher.bean.resp.GatewayBean), (r0v103 com.zykj.huiwei.launcher.bean.resp.GatewayBean) binds: [B:74:0x01b1, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r8v12 java.lang.Object) = (r8v11 java.lang.Object), (r8v26 java.lang.Object) binds: [B:74:0x01b1, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:7:0x0028, B:12:0x0040, B:108:0x02f9, B:15:0x0055, B:102:0x02ae, B:103:0x02b3, B:105:0x02c6, B:110:0x0309, B:112:0x0313, B:115:0x0342, B:18:0x006e, B:99:0x0291, B:93:0x026e, B:95:0x0272, B:116:0x035b, B:26:0x0095, B:76:0x01b5, B:78:0x01bd, B:80:0x01ef, B:84:0x023d, B:83:0x022b, B:30:0x00a1, B:72:0x018a, B:73:0x018c, B:33:0x00ac, B:69:0x016a, B:58:0x012c, B:64:0x0155, B:66:0x0159, B:117:0x035c, B:35:0x00b1, B:62:0x0152, B:59:0x0139), top: B:129:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:7:0x0028, B:12:0x0040, B:108:0x02f9, B:15:0x0055, B:102:0x02ae, B:103:0x02b3, B:105:0x02c6, B:110:0x0309, B:112:0x0313, B:115:0x0342, B:18:0x006e, B:99:0x0291, B:93:0x026e, B:95:0x0272, B:116:0x035b, B:26:0x0095, B:76:0x01b5, B:78:0x01bd, B:80:0x01ef, B:84:0x023d, B:83:0x022b, B:30:0x00a1, B:72:0x018a, B:73:0x018c, B:33:0x00ac, B:69:0x016a, B:58:0x012c, B:64:0x0155, B:66:0x0159, B:117:0x035c, B:35:0x00b1, B:62:0x0152, B:59:0x0139), top: B:129:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:7:0x0028, B:12:0x0040, B:108:0x02f9, B:15:0x0055, B:102:0x02ae, B:103:0x02b3, B:105:0x02c6, B:110:0x0309, B:112:0x0313, B:115:0x0342, B:18:0x006e, B:99:0x0291, B:93:0x026e, B:95:0x0272, B:116:0x035b, B:26:0x0095, B:76:0x01b5, B:78:0x01bd, B:80:0x01ef, B:84:0x023d, B:83:0x022b, B:30:0x00a1, B:72:0x018a, B:73:0x018c, B:33:0x00ac, B:69:0x016a, B:58:0x012c, B:64:0x0155, B:66:0x0159, B:117:0x035c, B:35:0x00b1, B:62:0x0152, B:59:0x0139), top: B:129:0x000d, inners: #3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel$login$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1.smali:228
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((LoginViewModel$login$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
