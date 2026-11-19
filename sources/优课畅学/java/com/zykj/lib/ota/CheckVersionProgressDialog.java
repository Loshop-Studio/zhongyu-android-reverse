package com.zykj.lib.ota;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.ota.CheckVersionProgressDialog;
import com.zykj.lib.ota.bean.VersionInfo;
import com.zykj.lib.ota.databinding.DialogCheckVersionProgressBinding;
import com.zykj.lib.ota.viewmodel.VersionViewModel;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class CheckVersionProgressDialog extends Hilt_CheckVersionProgressDialog<DialogCheckVersionProgressBinding> {

    /* renamed from: f */
    public final NavArgsLazy f10151f = new NavArgsLazy(AbstractC9137y.m16154b(CheckVersionProgressDialogArgs.class), new C7360b(this));

    /* renamed from: g */
    public final InterfaceC8724d f10152g;

    /* renamed from: com.zykj.lib.ota.CheckVersionProgressDialog$a */
    public static final class C7359a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f10160a;

        public C7359a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f10160a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f10160a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10160a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.lib.ota.CheckVersionProgressDialog$b */
    public static final class C7360b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10161a;

        public C7360b(Fragment fragment) {
            this.f10161a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10161a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10161a + " has null arguments");
        }
    }

    public CheckVersionProgressDialog() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.lib.ota.CheckVersionProgressDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.lib.ota.CheckVersionProgressDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f10152g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(VersionViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.ota.CheckVersionProgressDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.ota.CheckVersionProgressDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.ota.CheckVersionProgressDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* renamed from: k */
    public static final C8736p m9414k(CheckVersionProgressDialog checkVersionProgressDialog, VersionInfo versionInfo) {
        if (versionInfo == null) {
            FragmentKt.findNavController(checkVersionProgressDialog).navigateUp();
            return C8736p.f16368a;
        }
        if (versionInfo.getVersionCode() > checkVersionProgressDialog.m9416i().m9422d()) {
            FragmentKt.findNavController(checkVersionProgressDialog).navigate(AbstractC7373a.f10222a.m9460b(versionInfo));
        } else {
            if (checkVersionProgressDialog.m9416i().m9421c()) {
                FragmentKt.findNavController(checkVersionProgressDialog).navigateUp();
                return C8736p.f16368a;
            }
            FragmentKt.findNavController(checkVersionProgressDialog).navigate(AbstractC7373a.f10222a.m9459a(checkVersionProgressDialog.m9416i().m9423e()));
        }
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public static final C8736p m9415l(CheckVersionProgressDialog checkVersionProgressDialog, ToastMessage toastMessage) {
        if ((toastMessage instanceof ToastErrorMessage) || (toastMessage instanceof ToastErrorCodeMessage)) {
            Integer messageResId = toastMessage.getMessageResId();
            if (messageResId != null) {
                XToastUtils.INSTANCE.error(messageResId.intValue());
                checkVersionProgressDialog.dismiss();
                return C8736p.f16368a;
            }
            String message = toastMessage.getMessage();
            if (message != null) {
                XToastUtils.INSTANCE.error(message);
                checkVersionProgressDialog.dismiss();
                return C8736p.f16368a;
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: i */
    public final CheckVersionProgressDialogArgs m9416i() {
        return (CheckVersionProgressDialogArgs) this.f10151f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((DialogCheckVersionProgressBinding) getMBindView()).mo9476a(m9416i().m9421c());
        m9417j().m9495g(m9416i().m9420b(), m9416i().m9422d(), m9416i().m9419a());
        m9417j().m9497i().observe(getViewLifecycleOwner(), new C7359a(new InterfaceC10570l() { // from class: s3.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CheckVersionProgressDialog.m9414k(this.f20020a, (VersionInfo) obj);
            }
        }));
        m9417j().getToastLiveData().observe(getViewLifecycleOwner(), new C7359a(new InterfaceC10570l() { // from class: s3.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CheckVersionProgressDialog.m9415l(this.f20021a, (ToastMessage) obj);
            }
        }));
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final VersionViewModel m9417j() {
        return (VersionViewModel) this.f10152g.getValue();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_check_version_progress;
    }
}
