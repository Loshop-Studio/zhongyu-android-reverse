package com.zykj.student.dialogue.p076ui.collect;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.NetworkUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.databinding.FragmentSearchedQuestionBinding;
import com.zykj.student.dialogue.p076ui.ask.AskDescriptionFragmentArgs;
import com.zykj.student.dialogue.p076ui.ask.SearchQuestionViewModel;
import com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment;
import com.zykj.student.dialogue.p076ui.detail.AnswerDetailFragmentArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p138i6.AbstractC8136b;
import p180m6.C9005k0;
import p294x6.AbstractC9902q;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;", "f", "Lkotlin/Lazy;", "r", "()Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;", "viewModel", "Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;", "g", "q", "()Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;", "rvAdapter", "Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;", "h", "Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;", "binding", "Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragmentArgs;", "i", "Landroidx/navigation/NavArgsLazy;", "p", "()Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragmentArgs;", "args", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSearchedQuestionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchedQuestionFragment.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n106#2,15:177\n42#3,3:192\n1247#4,6:195\n*S KotlinDebug\n*F\n+ 1 SearchedQuestionFragment.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment\n*L\n44#1:177,15\n63#1:192,3\n78#1:195,6\n*E\n"})
/* loaded from: classes5.dex */
public final class SearchedQuestionFragment extends Hilt_SearchedQuestionFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy rvAdapter;

    /* renamed from: h, reason: from kotlin metadata */
    public FragmentSearchedQuestionBinding binding;

    /* renamed from: i, reason: from kotlin metadata */
    public final NavArgsLazy args;

    /* renamed from: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$a */
    public static final class C7488a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10804a;

        public C7488a(Fragment fragment) {
            this.f10804a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10804a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10804a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onCreate$1", m13451f = "SearchedQuestionFragment.kt", m13452i = {}, m13453l = {146}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onCreate$1 */
    public static final class C74901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10806a;

        @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "", "Landroidx/work/WorkInfo;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onCreate$1$1", m13451f = "SearchedQuestionFragment.kt", m13452i = {0, 0, 0}, m13453l = {155}, m13454m = "invokeSuspend", m13455n = {"it", "workInfo", "$i$a$-let-SearchedQuestionFragment$onCreate$1$1$1"}, m13456s = {"L$0", "L$1", "I$0"})
        /* renamed from: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onCreate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends WorkInfo>, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public Object f10808a;

            /* renamed from: b */
            public int f10809b;

            /* renamed from: c */
            public int f10810c;

            /* renamed from: d */
            public /* synthetic */ Object f10811d;

            /* renamed from: e */
            public final /* synthetic */ SearchedQuestionFragment f10812e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchedQuestionFragment searchedQuestionFragment, Continuation continuation) {
                super(2, continuation);
                this.f10812e = searchedQuestionFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, Continuation continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10812e, continuation);
                anonymousClass1.f10811d = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.f10811d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10810c;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    WorkInfo workInfo = (WorkInfo) CollectionsKt.getOrNull(list, 0);
                    if (workInfo != null) {
                        SearchedQuestionFragment searchedQuestionFragment = this.f10812e;
                        if (workInfo.getState() == WorkInfo.State.SUCCEEDED) {
                            SearchQuestionViewModel searchQuestionViewModelM10168r = searchedQuestionFragment.m10168r();
                            String string = workInfo.getOutputData().getString("SUCCESS_KEY");
                            if (string == null) {
                                string = "";
                            }
                            searchQuestionViewModelM10168r.m10083q(string);
                        } else if (workInfo.getState() == WorkInfo.State.FAILED) {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            SearchedQuestionFragment$onCreate$1$1$1$1 searchedQuestionFragment$onCreate$1$1$1$1 = new SearchedQuestionFragment$onCreate$1$1$1$1(null);
                            this.f10811d = SpillingKt.nullOutSpilledVariable(list);
                            this.f10808a = SpillingKt.nullOutSpilledVariable(workInfo);
                            this.f10809b = 0;
                            this.f10810c = 1;
                            if (BuildersKt.withContext(main, searchedQuestionFragment$onCreate$1$1$1$1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C74901(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SearchedQuestionFragment.this.new C74901(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10806a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                WorkManager.Companion companion = WorkManager.INSTANCE;
                Context contextRequireContext = SearchedQuestionFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Flow flowAsFlow = FlowLiveDataConversions.asFlow(companion.getInstance(contextRequireContext).getWorkInfosForUniqueWorkLiveData("UPLOAD_SEARCH_IMAGE_WORK_NAME"));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchedQuestionFragment.this, null);
                this.f10806a = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onViewCreated$4", m13451f = "SearchedQuestionFragment.kt", m13452i = {}, m13453l = {114}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onViewCreated$4 */
    public static final class C74914 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10814a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lm6/k0;", "it", "", "<anonymous>", "(Lm6/k0;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onViewCreated$4$1", m13451f = "SearchedQuestionFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nSearchedQuestionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchedQuestionFragment.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,176:1\n257#2,2:177\n257#2,2:179\n257#2,2:181\n*S KotlinDebug\n*F\n+ 1 SearchedQuestionFragment.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1\n*L\n116#1:177,2\n117#1:179,2\n118#1:181,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onViewCreated$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C9005k0, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10816a;

            /* renamed from: b */
            public /* synthetic */ Object f10817b;

            /* renamed from: c */
            public final /* synthetic */ SearchedQuestionFragment f10818c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchedQuestionFragment searchedQuestionFragment, Continuation continuation) {
                super(2, continuation);
                this.f10818c = searchedQuestionFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C9005k0 c9005k0, Continuation continuation) {
                return ((AnonymousClass1) create(c9005k0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10818c, continuation);
                anonymousClass1.f10817b = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f10817b
                    m6.k0 r0 = (p180m6.C9005k0) r0
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f10816a
                    if (r1 != 0) goto Lbd
                    kotlin.ResultKt.throwOnFailure(r9)
                    java.lang.Object r9 = r0.m14381b()
                    boolean r1 = kotlin.Result.m24764isFailureimpl(r9)
                    r2 = 0
                    if (r1 == 0) goto L1a
                    r9 = r2
                L1a:
                    java.util.Collection r9 = (java.util.Collection) r9
                    r1 = 1
                    r3 = 0
                    if (r9 == 0) goto L29
                    boolean r9 = r9.isEmpty()
                    if (r9 == 0) goto L27
                    goto L29
                L27:
                    r9 = r3
                    goto L2a
                L29:
                    r9 = r1
                L2a:
                    com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment r4 = r8.f10818c
                    com.zykj.student.dialogue.databinding.FragmentSearchedQuestionBinding r4 = com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment.m10157n(r4)
                    java.lang.String r5 = "binding"
                    if (r4 != 0) goto L38
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
                    r4 = r2
                L38:
                    android.widget.TextView r4 = r4.f10544g
                    java.lang.String r6 = "tvHead"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                    r6 = 8
                    if (r9 != 0) goto L45
                    r7 = r3
                    goto L46
                L45:
                    r7 = r6
                L46:
                    r4.setVisibility(r7)
                    com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment r4 = r8.f10818c
                    com.zykj.student.dialogue.databinding.FragmentSearchedQuestionBinding r4 = com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment.m10157n(r4)
                    if (r4 != 0) goto L55
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
                    r4 = r2
                L55:
                    android.widget.TextView r4 = r4.f10543f
                    java.lang.String r7 = "tvCreate"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
                    if (r9 != 0) goto L60
                    r9 = r3
                    goto L61
                L60:
                    r9 = r6
                L61:
                    r4.setVisibility(r9)
                    com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment r9 = r8.f10818c
                    com.zykj.student.dialogue.databinding.FragmentSearchedQuestionBinding r9 = com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment.m10157n(r9)
                    if (r9 != 0) goto L70
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
                    r9 = r2
                L70:
                    android.widget.LinearLayout r9 = r9.f10541d
                    java.lang.String r4 = "llEmpty"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
                    java.lang.Object r4 = r0.m14381b()
                    boolean r4 = kotlin.Result.m24765isSuccessimpl(r4)
                    if (r4 == 0) goto L98
                    java.lang.Object r4 = r0.m14381b()
                    boolean r5 = kotlin.Result.m24764isFailureimpl(r4)
                    if (r5 == 0) goto L8c
                    goto L8d
                L8c:
                    r2 = r4
                L8d:
                    java.util.Collection r2 = (java.util.Collection) r2
                    if (r2 == 0) goto L99
                    boolean r2 = r2.isEmpty()
                    if (r2 == 0) goto L98
                    goto L99
                L98:
                    r1 = r3
                L99:
                    if (r1 == 0) goto L9c
                    goto L9d
                L9c:
                    r3 = r6
                L9d:
                    r9.setVisibility(r3)
                    com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment r9 = r8.f10818c
                    com.zykj.student.dialogue.ui.collect.SearchedQuestionListAdapter r9 = com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment.m10158o(r9)
                    java.lang.Object r0 = r0.m14381b()
                    java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                    boolean r2 = kotlin.Result.m24764isFailureimpl(r0)
                    if (r2 == 0) goto Lb5
                    r0 = r1
                Lb5:
                    java.util.List r0 = (java.util.List) r0
                    r9.submitList(r0)
                    kotlin.Unit r9 = kotlin.Unit.INSTANCE
                    return r9
                Lbd:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment.C74914.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1.smali:151
            }
        }

        public C74914(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SearchedQuestionFragment.this.new C74914(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10814a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowM10082p = SearchedQuestionFragment.this.m10168r().getUiState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchedQuestionFragment.this, null);
                this.f10814a = 1;
                if (FlowKt.collectLatest(stateFlowM10082p, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74914) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SearchedQuestionFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SearchQuestionViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.rvAdapter = LazyKt.lazy(new Function0() { // from class: n6.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchedQuestionFragment.m10163w(this.f15349a);
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(SearchedQuestionFragmentArgs.class), new C7488a(this));
    }

    /* renamed from: s */
    public static final Unit m10159s(SearchedQuestionFragment searchedQuestionFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("sessionId");
        boolean z9 = bundle.getBoolean("isCollected");
        if (string != null) {
            searchedQuestionFragment.m10168r().m10084r(string, z9);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m10160t(final SearchedQuestionFragment searchedQuestionFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954725255, i9, -1, "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment.onViewCreated.<anonymous>.<anonymous> (SearchedQuestionFragment.kt:77)");
            }
            boolean zChangedInstance = composer.changedInstance(searchedQuestionFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: n6.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchedQuestionFragment.m10161u(this.f15353a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            AbstractC9902q.m16972g("相似问题", 0, (Function0) objRememberedValue, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m10161u(SearchedQuestionFragment searchedQuestionFragment) {
        FragmentKt.findNavController(searchedQuestionFragment).navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m10162v(SearchedQuestionFragment searchedQuestionFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentKt.findNavController(searchedQuestionFragment).navigate(R.id.askDescriptionFragment, new AskDescriptionFragmentArgs(searchedQuestionFragment.m10166p().getImagePath()).m10016b());
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final SearchedQuestionListAdapter m10163w(final SearchedQuestionFragment searchedQuestionFragment) {
        return new SearchedQuestionListAdapter(new Function1() { // from class: n6.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchedQuestionFragment.m10164x(this.f15354a, (CollectSession) obj);
            }
        }, new Function1() { // from class: n6.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchedQuestionFragment.m10165y(this.f15355a, (CollectSession) obj);
            }
        });
    }

    /* renamed from: x */
    public static final Unit m10164x(SearchedQuestionFragment searchedQuestionFragment, CollectSession it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentKt.findNavController(searchedQuestionFragment).navigate(R.id.dialogue_detail_main, new AnswerDetailFragmentArgs(it.getId(), true, it.isCollect()).m10217d());
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10165y(SearchedQuestionFragment searchedQuestionFragment, CollectSession it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchedQuestionFragment.m10168r().m10081o(it);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.student.dialogue.p076ui.collect.Hilt_SearchedQuestionFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment.onAttach.1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentKt.findNavController(SearchedQuestionFragment.this).navigateUp();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m10166p().getImagePath().length() > 0) {
            if (NetworkUtils.isConnected()) {
                m10168r().m10085s(m10166p().getImagePath());
            } else {
                XToastUtils.INSTANCE.error("无网络连接，请检查网络");
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C74901(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSearchedQuestionBinding fragmentSearchedQuestionBindingM9969c = FragmentSearchedQuestionBinding.m9969c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fragmentSearchedQuestionBindingM9969c, "inflate(...)");
        this.binding = fragmentSearchedQuestionBindingM9969c;
        if (fragmentSearchedQuestionBindingM9969c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSearchedQuestionBindingM9969c = null;
        }
        ConstraintLayout constraintLayoutM9970b = fragmentSearchedQuestionBindingM9969c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM9970b, "getRoot(...)");
        return constraintLayoutM9970b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentSearchedQuestionBinding fragmentSearchedQuestionBinding = this.binding;
        if (fragmentSearchedQuestionBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSearchedQuestionBinding = null;
        }
        fragmentSearchedQuestionBinding.f10539b.setContent(ComposableLambdaKt.composableLambdaInstance(-954725255, true, new Function2() { // from class: n6.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SearchedQuestionFragment.m10160t(this.f15350a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentSearchedQuestionBinding fragmentSearchedQuestionBinding2 = this.binding;
        if (fragmentSearchedQuestionBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSearchedQuestionBinding2 = null;
        }
        ImageView ivCreate = fragmentSearchedQuestionBinding2.f10540c;
        Intrinsics.checkNotNullExpressionValue(ivCreate, "ivCreate");
        AbstractC8136b.m13040h(ivCreate, new Function1() { // from class: n6.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchedQuestionFragment.m10162v(this.f15351a, (View) obj);
            }
        });
        FragmentSearchedQuestionBinding fragmentSearchedQuestionBinding3 = this.binding;
        if (fragmentSearchedQuestionBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSearchedQuestionBinding3 = null;
        }
        RecyclerView recyclerView = fragmentSearchedQuestionBinding3.f10542e;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onViewCreated$3$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view2, RecyclerView parent, RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view2, parent, state);
                outRect.bottom = AbstractC8136b.m13034b(9);
                outRect.left = AbstractC8136b.m13034b(4);
                outRect.right = AbstractC8136b.m13034b(4);
            }
        });
        recyclerView.setAdapter(m10167q());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C74914(null), 3, null);
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "KEY_REFRESH_COLLECT_STATE", new Function2() { // from class: n6.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SearchedQuestionFragment.m10159s(this.f15352a, (String) obj, (Bundle) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final SearchedQuestionFragmentArgs m10166p() {
        return (SearchedQuestionFragmentArgs) this.args.getValue();
    }

    /* renamed from: q */
    public final SearchedQuestionListAdapter m10167q() {
        return (SearchedQuestionListAdapter) this.rvAdapter.getValue();
    }

    /* renamed from: r */
    public final SearchQuestionViewModel m10168r() {
        return (SearchQuestionViewModel) this.viewModel.getValue();
    }
}
