package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.view.View;
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
import androidx.navigation.NavArgsLazy;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CourseManageAdapter;
import com.zykj.study.databinding.DialogCourseManageBinding;
import com.zykj.study.p065ui.home.p066my.CourseManageDialogFragment;
import com.zykj.study.viewmodels.CourseManageVewModel;
import java.util.List;
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
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseManageDialogFragment extends Hilt_CourseManageDialogFragment<DialogCourseManageBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12864f = new NavArgsLazy(AbstractC9137y.m16154b(CourseManageDialogFragmentArgs.class), new C7991a(this));

    /* renamed from: g */
    public final InterfaceC8724d f12865g;

    /* renamed from: h */
    public final InterfaceC8724d f12866h;

    /* renamed from: com.zykj.study.ui.home.my.CourseManageDialogFragment$a */
    public static final class C7991a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12874a;

        public C7991a(Fragment fragment) {
            this.f12874a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12874a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12874a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseManageDialogFragment$initView$3", m17801f = "CourseManageDialogFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.CourseManageDialogFragment$initView$3 */
    public static final class C79923 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12875a;

        /* renamed from: b */
        public /* synthetic */ Object f12876b;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseManageDialogFragment$initView$3$1", m17801f = "CourseManageDialogFragment.kt", m17802l = {55}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.CourseManageDialogFragment$initView$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12878a;

            /* renamed from: b */
            public final /* synthetic */ CourseManageDialogFragment f12879b;

            @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseManageDialogFragment$initView$3$1$1", m17801f = "CourseManageDialogFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.study.ui.home.my.CourseManageDialogFragment$initView$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107991 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f12880a;

                /* renamed from: b */
                public /* synthetic */ Object f12881b;

                /* renamed from: c */
                public final /* synthetic */ CourseManageDialogFragment f12882c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107991(CourseManageDialogFragment courseManageDialogFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f12882c = courseManageDialogFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, InterfaceC9324c interfaceC9324c) {
                    return ((C107991) create(list, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    C107991 c107991 = new C107991(this.f12882c, interfaceC9324c);
                    c107991.f12881b = obj;
                    return c107991;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    List list = (List) this.f12881b;
                    AbstractC9434a.m17291f();
                    if (this.f12880a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.f12882c.m11257s().submitList(list);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CourseManageDialogFragment courseManageDialogFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f12879b = courseManageDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f12879b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f12878a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12052f = this.f12879b.m11258t().m12052f();
                    C107991 c107991 = new C107991(this.f12879b, null);
                    this.f12878a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12052f, c107991, this) == objM17291f) {
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

        public C79923(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C79923 c79923 = CourseManageDialogFragment.this.new C79923(interfaceC9324c);
            c79923.f12876b = obj;
            return c79923;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79923) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f12876b;
            AbstractC9434a.m17291f();
            if (this.f12875a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(CourseManageDialogFragment.this, null), 3, null);
            return C8736p.f16368a;
        }
    }

    public CourseManageDialogFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseManageDialogFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseManageDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12865g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseManageVewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseManageDialogFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseManageDialogFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseManageDialogFragment$special$$inlined$viewModels$default$5
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
        this.f12866h = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.q
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseManageDialogFragment.m11251n(this.f2229a);
            }
        });
    }

    /* renamed from: n */
    public static final CourseManageAdapter m11251n(final CourseManageDialogFragment courseManageDialogFragment) {
        return new CourseManageAdapter(new InterfaceC10574p() { // from class: b5.s
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return CourseManageDialogFragment.m11252o(this.f2246a, ((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
            }
        }, new InterfaceC10574p() { // from class: b5.t
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return CourseManageDialogFragment.m11253p(this.f2251a, ((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
            }
        }, new InterfaceC10574p() { // from class: b5.u
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return CourseManageDialogFragment.m11254q(this.f2258a, ((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* renamed from: o */
    public static final C8736p m11252o(CourseManageDialogFragment courseManageDialogFragment, long j10, boolean z10) {
        courseManageDialogFragment.m11258t().m12055i(j10, z10);
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final C8736p m11253p(CourseManageDialogFragment courseManageDialogFragment, long j10, boolean z10) {
        courseManageDialogFragment.m11258t().m12056j(j10, z10);
        return C8736p.f16368a;
    }

    /* renamed from: q */
    public static final C8736p m11254q(CourseManageDialogFragment courseManageDialogFragment, long j10, boolean z10) {
        courseManageDialogFragment.m11258t().m12058l(j10, z10);
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final void m11255u(CourseManageDialogFragment courseManageDialogFragment, View view) {
        courseManageDialogFragment.dismissAllowingStateLoss();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        m11258t().m12054h(m11256r().m11261a());
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((DialogCourseManageBinding) getMBindView()).ivClose.setOnClickListener(new View.OnClickListener() { // from class: b5.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseManageDialogFragment.m11255u(this.f2238a, view);
            }
        });
        ((DialogCourseManageBinding) getMBindView()).recyclerView.setAdapter(m11257s());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C79923(null), 3, null);
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_course_manage;
    }

    /* renamed from: r */
    public final CourseManageDialogFragmentArgs m11256r() {
        return (CourseManageDialogFragmentArgs) this.f12864f.getValue();
    }

    /* renamed from: s */
    public final CourseManageAdapter m11257s() {
        return (CourseManageAdapter) this.f12866h.getValue();
    }

    /* renamed from: t */
    public final CourseManageVewModel m11258t() {
        return (CourseManageVewModel) this.f12865g.getValue();
    }
}
