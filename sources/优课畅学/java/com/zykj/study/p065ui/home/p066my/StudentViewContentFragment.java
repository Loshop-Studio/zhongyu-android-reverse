package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CatalogProgressAdapter;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.bean.teach.SuperviseGroupSelectBean;
import com.zykj.study.databinding.FragmentStudentViewContentBinding;
import com.zykj.study.p065ui.home.p066my.AbstractC8109o;
import com.zykj.study.p065ui.home.p066my.StudentViewContentFragment;
import com.zykj.study.viewmodels.StudentViewContentViewModel;
import com.zykj.study.viewmodels.StudentViewViewModel;
import java.util.HashSet;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudentViewContentFragment extends Hilt_StudentViewContentFragment<FragmentStudentViewContentBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13347f;

    /* renamed from: g */
    public final InterfaceC8724d f13348g;

    /* renamed from: h */
    public CatalogProgressAdapter f13349h;

    /* renamed from: com.zykj.study.ui.home.my.StudentViewContentFragment$a */
    public static final class C8065a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13363a;

        public C8065a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13363a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13363a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13363a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewContentFragment", m17801f = "StudentViewContentFragment.kt", m17802l = {31}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.StudentViewContentFragment$initData$1 */
    public static final class C80661 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13364a;

        /* renamed from: c */
        public int f13366c;

        public C80661(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13364a = obj;
            this.f13366c |= Integer.MIN_VALUE;
            return StudentViewContentFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewContentFragment$initData$2", m17801f = "StudentViewContentFragment.kt", m17802l = {36}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.StudentViewContentFragment$initData$2 */
    public static final class C80672 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13367a;

        public C80672(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static final C8736p m11630d(StudentViewContentFragment studentViewContentFragment, CatalogBean catalogBean) {
            SuperviseGroupMember superviseGroupMember;
            String userId;
            Integer num = (Integer) studentViewContentFragment.m11628m().m12273h().getValue();
            if (num == null) {
                return C8736p.f16368a;
            }
            int iIntValue = num.intValue();
            SuperviseGroupSelectBean superviseGroupSelectBean = (SuperviseGroupSelectBean) studentViewContentFragment.m11628m().m12269d().getValue();
            if (superviseGroupSelectBean == null || (superviseGroupMember = superviseGroupSelectBean.getSuperviseGroupMember()) == null || (userId = superviseGroupMember.getUserId()) == null) {
                return C8736p.f16368a;
            }
            FragmentKt.findNavController(studentViewContentFragment).navigate(AbstractC8109o.c.m11806c(AbstractC8109o.f13580a, iIntValue, catalogBean.getTitle(), catalogBean.getId(), userId, false, 16, null));
            return C8736p.f16368a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudentViewContentFragment.this.new C80672(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80672) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13367a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c data = StudentViewContentFragment.this.m11627l().m12264d().getData();
                this.f13367a = 1;
                obj = AbstractC9268e.m17036z(data, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            UserBean userBean = (UserBean) obj;
            boolean z10 = (userBean != null ? userBean.getRole() : null) == RoleType.Teacher;
            HashSet hashSetM12263c = StudentViewContentFragment.this.m11627l().m12263c();
            final StudentViewContentFragment studentViewContentFragment = StudentViewContentFragment.this;
            return new CatalogProgressAdapter(z10, hashSetM12263c, new InterfaceC10570l() { // from class: com.zykj.study.ui.home.my.l
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return StudentViewContentFragment.C80672.m11630d(studentViewContentFragment, (CatalogBean) obj2);
                }
            });
        }
    }

    public StudentViewContentFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: b5.d4
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return StudentViewContentFragment.m11626p(this.f2139a);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13347f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudentViewViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$4
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f13348g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudentViewContentViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$8
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewContentFragment$special$$inlined$viewModels$default$9
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final C8736p m11624n(StudentViewContentFragment studentViewContentFragment, SuperviseGroupSelectBean superviseGroupSelectBean) {
        if (superviseGroupSelectBean != null) {
            studentViewContentFragment.m11627l().m12265e(superviseGroupSelectBean.getSuperviseGroup().getId(), superviseGroupSelectBean.getSuperviseGroupMember().getUserId());
            ((FragmentStudentViewContentBinding) studentViewContentFragment.getMBindView()).recycler.scrollToPosition(0);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final C8736p m11625o(StudentViewContentFragment studentViewContentFragment, List list) {
        CatalogProgressAdapter catalogProgressAdapter = studentViewContentFragment.f13349h;
        if (catalogProgressAdapter != null) {
            catalogProgressAdapter.m9946g(list == null ? AbstractC8809v.m14771n() : list);
        }
        if (list == null || list.isEmpty()) {
            ((FragmentStudentViewContentBinding) studentViewContentFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_no_catalog);
        } else {
            ((FragmentStudentViewContentBinding) studentViewContentFragment.getMBindView()).multipleStatusView.m11961f();
        }
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final ViewModelStoreOwner m11626p(StudentViewContentFragment studentViewContentFragment) {
        Fragment fragmentRequireParentFragment = studentViewContentFragment.requireParentFragment();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.StudentViewContentFragment.C80661
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.StudentViewContentFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.StudentViewContentFragment.C80661) r0
            int r1 = r0.f13366c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13366c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.StudentViewContentFragment$initData$1 r0 = new com.zykj.study.ui.home.my.StudentViewContentFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13364a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13366c
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
            r0.f13366c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.ui.home.my.StudentViewContentFragment$initData$2 r5 = new com.zykj.study.ui.home.my.StudentViewContentFragment$initData$2
            r0 = 0
            r5.<init>(r0)
            java.lang.Object r5 = p135i8.AbstractC8833f.m14847f(r0, r5, r3, r0)
            com.zykj.study.adapter.CatalogProgressAdapter r5 = (com.zykj.study.adapter.CatalogProgressAdapter) r5
            r4.f13349h = r5
            com.zykj.study.viewmodels.StudentViewViewModel r5 = r4.m11628m()
            androidx.lifecycle.MutableLiveData r5 = r5.m12269d()
            b5.e4 r0 = new b5.e4
            r0.<init>()
            com.zykj.study.ui.home.my.StudentViewContentFragment$a r1 = new com.zykj.study.ui.home.my.StudentViewContentFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.StudentViewContentFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentViewContentFragment.smali:499
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentStudentViewContentBinding) getMBindView()).setEntity(m11628m());
        ((FragmentStudentViewContentBinding) getMBindView()).recycler.setAdapter(this.f13349h);
        if (((SuperviseGroupSelectBean) m11628m().m12269d().getValue()) == null) {
            ((FragmentStudentViewContentBinding) getMBindView()).multipleStatusView.m11963h();
            C8736p c8736p = C8736p.f16368a;
        }
        m11627l().m12261a().observe(getViewLifecycleOwner(), new C8065a(new InterfaceC10570l() { // from class: b5.c4
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return StudentViewContentFragment.m11625o(this.f2133a, (List) obj);
            }
        }));
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final StudentViewContentViewModel m11627l() {
        return (StudentViewContentViewModel) this.f13348g.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_student_view_content;
    }

    /* renamed from: m */
    public final StudentViewViewModel m11628m() {
        return (StudentViewViewModel) this.f13347f.getValue();
    }
}
