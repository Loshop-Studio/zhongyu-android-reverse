package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.huiwei.launcher.databinding.HwDialogTipsBinding;
import com.zykj.huiwei.launcher.p035ui.dialog.TipsDialog;
import com.zykj.huiwei.launcher.viewmodels.TipsViewModel;
import com.zykj.manage.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "onDestroy", "Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;", "Landroidx/navigation/NavArgsLazy;", "o", "()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;", "args", "Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;", "h", "Lkotlin/Lazy;", "q", "()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;", "viewModel", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "kotlin.jvm.PlatformType", "i", "p", "()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "loadingDialog", "j", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTipsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TipsDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/TipsDialog\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,75:1\n42#2,3:76\n106#3,15:79\n*S KotlinDebug\n*F\n+ 1 TipsDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/TipsDialog\n*L\n19#1:76,3\n20#1:79,15\n*E\n"})
/* loaded from: classes4.dex */
public final class TipsDialog extends Hilt_TipsDialog<HwDialogTipsBinding> {

    /* renamed from: k */
    public static final int f6513k = 8;

    /* renamed from: g, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(TipsDialogArgs.class), new C6117b(this));

    /* renamed from: h, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy loadingDialog;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.TipsDialog$b */
    public static final class C6117b implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f6524a;

        public C6117b(Fragment fragment) {
            this.f6524a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f6524a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f6524a + " has null arguments");
        }
    }

    public TipsDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.dialog.TipsDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.dialog.TipsDialog$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TipsViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.dialog.TipsDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.dialog.TipsDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.dialog.TipsDialog$special$$inlined$viewModels$default$5
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
        this.loadingDialog = LazyKt.lazy(new Function0() { // from class: b4.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TipsDialog.m5741r(this.f1319a);
            }
        });
    }

    /* renamed from: r */
    public static final MaterialDialog m5741r(TipsDialog tipsDialog) {
        return new MaterialDialog.C5891g(tipsDialog.requireContext()).m4613g().m4620n(tipsDialog.requireContext().getString(R.string.hint)).m4610d(tipsDialog.requireContext().getString(R.string.loading)).m4615i(true, 0).m4617k(false).m4607a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        setCancelable(m5742o().getCancelable());
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(m5742o().getCancelable());
            dialog.setCanceledOnTouchOutside(m5742o().getCanceledOnTouchOutside());
        }
        m5744q().getIsShowCancel().setValue(Boolean.valueOf(m5742o().getIsShowCancel()));
        m5744q().getContent().setValue(m5742o().getContent());
        m5744q().getCancel().setValue(m5742o().getCancel());
        m5744q().getConfirm().setValue(m5742o().getConfirm());
        ((HwDialogTipsBinding) getMBindView()).setVm(m5744q());
        ((HwDialogTipsBinding) getMBindView()).setOnClickListener(this);
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.hw_dialog_tips;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final TipsDialogArgs m5742o() {
        return (TipsDialogArgs) this.args.getValue();
    }

    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.tvCancel) {
            FragmentKt.findNavController(this).navigateUp();
        } else if (numValueOf != null && numValueOf.intValue() == R.id.tvConfirm) {
            m5743p().show();
            androidx.fragment.app.FragmentKt.setFragmentResult(this, "TipsDialogRequestKey", BundleKt.bundleOf());
            FragmentKt.findNavController(this).navigateUp();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m5743p().dismiss();
    }

    /* renamed from: p */
    public final MaterialDialog m5743p() {
        return (MaterialDialog) this.loadingDialog.getValue();
    }

    /* renamed from: q */
    public final TipsViewModel m5744q() {
        return (TipsViewModel) this.viewModel.getValue();
    }
}
