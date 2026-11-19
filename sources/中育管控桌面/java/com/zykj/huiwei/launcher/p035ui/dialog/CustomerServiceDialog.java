package com.zykj.huiwei.launcher.p035ui.dialog;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.huiwei.launcher.databinding.HwDialogCustomerServiceBinding;
import com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel;
import com.zykj.manage.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;", "Lkotlin/Lazy;", "n", "()Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;", "viewModel", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nCustomerServiceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerServiceDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,33:1\n106#2,15:34\n*S KotlinDebug\n*F\n+ 1 CustomerServiceDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog\n*L\n14#1:34,15\n*E\n"})
/* loaded from: classes4.dex */
public final class CustomerServiceDialog extends Hilt_CustomerServiceDialog<HwDialogCustomerServiceBinding> {

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    public CustomerServiceDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.dialog.CustomerServiceDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.dialog.CustomerServiceDialog$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CustomerServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.dialog.CustomerServiceDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.dialog.CustomerServiceDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.dialog.CustomerServiceDialog$special$$inlined$viewModels$default$5
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        ((HwDialogCustomerServiceBinding) getMBindView()).setVm(m5650n());
        ((HwDialogCustomerServiceBinding) getMBindView()).setOnClickListener(this);
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.hw_dialog_customer_service;
    }

    /* renamed from: n */
    public final CustomerServiceViewModel m5650n() {
        return (CustomerServiceViewModel) this.viewModel.getValue();
    }

    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.ivClose) {
            FragmentKt.findNavController(this).navigateUp();
        }
    }
}
