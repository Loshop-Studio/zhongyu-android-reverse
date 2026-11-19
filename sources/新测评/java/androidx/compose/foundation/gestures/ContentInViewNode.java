package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001EB'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u001e\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0096@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\"2\u0006\u0010 \u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\"H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0012J\u001a\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\"\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J\b\u00109\u001a\u00020\fH\u0002J \u0010:\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001f\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010;\u001a\u00020<*\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010@J \u0010B\u001a\u00020\n*\u00020\"2\b\b\u0002\u00102\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, m13558d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "reverseDirection", "", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "childWasMaxVisibleBeforeViewportShrunk", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isAnimationRunning", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "trackingFocusedChild", "<set-?>", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "getViewportSize-YbymL2g$foundation_release", "()J", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onFocusBoundsChanged", "newBounds", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "requireBringIntoViewSpec", "update", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,471:1\n50#2,5:472\n50#2,5:489\n314#3,11:477\n1#4:488\n61#5:494\n57#5:497\n61#5:519\n57#5:526\n57#5:537\n61#5:540\n70#6:495\n60#6:498\n60#6:514\n70#6:517\n70#6:520\n53#6,3:523\n60#6:527\n53#6,3:530\n85#6:534\n90#6:536\n60#6:538\n70#6:541\n22#7:496\n22#7:499\n22#7:515\n22#7:518\n22#7:521\n22#7:528\n22#7:539\n22#7:542\n107#8,2:500\n109#8:511\n447#9,9:502\n150#10:512\n65#10:513\n69#10:516\n30#11:522\n30#11:529\n54#12:533\n59#12:535\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n119#1:472,5\n203#1:489,5\n135#1:477,11\n345#1:494\n351#1:497\n410#1:519\n420#1:526\n435#1:537\n436#1:540\n345#1:495\n351#1:498\n395#1:514\n396#1:517\n410#1:520\n403#1:523,3\n420#1:527\n414#1:530,3\n429#1:534\n430#1:536\n435#1:538\n436#1:541\n345#1:496\n351#1:499\n395#1:515\n396#1:518\n410#1:521\n420#1:528\n435#1:539\n436#1:542\n359#1:500,2\n359#1:511\n359#1:502,9\n385#1:512\n395#1:513\n396#1:516\n403#1:522\n414#1:529\n429#1:533\n430#1:535\n*E\n"})
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;
    private LayoutCoordinates focusedChild;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.INSTANCE.m23737getZeroYbymL2g();

    @StabilityInferred(parameters = 0)
    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m13558d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    public static final class Request {
        public static final int $stable = 8;
        private final CancellableContinuation<Unit> continuation;
        private final Function0<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(Function0<Rect> function0, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.currentBounds = function0;
            this.continuation = cancellableContinuation;
        }

        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r4.continuation
                kotlin.coroutines.CoroutineContext r0 = r0.get$context()
                kotlinx.coroutines.CoroutineName$Key r1 = kotlinx.coroutines.CoroutineName.INSTANCE
                kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
                kotlinx.coroutines.CoroutineName r0 = (kotlinx.coroutines.CoroutineName) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.getName()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.CharsKt.checkRadix(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L51
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L53
            L51:
                java.lang.String r0 = "("
            L53:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.Request.toString():java.lang.String");
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m13596f = "ContentInViewNode.kt", m13597i = {}, m13598l = {215}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 */
    public static final class C12212 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m13596f = "ContentInViewNode.kt", m13597i = {}, m13598l = {221}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, Job job, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$animationState = updatableAnimationState;
                this.this$0 = contentInViewNode;
                this.$bringIntoViewSpec = bringIntoViewSpec;
                this.$animationJob = job;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                    this.$animationState.setValue(this.this$0.calculateScrollDelta(this.$bringIntoViewSpec));
                    final UpdatableAnimationState updatableAnimationState = this.$animationState;
                    final ContentInViewNode contentInViewNode = this.this$0;
                    final Job job = this.$animationJob;
                    Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                            invoke(f10.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f10) {
                            float f11 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            float fM17470toFloatk4lQ0M = f11 * scrollingLogic.m17470toFloatk4lQ0M(scrollingLogic.m17468reverseIfNeededMKHz9U(nestedScrollScope.mo17424scrollByOzD1aCk(scrollingLogic.m17468reverseIfNeededMKHz9U(scrollingLogic.m17471toOffsettuRUvjQ(f11 * f10)), NestedScrollSource.INSTANCE.m22092getUserInputWNlRxjI())));
                            if (Math.abs(fM17470toFloatk4lQ0M) < Math.abs(f10)) {
                                JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fM17470toFloatk4lQ0M + " < " + f10 + ')', null, 2, null);
                            }
                        }
                    };
                    final ContentInViewNode contentInViewNode2 = this.this$0;
                    final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                    final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.bringIntoViewRequests;
                            ContentInViewNode contentInViewNode3 = contentInViewNode2;
                            while (true) {
                                if (bringIntoViewRequestPriorityQueue.requests.getSize() != 0) {
                                    Rect rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                    if (!(rectInvoke == null ? true : ContentInViewNode.m17363isMaxVisibleO0kMr_c$default(contentInViewNode3, rectInvoke, 0L, 1, null))) {
                                        break;
                                    } else {
                                        ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (contentInViewNode2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewNode2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewNode.m17363isMaxVisibleO0kMr_c$default(contentInViewNode2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewNode2.trackingFocusedChild = false;
                                }
                            }
                            updatableAnimationState2.setValue(contentInViewNode2.calculateScrollDelta(bringIntoViewSpec));
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(function1, function0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12212(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation<? super C12212> continuation) {
            super(2, continuation);
            this.$animationState = updatableAnimationState;
            this.$bringIntoViewSpec = bringIntoViewSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12212 c12212 = ContentInViewNode.this.new C12212(this.$animationState, this.$bringIntoViewSpec, continuation);
            c12212.L$0 = obj;
            return c12212;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                        ContentInViewNode.this.isAnimationRunning = true;
                        ScrollingLogic scrollingLogic = ContentInViewNode.this.scrollingLogic;
                        MutatePriority mutatePriority = MutatePriority.Default;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, ContentInViewNode.this, this.$bringIntoViewSpec, job, null);
                        this.label = 1;
                        if (scrollingLogic.scroll(mutatePriority, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ContentInViewNode.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewNode.this.isAnimationRunning = false;
                    ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewNode.this.trackingFocusedChild = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                ContentInViewNode.this.isAnimationRunning = false;
                ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                ContentInViewNode.this.trackingFocusedChild = false;
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z9, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z9;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m23730equalsimpl0(this.viewportSize, IntSize.INSTANCE.m23737getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM23744toSizeozmzZPI = IntSizeKt.m23744toSizeozmzZPI(this.viewportSize);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (jM23744toSizeozmzZPI & 4294967295L)));
        }
        if (i10 == 2) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (jM23744toSizeozmzZPI >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m17359compareToTemP2vQ(long j10, long j11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Intrinsics.compare((int) (j10 & 4294967295L), (int) (j11 & 4294967295L));
        }
        if (i10 == 2) {
            return Intrinsics.compare((int) (j10 >> 32), (int) (j11 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m17360compareToiLBOSCw(long j10, long j11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        if (i10 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m17361computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        return childBounds.m20772translatek4lQ0M(Offset.m20727constructorimpl(m17364relocationOffsetBMxPBkI(childBounds, containerSize) ^ (-9223372034707292160L)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rectInvoke = ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m17360compareToiLBOSCw(rectInvoke.m20768getSizeNHjbRc(), IntSizeKt.m23744toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rectInvoke : rect;
                    }
                    rect = rectInvoke;
                }
                size--;
            }
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (!getIsAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesRequireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m17362isMaxVisibleO0kMr_c(Rect rect, long j10) {
        long jM17364relocationOffsetBMxPBkI = m17364relocationOffsetBMxPBkI(rect, j10);
        return Math.abs(Float.intBitsToFloat((int) (jM17364relocationOffsetBMxPBkI >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM17364relocationOffsetBMxPBkI & 4294967295L))) <= 0.5f;
    }

    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m17363isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m17362isMaxVisibleO0kMr_c(rect, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C12212(new UpdatableAnimationState(BringIntoViewSpec.INSTANCE.getDefaultScrollAnimationSpec$foundation_release()), bringIntoViewSpecRequireBringIntoViewSpec, null), 1, null);
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m17364relocationOffsetBMxPBkI(Rect childBounds, long containerSize) {
        long jM23744toSizeozmzZPI = IntSizeKt.m23744toSizeozmzZPI(containerSize);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Offset.m20727constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat((int) (jM23744toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float fCalculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat((int) (jM23744toSizeozmzZPI & 4294967295L)));
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fCalculateScrollDistance) & 4294967295L));
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || m17363isMaxVisibleO0kMr_c$default(this, rectInvoke, 0L, 1, null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        if (IntSize.m23730equalsimpl0(this.viewportSize, IntSize.INSTANCE.m23737getZeroYbymL2g())) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m17361computeDestinationO0kMr_c(localRect, this.viewportSize);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates newBounds) {
        Rect focusedChildBounds;
        this.focusedChild = newBounds;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (focusedChildBounds = getFocusedChildBounds()) != null && !m17362isMaxVisibleO0kMr_c(focusedChildBounds, this.viewportSize)) {
            this.trackingFocusedChild = true;
            launchAnimation();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo17320onRemeasuredozmzZPI(long size) {
        Rect focusedChildBounds;
        long j10 = this.viewportSize;
        this.viewportSize = size;
        if (m17359compareToTemP2vQ(size, j10) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m17362isMaxVisibleO0kMr_c(focusedChildBounds, j10)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    public final void update(Orientation orientation, boolean reverseDirection, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
