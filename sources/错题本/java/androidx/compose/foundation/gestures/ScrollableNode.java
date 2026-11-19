package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.autofill.HintConstants;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.p011ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p011ui.focus.Focusability;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEventType;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifierNode;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001dJO\u0010*\u001a\u00020\u00182=\u0010)\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00180\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180'\u0012\u0006\u0012\u0004\u0018\u00010(0!H\u0096@¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001aJ\u001a\u00101\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001aJ\u000f\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u00103JU\u00104\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H\u0016¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001dJ\u001a\u0010<\u001a\u00020\r2\u0006\u00109\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010;J*\u0010G\u001a\u00020\u00182\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0013\u0010I\u001a\u00020\u0018*\u00020HH\u0016¢\u0006\u0004\bI\u0010JR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010KR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010LR\u001a\u0010M\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u00103R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aRH\u0010e\u001a4\u0012\u0013\u0012\u00110b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(c\u0012\u0013\u0012\u00110b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020\r\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR4\u0010g\u001a \b\u0001\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0'\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Ld6/s;", "onWheelScrollStopped-TH1AsA0", "(J)V", "onWheelScrollStopped", "ensureMouseWheelScrollNodeInitialized", "()V", "updateDefaultFlingBehavior", "setScrollSemanticsActions", "clearScrollSemanticsActions", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta", "Lh6/c;", "", "forEachDelta", "drag", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "onDragStarted-k-4lQ0M", "onDragStarted", "onDragStopped-TH1AsA0", "onDragStopped", "startDragImmediately", "()Z", "update", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "onAttach", "onDensityChange", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "scrollableContainerNode", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "contentInViewNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "", "x", "y", "scrollByAction", "Lr6/e;", "scrollByOffsetAction", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "mouseWheelScrollingLogic", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1037:1\n59#2:1038\n54#2:1044\n90#3:1039\n53#3,3:1041\n85#3:1045\n53#3,3:1047\n30#4:1040\n30#4:1046\n102#5,2:1050\n34#5,6:1052\n104#5:1058\n1#6:1059\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n*L\n445#1:1038\n456#1:1044\n445#1:1039\n454#1:1041,3\n456#1:1045\n465#1:1047,3\n454#1:1040\n465#1:1046\n495#1:1050,2\n495#1:1052,6\n495#1:1058\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @NotNull
    private final ContentInViewNode contentInViewNode;

    @NotNull
    private final DefaultFlingBehavior defaultFlingBehavior;

    @Nullable
    private FlingBehavior flingBehavior;

    @Nullable
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;

    @NotNull
    private final ScrollableNestedScrollConnection nestedScrollConnection;

    @NotNull
    private final NestedScrollDispatcher nestedScrollDispatcher;

    @Nullable
    private OverscrollEffect overscrollEffect;

    @Nullable
    private InterfaceC6473e scrollByAction;

    @Nullable
    private InterfaceC6473e scrollByOffsetAction;

    @NotNull
    private final ScrollableContainerNode scrollableContainerNode;

    @NotNull
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 */
    public /* synthetic */ class C08971 extends AdaptedFunctionReference implements InterfaceC6473e {
        public C08971(Object obj) {
            super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7036invokesFctU(((Velocity) obj).getPackedValue(), (InterfaceC5631c) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m7036invokesFctU(long j7, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ScrollableNode.ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j7, interfaceC5631c);
        }
    }

    @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", m5303f = "Scrollable.kt", m5304i = {}, m5305l = {522}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2 */
    public static final class C09002 extends SuspendLambda implements InterfaceC6473e {
        /* synthetic */ long J$0;
        int label;

        public C09002(InterfaceC5631c<? super C09002> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09002 c09002 = ScrollableNode.this.new C09002(interfaceC5631c);
            c09002.J$0 = ((Offset) obj).m10451unboximpl();
            return c09002;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7037invoke3MmeM6k(((Offset) obj).m10451unboximpl(), (InterfaceC5631c) obj2);
        }

        /* renamed from: invoke-3MmeM6k, reason: not valid java name */
        public final Object m7037invoke3MmeM6k(long j7, InterfaceC5631c<? super Offset> interfaceC5631c) {
            return ((C09002) create(Offset.m10430boximpl(j7), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return obj;
            }
            AbstractC5774b.m5119b(obj);
            long j7 = this.J$0;
            ScrollingLogic scrollingLogic = ScrollableNode.this.scrollingLogic;
            this.label = 1;
            Object objM7032semanticsScrollByd4ec7I = ScrollableKt.m7032semanticsScrollByd4ec7I(scrollingLogic, j7, this);
            return objM7032semanticsScrollByd4ec7I == coroutineSingletons ? coroutineSingletons : objM7032semanticsScrollByd4ec7I;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.foundation.gestures.FlingBehavior] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public ScrollableNode(@NotNull ScrollableState scrollableState, @Nullable OverscrollEffect overscrollEffect, @Nullable FlingBehavior flingBehavior, @NotNull Orientation orientation, boolean z8, boolean z9, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable BringIntoViewSpec bringIntoViewSpec) {
        super(ScrollableKt.CanDragCalculation, z8, mutableInteractionSource, orientation);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableContainerNode = (ScrollableContainerNode) delegate(new ScrollableContainerNode(z8));
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.UnityDensity), null, 2, 0 == true ? 1 : 0);
        this.defaultFlingBehavior = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        ?? r14 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, r14 == 0 ? defaultFlingBehavior : r14, orientation, z9, nestedScrollDispatcher, new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.getIsAttached());
            }
        });
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z8);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(orientation, scrollingLogic, z9, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(FocusTargetModifierNodeKt.m10356FocusTargetModifierNodePYyLHbc$default(Focusability.INSTANCE.m10378getNeverLCbbffg(), null, 2, null));
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                ScrollableNode.this.contentInViewNode.onFocusBoundsChanged(layoutCoordinates);
            }
        }));
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void ensureMouseWheelScrollNodeInitialized() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new C08971(this), DelegatableNodeKt.requireDensity(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingMouseWheelEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode scrollableNode, long j7, InterfaceC5631c interfaceC5631c) {
        scrollableNode.m7035onWheelScrollStoppedTH1AsA0(j7);
        return C5443s.f8405a;
    }

    /* renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m7035onWheelScrollStoppedTH1AsA0(long velocity) {
        AbstractC6014x.m5651v(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, velocity, null), 3);
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.ScrollableNode.setScrollSemanticsActions.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", m5303f = "Scrollable.kt", m5304i = {}, m5305l = {518}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1037:1\n30#2:1038\n53#3,3:1039\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n*L\n518#1:1038\n518#1:1039,3\n*E\n"})
            /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {

                /* renamed from: $x */
                final /* synthetic */ float f744$x;

                /* renamed from: $y */
                final /* synthetic */ float f745$y;
                int label;
                final /* synthetic */ ScrollableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ScrollableNode scrollableNode, float f, float f7, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = scrollableNode;
                    this.f744$x = f;
                    this.f745$y = f7;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass1(this.this$0, this.f744$x, this.f745$y, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
                        float f = this.f744$x;
                        float f7 = this.f745$y;
                        long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
                        this.label = 1;
                        if (ScrollableKt.m7032semanticsScrollByd4ec7I(scrollingLogic, jM10433constructorimpl, this) == coroutineSingletons) {
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

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }

            public final Boolean invoke(float f, float f7) {
                AbstractC6014x.m5651v(ScrollableNode.this.getCoroutineScope(), null, null, new AnonymousClass1(ScrollableNode.this, f, f7, null), 3);
                return Boolean.TRUE;
            }
        };
        this.scrollByOffsetAction = new C09002(null);
    }

    private final void updateDefaultFlingBehavior() {
        if (getIsAttached()) {
            this.defaultFlingBehavior.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        InterfaceC6473e interfaceC6473e = this.scrollByAction;
        if (interfaceC6473e != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, interfaceC6473e, 1, null);
        }
        InterfaceC6473e interfaceC6473e2 = this.scrollByOffsetAction;
        if (interfaceC6473e2 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, interfaceC6473e2);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @Nullable
    public Object drag(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object objScroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(interfaceC6473e, scrollingLogic, null), interfaceC5631c);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : C5443s.f8405a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.p011ui.node.DelegatableNode, androidx.compose.p011ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo6921onDragStartedk4lQ0M(long startedPosition) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo6922onDragStoppedTH1AsA0(long velocity) {
        AbstractC6014x.m5651v(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(this, velocity, null), 3);
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo6723onKeyEventZmokQxo(@NotNull KeyEvent event) {
        long jM10433constructorimpl;
        if (!getEnabled()) {
            return false;
        }
        long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
        Key.Companion companion = Key.INSTANCE;
        if ((!Key.m11455equalsimpl0(jM11763getKeyZmokQxo, companion.m11643getPageDownEK5gGoQ()) && !Key.m11455equalsimpl0(KeyEvent_androidKt.m11763getKeyZmokQxo(event), companion.m11644getPageUpEK5gGoQ())) || !KeyEventType.m11756equalsimpl0(KeyEvent_androidKt.m11764getTypeZmokQxo(event), KeyEventType.INSTANCE.m11760getKeyDownCS__XNY()) || KeyEvent_androidKt.m11767isCtrlPressedZmokQxo(event)) {
            return false;
        }
        if (this.scrollingLogic.isVertical()) {
            int viewportSize = (int) (this.contentInViewNode.getViewportSize() & 4294967295L);
            jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Key.m11455equalsimpl0(KeyEvent_androidKt.m11763getKeyZmokQxo(event), companion.m11644getPageUpEK5gGoQ()) ? viewportSize : -viewportSize) & 4294967295L));
        } else {
            int viewportSize2 = (int) (this.contentInViewNode.getViewportSize() >> 32);
            jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Key.m11455equalsimpl0(KeyEvent_androidKt.m11763getKeyZmokQxo(event), companion.m11644getPageUpEK5gGoQ()) ? viewportSize2 : -viewportSize2) << 32));
        }
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, jM10433constructorimpl, null), 3);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo6724onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) getCanDrag().invoke(changes.get(i))).booleanValue()) {
                super.mo6724onPointerEventH0pRuoY(pointerEvent, pass, bounds);
                break;
            }
            i++;
        }
        if (getEnabled()) {
            if (pass == PointerEventPass.Initial && PointerEventType.m11857equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m11866getScroll7fucELk())) {
                ensureMouseWheelScrollNodeInitialized();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.m6998onPointerEventH0pRuoY(pointerEvent, pass, bounds);
            }
        }
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo6725onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(@NotNull ScrollableState state, @NotNull Orientation orientation, @Nullable OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, @Nullable FlingBehavior flingBehavior, @Nullable MutableInteractionSource interactionSource, @Nullable BringIntoViewSpec bringIntoViewSpec) {
        boolean z8;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.setEnabled(enabled);
            this.scrollableContainerNode.update(enabled);
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z9 = z8;
        boolean zUpdate = this.scrollingLogic.update(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        update(ScrollableKt.CanDragCalculation, enabled, interactionSource, this.scrollingLogic.isVertical() ? Orientation.Vertical : Orientation.Horizontal, zUpdate);
        if (z9) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }
}
