package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001`\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u0013*\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0019\u001a\u00020\u0013*\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u001c\u001a\u00020\u0012*\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001d*\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0011\u0010 \u001a\u00020\u0012*\u00020\u0012¢\u0006\u0004\b \u0010!J\u0014\u0010 \u001a\u00020\u0013*\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0018J#\u0010+\u001a\u00020(2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\nH\u0086@ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001b\u0010/\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u00101JC\u0010#\u001a\u00020(2\b\b\u0002\u00103\u001a\u0002022'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020(06\u0012\u0006\u0012\u0004\u0018\u00010\u000104¢\u0006\u0002\b7H\u0086@¢\u0006\u0004\b#\u00109J?\u0010:\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\n¢\u0006\u0004\b<\u00101J\u0016\u0010\u001c\u001a\u00020\u0012*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b=\u0010\u001bJ\u0016\u0010?\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b>\u0010\u0018J\u001e\u0010:\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010@\u001a\u00020\u0012H\u0002ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ&\u0010I\u001a\u00020\u0013*\u00020C2\u0006\u0010D\u001a\u00020\u00132\u0006\u0010F\u001a\u00020EH\u0002ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010K\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0002ø\u0001\u0001¢\u0006\u0004\bJ\u0010\u0018J\u0017\u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u0012H\u0002¢\u0006\u0004\bM\u0010NR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010VR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010XR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR$\u0010[\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b[\u00101R\u001c\u0010\\\u001a\u00020E8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u00101\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lr6/a;)V", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "(J)J", "singleAxisOffset", "toFloat-k-4lQ0M", "(J)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "reverseIfNeeded", "(F)F", "reverseIfNeeded-MK-Hz9U", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "initialVelocity", "isMouseWheel", "Ld6/s;", "onScrollStopped-BMRW4eQ", "(JZLh6/c;)Ljava/lang/Object;", "onScrollStopped", "available", "doFlingAnimation-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "doFlingAnimation", "shouldScrollImmediately", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lh6/c;", "Lkotlin/ExtensionFunctionType;", "block", "(Landroidx/compose/foundation/MutatePriority;Lr6/e;Lh6/c;)Ljava/lang/Object;", "update", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "isVertical", "toFloat-TH1AsA0", "singleAxisVelocity-AH228Gc", "singleAxisVelocity", "newValue", "update-QWom1Mo", "(JF)J", "Landroidx/compose/foundation/gestures/ScrollScope;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "performScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "performScroll", "dispatchRawDelta-MK-Hz9U", "dispatchRawDelta", "pixels", "shouldCancelFling", "(F)Z", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/Orientation;", "Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Lr6/a;", "<set-?>", "isFlinging", "latestScrollSource", "I", "outerStateScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "androidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1", "nestedScrollScope", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "Lkotlin/Function1;", "performScrollForOverscroll", "Lr6/c;", "getShouldDispatchOverscroll", "shouldDispatchOverscroll", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1037:1\n30#2:1038\n30#2:1042\n53#3,3:1039\n53#3,3:1043\n60#3:1047\n70#3:1050\n65#4:1046\n69#4:1049\n22#5:1048\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n*L\n646#1:1038\n647#1:1042\n646#1:1039,3\n647#1:1043,3\n653#1:1047\n653#1:1050\n653#1:1046\n653#1:1049\n653#1:1048\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollingLogic {
    public static final int $stable = 8;

    @NotNull
    private FlingBehavior flingBehavior;
    private boolean isFlinging;

    @NotNull
    private final InterfaceC6469a isScrollableNodeAttached;

    @NotNull
    private NestedScrollDispatcher nestedScrollDispatcher;

    @NotNull
    private Orientation orientation;

    @Nullable
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;

    @NotNull
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI();

    @NotNull
    private ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;

    @NotNull
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo7005scrollByOzD1aCk(long offset, int source) {
            return this.this$0.m7042performScroll3eAAhYA(this.this$0.outerStateScope, offset, source);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo7006scrollByWithOverscrollOzD1aCk(long offset, int source) {
            this.this$0.latestScrollSource = source;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect != null && this.this$0.getShouldDispatchOverscroll()) {
                return overscrollEffect.mo6733applyToScrollRhakbz0(offset, this.this$0.latestScrollSource, this.this$0.performScrollForOverscroll);
            }
            return this.this$0.m7042performScroll3eAAhYA(this.this$0.outerStateScope, offset, source);
        }
    };

    @NotNull
    private final InterfaceC6471c performScrollForOverscroll = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m10430boximpl(m7055invokeMKHz9U(((Offset) obj).m10451unboximpl()));
        }

        /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
        public final long m7055invokeMKHz9U(long j7) {
            ScrollScope scrollScope = this.this$0.outerStateScope;
            ScrollingLogic scrollingLogic = this.this$0;
            return scrollingLogic.m7042performScroll3eAAhYA(scrollScope, j7, scrollingLogic.latestScrollSource);
        }
    };

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", m5303f = "Scrollable.kt", m5304i = {}, m5305l = {834}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2 */
    public static final class C09012 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09012(InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C09012> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09012 c09012 = ScrollingLogic.this.new C09012(this.$block, interfaceC5631c);
            c09012.L$0 = obj;
            return c09012;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(ScrollScope scrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09012) create(scrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                ScrollingLogic.this.outerStateScope = (ScrollScope) this.L$0;
                InterfaceC6473e interfaceC6473e = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (interfaceC6473e.invoke(scrollingLogic$nestedScrollScope$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(@NotNull ScrollableState scrollableState, @Nullable OverscrollEffect overscrollEffect, @NotNull FlingBehavior flingBehavior, @NotNull Orientation orientation, boolean z8, @NotNull NestedScrollDispatcher nestedScrollDispatcher, @NotNull InterfaceC6469a interfaceC6469a) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z8;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = interfaceC6469a;
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m7041dispatchRawDeltaMKHz9U(long scroll) {
        return m7052toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m7051toFloatk4lQ0M(scroll)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m7042performScroll3eAAhYA(ScrollScope scrollScope, long j7, int i) {
        long jM11784dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m11784dispatchPreScrollOzD1aCk(j7, i);
        long jM10445minusMKHz9U = Offset.m10445minusMKHz9U(j7, jM11784dispatchPreScrollOzD1aCk);
        long jM7049reverseIfNeededMKHz9U = m7049reverseIfNeededMKHz9U(m7052toOffsettuRUvjQ(scrollScope.scrollBy(m7051toFloatk4lQ0M(m7049reverseIfNeededMKHz9U(m7050singleAxisOffsetMKHz9U(jM10445minusMKHz9U))))));
        return Offset.m10446plusMKHz9U(Offset.m10446plusMKHz9U(jM11784dispatchPreScrollOzD1aCk, jM7049reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m11782dispatchPostScrollDzOQY0M(jM7049reverseIfNeededMKHz9U, Offset.m10445minusMKHz9U(jM10445minusMKHz9U, jM7049reverseIfNeededMKHz9U), i));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, interfaceC6473e, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelFling(float pixels) {
        if (pixels <= 0.0f || this.scrollableState.getCanScrollForward()) {
            return (pixels < 0.0f && !this.scrollableState.getCanScrollBackward()) || !((Boolean) this.isScrollableNodeAttached.invoke()).booleanValue();
        }
        return true;
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m7043singleAxisVelocityAH228Gc(long j7) {
        return this.orientation == Orientation.Horizontal ? Velocity.m13539copyOhffZ5M$default(j7, 0.0f, 0.0f, 1, null) : Velocity.m13539copyOhffZ5M$default(j7, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m7044toFloatTH1AsA0(long j7) {
        return this.orientation == Orientation.Horizontal ? Velocity.m13543getXimpl(j7) : Velocity.m13544getYimpl(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m7045updateQWom1Mo(long j7, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m13539copyOhffZ5M$default(j7, f, 0.0f, 2, null) : Velocity.m13539copyOhffZ5M$default(j7, 0.0f, f, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7046doFlingAnimationQWom1Mo(long r11, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r11 = r0.L$1
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            java.lang.Object r12 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r12 = (androidx.compose.foundation.gestures.ScrollingLogic) r12
            kotlin.AbstractC5774b.m5119b(r13)
            r5 = r10
            goto L5d
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            kotlin.AbstractC5774b.m5119b(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.element = r11
            r10.isFlinging = r3
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r11 = r10.scroll(r13, r4, r0)
            if (r11 != r1) goto L5b
            return r1
        L5b:
            r12 = r5
            r11 = r6
        L5d:
            r13 = 0
            r12.isFlinging = r13
            long r11 = r11.element
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m7046doFlingAnimationQWom1Mo(long, h6.c):java.lang.Object");
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* renamed from: isFlinging, reason: from getter */
    public final boolean getIsFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    @Nullable
    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m7047onScrollStoppedBMRW4eQ(long j7, boolean z8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        C5443s c5443s = C5443s.f8405a;
        if (z8 && !ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior)) {
            return c5443s;
        }
        long jM7043singleAxisVelocityAH228Gc = m7043singleAxisVelocityAH228Gc(j7);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m13534boximpl(jM7043singleAxisVelocityAH228Gc), interfaceC5631c);
            return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : c5443s;
        }
        Object objMo6732applyToFlingBMRW4eQ = overscrollEffect.mo6732applyToFlingBMRW4eQ(jM7043singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, interfaceC5631c);
        return objMo6732applyToFlingBMRW4eQ == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo6732applyToFlingBMRW4eQ : c5443s;
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m7048performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m10457getZeroF1C5BW0() : m7041dispatchRawDeltaMKHz9U(scroll);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m7049reverseIfNeededMKHz9U(long j7) {
        return this.reverseDirection ? Offset.m10448timestuRUvjQ(j7, -1.0f) : j7;
    }

    @Nullable
    public final Object scroll(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new C09012(interfaceC6473e, null), interfaceC5631c);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : C5443s.f8405a;
    }

    public final void setScrollableState(@NotNull ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m7050singleAxisOffsetMKHz9U(long j7) {
        return this.orientation == Orientation.Horizontal ? Offset.m10435copydBAh8RU$default(j7, 0.0f, 0.0f, 1, null) : Offset.m10435copydBAh8RU$default(j7, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m7051toFloatk4lQ0M(long j7) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j7 >> 32 : j7 & 4294967295L));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m7052toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m7053toVelocityadjELrA(float f) {
        return f == 0.0f ? Velocity.INSTANCE.m13554getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, 0.0f) : VelocityKt.Velocity(0.0f, f);
    }

    public final boolean update(@NotNull ScrollableState scrollableState, @NotNull Orientation orientation, @Nullable OverscrollEffect overscrollEffect, boolean reverseDirection, @NotNull FlingBehavior flingBehavior, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z8;
        boolean z9 = true;
        if (AbstractC5830k.m5325b(this.scrollableState, scrollableState)) {
            z8 = false;
        } else {
            this.scrollableState = scrollableState;
            z8 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z8 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z9 = z8;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z9;
    }
}
