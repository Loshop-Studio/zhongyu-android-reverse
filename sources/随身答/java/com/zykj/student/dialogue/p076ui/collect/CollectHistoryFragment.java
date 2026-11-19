package com.zykj.student.dialogue.p076ui.collect;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.TimeUtils;
import com.taobao.sophix.PatchStatus;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.databinding.FragmentCollectHistoryBinding;
import com.zykj.student.dialogue.p076ui.collect.AbstractC7494b;
import com.zykj.student.dialogue.p076ui.collect.CollectHistoryFragment;
import com.zykj.student.dialogue.p076ui.detail.AnswerDetailFragmentArgs;
import com.zykj.student.dialogue.p076ui.home.HomeFilterViewModel;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p138i6.AbstractC8136b;
import p244s6.C9526k0;
import p244s6.C9560s2;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010.¨\u00062"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/CollectHistoryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "q", "Lcom/zykj/student/dialogue/databinding/FragmentCollectHistoryBinding;", "f", "Lcom/zykj/student/dialogue/databinding/FragmentCollectHistoryBinding;", "binding", "Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;", "g", "Lkotlin/Lazy;", "r", "()Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;", "collectHistoryViewModel", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "h", "t", "()Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;", "i", "s", "()Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;", "filterViewModel", "Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;", "j", "u", "()Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;", "rvAdapter", "k", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCollectHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectHistoryFragment.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,200:1\n106#2,15:201\n172#2,9:216\n106#2,15:225\n*S KotlinDebug\n*F\n+ 1 CollectHistoryFragment.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryFragment\n*L\n50#1:201,15\n52#1:216,9\n54#1:225,15\n*E\n"})
/* loaded from: classes5.dex */
public final class CollectHistoryFragment extends Hilt_CollectHistoryFragment {

    /* renamed from: l */
    public static final int f10693l = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public FragmentCollectHistoryBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy collectHistoryViewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public final Lazy homeViewModel;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy filterViewModel;

    /* renamed from: j, reason: from kotlin metadata */
    public final Lazy rvAdapter;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$2", m13451f = "CollectHistoryFragment.kt", m13452i = {}, m13453l = {115}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$2 */
    public static final class C74812 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10718a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Landroidx/paging/CombinedLoadStates;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$2$2", m13451f = "CollectHistoryFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nCollectHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectHistoryFragment.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onViewCreated$2$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,200:1\n257#2,2:201\n*S KotlinDebug\n*F\n+ 1 CollectHistoryFragment.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryFragment$onViewCreated$2$2\n*L\n118#1:201,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CombinedLoadStates, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10720a;

            /* renamed from: b */
            public /* synthetic */ Object f10721b;

            /* renamed from: c */
            public final /* synthetic */ CollectHistoryFragment f10722c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CollectHistoryFragment collectHistoryFragment, Continuation continuation) {
                super(2, continuation);
                this.f10722c = collectHistoryFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CombinedLoadStates combinedLoadStates, Continuation continuation) {
                return ((AnonymousClass2) create(combinedLoadStates, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10722c, continuation);
                anonymousClass2.f10721b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this.f10721b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10720a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentCollectHistoryBinding fragmentCollectHistoryBinding = this.f10722c.binding;
                FragmentCollectHistoryBinding fragmentCollectHistoryBinding2 = null;
                if (fragmentCollectHistoryBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentCollectHistoryBinding = null;
                }
                fragmentCollectHistoryBinding.f10512f.setRefreshing(combinedLoadStates.getRefresh() instanceof LoadState.Loading);
                if (combinedLoadStates.getRefresh() instanceof LoadState.NotLoading) {
                    FragmentCollectHistoryBinding fragmentCollectHistoryBinding3 = this.f10722c.binding;
                    if (fragmentCollectHistoryBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentCollectHistoryBinding2 = fragmentCollectHistoryBinding3;
                    }
                    LinearLayout llEmpty = fragmentCollectHistoryBinding2.f10510d;
                    Intrinsics.checkNotNullExpressionValue(llEmpty, "llEmpty");
                    llEmpty.setVisibility(this.f10722c.m10108u().getItemCount() == 0 ? 0 : 8);
                }
                return Unit.INSTANCE;
            }
        }

        public C74812(Continuation continuation) {
            super(2, continuation);
        }

        /* renamed from: c */
        public static final LoadState m10110c(CombinedLoadStates combinedLoadStates) {
            return combinedLoadStates.getRefresh();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CollectHistoryFragment.this.new C74812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10718a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CombinedLoadStates> loadStateFlow = CollectHistoryFragment.this.m10108u().getLoadStateFlow();
                Lifecycle lifecycle = CollectHistoryFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowExtKt.flowWithLifecycle(loadStateFlow, lifecycle, Lifecycle.State.RESUMED), new Function1() { // from class: com.zykj.student.dialogue.ui.collect.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CollectHistoryFragment.C74812.m10110c((CombinedLoadStates) obj2);
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CollectHistoryFragment.this, null);
                this.f10718a = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
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
            return ((C74812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$4", m13451f = "CollectHistoryFragment.kt", m13452i = {}, m13453l = {130}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$4 */
    public static final class C74824 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10723a;

        @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$4$1", m13451f = "CollectHistoryFragment.kt", m13452i = {0}, m13453l = {PatchStatus.CODE_LOAD_LIB_UNDEFINED}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
        /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PagingData<CollectSession>, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10725a;

            /* renamed from: b */
            public /* synthetic */ Object f10726b;

            /* renamed from: c */
            public final /* synthetic */ CollectHistoryFragment f10727c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectHistoryFragment collectHistoryFragment, Continuation continuation) {
                super(2, continuation);
                this.f10727c = collectHistoryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10727c, continuation);
                anonymousClass1.f10726b = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(PagingData pagingData, Continuation continuation) {
                return ((AnonymousClass1) create(pagingData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PagingData pagingData = (PagingData) this.f10726b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10725a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CollectListAdapter collectListAdapterM10108u = this.f10727c.m10108u();
                    this.f10726b = SpillingKt.nullOutSpilledVariable(pagingData);
                    this.f10725a = 1;
                    if (collectListAdapterM10108u.submitData(pagingData, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(PagingData<CollectSession> pagingData, Continuation<? super Unit> continuation) {
                return invoke2((PagingData) pagingData, (Continuation) continuation);
            }
        }

        public C74824(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CollectHistoryFragment.this.new C74824(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10723a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM10117q = CollectHistoryFragment.this.m10106r().getDataFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CollectHistoryFragment.this, null);
                this.f10723a = 1;
                if (FlowKt.collectLatest(flowM10117q, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C74824) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$6", m13451f = "CollectHistoryFragment.kt", m13452i = {}, m13453l = {143}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$6 */
    public static final class C74846 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10729a;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$6$1", m13451f = "CollectHistoryFragment.kt", m13452i = {}, m13453l = {145}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10731a;

            /* renamed from: b */
            public final /* synthetic */ CollectHistoryFragment f10732b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/k0;", "it", "", "<anonymous>", "(Ls6/k0;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$6$1$1", m13451f = "CollectHistoryFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$6$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C100581 extends SuspendLambda implements Function2<C9526k0, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10733a;

                /* renamed from: b */
                public /* synthetic */ Object f10734b;

                /* renamed from: c */
                public final /* synthetic */ CollectHistoryFragment f10735c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100581(CollectHistoryFragment collectHistoryFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10735c = collectHistoryFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9526k0 c9526k0, Continuation continuation) {
                    return ((C100581) create(c9526k0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100581 c100581 = new C100581(this.f10735c, continuation);
                    c100581.f10734b = obj;
                    return c100581;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9526k0 c9526k0 = (C9526k0) this.f10734b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10733a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.f10735c.m10106r().m10123w(c9526k0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectHistoryFragment collectHistoryFragment, Continuation continuation) {
                super(2, continuation);
                this.f10732b = collectHistoryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10732b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10731a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM10851A = this.f10732b.m10099t().getFilterConditions();
                    C100581 c100581 = new C100581(this.f10732b, null);
                    this.f10731a = 1;
                    if (FlowKt.collectLatest(stateFlowM10851A, c100581, this) == coroutine_suspended) {
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

        public C74846(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CollectHistoryFragment.this.new C74846(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10729a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                CollectHistoryFragment collectHistoryFragment = CollectHistoryFragment.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectHistoryFragment, null);
                this.f10729a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(collectHistoryFragment, state, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C74846) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CollectHistoryFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$2
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
        this.collectHistoryViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CollectHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$5
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
        this.homeViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                return (function03 == null || (creationExtras = (CreationExtras) function03.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.filterViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$special$$inlined$viewModels$default$10
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
        this.rvAdapter = LazyKt.lazy(new Function0() { // from class: n6.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectHistoryFragment.m10102x(this.f15333a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final HomeViewModel m10099t() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* renamed from: v */
    public static final void m10100v(CollectHistoryFragment collectHistoryFragment) {
        collectHistoryFragment.m10105q();
    }

    /* renamed from: w */
    public static final Unit m10101w(CollectHistoryFragment collectHistoryFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("sessionId");
        boolean z9 = bundle.getBoolean("isCollected");
        if (string != null) {
            collectHistoryFragment.m10106r().m10120t(new AbstractC7494b.a(string, z9, z9 ? TimeUtils.getNowString() : null));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final CollectListAdapter m10102x(final CollectHistoryFragment collectHistoryFragment) {
        return new CollectListAdapter(new Function1() { // from class: n6.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectHistoryFragment.m10103y(this.f15336a, (CollectSession) obj);
            }
        }, new Function1() { // from class: n6.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectHistoryFragment.m10104z(this.f15337a, (CollectSession) obj);
            }
        });
    }

    /* renamed from: y */
    public static final Unit m10103y(CollectHistoryFragment collectHistoryFragment, CollectSession it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentKt.findNavController(collectHistoryFragment).navigate(R.id.dialogue_detail_main, new AnswerDetailFragmentArgs(it.getId(), true, it.isCollect()).m10217d());
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m10104z(CollectHistoryFragment collectHistoryFragment, CollectSession it) {
        Intrinsics.checkNotNullParameter(it, "it");
        collectHistoryFragment.m10106r().m10122v(it.getId(), !it.isCollect());
        return Unit.INSTANCE;
    }

    @Override // com.zykj.student.dialogue.p076ui.collect.Hilt_CollectHistoryFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentCollectHistoryBinding fragmentCollectHistoryBinding = this.f10717a.binding;
                FragmentCollectHistoryBinding fragmentCollectHistoryBinding2 = null;
                if (fragmentCollectHistoryBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentCollectHistoryBinding = null;
                }
                if (fragmentCollectHistoryBinding.f10509c.isDrawerOpen(GravityCompat.END)) {
                    FragmentCollectHistoryBinding fragmentCollectHistoryBinding3 = this.f10717a.binding;
                    if (fragmentCollectHistoryBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentCollectHistoryBinding2 = fragmentCollectHistoryBinding3;
                    }
                    fragmentCollectHistoryBinding2.f10509c.closeDrawer(GravityCompat.END);
                    return;
                }
                if (((C9560s2) this.f10717a.m10099t().getHomeUiState().getValue()).m15754g()) {
                    this.f10717a.m10099t().m10875x();
                    return;
                }
                setEnabled(false);
                this.f10717a.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                setEnabled(true);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentCollectHistoryBinding fragmentCollectHistoryBindingM9957c = FragmentCollectHistoryBinding.m9957c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fragmentCollectHistoryBindingM9957c, "inflate(...)");
        this.binding = fragmentCollectHistoryBindingM9957c;
        if (fragmentCollectHistoryBindingM9957c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentCollectHistoryBindingM9957c = null;
        }
        FrameLayout frameLayoutM9958b = fragmentCollectHistoryBindingM9957c.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM9958b, "getRoot(...)");
        return frameLayoutM9958b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m10105q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m10106r().m10121u(m10099t());
        FragmentCollectHistoryBinding fragmentCollectHistoryBinding = this.binding;
        if (fragmentCollectHistoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentCollectHistoryBinding = null;
        }
        RecyclerView recyclerView = fragmentCollectHistoryBinding.f10511e;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment$onViewCreated$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view2, RecyclerView parent, RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view2, parent, state);
                if (parent.getChildViewHolder(view2).getBindingAdapterPosition() < 3) {
                    outRect.top = AbstractC8136b.m13034b(9);
                }
                outRect.bottom = AbstractC8136b.m13034b(9);
                outRect.left = AbstractC8136b.m13034b(4);
                outRect.right = AbstractC8136b.m13034b(4);
            }
        });
        recyclerView.setAdapter(m10108u());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C74812(null), 3, null);
        FragmentCollectHistoryBinding fragmentCollectHistoryBinding2 = this.binding;
        if (fragmentCollectHistoryBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentCollectHistoryBinding2 = null;
        }
        fragmentCollectHistoryBinding2.f10512f.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: n6.b
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                CollectHistoryFragment.m10100v(this.f15334a);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C74824(null), 3, null);
        FragmentCollectHistoryBinding fragmentCollectHistoryBinding3 = this.binding;
        if (fragmentCollectHistoryBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentCollectHistoryBinding3 = null;
        }
        fragmentCollectHistoryBinding3.f10509c.addDrawerListener(new DrawerLayout.SimpleDrawerListener() { // from class: com.zykj.student.dialogue.ui.collect.CollectHistoryFragment.onViewCreated.5
            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(View drawerView) {
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                super.onDrawerClosed(drawerView);
                CollectHistoryFragment.this.m10107s().m10642m((C9526k0) CollectHistoryFragment.this.m10106r().getFilterConditions().getValue());
            }
        });
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C74846(null), 3, null);
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "KEY_REFRESH_COLLECT_STATE", new Function2() { // from class: n6.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CollectHistoryFragment.m10101w(this.f15335a, (String) obj, (Bundle) obj2);
            }
        });
    }

    /* renamed from: q */
    public final void m10105q() {
        m10106r().m10116p();
        m10108u().refresh();
    }

    /* renamed from: r */
    public final CollectHistoryViewModel m10106r() {
        return (CollectHistoryViewModel) this.collectHistoryViewModel.getValue();
    }

    /* renamed from: s */
    public final HomeFilterViewModel m10107s() {
        return (HomeFilterViewModel) this.filterViewModel.getValue();
    }

    /* renamed from: u */
    public final CollectListAdapter m10108u() {
        return (CollectListAdapter) this.rvAdapter.getValue();
    }
}
