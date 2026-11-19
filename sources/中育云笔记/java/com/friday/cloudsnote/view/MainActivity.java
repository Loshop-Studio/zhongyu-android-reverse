package com.friday.cloudsnote.view;

import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PathUtils;
import com.friday.cloudsnote.R;
import com.friday.cloudsnote.databinding.MainActivityBinding;
import com.friday.cloudsnote.view.MainActivity;
import com.friday.cloudsnote.viewModel.MainViewModel;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.huawei.hms.framework.common.BundleUtil;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.policy.ext.PolicyHelper;
import java.io.File;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9983y;
import p158g2.C9261a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9804v;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/app/MainActivity")
/* loaded from: classes3.dex */
public final class MainActivity extends Hilt_MainActivity<MainActivityBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f5501g;

    @InterfaceC11829d(m26210c = "com.friday.cloudsnote.view.MainActivity$initData$1", m26211f = "MainActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.cloudsnote.view.MainActivity$initData$1 */
    public static final class C59161 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f5506c;

        public C59161(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        /* renamed from: p */
        public static final C10786q m4731p(MainActivity mainActivity, ServerInfo serverInfo) {
            if (serverInfo.m16567b() == Status.LOGIN) {
                mainActivity.m4727O().m4737h(serverInfo);
                UserInfo userInfoMo16541d = MessageClient.f19777c.mo16541d();
                if (userInfoMo16541d != null) {
                    mainActivity.m4727O().m4736g(userInfoMo16541d);
                    CrashReport.setUserId(userInfoMo16541d.m16576g() + BundleUtil.UNDERLINE_TAG + userInfoMo16541d.m16577h());
                    LogUtils.Config config = LogUtils.getConfig();
                    String externalAppFilesPath = PathUtils.getExternalAppFilesPath();
                    String str = File.separator;
                    config.setDir(externalAppFilesPath + str + "log" + str + userInfoMo16541d.m16573a() + str);
                    mainActivity.m4727O().m4738i();
                }
                AbstractC9804v.f23002a.m19815a("StudentLogin");
                C5963c.f6084a.m5308c();
            }
            return C10786q.f26013a;
        }

        /* renamed from: t */
        public static final C10786q m4732t() {
            ActivityUtils.finishAllActivities();
            return C10786q.f26013a;
        }

        /* renamed from: v */
        public static final C10786q m4733v(MainActivity mainActivity) {
            if (C5962b.f6082a.m5299a().m5296x()) {
                C5963c.f6084a.m5320u();
            } else {
                C5963c.f6084a.m5310f();
            }
            mainActivity.finish();
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return MainActivity.this.new C59161(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f5506c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC9804v.f23002a.m19815a("HotLaunch");
            if (C9261a.f21604a.m18258a()) {
                MessageClient messageClient = MessageClient.f19777c;
                final MainActivity mainActivity = MainActivity.this;
                messageClient.mo16540c(new InterfaceC9540l() { // from class: com.friday.cloudsnote.view.a
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj2) {
                        return MainActivity.C59161.m4731p(mainActivity, (ServerInfo) obj2);
                    }
                });
            } else {
                PolicyHelper.Builder builderM16592d = new PolicyHelper.Builder(MainActivity.this).m16595g("https://web.alicdn.zykj.org/privacypolicy/cloudnote/userServiceAgreement.html").m16594f("https://web.alicdn.zykj.org/privacypolicy/cloudnote/userPrivacyPolicy.html").m16592d(new InterfaceC9529a() { // from class: com.friday.cloudsnote.view.b
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return MainActivity.C59161.m4732t();
                    }
                });
                final MainActivity mainActivity2 = MainActivity.this;
                builderM16592d.m16593e(new InterfaceC9529a() { // from class: com.friday.cloudsnote.view.c
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return MainActivity.C59161.m4733v(mainActivity2);
                    }
                }).m16597i();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C59161) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public MainActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f5501g = new ViewModelLazy(AbstractC9983y.m20315b(MainViewModel.class), new InterfaceC9529a() { // from class: com.friday.cloudsnote.view.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.cloudsnote.view.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.cloudsnote.view.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: O */
    public final MainViewModel m4727O() {
        return (MainViewModel) this.f5501g.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R.layout.main_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        if ((getIntent().getFlags() & 4194304) > 0) {
            finish();
        } else {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C59161(null), 3, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.friday.cloudsnote.view.Hilt_MainActivity, com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        super.onCreate(bundle);
    }
}
