package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileWorkProxy;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.bean.resp.VersionInfo;
import com.zykj.huiwei.launcher.databinding.HwDialogAppUpdateBinding;
import com.zykj.huiwei.launcher.p035ui.dialog.AppUpdateDialog;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
import com.zykj.lib.error.code.ErrorCodeHandler;
import com.zykj.manage.R;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p066h.C6429b;
import p078i4.AbstractC6537g;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "filePath", "(Ljava/lang/String;)V", "Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;", "Lkotlin/Lazy;", "r", "()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;", "viewModel", "Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;", "h", "Landroidx/navigation/NavArgsLazy;", "q", "()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;", "args", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAppUpdateDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpdateDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,146:1\n106#2,15:147\n42#3,3:162\n*S KotlinDebug\n*F\n+ 1 AppUpdateDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog\n*L\n28#1:147,15\n29#1:162,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AppUpdateDialog extends Hilt_AppUpdateDialog<HwDialogAppUpdateBinding> {

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public final NavArgsLazy args;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$a */
    public static final /* synthetic */ class C6103a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6410a;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6410a = iArr;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$b */
    public static final class C6104b implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6411a;

        public C6104b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6411a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6411a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6411a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$c */
    public static final class C6105c implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f6412a;

        public C6105c(Fragment fragment) {
            this.f6412a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f6412a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f6412a + " has null arguments");
        }
    }

    public AppUpdateDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AppUpdateViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.dialog.AppUpdateDialog$special$$inlined$viewModels$default$5
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
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(AppUpdateDialogArgs.class), new C6105c(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final Unit m5621s(AppUpdateDialog appUpdateDialog, String str) {
        appUpdateDialog.m5625r().getProgress().setValue(Float.valueOf(1.0f));
        MutableLiveData mutableLiveDataM6038u = appUpdateDialog.m5625r().getIsShowProgress();
        Boolean bool = Boolean.TRUE;
        mutableLiveDataM6038u.setValue(bool);
        ((HwDialogAppUpdateBinding) appUpdateDialog.getMBindView()).tvConfirm.setTag(str);
        appUpdateDialog.m5625r().getConfirm().setValue(appUpdateDialog.getString(R.string.hw_install_now));
        appUpdateDialog.m5625r().getIsShowConfirm().setValue(bool);
        if (appUpdateDialog.m5624q().getVersionInfo().getForceUpdate()) {
            Intrinsics.checkNotNull(str);
            appUpdateDialog.m5626v(str);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m5622t(final AppUpdateDialog appUpdateDialog, UUID uuid) {
        WorkManager companion = WorkManager.INSTANCE.getInstance(App.INSTANCE.m5206a());
        Intrinsics.checkNotNull(uuid);
        companion.getWorkInfoByIdLiveData(uuid).observe(appUpdateDialog.getViewLifecycleOwner(), new C6104b(new Function1() { // from class: b4.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateDialog.m5623u(this.f1312a, (WorkInfo) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m5623u(AppUpdateDialog appUpdateDialog, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i6 = state == null ? -1 : C6103a.f6410a[state.ordinal()];
        if (i6 == 1) {
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            if (string != null) {
                appUpdateDialog.m5625r().getDownloadSuccess().setValue(string);
            }
        } else if (i6 == 2) {
            String message = ErrorCodeHandler.INSTANCE.getErrorCode(workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessage();
            if (message != null) {
                Log.i("DownLoad", message);
            }
            appUpdateDialog.m5281i("文件下载失败，请重新尝试");
            FragmentKt.findNavController(appUpdateDialog).navigateUp();
        } else {
            if (workInfo == null) {
                return Unit.INSTANCE;
            }
            appUpdateDialog.m5625r().getProgress().setValue(Float.valueOf(workInfo.getProgress().getInt("progress", 0) / 100.0f));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        DownloadFileWorkProxy.INSTANCE.m5011b(50L);
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        ((HwDialogAppUpdateBinding) getMBindView()).setVm(m5625r());
        ((HwDialogAppUpdateBinding) getMBindView()).setOnClickListener(this);
        VersionInfo versionInfo = m5624q().getVersionInfo();
        m5625r().getVersion().setValue("v" + versionInfo.getVersionName());
        if (versionInfo.getVersionCode() > AbstractC6537g.f8372a.m7312c(App.INSTANCE.m5206a())) {
            ((HwDialogAppUpdateBinding) getMBindView()).ivIcon.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.pt155);
            ((HwDialogAppUpdateBinding) getMBindView()).ivIcon.setImageResource(R.mipmap.hw_update_max_bg);
            m5625r().getTitle().setValue(getString(R.string.hw_new_version_title));
            m5625r().getContent().setValue(versionInfo.getDescription());
            m5625r().getCancel().setValue(getString(R.string.hw_cancel_and_exit));
            m5625r().getConfirm().setValue(getString(R.string.hw_update_now));
            m5625r().getIsShowContent().setValue(Boolean.TRUE);
            m5625r().getIsShowCancel().setValue(Boolean.valueOf(!versionInfo.getForceUpdate()));
            m5625r().getIsShowClose().setValue(Boolean.valueOf(!versionInfo.getForceUpdate()));
            m5625r().m6018a(versionInfo);
        } else {
            ((HwDialogAppUpdateBinding) getMBindView()).ivIcon.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.pt112);
            ((HwDialogAppUpdateBinding) getMBindView()).ivIcon.setImageResource(R.mipmap.hw_update_min_bg);
            m5625r().getTitle().setValue(getString(R.string.hw_no_version_title));
            m5625r().getVersion().setValue(versionInfo.getVersionName());
            m5625r().getConfirm().setValue(getString(R.string.hw_known));
            MutableLiveData mutableLiveDataM6037t = m5625r().getIsShowContent();
            Boolean bool = Boolean.FALSE;
            mutableLiveDataM6037t.setValue(bool);
            m5625r().getIsShowCancel().setValue(bool);
            m5625r().getIsShowClose().setValue(Boolean.TRUE);
        }
        m5625r().getDownloadSuccess().observe(getViewLifecycleOwner(), new C6104b(new Function1() { // from class: b4.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateDialog.m5621s(this.f1310a, (String) obj);
            }
        }));
        m5625r().getRequestId().observe(getViewLifecycleOwner(), new C6104b(new Function1() { // from class: b4.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateDialog.m5622t(this.f1311a, (UUID) obj);
            }
        }));
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.hw_dialog_app_update;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if ((numValueOf != null && numValueOf.intValue() == R.id.ivClose) || (numValueOf != null && numValueOf.intValue() == R.id.tvCancel)) {
            FragmentKt.findNavController(this).navigateUp();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.tvConfirm) {
            if (m5624q().getVersionInfo().getVersionCode() <= AbstractC6537g.f8372a.m7312c(App.INSTANCE.m5206a())) {
                FragmentKt.findNavController(this).navigateUp();
                return;
            }
            Object tag = ((HwDialogAppUpdateBinding) getMBindView()).tvConfirm.getTag();
            if (tag != null) {
                m5626v(tag.toString());
                return;
            }
            VersionInfo versionInfo = m5624q().getVersionInfo();
            m5625r().getIsShowProgress().setValue(Boolean.TRUE);
            m5625r().getIsShowConfirm().setValue(Boolean.FALSE);
            m5625r().m6040w(versionInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final AppUpdateDialogArgs m5624q() {
        return (AppUpdateDialogArgs) this.args.getValue();
    }

    /* renamed from: r */
    public final AppUpdateViewModel m5625r() {
        return (AppUpdateViewModel) this.viewModel.getValue();
    }

    /* renamed from: v */
    public final void m5626v(String filePath) {
        C6429b c6429b = C6429b.f8106a;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        c6429b.m7037b(contextRequireContext, filePath);
    }
}
