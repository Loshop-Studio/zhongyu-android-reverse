package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6006u;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;
import p204y1.AbstractC6768a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001SB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\"\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\"\u0010(\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010-\u001a\u00020**\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020**\u00020.2\u0006\u0010)\u001a\u00020.H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010,J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00102J \u00104\u001a\u00020\u00142\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001103H\u0096@¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J'\u0010=\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b=\u0010>R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010AR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010BR\u001a\u0010C\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010AR\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010AR*\u0010N\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001c8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "", "reverseDirection", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "requireBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "Landroidx/compose/ui/geometry/Rect;", "getFocusedChildBounds", "()Landroidx/compose/ui/geometry/Rect;", "Ld6/s;", "launchAnimation", "()V", "", "calculateScrollDelta", "(Landroidx/compose/foundation/gestures/BringIntoViewSpec;)F", "findBringIntoViewRequest", "childBounds", "Landroidx/compose/ui/unit/IntSize;", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "computeDestination", "size", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "isMaxVisible", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "relocationOffset", "other", "", "compareTo-TemP2vQ", "(JJ)I", "compareTo", "Landroidx/compose/ui/geometry/Size;", "compareTo-iLBOSCw", "localRect", "calculateRectForParent", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lkotlin/Function0;", "bringChildIntoView", "(Lr6/a;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newBounds", "onFocusBoundsChanged", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "update", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Z", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "trackingFocusedChild", "childWasMaxVisibleBeforeViewportShrunk", "<set-?>", "viewportSize", "J", "getViewportSize-YbymL2g$foundation_release", "()J", "isAnimationRunning", "Request", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,471:1\n50#2,5:472\n50#2,5:489\n314#3,11:477\n1#4:488\n61#5:494\n57#5:497\n61#5:519\n57#5:526\n57#5:537\n61#5:540\n70#6:495\n60#6:498\n60#6:514\n70#6:517\n70#6:520\n53#6,3:523\n60#6:527\n53#6,3:530\n85#6:534\n90#6:536\n60#6:538\n70#6:541\n22#7:496\n22#7:499\n22#7:515\n22#7:518\n22#7:521\n22#7:528\n22#7:539\n22#7:542\n107#8,2:500\n109#8:511\n447#9,9:502\n150#10:512\n65#10:513\n69#10:516\n30#11:522\n30#11:529\n54#12:533\n59#12:535\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n119#1:472,5\n203#1:489,5\n135#1:477,11\n345#1:494\n351#1:497\n410#1:519\n420#1:526\n435#1:537\n436#1:540\n345#1:495\n351#1:498\n395#1:514\n396#1:517\n410#1:520\n403#1:523,3\n420#1:527\n414#1:530,3\n429#1:534\n430#1:536\n435#1:538\n436#1:541\n345#1:496\n351#1:499\n395#1:515\n396#1:518\n410#1:521\n420#1:528\n435#1:539\n436#1:542\n359#1:500,2\n359#1:511\n359#1:502,9\n385#1:512\n395#1:513\n396#1:516\n403#1:522\n414#1:529\n429#1:533\n430#1:535\n*E\n"})
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @Nullable
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;

    @Nullable
    private LayoutCoordinates focusedChild;
    private boolean isAnimationRunning;

    @NotNull
    private Orientation orientation;
    private boolean reverseDirection;

    @NotNull
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;

    @NotNull
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.INSTANCE.m13481getZeroYbymL2g();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lkotlinx/coroutines/f;", "Ld6/s;", "continuation", "<init>", "(Lr6/a;Lkotlinx/coroutines/f;)V", "", "toString", "()Ljava/lang/String;", "Lr6/a;", "getCurrentBounds", "()Lr6/a;", "Lkotlinx/coroutines/f;", "getContinuation", "()Lkotlinx/coroutines/f;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    public static final class Request {
        public static final int $stable = 8;

        @NotNull
        private final InterfaceC5895f continuation;

        @NotNull
        private final InterfaceC6469a currentBounds;

        public Request(@NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5895f interfaceC5895f) {
            this.currentBounds = interfaceC6469a;
            this.continuation = interfaceC5895f;
        }

        @NotNull
        public final InterfaceC5895f getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final InterfaceC6469a getCurrentBounds() {
            return this.currentBounds;
        }

        @NotNull
        public String toString() {
            if (this.continuation.getContext().get(AbstractC6006u.f9510a) != null) {
                throw new ClassCastException();
            }
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            AbstractC6768a.m6440d(16);
            String string = Integer.toString(iHashCode, 16);
            AbstractC5830k.m5329f(string, "toString(...)");
            sb.append(string);
            sb.append("(currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m5303f = "ContentInViewNode.kt", m5304i = {}, m5305l = {215}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 */
    public static final class C08352 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/NestedScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/NestedScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m5303f = "ContentInViewNode.kt", m5304i = {}, m5305l = {221}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6013w0 $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, InterfaceC6013w0 interfaceC6013w0, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$animationState = updatableAnimationState;
                this.this$0 = contentInViewNode;
                this.$bringIntoViewSpec = bringIntoViewSpec;
                this.$animationJob = interfaceC6013w0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(nestedScrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                    this.$animationState.setValue(this.this$0.calculateScrollDelta(this.$bringIntoViewSpec));
                    final UpdatableAnimationState updatableAnimationState = this.$animationState;
                    final ContentInViewNode contentInViewNode = this.this$0;
                    final InterfaceC6013w0 interfaceC6013w0 = this.$animationJob;
                    InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke(((Number) obj2).floatValue());
                            return C5443s.f8405a;
                        }

                        public final void invoke(float f) {
                            float f7 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            float fM7051toFloatk4lQ0M = scrollingLogic.m7051toFloatk4lQ0M(scrollingLogic.m7049reverseIfNeededMKHz9U(nestedScrollScope.mo7005scrollByOzD1aCk(scrollingLogic.m7049reverseIfNeededMKHz9U(scrollingLogic.m7052toOffsettuRUvjQ(f7 * f)), NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI()))) * f7;
                            if (Math.abs(fM7051toFloatk4lQ0M) < Math.abs(f)) {
                                InterfaceC6013w0 interfaceC6013w02 = interfaceC6013w0;
                                CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fM7051toFloatk4lQ0M + " < " + f + ')');
                                cancellationException.initCause(null);
                                interfaceC6013w02.cancel(cancellationException);
                            }
                        }
                    };
                    final ContentInViewNode contentInViewNode2 = this.this$0;
                    final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                    final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                    InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m6937invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m6937invoke() {
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.bringIntoViewRequests;
                            ContentInViewNode contentInViewNode3 = contentInViewNode2;
                            while (true) {
                                if (bringIntoViewRequestPriorityQueue.requests.getSize() != 0) {
                                    Rect rect = (Rect) ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                    if (!(rect == null ? true : ContentInViewNode.m6934isMaxVisibleO0kMr_c$default(contentInViewNode3, rect, 0L, 1, null))) {
                                        break;
                                    } else {
                                        ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (contentInViewNode2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewNode2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewNode.m6934isMaxVisibleO0kMr_c$default(contentInViewNode2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewNode2.trackingFocusedChild = false;
                                }
                            }
                            updatableAnimationState2.setValue(contentInViewNode2.calculateScrollDelta(bringIntoViewSpec));
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(interfaceC6471c, interfaceC6469a, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08352(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, InterfaceC5631c<? super C08352> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$animationState = updatableAnimationState;
            this.$bringIntoViewSpec = bringIntoViewSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08352 c08352 = ContentInViewNode.this.new C08352(this.$animationState, this.$bringIntoViewSpec, interfaceC5631c);
            c08352.L$0 = obj;
            return c08352;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            CancellationException cancellationException = null;
            try {
                try {
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6013w0 interfaceC6013w0M5643n = AbstractC6014x.m5643n(((InterfaceC6009v) this.L$0).getCoroutineContext());
                        ContentInViewNode.this.isAnimationRunning = true;
                        ScrollingLogic scrollingLogic = ContentInViewNode.this.scrollingLogic;
                        MutatePriority mutatePriority = MutatePriority.Default;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, ContentInViewNode.this, this.$bringIntoViewSpec, interfaceC6013w0M5643n, null);
                        this.label = 1;
                        if (scrollingLogic.scroll(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    ContentInViewNode.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewNode.this.isAnimationRunning = false;
                    ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewNode.this.trackingFocusedChild = false;
                    return C5443s.f8405a;
                } catch (CancellationException e) {
                    cancellationException = e;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                ContentInViewNode.this.isAnimationRunning = false;
                ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
                ContentInViewNode.this.trackingFocusedChild = false;
                throw th;
            }
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08352) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public ContentInViewNode(@NotNull Orientation orientation, @NotNull ScrollingLogic scrollingLogic, boolean z8, @Nullable BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z8;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m13474equalsimpl0(this.viewportSize, IntSize.INSTANCE.m13481getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (jM13488toSizeozmzZPI & 4294967295L)));
        }
        if (i == 2) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (jM13488toSizeozmzZPI >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m6930compareToTemP2vQ(long j7, long j8) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return AbstractC5830k.m5332i((int) (j7 & 4294967295L), (int) (j8 & 4294967295L));
        }
        if (i == 2) {
            return AbstractC5830k.m5332i((int) (j7 >> 32), (int) (j8 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m6931compareToiLBOSCw(long j7, long j8) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
        if (i == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j8 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m6932computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        return childBounds.m10478translatek4lQ0M(Offset.m10433constructorimpl(m6935relocationOffsetBMxPBkI(childBounds, containerSize) ^ (-9223372034707292160L)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rect2 = (Rect) ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    if (m6931compareToiLBOSCw(rect2.m10474getSizeNHjbRc(), IntSizeKt.m13488toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rect2 : rect;
                    }
                    rect = rect2;
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
    private final boolean m6933isMaxVisibleO0kMr_c(Rect rect, long j7) {
        long jM6935relocationOffsetBMxPBkI = m6935relocationOffsetBMxPBkI(rect, j7);
        return Math.abs(Float.intBitsToFloat((int) (jM6935relocationOffsetBMxPBkI >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM6935relocationOffsetBMxPBkI & 4294967295L))) <= 0.5f;
    }

    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m6934isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m6933isMaxVisibleO0kMr_c(rect, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC6014x.m5651v(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C08352(new UpdatableAnimationState(BringIntoViewSpec.INSTANCE.getDefaultScrollAnimationSpec$foundation_release()), bringIntoViewSpecRequireBringIntoViewSpec, null), 1);
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m6935relocationOffsetBMxPBkI(Rect childBounds, long containerSize) {
        long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(containerSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Offset.m10433constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat((int) (jM13488toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float fCalculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat((int) (jM13488toSizeozmzZPI & 4294967295L)));
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fCalculateScrollDistance) & 4294967295L));
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Rect rect = (Rect) interfaceC6469a.invoke();
        if (rect != null && !m6934isMaxVisibleO0kMr_c$default(this, rect, 0L, 1, null)) {
            C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
            c5961g.m5584u();
            if (this.bringIntoViewRequests.enqueue(new Request(interfaceC6469a, c5961g)) && !this.isAnimationRunning) {
                launchAnimation();
            }
            Object objM5583t = c5961g.m5583t();
            if (objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM5583t;
            }
        }
        return C5443s.f8405a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        if (IntSize.m13474equalsimpl0(this.viewportSize, IntSize.INSTANCE.m13481getZeroYbymL2g())) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m6932computeDestinationO0kMr_c(localRect, this.viewportSize);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(@Nullable LayoutCoordinates newBounds) {
        Rect focusedChildBounds;
        this.focusedChild = newBounds;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (focusedChildBounds = getFocusedChildBounds()) != null && !m6933isMaxVisibleO0kMr_c(focusedChildBounds, this.viewportSize)) {
            this.trackingFocusedChild = true;
            launchAnimation();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo6891onRemeasuredozmzZPI(long size) {
        Rect focusedChildBounds;
        long j7 = this.viewportSize;
        this.viewportSize = size;
        if (m6930compareToTemP2vQ(size, j7) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m6933isMaxVisibleO0kMr_c(focusedChildBounds, j7)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    public final void update(@NotNull Orientation orientation, boolean reverseDirection, @Nullable BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
