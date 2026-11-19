package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.StatisticsAdapter;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.teach.CatalogStudyProgress;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.bean.teach.SuperviseGroupMemberProgress;
import com.zykj.study.bean.teach.SuperviseGroupProgress;
import com.zykj.study.databinding.FragmentCourseViewStatisticsBinding;
import com.zykj.study.p065ui.home.p066my.CourseViewStatisticsFragment;
import com.zykj.study.viewmodels.CourseViewViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseViewStatisticsFragment extends Hilt_CourseViewStatisticsFragment<FragmentCourseViewStatisticsBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12922f;

    /* renamed from: g */
    public final InterfaceC8724d f12923g;

    /* renamed from: com.zykj.study.ui.home.my.CourseViewStatisticsFragment$a */
    public static final class C8002a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12930a;

        public C8002a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12930a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12930a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12930a.invoke(obj);
        }
    }

    public CourseViewStatisticsFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: b5.i0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseViewStatisticsFragment.m11295n(this.f2169a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewStatisticsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12922f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseViewViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewStatisticsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewStatisticsFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewStatisticsFragment$special$$inlined$viewModels$default$4
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
        this.f12923g = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.j0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseViewStatisticsFragment.m11300u();
            }
        });
    }

    /* renamed from: n */
    public static final ViewModelStoreOwner m11295n(CourseViewStatisticsFragment courseViewStatisticsFragment) {
        Fragment fragmentRequireParentFragment = courseViewStatisticsFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: o */
    private final CourseViewViewModel m11296o() {
        return (CourseViewViewModel) this.f12922f.getValue();
    }

    /* renamed from: q */
    public static final C8736p m11297q(CourseViewStatisticsFragment courseViewStatisticsFragment, CatalogBean catalogBean) {
        courseViewStatisticsFragment.m11296o().m12068h(catalogBean != null ? catalogBean.getId() : 0);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static final C8736p m11298r(CourseViewStatisticsFragment courseViewStatisticsFragment, GroupMemberProgress groupMemberProgress) {
        CatalogStudyProgress catalogStudyProgress = (CatalogStudyProgress) courseViewStatisticsFragment.m11296o().m12061a().getValue();
        if (catalogStudyProgress != null) {
            courseViewStatisticsFragment.m11303v(catalogStudyProgress);
        }
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m11299s(CourseViewStatisticsFragment courseViewStatisticsFragment, CatalogStudyProgress catalogStudyProgress) {
        AbstractC9133u.m16130d(catalogStudyProgress);
        courseViewStatisticsFragment.m11303v(catalogStudyProgress);
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final StatisticsAdapter m11300u() {
        return new StatisticsAdapter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentCourseViewStatisticsBinding) getMBindView()).recycler.setAdapter(m11301p());
        m11301p().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.my.CourseViewStatisticsFragment$initView$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                CourseViewStatisticsFragment courseViewStatisticsFragment = this.f12931a;
                courseViewStatisticsFragment.m11302t(courseViewStatisticsFragment.m11301p().getItemCount() == 0);
                RecyclerView recycler = ((FragmentCourseViewStatisticsBinding) this.f12931a.getMBindView()).recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                recycler.setVisibility(this.f12931a.m11301p().getItemCount() > 0 ? 0 : 8);
            }
        });
        m11296o().m12066f().observe(getViewLifecycleOwner(), new C8002a(new InterfaceC10570l() { // from class: b5.k0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseViewStatisticsFragment.m11297q(this.f2183a, (CatalogBean) obj);
            }
        }));
        m11296o().m12063c().observe(getViewLifecycleOwner(), new C8002a(new InterfaceC10570l() { // from class: b5.l0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseViewStatisticsFragment.m11298r(this.f2190a, (GroupMemberProgress) obj);
            }
        }));
        m11296o().m12061a().observe(getViewLifecycleOwner(), new C8002a(new InterfaceC10570l() { // from class: b5.m0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CourseViewStatisticsFragment.m11299s(this.f2205a, (CatalogStudyProgress) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_course_view_statistics;
    }

    /* renamed from: p */
    public final StatisticsAdapter m11301p() {
        return (StatisticsAdapter) this.f12923g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final void m11302t(boolean z10) {
        ViewStub viewStub;
        if (((FragmentCourseViewStatisticsBinding) getMBindView()).emptyViewStub.isInflated()) {
            View root = ((FragmentCourseViewStatisticsBinding) getMBindView()).emptyViewStub.getRoot();
            AbstractC9133u.m16132f(root, "getRoot(...)");
            root.setVisibility(z10 ? 0 : 8);
        } else {
            if (!z10 || (viewStub = ((FragmentCourseViewStatisticsBinding) getMBindView()).emptyViewStub.getViewStub()) == null) {
                return;
            }
            viewStub.inflate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final void m11303v(CatalogStudyProgress catalogStudyProgress) {
        Object next;
        Iterator<T> it = catalogStudyProgress.getGroupList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SuperviseGroupProgress superviseGroupProgress = (SuperviseGroupProgress) next;
            GroupMemberProgress groupMemberProgress = (GroupMemberProgress) m11296o().m12063c().getValue();
            if (groupMemberProgress != null && groupMemberProgress.getGroupId() == superviseGroupProgress.getId()) {
                break;
            }
        }
        SuperviseGroupProgress superviseGroupProgress2 = (SuperviseGroupProgress) next;
        if (superviseGroupProgress2 != null) {
            List<SuperviseGroupMemberProgress> memberList = superviseGroupProgress2.getMemberList();
            StatisticsAdapter statisticsAdapterM11301p = m11301p();
            CatalogBean catalogBean = (CatalogBean) m11296o().m12066f().getValue();
            statisticsAdapterM11301p.m10081c(catalogBean != null ? catalogBean.isLeaf() : false);
            m11301p().m10084f(memberList);
        }
    }
}
