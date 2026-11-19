package com.friday.main.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.activity.RequestScreenCastActivity;
import com.friday.common.classtest.ScreencastResponse;
import com.friday.common.entity.EventBusKey;
import com.friday.common.helper.C5962b;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.friday.common.widget.dialog.FBIWarningDialog;
import com.friday.main.R$dimen;
import com.friday.main.R$drawable;
import com.friday.main.R$layout;
import com.friday.main.R$mipmap;
import com.friday.main.R$string;
import com.friday.main.adapter.TabAdapter;
import com.friday.main.databinding.HomeActivityBinding;
import com.friday.main.databinding.PopupWindowCreateNewBinding;
import com.friday.main.model.VersionUpdate;
import com.friday.main.view.HomeActivity;
import com.friday.main.viewmodel.HomeViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC9923a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.coroutines.InterfaceC10045g;
import p119db.AbstractBinderC9014b;
import p126e2.AbstractC9073b;
import p126e2.C9072a;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p200j2.InterfaceC9662b;
import p200j2.InterfaceC9663c;
import p200j2.InterfaceC9665e;
import p200j2.InterfaceC9666f;
import p200j2.InterfaceC9668h;
import p200j2.InterfaceC9669i;
import p200j2.InterfaceC9670j;
import p215k2.AbstractC9795m;
import p215k2.AbstractC9804v;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p331s3.C11053a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/main/HomeActivity")
/* loaded from: classes4.dex */
public final class HomeActivity extends Hilt_HomeActivity<HomeActivityBinding> {

    /* renamed from: v */
    public static final C6210a f9356v = new C6210a(null);

    /* renamed from: w */
    public static final int f9357w = 8;

    /* renamed from: x */
    public static final ArrayList f9358x = AbstractC10978w.m24129g(new C11053a(R$mipmap.icon_new_selected, R$mipmap.icon_new_notselect, AbstractC11958b.m26585f(R$string.newest), false), new C11053a(R$mipmap.icon_folder_selected, R$mipmap.icon_folder_notselect, AbstractC11958b.m26585f(R$string.folder), false), new C11053a(R$mipmap.icon_share_select, R$mipmap.icon_share_normal, AbstractC11958b.m26585f(R$string.share_title), false), new C11053a(R$drawable.icon_recycle_bin, R$drawable.icon_recycle_bin_unselected, AbstractC11958b.m26585f(R$string.recycle_bin), false));

    /* renamed from: g */
    public final InterfaceC10773d f9359g;

    /* renamed from: j */
    public InterfaceC9670j f9362j;

    /* renamed from: k */
    public InterfaceC9663c f9363k;

    /* renamed from: l */
    public InterfaceC9666f f9364l;

    /* renamed from: m */
    public InterfaceC9662b f9365m;

    /* renamed from: n */
    public InterfaceC9665e f9366n;

    /* renamed from: o */
    public InterfaceC9669i f9367o;

    /* renamed from: p */
    public InterfaceC9668h f9368p;

    /* renamed from: r */
    public InterfaceC10045g f9370r;

    /* renamed from: u */
    public long f9373u;

    /* renamed from: h */
    public final InterfaceC10773d f9360h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: v3.k1
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return HomeActivity.m7111V0();
        }
    });

    /* renamed from: i */
    public final long f9361i = C5962b.f6082a.m5299a().m5292t();

    /* renamed from: q */
    public final HomeActivity$messageServerListener$1 f9369q = new AbstractBinderC9014b() { // from class: com.friday.main.view.HomeActivity$messageServerListener$1
        @Override // p135eb.InterfaceC9114a
        /* renamed from: i */
        public void mo7150i(ServerInfo serverInfo) {
            if ((serverInfo != null ? serverInfo.m16567b() : null) == Status.LOGIN) {
                this.f9410b.m7142w0().m7267z(serverInfo);
            } else {
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this.f9410b), null, null, new HomeActivity$messageServerListener$1$serverInfoUpdate$1(this.f9410b, null), 3, null);
            }
        }
    };

    /* renamed from: s */
    public final InterfaceC10773d f9371s = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: v3.l1
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return HomeActivity.m7098N0(this.f27345c);
        }
    });

    /* renamed from: t */
    public final ActivityResultLauncher f9372t = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: v3.m1
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            HomeActivity.m7096M0(this.f27348a, (ActivityResult) obj);
        }
    });

    /* renamed from: com.friday.main.view.HomeActivity$a */
    public static final class C6210a {
        public /* synthetic */ C6210a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6210a() {
        }
    }

    /* renamed from: com.friday.main.view.HomeActivity$b */
    public static final class C6211b implements NetworkUtils.OnNetworkStatusChangedListener {
        public C6211b() {
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.OnNetworkStatusChangedListener
        public void onConnected(NetworkUtils.NetworkType networkType) {
            HomeViewModel homeViewModelM7142w0 = HomeActivity.this.m7142w0();
            String packageName = HomeActivity.this.getPackageName();
            AbstractC9979u.m20293f(packageName, "getPackageName(...)");
            homeViewModelM7142w0.m7255m(packageName);
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.OnNetworkStatusChangedListener
        public void onDisconnected() {
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$onResume$1", m26211f = "HomeActivity.kt", m26212l = {218, 219}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.HomeActivity$onResume$1 */
    public static final class C62151 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9413c;

        public C62151(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return HomeActivity.this.new C62151(interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r6.m7254l(r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r5.f9413c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r6)
                goto L3b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.AbstractC9924b.m20071b(r6)
                goto L2c
            L1e:
                kotlin.AbstractC9924b.m20071b(r6)
                r5.f9413c = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.m20376b(r3, r5)
                if (r6 != r0) goto L2c
                goto L3a
            L2c:
                com.friday.main.view.HomeActivity r6 = com.friday.main.view.HomeActivity.this
                com.friday.main.viewmodel.HomeViewModel r6 = com.friday.main.view.HomeActivity.m7123h0(r6)
                r5.f9413c = r2
                java.lang.Object r6 = r6.m7254l(r5)
                if (r6 != r0) goto L3b
            L3a:
                return r0
            L3b:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.HomeActivity.C62151.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/HomeActivity$onResume$1.smali:119
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62151) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.friday.main.view.HomeActivity$messageServerListener$1] */
    public HomeActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9359g = new ViewModelLazy(AbstractC9983y.m20315b(HomeViewModel.class), new InterfaceC9529a() { // from class: com.friday.main.view.HomeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.HomeActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.HomeActivity$special$$inlined$viewModels$default$3
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

    /* renamed from: A0 */
    private final void m7085A0() {
        LiveEventBus.get("checkTab", Integer.TYPE).observe(this, new Observer() { // from class: v3.q1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7092H0(this.f27368c, (Integer) obj);
            }
        });
        LiveEventBus.get("mqttServiceStatus", Boolean.TYPE).observe(this, new Observer() { // from class: v3.r1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7093I0(this.f27371c, (Boolean) obj);
            }
        });
        LiveEventBus.get("stopScreencastByPc").observe(this, new Observer() { // from class: v3.s1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7094J0(this.f27375c, obj);
            }
        });
        LiveEventBus.get("stopApplicationByPc").observe(this, new Observer() { // from class: v3.b1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7086B0(this.f27300c, obj);
            }
        });
        LiveEventBus.get("StartScreencast", String.class).observe(this, new Observer() { // from class: v3.c1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7087C0(this.f27306c, (String) obj);
            }
        });
        LiveEventBus.get("IntranetMqttConnected").observe(this, new Observer() { // from class: v3.d1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7088D0(this.f27310c, obj);
            }
        });
        LiveEventBus.get("StopScreencast", Object.class).observe(this, new Observer() { // from class: v3.e1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7089E0(this.f27314c, obj);
            }
        });
        AbstractC9073b.m17876a(m7142w0().m7263v(), this, new InterfaceC9540l() { // from class: v3.f1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return HomeActivity.m7090F0(this.f27320c, (VersionUpdate) obj);
            }
        });
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeActivity$initObserver$9(this, null), 3, null);
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeActivity$initObserver$10(this, null), 3, null);
        LiveEventBus.get("EndInClassTest").observe(this, new Observer() { // from class: v3.g1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeActivity.m7091G0(this.f27323c, obj);
            }
        });
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeActivity$initObserver$12(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B0 */
    public static final void m7086B0(HomeActivity homeActivity, Object obj) {
        Object next;
        if (homeActivity.m7142w0().m7265x()) {
            if (homeActivity.m7139t0().mo104e()) {
                homeActivity.m7139t0().mo101b();
            } else {
                List<Activity> activityList = ActivityUtils.getActivityList();
                AbstractC9979u.m20293f(activityList, "getActivityList(...)");
                Iterator<T> it = activityList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (AbstractC9979u.m20289b(((Activity) next).getClass().getSimpleName(), RequestScreenCastActivity.class.getSimpleName())) {
                            break;
                        }
                    }
                }
                Activity activity = (Activity) next;
                if (activity != null) {
                    ActivityUtils.finishActivity(activity);
                }
            }
            AbstractC11958b.m26588i("已离开课堂");
        } else {
            homeActivity.m7139t0().mo102c();
            homeActivity.m7139t0().mo103d(false);
            AbstractC11958b.m26588i("投屏已断开");
        }
        homeActivity.m7138s0().mo97e(homeActivity);
        ((HomeActivityBinding) homeActivity.getMBinding()).f9187e.setSelected(false);
        homeActivity.m7138s0().mo94b();
        homeActivity.m7138s0().mo95c();
        homeActivity.m7139t0().mo100a();
    }

    /* renamed from: C0 */
    public static final void m7087C0(HomeActivity homeActivity, String str) {
        ScreencastResponse screencastResponse = (ScreencastResponse) GsonUtils.fromJson(str, ScreencastResponse.class);
        if (!C5962b.f6082a.m5299a().m5294v()) {
            LiveEventBus.get(EventBusKey.RESTART_RECORD_SERVICE).post(null);
        } else {
            if (ScreenUtils.isScreenLock() || homeActivity.m7138s0().mo96d()) {
                return;
            }
            Intent intent = new Intent(homeActivity.getBaseContext(), (Class<?>) RequestScreenCastActivity.class);
            intent.putExtra("key_port", screencastResponse.getPort());
            ActivityUtils.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D0 */
    public static final void m7088D0(HomeActivity homeActivity, Object obj) {
        ((HomeActivityBinding) homeActivity.getMBinding()).f9187e.setSelected(true);
    }

    /* renamed from: E0 */
    public static final void m7089E0(HomeActivity homeActivity, Object obj) {
        Object obj2 = null;
        if (!homeActivity.m7142w0().m7265x()) {
            LiveEventBus.get(EventBusKey.PAUSE_RECORD_SERVICE).post(null);
            return;
        }
        if (homeActivity.m7139t0().mo104e()) {
            homeActivity.m7139t0().mo101b();
            homeActivity.m7138s0().mo95c();
            AbstractC11958b.m26583d("演示已结束");
            return;
        }
        List<Activity> activityList = ActivityUtils.getActivityList();
        AbstractC9979u.m20293f(activityList, "getActivityList(...)");
        Iterator<T> it = activityList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC9979u.m20289b(((Activity) next).getClass().getSimpleName(), RequestScreenCastActivity.class.getSimpleName())) {
                obj2 = next;
                break;
            }
        }
        Activity activity = (Activity) obj2;
        if (activity != null) {
            ActivityUtils.finishActivity(activity);
        }
    }

    /* renamed from: F0 */
    public static final C10786q m7090F0(HomeActivity homeActivity, VersionUpdate it) {
        AbstractC9979u.m20294g(it, "it");
        AppUpdateDialog appUpdateDialog = new AppUpdateDialog();
        FragmentManager supportFragmentManager = homeActivity.getSupportFragmentManager();
        AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
        appUpdateDialog.show(supportFragmentManager, AppUpdateDialog.class.getSimpleName());
        return C10786q.f26013a;
    }

    /* renamed from: G0 */
    public static final void m7091G0(HomeActivity homeActivity, Object obj) {
        if (!homeActivity.m7142w0().m7265x()) {
            homeActivity.m7139t0().mo102c();
            homeActivity.m7139t0().mo103d(false);
        }
        homeActivity.m7138s0().mo97e(homeActivity);
        homeActivity.m7138s0().mo94b();
        homeActivity.m7138s0().mo95c();
        homeActivity.m7139t0().mo101b();
        homeActivity.m7139t0().mo100a();
    }

    /* renamed from: H0 */
    public static final void m7092H0(HomeActivity homeActivity, Integer num) {
        AbstractC9979u.m20291d(num);
        int iIntValue = num.intValue();
        if (iIntValue < 0 || iIntValue >= 4) {
            return;
        }
        homeActivity.m7144y0().m6938m(num.intValue(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I0 */
    public static final void m7093I0(HomeActivity homeActivity, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        if (!homeActivity.m7142w0().m7265x()) {
            homeActivity.m7139t0().mo102c();
            homeActivity.m7139t0().mo103d(false);
        } else if (homeActivity.m7139t0().mo104e()) {
            homeActivity.m7139t0().mo101b();
            homeActivity.m7138s0().mo95c();
        }
        homeActivity.m7138s0().mo97e(homeActivity);
        ((HomeActivityBinding) homeActivity.getMBinding()).f9187e.setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J0 */
    public static final void m7094J0(HomeActivity homeActivity, Object obj) {
        Object next;
        if (!homeActivity.m7142w0().m7265x()) {
            AbstractC11958b.m26588i("投屏已断开");
            homeActivity.m7139t0().mo102c();
            homeActivity.m7139t0().mo103d(false);
            homeActivity.m7138s0().mo97e(homeActivity);
            ((HomeActivityBinding) homeActivity.getMBinding()).f9187e.setSelected(false);
            homeActivity.m7138s0().mo94b();
            homeActivity.m7138s0().mo95c();
            homeActivity.m7139t0().mo100a();
            return;
        }
        if (homeActivity.m7139t0().mo104e()) {
            homeActivity.m7139t0().mo101b();
            homeActivity.m7138s0().mo95c();
            return;
        }
        List<Activity> activityList = ActivityUtils.getActivityList();
        AbstractC9979u.m20293f(activityList, "getActivityList(...)");
        Iterator<T> it = activityList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC9979u.m20289b(((Activity) next).getClass().getSimpleName(), RequestScreenCastActivity.class.getSimpleName())) {
                    break;
                }
            }
        }
        Activity activity = (Activity) next;
        if (activity != null) {
            ActivityUtils.finishActivity(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L0 */
    public static final C10786q m7095L0(HomeActivity homeActivity, int i10, boolean z10) {
        ((HomeActivityBinding) homeActivity.getMBinding()).f9186d.f9204f.setSelected(false);
        homeActivity.m7131T0(i10, z10);
        return C10786q.f26013a;
    }

    /* renamed from: M0 */
    public static final void m7096M0(HomeActivity homeActivity, ActivityResult it) {
        AbstractC9979u.m20294g(it, "it");
        if (Settings.canDrawOverlays(homeActivity)) {
            homeActivity.m7138s0().mo98f(homeActivity);
        } else {
            AbstractC11958b.m26583d("随堂测功能需要悬浮窗权限");
        }
    }

    /* renamed from: N0 */
    public static final C6211b m7098N0(HomeActivity homeActivity) {
        return homeActivity.new C6211b();
    }

    /* renamed from: O0 */
    public static final C10786q m7100O0(final HomeActivity homeActivity, View view, final PopupWindow popupWindow, PopupWindowCreateNewBinding binding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(binding, "binding");
        binding.f9210c.setOnClickListener(new View.OnClickListener() { // from class: v3.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeActivity.m7102P0(this.f27357c, popupWindow, view2);
            }
        });
        binding.f9211d.setOnClickListener(new View.OnClickListener() { // from class: v3.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeActivity.m7104Q0(this.f27362c, popupWindow, view2);
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: P0 */
    public static final void m7102P0(HomeActivity homeActivity, PopupWindow popupWindow, View view) {
        AbstractC9804v.f23002a.m19815a("NewFolder");
        homeActivity.m7132j0(popupWindow);
    }

    /* renamed from: Q0 */
    public static final void m7104Q0(HomeActivity homeActivity, PopupWindow popupWindow, View view) {
        AbstractC9804v.f23002a.m19815a("NewNote");
        homeActivity.m7133l0(popupWindow);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m7109U0(HomeActivity homeActivity, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        homeActivity.m7131T0(i10, z10);
    }

    /* renamed from: V0 */
    public static final TabAdapter m7111V0() {
        return new TabAdapter();
    }

    /* renamed from: k0 */
    public static final C10786q m7125k0(HomeActivity homeActivity, String name) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(homeActivity), null, null, new HomeActivity$createNewFolder$createDialog$1$1(homeActivity, name, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: m0 */
    public static final C10786q m7126m0(HomeActivity homeActivity, String name) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(homeActivity), null, null, new HomeActivity$createNewNote$createDialog$1$1(homeActivity, name, null), 3, null);
        return C10786q.f26013a;
    }

    /* renamed from: p0 */
    public static final void m7127p0(HomeActivity homeActivity, View view) {
        homeActivity.startActivity(new Intent(homeActivity.getBaseContext(), (Class<?>) DBActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    public final void m7128K0() {
        final RecyclerView recyclerView = ((HomeActivityBinding) getMBinding()).f9186d.f9205g;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        m7144y0().m6939o(new InterfaceC9544p() { // from class: v3.a1
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return HomeActivity.m7095L0(this.f27291c, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            }
        });
        m7144y0().setList(f9358x);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.main.view.HomeActivity$initTab$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                int childLayoutPosition = parent.getChildLayoutPosition(view);
                RecyclerView.Adapter adapter = parent.getAdapter();
                if ((adapter != null ? Integer.valueOf(adapter.getItemCount()) : null) == null || childLayoutPosition != r4.intValue() - 1) {
                    outRect.bottom = (int) recyclerView.getResources().getDimension(R$dimen.view_21);
                }
            }
        });
        recyclerView.setAdapter(m7144y0());
    }

    /* renamed from: R0 */
    public final void m7129R0() {
        Uri uri = Uri.parse("package:" + getPackageName());
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", uri);
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri);
        if (intent.resolveActivity(getPackageManager()) == null) {
            if (intent2.resolveActivity(getPackageManager()) == null) {
                ToastUtils.showShort("无法打开系统设置，请手动开启悬浮窗权限", new Object[0]);
                return;
            }
            intent = intent2;
        }
        try {
            this.f9372t.launch(intent);
        } catch (ActivityNotFoundException unused) {
            ToastUtils.showShort("无法打开系统设置，请手动开启悬浮窗权限", new Object[0]);
        } catch (SecurityException unused2) {
            ToastUtils.showShort("无法打开系统设置，请手动开启悬浮窗权限", new Object[0]);
        }
    }

    /* renamed from: S0 */
    public final void m7130S0(boolean z10) {
        if (z10) {
            NetworkUtils.registerNetworkStatusChangedListener(m7143x0());
        } else {
            NetworkUtils.unregisterNetworkStatusChangedListener(m7143x0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T0 */
    public final void m7131T0(int i10, boolean z10) {
        if (i10 == 0) {
            AbstractC9804v.f23002a.m19815a("Recent");
        } else if (i10 == 1) {
            AbstractC9804v.f23002a.m19815a("Folder");
        } else if (i10 == 2) {
            AbstractC9804v.f23002a.m19815a("Share");
        } else if (i10 == 4) {
            AbstractC9804v.f23002a.m19815a("Me");
        }
        m7136q0().mo5876j();
        m7137r0().mo5876j();
        if (m7134n0() == 1 && i10 == 1 && z10) {
            m7137r0().mo5872f();
        }
        if (m7134n0() == 2 && i10 == 2) {
            m7141v0().mo6068l();
        }
        ((HomeActivityBinding) getMBinding()).f9188f.setCurrentItem(i10, false);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.home_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        m7142w0().m7266y();
        initFragment();
        initView();
        m7085A0();
        PermissionUtils.permissionGroup(PermissionConstants.STORAGE, PermissionConstants.CAMERA).request();
        m7130S0(true);
        if (m7142w0().m7264w()) {
            m7142w0().m7256n(this);
        } else {
            HomeViewModel homeViewModelM7142w0 = m7142w0();
            String packageName = getPackageName();
            AbstractC9979u.m20293f(packageName, "getPackageName(...)");
            homeViewModelM7142w0.m7255m(packageName);
        }
        if (!NetworkUtils.isConnected()) {
            String string = SPUtils.getInstance().getString("updateInfo");
            if (!TextUtils.isEmpty(string)) {
                try {
                    VersionUpdate versionUpdate = (VersionUpdate) GsonUtils.fromJson(string, VersionUpdate.class);
                    if (versionUpdate.getResult().getVersionCode() > AppUtils.getAppVersionCode()) {
                        m7142w0().m7263v().postValue(new C9072a(versionUpdate));
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (C5962b.f6082a.m5299a().m5294v()) {
            try {
                MessageClient.f19777c.mo16545k(this.f9369q);
            } catch (Exception unused2) {
            }
        }
        m7135o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFragment() {
        ViewPager2 viewPager2 = ((HomeActivityBinding) getMBinding()).f9188f;
        viewPager2.setAdapter(new FragmentStateAdapter() { // from class: com.friday.main.view.HomeActivity$initFragment$1$1
            {
                super(this.f9389a);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                if (i10 == 0) {
                    Object objM7136q0 = this.f9389a.m7136q0();
                    AbstractC9979u.m20292e(objM7136q0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    return (Fragment) objM7136q0;
                }
                if (i10 == 1) {
                    Object objM7137r0 = this.f9389a.m7137r0();
                    AbstractC9979u.m20292e(objM7137r0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    return (Fragment) objM7137r0;
                }
                if (i10 == 2) {
                    Object objM7141v0 = this.f9389a.m7141v0();
                    AbstractC9979u.m20292e(objM7141v0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    return (Fragment) objM7141v0;
                }
                if (i10 != 3) {
                    Object objM7145z0 = this.f9389a.m7145z0();
                    AbstractC9979u.m20292e(objM7145z0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    return (Fragment) objM7145z0;
                }
                Object objM7140u0 = this.f9389a.m7140u0();
                AbstractC9979u.m20292e(objM7140u0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                return (Fragment) objM7140u0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return 5;
            }
        });
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity
    public void initView() {
        super.initView();
        m7128K0();
        ImageView ivMe = ((HomeActivityBinding) getMBinding()).f9186d.f9204f;
        AbstractC9979u.m20293f(ivMe, "ivMe");
        CardView cvCreate = ((HomeActivityBinding) getMBinding()).f9186d.f9201c;
        AbstractC9979u.m20293f(cvCreate, "cvCreate");
        CardView cvAirPlay = ((HomeActivityBinding) getMBinding()).f9185c;
        AbstractC9979u.m20293f(cvAirPlay, "cvAirPlay");
        setClickListener(ivMe, cvCreate, cvAirPlay);
        if (C5962b.f6082a.m5299a().m5289q()) {
            new FBIWarningDialog().show(getSupportFragmentManager(), FBIWarningDialog.class.getSimpleName());
        }
    }

    /* renamed from: j0 */
    public final void m7132j0(PopupWindow popupWindow) {
        if (m7134n0() != 1) {
            TabAdapter.m6935n(m7144y0(), 1, false, 2, null);
        }
        BaseDialog baseDialogM5441w = C5975a.f6196a.m5441w("0", new InterfaceC9540l() { // from class: v3.i1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return HomeActivity.m7125k0(this.f27333c, (String) obj);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
        baseDialogM5441w.show(supportFragmentManager, "create_dir");
        popupWindow.dismiss();
    }

    /* renamed from: l0 */
    public final void m7133l0(PopupWindow popupWindow) {
        if (m7134n0() == 2 || m7134n0() == 3 || m7134n0() == 4) {
            TabAdapter.m6935n(m7144y0(), 0, false, 2, null);
        }
        BaseDialog baseDialogM5441w = C5975a.f6196a.m5441w("1", new InterfaceC9540l() { // from class: v3.j1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return HomeActivity.m7126m0(this.f27339c, (String) obj);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
        baseDialogM5441w.show(supportFragmentManager, "create_dir");
        popupWindow.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n0 */
    public final int m7134n0() {
        return ((HomeActivityBinding) getMBinding()).f9188f.getCurrentItem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o0 */
    public final void m7135o0() {
        if (C9166c.f21406a.m18060d()) {
            ((HomeActivityBinding) getMBinding()).f9186d.f9202d.setVisibility(0);
            ((HomeActivityBinding) getMBinding()).f9186d.f9202d.setOnClickListener(new View.OnClickListener() { // from class: v3.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeActivity.m7127p0(this.f27328c, view);
                }
            });
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws SecurityException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f9373u > 2000) {
            AbstractC11958b.m26587h(R$string.click_again_to_exit);
            this.f9373u = jCurrentTimeMillis;
            return;
        }
        Set<String> allRunningServices = ServiceUtils.getAllRunningServices();
        if (allRunningServices != null) {
            Iterator<T> it = allRunningServices.iterator();
            while (it.hasNext()) {
                ServiceUtils.stopService((String) it.next());
            }
        }
        AppUtils.exitApp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9795m.f22988a.m19787a()) {
            return;
        }
        if (AbstractC9979u.m20289b(view, ((HomeActivityBinding) getMBinding()).f9185c)) {
            if (Settings.canDrawOverlays(this)) {
                m7138s0().mo98f(this);
                return;
            } else {
                m7129R0();
                return;
            }
        }
        if (AbstractC9979u.m20289b(view, ((HomeActivityBinding) getMBinding()).f9186d.f9204f)) {
            m7144y0().m6940p();
            ((HomeActivityBinding) getMBinding()).f9186d.f9204f.setSelected(true);
            m7109U0(this, 4, false, 2, null);
        } else if (AbstractC9979u.m20289b(view, ((HomeActivityBinding) getMBinding()).f9186d.f9201c)) {
            AbstractC9804v.f23002a.m19815a("New");
            C10193a.a aVar = new C10193a(this).new a();
            PopupWindowCreateNewBinding popupWindowCreateNewBindingM6944a = PopupWindowCreateNewBinding.m6944a(getLayoutInflater());
            AbstractC9979u.m20293f(popupWindowCreateNewBindingM6944a, "inflate(...)");
            aVar.m21278b(popupWindowCreateNewBindingM6944a).m21281e(-2, -2).m21280d(true).m21279c(new InterfaceC9545q() { // from class: v3.n1
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeActivity.m7100O0(this.f27352c, (View) obj, (PopupWindow) obj2, (PopupWindowCreateNewBinding) obj3);
                }
            }).m21277a().showAtLocation(view, 8388691, (int) getResources().getDimension(R$dimen.view_33), (int) getResources().getDimension(R$dimen.view_40));
        }
    }

    @Override // com.friday.main.view.Hilt_HomeActivity, com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws SecurityException {
        super.onDestroy();
        m7142w0().m7258q(this);
        m7130S0(false);
        Set<String> allRunningServices = ServiceUtils.getAllRunningServices();
        if (allRunningServices != null) {
            Iterator<T> it = allRunningServices.iterator();
            while (it.hasNext()) {
                ServiceUtils.stopService((String) it.next());
            }
        }
        C5962b.a aVar = C5962b.f6082a;
        if (!aVar.m5299a().m5294v()) {
            m7139t0().mo102c();
        }
        if (aVar.m5299a().m5294v()) {
            try {
                MessageClient.f19777c.mo16548o(this.f9369q);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C5962b.f6082a.m5299a().m5287o() == 1) {
            m7142w0().m7260s();
        }
        InterfaceC10045g interfaceC10045g = this.f9370r;
        if (interfaceC10045g != null) {
            AbstractC9979u.m20291d(interfaceC10045g);
            if (!interfaceC10045g.isCompleted()) {
                return;
            }
        }
        this.f9370r = LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C62151(null));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9979u.m20294g(outState, "outState");
    }

    /* renamed from: q0 */
    public final InterfaceC9663c m7136q0() {
        InterfaceC9663c interfaceC9663c = this.f9363k;
        if (interfaceC9663c != null) {
            return interfaceC9663c;
        }
        AbstractC9979u.m20312y("documentFragment");
        return null;
    }

    /* renamed from: r0 */
    public final InterfaceC9666f m7137r0() {
        InterfaceC9666f interfaceC9666f = this.f9364l;
        if (interfaceC9666f != null) {
            return interfaceC9666f;
        }
        AbstractC9979u.m20312y("folderFragment");
        return null;
    }

    /* renamed from: s0 */
    public final InterfaceC9662b m7138s0() {
        InterfaceC9662b interfaceC9662b = this.f9365m;
        if (interfaceC9662b != null) {
            return interfaceC9662b;
        }
        AbstractC9979u.m20312y("iClassManager");
        return null;
    }

    /* renamed from: t0 */
    public final InterfaceC9665e m7139t0() {
        InterfaceC9665e interfaceC9665e = this.f9366n;
        if (interfaceC9665e != null) {
            return interfaceC9665e;
        }
        AbstractC9979u.m20312y("iFloatWindowManager");
        return null;
    }

    /* renamed from: u0 */
    public final InterfaceC9668h m7140u0() {
        InterfaceC9668h interfaceC9668h = this.f9368p;
        if (interfaceC9668h != null) {
            return interfaceC9668h;
        }
        AbstractC9979u.m20312y("iRecycle");
        return null;
    }

    /* renamed from: v0 */
    public final InterfaceC9669i m7141v0() {
        InterfaceC9669i interfaceC9669i = this.f9367o;
        if (interfaceC9669i != null) {
            return interfaceC9669i;
        }
        AbstractC9979u.m20312y("iShare");
        return null;
    }

    /* renamed from: w0 */
    public final HomeViewModel m7142w0() {
        return (HomeViewModel) this.f9359g.getValue();
    }

    /* renamed from: x0 */
    public final C6211b m7143x0() {
        return (C6211b) this.f9371s.getValue();
    }

    /* renamed from: y0 */
    public final TabAdapter m7144y0() {
        return (TabAdapter) this.f9360h.getValue();
    }

    /* renamed from: z0 */
    public final InterfaceC9670j m7145z0() {
        InterfaceC9670j interfaceC9670j = this.f9362j;
        if (interfaceC9670j != null) {
            return interfaceC9670j;
        }
        AbstractC9979u.m20312y("userFragment");
        return null;
    }
}
