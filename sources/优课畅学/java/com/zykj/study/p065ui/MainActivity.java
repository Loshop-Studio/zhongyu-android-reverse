package com.zykj.study.p065ui;

import android.app.ActivityManager;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavDestination;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.message.client.MessageClient;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.ActivityMainBinding;
import com.zykj.study.p065ui.MainActivity;
import com.zykj.study.viewmodels.NotifyDataChangedViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8836g;
import p135i8.AbstractC8839h;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MainActivity extends Hilt_MainActivity<ActivityMainBinding> {

    /* renamed from: e */
    public InterfaceC9270g f11593e;

    /* renamed from: f */
    public InterfaceC9270g f11594f;

    /* renamed from: g */
    public final InterfaceC8724d f11595g;

    /* renamed from: h */
    public final InterfaceC8724d f11596h;

    /* renamed from: i */
    public final InterfaceC8724d f11597i = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: u4.e
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return MainActivity.m10434B(this.f20308a);
        }
    });

    /* renamed from: j */
    public final InterfaceC8724d f11598j = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: u4.f
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return MainActivity.m10438N(this.f20309a);
        }
    });

    public MainActivity() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f11595g = new ViewModelLazy(AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        this.f11596h = new ViewModelLazy(AbstractC9137y.m16154b(NotifyDataChangedViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.MainActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainActivity$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: B */
    public static final MaterialDialog m10434B(MainActivity mainActivity) {
        return (MaterialDialog) AbstractC8836g.m14852b(null, new MainActivity$deauthorizedDialog$2$1(mainActivity, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final LoginViewModel m10435H() {
        return (LoginViewModel) this.f11595g.getValue();
    }

    /* renamed from: I */
    public static final C8736p m10436I(MainActivity mainActivity) {
        Object systemService = mainActivity.getBaseContext().getApplicationContext().getSystemService("activity");
        AbstractC9133u.m16131e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        AbstractC9133u.m16130d(appTasks);
        Iterator<T> it = appTasks.iterator();
        while (it.hasNext()) {
            ((ActivityManager.AppTask) it.next()).finishAndRemoveTask();
        }
        return C8736p.f16368a;
    }

    /* renamed from: J */
    public static final C8736p m10437J() {
        return C8736p.f16368a;
    }

    /* renamed from: N */
    public static final MaterialDialog m10438N(final MainActivity mainActivity) {
        return new MaterialDialog.C6913g(mainActivity).m6736G(R$string.hint).m6747h(com.zykj.lib.error.code.R$string.net_token_error).m6765z(R$string.got_it).m6744e(false).m6745f(false).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: u4.g
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                MainActivity.m10439O(this.f20310a, materialDialog, dialogAction);
            }
        }).m6742c();
    }

    /* renamed from: O */
    public static final void m10439O(MainActivity mainActivity, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        mainActivity.m10456M();
    }

    /* renamed from: C */
    public final MaterialDialog m10449C() {
        return (MaterialDialog) this.f11597i.getValue();
    }

    /* renamed from: D */
    public final InterfaceC9270g m10450D() {
        InterfaceC9270g interfaceC9270g = this.f11594f;
        if (interfaceC9270g != null) {
            return interfaceC9270g;
        }
        AbstractC9133u.m16151y("lessonDeauthorizedFlow");
        return null;
    }

    /* renamed from: E */
    public final NotifyDataChangedViewModel m10451E() {
        return (NotifyDataChangedViewModel) this.f11596h.getValue();
    }

    /* renamed from: F */
    public final MaterialDialog m10452F() {
        Object value = this.f11598j.getValue();
        AbstractC9133u.m16132f(value, "getValue(...)");
        return (MaterialDialog) value;
    }

    /* renamed from: G */
    public final InterfaceC9270g m10453G() {
        InterfaceC9270g interfaceC9270g = this.f11593e;
        if (interfaceC9270g != null) {
            return interfaceC9270g;
        }
        AbstractC9133u.m16151y("unauthorizedFlow");
        return null;
    }

    /* renamed from: K */
    public final void m10454K() {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$observeAuthFail$1(this, null), 3, null);
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$observeAuthFail$2(this, null), 3, null);
    }

    /* renamed from: L */
    public final void m10455L() {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$observeLogout$1(this, null), 3, null);
    }

    /* renamed from: M */
    public final void m10456M() {
        NavDestination currentDestination = ActivityKt.findNavController(this, R$id.nav_host_fragment).getCurrentDestination();
        if (currentDestination != null) {
            ActivityKt.findNavController(this, R$id.nav_host_fragment).popBackStack(currentDestination.getId(), true);
        }
        ActivityKt.findNavController(this, R$id.nav_host_fragment).navigate(R$id.action_global_mainFragment);
    }

    @Override // com.zykj.base.BaseActivity
    public Object initData(InterfaceC9324c interfaceC9324c) {
        m10454K();
        m10455L();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseActivity
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        if (!MessageClient.f10416a.mo9574g()) {
            new PolicyHelper.Builder(this).m9730g("https://web.alicdn.zykj.org/privacypolicy/selfStudy/userServiceAgreement.html").m9729f("https://web.alicdn.zykj.org/privacypolicy/selfStudy/userPrivacyPolicy.html").m9727d(new InterfaceC10559a() { // from class: u4.c
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return MainActivity.m10436I(this.f20307a);
                }
            }).m9728e(new InterfaceC10559a() { // from class: u4.d
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return MainActivity.m10437J();
                }
            }).m9732i();
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseActivity
    public int layoutId() {
        return R$layout.activity_main;
    }

    @Override // com.zykj.study.p065ui.Hilt_MainActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (m10452F().isShowing()) {
            m10452F().dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        return ActivityKt.findNavController(this, R$id.nav_host_fragment).navigateUp();
    }
}
