package com.zykj.student.dialogue.p076ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import com.zykj.student.dialogue.databinding.DialogueFragmentDetailTabBinding;
import com.zykj.student.dialogue.p076ui.detail.DetailTabFragment;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.DetailTabViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p214p6.C9336k;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&¨\u0006*"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lp6/k;", "viewState", "m", "(Lp6/k;)V", "Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;", "f", "Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;", "rvAdapter", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "g", "Lkotlin/Lazy;", "l", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "viewModel", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;", "h", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;", "binding", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/DetailTabViewModel;", "i", "getDetailTabViewModel", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/DetailTabViewModel;", "detailTabViewModel", "j", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDetailTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n49#2,8:122\n106#3,15:130\n774#4:145\n865#4,2:146\n*S KotlinDebug\n*F\n+ 1 DetailTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabFragment\n*L\n41#1:122,8\n44#1:130,15\n99#1:145\n99#1:146,2\n*E\n"})
/* loaded from: classes5.dex */
public final class DetailTabFragment extends Hilt_DetailTabFragment {

    /* renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k */
    public static final int f10976k = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public DetailTabAdapter rvAdapter;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public DialogueFragmentDetailTabBinding binding;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy detailTabViewModel;

    /* renamed from: com.zykj.student.dialogue.ui.detail.DetailTabFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DetailTabFragment m10321a(boolean z9) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_only_public", z9);
            DetailTabFragment detailTabFragment = new DetailTabFragment();
            detailTabFragment.setArguments(bundle);
            return detailTabFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2", m13451f = "DetailTabFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2 */
    public static final class C75122 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10994a;

        /* renamed from: b */
        public /* synthetic */ Object f10995b;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$1", m13451f = "DetailTabFragment.kt", m13452i = {}, m13453l = {68}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10997a;

            /* renamed from: b */
            public final /* synthetic */ DetailTabFragment f10998b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lp6/k;", "it", "", "<anonymous>", "(Lp6/k;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$1$2", m13451f = "DetailTabFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nDetailTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n257#2,2:122\n257#2,2:124\n257#2,2:126\n257#2,2:128\n774#3:130\n865#3,2:131\n*S KotlinDebug\n*F\n+ 1 DetailTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2\n*L\n71#1:122,2\n72#1:124,2\n74#1:126,2\n75#1:128,2\n78#1:130\n78#1:131,2\n*E\n"})
            /* renamed from: com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9336k, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10999a;

                /* renamed from: b */
                public /* synthetic */ Object f11000b;

                /* renamed from: c */
                public final /* synthetic */ DetailTabFragment f11001c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(DetailTabFragment detailTabFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11001c = detailTabFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9336k c9336k, Continuation continuation) {
                    return ((AnonymousClass2) create(c9336k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11001c, continuation);
                    anonymousClass2.f11000b = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.Collection] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ?? arrayList;
                    C9336k c9336k = (C9336k) this.f11000b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10999a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Bundle arguments = this.f11001c.getArguments();
                    boolean z9 = arguments != null ? arguments.getBoolean("key_only_public") : false;
                    DetailTabAdapter detailTabAdapter = null;
                    DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding = null;
                    if (Result.m24764isFailureimpl(c9336k.m15239n())) {
                        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding2 = this.f11001c.binding;
                        if (dialogueFragmentDetailTabBinding2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentDetailTabBinding2 = null;
                        }
                        TextView tvEmpty = dialogueFragmentDetailTabBinding2.f10453b;
                        Intrinsics.checkNotNullExpressionValue(tvEmpty, "tvEmpty");
                        tvEmpty.setVisibility(0);
                        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding3 = this.f11001c.binding;
                        if (dialogueFragmentDetailTabBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            dialogueFragmentDetailTabBinding = dialogueFragmentDetailTabBinding3;
                        }
                        RecyclerView recyclerView = dialogueFragmentDetailTabBinding.f10452a;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        recyclerView.setVisibility(8);
                    } else {
                        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding4 = this.f11001c.binding;
                        if (dialogueFragmentDetailTabBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentDetailTabBinding4 = null;
                        }
                        TextView tvEmpty2 = dialogueFragmentDetailTabBinding4.f10453b;
                        Intrinsics.checkNotNullExpressionValue(tvEmpty2, "tvEmpty");
                        tvEmpty2.setVisibility(8);
                        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding5 = this.f11001c.binding;
                        if (dialogueFragmentDetailTabBinding5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentDetailTabBinding5 = null;
                        }
                        RecyclerView recyclerView2 = dialogueFragmentDetailTabBinding5.f10452a;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        recyclerView2.setVisibility(0);
                        DetailTabAdapter detailTabAdapter2 = this.f11001c.rvAdapter;
                        if (detailTabAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rvAdapter");
                        } else {
                            detailTabAdapter = detailTabAdapter2;
                        }
                        if (z9) {
                            Object objM15239n = c9336k.m15239n();
                            List listEmptyList = CollectionsKt.emptyList();
                            if (Result.m24764isFailureimpl(objM15239n)) {
                                objM15239n = listEmptyList;
                            }
                            arrayList = new ArrayList();
                            for (Object obj2 : (Iterable) objM15239n) {
                                if (((MessageResponse) obj2).isPrimary()) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            Object objM15239n2 = c9336k.m15239n();
                            List listEmptyList2 = CollectionsKt.emptyList();
                            if (Result.m24764isFailureimpl(objM15239n2)) {
                                objM15239n2 = listEmptyList2;
                            }
                            arrayList = (List) objM15239n2;
                        }
                        detailTabAdapter.submitList(arrayList);
                        this.f11001c.m10320m(c9336k);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DetailTabFragment detailTabFragment, Continuation continuation) {
                super(2, continuation);
                this.f10998b = detailTabFragment;
            }

            /* renamed from: c */
            public static final boolean m10323c(C9336k c9336k, C9336k c9336k2) {
                return c9336k.m15244s() == c9336k2.m15244s() && Result.m24760equalsimpl0(c9336k2.m15239n(), c9336k.m15239n());
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10998b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10997a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.f10998b.m10318l().getViewState(), new Function2() { // from class: com.zykj.student.dialogue.ui.detail.k
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Boolean.valueOf(DetailTabFragment.C75122.AnonymousClass1.m10323c((C9336k) obj2, (C9336k) obj3));
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10998b, null);
                    this.f10997a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$2", m13451f = "DetailTabFragment.kt", m13452i = {}, m13453l = {87}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11002a;

            /* renamed from: b */
            public final /* synthetic */ DetailTabFragment f11003b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lp6/k;", "it", "", "<anonymous>", "(Lp6/k;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$2$2", m13451f = "DetailTabFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C100612 extends SuspendLambda implements Function2<C9336k, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11004a;

                /* renamed from: b */
                public /* synthetic */ Object f11005b;

                /* renamed from: c */
                public final /* synthetic */ DetailTabFragment f11006c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100612(DetailTabFragment detailTabFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11006c = detailTabFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9336k c9336k, Continuation continuation) {
                    return ((C100612) create(c9336k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100612 c100612 = new C100612(this.f11006c, continuation);
                    c100612.f11005b = obj;
                    return c100612;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9336k c9336k = (C9336k) this.f11005b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11004a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DetailTabAdapter detailTabAdapter = this.f11006c.rvAdapter;
                    if (detailTabAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvAdapter");
                        detailTabAdapter = null;
                    }
                    detailTabAdapter.m10308g();
                    this.f11006c.m10320m(c9336k);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DetailTabFragment detailTabFragment, Continuation continuation) {
                super(2, continuation);
                this.f11003b = detailTabFragment;
            }

            /* renamed from: c */
            public static final int m10326c(C9336k c9336k) {
                return c9336k.m15241p();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f11003b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f11002a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11003b.m10318l().getViewState(), new Function1() { // from class: com.zykj.student.dialogue.ui.detail.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(DetailTabFragment.C75122.AnonymousClass2.m10326c((C9336k) obj2));
                        }
                    });
                    C100612 c100612 = new C100612(this.f11003b, null);
                    this.f11002a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, c100612, this) == coroutine_suspended) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C75122(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C75122 c75122 = DetailTabFragment.this.new C75122(continuation);
            c75122.f10995b = obj;
            return c75122;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f10995b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10994a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(DetailTabFragment.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(DetailTabFragment.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DetailTabFragment() {
        final int i9 = R.id.dialogue_detail_main;
        final Lazy lazy = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i9);
            }
        });
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelCreationExtras();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelProviderFactory());
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$viewModels$default$2
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
        this.detailTabViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DetailTabViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final AnswerViewModel m10318l() {
        return (AnswerViewModel) this.viewModel.getValue();
    }

    /* renamed from: n */
    public static final void m10319n(DetailTabFragment detailTabFragment, C9336k c9336k) {
        final Context contextRequireContext = detailTabFragment.requireContext();
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(contextRequireContext) { // from class: com.zykj.student.dialogue.ui.detail.DetailTabFragment$handleScroll$2$smoothScroller$1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int getVerticalSnapPreference() {
                return -1;
            }
        };
        linearSmoothScroller.setTargetPosition(c9336k.m15241p());
        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding = detailTabFragment.binding;
        if (dialogueFragmentDetailTabBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentDetailTabBinding = null;
        }
        RecyclerView.LayoutManager layoutManager = dialogueFragmentDetailTabBinding.f10452a.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(linearSmoothScroller);
        }
    }

    /* renamed from: m */
    public final void m10320m(final C9336k viewState) {
        int size;
        Object objM15239n = viewState.m15239n();
        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding = null;
        if (Result.m24764isFailureimpl(objM15239n)) {
            objM15239n = null;
        }
        Collection collection = (Collection) objM15239n;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Bundle arguments = getArguments();
        boolean z9 = arguments != null ? arguments.getBoolean("key_only_public") : false;
        if (viewState.m15241p() != 0) {
            int iM15241p = viewState.m15241p();
            if (z9) {
                Object objM15239n2 = viewState.m15239n();
                List listEmptyList = CollectionsKt.emptyList();
                if (Result.m24764isFailureimpl(objM15239n2)) {
                    objM15239n2 = listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) objM15239n2) {
                    if (((MessageResponse) obj).isPrimary()) {
                        arrayList.add(obj);
                    }
                }
                size = arrayList.size();
            } else {
                Object objM15239n3 = viewState.m15239n();
                List listEmptyList2 = CollectionsKt.emptyList();
                if (Result.m24764isFailureimpl(objM15239n3)) {
                    objM15239n3 = listEmptyList2;
                }
                size = ((List) objM15239n3).size();
            }
            if (iM15241p != size - 1) {
                return;
            }
        }
        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding2 = this.binding;
        if (dialogueFragmentDetailTabBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogueFragmentDetailTabBinding = dialogueFragmentDetailTabBinding2;
        }
        dialogueFragmentDetailTabBinding.f10452a.post(new Runnable() { // from class: o6.w
            @Override // java.lang.Runnable
            public final void run() {
                DetailTabFragment.m10319n(this.f15621a, viewState);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBindingM9944a = DialogueFragmentDetailTabBinding.m9944a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogueFragmentDetailTabBindingM9944a, "inflate(...)");
        this.binding = dialogueFragmentDetailTabBindingM9944a;
        if (dialogueFragmentDetailTabBindingM9944a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentDetailTabBindingM9944a = null;
        }
        View root = dialogueFragmentDetailTabBindingM9944a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DialogueFragmentDetailTabBinding dialogueFragmentDetailTabBinding = this.binding;
        if (dialogueFragmentDetailTabBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentDetailTabBinding = null;
        }
        RecyclerView recyclerView = dialogueFragmentDetailTabBinding.f10452a;
        recyclerView.setHasFixedSize(true);
        DetailTabAdapter detailTabAdapter = new DetailTabAdapter(m10318l());
        this.rvAdapter = detailTabAdapter;
        recyclerView.setAdapter(detailTabAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C75122(null), 3, null);
    }
}
