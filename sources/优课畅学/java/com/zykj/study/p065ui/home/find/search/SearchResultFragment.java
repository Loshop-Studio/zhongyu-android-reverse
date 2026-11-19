package com.zykj.study.p065ui.home.find.search;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CourseAdapter;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.databinding.FragmentSearchResultBinding;
import com.zykj.study.p065ui.home.find.search.SearchResultFragment;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.SearchViewModel;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SearchResultFragment extends Hilt_SearchResultFragment<FragmentSearchResultBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12754f;

    /* renamed from: g */
    public final InterfaceC8724d f12755g;

    /* renamed from: h */
    public CourseAdapter f12756h;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchResultFragment", m17801f = "SearchResultFragment.kt", m17802l = {39}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchResultFragment$initData$1 */
    public static final class C79761 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12767a;

        /* renamed from: c */
        public int f12769c;

        public C79761(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12767a = obj;
            this.f12769c |= Integer.MIN_VALUE;
            return SearchResultFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchResultFragment$initData$3", m17801f = "SearchResultFragment.kt", m17802l = {48}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchResultFragment$initData$3 */
    public static final class C79773 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12770a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchResultFragment$initData$3$1", m17801f = "SearchResultFragment.kt", m17802l = {49}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.find.search.SearchResultFragment$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12772a;

            /* renamed from: b */
            public /* synthetic */ Object f12773b;

            /* renamed from: c */
            public final /* synthetic */ SearchResultFragment f12774c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchResultFragment searchResultFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f12774c = searchResultFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12774c, interfaceC9324c);
                anonymousClass1.f12773b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f12773b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f12772a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    CourseAdapter courseAdapterM11178l = this.f12774c.m11178l();
                    this.f12773b = AbstractC9543h.m17814a(pagingData);
                    this.f12772a = 1;
                    if (courseAdapterM11178l.submitData(pagingData, this) == objM17291f) {
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

        public C79773(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return SearchResultFragment.this.new C79773(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79773) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12770a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12251h = SearchResultFragment.this.m11174n().m12251h();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchResultFragment.this, null);
                this.f12770a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12251h, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchResultFragment$initData$4", m17801f = "SearchResultFragment.kt", m17802l = {54}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchResultFragment$initData$4 */
    public static final class C79784 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12775a;

        public C79784(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static final MultipleStatusView m11182k(SearchResultFragment searchResultFragment) {
            return ((FragmentSearchResultBinding) searchResultFragment.getMBindView()).msCourse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public static final SwipeRefreshLayout m11183l(SearchResultFragment searchResultFragment) {
            return ((FragmentSearchResultBinding) searchResultFragment.getMBindView()).swipe;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return SearchResultFragment.this.new C79784(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79784) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12775a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                SearchResultFragment searchResultFragment = SearchResultFragment.this;
                CourseAdapter courseAdapterM11178l = searchResultFragment.m11178l();
                final SearchResultFragment searchResultFragment2 = SearchResultFragment.this;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.c
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return SearchResultFragment.C79784.m11182k(searchResultFragment2);
                    }
                };
                final SearchResultFragment searchResultFragment3 = SearchResultFragment.this;
                InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.d
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return SearchResultFragment.C79784.m11183l(searchResultFragment3);
                    }
                };
                this.f12775a = 1;
                if (BaseFragmentExtKt.m11866d(searchResultFragment, courseAdapterM11178l, interfaceC10559a, interfaceC10559a2, null, false, this, 24, null) == objM17291f) {
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

    public SearchResultFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f12754f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: z4.k
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SearchResultFragment.m11177q(this.f21262a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f12755g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(SearchViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchResultFragment$special$$inlined$viewModels$default$4
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
    private final void m11172k(RecyclerView recyclerView) {
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R$drawable.divider, null);
        if (drawable != null) {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 0);
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
            DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(requireContext(), 1);
            dividerItemDecoration2.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration2);
        }
    }

    /* renamed from: m */
    private final DictViewModel m11173m() {
        return (DictViewModel) this.f12754f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final SearchViewModel m11174n() {
        return (SearchViewModel) this.f12755g.getValue();
    }

    /* renamed from: o */
    public static final C8736p m11175o(SearchResultFragment searchResultFragment, CourseSimpleBean item) {
        AbstractC9133u.m16133g(item, "item");
        FragmentKt.findNavController(searchResultFragment).navigate(AbstractC7979a.f12777a.m11184a(item));
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final void m11176p(SearchResultFragment searchResultFragment) {
        searchResultFragment.m11178l().refresh();
    }

    /* renamed from: q */
    public static final ViewModelStoreOwner m11177q(SearchResultFragment searchResultFragment) {
        Fragment fragmentRequireParentFragment = searchResultFragment.requireParentFragment();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.search.SearchResultFragment.C79761
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.search.SearchResultFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.search.SearchResultFragment.C79761) r0
            int r1 = r0.f12769c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12769c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.search.SearchResultFragment$initData$1 r0 = new com.zykj.study.ui.home.find.search.SearchResultFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12767a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12769c
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
            r0.f12769c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.CourseAdapter r5 = new com.zykj.study.adapter.CourseAdapter
            z4.j r0 = new z4.j
            r0.<init>()
            com.zykj.study.viewmodels.DictViewModel r1 = r4.m11173m()
            r5.<init>(r0, r1)
            r4.m11179r(r5)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.find.search.SearchResultFragment$initData$3 r0 = new com.zykj.study.ui.home.find.search.SearchResultFragment$initData$3
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.find.search.SearchResultFragment$initData$4 r0 = new com.zykj.study.ui.home.find.search.SearchResultFragment$initData$4
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.search.SearchResultFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/SearchResultFragment.smali:460
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        RecyclerView recyclerView = ((FragmentSearchResultBinding) getMBindView()).recycleView;
        AbstractC9133u.m16130d(recyclerView);
        m11172k(recyclerView);
        recyclerView.setAdapter(m11178l());
        ((FragmentSearchResultBinding) getMBindView()).swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: z4.i
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                SearchResultFragment.m11176p(this.f21260a);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final CourseAdapter m11178l() {
        CourseAdapter courseAdapter = this.f12756h;
        if (courseAdapter != null) {
            return courseAdapter;
        }
        AbstractC9133u.m16151y("courseAdapter");
        return null;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_search_result;
    }

    /* renamed from: r */
    public final void m11179r(CourseAdapter courseAdapter) {
        AbstractC9133u.m16133g(courseAdapter, "<set-?>");
        this.f12756h = courseAdapter;
    }
}
