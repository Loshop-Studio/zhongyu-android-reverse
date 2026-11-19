package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.Velocity;
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
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0004\u0012!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r*\u00020\rH\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010!\u001a\u00020\u00112=\u0010 \u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00110\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001bH\u0096@¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010&J\u0091\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00042!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b'\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R1\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R1\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00110\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m5110d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "reverseDirection", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "Ld6/s;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lr6/c;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLr6/c;Lr6/c;)V", "reverseIfNeeded-MK-Hz9U", "(J)J", "reverseIfNeeded", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "Lh6/c;", "", "forEachDelta", "drag", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped-TH1AsA0", "()Z", "update", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Z", "Lr6/c;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,329:1\n150#2:330\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n*L\n306#1:330\n*E\n"})
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;

    @NotNull
    private InterfaceC6471c onDragStarted;

    @NotNull
    private InterfaceC6471c onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;

    @NotNull
    private Draggable2DState state;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/Drag2DScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/Drag2DScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", m5303f = "Draggable2D.kt", m5304i = {}, m5305l = {257}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2 */
    public static final class C08682 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Draggable2DNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08682(InterfaceC6473e interfaceC6473e, Draggable2DNode draggable2DNode, InterfaceC5631c<? super C08682> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$forEachDelta = interfaceC6473e;
            this.this$0 = draggable2DNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08682 c08682 = new C08682(this.$forEachDelta, this.this$0, interfaceC5631c);
            c08682.L$0 = obj;
            return c08682;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(Drag2DScope drag2DScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08682) create(drag2DScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
                InterfaceC6473e interfaceC6473e = this.$forEachDelta;
                final Draggable2DNode draggable2DNode = this.this$0;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.Draggable2DNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        Drag2DScope drag2DScope2 = drag2DScope;
                        Draggable2DNode draggable2DNode2 = draggable2DNode;
                        long delta = dragDelta.getDelta();
                        if (draggable2DNode2.reverseDirection) {
                            delta = Offset.m10433constructorimpl(delta ^ (-9223372034707292160L));
                        }
                        drag2DScope2.mo6939dragByk4lQ0M(delta);
                    }
                };
                this.label = 1;
                if (interfaceC6473e.invoke(interfaceC6471c, this) == coroutineSingletons) {
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

    public Draggable2DNode(@NotNull Draggable2DState draggable2DState, @NotNull InterfaceC6471c interfaceC6471c, boolean z8, @Nullable MutableInteractionSource mutableInteractionSource, boolean z9, boolean z10, @NotNull InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6471c interfaceC6471c3) {
        super(interfaceC6471c, z8, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z9;
        this.reverseDirection = z10;
        this.onDragStarted = interfaceC6471c2;
        this.onDragStopped = interfaceC6471c3;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m6984reverseIfNeededMKHz9U(long j7) {
        return this.reverseDirection ? Offset.m10433constructorimpl(j7 ^ (-9223372034707292160L)) : j7;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @Nullable
    public Object drag(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new C08682(interfaceC6473e, this, null), interfaceC5631c);
        return objDrag == CoroutineSingletons.COROUTINE_SUSPENDED ? objDrag : C5443s.f8405a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo6921onDragStartedk4lQ0M(long startedPosition) {
        this.onDragStarted.invoke(Offset.m10430boximpl(startedPosition));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo6922onDragStoppedTH1AsA0(long velocity) {
        this.onDragStopped.invoke(Velocity.m13534boximpl(velocity));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(@NotNull Draggable2DState state, @NotNull InterfaceC6471c canDrag, boolean enabled, @Nullable MutableInteractionSource interactionSource, boolean startDragImmediately, boolean reverseDirection, @NotNull InterfaceC6471c onDragStarted, @NotNull InterfaceC6471c onDragStopped) {
        boolean z8;
        boolean z9 = true;
        if (AbstractC5830k.m5325b(this.state, state)) {
            z8 = false;
        } else {
            this.state = state;
            z8 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z9 = z8;
        }
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.startDragImmediately = startDragImmediately;
        update(canDrag, enabled, interactionSource, null, z9);
    }
}
