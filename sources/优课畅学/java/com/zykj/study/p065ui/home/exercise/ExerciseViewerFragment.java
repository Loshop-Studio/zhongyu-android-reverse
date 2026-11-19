package com.zykj.study.p065ui.home.exercise;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
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
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.ChartBarAdapter;
import com.zykj.study.adapter.MicroEditAdapter;
import com.zykj.study.adapter.MicroViewAdapter;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.databinding.FragmentExerciseViewerBinding;
import com.zykj.study.p065ui.home.exercise.AbstractC7845e;
import com.zykj.study.p065ui.home.exercise.ExerciseViewerFragment;
import com.zykj.study.view.CustomWebView;
import com.zykj.study.viewmodels.ExerciseViewerViewModel;
import com.zykj.study.viewmodels.MicroExtraViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import java.io.File;
import java.util.List;
import java.util.UUID;
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
import p134i7.AbstractC8807u;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseViewerFragment extends Hilt_ExerciseViewerFragment<FragmentExerciseViewerBinding> {

    /* renamed from: f */
    public final NavArgsLazy f11913f = new NavArgsLazy(AbstractC9137y.m16154b(ExerciseViewerFragmentArgs.class), new C7820b(this));

    /* renamed from: g */
    public final InterfaceC8724d f11914g;

    /* renamed from: h */
    public final InterfaceC8724d f11915h;

    /* renamed from: i */
    public final InterfaceC8724d f11916i;

    /* renamed from: j */
    public MicroEditAdapter f11917j;

    /* renamed from: k */
    public MicroViewAdapter f11918k;

    /* renamed from: l */
    public final InterfaceC8724d f11919l;

    /* renamed from: m */
    public final InterfaceC8724d f11920m;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$a */
    public static final class C7819a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11939a;

        public C7819a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11939a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11939a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11939a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$b */
    public static final class C7820b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11941a;

        public C7820b(Fragment fragment) {
            this.f11941a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11941a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11941a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment", m17801f = "ExerciseViewerFragment.kt", m17802l = {55}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initData$1 */
    public static final class C78211 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11942a;

        /* renamed from: c */
        public int f11944c;

        public C78211(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11942a = obj;
            this.f11944c |= Integer.MIN_VALUE;
            return ExerciseViewerFragment.this.initData(this);
        }
    }

    public ExerciseViewerFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11914g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseViewerViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$5
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
        this.f11915h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MicroExtraViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                return (interfaceC10559a3 == null || (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f11916i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(WebViewControlViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$9
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$special$$inlined$viewModels$default$10
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
        this.f11919l = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: w4.x0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ExerciseViewerFragment.m10651B(this.f20584a);
            }
        });
        this.f11920m = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: w4.y0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ExerciseViewerFragment.m10653D(this.f20586a);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.study.ui.home.exercise.ExerciseViewerFragment$adapterDataObserver$2$1] */
    /* renamed from: B */
    public static final ExerciseViewerFragment$adapterDataObserver$2$1 m10651B(final ExerciseViewerFragment exerciseViewerFragment) {
        return new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$adapterDataObserver$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                RecyclerView recycler = ((FragmentExerciseViewerBinding) this.f11940a.getMBindView()).exerciseAnswer.answerMicro.recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                MicroViewAdapter microViewAdapter = this.f11940a.f11918k;
                if (microViewAdapter == null) {
                    AbstractC9133u.m16151y("microViewAdapter");
                    microViewAdapter = null;
                }
                recycler.setVisibility(microViewAdapter.getItemCount() > 0 ? 0 : 8);
                LinearLayout llMicroEmpty = ((FragmentExerciseViewerBinding) this.f11940a.getMBindView()).exerciseAnswer.answerMicro.llMicroEmpty;
                AbstractC9133u.m16132f(llMicroEmpty, "llMicroEmpty");
                RecyclerView recycler2 = ((FragmentExerciseViewerBinding) this.f11940a.getMBindView()).exerciseAnswer.answerMicro.recycler;
                AbstractC9133u.m16132f(recycler2, "recycler");
                llMicroEmpty.setVisibility(recycler2.getVisibility() == 0 ? 8 : 0);
            }
        };
    }

    /* renamed from: C */
    private final void m10652C(RecyclerView recyclerView) {
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

    /* renamed from: D */
    public static final ChartBarAdapter m10653D(final ExerciseViewerFragment exerciseViewerFragment) {
        return new ChartBarAdapter(new InterfaceC10570l() { // from class: w4.o0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseViewerFragment.m10654E(this.f20558a, (ChoiceChartData) obj);
            }
        });
    }

    /* renamed from: E */
    public static final C8736p m10654E(ExerciseViewerFragment exerciseViewerFragment, ChoiceChartData entity) {
        AbstractC9133u.m16133g(entity, "entity");
        exerciseViewerFragment.m10692I().m12004b(entity);
        return C8736p.f16368a;
    }

    /* renamed from: K */
    private final WebViewControlViewModel m10655K() {
        return (WebViewControlViewModel) this.f11916i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public static final C8736p m10656L(ExerciseViewerFragment exerciseViewerFragment, List list) {
        if (list.isEmpty()) {
            ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).multipleStatusView.m11963h();
        } else {
            exerciseViewerFragment.m10692I().m12171v(exerciseViewerFragment.m10690G().m10703b());
            ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).multipleStatusView.m11961f();
        }
        return C8736p.f16368a;
    }

    /* renamed from: M */
    public static final C8736p m10657M(ExerciseViewerFragment exerciseViewerFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(exerciseViewerFragment).navigate(AbstractC7845e.f12112a.m10786b(it.getUrl()));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public static final C8736p m10658N(ExerciseViewerFragment exerciseViewerFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        QuestionBean questionBean = (QuestionBean) exerciseViewerFragment.m10692I().m12008f().getValue();
        if (questionBean != null) {
            exerciseViewerFragment.m10695Y(exerciseViewerFragment.m10690G().m10702a(), questionBean.getId(), it);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public static final C8736p m10659O(ExerciseViewerFragment exerciseViewerFragment) {
        String absolutePath;
        QuestionBean questionBean = (QuestionBean) exerciseViewerFragment.m10692I().m12008f().getValue();
        if (questionBean != null) {
            exerciseViewerFragment.m10693J().m12202b(questionBean.getContent());
            NavController navControllerFindNavController = FragmentKt.findNavController(exerciseViewerFragment);
            AbstractC7845e.c cVar = AbstractC7845e.f12112a;
            File externalCacheDir = exerciseViewerFragment.requireContext().getExternalCacheDir();
            if (externalCacheDir == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = exerciseViewerFragment.requireContext().getCacheDir().getAbsolutePath();
            }
            String absolutePath2 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
            AbstractC9133u.m16132f(absolutePath2, "getAbsolutePath(...)");
            navControllerFindNavController.navigate(cVar.m10785a(absolutePath2, exerciseViewerFragment.m10690G().m10702a(), questionBean.getId()));
        }
        return C8736p.f16368a;
    }

    /* renamed from: P */
    public static final C8736p m10660P(ExerciseViewerFragment exerciseViewerFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(exerciseViewerFragment).navigate(AbstractC7845e.f12112a.m10786b(it.getUrl()));
        return C8736p.f16368a;
    }

    /* renamed from: Q */
    public static final C8736p m10661Q(ExerciseViewerFragment exerciseViewerFragment, String str) {
        exerciseViewerFragment.m10696a0();
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    public static final C8736p m10662S(final ExerciseViewerFragment exerciseViewerFragment, String str) {
        ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).toolbar.m6539t(str).m6535p(exerciseViewerFragment.getString(R$string.arrow_left_return)).m6537r(ContextCompat.getColor(exerciseViewerFragment.requireContext(), R$color.toolbar_back_icon_color)).m6538s(exerciseViewerFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseViewerFragment.m10663T(this.f20566a, view);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: T */
    public static final void m10663T(ExerciseViewerFragment exerciseViewerFragment, View view) {
        FragmentKt.findNavController(exerciseViewerFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U */
    public static final C8736p m10664U(ExerciseViewerFragment exerciseViewerFragment, QuestionBean questionBean) {
        ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).exerciseSubject.webView.loadData(questionBean.fetchAdaptContent(), "text/html; charset=UTF-8", null);
        ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).exerciseSubject.webViewCorrectAnswer.loadData(questionBean.getAdaptStandardAnswerStr(), "text/html; charset=UTF-8", null);
        ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).exerciseSubject.webViewAnalysis.loadData(questionBean.fetchAdaptAnalysis(), "text/html; charset=UTF-8", null);
        exerciseViewerFragment.m10696a0();
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    public static final C8736p m10665V(ExerciseViewerFragment exerciseViewerFragment, Integer num) {
        ((FragmentExerciseViewerBinding) exerciseViewerFragment.getMBindView()).toolbar.m6529j();
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    private final void m10666W() {
        RecyclerView recyclerView = ((FragmentExerciseViewerBinding) getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.recyclerViewChart;
        recyclerView.setAdapter(m10691H());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
    }

    /* renamed from: X */
    public static final void m10667X(ExerciseViewerFragment exerciseViewerFragment, View view) {
        FragmentKt.findNavController(exerciseViewerFragment).navigateUp();
    }

    /* renamed from: Z */
    public static final void m10668Z(ExerciseViewerFragment exerciseViewerFragment, int i10, String str, MicroBean microBean, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        LifecycleOwner viewLifecycleOwner = exerciseViewerFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseViewerFragment$showDeleteDialog$1$1(exerciseViewerFragment, i10, str, microBean, null), 3, null);
    }

    /* renamed from: F */
    public final ExerciseViewerFragment$adapterDataObserver$2$1 m10689F() {
        return (ExerciseViewerFragment$adapterDataObserver$2$1) this.f11919l.getValue();
    }

    /* renamed from: G */
    public final ExerciseViewerFragmentArgs m10690G() {
        return (ExerciseViewerFragmentArgs) this.f11913f.getValue();
    }

    /* renamed from: H */
    public final ChartBarAdapter m10691H() {
        return (ChartBarAdapter) this.f11920m.getValue();
    }

    /* renamed from: I */
    public final ExerciseViewerViewModel m10692I() {
        return (ExerciseViewerViewModel) this.f11914g.getValue();
    }

    /* renamed from: J */
    public final MicroExtraViewModel m10693J() {
        return (MicroExtraViewModel) this.f11915h.getValue();
    }

    /* renamed from: R */
    public final void m10694R() {
        m10692I().m12169t().observe(getViewLifecycleOwner(), new C7819a(new InterfaceC10570l() { // from class: w4.z0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseViewerFragment.m10662S(this.f20588a, (String) obj);
            }
        }));
        m10692I().m12008f().observe(getViewLifecycleOwner(), new C7819a(new InterfaceC10570l() { // from class: w4.m0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseViewerFragment.m10664U(this.f20551a, (QuestionBean) obj);
            }
        }));
        m10692I().m12007e().observe(getViewLifecycleOwner(), new C7819a(new InterfaceC10570l() { // from class: w4.n0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseViewerFragment.m10665V(this.f20554a, (Integer) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseViewerFragment$initObserver$4(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new ExerciseViewerFragment$initObserver$5(this, null), 3, null);
    }

    /* renamed from: Y */
    public final void m10695Y(final int i10, final String str, final MicroBean microBean) {
        new MaterialDialog.C6913g(requireContext()).m6749j(getString(R$string.is_delete_exercise_micro)).m6759t(R$string.cancel).m6765z(R$string.sure).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: w4.p0
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                ExerciseViewerFragment.m10668Z(this.f20560a, i10, str, microBean, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public final void m10696a0() {
        QuestionBean questionBean = (QuestionBean) m10692I().m12008f().getValue();
        if (questionBean != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseViewerFragment$updateMicroList$1$1(this, questionBean, null), 3, null);
        }
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.ExerciseViewerFragment.C78211
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.ExerciseViewerFragment.C78211) r0
            int r1 = r0.f11944c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11944c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11942a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11944c
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
            r0.f11944c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.ExerciseViewerViewModel r5 = r4.m10692I()
            com.zykj.study.ui.home.exercise.ExerciseViewerFragmentArgs r0 = r4.m10690G()
            int r0 = r0.m10702a()
            r5.m12170u(r0)
            com.zykj.study.viewmodels.ExerciseViewerViewModel r5 = r4.m10692I()
            androidx.lifecycle.MutableLiveData r5 = r5.m12010h()
            w4.r0 r0 = new w4.r0
            r0.<init>()
            com.zykj.study.ui.home.exercise.ExerciseViewerFragment$a r1 = new com.zykj.study.ui.home.exercise.ExerciseViewerFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            com.zykj.study.adapter.MicroEditAdapter r5 = new com.zykj.study.adapter.MicroEditAdapter
            w4.s0 r0 = new w4.s0
            r0.<init>()
            w4.t0 r1 = new w4.t0
            r1.<init>()
            w4.u0 r2 = new w4.u0
            r2.<init>()
            r5.<init>(r0, r1, r2)
            r4.f11917j = r5
            com.zykj.study.adapter.MicroViewAdapter r5 = new com.zykj.study.adapter.MicroViewAdapter
            w4.v0 r0 = new w4.v0
            r0.<init>()
            r5.<init>(r0)
            r4.f11918k = r5
            androidx.navigation.NavController r5 = androidx.navigation.fragment.FragmentKt.findNavController(r4)
            androidx.navigation.NavBackStackEntry r5 = r5.getCurrentBackStackEntry()
            if (r5 == 0) goto La8
            androidx.lifecycle.SavedStateHandle r5 = r5.getSavedStateHandle()
            if (r5 == 0) goto La8
            java.lang.String r0 = "result_zip_url"
            androidx.lifecycle.MutableLiveData r5 = r5.getLiveData(r0)
            if (r5 == 0) goto La8
            w4.w0 r0 = new w4.w0
            r0.<init>()
            com.zykj.study.ui.home.exercise.ExerciseViewerFragment$a r1 = new com.zykj.study.ui.home.exercise.ExerciseViewerFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
        La8:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.ExerciseViewerFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseViewerFragment.smali:2325
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m10666W();
        m10694R();
        ((FragmentExerciseViewerBinding) getMBindView()).setEntity(m10692I());
        ((FragmentExerciseViewerBinding) getMBindView()).setWebViewControlViewModel(m10655K());
        m10655K().m12319c();
        ((FragmentExerciseViewerBinding) getMBindView()).toolbar.m6535p(getString(R$string.arrow_left_return)).m6537r(ContextCompat.getColor(requireContext(), R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseViewerFragment.m10667X(this.f20548a, view);
            }
        });
        RecyclerView recyclerView = ((FragmentExerciseViewerBinding) getMBindView()).exerciseAnswer.answerMicro.recycler;
        RecyclerView.Adapter adapter = null;
        if (m10690G().m10704c()) {
            MicroEditAdapter microEditAdapter = this.f11917j;
            if (microEditAdapter == null) {
                AbstractC9133u.m16151y("microEditAdapter");
            } else {
                adapter = microEditAdapter;
            }
        } else {
            MicroViewAdapter microViewAdapter = this.f11918k;
            if (microViewAdapter == null) {
                AbstractC9133u.m16151y("microViewAdapter");
            } else {
                adapter = microViewAdapter;
            }
            adapter.registerAdapterDataObserver(m10689F());
        }
        recyclerView.setAdapter(adapter);
        AbstractC9133u.m16130d(recyclerView);
        m10652C(recyclerView);
        CustomWebView customWebView = ((FragmentExerciseViewerBinding) getMBindView()).exerciseSubject.webView;
        C8356e c8356e = C8356e.f15876a;
        customWebView.m11883a(c8356e.m13622d());
        customWebView.m11883a(c8356e.m13619a());
        customWebView.m11883a(AbstractC8807u.m14755e(c8356e.m13620b()));
        CustomWebView customWebView2 = ((FragmentExerciseViewerBinding) getMBindView()).exerciseSubject.webViewAnalysis;
        customWebView2.m11883a(c8356e.m13622d());
        customWebView2.m11883a(c8356e.m13619a());
        customWebView2.m11883a(AbstractC8807u.m14755e(c8356e.m13620b()));
        CustomWebView customWebView3 = ((FragmentExerciseViewerBinding) getMBindView()).exerciseSubject.webViewCorrectAnswer;
        customWebView3.m11883a(c8356e.m13622d());
        customWebView3.m11883a(c8356e.m13619a());
        customWebView3.m11883a(AbstractC8807u.m14755e(c8356e.m13620b()));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_viewer;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        try {
            MicroViewAdapter microViewAdapter = this.f11918k;
            if (microViewAdapter == null) {
                AbstractC9133u.m16151y("microViewAdapter");
                microViewAdapter = null;
            }
            microViewAdapter.unregisterAdapterDataObserver(m10689F());
        } catch (IllegalStateException unused) {
        }
    }
}
