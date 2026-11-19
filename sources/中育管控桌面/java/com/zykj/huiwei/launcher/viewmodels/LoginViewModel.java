package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.app.Application;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.http.bean.HeaderBean;
import com.zykj.huiwei.launcher.repository.AuthRepository;
import com.zykj.huiwei.launcher.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p177w3.C7811a;
import p177w3.C7812b;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001By\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J \u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"H\u0082@¢\u0006\u0004\b'\u0010(J2\u0010+\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\b\u0010.\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b4\u00102J\r\u00105\u001a\u00020&¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010N\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR%\u0010T\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010)0)0O8\u0006¢\u0006\f\n\u0004\bJ\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0O8\u0006¢\u0006\f\n\u0004\b9\u0010Q\u001a\u0004\bH\u0010SR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001a0O8\u0006¢\u0006\f\n\u0004\bR\u0010Q\u001a\u0004\bU\u0010SR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001a0O8\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bF\u0010SR%\u0010Z\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010)0)0O8\u0006¢\u0006\f\n\u0004\b#\u0010Q\u001a\u0004\bY\u0010SR%\u0010\\\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010)0)0O8\u0006¢\u0006\f\n\u0004\b3\u0010Q\u001a\u0004\b[\u0010SR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010_R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020^0a8\u0006¢\u0006\f\n\u0004\b4\u0010b\u001a\u0004\bW\u0010c¨\u0006e"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;", "Lcom/zykj/base/BaseViewModel;", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/a;", "serverDataStore", "Lcom/zykj/huiwei/launcher/proto/m;", "userDataStore", "Lcom/zykj/huiwei/launcher/proto/d;", "settingDataStore", "Lcom/zykj/huiwei/launcher/proto/g;", "studentDataStore", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lcom/zykj/huiwei/launcher/repository/AuthRepository;", "authRepository", "Lw3/b;", "gatewayRepository", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "userRepository", "Lw3/a;", "deviceRepository", "Landroid/app/Application;", "application", "<init>", "(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/repository/AuthRepository;Lw3/b;Lcom/zykj/huiwei/launcher/repository/UserRepository;Lw3/a;Landroid/app/Application;)V", "", "schoolCode", "Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;", "h", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUrlResp", "Lcom/zykj/huiwei/launcher/bean/req/LoginReq;", "loginReq", "Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;", "p", "(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginResp", "", "z", "(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "needCheckCrack", "w", "(Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverUrl", "token", "y", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "s", "v", "()V", "a", "Landroidx/datastore/core/DataStore;", "m", "()Landroidx/datastore/core/DataStore;", "b", "c", "d", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "f", "Lcom/zykj/huiwei/launcher/repository/AuthRepository;", "g", "Lw3/b;", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "Lw3/a;", "j", "Landroid/app/Application;", "k", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "x", "(Ljava/lang/String;)V", "schoolId", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "Landroidx/lifecycle/MutableLiveData;", "n", "()Landroidx/lifecycle/MutableLiveData;", "showLogin", "r", "userName", "o", HintConstants.AUTOFILL_HINT_PASSWORD, "u", "isPolicyChecked", "t", "isLoginSuccess", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_simplePsdShareFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", "simplePsdShareFlow", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,518:1\n230#2,5:519\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel\n*L\n91#1:519,5\n*E\n"})
/* loaded from: classes4.dex */
public final class LoginViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final DataStore serverDataStore;

    /* renamed from: b, reason: from kotlin metadata */
    public final DataStore userDataStore;

    /* renamed from: c, reason: from kotlin metadata */
    public final DataStore settingDataStore;

    /* renamed from: d, reason: from kotlin metadata */
    public final DataStore studentDataStore;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* renamed from: f, reason: from kotlin metadata */
    public final AuthRepository authRepository;

    /* renamed from: g, reason: from kotlin metadata */
    public final C7812b gatewayRepository;

    /* renamed from: h, reason: from kotlin metadata */
    public final UserRepository userRepository;

    /* renamed from: i, reason: from kotlin metadata */
    public final C7811a deviceRepository;

    /* renamed from: j, reason: from kotlin metadata */
    public final Application application;

    /* renamed from: k, reason: from kotlin metadata */
    public String schoolId;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableLiveData showLogin;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableLiveData schoolCode;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableLiveData userName;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableLiveData password;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableLiveData isPolicyChecked;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableLiveData isLoginSuccess;

    /* renamed from: r, reason: from kotlin metadata */
    public final MutableSharedFlow _simplePsdShareFlow;

    /* renamed from: s, reason: from kotlin metadata */
    public final SharedFlow simplePsdShareFlow;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$1", m7918f = "LoginViewModel.kt", m7919i = {}, m7920l = {67, 76}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.LoginViewModel$1 */
    public static final class C61871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f7150a;

        public C61871(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LoginViewModel.this.new C61871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        
            if (r6 == r0) goto L18;
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
                int r1 = r5.f7150a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r6)
                goto L63
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L34
            L1e:
                kotlin.ResultKt.throwOnFailure(r6)
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r6 = com.zykj.huiwei.launcher.viewmodels.LoginViewModel.this
                androidx.datastore.core.DataStore r6 = r6.getServerDataStore()
                kotlinx.coroutines.flow.Flow r6 = r6.getData()
                r5.f7150a = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r6, r5)
                if (r6 != r0) goto L34
                goto L62
            L34:
                com.zykj.huiwei.launcher.proto.a r6 = (com.zykj.huiwei.launcher.proto.C6063a) r6
                if (r6 == 0) goto L50
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r1 = com.zykj.huiwei.launcher.viewmodels.LoginViewModel.this
                androidx.lifecycle.MutableLiveData r3 = r1.getSchoolCode()
                java.lang.String r4 = r6.getSchoolCode()
                r3.postValue(r4)
                java.lang.String r3 = r6.getServerUrl()
                java.lang.String r6 = r6.getAccessToken()
                r1.m6139y(r3, r6)
            L50:
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r6 = com.zykj.huiwei.launcher.viewmodels.LoginViewModel.this
                androidx.datastore.core.DataStore r6 = com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6118d(r6)
                kotlinx.coroutines.flow.Flow r6 = r6.getData()
                r5.f7150a = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r6, r5)
                if (r6 != r0) goto L63
            L62:
                return r0
            L63:
                com.zykj.huiwei.launcher.proto.m r6 = (com.zykj.huiwei.launcher.proto.C6075m) r6
                if (r6 == 0) goto L74
                com.zykj.huiwei.launcher.viewmodels.LoginViewModel r0 = com.zykj.huiwei.launcher.viewmodels.LoginViewModel.this
                androidx.lifecycle.MutableLiveData r0 = r0.getUserName()
                java.lang.String r6 = r6.getUserName()
                r0.postValue(r6)
            L74:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.C61871.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel$1.smali:133
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LoginViewModel(DataStore serverDataStore, DataStore userDataStore, DataStore settingDataStore, DataStore studentDataStore, MutableStateFlow headerBeanFlow, AuthRepository authRepository, C7812b gatewayRepository, UserRepository userRepository, C7811a deviceRepository, Application application) {
        Intrinsics.checkNotNullParameter(serverDataStore, "serverDataStore");
        Intrinsics.checkNotNullParameter(userDataStore, "userDataStore");
        Intrinsics.checkNotNullParameter(settingDataStore, "settingDataStore");
        Intrinsics.checkNotNullParameter(studentDataStore, "studentDataStore");
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(gatewayRepository, "gatewayRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.serverDataStore = serverDataStore;
        this.userDataStore = userDataStore;
        this.settingDataStore = settingDataStore;
        this.studentDataStore = studentDataStore;
        this.headerBeanFlow = headerBeanFlow;
        this.authRepository = authRepository;
        this.gatewayRepository = gatewayRepository;
        this.userRepository = userRepository;
        this.deviceRepository = deviceRepository;
        this.application = application;
        BaseViewModel.launch$default(this, null, null, new C61871(null), 3, null);
        Boolean bool = Boolean.FALSE;
        this.showLogin = new MutableLiveData(bool);
        this.schoolCode = new MutableLiveData();
        this.userName = new MutableLiveData();
        this.password = new MutableLiveData();
        this.isPolicyChecked = new MutableLiveData(bool);
        this.isLoginSuccess = new MutableLiveData(bool);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 4, null);
        this._simplePsdShareFlow = mutableSharedFlowMutableSharedFlow$default;
        this.simplePsdShareFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6122h(java.lang.String r8, kotlin.coroutines.Continuation r9) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.huiwei.launcher.viewmodels.LoginViewModel$gatewayBean$1
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$gatewayBean$1 r0 = (com.zykj.huiwei.launcher.viewmodels.LoginViewModel$gatewayBean$1) r0
            int r1 = r0.f7155d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7155d = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$gatewayBean$1 r0 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$gatewayBean$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f7153b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7155d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f7152a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L45
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            w3.b r9 = r7.gatewayRepository
            r0.f7152a = r8
            r0.f7155d = r3
            java.lang.Object r9 = r9.m9401a(r8, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            com.zykj.huiwei.launcher.bean.resp.GatewayBean r9 = (com.zykj.huiwei.launcher.bean.resp.GatewayBean) r9
            java.lang.String r0 = r9.getServer()
            if (r0 == 0) goto L57
            int r0 = r0.length()
            if (r0 == 0) goto L57
            r9.setCode(r8)
            return r9
        L57:
            com.zykj.http.exception.RemoteCodeException r8 = new com.zykj.http.exception.RemoteCodeException
            com.zykj.lib.error.code.ErrorCodeInfo r0 = new com.zykj.lib.error.code.ErrorCodeInfo
            r9 = 2131820929(0x7f110181, float:1.9274587E38)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            r5 = 8
            r6 = 0
            r1 = 0
            java.lang.String r2 = "学校代码错误"
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6122h(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel.smali:567
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6123i(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getClassName$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getClassName$1 r0 = (com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getClassName$1) r0
            int r1 = r0.f7158c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7158c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getClassName$1 r0 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getClassName$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7156a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7158c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.datastore.core.DataStore r5 = r4.studentDataStore
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.f7158c = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.zykj.huiwei.launcher.proto.g r5 = (com.zykj.huiwei.launcher.proto.C6069g) r5
            if (r5 == 0) goto L64
            java.lang.String r0 = r5.getGradeName()
            java.lang.String r5 = r5.getClassName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L64:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6123i(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel.smali:806
    }

    /* renamed from: j, reason: from getter */
    public final MutableLiveData getPassword() {
        return this.password;
    }

    /* renamed from: k, reason: from getter */
    public final MutableLiveData getSchoolCode() {
        return this.schoolCode;
    }

    /* renamed from: l, reason: from getter */
    public final String getSchoolId() {
        return this.schoolId;
    }

    /* renamed from: m, reason: from getter */
    public final DataStore getServerDataStore() {
        return this.serverDataStore;
    }

    /* renamed from: n, reason: from getter */
    public final MutableLiveData getShowLogin() {
        return this.showLogin;
    }

    /* renamed from: o, reason: from getter */
    public final SharedFlow getSimplePsdShareFlow() {
        return this.simplePsdShareFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6130p(com.zykj.huiwei.launcher.bean.resp.GatewayBean r8, com.zykj.huiwei.launcher.bean.req.LoginReq r9, kotlin.coroutines.Continuation r10) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getToken$1
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getToken$1 r0 = (com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getToken$1) r0
            int r1 = r0.f7163e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7163e = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getToken$1 r0 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getToken$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f7161c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7163e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f7160b
            com.zykj.huiwei.launcher.bean.req.LoginReq r8 = (com.zykj.huiwei.launcher.bean.req.LoginReq) r8
            java.lang.Object r8 = r0.f7159a
            com.zykj.huiwei.launcher.bean.resp.GatewayBean r8 = (com.zykj.huiwei.launcher.bean.resp.GatewayBean) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L66
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r8.getServer()
            if (r10 == 0) goto L88
            int r10 = r10.length()
            if (r10 == 0) goto L88
            com.zykj.huiwei.launcher.repository.AuthRepository r10 = r7.authRepository
            java.lang.String r2 = r8.getServer()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.f7159a = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.f7160b = r8
            r0.f7163e = r3
            java.lang.Object r10 = r10.m5413a(r2, r9, r0)
            if (r10 != r1) goto L66
            return r1
        L66:
            com.zykj.huiwei.launcher.bean.resp.LoginResp r10 = (com.zykj.huiwei.launcher.bean.resp.LoginResp) r10
            int r8 = r10.getRoleType()
            if (r8 != r3) goto L6f
            return r10
        L6f:
            com.zykj.http.exception.RemoteCodeException r8 = new com.zykj.http.exception.RemoteCodeException
            com.zykj.lib.error.code.ErrorCodeInfo r0 = new com.zykj.lib.error.code.ErrorCodeInfo
            r9 = 2131820573(0x7f11001d, float:1.9273865E38)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            r5 = 8
            r6 = 0
            r1 = 0
            java.lang.String r2 = "学校代码错误"
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            throw r8
        L88:
            com.zykj.http.exception.RemoteCodeException r8 = new com.zykj.http.exception.RemoteCodeException
            com.zykj.lib.error.code.ErrorCodeInfo r0 = new com.zykj.lib.error.code.ErrorCodeInfo
            r9 = 2131820929(0x7f110181, float:1.9274587E38)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            r5 = 8
            r6 = 0
            r1 = 0
            java.lang.String r2 = "学校代码错误"
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6130p(com.zykj.huiwei.launcher.bean.resp.GatewayBean, com.zykj.huiwei.launcher.bean.req.LoginReq, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel.smali:1089
    }

    /* renamed from: q */
    public final Object m6131q(Continuation continuation) {
        return this.userName.getValue();
    }

    /* renamed from: r, reason: from getter */
    public final MutableLiveData getUserName() {
        return this.userName;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6133s(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getUsername$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getUsername$1 r0 = (com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getUsername$1) r0
            int r1 = r0.f7166c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7166c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getUsername$1 r0 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$getUsername$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f7164a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7166c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.datastore.core.DataStore r5 = r4.userDataStore
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.f7166c = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.zykj.huiwei.launcher.proto.m r5 = (com.zykj.huiwei.launcher.proto.C6075m) r5
            if (r5 == 0) goto L4c
            java.lang.String r5 = r5.getRealName()
            return r5
        L4c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6133s(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel.smali:1458
    }

    /* renamed from: t, reason: from getter */
    public final MutableLiveData getIsLoginSuccess() {
        return this.isLoginSuccess;
    }

    /* renamed from: u, reason: from getter */
    public final MutableLiveData getIsPolicyChecked() {
        return this.isPolicyChecked;
    }

    /* renamed from: v */
    public final void m6136v() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LoginViewModel$login$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6137w(com.zykj.huiwei.launcher.bean.req.LoginReq r10, com.zykj.huiwei.launcher.bean.resp.GatewayBean r11, com.zykj.huiwei.launcher.bean.resp.LoginResp r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6137w(com.zykj.huiwei.launcher.bean.req.LoginReq, com.zykj.huiwei.launcher.bean.resp.GatewayBean, com.zykj.huiwei.launcher.bean.resp.LoginResp, boolean, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel.smali:1694
    }

    /* renamed from: x */
    public final void m6138x(String str) {
        this.schoolId = str;
    }

    /* renamed from: y */
    public final void m6139y(String serverUrl, String token) {
        MutableStateFlow mutableStateFlow = this.headerBeanFlow;
        while (true) {
            Object value = mutableStateFlow.getValue();
            String str = serverUrl;
            String str2 = token;
            if (mutableStateFlow.compareAndSet(value, HeaderBean.copy$default((HeaderBean) value, null, null, str, str2, null, 19, null))) {
                return;
            }
            serverUrl = str;
            token = str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        if (r11.updateData(r5, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6140z(com.zykj.huiwei.launcher.bean.resp.GatewayBean r9, com.zykj.huiwei.launcher.bean.resp.LoginResp r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$1
            if (r0 == 0) goto L13
            r0 = r11
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$1 r0 = (com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$1) r0
            int r1 = r0.f7198f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7198f = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$1 r0 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f7196d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7198f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L62
            if (r2 == r6) goto L55
            if (r2 == r5) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r9 = r0.f7195c
            com.zykj.huiwei.launcher.bean.StudentInfoBean r9 = (com.zykj.huiwei.launcher.bean.StudentInfoBean) r9
            java.lang.Object r9 = r0.f7194b
            com.zykj.huiwei.launcher.bean.resp.LoginResp r9 = (com.zykj.huiwei.launcher.bean.resp.LoginResp) r9
            java.lang.Object r9 = r0.f7193a
            com.zykj.huiwei.launcher.bean.resp.GatewayBean r9 = (com.zykj.huiwei.launcher.bean.resp.GatewayBean) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lcb
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            java.lang.Object r9 = r0.f7195c
            com.zykj.huiwei.launcher.bean.StudentInfoBean r9 = (com.zykj.huiwei.launcher.bean.StudentInfoBean) r9
            java.lang.Object r10 = r0.f7194b
            com.zykj.huiwei.launcher.bean.resp.LoginResp r10 = (com.zykj.huiwei.launcher.bean.resp.LoginResp) r10
            java.lang.Object r2 = r0.f7193a
            com.zykj.huiwei.launcher.bean.resp.GatewayBean r2 = (com.zykj.huiwei.launcher.bean.resp.GatewayBean) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto La9
        L55:
            java.lang.Object r9 = r0.f7194b
            r10 = r9
            com.zykj.huiwei.launcher.bean.resp.LoginResp r10 = (com.zykj.huiwei.launcher.bean.resp.LoginResp) r10
            java.lang.Object r9 = r0.f7193a
            com.zykj.huiwei.launcher.bean.resp.GatewayBean r9 = (com.zykj.huiwei.launcher.bean.resp.GatewayBean) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L87
        L62:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = r9.getServer()
            java.lang.String r2 = r10.getAccessToken()
            r8.m6139y(r11, r2)
            com.zykj.huiwei.launcher.repository.UserRepository r11 = r8.userRepository
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.f7193a = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.f7194b = r2
            r0.f7198f = r6
            java.lang.Object r11 = r11.m5436e(r0)
            if (r11 != r1) goto L87
            goto Lca
        L87:
            com.zykj.huiwei.launcher.bean.StudentInfoBean r11 = (com.zykj.huiwei.launcher.bean.StudentInfoBean) r11
            androidx.datastore.core.DataStore r2 = r8.userDataStore
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$2 r6 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$2
            r6.<init>(r11, r3)
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.f7193a = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.f7194b = r7
            r0.f7195c = r11
            r0.f7198f = r5
            java.lang.Object r2 = r2.updateData(r6, r0)
            if (r2 != r1) goto La7
            goto Lca
        La7:
            r2 = r9
            r9 = r11
        La9:
            androidx.datastore.core.DataStore r11 = r8.studentDataStore
            com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$3 r5 = new com.zykj.huiwei.launcher.viewmodels.LoginViewModel$updateUserCache$3
            r5.<init>(r9, r3)
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.f7193a = r2
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.f7194b = r10
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.f7195c = r9
            r0.f7198f = r4
            java.lang.Object r9 = r11.updateData(r5, r0)
            if (r9 != r1) goto Lcb
        Lca:
            return r1
        Lcb:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.LoginViewModel.m6140z(com.zykj.huiwei.launcher.bean.resp.GatewayBean, com.zykj.huiwei.launcher.bean.resp.LoginResp, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/LoginViewModel.smali:2318
    }
}
