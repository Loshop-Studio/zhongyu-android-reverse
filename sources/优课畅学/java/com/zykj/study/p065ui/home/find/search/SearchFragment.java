package com.zykj.study.p065ui.home.find.search;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.MenuKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentSearchBinding;
import com.zykj.study.p065ui.home.find.search.SearchFragment;
import com.zykj.study.viewmodels.SearchViewModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.C8361j;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SearchFragment extends Hilt_SearchFragment<FragmentSearchBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12724f;

    /* renamed from: g */
    public SearchResultFragment f12725g;

    /* renamed from: h */
    public SearchHistoryFragment f12726h;

    /* renamed from: com.zykj.study.ui.home.find.search.SearchFragment$a */
    public static final class ActionModeCallbackC7966a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            List listM14774q = AbstractC8809v.m14774q("粘贴", "全选");
            if (menu == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            for (MenuItem menuItem : MenuKt.getChildren(menu)) {
                if (!AbstractC8778f0.m14556d0(listM14774q, menuItem.getTitle())) {
                    arrayList.add(Integer.valueOf(menuItem.getItemId()));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                menu.removeItem(((Number) it.next()).intValue());
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.zykj.study.ui.home.find.search.SearchFragment$b */
    public static final class C7967b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12734a;

        public C7967b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12734a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12734a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12734a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchFragment", m17801f = "SearchFragment.kt", m17802l = {35}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchFragment$initData$1 */
    public static final class C79681 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12735a;

        /* renamed from: c */
        public int f12737c;

        public C79681(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12735a = obj;
            this.f12737c |= Integer.MIN_VALUE;
            return SearchFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.search.SearchFragment$initData$2", m17801f = "SearchFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.search.SearchFragment$initData$2 */
    public static final class C79692 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12738a;

        public C79692(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return SearchFragment.this.new C79692(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79692) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12738a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            SearchFragment.this.m11158m();
            return C8736p.f16368a;
        }
    }

    public SearchFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12724f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(SearchViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.search.SearchFragment$special$$inlined$viewModels$default$5
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

    /* renamed from: n */
    public static final C8736p m11153n(SearchFragment searchFragment, String str) {
        AbstractC9133u.m16130d(str);
        if (str.length() == 0) {
            FragmentTransaction fragmentTransactionBeginTransaction = searchFragment.getChildFragmentManager().beginTransaction();
            int i10 = R$id.fragment_container;
            SearchHistoryFragment searchHistoryFragment = searchFragment.f12726h;
            if (searchHistoryFragment == null) {
                AbstractC9133u.m16151y("searchHistoryFragment");
                searchHistoryFragment = null;
            }
            fragmentTransactionBeginTransaction.replace(i10, searchHistoryFragment).commit();
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final C8736p m11154o(SearchFragment searchFragment, String str) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6435d(((FragmentSearchBinding) searchFragment.getMBindView()).etSearch);
        ((FragmentSearchBinding) searchFragment.getMBindView()).etSearch.clearFocus();
        AbstractC9133u.m16130d(str);
        if (str.length() > 0) {
            FragmentTransaction fragmentTransactionBeginTransaction = searchFragment.getChildFragmentManager().beginTransaction();
            int i10 = R$id.fragment_container;
            SearchResultFragment searchResultFragment = searchFragment.f12725g;
            if (searchResultFragment == null) {
                AbstractC9133u.m16151y("searchResultFragment");
                searchResultFragment = null;
            }
            fragmentTransactionBeginTransaction.replace(i10, searchResultFragment).commit();
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final boolean m11155p(SearchFragment searchFragment, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return true;
        }
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6435d(((FragmentSearchBinding) searchFragment.getMBindView()).etSearch);
        searchFragment.m11157l().m12253k();
        return true;
    }

    /* renamed from: q */
    public static final void m11156q(SearchFragment searchFragment, View view) {
        FragmentKt.findNavController(searchFragment).navigateUp();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.search.SearchFragment.C79681
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.search.SearchFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.search.SearchFragment.C79681) r0
            int r1 = r0.f12737c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12737c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.search.SearchFragment$initData$1 r0 = new com.zykj.study.ui.home.find.search.SearchFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12735a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12737c
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
            r0.f12737c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.ui.home.find.search.SearchResultFragment r5 = new com.zykj.study.ui.home.find.search.SearchResultFragment
            r5.<init>()
            r4.f12725g = r5
            com.zykj.study.ui.home.find.search.SearchHistoryFragment r5 = new com.zykj.study.ui.home.find.search.SearchHistoryFragment
            r5.<init>()
            r4.f12726h = r5
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.find.search.SearchFragment$initData$2 r0 = new com.zykj.study.ui.home.find.search.SearchFragment$initData$2
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenStarted(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.search.SearchFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/SearchFragment.smali:467
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        Object objM15909b;
        ((FragmentSearchBinding) getMBindView()).setSearchViewModel(m11157l());
        m11157l().m12249f().observe(getViewLifecycleOwner(), new C7967b(new InterfaceC10570l() { // from class: z4.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchFragment.m11153n(this.f21254a, (String) obj);
            }
        }));
        m11157l().m12250g().observe(getViewLifecycleOwner(), new C7967b(new InterfaceC10570l() { // from class: z4.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SearchFragment.m11154o(this.f21255a, (String) obj);
            }
        }));
        ClearEditText clearEditText = ((FragmentSearchBinding) getMBindView()).etSearch;
        clearEditText.addTextChangedListener(new C8361j());
        clearEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: z4.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return SearchFragment.m11155p(this.f21256a, textView, i10, keyEvent);
            }
        });
        try {
            Result.C9076a c9076a = Result.f17350b;
            Field declaredField = TextView.class.getDeclaredField("mDeviceProvisionedState");
            declaredField.setAccessible(true);
            AbstractC9133u.m16131e(clearEditText, "null cannot be cast to non-null type android.widget.TextView");
            declaredField.set(clearEditText, AbstractC9536a.m17798c(1));
            clearEditText.setCustomInsertionActionModeCallback(new ActionModeCallbackC7966a());
            objM15909b = Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        Throwable thM15911d = Result.m15911d(objM15909b);
        if (thM15911d != null) {
            thM15911d.printStackTrace();
        }
        ((FragmentSearchBinding) getMBindView()).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: z4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchFragment.m11156q(this.f21257a, view);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final SearchViewModel m11157l() {
        return (SearchViewModel) this.f12724f.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_search;
    }

    /* renamed from: m */
    public final void m11158m() {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i10 = R$id.fragment_container;
        SearchHistoryFragment searchHistoryFragment = this.f12726h;
        if (searchHistoryFragment == null) {
            AbstractC9133u.m16151y("searchHistoryFragment");
            searchHistoryFragment = null;
        }
        fragmentTransactionBeginTransaction.replace(i10, searchHistoryFragment).commit();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m11157l().m12249f().setValue("");
        m11157l().m12250g().setValue("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6435d(((FragmentSearchBinding) getMBindView()).etSearch);
        super.onDestroyView();
    }
}
