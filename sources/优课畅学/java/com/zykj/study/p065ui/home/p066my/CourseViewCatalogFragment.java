package com.zykj.study.p065ui.home.p066my;

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
import androidx.navigation.fragment.FragmentKt;
import com.zykj.http.bean.HeaderBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CatalogCompleteAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.databinding.FragmentCourseViewCatalogBinding;
import com.zykj.study.p065ui.home.p066my.AbstractC8109o;
import com.zykj.study.p065ui.home.p066my.CourseViewCatalogFragment;
import com.zykj.study.viewmodels.CourseViewViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.C8356e;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseViewCatalogFragment extends Hilt_CourseViewCatalogFragment<FragmentCourseViewCatalogBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12885f;

    /* renamed from: g */
    public CatalogCompleteAdapter f12886g;

    /* renamed from: com.zykj.study.ui.home.my.CourseViewCatalogFragment$a */
    public static final class C7994a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12893a;

        public C7994a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12893a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12893a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12893a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseViewCatalogFragment", m17801f = "CourseViewCatalogFragment.kt", m17802l = {29}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.CourseViewCatalogFragment$initData$1 */
    public static final class C79951 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12894a;

        /* renamed from: c */
        public int f12896c;

        public C79951(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12894a = obj;
            this.f12896c |= Integer.MIN_VALUE;
            return CourseViewCatalogFragment.this.initData(this);
        }
    }

    public CourseViewCatalogFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: b5.b0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseViewCatalogFragment.m11270m(this.f2125a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewCatalogFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12885f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseViewViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewCatalogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewCatalogFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseViewCatalogFragment$special$$inlined$viewModels$default$4
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

    /* renamed from: m */
    public static final ViewModelStoreOwner m11270m(CourseViewCatalogFragment courseViewCatalogFragment) {
        Fragment fragmentRequireParentFragment = courseViewCatalogFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: o */
    public static final C8736p m11271o(CourseViewCatalogFragment courseViewCatalogFragment, CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        courseViewCatalogFragment.m11276n().m12066f().setValue(it);
        CatalogCompleteAdapter catalogCompleteAdapter = courseViewCatalogFragment.f12886g;
        if (catalogCompleteAdapter != null) {
            catalogCompleteAdapter.m9918j(it.getId());
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final C8736p m11272p(CourseViewCatalogFragment courseViewCatalogFragment, CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        AbstractC8109o.c cVar = AbstractC8109o.f13580a;
        String strM13621c = C8356e.f15876a.m13621c();
        String accessToken = ((HeaderBean) courseViewCatalogFragment.m11276n().m12064d().getValue()).getAccessToken();
        String serverUrl = ((HeaderBean) courseViewCatalogFragment.m11276n().m12064d().getValue()).getServerUrl();
        int id = it.getId();
        CourseBean courseBean = (CourseBean) courseViewCatalogFragment.m11276n().m12062b().getValue();
        String str = strM13621c + "?token=" + accessToken + "&url=" + serverUrl + "#/?entry=mine&catalogId=" + id + "&courseId=" + (courseBean != null ? Integer.valueOf(courseBean.getId()) : null);
        String title = it.getTitle();
        CourseBean courseBean2 = (CourseBean) courseViewCatalogFragment.m11276n().m12062b().getValue();
        Integer num = (Integer) courseViewCatalogFragment.m11276n().m12067g().getValue();
        FragmentKt.findNavController(courseViewCatalogFragment).navigate(cVar.m11807a(courseBean2, false, num != null ? num.toString() : null, str, title));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final C8736p m11273q(CourseViewCatalogFragment courseViewCatalogFragment, GroupMemberProgress groupMemberProgress) {
        List<CatalogBean> catalogs = groupMemberProgress.getCatalogs();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(catalogs, 10));
        for (CatalogBean catalogBean : catalogs) {
            CatalogBean catalogBean2 = (CatalogBean) courseViewCatalogFragment.m11276n().m12066f().getValue();
            boolean z10 = false;
            if (catalogBean2 != null && catalogBean.getId() == catalogBean2.getId()) {
                z10 = true;
            }
            arrayList.add(new SelectModel(z10, catalogBean));
        }
        List listM14544U0 = AbstractC8778f0.m14544U0(arrayList);
        CatalogCompleteAdapter catalogCompleteAdapter = courseViewCatalogFragment.f12886g;
        if (catalogCompleteAdapter != null) {
            catalogCompleteAdapter.m9919k(groupMemberProgress.getMembers());
        }
        CatalogCompleteAdapter catalogCompleteAdapter2 = courseViewCatalogFragment.f12886g;
        if (catalogCompleteAdapter2 != null) {
            CatalogBean catalogBean3 = (CatalogBean) courseViewCatalogFragment.m11276n().m12066f().getValue();
            catalogCompleteAdapter2.m9918j(catalogBean3 != null ? catalogBean3.getId() : -1);
        }
        if (listM14544U0.isEmpty()) {
            LifecycleOwner viewLifecycleOwner = courseViewCatalogFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new CourseViewCatalogFragment$initData$4$2$1(courseViewCatalogFragment, null));
        } else {
            CatalogCompleteAdapter catalogCompleteAdapter3 = courseViewCatalogFragment.f12886g;
            if (catalogCompleteAdapter3 != null) {
                catalogCompleteAdapter3.m9917i(listM14544U0);
            }
            LifecycleOwner viewLifecycleOwner2 = courseViewCatalogFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new CourseViewCatalogFragment$initData$4$2$2(courseViewCatalogFragment, null));
        }
        return C8736p.f16368a;
    }

    /* renamed from: r */
    public static final void m11274r(CourseViewCatalogFragment courseViewCatalogFragment, View view) {
        courseViewCatalogFragment.m11276n().m12066f().setValue(null);
        CatalogCompleteAdapter catalogCompleteAdapter = courseViewCatalogFragment.f12886g;
        if (catalogCompleteAdapter != null) {
            catalogCompleteAdapter.m9918j(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final void m11275s(CourseViewCatalogFragment courseViewCatalogFragment, View view) {
        FragmentKt.findNavController(courseViewCatalogFragment).navigate(R$id.courseManageDialogFragment, new CourseManageDialogFragmentArgs(((CourseBean) courseViewCatalogFragment.m11276n().m12062b().getValue()) != null ? r4.getId() : 0L).m11262b());
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.CourseViewCatalogFragment.C79951
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.CourseViewCatalogFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.CourseViewCatalogFragment.C79951) r0
            int r1 = r0.f12896c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12896c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.CourseViewCatalogFragment$initData$1 r0 = new com.zykj.study.ui.home.my.CourseViewCatalogFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12894a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12896c
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
            r0.f12896c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.CatalogCompleteAdapter r5 = new com.zykj.study.adapter.CatalogCompleteAdapter
            b5.w r0 = new b5.w
            r0.<init>()
            b5.x r1 = new b5.x
            r1.<init>()
            r5.<init>(r0, r1)
            r4.f12886g = r5
            com.zykj.study.viewmodels.CourseViewViewModel r5 = r4.m11276n()
            androidx.lifecycle.MutableLiveData r5 = r5.m12063c()
            b5.y r0 = new b5.y
            r0.<init>()
            com.zykj.study.ui.home.my.CourseViewCatalogFragment$a r1 = new com.zykj.study.ui.home.my.CourseViewCatalogFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.CourseViewCatalogFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseViewCatalogFragment.smali:1134
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        CatalogCompleteAdapter catalogCompleteAdapter;
        ((FragmentCourseViewCatalogBinding) getMBindView()).setViewModel(m11276n());
        ((FragmentCourseViewCatalogBinding) getMBindView()).setOnClick(new View.OnClickListener() { // from class: b5.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseViewCatalogFragment.m11274r(this.f2284a, view);
            }
        });
        ((FragmentCourseViewCatalogBinding) getMBindView()).setOnClickManage(new View.OnClickListener() { // from class: b5.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseViewCatalogFragment.m11275s(this.f2119a, view);
            }
        });
        ((FragmentCourseViewCatalogBinding) getMBindView()).recycler.setAdapter(this.f12886g);
        CatalogBean catalogBean = (CatalogBean) m11276n().m12066f().getValue();
        if (catalogBean != null && (catalogCompleteAdapter = this.f12886g) != null) {
            catalogCompleteAdapter.m9918j(catalogBean.getId());
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_course_view_catalog;
    }

    /* renamed from: n */
    public final CourseViewViewModel m11276n() {
        return (CourseViewViewModel) this.f12885f.getValue();
    }
}
