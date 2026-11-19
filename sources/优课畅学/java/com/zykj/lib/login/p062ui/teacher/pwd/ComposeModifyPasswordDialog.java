package com.zykj.lib.login.p062ui.teacher.pwd;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p013ui.platform.ComposeView;
import androidx.compose.p013ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.utils.AbstractC6880j;
import com.zykj.lib.login.p062ui.teacher.pwd.AbstractC7355b;
import com.zykj.lib.login.p062ui.teacher.pwd.ComposeModifyPasswordDialog;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ComposeModifyPasswordDialog extends Hilt_ComposeModifyPasswordDialog {

    /* renamed from: f */
    public final InterfaceC8724d f10059f;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$onViewCreated$1", m17801f = "ComposeModifyPasswordDialog.kt", m17802l = {C3721BR.versionViewModel}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$onViewCreated$1 */
    public static final class C73511 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10067a;

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$onViewCreated$1$1", m17801f = "ComposeModifyPasswordDialog.kt", m17802l = {C3721BR.viewModel}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f10069a;

            /* renamed from: b */
            public final /* synthetic */ ComposeModifyPasswordDialog f10070b;

            /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$onViewCreated$1$1$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ComposeModifyPasswordDialog f10071a;

                public a(ComposeModifyPasswordDialog composeModifyPasswordDialog) {
                    this.f10071a = composeModifyPasswordDialog;
                }

                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC7355b abstractC7355b, InterfaceC9324c interfaceC9324c) {
                    if (abstractC7355b instanceof AbstractC7355b.b) {
                        AbstractC9536a.m17796a(FragmentKt.findNavController(this.f10071a).navigateUp());
                    } else {
                        if (!(abstractC7355b instanceof AbstractC7355b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC6880j.m6505a(((AbstractC7355b.a) abstractC7355b).m9388a());
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ComposeModifyPasswordDialog composeModifyPasswordDialog, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f10070b = composeModifyPasswordDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f10070b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f10069a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM9336e = this.f10070b.m9357j().m9336e();
                    a aVar = new a(this.f10070b);
                    this.f10069a = 1;
                    if (interfaceC9275lM9336e.collect(aVar, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public C73511(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return ComposeModifyPasswordDialog.this.new C73511(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73511) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f10067a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                LifecycleOwner viewLifecycleOwner = ComposeModifyPasswordDialog.this.getViewLifecycleOwner();
                AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ComposeModifyPasswordDialog.this, null);
                this.f10067a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objM17291f) {
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

    public ComposeModifyPasswordDialog() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f10059f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ChangePsdViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog$special$$inlined$viewModels$default$5
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
    public static final C8736p m9355k(final ComposeModifyPasswordDialog composeModifyPasswordDialog, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-556095008, i10, -1, "com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog.onCreateView.<anonymous>.<anonymous> (ComposeModifyPasswordDialog.kt:44)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(1613987468, true, new InterfaceC10574p() { // from class: q3.s
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeModifyPasswordDialog.m9356l(this.f19595a, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public static final C8736p m9356l(ComposeModifyPasswordDialog composeModifyPasswordDialog, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613987468, i10, -1, "com.zykj.lib.login.ui.teacher.pwd.ComposeModifyPasswordDialog.onCreateView.<anonymous>.<anonymous>.<anonymous> (ComposeModifyPasswordDialog.kt:45)");
            }
            AbstractC7354a.m9376j(composeModifyPasswordDialog.m9357j(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final ChangePsdViewModel m9357j() {
        return (ChangePsdViewModel) this.f10059f.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        AbstractC9133u.m16132f(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowCompat.setDecorFitsSystemWindows(window, false);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-556095008, true, new InterfaceC10574p() { // from class: q3.r
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ComposeModifyPasswordDialog.m9355k(this.f19594a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C73511(null), 3, null);
    }
}
