package com.zykj.huiwei.launcher.viewmodels;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.bean.resp.VersionInfo;
import com.zykj.huiwei.launcher.ext.ViewModelExtKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import p078i4.AbstractC6537g;
import p119o1.InterfaceC7516a;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR%\u0010+\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b*\u0010\u001eR%\u0010.\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010,0,0\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b-\u0010\u001eR%\u00100\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b/\u0010\u001eR%\u00103\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR%\u00105\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b4\u0010\u001eR%\u00108\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006¢\u0006\f\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001eR\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u001b8\u0006¢\u0006\f\n\u0004\b:\u0010\u001c\u001a\u0004\b6\u0010\u001eR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b1\u0010\u001eR\u001f\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130=8\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b&\u0010?R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0A8\u0006¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\b:\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010F¨\u0006H"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;", "Lcom/zykj/base/BaseViewModel;", "<init>", "()V", "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;", "versionInfo", "", "w", "(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V", "a", "Landroid/app/Activity;", "activity", "c", "(Landroid/app/Activity;)V", "d", "", "p", "()Z", "v", "Lo1/a;", "iCheckAppUpdate", "", "packageName", "b", "(Lo1/a;Ljava/lang/String;)V", "o", "(Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "m", "()Landroidx/lifecycle/MutableLiveData;", "title", "n", "version", "h", "content", "f", "cancel", "e", "g", "confirm", "kotlin.jvm.PlatformType", "u", "isShowProgress", "", "j", "progress", "t", "isShowContent", "i", "r", "isShowClose", "q", "isShowCancel", "k", "s", "isShowConfirm", "Ljava/util/UUID;", "l", "requestId", "downloadSuccess", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "appStoreService", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "showUpdateSharedFlow", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "connection", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAppUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpdateViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,163:1\n49#2:164\n51#2:168\n46#3:165\n51#3:167\n105#4:166\n*S KotlinDebug\n*F\n+ 1 AppUpdateViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel\n*L\n68#1:164\n68#1:168\n68#1:165\n68#1:167\n68#1:166\n*E\n"})
/* loaded from: classes4.dex */
public final class AppUpdateViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableLiveData title = new MutableLiveData();

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableLiveData version = new MutableLiveData();

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableLiveData content = new MutableLiveData();

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData cancel = new MutableLiveData();

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableLiveData confirm = new MutableLiveData();

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableLiveData isShowProgress = new MutableLiveData(Boolean.FALSE);

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData progress = new MutableLiveData(Float.valueOf(0.0f));

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableLiveData isShowContent;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableLiveData isShowClose;

    /* renamed from: j, reason: from kotlin metadata */
    public final MutableLiveData isShowCancel;

    /* renamed from: k, reason: from kotlin metadata */
    public final MutableLiveData isShowConfirm;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableLiveData requestId;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableLiveData downloadSuccess;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableStateFlow appStoreService;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableSharedFlow showUpdateSharedFlow;

    /* renamed from: p, reason: from kotlin metadata */
    public final ServiceConnection connection;

    /* renamed from: com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$a */
    public static final class ServiceConnectionC6176a implements ServiceConnection {
        public ServiceConnectionC6176a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AppUpdateViewModel.this.getAppStoreService().setValue(InterfaceC7516a.a.m8671p(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Inject
    public AppUpdateViewModel() {
        Boolean bool = Boolean.TRUE;
        this.isShowContent = new MutableLiveData(bool);
        this.isShowClose = new MutableLiveData(bool);
        this.isShowCancel = new MutableLiveData(bool);
        this.isShowConfirm = new MutableLiveData(bool);
        this.requestId = new MutableLiveData();
        this.downloadSuccess = new MutableLiveData();
        this.appStoreService = StateFlowKt.MutableStateFlow(null);
        this.showUpdateSharedFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.connection = new ServiceConnectionC6176a();
    }

    /* renamed from: a */
    public final void m6018a(VersionInfo versionInfo) {
        Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
        ViewModelExtKt.m5324g(this, FlowKt.flow(new AppUpdateViewModel$checkDownloadSuccess$1(versionInfo, null)), null, null, null, new AppUpdateViewModel$checkDownloadSuccess$2(this, null), 14, null);
    }

    /* renamed from: b */
    public final void m6019b(InterfaceC7516a iCheckAppUpdate, String packageName) {
        Intrinsics.checkNotNullParameter(iCheckAppUpdate, "iCheckAppUpdate");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AppUpdateViewModel$checkUpdate$1(iCheckAppUpdate, packageName, this, null), 2, null);
    }

    /* renamed from: c */
    public final void m6020c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (m6033p()) {
            Intent intent = new Intent();
            intent.setPackage("cn.com.techvision.appstore");
            intent.setAction("cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE");
            activity.bindService(intent, this.connection, 1);
        }
    }

    /* renamed from: d */
    public final void m6021d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (m6033p()) {
            activity.unbindService(this.connection);
        }
    }

    /* renamed from: e, reason: from getter */
    public final MutableStateFlow getAppStoreService() {
        return this.appStoreService;
    }

    /* renamed from: f, reason: from getter */
    public final MutableLiveData getCancel() {
        return this.cancel;
    }

    /* renamed from: g, reason: from getter */
    public final MutableLiveData getConfirm() {
        return this.confirm;
    }

    /* renamed from: h, reason: from getter */
    public final MutableLiveData getContent() {
        return this.content;
    }

    /* renamed from: i, reason: from getter */
    public final MutableLiveData getDownloadSuccess() {
        return this.downloadSuccess;
    }

    /* renamed from: j, reason: from getter */
    public final MutableLiveData getProgress() {
        return this.progress;
    }

    /* renamed from: k, reason: from getter */
    public final MutableLiveData getRequestId() {
        return this.requestId;
    }

    /* renamed from: l, reason: from getter */
    public final MutableSharedFlow getShowUpdateSharedFlow() {
        return this.showUpdateSharedFlow;
    }

    /* renamed from: m, reason: from getter */
    public final MutableLiveData getTitle() {
        return this.title;
    }

    /* renamed from: n, reason: from getter */
    public final MutableLiveData getVersion() {
        return this.version;
    }

    /* renamed from: o */
    public final void m6032o(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AppUpdateViewModel$gotoUpdate$1(this, packageName, null), 2, null);
    }

    /* renamed from: p */
    public final boolean m6033p() {
        return AbstractC6537g.f8372a.m7315f("cn.com.techvision.appstore");
    }

    /* renamed from: q, reason: from getter */
    public final MutableLiveData getIsShowCancel() {
        return this.isShowCancel;
    }

    /* renamed from: r, reason: from getter */
    public final MutableLiveData getIsShowClose() {
        return this.isShowClose;
    }

    /* renamed from: s, reason: from getter */
    public final MutableLiveData getIsShowConfirm() {
        return this.isShowConfirm;
    }

    /* renamed from: t, reason: from getter */
    public final MutableLiveData getIsShowContent() {
        return this.isShowContent;
    }

    /* renamed from: u, reason: from getter */
    public final MutableLiveData getIsShowProgress() {
        return this.isShowProgress;
    }

    /* renamed from: v */
    public final void m6039v() {
    }

    /* renamed from: w */
    public final void m6040w(final VersionInfo versionInfo) {
        Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
        final Flow flowFlowOf = FlowKt.flowOf(versionInfo);
        ViewModelExtKt.m5322e(this, new Flow() { // from class: com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$startDownload$$inlined$map$1

            /* renamed from: com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$startDownload$$inlined$map$1$2 */
            public static final class C61752 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f6934a;

                /* renamed from: b */
                public final /* synthetic */ VersionInfo f6935b;

                /* renamed from: c */
                public final /* synthetic */ AppUpdateViewModel f6936c;

                @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$startDownload$$inlined$map$1$2", m7918f = "AppUpdateViewModel.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m7920l = {54, 50}, m7921m = "emit", m7922n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "downloadProxy", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-AppUpdateViewModel$startDownload$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$startDownload$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f6937a;

                    /* renamed from: b */
                    public int f6938b;

                    /* renamed from: c */
                    public Object f6939c;

                    /* renamed from: e */
                    public Object f6941e;

                    /* renamed from: f */
                    public Object f6942f;

                    /* renamed from: g */
                    public Object f6943g;

                    /* renamed from: h */
                    public Object f6944h;

                    /* renamed from: i */
                    public Object f6945i;

                    /* renamed from: j */
                    public Object f6946j;

                    /* renamed from: k */
                    public Object f6947k;

                    /* renamed from: l */
                    public int f6948l;

                    /* renamed from: m */
                    public int f6949m;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f6937a = obj;
                        this.f6938b |= Integer.MIN_VALUE;
                        return C61752.this.emit(null, this);
                    }
                }

                public C61752(FlowCollector flowCollector, VersionInfo versionInfo, AppUpdateViewModel appUpdateViewModel) {
                    this.f6934a = flowCollector;
                    this.f6935b = versionInfo;
                    this.f6936c = appUpdateViewModel;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x015a, code lost:
                
                    if (r6.emit(r1, r2) == r3) goto L26;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r21, kotlin.coroutines.Continuation r22) {
                    /*
                        Method dump skipped, instructions count: 352
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$startDownload$$inlined$map$1.C61752.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2.smali:45
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowFlowOf.collect(new C61752(flowCollector, versionInfo, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, null, null, null, null, 30, null);
    }
}
