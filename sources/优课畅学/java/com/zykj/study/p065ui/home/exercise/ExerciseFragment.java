package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.databinding.FragmentExerciseBinding;
import com.zykj.study.p065ui.home.exercise.ExerciseFragment;
import com.zykj.study.viewmodels.ExerciseViewModel;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseFragment extends Hilt_ExerciseFragment<FragmentExerciseBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f11769f;

    /* renamed from: g */
    public final NavArgsLazy f11770g;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseFragment$a */
    public static final class C7782a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11778a;

        public C7782a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11778a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11778a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11778a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseFragment$b */
    public static final class C7783b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11779a;

        public C7783b(Fragment fragment) {
            this.f11779a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11779a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11779a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseFragment", m17801f = "ExerciseFragment.kt", m17802l = {29}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseFragment$initData$1 */
    public static final class C77841 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11780a;

        /* renamed from: c */
        public int f11782c;

        public C77841(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11780a = obj;
            this.f11782c |= Integer.MIN_VALUE;
            return ExerciseFragment.this.initData(this);
        }
    }

    public ExerciseFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11769f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseFragment$special$$inlined$viewModels$default$5
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
        this.f11770g = new NavArgsLazy(AbstractC9137y.m16154b(ExerciseFragmentArgs.class), new C7783b(this));
    }

    /* renamed from: n */
    public static final void m10533n(ExerciseFragment exerciseFragment, View view) {
        FragmentKt.findNavController(exerciseFragment).navigateUp();
    }

    /* renamed from: o */
    public static final void m10534o(ExerciseFragment exerciseFragment, View view) {
        exerciseFragment.m10538m().m12163a(exerciseFragment.m10537l().m10541b(), exerciseFragment.m10537l().m10540a(), exerciseFragment.m10537l().m10542c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final C8736p m10535p(final ExerciseFragment exerciseFragment, ExerciseBean exerciseBean) {
        if (exerciseBean == null) {
            ((FragmentExerciseBinding) exerciseFragment.getMBindView()).multipleStatusView.m7162i();
            return C8736p.f16368a;
        }
        LifecycleOwner viewLifecycleOwner = exerciseFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new ExerciseFragment$initView$4$1(exerciseBean, exerciseFragment, null));
        exerciseFragment.m10538m().getToastLiveData().observe(exerciseFragment.getViewLifecycleOwner(), new C7782a(new InterfaceC10570l() { // from class: w4.d
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseFragment.m10536q(this.f20517a, (ToastMessage) obj);
            }
        }));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final C8736p m10536q(ExerciseFragment exerciseFragment, ToastMessage toastMessage) {
        ((FragmentExerciseBinding) exerciseFragment.getMBindView()).multipleStatusView.m7162i();
        return C8736p.f16368a;
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.ExerciseFragment.C77841
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.ExerciseFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.ExerciseFragment.C77841) r0
            int r1 = r0.f11782c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11782c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.ExerciseFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.ExerciseFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11780a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11782c
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
            r0.f11782c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.ExerciseViewModel r5 = r4.m10538m()
            com.zykj.study.ui.home.exercise.ExerciseFragmentArgs r0 = r4.m10537l()
            int r0 = r0.m10541b()
            com.zykj.study.ui.home.exercise.ExerciseFragmentArgs r1 = r4.m10537l()
            int r1 = r1.m10540a()
            com.zykj.study.ui.home.exercise.ExerciseFragmentArgs r2 = r4.m10537l()
            int r2 = r2.m10542c()
            r5.m12163a(r0, r1, r2)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.ExerciseFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseFragment.smali:473
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentExerciseBinding) getMBindView()).setEntity(m10538m());
        ((FragmentExerciseBinding) getMBindView()).toolbar.m6535p(getString(R$string.arrow_left_return)).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseFragment.m10533n(this.f20509a, view);
            }
        });
        ((FragmentExerciseBinding) getMBindView()).multipleStatusView.setOnRetryClickListener(new View.OnClickListener() { // from class: w4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseFragment.m10534o(this.f20511a, view);
            }
        });
        m10538m().m12164b().observe(getViewLifecycleOwner(), new C7782a(new InterfaceC10570l() { // from class: w4.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseFragment.m10535p(this.f20514a, (ExerciseBean) obj);
            }
        }));
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final ExerciseFragmentArgs m10537l() {
        return (ExerciseFragmentArgs) this.f11770g.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise;
    }

    /* renamed from: m */
    public final ExerciseViewModel m10538m() {
        return (ExerciseViewModel) this.f11769f.getValue();
    }
}
