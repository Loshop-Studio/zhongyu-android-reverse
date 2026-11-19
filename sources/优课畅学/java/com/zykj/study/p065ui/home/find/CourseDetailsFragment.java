package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.http.bean.HeaderBean;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.CatalogAdapter;
import com.zykj.study.adapter.CatalogProgressAdapter;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.databinding.FragmentCourseDetailsBinding;
import com.zykj.study.p065ui.home.find.AbstractC7956b;
import com.zykj.study.p065ui.home.find.CourseDetailsFragment;
import com.zykj.study.viewmodels.CourseDetailsViewModel;
import com.zykj.study.viewmodels.DictViewModel;
import java.util.HashSet;
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
import p086e5.AbstractC8366o;
import p086e5.C8356e;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8836g;
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
public final class CourseDetailsFragment extends Hilt_CourseDetailsFragment<FragmentCourseDetailsBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12505f = new NavArgsLazy(AbstractC9137y.m16154b(CourseDetailsFragmentArgs.class), new C7929c(this));

    /* renamed from: g */
    public final InterfaceC8724d f12506g;

    /* renamed from: h */
    public final InterfaceC8724d f12507h;

    /* renamed from: i */
    public CatalogProgressAdapter f12508i;

    /* renamed from: com.zykj.study.ui.home.find.CourseDetailsFragment$a */
    public static final /* synthetic */ class C7927a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12520a;

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
            f12520a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.CourseDetailsFragment$b */
    public static final class C7928b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12521a;

        public C7928b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12521a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12521a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12521a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.CourseDetailsFragment$c */
    public static final class C7929c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12522a;

        public C7929c(Fragment fragment) {
            this.f12522a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12522a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12522a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseDetailsFragment", m17801f = "CourseDetailsFragment.kt", m17802l = {42}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.CourseDetailsFragment$initData$1 */
    public static final class C79301 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12523a;

        /* renamed from: c */
        public int f12525c;

        public C79301(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12523a = obj;
            this.f12525c |= Integer.MIN_VALUE;
            return CourseDetailsFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseDetailsFragment$initView$2", m17801f = "CourseDetailsFragment.kt", m17802l = {54}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.CourseDetailsFragment$initView$2 */
    public static final class C79312 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12526a;

        public C79312(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static final C8736p m11027d(CourseDetailsFragment courseDetailsFragment, CatalogBean catalogBean) {
            NavController navControllerFindNavController = FragmentKt.findNavController(courseDetailsFragment);
            AbstractC7956b.b bVar = AbstractC7956b.f12672a;
            String strM13621c = C8356e.f15876a.m13621c();
            String accessToken = ((HeaderBean) courseDetailsFragment.m11024s().m12038d().getValue()).getAccessToken();
            String serverUrl = ((HeaderBean) courseDetailsFragment.m11024s().m12038d().getValue()).getServerUrl();
            int id = catalogBean.getId();
            CourseDetailsBean courseDetailsBean = (CourseDetailsBean) courseDetailsFragment.m11024s().m12036b().getValue();
            navControllerFindNavController.navigate(bVar.m11142a((CourseDetailsBean) courseDetailsFragment.m11024s().m12036b().getValue(), false, null, strM13621c + "?token=" + accessToken + "&url=" + serverUrl + "#/?entry=study&catalogId=" + id + "&courseId=" + (courseDetailsBean != null ? Integer.valueOf(courseDetailsBean.getId()) : null), catalogBean.getTitle()));
            return C8736p.f16368a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return CourseDetailsFragment.this.new C79312(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79312) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12526a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c data = CourseDetailsFragment.this.m11024s().m12042h().getData();
                this.f12526a = 1;
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
            HashSet hashSetM12040f = CourseDetailsFragment.this.m11024s().m12040f();
            final CourseDetailsFragment courseDetailsFragment = CourseDetailsFragment.this;
            return new CatalogProgressAdapter(z10, hashSetM12040f, new InterfaceC10570l() { // from class: com.zykj.study.ui.home.find.a
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return CourseDetailsFragment.C79312.m11027d(courseDetailsFragment, (CatalogBean) obj2);
                }
            });
        }
    }

    public CourseDetailsFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f12506g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f12507h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseDetailsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseDetailsFragment$special$$inlined$viewModels$default$5
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

    /* renamed from: A */
    public static final void m11000A(CourseDetailsFragment courseDetailsFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        courseDetailsFragment.m11024s().m12045k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static final C8736p m11001B(CourseDetailsFragment courseDetailsFragment, CourseDetailsBean courseDetailsBean) {
        int i10 = C7927a.f12520a[courseDetailsBean.getStatus().ordinal()];
        if (i10 == 1) {
            ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseCatalog.multipleStatusView.m7163j(R$layout.layout_status_course_undercarriage, new ViewGroup.LayoutParams(-1, -1));
        } else if (i10 == 2) {
            if (courseDetailsBean.getCatalogs() == null || !(!r0.isEmpty())) {
                ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseCatalog.multipleStatusView.m7159f();
            } else {
                ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseCatalog.multipleStatusView.m7157d();
            }
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseCatalog.multipleStatusView.m7163j(R$layout.layout_status_course_delete, new ViewGroup.LayoutParams(-1, -1));
        }
        List<CatalogBean> catalogs = courseDetailsBean.getCatalogs();
        if (catalogs != null) {
            final RecyclerView recyclerView = ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseCatalog.recycle;
            CatalogAdapter catalogAdapter = new CatalogAdapter(courseDetailsFragment.m11024s().m12035a(catalogs), courseDetailsFragment.m11024s().m12040f(), new InterfaceC10570l() { // from class: y4.g
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return CourseDetailsFragment.m11002C(recyclerView, (CatalogBean) obj);
                }
            });
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY;
            catalogAdapter.setStateRestorationPolicy(stateRestorationPolicy);
            recyclerView.setAdapter(catalogAdapter);
            CatalogProgressAdapter catalogProgressAdapter = courseDetailsFragment.f12508i;
            if (catalogProgressAdapter != null) {
                CourseDetailsViewModel courseDetailsViewModelM11024s = courseDetailsFragment.m11024s();
                CourseDetailsBean courseDetailsBean2 = (CourseDetailsBean) courseDetailsFragment.m11024s().m12036b().getValue();
                catalogProgressAdapter.m9946g(courseDetailsViewModelM11024s.m12035a(courseDetailsBean2 != null ? courseDetailsBean2.getCatalogs() : null));
            }
            RecyclerView.Adapter adapter = ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseCatalog.recycleProgress.getAdapter();
            if (adapter != null) {
                adapter.setStateRestorationPolicy(stateRestorationPolicy);
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: C */
    public static final C8736p m11002C(RecyclerView recyclerView, CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = recyclerView.getContext().getString(R$string.subscribe_frist);
        AbstractC9133u.m16132f(string, "getString(...)");
        AbstractC8366o.m13652d(xToastUtils, string);
        return C8736p.f16368a;
    }

    /* renamed from: D */
    public static final void m11003D(CourseDetailsFragment courseDetailsFragment, View view) {
        FragmentKt.findNavController(courseDetailsFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static final C8736p m11004E(CourseDetailsFragment courseDetailsFragment, CourseDetailsBean courseDetailsBean) {
        ((FragmentCourseDetailsBinding) courseDetailsFragment.getMBindView()).courseSynopsis.expandTextView.setText(courseDetailsBean.getDescription());
        return C8736p.f16368a;
    }

    /* renamed from: t */
    private final DictViewModel m11016t() {
        return (DictViewModel) this.f12506g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private final void m11017u() {
        ((FragmentCourseDetailsBinding) getMBindView()).courseSynopsis.courseStatusBtn.btSubscribeCancel.setOnClickListener(new View.OnClickListener() { // from class: y4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseDetailsFragment.m11018v(this.f21076a, view);
            }
        });
        ((FragmentCourseDetailsBinding) getMBindView()).courseSynopsis.courseStatusBtn.btSubscribe.setOnClickListener(new View.OnClickListener() { // from class: y4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseDetailsFragment.m11020x(this.f21079a, view);
            }
        });
        ((FragmentCourseDetailsBinding) getMBindView()).courseSynopsis.courseStatusBtn.btnChoiceToTeach.setOnClickListener(new View.OnClickListener() { // from class: y4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseDetailsFragment.m11022z(this.f21081a, view);
            }
        });
    }

    /* renamed from: v */
    public static final void m11018v(final CourseDetailsFragment courseDetailsFragment, View view) {
        new MaterialDialog.C6913g(courseDetailsFragment.requireContext()).m6749j(courseDetailsFragment.getString(R$string.is_need_unsubscribe_course)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: y4.h
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                CourseDetailsFragment.m11019w(this.f21084a, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: w */
    public static final void m11019w(CourseDetailsFragment courseDetailsFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        courseDetailsFragment.m11024s().m12046l();
    }

    /* renamed from: x */
    public static final void m11020x(final CourseDetailsFragment courseDetailsFragment, View view) {
        new MaterialDialog.C6913g(courseDetailsFragment.requireContext()).m6749j(courseDetailsFragment.getString(R$string.is_need_subscribe_course)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: y4.i
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                CourseDetailsFragment.m11021y(this.f21085a, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: y */
    public static final void m11021y(CourseDetailsFragment courseDetailsFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        courseDetailsFragment.m11024s().m12044j();
    }

    /* renamed from: z */
    public static final void m11022z(final CourseDetailsFragment courseDetailsFragment, View view) {
        new MaterialDialog.C6913g(courseDetailsFragment.requireContext()).m6749j(courseDetailsFragment.getString(R$string.is_need_teach_course)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: y4.j
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                CourseDetailsFragment.m11000A(this.f21088a, materialDialog, dialogAction);
            }
        }).m6734E();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.CourseDetailsFragment.C79301
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.CourseDetailsFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.CourseDetailsFragment.C79301) r0
            int r1 = r0.f12525c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12525c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.CourseDetailsFragment$initData$1 r0 = new com.zykj.study.ui.home.find.CourseDetailsFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12523a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12525c
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
            r0.f12525c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.CourseDetailsViewModel r5 = r4.m11024s()
            androidx.lifecycle.MutableLiveData r5 = r5.m12037c()
            com.zykj.study.ui.home.find.CourseDetailsFragmentArgs r0 = r4.m11023r()
            com.zykj.study.bean.course.CourseSimpleBean r0 = r0.m11028a()
            r5.setValue(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.CourseDetailsFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/CourseDetailsFragment.smali:1425
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m11024s().m12043i(m11023r().m11028a().getId());
        ((FragmentCourseDetailsBinding) getMBindView()).setDetailsEntity(m11024s());
        ((FragmentCourseDetailsBinding) getMBindView()).setDictViewModel(m11016t());
        this.f12508i = (CatalogProgressAdapter) AbstractC8836g.m14852b(null, new C79312(null), 1, null);
        RecyclerView recyclerView = ((FragmentCourseDetailsBinding) getMBindView()).courseCatalog.recycleProgress;
        CatalogProgressAdapter catalogProgressAdapter = this.f12508i;
        if (catalogProgressAdapter != null) {
            CourseDetailsViewModel courseDetailsViewModelM11024s = m11024s();
            CourseDetailsBean courseDetailsBean = (CourseDetailsBean) m11024s().m12036b().getValue();
            catalogProgressAdapter.m9946g(courseDetailsViewModelM11024s.m12035a(courseDetailsBean != null ? courseDetailsBean.getCatalogs() : null));
        }
        RecyclerView.Adapter adapter = ((FragmentCourseDetailsBinding) getMBindView()).courseCatalog.recycleProgress.getAdapter();
        if (adapter != null) {
            adapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
        }
        recyclerView.setAdapter(catalogProgressAdapter);
        m11024s().m12036b().observe(getViewLifecycleOwner(), new C7928b(new InterfaceC10570l() { // from class: y4.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseDetailsFragment.m11001B(this.f21069a, (CourseDetailsBean) obj);
            }
        }));
        TitleBar titleBar = ((FragmentCourseDetailsBinding) getMBindView()).toolbar2;
        CourseSimpleBean courseSimpleBean = (CourseSimpleBean) m11024s().m12037c().getValue();
        titleBar.m6539t(courseSimpleBean != null ? courseSimpleBean.getTitle() : null).m6535p(getString(R$string.arrow_left_return)).m6534o(R$drawable.ic_arrow_left).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6541v(getResources().getDimensionPixelSize(R$dimen.text_9)).m6536q(false).m6531l(true).m6533n(new View.OnClickListener() { // from class: y4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseDetailsFragment.m11003D(this.f21071a, view);
            }
        });
        m11024s().m12036b().observe(getViewLifecycleOwner(), new C7928b(new InterfaceC10570l() { // from class: y4.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseDetailsFragment.m11004E(this.f21073a, (CourseDetailsBean) obj);
            }
        }));
        m11017u();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_course_details;
    }

    /* renamed from: r */
    public final CourseDetailsFragmentArgs m11023r() {
        return (CourseDetailsFragmentArgs) this.f12505f.getValue();
    }

    /* renamed from: s */
    public final CourseDetailsViewModel m11024s() {
        return (CourseDetailsViewModel) this.f12507h.getValue();
    }
}
