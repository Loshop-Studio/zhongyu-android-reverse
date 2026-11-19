package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$drawable;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.MyCourseAdapter;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.FragmentMyProductBinding;
import com.zykj.study.p065ui.home.p066my.MyCourseFragment;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.MyCourseViewModel;
import com.zykj.study.viewmodels.NotifyDataChangedViewModel;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8836g;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p275v4.AbstractC10244c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MyCourseFragment extends Hilt_MyCourseFragment<FragmentMyProductBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13249f;

    /* renamed from: g */
    public final InterfaceC8724d f13250g;

    /* renamed from: h */
    public final InterfaceC8724d f13251h;

    /* renamed from: i */
    public MyCourseAdapter f13252i;

    /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$a */
    public static final class C8049a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13268a;

        public C8049a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13268a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13268a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13268a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment", m17801f = "MyCourseFragment.kt", m17802l = {47}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initData$1 */
    public static final class C80501 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13269a;

        /* renamed from: c */
        public int f13271c;

        public C80501(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13269a = obj;
            this.f13271c |= Integer.MIN_VALUE;
            return MyCourseFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initData$3", m17801f = "MyCourseFragment.kt", m17802l = {61}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initData$3 */
    public static final class C80513 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13272a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initData$3$1", m17801f = "MyCourseFragment.kt", m17802l = {62}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13274a;

            /* renamed from: b */
            public /* synthetic */ Object f13275b;

            /* renamed from: c */
            public final /* synthetic */ MyCourseFragment f13276c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MyCourseFragment myCourseFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13276c = myCourseFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13276c, interfaceC9324c);
                anonymousClass1.f13275b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f13275b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13274a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    MyCourseAdapter myCourseAdapter = this.f13276c.f13252i;
                    if (myCourseAdapter == null) {
                        AbstractC9133u.m16151y("myCourseAdapter");
                        myCourseAdapter = null;
                    }
                    this.f13275b = AbstractC9543h.m17814a(pagingData);
                    this.f13274a = 1;
                    if (myCourseAdapter.submitData(pagingData, this) == objM17291f) {
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

        public C80513(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseFragment.this.new C80513(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80513) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13272a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12226c = MyCourseFragment.this.m11560q().m12226c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MyCourseFragment.this, null);
                this.f13272a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12226c, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initData$4", m17801f = "MyCourseFragment.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initData$4 */
    public static final class C80524 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13277a;

        public C80524(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static final MultipleStatusView m11563k(MyCourseFragment myCourseFragment) {
            return ((FragmentMyProductBinding) myCourseFragment.getMBindView()).msCourse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public static final SwipeRefreshLayout m11564l(MyCourseFragment myCourseFragment) {
            return ((FragmentMyProductBinding) myCourseFragment.getMBindView()).sfCourse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseFragment.this.new C80524(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80524) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13277a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                MyCourseFragment myCourseFragment = MyCourseFragment.this;
                MyCourseAdapter myCourseAdapter = myCourseFragment.f13252i;
                if (myCourseAdapter == null) {
                    AbstractC9133u.m16151y("myCourseAdapter");
                    myCourseAdapter = null;
                }
                final MyCourseFragment myCourseFragment2 = MyCourseFragment.this;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.j
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return MyCourseFragment.C80524.m11563k(myCourseFragment2);
                    }
                };
                final MyCourseFragment myCourseFragment3 = MyCourseFragment.this;
                InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.k
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return MyCourseFragment.C80524.m11564l(myCourseFragment3);
                    }
                };
                this.f13277a = 1;
                if (BaseFragmentExtKt.m11866d(myCourseFragment, myCourseAdapter, interfaceC10559a, interfaceC10559a2, null, false, this, 24, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initView$2", m17801f = "MyCourseFragment.kt", m17802l = {78}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initView$2 */
    public static final class C80532 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13279a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initView$2$1", m17801f = "MyCourseFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13281a;

            /* renamed from: b */
            public /* synthetic */ boolean f13282b;

            /* renamed from: c */
            public final /* synthetic */ MyCourseFragment f13283c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MyCourseFragment myCourseFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13283c = myCourseFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13283c, interfaceC9324c);
                anonymousClass1.f13282b = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f13282b;
                AbstractC9434a.m17291f();
                if (this.f13281a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                if (z10) {
                    MyCourseAdapter myCourseAdapter = this.f13283c.f13252i;
                    if (myCourseAdapter == null) {
                        AbstractC9133u.m16151y("myCourseAdapter");
                        myCourseAdapter = null;
                    }
                    myCourseAdapter.refresh();
                    this.f13283c.m11555r().m12236c(false);
                }
                return C8736p.f16368a;
            }

            public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        public C80532(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseFragment.this.new C80532(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80532) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13279a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9280q interfaceC9280qM12235b = MyCourseFragment.this.m11555r().m12235b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MyCourseFragment.this, null);
                this.f13279a = 1;
                if (AbstractC9268e.m17019i(interfaceC9280qM12235b, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseFragment$initView$3", m17801f = "MyCourseFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseFragment$initView$3 */
    public static final class C80543 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13284a;

        public C80543(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseFragment.this.new C80543(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80543) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f13284a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            RecyclerView recyclerView = ((FragmentMyProductBinding) MyCourseFragment.this.getMBindView()).rvCourse;
            MyCourseFragment myCourseFragment = MyCourseFragment.this;
            MyCourseAdapter myCourseAdapter = myCourseFragment.f13252i;
            if (myCourseAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myCourseAdapter = null;
            }
            recyclerView.setAdapter(myCourseAdapter);
            AbstractC9133u.m16130d(recyclerView);
            myCourseFragment.m11553o(recyclerView);
            return C8736p.f16368a;
        }
    }

    public MyCourseFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13249f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f13250g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(NotifyDataChangedViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$activityViewModels$default$5
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f13251h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MyCourseViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseFragment$special$$inlined$viewModels$default$5
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
    public final void m11553o(RecyclerView recyclerView) {
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
    private final DictViewModel m11554p() {
        return (DictViewModel) this.f13249f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final NotifyDataChangedViewModel m11555r() {
        return (NotifyDataChangedViewModel) this.f13250g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final C8736p m11556s(MyCourseFragment myCourseFragment, MyCourseEntity it) {
        AbstractC9133u.m16133g(it, "it");
        if (!((FragmentMyProductBinding) myCourseFragment.getMBindView()).sfCourse.isRefreshing()) {
            NavDirections navDirectionsM19162e = AbstractC10244c.f20434a.m19162e(it);
            FragmentActivity fragmentActivityRequireActivity = myCourseFragment.requireActivity();
            AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigation.findNavController(fragmentActivityRequireActivity, R$id.nav_host_fragment).navigate(navDirectionsM19162e);
        }
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final C8736p m11557t(MyCourseFragment myCourseFragment, UserBean userBean) {
        if (userBean != null) {
            MyCourseAdapter myCourseAdapter = myCourseFragment.f13252i;
            if (myCourseAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myCourseAdapter = null;
            }
            myCourseAdapter.m10050h(userBean);
        }
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final void m11558u(MyCourseFragment myCourseFragment) {
        MyCourseAdapter myCourseAdapter = myCourseFragment.f13252i;
        if (myCourseAdapter == null) {
            AbstractC9133u.m16151y("myCourseAdapter");
            myCourseAdapter = null;
        }
        myCourseAdapter.refresh();
    }

    /* renamed from: v */
    public static final void m11559v(MyCourseFragment myCourseFragment, View view) {
        AbstractC8836g.m14852b(null, new MyCourseFragment$initView$6$1(myCourseFragment, null), 1, null);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.MyCourseFragment.C80501
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.MyCourseFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.MyCourseFragment.C80501) r0
            int r1 = r0.f13271c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13271c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.MyCourseFragment$initData$1 r0 = new com.zykj.study.ui.home.my.MyCourseFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13269a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13271c
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
            r0.f13271c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MyCourseAdapter r5 = new com.zykj.study.adapter.MyCourseAdapter
            com.zykj.study.viewmodels.DictViewModel r0 = r4.m11554p()
            b5.d3 r1 = new b5.d3
            r1.<init>()
            r5.<init>(r0, r1)
            r4.f13252i = r5
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.my.MyCourseFragment$initData$3 r0 = new com.zykj.study.ui.home.my.MyCourseFragment$initData$3
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.my.MyCourseFragment$initData$4 r0 = new com.zykj.study.ui.home.my.MyCourseFragment$initData$4
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.MyCourseFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/MyCourseFragment.smali:669
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C80532(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new C80543(null));
        FlowLiveDataConversions.asLiveData$default(m11560q().m12228e().getData(), (InterfaceC9100d) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new C8049a(new InterfaceC10570l() { // from class: b5.e3
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseFragment.m11557t(this.f2145a, (UserBean) obj);
            }
        }));
        ((FragmentMyProductBinding) getMBindView()).sfCourse.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: b5.f3
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                MyCourseFragment.m11558u(this.f2155a);
            }
        });
        ((FragmentMyProductBinding) getMBindView()).btnCreate.setOnClickListener(new View.OnClickListener() { // from class: b5.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseFragment.m11559v(this.f2161a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_my_product;
    }

    /* renamed from: q */
    public final MyCourseViewModel m11560q() {
        return (MyCourseViewModel) this.f13251h.getValue();
    }
}
