package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.OssData;
import com.zykj.study.databinding.FragmentMicroBinding;
import com.zykj.study.p065ui.home.find.MicroCodeFragment;
import com.zykj.study.viewmodels.MicroCodeViewModel;
import com.zykj.study.viewmodels.OssTokenViewModel;
import com.zykj.view.board.board.AbstractC8211g;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.board.board.C8208d;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p210p5.C9674a;
import p210p5.C9679b1;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroCodeFragment extends Hilt_MicroCodeFragment<FragmentMicroBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12599f = new NavArgsLazy(AbstractC9137y.m16154b(MicroCodeFragmentArgs.class), new C7942b(this));

    /* renamed from: g */
    public final InterfaceC8724d f12600g;

    /* renamed from: h */
    public final InterfaceC8724d f12601h;

    /* renamed from: i */
    public final ActivityResultLauncher f12602i;

    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$a */
    public static final class C7939a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12617a;

        public C7939a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12617a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12617a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12617a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$b */
    public static final class C7942b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12625a;

        public C7942b(Fragment fragment) {
            this.f12625a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12625a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12625a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment", m17801f = "MicroCodeFragment.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$initData$1 */
    public static final class C79431 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12626a;

        /* renamed from: c */
        public int f12628c;

        public C79431(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12626a = obj;
            this.f12628c |= Integer.MIN_VALUE;
            return MicroCodeFragment.this.initData(this);
        }
    }

    public MicroCodeFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12600g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(OssTokenViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f12601h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MicroCodeViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a4 = interfaceC10559a2;
                if (interfaceC10559a4 != null && (creationExtras = (CreationExtras) interfaceC10559a4.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.MicroCodeFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: y4.u
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MicroCodeFragment.m11064A((Boolean) obj);
            }
        });
        AbstractC9133u.m16132f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f12602i = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m11064A(Boolean it) {
        AbstractC9133u.m16133g(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m11065B(String str) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MicroCodeFragment$startUpload$1(str, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m11066D(String str, String str2, OssData ossData, String str3) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MicroCodeFragment$uploadMicroThumbnail$1(str, ossData, str3, this, str2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m11079s(String str) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MicroCodeFragment$attachmentToServer$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final MicroCodeViewModel m11080u() {
        return (MicroCodeViewModel) this.f12601h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final OssTokenViewModel m11081v() {
        return (OssTokenViewModel) this.f12600g.getValue();
    }

    /* renamed from: w */
    public static final C8736p m11082w(MicroCodeFragment microCodeFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        String string = bundle.getString("RESULT_KEY_ACTION");
        if (string != null && string.hashCode() == -978507415 && string.equals("RESULT_VALUE_ACTION_CROP")) {
            BoardBox.INSTANCE.clearLocalData(microCodeFragment.m11087t().m11103b(), microCodeFragment.requireContext());
        }
        return C8736p.f16368a;
    }

    /* renamed from: x */
    public static final C8736p m11083x(MicroCodeFragment microCodeFragment, View it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(microCodeFragment).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: y */
    public static final C8736p m11084y(MicroCodeFragment microCodeFragment, String str) {
        if (str == null) {
            return C8736p.f16368a;
        }
        FragmentKt.findNavController(microCodeFragment).navigate(AbstractC7965k.f12703a.m11144b(str));
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final C8736p m11085z(MicroCodeFragment microCodeFragment, String str) {
        FragmentKt.findNavController(microCodeFragment).navigate(AbstractC7965k.f12703a.m11143a("REQUEST_KEY_CROP", microCodeFragment.m11087t().m11103b()));
        return C8736p.f16368a;
    }

    /* renamed from: C */
    public final void m11086C(String str, String str2) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MicroCodeFragment$uploadMicro$1(this, str2, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.MicroCodeFragment.C79431
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.MicroCodeFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.MicroCodeFragment.C79431) r0
            int r1 = r0.f12628c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12628c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.MicroCodeFragment$initData$1 r0 = new com.zykj.study.ui.home.find.MicroCodeFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12626a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12628c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f12628c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            y4.v r5 = new y4.v
            r5.<init>()
            java.lang.String r0 = "REQUEST_KEY_CROP"
            androidx.fragment.app.FragmentKt.setFragmentResultListener(r4, r0, r5)
            androidx.activity.result.ActivityResultLauncher r5 = r4.f12602i
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r5.launch(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.MicroCodeFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroCodeFragment.smali:927
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        getChildFragmentManager().beginTransaction().replace(R$id.container, BoardFragment.f14833f.m12691a(m11087t().m11103b(), new C8208d(true, false, true, false, true, true, true, true, false, AbstractC8211g.a.f15026c, 266, null), new C9679b1(null, false, true, 5, 5, false, 33, null), new C9674a(false, new InterfaceC10570l() { // from class: y4.w
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCodeFragment.m11083x(this.f21104a, (View) obj);
            }
        }, new MicroCodeFragment$initView$fragment$2(this, null), new InterfaceC10570l() { // from class: y4.x
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCodeFragment.m11084y(this.f21105a, (String) obj);
            }
        }, null, null, new InterfaceC10570l() { // from class: y4.y
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCodeFragment.m11085z(this.f21106a, (String) obj);
            }
        }, null, null, null, null, null, null, 8113, null)), "black_fragment").commitNowAllowingStateLoss();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_micro;
    }

    /* renamed from: t */
    public final MicroCodeFragmentArgs m11087t() {
        return (MicroCodeFragmentArgs) this.f12599f.getValue();
    }
}
