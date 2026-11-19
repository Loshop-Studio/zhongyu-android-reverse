package com.zykj.study.p065ui.home.study;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.http.bean.HeaderBean;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.CatalogProgressAdapter;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.databinding.FragmentStudyProgressBinding;
import com.zykj.study.p065ui.home.study.StudyProgressFragment;
import com.zykj.study.viewmodels.NotifyDataChangedViewModel;
import com.zykj.study.viewmodels.StudyViewModel;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.C8356e;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p275v4.AbstractC10244c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudyProgressFragment extends Hilt_StudyProgressFragment<FragmentStudyProgressBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13666f;

    /* renamed from: g */
    public final InterfaceC8724d f13667g;

    /* renamed from: h */
    public CatalogProgressAdapter f13668h;

    /* renamed from: com.zykj.study.ui.home.study.StudyProgressFragment$a */
    public static final /* synthetic */ class C8123a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13679a;

        static {
            int[] iArr = new int[CourseType.values().length];
            try {
                iArr[CourseType.UNDERCARRIAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseType.GROUNDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseType.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13679a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.study.StudyProgressFragment$b */
    public static final class C8124b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13680a;

        public C8124b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13680a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13680a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13680a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyProgressFragment", m17801f = "StudyProgressFragment.kt", m17802l = {41}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.study.StudyProgressFragment$initData$1 */
    public static final class C81251 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13681a;

        /* renamed from: c */
        public int f13683c;

        public C81251(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13681a = obj;
            this.f13683c |= Integer.MIN_VALUE;
            return StudyProgressFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyProgressFragment$initData$2", m17801f = "StudyProgressFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.study.StudyProgressFragment$initData$2 */
    public static final class C81262 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13684a;

        public C81262(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyProgressFragment.this.new C81262(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81262) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f13684a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ((FragmentStudyProgressBinding) StudyProgressFragment.this.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_not_selected);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyProgressFragment", m17801f = "StudyProgressFragment.kt", m17802l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m17803m = "initView")
    /* renamed from: com.zykj.study.ui.home.study.StudyProgressFragment$initView$1 */
    public static final class C81271 extends ContinuationImpl {

        /* renamed from: a */
        public Object f13689a;

        /* renamed from: b */
        public Object f13690b;

        /* renamed from: c */
        public /* synthetic */ Object f13691c;

        /* renamed from: e */
        public int f13693e;

        public C81271(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13691c = obj;
            this.f13693e |= Integer.MIN_VALUE;
            return StudyProgressFragment.this.initView(null, this);
        }
    }

    public StudyProgressFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: d5.f
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return StudyProgressFragment.m11838D(this.f15703a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13666f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudyViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$viewModels$default$4
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
        this.f13667g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(NotifyDataChangedViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyProgressFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static final C8736p m11835A(StudyProgressFragment studyProgressFragment, CatalogBean catalogBean) {
        AbstractC9133u.m16133g(catalogBean, "catalogBean");
        CourseStudyEntity courseStudyEntity = (CourseStudyEntity) studyProgressFragment.m11851s().m12289l().getValue();
        if (courseStudyEntity != null) {
            FragmentKt.findNavController(studyProgressFragment).navigate(AbstractC10244c.f20434a.m19158a(courseStudyEntity, false, null, C8356e.f15876a.m13621c() + "?token=" + ((HeaderBean) studyProgressFragment.m11851s().m12285h().getValue()).getAccessToken() + "&url=" + ((HeaderBean) studyProgressFragment.m11851s().m12285h().getValue()).getServerUrl() + "#/?entry=study&catalogId=" + catalogBean.getId() + "&courseId=" + courseStudyEntity.getId(), catalogBean.getTitle()));
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static final C8736p m11836B(StudyProgressFragment studyProgressFragment, CourseStudyEntity courseStudyEntity) {
        boolean zBooleanValue = ((Boolean) studyProgressFragment.m11850r().m12235b().getValue()).booleanValue();
        if (courseStudyEntity == null || zBooleanValue) {
            ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_not_selected);
            return C8736p.f16368a;
        }
        if (courseStudyEntity.getStatus() == CourseType.DELETE) {
            LifecycleOwner viewLifecycleOwner = studyProgressFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new StudyProgressFragment$initView$5$1(studyProgressFragment, null));
        }
        if (courseStudyEntity.getStatus() == CourseType.UNDERCARRIAGE) {
            LifecycleOwner viewLifecycleOwner2 = studyProgressFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new StudyProgressFragment$initView$5$2(studyProgressFragment, null));
        }
        LifecycleOwner viewLifecycleOwner3 = studyProgressFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenResumed(new StudyProgressFragment$initView$5$3(studyProgressFragment, courseStudyEntity, null));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public static final C8736p m11837C(StudyProgressFragment studyProgressFragment, CourseDetailsBean courseDetailsBean) {
        CatalogProgressAdapter catalogProgressAdapter = null;
        if (courseDetailsBean == null) {
            if (studyProgressFragment.m11851s().m12289l().getValue() == 0) {
                ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).setEntity(null);
                CatalogProgressAdapter catalogProgressAdapter2 = studyProgressFragment.f13668h;
                if (catalogProgressAdapter2 == null) {
                    AbstractC9133u.m16151y("catalogProgressAdapter");
                } else {
                    catalogProgressAdapter = catalogProgressAdapter2;
                }
                catalogProgressAdapter.m9946g(AbstractC8809v.m14771n());
                ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_not_selected);
            } else {
                ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11966k();
            }
            return C8736p.f16368a;
        }
        ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).setEntity(courseDetailsBean);
        int i10 = C8123a.f13679a[courseDetailsBean.getStatus().ordinal()];
        if (i10 == 1) {
            ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_undercarriage);
        } else if (i10 == 2) {
            List<CatalogBean> catalogs = courseDetailsBean.getCatalogs();
            if (catalogs == null || !catalogs.isEmpty()) {
                CatalogProgressAdapter catalogProgressAdapter3 = studyProgressFragment.f13668h;
                if (catalogProgressAdapter3 == null) {
                    AbstractC9133u.m16151y("catalogProgressAdapter");
                } else {
                    catalogProgressAdapter = catalogProgressAdapter3;
                }
                catalogProgressAdapter.m9946g(studyProgressFragment.m11851s().m12280b(courseDetailsBean.getCatalogs()));
                ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11961f();
            } else {
                CatalogProgressAdapter catalogProgressAdapter4 = studyProgressFragment.f13668h;
                if (catalogProgressAdapter4 == null) {
                    AbstractC9133u.m16151y("catalogProgressAdapter");
                } else {
                    catalogProgressAdapter = catalogProgressAdapter4;
                }
                catalogProgressAdapter.m9946g(AbstractC8809v.m14771n());
                ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_no_catalog);
            }
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_delete);
        }
        return C8736p.f16368a;
    }

    /* renamed from: D */
    public static final ViewModelStoreOwner m11838D(StudyProgressFragment studyProgressFragment) {
        Fragment fragmentRequireParentFragment = studyProgressFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: r */
    private final NotifyDataChangedViewModel m11850r() {
        return (NotifyDataChangedViewModel) this.f13667g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final StudyViewModel m11851s() {
        return (StudyViewModel) this.f13666f.getValue();
    }

    /* renamed from: u */
    public static final void m11852u(final StudyProgressFragment studyProgressFragment, View view) {
        new MaterialDialog.C6913g(studyProgressFragment.requireContext()).m6749j(studyProgressFragment.getString(R$string.is_need_teach_course)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: d5.n
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                StudyProgressFragment.m11853v(this.f15711a, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: v */
    public static final void m11853v(StudyProgressFragment studyProgressFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        studyProgressFragment.m11851s().m12294q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final void m11854w(StudyProgressFragment studyProgressFragment, View view) {
        CourseStudyEntity courseStudyEntity = (CourseStudyEntity) studyProgressFragment.m11851s().m12289l().getValue();
        if (courseStudyEntity != null) {
            LifecycleOwner viewLifecycleOwner = studyProgressFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new StudyProgressFragment$initListener$3$1$1(studyProgressFragment, courseStudyEntity, null));
        }
    }

    /* renamed from: x */
    public static final void m11855x(final StudyProgressFragment studyProgressFragment, View view) {
        new MaterialDialog.C6913g(studyProgressFragment.requireContext()).m6749j(studyProgressFragment.getString(R$string.is_need_unsubscribe_course)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: d5.o
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                StudyProgressFragment.m11856y(this.f15712a, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: y */
    public static final void m11856y(StudyProgressFragment studyProgressFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        studyProgressFragment.m11851s().m12295r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static final C8736p m11857z(StudyProgressFragment studyProgressFragment, UserBean userBean) {
        ((FragmentStudyProgressBinding) studyProgressFragment.getMBindView()).setUserInfo(userBean);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.study.StudyProgressFragment.C81251
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.study.StudyProgressFragment$initData$1 r0 = (com.zykj.study.p065ui.home.study.StudyProgressFragment.C81251) r0
            int r1 = r0.f13683c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13683c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.study.StudyProgressFragment$initData$1 r0 = new com.zykj.study.ui.home.study.StudyProgressFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13681a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13683c
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
            r0.f13683c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.study.StudyProgressFragment$initData$2 r0 = new com.zykj.study.ui.home.study.StudyProgressFragment$initData$2
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.study.StudyProgressFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/StudyProgressFragment.smali:1698
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initView(android.os.Bundle r11, p179m7.InterfaceC9324c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.study.StudyProgressFragment.initView(android.os.Bundle, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/StudyProgressFragment.smali:1865
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_study_progress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final void m11858t() {
        ((FragmentStudyProgressBinding) getMBindView()).courseStatusBtn.btSubscribeCancel.setOnClickListener(new View.OnClickListener() { // from class: d5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudyProgressFragment.m11855x(this.f15708a, view);
            }
        });
        ((FragmentStudyProgressBinding) getMBindView()).courseStatusBtn.btnChoiceToTeach.setOnClickListener(new View.OnClickListener() { // from class: d5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudyProgressFragment.m11852u(this.f15709a, view);
            }
        });
        ((FragmentStudyProgressBinding) getMBindView()).multipleStatusView.setOnRetryClickListener(new View.OnClickListener() { // from class: d5.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudyProgressFragment.m11854w(this.f15710a, view);
            }
        });
    }
}
