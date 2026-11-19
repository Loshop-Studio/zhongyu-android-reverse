package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.databinding.FragmentCourseViewBinding;
import com.zykj.study.p065ui.home.p066my.CourseViewFragment;
import com.zykj.study.viewmodels.CourseViewViewModel;
import com.zykj.study.viewmodels.TeachDetailsViewModel;
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
public final class CourseViewFragment extends Hilt_CourseViewFragment<FragmentCourseViewBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12901f;

    /* renamed from: g */
    public final InterfaceC8724d f12902g;

    /* renamed from: com.zykj.study.ui.home.my.CourseViewFragment$a */
    public static final class C7996a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12916a;

        public C7996a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12916a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12916a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12916a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseViewFragment", m17801f = "CourseViewFragment.kt", m17802l = {26}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.CourseViewFragment$initData$1 */
    public static final class C79971 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12917a;

        /* renamed from: c */
        public int f12919c;

        public C79971(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12917a = obj;
            this.f12919c |= Integer.MIN_VALUE;
            return CourseViewFragment.this.initData(this);
        }
    }

    public CourseViewFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: b5.g0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseViewFragment.m11286q(this.f2158a);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12901f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TeachDetailsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$4
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f12902g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseViewViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$8
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewFragment$special$$inlined$viewModels$default$9
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
    }

    /* renamed from: l */
    private final CourseViewViewModel m11282l() {
        return (CourseViewViewModel) this.f12902g.getValue();
    }

    /* renamed from: n */
    public static final C8736p m11283n(CourseViewFragment courseViewFragment, Integer num) {
        courseViewFragment.m11282l().m12067g().setValue(num);
        LifecycleOwnerKt.getLifecycleScope(courseViewFragment).launchWhenResumed(new CourseViewFragment$initData$2$1(courseViewFragment, null));
        return C8736p.f16368a;
    }

    /* renamed from: o */
    public static final C8736p m11284o(CourseViewFragment courseViewFragment, CourseBean courseBean) {
        courseViewFragment.m11282l().m12062b().setValue(courseBean);
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final C8736p m11285p(CourseViewFragment courseViewFragment, GroupMemberProgress groupMemberProgress) {
        courseViewFragment.m11282l().m12066f().setValue(null);
        courseViewFragment.m11282l().m12063c().setValue(groupMemberProgress);
        return C8736p.f16368a;
    }

    /* renamed from: q */
    public static final ViewModelStoreOwner m11286q(CourseViewFragment courseViewFragment) {
        Fragment fragmentRequireParentFragment = courseViewFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.CourseViewFragment.C79971
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.CourseViewFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.CourseViewFragment.C79971) r0
            int r1 = r0.f12919c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12919c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.CourseViewFragment$initData$1 r0 = new com.zykj.study.ui.home.my.CourseViewFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12917a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12919c
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
            r0.f12919c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11287m()
            androidx.lifecycle.MutableLiveData r5 = r5.m12302f()
            b5.d0 r0 = new b5.d0
            r0.<init>()
            com.zykj.study.ui.home.my.CourseViewFragment$a r1 = new com.zykj.study.ui.home.my.CourseViewFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11287m()
            androidx.lifecycle.MutableLiveData r5 = r5.m12297a()
            b5.e0 r0 = new b5.e0
            r0.<init>()
            com.zykj.study.ui.home.my.CourseViewFragment$a r1 = new com.zykj.study.ui.home.my.CourseViewFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11287m()
            androidx.lifecycle.MutableLiveData r5 = r5.m12299c()
            b5.f0 r0 = new b5.f0
            r0.<init>()
            com.zykj.study.ui.home.my.CourseViewFragment$a r1 = new com.zykj.study.ui.home.my.CourseViewFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.CourseViewFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseViewFragment.smali:459
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_course_view;
    }

    /* renamed from: m */
    public final TeachDetailsViewModel m11287m() {
        return (TeachDetailsViewModel) this.f12901f.getValue();
    }
}
