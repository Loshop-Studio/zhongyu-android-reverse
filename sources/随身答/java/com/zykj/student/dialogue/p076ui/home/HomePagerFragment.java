package com.zykj.student.dialogue.p076ui.home;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
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
import com.blankj.utilcode.util.LogUtils;
import com.taobao.sophix.PatchStatus;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.databinding.FragmentMainPagerBinding;
import com.zykj.student.dialogue.p076ui.detail.AnswerDetailFragmentArgs;
import com.zykj.student.dialogue.p076ui.home.AbstractC7594b;
import com.zykj.student.dialogue.p076ui.home.AbstractC7636p;
import com.zykj.student.dialogue.p076ui.home.AbstractC7638r;
import com.zykj.student.dialogue.p076ui.home.HomePagerFragment;
import com.zykj.student.dialogue.p076ui.home.dialog.SessionMoveDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p128h6.AbstractC8103b;
import p138i6.AbstractC8136b;
import p244s6.C9526k0;
import p244s6.C9560s2;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*¨\u0006."}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "q", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "y", "u", "Lcom/zykj/student/dialogue/databinding/FragmentMainPagerBinding;", "f", "Lcom/zykj/student/dialogue/databinding/FragmentMainPagerBinding;", "binding", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "g", "Lkotlin/Lazy;", "s", "()Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;", "h", "r", "()Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;", "homePagerViewModel", "Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;", "i", "t", "()Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;", "rvAdapter", "j", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHomePagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,288:1\n172#2,9:289\n106#2,15:298\n*S KotlinDebug\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment\n*L\n53#1:289,9\n55#1:298,15\n*E\n"})
/* loaded from: classes5.dex */
public final class HomePagerFragment extends Hilt_HomePagerFragment {

    /* renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k */
    public static final int f11481k = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public FragmentMainPagerBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy homeViewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public final Lazy homePagerViewModel;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy rvAdapter;

    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final HomePagerFragment m10750a(long j9) {
            Bundle bundle = new Bundle();
            bundle.putLong("catalogId", j9);
            HomePagerFragment homePagerFragment = new HomePagerFragment();
            homePagerFragment.setArguments(bundle);
            return homePagerFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$1 */
    public static final class C75751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11497a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/k0;", "it", "", "<anonymous>", "(Ls6/k0;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$1$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C9526k0, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11499a;

            /* renamed from: b */
            public /* synthetic */ Object f11500b;

            /* renamed from: c */
            public final /* synthetic */ HomePagerFragment f11501c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomePagerFragment homePagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11501c = homePagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C9526k0 c9526k0, Continuation continuation) {
                return ((AnonymousClass1) create(c9526k0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11501c, continuation);
                anonymousClass1.f11500b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C9526k0 c9526k0 = (C9526k0) this.f11500b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11499a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f11501c.m10746r().m10785x(c9526k0);
                return Unit.INSTANCE;
            }
        }

        public C75751(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePagerFragment.this.new C75751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11497a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                HomePagerViewModel homePagerViewModelM10746r = HomePagerFragment.this.m10746r();
                Bundle arguments = HomePagerFragment.this.getArguments();
                homePagerViewModelM10746r.m10779B(arguments != null ? Boxing.boxLong(arguments.getLong("catalogId")) : null);
                StateFlow stateFlowM10851A = HomePagerFragment.this.m10739s().getFilterConditions();
                Lifecycle lifecycle = HomePagerFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(stateFlowM10851A, lifecycle, Lifecycle.State.RESUMED);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomePagerFragment.this, null);
                this.f11497a = 1;
                if (FlowKt.collectLatest(flowFlowWithLifecycle, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {90}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$2 */
    public static final class C75762 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11502a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/s2;", "it", "", "<anonymous>", "(Ls6/s2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$2$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9560s2, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11504a;

            /* renamed from: b */
            public /* synthetic */ Object f11505b;

            /* renamed from: c */
            public final /* synthetic */ HomePagerFragment f11506c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomePagerFragment homePagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11506c = homePagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C9560s2 c9560s2, Continuation continuation) {
                return ((AnonymousClass2) create(c9560s2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11506c, continuation);
                anonymousClass2.f11505b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C9560s2 c9560s2 = (C9560s2) this.f11505b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11504a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Bundle arguments = this.f11506c.getArguments();
                if (Intrinsics.areEqual(c9560s2.m15753f(), arguments != null ? Boxing.boxLong(arguments.getLong("catalogId")) : null) && this.f11506c.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                    this.f11506c.m10738q();
                }
                return Unit.INSTANCE;
            }
        }

        public C75762(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final Long m10753c(C9560s2 c9560s2) {
            return c9560s2.m15753f();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePagerFragment.this.new C75762(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11502a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(HomePagerFragment.this.m10739s().getHomeUiState(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomePagerFragment.C75762.m10753c((C9560s2) obj2);
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomePagerFragment.this, null);
                this.f11502a = 1;
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
            return ((C75762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$3", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {102}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$3 */
    public static final class C75773 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11507a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/b;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$3$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7594b, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11509a;

            /* renamed from: b */
            public /* synthetic */ Object f11510b;

            /* renamed from: c */
            public final /* synthetic */ HomePagerFragment f11511c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomePagerFragment homePagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11511c = homePagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7594b abstractC7594b, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7594b, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11511c, continuation);
                anonymousClass1.f11510b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7594b abstractC7594b = (AbstractC7594b) this.f11510b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11509a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (abstractC7594b instanceof AbstractC7594b.c) {
                    Bundle arguments = this.f11511c.getArguments();
                    Long lBoxLong = arguments != null ? Boxing.boxLong(arguments.getLong("catalogId")) : null;
                    long jM10906a = ((AbstractC7594b.c) abstractC7594b).m10906a();
                    if (lBoxLong != null && jM10906a == lBoxLong.longValue()) {
                        this.f11511c.m10738q();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C75773(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePagerFragment.this.new C75773(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11507a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10854D = HomePagerFragment.this.m10739s().getHomeEvent();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomePagerFragment.this, null);
                this.f11507a = 1;
                if (FlowKt.collectLatest(sharedFlowM10854D, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75773) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$4", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {117}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$4 */
    public static final class C75784 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11512a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Landroidx/paging/CombinedLoadStates;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$4$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onCreate$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CombinedLoadStates, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11514a;

            /* renamed from: b */
            public /* synthetic */ Object f11515b;

            /* renamed from: c */
            public final /* synthetic */ HomePagerFragment f11516c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomePagerFragment homePagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11516c = homePagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CombinedLoadStates combinedLoadStates, Continuation continuation) {
                return ((AnonymousClass2) create(combinedLoadStates, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11516c, continuation);
                anonymousClass2.f11515b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this.f11515b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11514a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentMainPagerBinding fragmentMainPagerBinding = this.f11516c.binding;
                FragmentMainPagerBinding fragmentMainPagerBinding2 = null;
                if (fragmentMainPagerBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMainPagerBinding = null;
                }
                fragmentMainPagerBinding.f10537d.setRefreshing(combinedLoadStates.getRefresh() instanceof LoadState.Loading);
                if (combinedLoadStates.getRefresh() instanceof LoadState.NotLoading) {
                    FragmentMainPagerBinding fragmentMainPagerBinding3 = this.f11516c.binding;
                    if (fragmentMainPagerBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentMainPagerBinding2 = fragmentMainPagerBinding3;
                    }
                    fragmentMainPagerBinding2.f10536c.scrollToPosition(0);
                }
                return Unit.INSTANCE;
            }
        }

        public C75784(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final LoadState m10757c(CombinedLoadStates combinedLoadStates) {
            return combinedLoadStates.getRefresh();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePagerFragment.this.new C75784(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11512a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CombinedLoadStates> loadStateFlow = HomePagerFragment.this.m10747t().getLoadStateFlow();
                Lifecycle lifecycle = HomePagerFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowExtKt.flowWithLifecycle(loadStateFlow, lifecycle, Lifecycle.State.RESUMED), new Function1() { // from class: com.zykj.student.dialogue.ui.home.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomePagerFragment.C75784.m10757c((CombinedLoadStates) obj2);
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomePagerFragment.this, null);
                this.f11512a = 1;
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
            return ((C75784) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {144}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1 */
    public static final class C75791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11517a;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11519a;

            /* renamed from: b */
            public /* synthetic */ Object f11520b;

            /* renamed from: c */
            public final /* synthetic */ HomePagerFragment f11521c;

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {149}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C100631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11522a;

                /* renamed from: b */
                public final /* synthetic */ HomePagerFragment f11523b;

                @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "loadStates", "Landroidx/paging/CombinedLoadStates;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$1$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                @SourceDebugExtension({"SMAP\nHomePagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,288:1\n257#2,2:289\n*S KotlinDebug\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$1$2\n*L\n151#1:289,2\n*E\n"})
                /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CombinedLoadStates, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f11524a;

                    /* renamed from: b */
                    public /* synthetic */ Object f11525b;

                    /* renamed from: c */
                    public final /* synthetic */ HomePagerFragment f11526c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(HomePagerFragment homePagerFragment, Continuation continuation) {
                        super(2, continuation);
                        this.f11526c = homePagerFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CombinedLoadStates combinedLoadStates, Continuation continuation) {
                        return ((AnonymousClass2) create(combinedLoadStates, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11526c, continuation);
                        anonymousClass2.f11525b = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this.f11525b;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f11524a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (combinedLoadStates.getRefresh() instanceof LoadState.NotLoading) {
                            FragmentMainPagerBinding fragmentMainPagerBinding = this.f11526c.binding;
                            if (fragmentMainPagerBinding == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentMainPagerBinding = null;
                            }
                            LinearLayout llEmpty = fragmentMainPagerBinding.f10535b;
                            Intrinsics.checkNotNullExpressionValue(llEmpty, "llEmpty");
                            llEmpty.setVisibility(this.f11526c.m10747t().getItemCount() == 0 ? 0 : 8);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100631(HomePagerFragment homePagerFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11523b = homePagerFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: c */
                public static final LoadState m10760c(CombinedLoadStates combinedLoadStates) {
                    return combinedLoadStates.getRefresh();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C100631(this.f11523b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = this.f11522a;
                    if (i9 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11523b.m10747t().getLoadStateFlow(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomePagerFragment.C75791.AnonymousClass1.C100631.m10760c((CombinedLoadStates) obj2);
                            }
                        });
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11523b, null);
                        this.f11522a = 1;
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
                    return ((C100631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {157}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11527a;

                /* renamed from: b */
                public final /* synthetic */ HomePagerFragment f11528b;

                @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$2$1", m13451f = "HomePagerFragment.kt", m13452i = {0}, m13453l = {158}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
                /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$2$1, reason: invalid class name and collision with other inner class name */
                public static final class C100641 extends SuspendLambda implements Function2<PagingData<QuestionResp>, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f11529a;

                    /* renamed from: b */
                    public /* synthetic */ Object f11530b;

                    /* renamed from: c */
                    public final /* synthetic */ HomePagerFragment f11531c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C100641(HomePagerFragment homePagerFragment, Continuation continuation) {
                        super(2, continuation);
                        this.f11531c = homePagerFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C100641 c100641 = new C100641(this.f11531c, continuation);
                        c100641.f11530b = obj;
                        return c100641;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(PagingData pagingData, Continuation continuation) {
                        return ((C100641) create(pagingData, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        PagingData pagingData = (PagingData) this.f11530b;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i9 = this.f11529a;
                        if (i9 == 0) {
                            ResultKt.throwOnFailure(obj);
                            SessionListAdapter sessionListAdapterM10747t = this.f11531c.m10747t();
                            this.f11530b = SpillingKt.nullOutSpilledVariable(pagingData);
                            this.f11529a = 1;
                            if (sessionListAdapterM10747t.submitData(pagingData, this) == coroutine_suspended) {
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
                    public /* bridge */ /* synthetic */ Object invoke(PagingData<QuestionResp> pagingData, Continuation<? super Unit> continuation) {
                        return invoke2((PagingData) pagingData, (Continuation) continuation);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(HomePagerFragment homePagerFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11528b = homePagerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.f11528b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = this.f11527a;
                    if (i9 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowM10783v = this.f11528b.m10746r().getDataFlow();
                        C100641 c100641 = new C100641(this.f11528b, null);
                        this.f11527a = 1;
                        if (FlowKt.collectLatest(flowM10783v, c100641, this) == coroutine_suspended) {
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

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$3", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {163}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11532a;

                /* renamed from: b */
                public final /* synthetic */ HomePagerFragment f11533b;

                @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/r;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/r;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
                @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$3$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$3$1, reason: invalid class name and collision with other inner class name */
                public static final class C100651 extends SuspendLambda implements Function2<AbstractC7638r, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f11534a;

                    /* renamed from: b */
                    public /* synthetic */ Object f11535b;

                    /* renamed from: c */
                    public final /* synthetic */ HomePagerFragment f11536c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C100651(HomePagerFragment homePagerFragment, Continuation continuation) {
                        super(2, continuation);
                        this.f11536c = homePagerFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AbstractC7638r abstractC7638r, Continuation continuation) {
                        return ((C100651) create(abstractC7638r, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C100651 c100651 = new C100651(this.f11536c, continuation);
                        c100651.f11535b = obj;
                        return c100651;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        AbstractC7638r abstractC7638r = (AbstractC7638r) this.f11535b;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f11534a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (!Intrinsics.areEqual(abstractC7638r, AbstractC7638r.a.f11884a) && !Intrinsics.areEqual(abstractC7638r, AbstractC7638r.b.f11885a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f11536c.m10739s().m10877z();
                        this.f11536c.m10739s().m10875x();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(HomePagerFragment homePagerFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11533b = homePagerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass3(this.f11533b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = this.f11532a;
                    if (i9 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow sharedFlowM10784w = this.f11533b.m10746r().getPagerEvent();
                        C100651 c100651 = new C100651(this.f11533b, null);
                        this.f11532a = 1;
                        if (FlowKt.collectLatest(sharedFlowM10784w, c100651, this) == coroutine_suspended) {
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
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$4", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {174}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11537a;

                /* renamed from: b */
                public final /* synthetic */ HomePagerFragment f11538b;

                @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/b;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
                @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$4$1", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                @SourceDebugExtension({"SMAP\nHomePagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n827#2:289\n855#2,2:290\n*S KotlinDebug\n*F\n+ 1 HomePagerFragment.kt\ncom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1\n*L\n188#1:289\n188#1:290,2\n*E\n"})
                /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$4$1, reason: invalid class name and collision with other inner class name */
                public static final class C100661 extends SuspendLambda implements Function2<AbstractC7594b, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f11539a;

                    /* renamed from: b */
                    public /* synthetic */ Object f11540b;

                    /* renamed from: c */
                    public final /* synthetic */ HomePagerFragment f11541c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C100661(HomePagerFragment homePagerFragment, Continuation continuation) {
                        super(2, continuation);
                        this.f11541c = homePagerFragment;
                    }

                    /* renamed from: g */
                    public static final Unit m10764g(HomePagerFragment homePagerFragment, AbstractC7594b abstractC7594b, long j9) {
                        homePagerFragment.m10746r().m10786y(((AbstractC7594b.b) abstractC7594b).m10905a(), j9);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AbstractC7594b abstractC7594b, Continuation continuation) {
                        return ((C100661) create(abstractC7594b, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C100661 c100661 = new C100661(this.f11541c, continuation);
                        c100661.f11540b = obj;
                        return c100661;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        final AbstractC7594b abstractC7594b = (AbstractC7594b) this.f11540b;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f11539a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (abstractC7594b instanceof AbstractC7594b.b) {
                            if (((AbstractC7594b.b) abstractC7594b).m10905a().isEmpty()) {
                                this.f11541c.m10739s().m9922g(new AbstractC8103b.a.c("未选中任何问题，不能移动"));
                                return Unit.INSTANCE;
                            }
                            String simpleName = SessionMoveDialogFragment.class.getSimpleName();
                            Fragment fragmentFindFragmentByTag = this.f11541c.getChildFragmentManager().findFragmentByTag(simpleName);
                            if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
                                return Unit.INSTANCE;
                            }
                            List listM15751d = ((C9560s2) this.f11541c.m10739s().getHomeUiState().getValue()).m15751d();
                            HomePagerFragment homePagerFragment = this.f11541c;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listM15751d) {
                                long id = ((CatalogResp) obj2).getId();
                                Long lM15753f = ((C9560s2) homePagerFragment.m10739s().getHomeUiState().getValue()).m15753f();
                                if (lM15753f == null || id != lM15753f.longValue()) {
                                    arrayList.add(obj2);
                                }
                            }
                            final HomePagerFragment homePagerFragment2 = this.f11541c;
                            new SessionMoveDialogFragment(arrayList, new Function1() { // from class: com.zykj.student.dialogue.ui.home.m
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return HomePagerFragment.C75791.AnonymousClass1.AnonymousClass4.C100661.m10764g(homePagerFragment2, abstractC7594b, ((Long) obj3).longValue());
                                }
                            }).showNow(this.f11541c.getChildFragmentManager(), simpleName);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(HomePagerFragment homePagerFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11538b = homePagerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass4(this.f11538b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = this.f11537a;
                    if (i9 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow sharedFlowM10854D = this.f11538b.m10739s().getHomeEvent();
                        C100661 c100661 = new C100661(this.f11538b, null);
                        this.f11537a = 1;
                        if (FlowKt.collectLatest(sharedFlowM10854D, c100661, this) == coroutine_suspended) {
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
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$5", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {205}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11542a;

                /* renamed from: b */
                public final /* synthetic */ HomePagerFragment f11543b;

                @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/s2;", "it", "", "<anonymous>", "(Ls6/s2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
                @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$5$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$5$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9560s2, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f11544a;

                    /* renamed from: b */
                    public final /* synthetic */ HomePagerFragment f11545b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(HomePagerFragment homePagerFragment, Continuation continuation) {
                        super(2, continuation);
                        this.f11545b = homePagerFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C9560s2 c9560s2, Continuation continuation) {
                        return ((AnonymousClass2) create(c9560s2, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.f11545b, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f11544a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.f11545b.m10747t().m10897g();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(HomePagerFragment homePagerFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11543b = homePagerFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: c */
                public static final boolean m10767c(C9560s2 c9560s2) {
                    return c9560s2.m15754g();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass5(this.f11543b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = this.f11542a;
                    if (i9 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11543b.m10739s().getHomeUiState(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(HomePagerFragment.C75791.AnonymousClass1.AnonymousClass5.m10767c((C9560s2) obj2));
                            }
                        });
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11543b, null);
                        this.f11542a = 1;
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
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$6", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {212}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11546a;

                /* renamed from: b */
                public final /* synthetic */ HomePagerFragment f11547b;

                @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/k0;", "it", "", "<anonymous>", "(Ls6/k0;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
                @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$6$2", m13451f = "HomePagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerFragment$onViewCreated$1$1$6$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9526k0, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f11548a;

                    /* renamed from: b */
                    public final /* synthetic */ HomePagerFragment f11549b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(HomePagerFragment homePagerFragment, Continuation continuation) {
                        super(2, continuation);
                        this.f11549b = homePagerFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C9526k0 c9526k0, Continuation continuation) {
                        return ((AnonymousClass2) create(c9526k0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.f11549b, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f11548a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.f11549b.m10747t().m10898h();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(HomePagerFragment homePagerFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11547b = homePagerFragment;
                }

                /* renamed from: c */
                public static final FilterType.Sort m10770c(C9526k0 c9526k0) {
                    return c9526k0.m15721g();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass6(this.f11547b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i9 = this.f11546a;
                    if (i9 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11547b.m10739s().getFilterConditions(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HomePagerFragment.C75791.AnonymousClass1.AnonymousClass6.m10770c((C9526k0) obj2);
                            }
                        });
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11547b, null);
                        this.f11546a = 1;
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
                    return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomePagerFragment homePagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11521c = homePagerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11521c, continuation);
                anonymousClass1.f11520b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f11520b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11519a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C100631(this.f11521c, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.f11521c, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.f11521c, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.f11521c, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.f11521c, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(this.f11521c, null), 3, null);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C75791(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePagerFragment.this.new C75791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11517a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = HomePagerFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomePagerFragment.this, null);
                this.f11517a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HomePagerFragment() {
        final Function0 function0 = null;
        this.homeViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.homePagerViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomePagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$special$$inlined$viewModels$default$5
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
        this.rvAdapter = LazyKt.lazy(new Function0() { // from class: s6.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomePagerFragment.m10740v(this.f16679a);
            }
        });
    }

    /* renamed from: C */
    public static final void m10727C(HomePagerFragment homePagerFragment) {
        homePagerFragment.m10738q();
        homePagerFragment.m10739s().m10877z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m10738q() {
        m10746r().m10781t();
        m10747t().refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final HomeViewModel m10739s() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* renamed from: v */
    public static final SessionListAdapter m10740v(final HomePagerFragment homePagerFragment) {
        return new SessionListAdapter(homePagerFragment.m10739s(), new Function1() { // from class: s6.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomePagerFragment.m10741w(this.f16703a, (QuestionResp) obj);
            }
        }, new Function1() { // from class: s6.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomePagerFragment.m10742x(this.f16716a, ((Long) obj).longValue());
            }
        });
    }

    /* renamed from: w */
    public static final Unit m10741w(HomePagerFragment homePagerFragment, QuestionResp it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPrimaryUnRead() > 0) {
            homePagerFragment.m10746r().m10778A(new AbstractC7636p.b(it));
            homePagerFragment.m10739s().m10867R(homePagerFragment.m10746r().getCatalogId());
        }
        FragmentKt.findNavController(homePagerFragment).navigate(R.id.dialogue_detail_main, new AnswerDetailFragmentArgs(String.valueOf(it.getId()), false, it.isCollect()).m10217d());
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m10742x(HomePagerFragment homePagerFragment, long j9) {
        homePagerFragment.m10739s().m10860K(new AbstractC7594b.b(CollectionsKt.listOf(Long.valueOf(j9))));
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m10743z(HomePagerFragment homePagerFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        LogUtils.m2954d("页面HomePagerFragment -> setupFragmentResultListeners(),FragmentResult", "HomePager收到信号: " + bundle.getBoolean("mustRefresh") + ",state是" + bundle.getString("state"));
        String string = bundle.getString("sessionId");
        boolean z9 = bundle.getBoolean("mustRefresh", false);
        int i9 = bundle.getInt("state", 1);
        if (z9) {
            HomePagerViewModel homePagerViewModelM10746r = homePagerFragment.m10746r();
            if (string == null) {
                string = "";
            }
            homePagerViewModelM10746r.m10778A(new AbstractC7636p.c(string, i9));
        }
    }

    /* renamed from: A */
    public final void m10744A() {
        FragmentMainPagerBinding fragmentMainPagerBinding = this.binding;
        if (fragmentMainPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainPagerBinding = null;
        }
        RecyclerView recyclerView = fragmentMainPagerBinding.f10536c;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.zykj.student.dialogue.ui.home.HomePagerFragment$setupRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                if (parent.getChildViewHolder(view).getBindingAdapterPosition() < 3) {
                    outRect.top = AbstractC8136b.m13034b(9);
                }
                outRect.bottom = AbstractC8136b.m13034b(5);
                outRect.left = AbstractC8136b.m13034b(3);
                outRect.right = AbstractC8136b.m13034b(3);
            }
        });
        recyclerView.setAdapter(m10747t());
    }

    /* renamed from: B */
    public final void m10745B() {
        FragmentMainPagerBinding fragmentMainPagerBinding = this.binding;
        if (fragmentMainPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainPagerBinding = null;
        }
        fragmentMainPagerBinding.f10537d.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: s6.r1
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                HomePagerFragment.m10727C(this.f16694a);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C75751(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C75762(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C75773(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C75784(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentMainPagerBinding fragmentMainPagerBindingM9966c = FragmentMainPagerBinding.m9966c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fragmentMainPagerBindingM9966c, "inflate(...)");
        this.binding = fragmentMainPagerBindingM9966c;
        if (fragmentMainPagerBindingM9966c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainPagerBindingM9966c = null;
        }
        SwipeRefreshLayout swipeRefreshLayoutM9967b = fragmentMainPagerBindingM9966c.getRoot();
        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayoutM9967b, "getRoot(...)");
        return swipeRefreshLayoutM9967b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m10744A();
        m10745B();
        m10749y();
        m10748u();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C75791(null), 3, null);
    }

    /* renamed from: r */
    public final HomePagerViewModel m10746r() {
        return (HomePagerViewModel) this.homePagerViewModel.getValue();
    }

    /* renamed from: t */
    public final SessionListAdapter m10747t() {
        return (SessionListAdapter) this.rvAdapter.getValue();
    }

    /* renamed from: u */
    public final void m10748u() {
        m10746r().m10785x((C9526k0) m10739s().getFilterConditions().getValue());
    }

    /* renamed from: y */
    public final void m10749y() {
        requireActivity().getSupportFragmentManager().setFragmentResultListener("KEY_REFRESH_UNDERSTOOD_STATE", getViewLifecycleOwner(), new FragmentResultListener() { // from class: s6.q1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                HomePagerFragment.m10743z(this.f16689a, str, bundle);
            }
        });
    }
}
