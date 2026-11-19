package com.zykj.lib.login.p062ui.teacher.pwd;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.bean.toast.ToastInfoMessage;
import com.zykj.lib.login.R$layout;
import com.zykj.lib.login.R$string;
import com.zykj.lib.login.databinding.LoginDialogChangePwdBinding;
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
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ChangePwdDialog extends Hilt_ChangePwdDialog<LoginDialogChangePwdBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f10024f;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2", m17801f = "ChangePwdDialog.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2 */
    public static final class C73442 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10032a;

        /* renamed from: b */
        public /* synthetic */ Object f10033b;

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2$1", m17801f = "ChangePwdDialog.kt", m17802l = {36}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f10035a;

            /* renamed from: b */
            public final /* synthetic */ ChangePwdDialog f10036b;

            @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2$1$1", m17801f = "ChangePwdDialog.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107961 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f10037a;

                /* renamed from: b */
                public /* synthetic */ boolean f10038b;

                /* renamed from: c */
                public final /* synthetic */ ChangePwdDialog f10039c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107961(ChangePwdDialog changePwdDialog, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f10039c = changePwdDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    C107961 c107961 = new C107961(this.f10039c, interfaceC9324c);
                    c107961.f10038b = ((Boolean) obj).booleanValue();
                    return c107961;
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z10 = this.f10038b;
                    AbstractC9434a.m17291f();
                    if (this.f10037a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    if (z10) {
                        this.f10039c.m9343h().getToastLiveData().postValue(new ToastInfoMessage(this.f10039c.getString(R$string.reLogin), null, 2, null));
                    }
                    FragmentKt.findNavController(this.f10039c).navigateUp();
                    return C8736p.f16368a;
                }

                public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                    return ((C107961) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChangePwdDialog changePwdDialog, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f10036b = changePwdDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f10036b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f10035a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM9346c = this.f10036b.m9343h().m9346c();
                    C107961 c107961 = new C107961(this.f10036b, null);
                    this.f10035a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9275lM9346c, c107961, this) == objM17291f) {
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

        public C73442(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73442 c73442 = ChangePwdDialog.this.new C73442(interfaceC9324c);
            c73442.f10033b = obj;
            return c73442;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73442) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f10033b;
            AbstractC9434a.m17291f();
            if (this.f10032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(ChangePwdDialog.this, null), 3, null);
            return C8736p.f16368a;
        }
    }

    public ChangePwdDialog() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f10024f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ChangePwdViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$special$$inlined$viewModels$default$5
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

    /* renamed from: h */
    public final ChangePwdViewModel m9343h() {
        return (ChangePwdViewModel) this.f10024f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((LoginDialogChangePwdBinding) getMBindView()).mo9240a(m9343h());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C73442(null), 3, null);
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.login_dialog_change_pwd;
    }
}
