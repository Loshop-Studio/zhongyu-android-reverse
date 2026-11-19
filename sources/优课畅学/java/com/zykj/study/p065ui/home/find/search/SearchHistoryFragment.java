package com.zykj.study.p065ui.home.find.search;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.SearchHistoryAdapter;
import com.zykj.study.databinding.FragmentSearchHistoryBinding;
import com.zykj.study.p065ui.home.find.search.SearchHistoryFragment;
import com.zykj.study.viewmodels.SearchViewModel;
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
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SearchHistoryFragment extends Hilt_SearchHistoryFragment<FragmentSearchHistoryBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12740f;

    /* renamed from: g */
    public SearchHistoryAdapter f12741g;

    /* renamed from: com.zykj.study.ui.home.find.search.SearchHistoryFragment$a */
    public static final class C7970a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12748a;

        public C7970a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12748a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12748a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12748a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchHistoryFragment", m17801f = "SearchHistoryFragment.kt", m17802l = {26}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$1 */
    public static final class C79711 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12749a;

        /* renamed from: c */
        public int f12751c;

        public C79711(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12749a = obj;
            this.f12751c |= Integer.MIN_VALUE;
            return SearchHistoryFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$2", m17801f = "SearchHistoryFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$2 */
    public static final class C79722 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12752a;

        public C79722(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static final C8736p m11167d(SearchHistoryFragment searchHistoryFragment, List list) {
            if (list.isEmpty()) {
                ((FragmentSearchHistoryBinding) searchHistoryFragment.getMBindView()).statusView.m7159f();
            } else {
                SearchHistoryAdapter searchHistoryAdapter = searchHistoryFragment.f12741g;
                if (searchHistoryAdapter == null) {
                    AbstractC9133u.m16151y("historyAdapter");
                    searchHistoryAdapter = null;
                }
                AbstractC9133u.m16130d(list);
                searchHistoryAdapter.m10079k(list);
                ((FragmentSearchHistoryBinding) searchHistoryFragment.getMBindView()).statusView.m7157d();
            }
            return C8736p.f16368a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return SearchHistoryFragment.this.new C79722(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79722) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12752a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            LiveData liveDataM12252j = SearchHistoryFragment.this.m11163k().m12252j();
            if (liveDataM12252j != null) {
                final SearchHistoryFragment searchHistoryFragment = SearchHistoryFragment.this;
                liveDataM12252j.observe(searchHistoryFragment.getViewLifecycleOwner(), new C7970a(new InterfaceC10570l() { // from class: com.zykj.study.ui.home.find.search.b
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj2) {
                        return SearchHistoryFragment.C79722.m11167d(searchHistoryFragment, (List) obj2);
                    }
                }));
            }
            return C8736p.f16368a;
        }
    }

    public SearchHistoryFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: z4.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SearchHistoryFragment.m11165m(this.f21259a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchHistoryFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12740f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(SearchViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchHistoryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchHistoryFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final SearchViewModel m11163k() {
        return (SearchViewModel) this.f12740f.getValue();
    }

    /* renamed from: l */
    public static final void m11164l(SearchHistoryFragment searchHistoryFragment, View view) {
        searchHistoryFragment.m11163k().m12245b();
    }

    /* renamed from: m */
    public static final ViewModelStoreOwner m11165m(SearchHistoryFragment searchHistoryFragment) {
        Fragment fragmentRequireParentFragment = searchHistoryFragment.requireParentFragment();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.search.SearchHistoryFragment.C79711
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.search.SearchHistoryFragment.C79711) r0
            int r1 = r0.f12751c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12751c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$1 r0 = new com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12749a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12751c
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
            r0.f12751c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.SearchHistoryAdapter r5 = new com.zykj.study.adapter.SearchHistoryAdapter
            com.zykj.study.viewmodels.SearchViewModel r0 = r4.m11163k()
            r5.<init>(r0)
            r4.f12741g = r5
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$2 r0 = new com.zykj.study.ui.home.find.search.SearchHistoryFragment$initData$2
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenStarted(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.search.SearchHistoryFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/SearchHistoryFragment.smali:244
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        RecyclerView recyclerView = ((FragmentSearchHistoryBinding) getMBindView()).recycleHistory;
        SearchHistoryAdapter searchHistoryAdapter = this.f12741g;
        if (searchHistoryAdapter == null) {
            AbstractC9133u.m16151y("historyAdapter");
            searchHistoryAdapter = null;
        }
        recyclerView.setAdapter(searchHistoryAdapter);
        ((FragmentSearchHistoryBinding) getMBindView()).tvClear.setOnClickListener(new View.OnClickListener() { // from class: z4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchHistoryFragment.m11164l(this.f21258a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_search_history;
    }
}
