package com.zykj.study.p065ui.home.p066my;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.Navigation;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.sketch.C7471R;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.MyTeachCourseAdapter;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.databinding.FragmentTeacherBinding;
import com.zykj.study.p065ui.home.p066my.TeacherFragment;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.MyTeachCourseViewModel;
import com.zykj.study.viewmodels.NotifyDataChangedViewModel;
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
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p275v4.AbstractC10244c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p306y2.C10607f;
import p306y2.C10608g;
import p306y2.C10610i;
import p306y2.InterfaceC10606e;
import p306y2.InterfaceC10609h;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class TeacherFragment extends Hilt_TeacherFragment<FragmentTeacherBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13470f;

    /* renamed from: g */
    public final InterfaceC8724d f13471g;

    /* renamed from: h */
    public final InterfaceC8724d f13472h;

    /* renamed from: i */
    public MyTeachCourseAdapter f13473i;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment", m17801f = "TeacherFragment.kt", m17802l = {48}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initData$1 */
    public static final class C80841 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13489a;

        /* renamed from: c */
        public int f13491c;

        public C80841(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13489a = obj;
            this.f13491c |= Integer.MIN_VALUE;
            return TeacherFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$initData$3", m17801f = "TeacherFragment.kt", m17802l = {61}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initData$3 */
    public static final class C80853 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13492a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$initData$3$1", m17801f = "TeacherFragment.kt", m17802l = {62}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13494a;

            /* renamed from: b */
            public /* synthetic */ Object f13495b;

            /* renamed from: c */
            public final /* synthetic */ TeacherFragment f13496c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TeacherFragment teacherFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13496c = teacherFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13496c, interfaceC9324c);
                anonymousClass1.f13495b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f13495b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13494a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    MyTeachCourseAdapter myTeachCourseAdapter = this.f13496c.f13473i;
                    if (myTeachCourseAdapter == null) {
                        AbstractC9133u.m16151y("myCourseAdapter");
                        myTeachCourseAdapter = null;
                    }
                    this.f13495b = AbstractC9543h.m17814a(pagingData);
                    this.f13494a = 1;
                    if (myTeachCourseAdapter.submitData(pagingData, this) == objM17291f) {
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

        public C80853(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeacherFragment.this.new C80853(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80853) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13492a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12232b = TeacherFragment.this.m11736s().m12232b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TeacherFragment.this, null);
                this.f13492a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12232b, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$initData$4", m17801f = "TeacherFragment.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initData$4 */
    public static final class C80864 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13497a;

        public C80864(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static final MultipleStatusView m11740k(TeacherFragment teacherFragment) {
            return ((FragmentTeacherBinding) teacherFragment.getMBindView()).msCourse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public static final SwipeRefreshLayout m11741l(TeacherFragment teacherFragment) {
            return ((FragmentTeacherBinding) teacherFragment.getMBindView()).sfCourse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeacherFragment.this.new C80864(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80864) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13497a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TeacherFragment teacherFragment = TeacherFragment.this;
                MyTeachCourseAdapter myTeachCourseAdapter = teacherFragment.f13473i;
                if (myTeachCourseAdapter == null) {
                    AbstractC9133u.m16151y("myCourseAdapter");
                    myTeachCourseAdapter = null;
                }
                final TeacherFragment teacherFragment2 = TeacherFragment.this;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.p
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return TeacherFragment.C80864.m11740k(teacherFragment2);
                    }
                };
                final TeacherFragment teacherFragment3 = TeacherFragment.this;
                InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.q
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return TeacherFragment.C80864.m11741l(teacherFragment3);
                    }
                };
                this.f13497a = 1;
                if (BaseFragmentExtKt.m11866d(teacherFragment, myTeachCourseAdapter, interfaceC10559a, interfaceC10559a2, null, false, this, 24, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$initView$2", m17801f = "TeacherFragment.kt", m17802l = {98}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initView$2 */
    public static final class C80872 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13499a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$initView$2$1", m17801f = "TeacherFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13501a;

            /* renamed from: b */
            public /* synthetic */ boolean f13502b;

            /* renamed from: c */
            public final /* synthetic */ TeacherFragment f13503c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TeacherFragment teacherFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13503c = teacherFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13503c, interfaceC9324c);
                anonymousClass1.f13502b = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f13502b;
                AbstractC9434a.m17291f();
                if (this.f13501a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                if (z10) {
                    MyTeachCourseAdapter myTeachCourseAdapter = this.f13503c.f13473i;
                    if (myTeachCourseAdapter == null) {
                        AbstractC9133u.m16151y("myCourseAdapter");
                        myTeachCourseAdapter = null;
                    }
                    myTeachCourseAdapter.refresh();
                    this.f13503c.m11730t().m12236c(false);
                }
                return C8736p.f16368a;
            }

            public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        public C80872(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeacherFragment.this.new C80872(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80872) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13499a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9280q interfaceC9280qM12235b = TeacherFragment.this.m11730t().m12235b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TeacherFragment.this, null);
                this.f13499a = 1;
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$initView$3", m17801f = "TeacherFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.TeacherFragment$initView$3 */
    public static final class C80883 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13504a;

        public C80883(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* renamed from: k */
        public static final void m11744k(TeacherFragment teacherFragment, SwipeRecyclerView swipeRecyclerView, C10607f c10607f, C10607f c10607f2, int i10) {
            C10610i c10610i = new C10610i(teacherFragment.requireContext());
            c10610i.m19805m(R$string.remove);
            c10610i.m19804l(-1);
            c10610i.m19808p(R$color.white);
            c10610i.m19809q(swipeRecyclerView.getResources().getDimensionPixelSize(R$dimen.view_50));
            c10610i.m19803k(swipeRecyclerView.getResources().getColor(C7471R.color.app_red));
            c10607f2.m19788a(c10610i);
        }

        /* renamed from: l */
        public static final void m11745l(TeacherFragment teacherFragment, C10608g c10608g, int i10) {
            c10608g.m19792a();
            MyTeachCourseAdapter myTeachCourseAdapter = teacherFragment.f13473i;
            if (myTeachCourseAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myTeachCourseAdapter = null;
            }
            CourseDetailsBean courseDetailsBeanPeek = myTeachCourseAdapter.peek(i10);
            if (courseDetailsBeanPeek != null) {
                teacherFragment.m11737y(courseDetailsBeanPeek);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeacherFragment.this.new C80883(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80883) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f13504a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            final SwipeRecyclerView swipeRecyclerView = ((FragmentTeacherBinding) TeacherFragment.this.getMBindView()).rvCourse;
            final TeacherFragment teacherFragment = TeacherFragment.this;
            AbstractC9133u.m16130d(swipeRecyclerView);
            teacherFragment.m11728q(swipeRecyclerView);
            swipeRecyclerView.setItemViewSwipeEnabled(false);
            swipeRecyclerView.setLongPressDragEnabled(false);
            swipeRecyclerView.setSwipeMenuCreator(new InterfaceC10609h() { // from class: com.zykj.study.ui.home.my.r
                @Override // p306y2.InterfaceC10609h
                /* renamed from: a */
                public final void mo11809a(C10607f c10607f, C10607f c10607f2, int i10) {
                    TeacherFragment.C80883.m11744k(teacherFragment, swipeRecyclerView, c10607f, c10607f2, i10);
                }
            });
            swipeRecyclerView.setOnItemMenuClickListener(new InterfaceC10606e() { // from class: com.zykj.study.ui.home.my.s
                @Override // p306y2.InterfaceC10606e
                /* renamed from: a */
                public final void mo7304a(C10608g c10608g, int i10) {
                    TeacherFragment.C80883.m11745l(teacherFragment, c10608g, i10);
                }
            });
            MyTeachCourseAdapter myTeachCourseAdapter = teacherFragment.f13473i;
            if (myTeachCourseAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myTeachCourseAdapter = null;
            }
            swipeRecyclerView.setAdapter(myTeachCourseAdapter);
            return C8736p.f16368a;
        }
    }

    public TeacherFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13470f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f13471g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(NotifyDataChangedViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$activityViewModels$default$5
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f13472h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MyTeachCourseViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeacherFragment$special$$inlined$viewModels$default$5
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
    /* renamed from: q */
    public final void m11728q(RecyclerView recyclerView) {
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

    /* renamed from: r */
    private final DictViewModel m11729r() {
        return (DictViewModel) this.f13470f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final NotifyDataChangedViewModel m11730t() {
        return (NotifyDataChangedViewModel) this.f13471g.getValue();
    }

    /* renamed from: u */
    public static final C8736p m11731u(TeacherFragment teacherFragment, CourseDetailsBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentActivity fragmentActivityRequireActivity = teacherFragment.requireActivity();
        AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigation.findNavController(fragmentActivityRequireActivity, R$id.nav_host_fragment).navigate(AbstractC10244c.f20434a.m19166i(it.getSuperviseId(), it));
        return C8736p.f16368a;
    }

    /* renamed from: v */
    public static final void m11732v(TeacherFragment teacherFragment) {
        MyTeachCourseAdapter myTeachCourseAdapter = teacherFragment.f13473i;
        if (myTeachCourseAdapter == null) {
            AbstractC9133u.m16151y("myCourseAdapter");
            myTeachCourseAdapter = null;
        }
        myTeachCourseAdapter.refresh();
    }

    /* renamed from: w */
    public static final void m11733w(TeacherFragment teacherFragment, View view) {
        FragmentActivity fragmentActivityRequireActivity = teacherFragment.requireActivity();
        AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigation.findNavController(fragmentActivityRequireActivity, R$id.nav_host_fragment).navigate(R$id.action_homeFragment_to_teachCourseAddFragment);
    }

    /* renamed from: x */
    public static final void m11734x(TeacherFragment teacherFragment, View view) {
        MyTeachCourseAdapter myTeachCourseAdapter = teacherFragment.f13473i;
        if (myTeachCourseAdapter == null) {
            AbstractC9133u.m16151y("myCourseAdapter");
            myTeachCourseAdapter = null;
        }
        myTeachCourseAdapter.refresh();
    }

    /* renamed from: z */
    public static final void m11735z(TeacherFragment teacherFragment, CourseDetailsBean courseDetailsBean, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        LifecycleOwner viewLifecycleOwner = teacherFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TeacherFragment$showDeleteDialog$1$1(teacherFragment, courseDetailsBean, null), 3, null);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.TeacherFragment.C80841
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.TeacherFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.TeacherFragment.C80841) r0
            int r1 = r0.f13491c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13491c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.TeacherFragment$initData$1 r0 = new com.zykj.study.ui.home.my.TeacherFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13489a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13491c
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
            r0.f13491c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MyTeachCourseAdapter r5 = new com.zykj.study.adapter.MyTeachCourseAdapter
            b5.q5 r0 = new b5.q5
            r0.<init>()
            com.zykj.study.viewmodels.DictViewModel r1 = r4.m11729r()
            r5.<init>(r0, r1)
            r4.f13473i = r5
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.my.TeacherFragment$initData$3 r0 = new com.zykj.study.ui.home.my.TeacherFragment$initData$3
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.my.TeacherFragment$initData$4 r0 = new com.zykj.study.ui.home.my.TeacherFragment$initData$4
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.TeacherFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeacherFragment.smali:750
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentTeacherBinding) getMBindView()).setEntity(m11736s());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C80872(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new C80883(null));
        ((FragmentTeacherBinding) getMBindView()).sfCourse.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: b5.n5
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                TeacherFragment.m11732v(this.f2215a);
            }
        });
        ((FragmentTeacherBinding) getMBindView()).btnCreate.setOnClickListener(new View.OnClickListener() { // from class: b5.o5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeacherFragment.m11733w(this.f2222a, view);
            }
        });
        ((FragmentTeacherBinding) getMBindView()).msCourse.setOnRetryClickListener(new View.OnClickListener() { // from class: b5.p5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeacherFragment.m11734x(this.f2228a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_teacher;
    }

    /* renamed from: s */
    public final MyTeachCourseViewModel m11736s() {
        return (MyTeachCourseViewModel) this.f13472h.getValue();
    }

    /* renamed from: y */
    public final void m11737y(final CourseDetailsBean courseDetailsBean) {
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.is_remove_course)).m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.r5
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                TeacherFragment.m11735z(this.f2244a, courseDetailsBean, materialDialog, dialogAction);
            }
        }).m6734E();
    }
}
