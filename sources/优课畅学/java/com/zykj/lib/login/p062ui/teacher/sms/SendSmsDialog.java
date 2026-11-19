package com.zykj.lib.login.p062ui.teacher.sms;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.lib.login.R$id;
import com.zykj.lib.login.R$layout;
import com.zykj.lib.login.bean.LoginInfo;
import com.zykj.lib.login.databinding.LoginDialogSendSmsBinding;
import com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel;
import com.zykj.lib.login.p062ui.teacher.sms.SendSmsDialog;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p153k4.AbstractC9055b;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SendSmsDialog extends Hilt_SendSmsDialog<LoginDialogSendSmsBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f10104f;

    /* renamed from: g */
    public final InterfaceC8724d f10105g;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$initView$2", m17801f = "SendSmsDialog.kt", m17802l = {39}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$initView$2 */
    public static final class C73572 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10119a;

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$initView$2$1", m17801f = "SendSmsDialog.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f10121a;

            /* renamed from: b */
            public /* synthetic */ Object f10122b;

            /* renamed from: c */
            public final /* synthetic */ SendSmsDialog f10123c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SendSmsDialog sendSmsDialog, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f10123c = sendSmsDialog;
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(LoginInfo loginInfo, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(loginInfo, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10123c, interfaceC9324c);
                anonymousClass1.f10122b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                LoginInfo loginInfo = (LoginInfo) this.f10122b;
                AbstractC9434a.m17291f();
                if (this.f10121a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                FragmentKt.findNavController(this.f10123c).navigateUp();
                this.f10123c.m9398k().m9325j(loginInfo);
                return C8736p.f16368a;
            }
        }

        public C73572(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return SendSmsDialog.this.new C73572(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73572) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f10119a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9275l interfaceC9275lM9404d = SendSmsDialog.this.m9399l().m9404d();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SendSmsDialog.this, null);
                this.f10119a = 1;
                if (AbstractC9268e.m17019i(interfaceC9275lM9404d, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public SendSmsDialog() {
        final int i10 = R$id.nav_login;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f10104f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TeacherLoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelProviderFactory());
            }
        });
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f10105g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(SendSmsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$special$$inlined$viewModels$default$5
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

    /* renamed from: m */
    public static final void m9396m(SendSmsDialog sendSmsDialog, View view) {
        FragmentKt.findNavController(sendSmsDialog).navigateUp();
    }

    /* renamed from: n */
    public static final C8736p m9397n(SendSmsDialog sendSmsDialog, View it) {
        AbstractC9133u.m16133g(it, "it");
        sendSmsDialog.m9399l().m9411k();
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((LoginDialogSendSmsBinding) getMBindView()).mo9245a(m9399l());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C73572(null), 3, null);
        ((LoginDialogSendSmsBinding) getMBindView()).f9860d.setOnClickListener(new View.OnClickListener() { // from class: r3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendSmsDialog.m9396m(this.f19865a, view);
            }
        });
        TextView tvConfirm = ((LoginDialogSendSmsBinding) getMBindView()).f9861e;
        AbstractC9133u.m16132f(tvConfirm, "tvConfirm");
        AbstractC9055b.m15859e(tvConfirm, new InterfaceC10570l() { // from class: r3.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SendSmsDialog.m9397n(this.f19866a, (View) obj);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: k */
    public final TeacherLoginViewModel m9398k() {
        return (TeacherLoginViewModel) this.f10104f.getValue();
    }

    /* renamed from: l */
    public final SendSmsViewModel m9399l() {
        return (SendSmsViewModel) this.f10105g.getValue();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.login_dialog_send_sms;
    }
}
