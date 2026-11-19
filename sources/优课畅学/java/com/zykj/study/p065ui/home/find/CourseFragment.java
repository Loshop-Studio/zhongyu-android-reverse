package com.zykj.study.p065ui.home.find;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
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
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CourseAdapter;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.databinding.FragmentCourseBinding;
import com.zykj.study.p065ui.home.find.CourseFragment;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.viewmodels.CourseViewModel;
import com.zykj.study.viewmodels.DictViewModel;
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
import p275v4.AbstractC10244c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseFragment extends Hilt_CourseFragment<FragmentCourseBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12531f;

    /* renamed from: g */
    public final InterfaceC8724d f12532g;

    /* renamed from: h */
    public CourseAdapter f12533h;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseFragment", m17801f = "CourseFragment.kt", m17802l = {37}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.CourseFragment$initData$1 */
    public static final class C79331 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12545a;

        /* renamed from: c */
        public int f12547c;

        public C79331(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12545a = obj;
            this.f12547c |= Integer.MIN_VALUE;
            return CourseFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseFragment$initData$3", m17801f = "CourseFragment.kt", m17802l = {48}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.CourseFragment$initData$3 */
    public static final class C79343 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12548a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseFragment$initData$3$1", m17801f = "CourseFragment.kt", m17802l = {49}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.find.CourseFragment$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12550a;

            /* renamed from: b */
            public /* synthetic */ Object f12551b;

            /* renamed from: c */
            public final /* synthetic */ CourseFragment f12552c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CourseFragment courseFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f12552c = courseFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12552c, interfaceC9324c);
                anonymousClass1.f12551b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f12551b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f12550a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    CourseAdapter courseAdapterM11038l = this.f12552c.m11038l();
                    this.f12551b = AbstractC9543h.m17814a(pagingData);
                    this.f12550a = 1;
                    if (courseAdapterM11038l.submitData(pagingData, this) == objM17291f) {
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

        public C79343(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return CourseFragment.this.new C79343(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79343) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12548a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12060a = CourseFragment.this.m11039m().m12060a();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CourseFragment.this, null);
                this.f12548a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12060a, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseFragment$initData$4", m17801f = "CourseFragment.kt", m17802l = {54}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.CourseFragment$initData$4 */
    public static final class C79354 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12553a;

        public C79354(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static final MultipleStatusView m11043k(CourseFragment courseFragment) {
            return ((FragmentCourseBinding) courseFragment.getMBindView()).msCourse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public static final SwipeRefreshLayout m11044l(CourseFragment courseFragment) {
            return ((FragmentCourseBinding) courseFragment.getMBindView()).swipe;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return CourseFragment.this.new C79354(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79354) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f12553a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                CourseFragment courseFragment = CourseFragment.this;
                CourseAdapter courseAdapterM11038l = courseFragment.m11038l();
                final CourseFragment courseFragment2 = CourseFragment.this;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.c
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return CourseFragment.C79354.m11043k(courseFragment2);
                    }
                };
                final CourseFragment courseFragment3 = CourseFragment.this;
                InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.d
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return CourseFragment.C79354.m11044l(courseFragment3);
                    }
                };
                this.f12553a = 1;
                if (BaseFragmentExtKt.m11866d(courseFragment, courseAdapterM11038l, interfaceC10559a, interfaceC10559a2, null, false, this, 24, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.CourseFragment$initView$2", m17801f = "CourseFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.CourseFragment$initView$2 */
    public static final class C79362 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12555a;

        public C79362(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return CourseFragment.this.new C79362(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79362) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12555a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            RecyclerView recyclerView = ((FragmentCourseBinding) CourseFragment.this.getMBindView()).recycleView;
            CourseFragment courseFragment = CourseFragment.this;
            AbstractC9133u.m16130d(recyclerView);
            courseFragment.m11034k(recyclerView);
            recyclerView.setAdapter(courseFragment.m11038l());
            return C8736p.f16368a;
        }
    }

    public CourseFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f12531f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f12532g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.CourseFragment$special$$inlined$viewModels$default$5
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
    public final void m11034k(RecyclerView recyclerView) {
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

    /* renamed from: n */
    private final DictViewModel m11035n() {
        return (DictViewModel) this.f12531f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final C8736p m11036o(CourseFragment courseFragment, CourseSimpleBean item) {
        AbstractC9133u.m16133g(item, "item");
        if (!((FragmentCourseBinding) courseFragment.getMBindView()).swipe.isRefreshing()) {
            FragmentKt.findNavController(courseFragment).navigate(AbstractC10244c.f20434a.m19159b(item));
        }
        return C8736p.f16368a;
    }

    /* renamed from: p */
    public static final void m11037p(CourseFragment courseFragment) {
        courseFragment.m11038l().refresh();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.CourseFragment.C79331
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.CourseFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.CourseFragment.C79331) r0
            int r1 = r0.f12547c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12547c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.CourseFragment$initData$1 r0 = new com.zykj.study.ui.home.find.CourseFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12545a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12547c
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
            r0.f12547c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.CourseAdapter r5 = new com.zykj.study.adapter.CourseAdapter
            y4.m r0 = new y4.m
            r0.<init>()
            com.zykj.study.viewmodels.DictViewModel r1 = r4.m11035n()
            r5.<init>(r0, r1)
            r4.m11040q(r5)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.find.CourseFragment$initData$3 r0 = new com.zykj.study.ui.home.find.CourseFragment$initData$3
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.find.CourseFragment$initData$4 r0 = new com.zykj.study.ui.home.find.CourseFragment$initData$4
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.CourseFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/CourseFragment.smali:443
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new C79362(null));
        ((FragmentCourseBinding) getMBindView()).swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: y4.l
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                CourseFragment.m11037p(this.f21096a);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final CourseAdapter m11038l() {
        CourseAdapter courseAdapter = this.f12533h;
        if (courseAdapter != null) {
            return courseAdapter;
        }
        AbstractC9133u.m16151y("courseAdapter");
        return null;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_course;
    }

    /* renamed from: m */
    public final CourseViewModel m11039m() {
        return (CourseViewModel) this.f12532g.getValue();
    }

    /* renamed from: q */
    public final void m11040q(CourseAdapter courseAdapter) {
        AbstractC9133u.m16133g(courseAdapter, "<set-?>");
        this.f12533h = courseAdapter;
    }
}
