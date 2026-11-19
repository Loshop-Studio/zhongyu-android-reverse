package com.zykj.study.p065ui.home.p066my;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.MyTeachCourseAddAdapter;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.FragmentTeacherCourseAddBinding;
import com.zykj.study.p065ui.home.p066my.TeachCourseAddFragment;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.MyCourseViewModel;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
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
public final class TeachCourseAddFragment extends Hilt_TeachCourseAddFragment<FragmentTeacherCourseAddBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13419f;

    /* renamed from: g */
    public final InterfaceC8724d f13420g;

    /* renamed from: h */
    public MyTeachCourseAddAdapter f13421h;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment", m17801f = "TeachCourseAddFragment.kt", m17802l = {45}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$1 */
    public static final class C80751 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13433a;

        /* renamed from: c */
        public int f13435c;

        public C80751(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13433a = obj;
            this.f13435c |= Integer.MIN_VALUE;
            return TeachCourseAddFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$2", m17801f = "TeachCourseAddFragment.kt", m17802l = {50}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$2 */
    public static final class C80762 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13436a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$2$1", m17801f = "TeachCourseAddFragment.kt", m17802l = {51}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13438a;

            /* renamed from: b */
            public /* synthetic */ Object f13439b;

            /* renamed from: c */
            public final /* synthetic */ TeachCourseAddFragment f13440c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TeachCourseAddFragment teachCourseAddFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13440c = teachCourseAddFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13440c, interfaceC9324c);
                anonymousClass1.f13439b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f13439b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13438a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    MyTeachCourseAddAdapter myTeachCourseAddAdapter = this.f13440c.f13421h;
                    if (myTeachCourseAddAdapter == null) {
                        AbstractC9133u.m16151y("myCourseAdapter");
                        myTeachCourseAddAdapter = null;
                    }
                    this.f13439b = AbstractC9543h.m17814a(pagingData);
                    this.f13438a = 1;
                    if (myTeachCourseAddAdapter.submitData(pagingData, this) == objM17291f) {
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

        public C80762(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeachCourseAddFragment.this.new C80762(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80762) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13436a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12227d = TeachCourseAddFragment.this.m11690q().m12227d();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TeachCourseAddFragment.this, null);
                this.f13436a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12227d, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$3", m17801f = "TeachCourseAddFragment.kt", m17802l = {C3721BR.userInfo}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$3 */
    public static final class C80773 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13441a;

        public C80773(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static final MultipleStatusView m11698k(TeachCourseAddFragment teachCourseAddFragment) {
            return ((FragmentTeacherCourseAddBinding) teachCourseAddFragment.getMBindView()).msCourse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public static final SwipeRefreshLayout m11699l(TeachCourseAddFragment teachCourseAddFragment) {
            return ((FragmentTeacherCourseAddBinding) teachCourseAddFragment.getMBindView()).sfCourse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeachCourseAddFragment.this.new C80773(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80773) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13441a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TeachCourseAddFragment teachCourseAddFragment = TeachCourseAddFragment.this;
                MyTeachCourseAddAdapter myTeachCourseAddAdapter = teachCourseAddFragment.f13421h;
                if (myTeachCourseAddAdapter == null) {
                    AbstractC9133u.m16151y("myCourseAdapter");
                    myTeachCourseAddAdapter = null;
                }
                final TeachCourseAddFragment teachCourseAddFragment2 = TeachCourseAddFragment.this;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.m
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return TeachCourseAddFragment.C80773.m11698k(teachCourseAddFragment2);
                    }
                };
                final TeachCourseAddFragment teachCourseAddFragment3 = TeachCourseAddFragment.this;
                InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.n
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return TeachCourseAddFragment.C80773.m11699l(teachCourseAddFragment3);
                    }
                };
                this.f13441a = 1;
                if (BaseFragmentExtKt.m11866d(teachCourseAddFragment, myTeachCourseAddAdapter, interfaceC10559a, interfaceC10559a2, null, false, this, 24, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment$initView$4", m17801f = "TeachCourseAddFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeachCourseAddFragment$initView$4 */
    public static final class C80794 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13446a;

        public C80794(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeachCourseAddFragment.this.new C80794(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80794) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f13446a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            RecyclerView recyclerView = ((FragmentTeacherCourseAddBinding) TeachCourseAddFragment.this.getMBindView()).rvCourse;
            TeachCourseAddFragment teachCourseAddFragment = TeachCourseAddFragment.this;
            MyTeachCourseAddAdapter myTeachCourseAddAdapter = teachCourseAddFragment.f13421h;
            if (myTeachCourseAddAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myTeachCourseAddAdapter = null;
            }
            recyclerView.setAdapter(myTeachCourseAddAdapter);
            AbstractC9133u.m16130d(recyclerView);
            teachCourseAddFragment.m11688o(recyclerView);
            return C8736p.f16368a;
        }
    }

    public TeachCourseAddFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13419f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f13420g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MyCourseViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment$special$$inlined$viewModels$default$5
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
    /* renamed from: o */
    public final void m11688o(RecyclerView recyclerView) {
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R$drawable.divider, null);
        if (drawable != null) {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 1);
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
            DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(requireContext(), 0);
            dividerItemDecoration2.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration2);
        }
    }

    /* renamed from: p */
    private final DictViewModel m11689p() {
        return (DictViewModel) this.f13419f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final MyCourseViewModel m11690q() {
        return (MyCourseViewModel) this.f13420g.getValue();
    }

    /* renamed from: r */
    public static final void m11691r(TeachCourseAddFragment teachCourseAddFragment, View view) {
        FragmentKt.findNavController(teachCourseAddFragment).navigateUp();
    }

    /* renamed from: s */
    public static final void m11692s(TeachCourseAddFragment teachCourseAddFragment) {
        MyTeachCourseAddAdapter myTeachCourseAddAdapter = teachCourseAddFragment.f13421h;
        if (myTeachCourseAddAdapter == null) {
            AbstractC9133u.m16151y("myCourseAdapter");
            myTeachCourseAddAdapter = null;
        }
        myTeachCourseAddAdapter.refresh();
    }

    /* renamed from: t */
    public static final void m11693t(TeachCourseAddFragment teachCourseAddFragment, View view) {
        MyTeachCourseAddAdapter myTeachCourseAddAdapter = teachCourseAddFragment.f13421h;
        if (myTeachCourseAddAdapter == null) {
            AbstractC9133u.m16151y("myCourseAdapter");
            myTeachCourseAddAdapter = null;
        }
        myTeachCourseAddAdapter.refresh();
    }

    /* renamed from: v */
    public static final void m11694v(TeachCourseAddFragment teachCourseAddFragment, MyCourseEntity myCourseEntity, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        LifecycleOwner viewLifecycleOwner = teachCourseAddFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1(teachCourseAddFragment, myCourseEntity, null), 3, null);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.TeachCourseAddFragment.C80751
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.TeachCourseAddFragment.C80751) r0
            int r1 = r0.f13435c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13435c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$1 r0 = new com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13433a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13435c
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
            r0.f13435c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MyTeachCourseAddAdapter r5 = new com.zykj.study.adapter.MyTeachCourseAddAdapter
            com.zykj.study.viewmodels.DictViewModel r0 = r4.m11689p()
            r5.<init>(r0)
            r4.f13421h = r5
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$2 r0 = new com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$2
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$3 r0 = new com.zykj.study.ui.home.my.TeachCourseAddFragment$initData$3
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.TeachCourseAddFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeachCourseAddFragment.smali:572
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentTeacherCourseAddBinding) getMBindView()).setEntity(m11690q());
        ((FragmentTeacherCourseAddBinding) getMBindView()).toolbar.m6539t(getString(R$string.add_my_course_to_teach)).m6535p(getString(R$string.arrow_left_return)).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: b5.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeachCourseAddFragment.m11691r(this.f2129a, view);
            }
        }).m6523a(new TitleBar.AbstractC6883c(R$string.sure) { // from class: com.zykj.study.ui.home.my.TeachCourseAddFragment.initView.3
            @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
            /* renamed from: a */
            public void mo6542a(View view) {
                LifecycleOwner viewLifecycleOwner = TeachCourseAddFragment.this.getViewLifecycleOwner();
                AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TeachCourseAddFragment$initView$3$performAction$1(TeachCourseAddFragment.this, null), 3, null);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new C80794(null));
        ((FragmentTeacherCourseAddBinding) getMBindView()).sfCourse.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: b5.c5
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                TeachCourseAddFragment.m11692s(this.f2134a);
            }
        });
        ((FragmentTeacherCourseAddBinding) getMBindView()).msCourse.setOnRetryClickListener(new View.OnClickListener() { // from class: b5.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeachCourseAddFragment.m11693t(this.f2140a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_teacher_course_add;
    }

    /* renamed from: u */
    public final void m11695u(final MyCourseEntity myCourseEntity) {
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.add_teach_course_hint)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.e5
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                TeachCourseAddFragment.m11694v(this.f2147a, myCourseEntity, materialDialog, dialogAction);
            }
        }).m6734E();
    }
}
