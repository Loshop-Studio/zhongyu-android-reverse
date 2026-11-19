package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker;
import androidx.compose.p011ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.PointerInputModifierNode;
import androidx.compose.p011ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.InterfaceC5876e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010%\u001a\u00020\u000e2=\u0010$\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001dH¦@¢\u0006\u0004\b%\u0010&J\u001a\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010*J\u000f\u00100\u001a\u00020\u0005H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0010J*\u0010;\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0010J\r\u0010=\u001a\u00020\u000e¢\u0006\u0004\b=\u0010\u0010JO\u0010?\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010>\u001a\u00020\u0005¢\u0006\u0004\b?\u0010@R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010AR<\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010ER$\u0010\u0007\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u00101R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010JR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010CR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010FR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, m5110d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "<init>", "(Lr6/c;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "Ld6/s;", "startListeningForEvents", "()V", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "initializePointerInputNode", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", NotificationCompat.CATEGORY_EVENT, "processDragStart", "(Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lh6/c;)Ljava/lang/Object;", "processDragCancel", "(Lh6/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta", "Lh6/c;", "", "forEachDelta", "drag", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped-TH1AsA0", "onDragStopped", "startDragImmediately", "()Z", "onDetach", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "disposeInteractionSource", "shouldResetPointerInputHandling", "update", "(Lr6/c;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;Z)V", "Landroidx/compose/foundation/gestures/Orientation;", "<set-?>", "Lr6/c;", "getCanDrag", "()Lr6/c;", "Z", "getEnabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "_canDrag", "Lkotlinx/coroutines/channels/e;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "Lkotlinx/coroutines/channels/e;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "isListeningForEvents", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DragGestureNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,640:1\n1#2:641\n*E\n"})
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    public static final int $stable = 8;

    @NotNull
    private final InterfaceC6471c _canDrag = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return (Boolean) this.this$0.getCanDrag().invoke(pointerInputChange);
        }
    };

    @NotNull
    private InterfaceC6471c canDrag;

    @Nullable
    private InterfaceC5876e channel;

    @Nullable
    private DragInteraction.Start dragInteraction;
    private boolean enabled;

    @Nullable
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;

    @Nullable
    private Orientation orientationLock;

    @Nullable
    private SuspendingPointerInputModifierNode pointerInputNode;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureNode", m5303f = "Draggable.kt", m5304i = {0}, m5305l = {552}, m5306m = "processDragCancel", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 */
    public static final class C08641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08641(InterfaceC5631c<? super C08641> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragCancel(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureNode", m5303f = "Draggable.kt", m5304i = {0, 0, 1, 1, 1}, m5305l = {534, 537}, m5306m = "processDragStart", m5307n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "interaction"}, m5308s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 */
    public static final class C08651 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C08651(InterfaceC5631c<? super C08651> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStart(null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureNode", m5303f = "Draggable.kt", m5304i = {0, 0}, m5305l = {544}, m5306m = "processDragStop", m5307n = {"this", NotificationCompat.CATEGORY_EVENT}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 */
    public static final class C08661 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C08661(InterfaceC5631c<? super C08661> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStop(null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", m5303f = "Draggable.kt", m5304i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, m5305l = {TypedValues.CycleType.TYPE_WAVE_SHAPE, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_WAVE_PHASE, 432, 434, 437}, m5306m = "invokeSuspend", m5307n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, m5308s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1 */
    public static final class C08671 extends SuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta", "Ld6/s;", "processDelta", "<anonymous>", "(Lr6/c;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", m5303f = "Draggable.kt", m5304i = {0}, m5305l = {428}, m5306m = "invokeSuspend", m5307n = {"processDelta"}, m5308s = {"L$0"})
        /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ Ref$ObjectRef<DragEvent> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref$ObjectRef<DragEvent> ref$ObjectRef, DragGestureNode dragGestureNode, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$event = ref$ObjectRef;
                this.this$0 = dragGestureNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0047 -> B:25:0x0059). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0053 -> B:24:0x0056). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r5.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r3 = r5.L$0
                    r6.c r3 = (p152r6.InterfaceC6471c) r3
                    kotlin.AbstractC5774b.m5119b(r6)
                    goto L56
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1d:
                    kotlin.AbstractC5774b.m5119b(r6)
                    java.lang.Object r6 = r5.L$0
                    r6.c r6 = (p152r6.InterfaceC6471c) r6
                    r3 = r6
                L25:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                    T r6 = r6.element
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                    if (r1 != 0) goto L5c
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                    if (r1 != 0) goto L5c
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                    r4 = 0
                    if (r1 == 0) goto L39
                    androidx.compose.foundation.gestures.DragEvent$DragDelta r6 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r6
                    goto L3a
                L39:
                    r6 = r4
                L3a:
                    if (r6 == 0) goto L3f
                    r3.invoke(r6)
                L3f:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r5.$event
                    androidx.compose.foundation.gestures.DragGestureNode r6 = r5.this$0
                    kotlinx.coroutines.channels.e r6 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r6)
                    if (r6 == 0) goto L59
                    r5.L$0 = r3
                    r5.L$1 = r1
                    r5.label = r2
                    java.lang.Object r6 = r6.mo5492o(r5)
                    if (r6 != r0) goto L56
                    return r0
                L56:
                    r4 = r6
                    androidx.compose.foundation.gestures.DragEvent r4 = (androidx.compose.foundation.gestures.DragEvent) r4
                L59:
                    r1.element = r4
                    goto L25
                L5c:
                    d6.s r6 = p045d6.C5443s.f8405a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C08671.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6471c, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        public C08671(InterfaceC5631c<? super C08671> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08671 c08671 = DragGestureNode.this.new C08671(interfaceC5631c);
            c08671.L$0 = obj;
            return c08671;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
        
            if (r7.processDragCancel(r6) != r0) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:44:0x00d8, B:40:0x00bf], limit reached: 56 */
        /* JADX WARN: Path cross not found for [B:46:0x00dc, B:19:0x005c], limit reached: 56 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r3
          0x0032: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002f, B:36:0x00b6] A[DONT_GENERATE, DONT_INLINE]
          0x0032: PHI (r3v8 kotlinx.coroutines.v) = (r3v5 kotlinx.coroutines.v), (r3v11 kotlinx.coroutines.v) binds: [B:13:0x002f, B:36:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[PHI: r4
          0x005c: PHI (r4v7 kotlinx.coroutines.v) = 
          (r4v0 kotlinx.coroutines.v)
          (r4v3 kotlinx.coroutines.v)
          (r4v3 kotlinx.coroutines.v)
          (r4v3 kotlinx.coroutines.v)
          (r4v5 kotlinx.coroutines.v)
          (r4v8 kotlinx.coroutines.v)
         binds: [B:18:0x0054, B:45:0x00da, B:47:0x00e9, B:41:0x00d3, B:30:0x008c, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:38:0x00b9, B:40:0x00bf, B:44:0x00d8, B:46:0x00dc), top: B:59:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:38:0x00b9, B:40:0x00bf, B:44:0x00d8, B:46:0x00dc), top: B:59:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:19:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d3 -> B:19:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00da -> B:19:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e9 -> B:19:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f9 -> B:11:0x0025). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C08671.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08671) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public DragGestureNode(@NotNull InterfaceC6471c interfaceC6471c, boolean z8, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = interfaceC6471c;
        this.enabled = z8;
        this.interactionSource = mutableInteractionSource;
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode.initializePointerInputNode.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", m5303f = "Draggable.kt", m5304i = {0}, m5305l = {512}, m5306m = "invokeSuspend", m5307n = {"$this$coroutineScope"}, m5308s = {"L$0"})
            /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6473e $onDrag;
                final /* synthetic */ InterfaceC6469a $onDragCancel;
                final /* synthetic */ InterfaceC6471c $onDragEnd;
                final /* synthetic */ InterfaceC6474f $onDragStart;
                final /* synthetic */ InterfaceC6469a $shouldAwaitTouchSlop;
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DragGestureNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = dragGestureNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                    this.$onDragStart = interfaceC6474f;
                    this.$onDragEnd = interfaceC6471c;
                    this.$onDragCancel = interfaceC6469a;
                    this.$shouldAwaitTouchSlop = interfaceC6469a2;
                    this.$onDrag = interfaceC6473e;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, interfaceC5631c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r11.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r0 = r11.L$0
                        r1 = r0
                        kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                        kotlin.AbstractC5774b.m5119b(r12)     // Catch: java.util.concurrent.CancellationException -> L13
                        r10 = r11
                        goto L5e
                    L13:
                        r0 = move-exception
                        r12 = r0
                        r10 = r11
                        goto L4b
                    L17:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L1f:
                        kotlin.AbstractC5774b.m5119b(r12)
                        java.lang.Object r12 = r11.L$0
                        r1 = r12
                        kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                        androidx.compose.foundation.gestures.DragGestureNode r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L48
                        androidx.compose.foundation.gestures.Orientation r8 = androidx.compose.foundation.gestures.DragGestureNode.access$getOrientationLock$p(r12)     // Catch: java.util.concurrent.CancellationException -> L48
                        androidx.compose.ui.input.pointer.PointerInputScope r3 = r11.$this_SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L48
                        r6.f r4 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L48
                        r6.c r5 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L48
                        r6.a r6 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L48
                        r6.a r7 = r11.$shouldAwaitTouchSlop     // Catch: java.util.concurrent.CancellationException -> L48
                        r6.e r9 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> L48
                        r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L48
                        r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L48
                        r10 = r11
                        java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L45
                        if (r12 != r0) goto L5e
                        return r0
                    L45:
                        r0 = move-exception
                    L46:
                        r12 = r0
                        goto L4b
                    L48:
                        r0 = move-exception
                        r10 = r11
                        goto L46
                    L4b:
                        androidx.compose.foundation.gestures.DragGestureNode r0 = r10.this$0
                        kotlinx.coroutines.channels.e r0 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r0)
                        if (r0 == 0) goto L58
                        androidx.compose.foundation.gestures.DragEvent$DragCancelled r2 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE
                        r0.mo5481a(r2)
                    L58:
                        boolean r0 = kotlinx.coroutines.AbstractC6014x.m5648s(r1)
                        if (r0 == 0) goto L61
                    L5e:
                        d6.s r12 = p045d6.C5443s.f8405a
                        return r12
                    L61:
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C08621.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                final VelocityTracker velocityTracker = new VelocityTracker();
                final DragGestureNode dragGestureNode = DragGestureNode.this;
                InterfaceC6474f interfaceC6474f = new InterfaceC6474f() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // p152r6.InterfaceC6474f
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m6980invoke0AR0LA0((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).m10451unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-0AR0LA0, reason: not valid java name */
                    public final void m6980invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j7) {
                        if (((Boolean) dragGestureNode.getCanDrag().invoke(pointerInputChange)).booleanValue()) {
                            if (!dragGestureNode.isListeningForEvents) {
                                if (dragGestureNode.channel == null) {
                                    dragGestureNode.channel = AbstractC5882k.m5511a(Integer.MAX_VALUE, 6, null);
                                }
                                dragGestureNode.startListeningForEvents();
                            }
                            VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                            long jM10445minusMKHz9U = Offset.m10445minusMKHz9U(pointerInputChange2.getPosition(), j7);
                            InterfaceC5876e interfaceC5876e = dragGestureNode.channel;
                            if (interfaceC5876e != null) {
                                interfaceC5876e.mo5481a(new DragEvent.DragStarted(jM10445minusMKHz9U, null));
                            }
                        }
                    }
                };
                final DragGestureNode dragGestureNode2 = DragGestureNode.this;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PointerInputChange) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(PointerInputChange pointerInputChange) {
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        float maximumFlingVelocity = pointerInputScope.getViewConfiguration().getMaximumFlingVelocity();
                        long jM12006calculateVelocityAH228Gc = velocityTracker.m12006calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                        velocityTracker.resetTracking();
                        InterfaceC5876e interfaceC5876e = dragGestureNode2.channel;
                        if (interfaceC5876e != null) {
                            interfaceC5876e.mo5481a(new DragEvent.DragStopped(DraggableKt.m6990toValidVelocityTH1AsA0(jM12006calculateVelocityAH228Gc), null));
                        }
                    }
                };
                final DragGestureNode dragGestureNode3 = DragGestureNode.this;
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m6979invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m6979invoke() {
                        InterfaceC5876e interfaceC5876e = dragGestureNode3.channel;
                        if (interfaceC5876e != null) {
                            interfaceC5876e.mo5481a(DragEvent.DragCancelled.INSTANCE);
                        }
                    }
                };
                final DragGestureNode dragGestureNode4 = DragGestureNode.this;
                InterfaceC6469a interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final Boolean invoke() {
                        return Boolean.valueOf(!dragGestureNode4.getStartDragImmediately());
                    }
                };
                final DragGestureNode dragGestureNode5 = DragGestureNode.this;
                Object objM5637h = AbstractC6014x.m5637h(new AnonymousClass1(DragGestureNode.this, pointerInputScope, interfaceC6474f, interfaceC6471c, interfaceC6469a, interfaceC6469a2, new InterfaceC6473e() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m6978invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m10451unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m6978invokeUv8p0NA(PointerInputChange pointerInputChange, long j7) {
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        InterfaceC5876e interfaceC5876e = dragGestureNode5.channel;
                        if (interfaceC5876e != null) {
                            interfaceC5876e.mo5481a(new DragEvent.DragDelta(j7, null));
                        }
                    }
                }, null), interfaceC5631c);
                return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(p075h6.InterfaceC5631c<? super p045d6.C5443s> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode.C08641
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C08641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.AbstractC5774b.m5119b(r6)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.AbstractC5774b.m5119b(r6)
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r5.dragInteraction
            if (r6 == 0) goto L53
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L4e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r4 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r4.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r2.emit(r4, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            r6 = 0
            r0.dragInteraction = r6
            goto L54
        L53:
            r0 = r5
        L54:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.p011ui.unit.Velocity.INSTANCE
            long r1 = r6.m13554getZero9UxMQ8M()
            r0.mo6922onDragStoppedTH1AsA0(r1)
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragCancel(h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(androidx.compose.foundation.gestures.DragEvent.DragStarted r7, p075h6.InterfaceC5631c<? super p045d6.C5443s> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode.C08651
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C08651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.L$2
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = (androidx.compose.foundation.interaction.DragInteraction.Start) r7
            java.lang.Object r1 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r1 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.AbstractC5774b.m5119b(r8)
            goto L83
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.Object r7 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r7
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.AbstractC5774b.m5119b(r8)
            goto L68
        L4a:
            kotlin.AbstractC5774b.m5119b(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.dragInteraction
            if (r8 == 0) goto L67
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.interactionSource
            if (r2 == 0) goto L67
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r2.emit(r5, r0)
            if (r8 != r1) goto L67
            goto L7f
        L67:
            r2 = r6
        L68:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.interactionSource
            if (r4 == 0) goto L86
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r0 = r4.emit(r8, r0)
            if (r0 != r1) goto L80
        L7f:
            return r1
        L80:
            r1 = r7
            r7 = r8
            r0 = r2
        L83:
            r8 = r7
            r2 = r0
            r7 = r1
        L86:
            r2.dragInteraction = r8
            long r7 = r7.getStartPoint()
            r2.mo6921onDragStartedk4lQ0M(r7)
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStart(androidx.compose.foundation.gestures.DragEvent$DragStarted, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(androidx.compose.foundation.gestures.DragEvent.DragStopped r6, p075h6.InterfaceC5631c<? super p045d6.C5443s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode.C08661
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C08661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.AbstractC5774b.m5119b(r7)
            goto L55
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.AbstractC5774b.m5119b(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.dragInteraction
            if (r7 == 0) goto L59
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L54
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r2.emit(r4, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            r7 = 0
            r0.dragInteraction = r7
            goto L5a
        L59:
            r0 = r5
        L5a:
            long r6 = r6.getVelocity()
            r0.mo6922onDragStoppedTH1AsA0(r6)
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStop(androidx.compose.foundation.gestures.DragEvent$DragStopped, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C08671(null), 3);
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, InterfaceC6471c interfaceC6471c, boolean z8, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i & 1) != 0) {
            interfaceC6471c = dragGestureNode.canDrag;
        }
        if ((i & 2) != 0) {
            z8 = dragGestureNode.enabled;
        }
        if ((i & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i & 16) != 0) {
            z9 = false;
        }
        boolean z10 = z9;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        dragGestureNode.update(interfaceC6471c2, z8, mutableInteractionSource2, orientation, z10);
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    @Nullable
    public abstract Object drag(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);

    @NotNull
    public final InterfaceC6471c getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo6921onDragStartedk4lQ0M(long startedPosition);

    /* renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo6922onDragStoppedTH1AsA0(long velocity);

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo6724onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo6724onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    /* renamed from: startDragImmediately */
    public abstract boolean getStartDragImmediately();

    public final void update(@NotNull InterfaceC6471c canDrag, boolean enabled, @Nullable MutableInteractionSource interactionSource, @Nullable Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.canDrag = canDrag;
        boolean z8 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    undelegate(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!AbstractC5830k.m5325b(this.interactionSource, interactionSource)) {
            disposeInteractionSource();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z8 = shouldResetPointerInputHandling;
        }
        if (!z8 || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
    }
}
