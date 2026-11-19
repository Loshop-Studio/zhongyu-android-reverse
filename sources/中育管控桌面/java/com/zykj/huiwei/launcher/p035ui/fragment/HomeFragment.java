package com.zykj.huiwei.launcher.p035ui.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC4634a;
import com.blankj.utilcode.util.AbstractC4668s;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.lljjcoder.Interface.OnCityItemClickListener;
import com.lljjcoder.bean.CityBean;
import com.lljjcoder.bean.DistrictBean;
import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.citywheel.CityConfig;
import com.zykj.gallery.p034ui.activity.GalleryActivity;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.bean.resp.VersionInfo;
import com.zykj.huiwei.launcher.databinding.HwFragmentHomeBinding;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.p035ui.MainActivity;
import com.zykj.huiwei.launcher.p035ui.adapter.HomeworkAdapter;
import com.zykj.huiwei.launcher.p035ui.dialog.AppUpdateDialogArgs;
import com.zykj.huiwei.launcher.p035ui.dialog.ChangeAvatarDialogArgs;
import com.zykj.huiwei.launcher.p035ui.dialog.TipsDialogArgs;
import com.zykj.huiwei.launcher.p035ui.fragment.HomeFragment;
import com.zykj.huiwei.launcher.proto.C6075m;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.huiwei.launcher.viewmodels.UnAuthorViewModel;
import com.zykj.huiwei.launcher.viewmodels.VersionViewModel;
import com.zykj.manage.R;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p037ui.PolicyCheckView;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p071h4.C6487d;
import p078i4.AbstractC6537g;
import p119o1.InterfaceC7516a;
import p149s3.InterfaceC7696d;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001M\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R?\u0010C\u001a&\u0012\f\u0012\n ?*\u0004\u0018\u00010>0> ?*\u0012\u0012\u000e\b\u0001\u0012\n ?*\u0004\u0018\u00010>0>0=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0015\u001a\u0004\bF\u0010GR.\u0010L\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020> ?*\n\u0012\u0004\u0012\u00020>\u0018\u00010=0=0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\u0015\u001a\u0004\bO\u0010P¨\u0006S"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment;", "Lcom/zykj/huiwei/launcher/base/CommonFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;", "<init>", "()V", "", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "I", "R", "f", "onDestroy", "", "layoutId", "()I", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;", "i", "Lkotlin/Lazy;", "Q", "()Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;", "viewModel", "Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;", "j", "G", "()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;", "appUpdateViewModel", "Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;", "k", "O", "()Lcom/zykj/huiwei/launcher/viewmodels/UnAuthorViewModel;", "unAuthorModel", "Lcom/zykj/huiwei/launcher/viewmodels/VersionViewModel;", "l", "P", "()Lcom/zykj/huiwei/launcher/viewmodels/VersionViewModel;", "versionViewModel", "Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$a;", "m", "Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$a;", "N", "()Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$a;", "c0", "(Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$a;)V", "onDrawerLayoutChange", "Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;", "n", "L", "()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;", "mainViewModel", "Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;", "o", "Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;", "K", "()Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;", "setHomeworkAdapter", "(Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;)V", "homeworkAdapter", "", "", "kotlin.jvm.PlatformType", "p", "M", "()[Ljava/lang/String;", "municipality", "Lh4/d;", "q", "H", "()Lh4/d;", "cityPicker", "Landroidx/activity/result/ActivityResultLauncher;", "r", "Landroidx/activity/result/ActivityResultLauncher;", "requestPermissionLauncher", "com/zykj/huiwei/launcher/ui/fragment/HomeFragment$b", "s", "J", "()Lcom/zykj/huiwei/launcher/ui/fragment/HomeFragment$b;", "gestureStateReceiver", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/HomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentExt.kt\ncom/zykj/huiwei/launcher/ext/FragmentExtKt\n*L\n1#1,448:1\n106#2,15:449\n106#2,15:464\n172#2,9:479\n106#2,15:488\n172#2,9:503\n7#3,7:512\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/HomeFragment\n*L\n64#1:449,15\n65#1:464,15\n66#1:479,9\n67#1:488,15\n69#1:503,9\n422#1:512,7\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeFragment extends Hilt_HomeFragment<HwFragmentHomeBinding> {

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: j, reason: from kotlin metadata */
    public final Lazy appUpdateViewModel;

    /* renamed from: k, reason: from kotlin metadata */
    public final Lazy unAuthorModel;

    /* renamed from: l, reason: from kotlin metadata */
    public final Lazy versionViewModel;

    /* renamed from: m, reason: from kotlin metadata */
    public InterfaceC6133a onDrawerLayoutChange;

    /* renamed from: n, reason: from kotlin metadata */
    public final Lazy mainViewModel;

    /* renamed from: o, reason: from kotlin metadata */
    public HomeworkAdapter homeworkAdapter;

    /* renamed from: p, reason: from kotlin metadata */
    public final Lazy municipality;

    /* renamed from: q, reason: from kotlin metadata */
    public final Lazy cityPicker;

    /* renamed from: r, reason: from kotlin metadata */
    public final ActivityResultLauncher requestPermissionLauncher;

    /* renamed from: s, reason: from kotlin metadata */
    public final Lazy gestureStateReceiver;

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$a */
    public interface InterfaceC6133a {
        /* renamed from: b */
        void mo5898b(Function0 function0);

        /* renamed from: c */
        void mo5899c(boolean z6);
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$b */
    public static final class C6134b extends BroadcastReceiver {
        public C6134b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras != null) {
                AbstractC4668s.m2377i("HomeFragment", "==== 收到com.linspirer.edu.return_gesture_state广播，开始遍历 Extras ====");
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    AbstractC4668s.m2377i("HomeFragment，当前广播", "Key(Name): " + str + " | Type: " + (obj != null ? obj.getClass().getSimpleName() : "null") + " | Value: " + obj);
                }
                AbstractC4668s.m2377i("HomeFragment", "==== 遍历结束 ====");
            } else {
                AbstractC4668s.m2368J("HomeFragment", "收到广播，但 Intent 中没有 Extras 数据");
            }
            if (intent != null) {
                int intExtra = intent.getIntExtra("gesture_state", -1);
                HomeFragment homeFragment = HomeFragment.this;
                AbstractC4668s.m2388t("HomeFragment", "onReceive: 尝试读取特定 Key 的 State: " + intExtra);
                homeFragment.m5889L().m6161q(intExtra);
            }
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$c */
    public static final class C6135c extends OnCityItemClickListener {
        public C6135c() {
        }

        @Override // com.lljjcoder.Interface.OnCityItemClickListener
        public void onSelected(ProvinceBean provinceBean, CityBean cityBean, DistrictBean districtBean) {
            String name;
            super.onSelected(provinceBean, cityBean, districtBean);
            if (provinceBean == null || cityBean == null) {
                HomeFragment.this.m5287j(R.string.select_city_error);
                return;
            }
            HomeViewModel homeViewModelM5893Q = HomeFragment.this.m5893Q();
            String[] strArrM5890M = HomeFragment.this.m5890M();
            int length = strArrM5890M.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    name = cityBean.getName();
                    break;
                }
                String str = strArrM5890M[i6];
                String name2 = provinceBean.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Intrinsics.checkNotNull(str);
                if (StringsKt.contains$default((CharSequence) name2, (CharSequence) str, false, 2, (Object) null)) {
                    name = provinceBean.getName();
                    break;
                }
                i6++;
            }
            Intrinsics.checkNotNull(name);
            homeViewModelM5893Q.m6101W(name);
            HomeFragment.this.m5893Q().m6095P();
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$d */
    public static final class C6136d implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6674a;

        public C6136d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6674a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6674a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6674a.invoke(obj);
        }
    }

    public HomeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.appUpdateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AppUpdateViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.unAuthorModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UnAuthorViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                return (function04 == null || (creationExtras = (CreationExtras) function04.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0<Fragment> function04 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$12
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.versionViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(VersionViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function02;
                return (function05 == null || (creationExtras = (CreationExtras) function05.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.municipality = LazyKt.lazy(new Function0() { // from class: f4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragment.m5870Z(this.f7691a);
            }
        });
        this.cityPicker = LazyKt.lazy(new Function0() { // from class: f4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragment.m5862E(this.f7693a);
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: f4.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                HomeFragment.m5872b0(this.f7694a, (Map) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermissionLauncher = activityResultLauncherRegisterForActivityResult;
        this.gestureStateReceiver = LazyKt.lazy(new Function0() { // from class: f4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragment.m5863F(this.f7695a);
            }
        });
    }

    /* renamed from: E */
    public static final C6487d m5862E(HomeFragment homeFragment) {
        C6487d c6487d = new C6487d();
        c6487d.m7178j(new CityConfig.Builder().provinceCyclic(false).cityCyclic(false).setLineColor("#E9E9E9").setLineHeigh((int) homeFragment.getResources().getDimension(R.dimen.hwDivider)).visibleItemsCount(7).setCityWheelType(CityConfig.WheelType.PRO_CITY).setCustomItemLayout(Integer.valueOf(R.layout.hw_item_weather_city)).setCustomItemTextViewId(Integer.valueOf(R.id.tv_city)).build());
        FragmentActivity fragmentActivityRequireActivity = homeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        c6487d.m7176e(fragmentActivityRequireActivity);
        return c6487d;
    }

    /* renamed from: F */
    public static final C6134b m5863F(HomeFragment homeFragment) {
        return homeFragment.new C6134b();
    }

    /* renamed from: O */
    private final UnAuthorViewModel m5864O() {
        return (UnAuthorViewModel) this.unAuthorModel.getValue();
    }

    /* renamed from: T */
    public static final Unit m5865T(HomeFragment homeFragment, VersionInfo versionInfo) {
        if (versionInfo == null) {
            FragmentKt.findNavController(homeFragment).navigateUp();
            return Unit.INSTANCE;
        }
        homeFragment.mo5283d(R.id.appUpdateDialog, new AppUpdateDialogArgs(versionInfo).m5629b(), null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U */
    public static final Unit m5866U(HomeFragment homeFragment, C6075m c6075m) {
        AppCompatImageView ivAvatar = ((HwFragmentHomeBinding) homeFragment.getMBindView()).includeTitle.ivAvatar;
        Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
        CommonExtKt.m5314g(ivAvatar, c6075m.getAvatar(), R.drawable.hw_ic_default_person, R.drawable.hw_ic_default_person);
        AppCompatImageView ivAvatar2 = ((HwFragmentHomeBinding) homeFragment.getMBindView()).includeSideBar.ivAvatar;
        Intrinsics.checkNotNullExpressionValue(ivAvatar2, "ivAvatar");
        CommonExtKt.m5314g(ivAvatar2, c6075m.getAvatar(), R.drawable.hw_ic_default_person, R.drawable.hw_ic_default_person);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public static final void m5867W(HomeFragment homeFragment, BaseQuickAdapter baseQuickAdapter, View view, int i6) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ((HwFragmentHomeBinding) homeFragment.getMBindView()).includeHomework.tvShowAll.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: X */
    public static final Unit m5868X(HomeFragment homeFragment) {
        if (((HwFragmentHomeBinding) homeFragment.getMBindView()).drawLayout.isOpen()) {
            ((HwFragmentHomeBinding) homeFragment.getMBindView()).drawLayout.closeDrawers();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m5869Y(HomeFragment homeFragment, List list) {
        homeFragment.m5888K().setNewInstance(list);
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final String[] m5870Z(HomeFragment homeFragment) {
        return homeFragment.getResources().getStringArray(R.array.municipality);
    }

    /* renamed from: a0 */
    public static final Unit m5871a0(HomeFragment homeFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        homeFragment.m5864O().getCallback().setValue(1);
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final void m5872b0(HomeFragment homeFragment, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get("android.permission.ACCESS_COARSE_LOCATION");
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(obj, bool) && !Intrinsics.areEqual(it.get("android.permission.ACCESS_FINE_LOCATION"), bool)) {
            homeFragment.m5893Q().m6101W("北京市");
        }
        homeFragment.m5893Q().m6095P();
    }

    /* renamed from: G */
    public final AppUpdateViewModel m5884G() {
        return (AppUpdateViewModel) this.appUpdateViewModel.getValue();
    }

    /* renamed from: H */
    public final C6487d m5885H() {
        return (C6487d) this.cityPicker.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final void m5886I() {
        ((HwFragmentHomeBinding) getMBindView()).setVm(m5893Q());
        ((HwFragmentHomeBinding) getMBindView()).setMainViewModel(m5889L());
        ((HwFragmentHomeBinding) getMBindView()).setClickListener(this);
        m5893Q().m6082C();
        m5893Q().m6105y();
        m5894R();
        m5893Q().m6088I();
        m5893Q().m6103w();
        if (AbstractC6537g.f8372a.m7316g()) {
            return;
        }
        InterfaceC7516a interfaceC7516a = (InterfaceC7516a) m5884G().getAppStoreService().getValue();
        if (interfaceC7516a != null) {
            AppUpdateViewModel appUpdateViewModelM5884G = m5884G();
            String packageName = App.INSTANCE.m5206a().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            appUpdateViewModelM5884G.m6019b(interfaceC7516a, packageName);
            return;
        }
        AppUpdateViewModel appUpdateViewModelM5884G2 = m5884G();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        appUpdateViewModelM5884G2.m6020c(fragmentActivityRequireActivity);
    }

    /* renamed from: J */
    public final C6134b m5887J() {
        return (C6134b) this.gestureStateReceiver.getValue();
    }

    /* renamed from: K */
    public final HomeworkAdapter m5888K() {
        HomeworkAdapter homeworkAdapter = this.homeworkAdapter;
        if (homeworkAdapter != null) {
            return homeworkAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeworkAdapter");
        return null;
    }

    /* renamed from: L */
    public final MainViewModel m5889L() {
        return (MainViewModel) this.mainViewModel.getValue();
    }

    /* renamed from: M */
    public final String[] m5890M() {
        return (String[]) this.municipality.getValue();
    }

    /* renamed from: N, reason: from getter */
    public final InterfaceC6133a getOnDrawerLayoutChange() {
        return this.onDrawerLayoutChange;
    }

    /* renamed from: P */
    public final VersionViewModel m5892P() {
        return (VersionViewModel) this.versionViewModel.getValue();
    }

    /* renamed from: Q */
    public final HomeViewModel m5893Q() {
        return (HomeViewModel) this.viewModel.getValue();
    }

    /* renamed from: R */
    public final void m5894R() {
        if (m5893Q().m6094O().length() == 0) {
            this.requestPermissionLauncher.launch(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        } else {
            m5893Q().m6095P();
        }
    }

    /* renamed from: S */
    public final void m5895S() {
        m5892P().getVersionUpdateInfo().observe(getViewLifecycleOwner(), new C6136d(new Function1() { // from class: f4.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m5865T(this.f7703a, (VersionInfo) obj);
            }
        }));
        m5893Q().getUserCacheBean().observe(getViewLifecycleOwner(), new C6136d(new Function1() { // from class: f4.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m5866U(this.f7705a, (C6075m) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HomeFragment$initObserver$3(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new HomeFragment$initObserver$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeFragment$initObserver$5(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new HomeFragment$initObserver$6(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new HomeFragment$initObserver$7(this, null), 3, null);
    }

    /* renamed from: V */
    public final void m5896V() {
        if (AbstractC6537g.f8372a.m7316g()) {
            requireContext().registerReceiver(m5887J(), new IntentFilter("com.linspirer.edu.return_gesture_state"));
        }
    }

    /* renamed from: c0 */
    public final void m5897c0(InterfaceC6133a interfaceC6133a) {
        this.onDrawerLayoutChange = interfaceC6133a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: f */
    public void mo5284f() {
        if (AbstractC6537g.f8372a.m7316g()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.zykj.huiwei.launcher.ui.MainActivity");
            ((MainActivity) fragmentActivityRequireActivity).m5548O().m7504r();
        }
        m5895S();
        m5896V();
        ((HwFragmentHomeBinding) getMBindView()).includeSideBar.tvPolicy.setCompoundDrawablePadding(0);
        ((HwFragmentHomeBinding) getMBindView()).includeSideBar.tvPolicy.setCompoundDrawables(null, null, null, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        PolicyHelper.Builder builderM6238c = new PolicyHelper.Builder(contextRequireContext).m6240e("https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userServiceAgreement.html").m6239d("https://web.alicdn.zykj.org/privacypolicy/huiweiDesktop/userPrivacyPolicy.html").m6238c("《用户服务协议》\t\t\t\t《用户隐私政策》");
        PolicyCheckView tvPolicy = ((HwFragmentHomeBinding) getMBindView()).includeSideBar.tvPolicy;
        Intrinsics.checkNotNullExpressionValue(tvPolicy, "tvPolicy");
        builderM6238c.m6241f(tvPolicy);
        InterfaceC6133a interfaceC6133a = this.onDrawerLayoutChange;
        if (interfaceC6133a != null) {
            interfaceC6133a.mo5898b(new Function0() { // from class: f4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeFragment.m5868X(this.f7697a);
                }
            });
        }
        ((HwFragmentHomeBinding) getMBindView()).drawLayout.addDrawerListener(new DrawerLayout.DrawerListener() { // from class: com.zykj.huiwei.launcher.ui.fragment.HomeFragment$initView$2
            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(View drawerView) {
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                HomeFragment.InterfaceC6133a onDrawerLayoutChange = this.f6695a.getOnDrawerLayoutChange();
                if (onDrawerLayoutChange != null) {
                    onDrawerLayoutChange.mo5899c(false);
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerOpened(View drawerView) {
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                HomeFragment.InterfaceC6133a onDrawerLayoutChange = this.f6695a.getOnDrawerLayoutChange();
                if (onDrawerLayoutChange != null) {
                    onDrawerLayoutChange.mo5899c(true);
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerSlide(View drawerView, float slideOffset) {
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerStateChanged(int newState) {
            }
        });
        ((HwFragmentHomeBinding) getMBindView()).drawLayout.setScrimColor(0);
        RecyclerView recyclerView = ((HwFragmentHomeBinding) getMBindView()).includeHomework.rvHomeWork;
        Intrinsics.checkNotNull(recyclerView);
        CommonExtKt.m5310c(recyclerView, R.dimen.pt5, false, false, 6, null);
        recyclerView.setAdapter(m5888K());
        m5893Q().getTodoItems().observe(getViewLifecycleOwner(), new C6136d(new Function1() { // from class: f4.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m5869Y(this.f7699a, (List) obj);
            }
        }));
        m5888K().setOnItemClickListener(new OnItemClickListener() { // from class: f4.g
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i6) {
                HomeFragment.m5867W(this.f7700a, baseQuickAdapter, view, i6);
            }
        });
        m5885H().m7179k(new C6135c());
        m5893Q().m6102X();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.hw_fragment_home;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        InterfaceC7516a interfaceC7516a;
        String avatar;
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.tvLocation) {
            m5885H().m7181m(v6);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.clickUserInfo) {
            ((HwFragmentHomeBinding) getMBindView()).drawLayout.openDrawer(GravityCompat.START);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.ivAvatar) {
            C6075m c6075m = (C6075m) m5893Q().getUserCacheBean().getValue();
            if (c6075m == null || (avatar = c6075m.getAvatar()) == null) {
                avatar = "";
            }
            mo5283d(R.id.changeAvatarDialog, new ChangeAvatarDialogArgs(avatar).m5644b(), null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.ImgAnswer) {
            CommonExtKt.m5313f(this, "com.zykj.student.dialogue", null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvNote) {
            CommonExtKt.m5313f(this, "com.friday.cloudsnote", null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvOnline) {
            CommonExtKt.m5313f(this, "com.zykj.subscriber", null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvBetterClass) {
            CommonExtKt.m5313f(this, "com.zhongyukejiao.learningexpert", null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvWrongBook) {
            CommonExtKt.m5313f(this, "com.zykj.mistake", null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvShowAll) {
            CommonExtKt.m5313f(this, "com.zykj.evaluation", null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuSystemMsg) {
            m5288k("敬请期待");
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuSchoolNotice) {
            InterfaceC7696d.m9152a(this, R.id.notificationFragment, null, null, 6, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuDeviceNo) {
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuCheckUpdate) {
            if (AbstractC6537g.f8372a.m7316g() || (interfaceC7516a = (InterfaceC7516a) m5884G().getAppStoreService().getValue()) == null) {
                return;
            }
            AppUpdateViewModel appUpdateViewModelM5884G = m5884G();
            String packageName = App.INSTANCE.m5206a().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            appUpdateViewModelM5884G.m6019b(interfaceC7516a, packageName);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuService) {
            InterfaceC7696d.m9152a(this, R.id.customerServiceDialog, null, null, 2, null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuModifyPassword) {
            m5893Q().m6104x();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.menuModifyGesture) {
            int iIntValue = ((Number) m5889L().getGestureNumberFlow().getValue()).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    return;
                }
                InterfaceC7696d.m9152a(this, R.id.modifyGestureDialog, null, null, 2, null);
                return;
            } else {
                Context contextRequireContext = requireContext();
                Intent intent = new Intent();
                intent.setPackage("com.android.launcher3");
                intent.setClassName("com.android.launcher3", "com.android.launcher3.activity.gestrue.SettingPwdGestureActivity");
                intent.putExtra("settings_type", 0);
                contextRequireContext.startActivity(intent);
                return;
            }
        }
        if (numValueOf == null || numValueOf.intValue() != R.id.menuExit) {
            if (numValueOf != null && numValueOf.intValue() == R.id.tvGallery) {
                AbstractC4634a.m2122k(GalleryActivity.class);
                return;
            } else {
                AbstractC4668s.m2377i("onClick--->else");
                return;
            }
        }
        Fragment parentFragment = this;
        while (parentFragment != null && !(parentFragment instanceof MainFragment)) {
            parentFragment = parentFragment.getParentFragment();
        }
        if (!(parentFragment instanceof MainFragment)) {
            parentFragment = null;
        }
        MainFragment mainFragment = (MainFragment) parentFragment;
        if (mainFragment != null) {
            androidx.fragment.app.FragmentKt.setFragmentResultListener(mainFragment, "TipsDialogRequestKey", new Function2() { // from class: f4.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeFragment.m5871a0(this.f7701a, (String) obj, (Bundle) obj2);
                }
            });
        }
        String string = getString(R.string.hw_confirm_exit);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mo5283d(R.id.tipsDialog, new TipsDialogArgs(string, null, null, false, false, false, 62, null).m5752g(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (AbstractC6537g.f8372a.m7316g()) {
            requireContext().unregisterReceiver(m5887J());
            return;
        }
        AppUpdateViewModel appUpdateViewModelM5884G = m5884G();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        appUpdateViewModelM5884G.m6021d(fragmentActivityRequireActivity);
    }
}
