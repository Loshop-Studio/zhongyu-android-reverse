package com.zykj.study.p065ui.home.exercise.train;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$drawable;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.bean.exercise.QuestionStatus;
import com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding;
import com.zykj.study.p065ui.home.exercise.train.AbstractC7917h;
import com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.OssTokenViewModel;
import com.zykj.study.viewmodels.TrainAnswerMicroViewModel;
import java.io.File;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p105g0.C8514b;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AnswerResultFragment extends Hilt_AnswerResultFragment<FragmentExerciseTrainAnswerResultBinding> {

    /* renamed from: k */
    public static final C7857a f12178k = new C7857a(null);

    /* renamed from: l */
    public static final int f12179l = 8;

    /* renamed from: f */
    public final InterfaceC8724d f12180f;

    /* renamed from: g */
    public final InterfaceC8724d f12181g;

    /* renamed from: h */
    public final InterfaceC8724d f12182h;

    /* renamed from: i */
    public MicroAdapter f12183i;

    /* renamed from: j */
    public final InterfaceC8724d f12184j;

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$a */
    public static final class C7857a {
        public /* synthetic */ C7857a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7857a() {
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$b */
    public static final class C7860b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12217a;

        public C7860b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12217a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12217a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12217a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment", m17801f = "AnswerResultFragment.kt", m17802l = {63}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initData$1 */
    public static final class C78611 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12218a;

        /* renamed from: c */
        public int f12220c;

        public C78611(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12218a = obj;
            this.f12220c |= Integer.MIN_VALUE;
            return AnswerResultFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment", m17801f = "AnswerResultFragment.kt", m17802l = {96}, m17803m = "initView")
    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initView$1 */
    public static final class C78621 extends ContinuationImpl {

        /* renamed from: a */
        public Object f12224a;

        /* renamed from: b */
        public Object f12225b;

        /* renamed from: c */
        public int f12226c;

        /* renamed from: d */
        public /* synthetic */ Object f12227d;

        /* renamed from: f */
        public int f12229f;

        public C78621(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12227d = obj;
            this.f12229f |= Integer.MIN_VALUE;
            return AnswerResultFragment.this.initView(null, this);
        }
    }

    public AnswerResultFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: x4.o
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerResultFragment.m10845y(this.f20950a);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12180f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseTrainViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$4
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
        final int i10 = R$id.nav_answer_graph;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f12181g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TrainAnswerMicroViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelProviderFactory());
            }
        });
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f12182h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(OssTokenViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$8
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$special$$inlined$viewModels$default$9
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
        this.f12184j = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: x4.p
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerResultFragment.m10843v(this.f20952a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final ExerciseTrainViewModel m10819A() {
        return (ExerciseTrainViewModel) this.f12180f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final OssTokenViewModel m10820B() {
        return (OssTokenViewModel) this.f12182h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final TrainAnswerMicroViewModel m10821C() {
        return (TrainAnswerMicroViewModel) this.f12181g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static final C8736p m10822E(final AnswerResultFragment answerResultFragment, String str) {
        final File file = new File(str);
        if (file.exists()) {
            ((C5396g) ComponentCallbacks2C5391b.m2738t(answerResultFragment.requireContext()).m2809u(str).m13383d0(new C8514b(Long.valueOf(file.lastModified())))).m2790w0(((FragmentExerciseTrainAnswerResultBinding) answerResultFragment.getMBindView()).editAnswerMicro.ivSnapshot);
            ShapeableImageView ivSnapshot = ((FragmentExerciseTrainAnswerResultBinding) answerResultFragment.getMBindView()).editAnswerMicro.ivSnapshot;
            AbstractC9133u.m16132f(ivSnapshot, "ivSnapshot");
            BindingAdaptersKt.onClick(ivSnapshot, new InterfaceC10559a() { // from class: x4.s
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return AnswerResultFragment.m10823F(file, answerResultFragment);
                }
            });
        } else {
            ComponentCallbacks2C5391b.m2738t(answerResultFragment.requireContext()).m2801m(((FragmentExerciseTrainAnswerResultBinding) answerResultFragment.getMBindView()).editAnswerMicro.ivSnapshot);
        }
        return C8736p.f16368a;
    }

    /* renamed from: F */
    public static final C8736p m10823F(File file, AnswerResultFragment answerResultFragment) {
        AbstractC7917h.a aVar = AbstractC7917h.f12494a;
        String absolutePath = file.getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
        FragmentKt.findNavController(answerResultFragment).navigate(aVar.m10990b(absolutePath));
        return C8736p.f16368a;
    }

    /* renamed from: G */
    public static final C8736p m10824G(AnswerResultFragment answerResultFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(answerResultFragment).navigate(AbstractC7923n.f12504a.m10999b(it.getUrl()));
        return C8736p.f16368a;
    }

    /* renamed from: I */
    public static final C8736p m10825I(AnswerResultFragment answerResultFragment) {
        answerResultFragment.m10819A().m12151E(answerResultFragment.m10819A().m12158v(), true);
        if (answerResultFragment.m10821C().m12023c().getStatus() != QuestionStatus.UN_ANSWERED) {
            FragmentKt.findNavController(answerResultFragment).navigateUp();
            return C8736p.f16368a;
        }
        FragmentKt.findNavController(answerResultFragment).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: J */
    public static final C8736p m10826J(AnswerResultFragment answerResultFragment) {
        LifecycleOwner viewLifecycleOwner = answerResultFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnswerResultFragment$initView$5$1(answerResultFragment, null), 3, null);
        return C8736p.f16368a;
    }

    /* renamed from: K */
    public static final C8736p m10827K(AnswerResultFragment answerResultFragment) {
        LifecycleOwner viewLifecycleOwner = answerResultFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnswerResultFragment$initView$6$1(answerResultFragment, null), 3, null);
        return C8736p.f16368a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.study.ui.home.exercise.train.AnswerResultFragment$adapterDataObserver$2$1] */
    /* renamed from: v */
    public static final AnswerResultFragment$adapterDataObserver$2$1 m10843v(final AnswerResultFragment answerResultFragment) {
        return new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$adapterDataObserver$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                RecyclerView recycler = ((FragmentExerciseTrainAnswerResultBinding) this.f12204a.getMBindView()).answerMicro.recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                MicroAdapter microAdapter = this.f12204a.f12183i;
                if (microAdapter == null) {
                    AbstractC9133u.m16151y("microAdapter");
                    microAdapter = null;
                }
                recycler.setVisibility(microAdapter.getItemCount() > 0 ? 0 : 8);
                LinearLayout llMicroEmpty = ((FragmentExerciseTrainAnswerResultBinding) this.f12204a.getMBindView()).answerMicro.llMicroEmpty;
                AbstractC9133u.m16132f(llMicroEmpty, "llMicroEmpty");
                RecyclerView recycler2 = ((FragmentExerciseTrainAnswerResultBinding) this.f12204a.getMBindView()).answerMicro.recycler;
                AbstractC9133u.m16132f(recycler2, "recycler");
                llMicroEmpty.setVisibility(recycler2.getVisibility() == 0 ? 8 : 0);
            }
        };
    }

    /* renamed from: w */
    private final void m10844w(RecyclerView recyclerView) {
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

    /* renamed from: y */
    public static final ViewModelStoreOwner m10845y(AnswerResultFragment answerResultFragment) {
        Fragment fragmentRequireParentFragment = answerResultFragment.requireParentFragment().requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: D */
    public final void m10846D() {
        m10819A().m12147A().observe(getViewLifecycleOwner(), new C7860b(new InterfaceC10570l() { // from class: x4.r
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AnswerResultFragment.m10822E(this.f20955a, (String) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10847H(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment$initMicro$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initMicro$1 r0 = (com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment$initMicro$1) r0
            int r1 = r0.f12223c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12223c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initMicro$1 r0 = new com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initMicro$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12221a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12223c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel r5 = r4.m10821C()
            r0.f12223c = r3
            java.lang.Object r5 = r5.m12306j(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.List r5 = (java.util.List) r5
            com.zykj.study.adapter.MicroAdapter r0 = r4.f12183i
            if (r0 != 0) goto L4d
            java.lang.String r0 = "microAdapter"
            kotlin.jvm.internal.AbstractC9133u.m16151y(r0)
            r0 = 0
        L4d:
            r0.m10028h(r5)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.m10847H(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerResultFragment.smali:1332
    }

    /* renamed from: L */
    public final void m10848L(String str, boolean z10, InterfaceC10559a interfaceC10559a) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnswerResultFragment$uploadMicroThumbnail$1(str, this, z10, interfaceC10559a, null), 3, null);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.C78611
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.C78611) r0
            int r1 = r0.f12220c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12220c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12218a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12220c
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
            r0.f12220c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MicroAdapter r5 = new com.zykj.study.adapter.MicroAdapter
            x4.q r0 = new x4.q
            r0.<init>()
            r5.<init>(r0)
            r4.f12183i = r5
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerResultFragment.smali:1571
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initView(android.os.Bundle r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.C78621
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initView$1 r0 = (com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.C78621) r0
            int r1 = r0.f12229f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12229f = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initView$1 r0 = new com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initView$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12227d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12229f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f12225b
            com.zykj.study.bean.exercise.QuestionBean r7 = (com.zykj.study.bean.exercise.QuestionBean) r7
            java.lang.Object r7 = r0.f12224a
            android.os.Bundle r7 = (android.os.Bundle) r7
            kotlin.AbstractC9079b.m15926b(r8)
            goto L9a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.databinding.ViewDataBinding r8 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding r8 = (com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding) r8
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel r2 = r6.m10821C()
            r8.setTrainViewModel(r2)
            androidx.databinding.ViewDataBinding r8 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding r8 = (com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding) r8
            com.zykj.study.databinding.ViewMicroBinding r8 = r8.answerMicro
            androidx.recyclerview.widget.RecyclerView r8 = r8.recycler
            com.zykj.study.adapter.MicroAdapter r2 = r6.f12183i
            r4 = 0
            java.lang.String r5 = "microAdapter"
            if (r2 != 0) goto L5e
            kotlin.jvm.internal.AbstractC9133u.m16151y(r5)
            r2 = r4
        L5e:
            r8.setAdapter(r2)
            kotlin.jvm.internal.AbstractC9133u.m16130d(r8)
            r6.m10844w(r8)
            com.zykj.study.adapter.MicroAdapter r8 = r6.f12183i
            if (r8 != 0) goto L6f
            kotlin.jvm.internal.AbstractC9133u.m16151y(r5)
            goto L70
        L6f:
            r4 = r8
        L70:
            com.zykj.study.ui.home.exercise.train.AnswerResultFragment$adapterDataObserver$2$1 r8 = r6.m10850z()
            r4.registerAdapterDataObserver(r8)
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel r8 = r6.m10821C()
            com.zykj.study.bean.exercise.QuestionBean r8 = r8.m12023c()
            r6.m10846D()
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
            r0.f12224a = r7
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r8)
            r0.f12225b = r7
            r7 = 0
            r0.f12226c = r7
            r0.f12229f = r3
            java.lang.Object r7 = r6.m10847H(r0)
            if (r7 != r1) goto L9a
            return r1
        L9a:
            androidx.databinding.ViewDataBinding r7 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding r7 = (com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding) r7
            com.zykj.study.databinding.ViewEditAnswerMicroButtonBinding r7 = r7.editAnswerMicroButton
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r7 = r7.btnRevision
            java.lang.String r8 = "btnRevision"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            x4.l r8 = new x4.l
            r8.<init>()
            com.zykj.base.ext.BindingAdaptersKt.onClick(r7, r8)
            androidx.databinding.ViewDataBinding r7 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding r7 = (com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding) r7
            com.zykj.study.databinding.ViewEditAnswerMicroButtonBinding r7 = r7.editAnswerMicroButton
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r7 = r7.btnNext
            java.lang.String r8 = "btnNext"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            x4.m r8 = new x4.m
            r8.<init>()
            com.zykj.base.ext.BindingAdaptersKt.onClick(r7, r8)
            androidx.databinding.ViewDataBinding r7 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding r7 = (com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding) r7
            com.zykj.study.databinding.ViewEditAnswerMicroButtonBinding r7 = r7.editAnswerMicroButton
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r7 = r7.btnComplete
            java.lang.String r8 = "btnComplete"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            x4.n r8 = new x4.n
            r8.<init>()
            com.zykj.base.ext.BindingAdaptersKt.onClick(r7, r8)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment.initView(android.os.Bundle, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerResultFragment.smali:1735
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train_answer_result;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MicroAdapter microAdapter = this.f12183i;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        microAdapter.unregisterAdapterDataObserver(m10850z());
    }

    /* renamed from: x */
    public final void m10849x(String str, boolean z10, InterfaceC10559a interfaceC10559a) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnswerResultFragment$attachmentToServer$1(this, z10, str, interfaceC10559a, null), 3, null);
    }

    /* renamed from: z */
    public final AnswerResultFragment$adapterDataObserver$2$1 m10850z() {
        return (AnswerResultFragment$adapterDataObserver$2$1) this.f12184j.getValue();
    }
}
