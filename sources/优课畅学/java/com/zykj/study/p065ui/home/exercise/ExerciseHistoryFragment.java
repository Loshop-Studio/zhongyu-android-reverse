package com.zykj.study.p065ui.home.exercise;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.google.android.material.imageview.ShapeableImageView;
import com.tencent.smtt.sdk.TbsListener;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionExtra;
import com.zykj.study.bean.exercise.QuestionStatus;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.databinding.FragmentExerciseHistoryBinding;
import com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment;
import com.zykj.study.view.CustomWebView;
import com.zykj.study.view.MultipleChoiceAnimationView;
import com.zykj.study.view.MultipleChoiceView;
import com.zykj.study.viewmodels.ExerciseHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p077d8.C8321f;
import p086e5.C8356e;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8811w;
import p134i7.C8786j0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public class ExerciseHistoryFragment extends Hilt_ExerciseHistoryFragment<FragmentExerciseHistoryBinding> {

    /* renamed from: f */
    public final NavArgsLazy f11792f = new NavArgsLazy(AbstractC9137y.m16154b(ExerciseHistoryFragmentArgs.class), new C7789c(this));

    /* renamed from: g */
    public final InterfaceC8724d f11793g;

    /* renamed from: h */
    public final InterfaceC8724d f11794h;

    /* renamed from: i */
    public MicroAdapter f11795i;

    /* renamed from: j */
    public final InterfaceC8724d f11796j;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$a */
    public static final /* synthetic */ class C7787a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11811a;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.ANSWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.SINGLE_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.MULTIPLE_CHOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11811a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$b */
    public static final class C7788b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11813a;

        public C7788b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11813a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11813a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11813a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$c */
    public static final class C7789c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11814a;

        public C7789c(Fragment fragment) {
            this.f11814a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11814a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11814a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseHistoryFragment", m17801f = "ExerciseHistoryFragment.kt", m17802l = {48, C3721BR.versionName}, m17803m = "initData$suspendImpl")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initData$1 */
    public static final class C77901 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11815a;

        /* renamed from: b */
        public /* synthetic */ Object f11816b;

        /* renamed from: d */
        public int f11818d;

        public C77901(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11816b = obj;
            this.f11818d |= Integer.MIN_VALUE;
            return ExerciseHistoryFragment.m10545B(ExerciseHistoryFragment.this, this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initView$9", m17801f = "ExerciseHistoryFragment.kt", m17802l = {TbsListener.ErrorCode.UNZIP_DIR_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initView$9 */
    public static final class C77919 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11822a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initView$9$1", m17801f = "ExerciseHistoryFragment.kt", m17802l = {206}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initView$9$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11824a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseHistoryFragment f11825b;

            /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initView$9$1$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseHistoryFragment f11826a;

                public a(ExerciseHistoryFragment exerciseHistoryFragment) {
                    this.f11826a = exerciseHistoryFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: c */
                public final Object m10575c(boolean z10, InterfaceC9324c interfaceC9324c) {
                    ConstraintLayout parentLayout = ((FragmentExerciseHistoryBinding) this.f11826a.getMBindView()).exercise.exerciseAnswer.answerMicro.includeChartDetails.parentLayout;
                    AbstractC9133u.m16132f(parentLayout, "parentLayout");
                    parentLayout.setVisibility(!z10 ? 0 : 8);
                    return C8736p.f16368a;
                }

                @Override // p169l8.InterfaceC9267d
                public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
                    return m10575c(((Boolean) obj).booleanValue(), interfaceC9324c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExerciseHistoryFragment exerciseHistoryFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11825b = exerciseHistoryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f11825b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11824a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12102u = this.f11825b.m10572x().m12102u();
                    a aVar = new a(this.f11825b);
                    this.f11824a = 1;
                    if (interfaceC9280qM12102u.collect(aVar, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public C77919(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return ExerciseHistoryFragment.this.new C77919(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77919) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11822a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                LifecycleOwner viewLifecycleOwner = ExerciseHistoryFragment.this.getViewLifecycleOwner();
                AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ExerciseHistoryFragment.this, null);
                this.f11822a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objM17291f) {
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

    public ExerciseHistoryFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11793g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseHistoryViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f11794h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(WebViewControlViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a4 = interfaceC10559a2;
                if (interfaceC10559a4 != null && (creationExtras = (CreationExtras) interfaceC10559a4.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f11796j = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: w4.h
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ExerciseHistoryFragment.m10567t(this.f20526a);
            }
        });
    }

    /* renamed from: A */
    public static final C8736p m10544A(ExerciseHistoryFragment exerciseHistoryFragment, List list) {
        exerciseHistoryFragment.m10572x().m12101t(exerciseHistoryFragment.m10571w().m10579d());
        return C8736p.f16368a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r7.m12103v(r2, r4, r5, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m10545B(final com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment.C77901
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment.C77901) r0
            int r1 = r0.f11818d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11818d = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11816b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11818d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f11815a
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragment r6 = (com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment) r6
            kotlin.AbstractC9079b.m15926b(r7)
            goto L81
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f11815a
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragment r6 = (com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment) r6
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4e
        L40:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.f11815a = r6
            r0.f11818d = r4
            java.lang.Object r7 = super.initData(r0)
            if (r7 != r1) goto L4e
            goto L80
        L4e:
            com.zykj.study.adapter.MicroAdapter r7 = new com.zykj.study.adapter.MicroAdapter
            w4.f r2 = new w4.f
            r2.<init>()
            r7.<init>(r2)
            r6.f11795i = r7
            com.zykj.study.viewmodels.ExerciseHistoryViewModel r7 = r6.m10572x()
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragmentArgs r2 = r6.m10571w()
            int r2 = r2.m10577b()
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragmentArgs r4 = r6.m10571w()
            int r4 = r4.m10576a()
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragmentArgs r5 = r6.m10571w()
            int r5 = r5.m10578c()
            r0.f11815a = r6
            r0.f11818d = r3
            java.lang.Object r7 = r7.m12103v(r2, r4, r5, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            com.zykj.study.viewmodels.ExerciseHistoryViewModel r7 = r6.m10572x()
            androidx.lifecycle.MutableLiveData r7 = r7.m12010h()
            w4.g r0 = new w4.g
            r0.<init>()
            com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$b r1 = new com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$b
            r1.<init>(r0)
            r7.observe(r6, r1)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment.m10545B(com.zykj.study.ui.home.exercise.ExerciseHistoryFragment, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseHistoryFragment.smali:314
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public static final C8736p m10546C(final ExerciseHistoryFragment exerciseHistoryFragment, final QuestionBean questionBean) {
        List<String> options;
        if (questionBean == null) {
            return C8736p.f16368a;
        }
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseSubject.webView.loadData(questionBean.fetchAdaptContent(), "text/html; charset=UTF-8", null);
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseSubject.webViewCorrectAnswer.loadData(questionBean.getAdaptStandardAnswerStr(), "text/html; charset=UTF-8", null);
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseSubject.webViewAnalysis.loadData(questionBean.fetchAdaptAnalysis(), "text/html; charset=UTF-8", null);
        QuestionType questionType = questionBean.getQuestionType();
        int i10 = questionType == null ? -1 : C7787a.f11811a[questionType.ordinal()];
        if (i10 == 1) {
            ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseAnswer.myAnswerMicro.setSnapshotUrl(questionBean.getAnswerEx());
            ComponentCallbacks2C5391b.m2738t(exerciseHistoryFragment.requireContext()).m2809u(questionBean.getAnswerEx()).m2790w0(((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseAnswer.myAnswerMicro.ivSnapshot);
            ShapeableImageView ivSnapshot = ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseAnswer.myAnswerMicro.ivSnapshot;
            AbstractC9133u.m16132f(ivSnapshot, "ivSnapshot");
            BindingAdaptersKt.onClick(ivSnapshot, new InterfaceC10559a() { // from class: w4.o
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return ExerciseHistoryFragment.m10547D(questionBean, exerciseHistoryFragment);
                }
            });
        } else if (i10 == 2 || i10 == 3) {
            MultipleChoiceView multipleChoiceView = ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseAnswer.viewChoice.recycler;
            multipleChoiceView.m11938b();
            multipleChoiceView.setJudgingStatus(MultipleChoiceView.JudgingStatus.f13775e);
            QuestionExtra extra = questionBean.getExtra();
            if (extra != null && (options = extra.getOptions()) != null) {
                multipleChoiceView.setOptionList(options);
            }
            multipleChoiceView.setRightOptionList(questionBean.getStandardAnswerList());
            multipleChoiceView.setAnswerList(questionBean.getAnswerSubmit());
            AbstractC9133u.m16130d(multipleChoiceView);
        }
        LifecycleOwner viewLifecycleOwner = exerciseHistoryFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseHistoryFragment$initView$6$6(exerciseHistoryFragment, questionBean, null), 3, null);
        return C8736p.f16368a;
    }

    /* renamed from: D */
    public static final C8736p m10547D(QuestionBean questionBean, ExerciseHistoryFragment exerciseHistoryFragment) {
        String answerEx = questionBean.getAnswerEx();
        if (answerEx != null) {
            FragmentKt.findNavController(exerciseHistoryFragment).navigate(AbstractC7842b.f12100a.m10781b(answerEx));
        }
        return C8736p.f16368a;
    }

    /* renamed from: E */
    public static final void m10548E(ExerciseHistoryFragment exerciseHistoryFragment, View view) {
        FragmentKt.findNavController(exerciseHistoryFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public static final C8736p m10549F(ExerciseHistoryFragment exerciseHistoryFragment, List list) {
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.multipleChoiceView.m11923b();
        MultipleChoiceAnimationView multipleChoiceAnimationView = ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.multipleChoiceView;
        C8321f c8321f = new C8321f(1, list.size());
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(c8321f, 10));
        Iterator it = c8321f.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((AbstractC8792m0) it).nextInt()));
        }
        multipleChoiceAnimationView.setOptionList(AbstractC8778f0.m14544U0(arrayList));
        QuestionBean questionBean = (QuestionBean) exerciseHistoryFragment.m10572x().m12008f().getValue();
        if (questionBean != null) {
            ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.multipleChoiceView.setSelectedIndex(list.indexOf(questionBean));
        }
        AbstractC9133u.m16130d(list);
        Iterable iterableM14555c1 = AbstractC8778f0.m14555c1(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterableM14555c1) {
            if (((QuestionBean) ((C8786j0) obj).m14585b()).getStatus() != QuestionStatus.UN_ANSWERED) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(String.valueOf(((C8786j0) it2.next()).m14584a() + 1));
        }
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.multipleChoiceView.setAnswerList(AbstractC8778f0.m14544U0(arrayList3));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((QuestionBean) ((C8786j0) obj2).m14585b()).getCorrect()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(AbstractC8811w.m14786x(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(String.valueOf(((C8786j0) it3.next()).m14584a() + 1));
        }
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.multipleChoiceView.setRightOptionList(AbstractC8778f0.m14544U0(arrayList5));
        return C8736p.f16368a;
    }

    /* renamed from: G */
    public static final C8736p m10550G(ExerciseHistoryFragment exerciseHistoryFragment, SelectModel selectModel, int i10) {
        AbstractC9133u.m16133g(selectModel, "<unused var>");
        exerciseHistoryFragment.m10572x().m12101t(i10);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public static final C8736p m10551H(final ExerciseHistoryFragment exerciseHistoryFragment, ExerciseBean exerciseBean) {
        TitleBar titleBar = ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).toolbar;
        String title = exerciseBean.getTitle();
        if (title == null) {
            title = "";
        }
        titleBar.m6539t(title).m6535p(exerciseHistoryFragment.getString(R$string.arrow_left_return)).m6537r(exerciseHistoryFragment.getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(exerciseHistoryFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseHistoryFragment.m10552I(this.f20553a, view);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: I */
    public static final void m10552I(ExerciseHistoryFragment exerciseHistoryFragment, View view) {
        FragmentKt.findNavController(exerciseHistoryFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public static /* synthetic */ Object m10553J(final ExerciseHistoryFragment exerciseHistoryFragment, Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).setEntity(exerciseHistoryFragment.m10572x());
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).setWebViewControlViewModel(exerciseHistoryFragment.m10573y());
        exerciseHistoryFragment.m10573y().m12319c();
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).toolbar.m6535p(exerciseHistoryFragment.getString(R$string.arrow_left_return)).m6537r(exerciseHistoryFragment.getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(exerciseHistoryFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseHistoryFragment.m10548E(this.f20530a, view);
            }
        });
        exerciseHistoryFragment.m10572x().m12099r().observe(exerciseHistoryFragment.getViewLifecycleOwner(), new C7788b(new InterfaceC10570l() { // from class: w4.j
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseHistoryFragment.m10551H(this.f20538a, (ExerciseBean) obj);
            }
        }));
        RecyclerView recyclerView = ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseAnswer.answerMicro.recycler;
        MicroAdapter microAdapter = exerciseHistoryFragment.f11795i;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        recyclerView.setAdapter(microAdapter);
        MicroAdapter microAdapter2 = exerciseHistoryFragment.f11795i;
        if (microAdapter2 == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter2 = null;
        }
        microAdapter2.registerAdapterDataObserver(exerciseHistoryFragment.m10570v());
        AbstractC9133u.m16130d(recyclerView);
        exerciseHistoryFragment.m10569u(recyclerView);
        CustomWebView customWebView = ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.exerciseSubject.webView;
        C8356e c8356e = C8356e.f15876a;
        customWebView.m11883a(c8356e.m13622d());
        customWebView.m11883a(c8356e.m13619a());
        customWebView.m11883a(AbstractC8807u.m14755e(c8356e.m13620b()));
        exerciseHistoryFragment.m10572x().m12008f().observe(exerciseHistoryFragment.getViewLifecycleOwner(), new C7788b(new InterfaceC10570l() { // from class: w4.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseHistoryFragment.m10546C(this.f20545a, (QuestionBean) obj);
            }
        }));
        exerciseHistoryFragment.m10572x().m12010h().observe(exerciseHistoryFragment.getViewLifecycleOwner(), new C7788b(new InterfaceC10570l() { // from class: w4.l
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseHistoryFragment.m10549F(this.f20547a, (List) obj);
            }
        }));
        ((FragmentExerciseHistoryBinding) exerciseHistoryFragment.getMBindView()).exercise.multipleChoiceView.setItemClickListener(new InterfaceC10574p() { // from class: w4.m
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ExerciseHistoryFragment.m10550G(this.f20550a, (SelectModel) obj, ((Integer) obj2).intValue());
            }
        });
        LifecycleOwner viewLifecycleOwner = exerciseHistoryFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, exerciseHistoryFragment.new C77919(null), 3, null);
        return C8736p.f16368a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$adapterDataObserver$2$1] */
    /* renamed from: t */
    public static final ExerciseHistoryFragment$adapterDataObserver$2$1 m10567t(final ExerciseHistoryFragment exerciseHistoryFragment) {
        return new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$adapterDataObserver$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                RecyclerView recycler = ((FragmentExerciseHistoryBinding) this.f11812a.getMBindView()).exercise.exerciseAnswer.answerMicro.recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                MicroAdapter microAdapter = this.f11812a.f11795i;
                if (microAdapter == null) {
                    AbstractC9133u.m16151y("microAdapter");
                    microAdapter = null;
                }
                recycler.setVisibility(microAdapter.getItemCount() > 0 ? 0 : 8);
                LinearLayout llMicroEmpty = ((FragmentExerciseHistoryBinding) this.f11812a.getMBindView()).exercise.exerciseAnswer.answerMicro.llMicroEmpty;
                AbstractC9133u.m16132f(llMicroEmpty, "llMicroEmpty");
                RecyclerView recycler2 = ((FragmentExerciseHistoryBinding) this.f11812a.getMBindView()).exercise.exerciseAnswer.answerMicro.recycler;
                AbstractC9133u.m16132f(recycler2, "recycler");
                llMicroEmpty.setVisibility(recycler2.getVisibility() == 0 ? 8 : 0);
            }
        };
    }

    /* renamed from: z */
    public static final C8736p m10568z(ExerciseHistoryFragment exerciseHistoryFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(exerciseHistoryFragment).navigate(AbstractC7842b.f12100a.m10780a(it.getUrl()));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        return m10545B(this, interfaceC9324c);
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        return m10553J(this, bundle, interfaceC9324c);
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_history;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MicroAdapter microAdapter = this.f11795i;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        microAdapter.unregisterAdapterDataObserver(m10570v());
    }

    /* renamed from: u */
    public final void m10569u(RecyclerView recyclerView) {
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

    /* renamed from: v */
    public final ExerciseHistoryFragment$adapterDataObserver$2$1 m10570v() {
        return (ExerciseHistoryFragment$adapterDataObserver$2$1) this.f11796j.getValue();
    }

    /* renamed from: w */
    public final ExerciseHistoryFragmentArgs m10571w() {
        return (ExerciseHistoryFragmentArgs) this.f11792f.getValue();
    }

    /* renamed from: x */
    public final ExerciseHistoryViewModel m10572x() {
        return (ExerciseHistoryViewModel) this.f11793g.getValue();
    }

    /* renamed from: y */
    public final WebViewControlViewModel m10573y() {
        return (WebViewControlViewModel) this.f11794h.getValue();
    }
}
