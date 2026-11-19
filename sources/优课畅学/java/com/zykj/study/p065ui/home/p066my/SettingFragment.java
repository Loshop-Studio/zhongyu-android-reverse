package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.FragmentSettingBinding;
import com.zykj.study.p065ui.home.p066my.SettingFragment;
import com.zykj.study.viewmodels.SettingViewModel;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8366o;
import p086e5.C8360i;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SettingFragment extends Hilt_SettingFragment<FragmentSettingBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13300f;

    /* renamed from: g */
    public final InterfaceC8724d f13301g;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.SettingFragment", m17801f = "SettingFragment.kt", m17802l = {40}, m17803m = "initView")
    /* renamed from: com.zykj.study.ui.home.my.SettingFragment$initView$1 */
    public static final class C80561 extends ContinuationImpl {

        /* renamed from: a */
        public Object f13315a;

        /* renamed from: b */
        public Object f13316b;

        /* renamed from: c */
        public /* synthetic */ Object f13317c;

        /* renamed from: e */
        public int f13319e;

        public C80561(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13317c = obj;
            this.f13319e |= Integer.MIN_VALUE;
            return SettingFragment.this.initView(null, this);
        }
    }

    public SettingFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13300f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(SettingViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$viewModels$default$5
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
        this.f13301g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                return (interfaceC10559a3 == null || (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.SettingFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final LoginViewModel m11583o() {
        return (LoginViewModel) this.f13301g.getValue();
    }

    /* renamed from: p */
    public static final void m11584p(final SettingFragment settingFragment, View view) {
        new MaterialDialog.C6913g(settingFragment.requireContext()).m6749j(settingFragment.getString(R$string.is_need_exit_login)).m6765z(R$string.lab_yes).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.r3
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                SettingFragment.m11585q(this.f2242a, materialDialog, dialogAction);
            }
        }).m6759t(R$string.lab_no).m6734E();
    }

    /* renamed from: q */
    public static final void m11585q(SettingFragment settingFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        settingFragment.m11583o().m9293a();
    }

    /* renamed from: r */
    public static final void m11586r(SettingFragment settingFragment, View view) {
        settingFragment.m11589m();
    }

    /* renamed from: s */
    public static final void m11587s(final SettingFragment settingFragment, View view) {
        new MaterialDialog.C6913g(settingFragment.requireContext()).m6749j(settingFragment.getString(R$string.is_need_clear_app_cache)).m6765z(R$string.lab_yes).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.q3
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                SettingFragment.m11588t(this.f2234a, materialDialog, dialogAction);
            }
        }).m6759t(R$string.lab_no).m6734E();
    }

    /* renamed from: t */
    public static final void m11588t(SettingFragment settingFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        C8360i c8360i = C8360i.f15886a;
        Context contextRequireContext = settingFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        c8360i.m13632a(contextRequireContext);
        AbstractC8366o.m13652d(XToastUtils.INSTANCE, "缓存已清理");
        settingFragment.m11591u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initView(android.os.Bundle r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.SettingFragment.initView(android.os.Bundle, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/SettingFragment.smali:557
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_setting;
    }

    /* renamed from: m */
    public final void m11589m() {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SettingFragment$checkVersion$1(this, null), 3, null);
    }

    /* renamed from: n */
    public final SettingViewModel m11590n() {
        return (SettingViewModel) this.f13300f.getValue();
    }

    /* renamed from: u */
    public final void m11591u() {
        C8360i c8360i = C8360i.f15886a;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        m11590n().m12254a().set(c8360i.m13637f(contextRequireContext));
    }
}
