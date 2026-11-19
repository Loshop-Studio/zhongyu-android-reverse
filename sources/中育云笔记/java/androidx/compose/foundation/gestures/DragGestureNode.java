package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.input.pointer.util.VelocityTracker;
import androidx.compose.p014ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.p014ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.C10002c;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    public static final int $stable = 8;
    private final InterfaceC9540l _canDrag = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return (Boolean) this.this$0.getCanDrag().invoke(pointerInputChange);
        }
    };
    private InterfaceC9540l canDrag;
    private InterfaceC10000a channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private Orientation orientationLock;
    private SuspendingPointerInputModifierNode pointerInputNode;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureNode", m26211f = "Draggable.kt", m26212l = {552}, m26213m = "processDragCancel")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 */
    public static final class C13091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13091(InterfaceC11588c<? super C13091> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragCancel(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureNode", m26211f = "Draggable.kt", m26212l = {534, 537}, m26213m = "processDragStart")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 */
    public static final class C13101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C13101(InterfaceC11588c<? super C13101> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStart(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureNode", m26211f = "Draggable.kt", m26212l = {544}, m26213m = "processDragStop")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 */
    public static final class C13111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13111(InterfaceC11588c<? super C13111> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStop(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", m26211f = "Draggable.kt", m26212l = {421, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_WAVE_PHASE, 432, 434, 437}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1 */
    public static final class C13121 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", m26211f = "Draggable.kt", m26212l = {428}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ Ref$ObjectRef<DragEvent> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref$ObjectRef<DragEvent> ref$ObjectRef, DragGestureNode dragGestureNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$event = ref$ObjectRef;
                this.this$0 = dragGestureNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC9540l, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r3 = r5.L$0
                    hd.l r3 = (p181hd.InterfaceC9540l) r3
                    kotlin.AbstractC9924b.m20071b(r6)
                    goto L58
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    kotlin.AbstractC9924b.m20071b(r6)
                    java.lang.Object r6 = r5.L$0
                    hd.l r6 = (p181hd.InterfaceC9540l) r6
                    r3 = r6
                L27:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                    java.lang.Object r6 = r6.f23402c
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                    r4 = 0
                    if (r1 == 0) goto L3b
                    androidx.compose.foundation.gestures.DragEvent$DragDelta r6 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r6
                    goto L3c
                L3b:
                    r6 = r4
                L3c:
                    if (r6 == 0) goto L41
                    r3.invoke(r6)
                L41:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r5.$event
                    androidx.compose.foundation.gestures.DragGestureNode r6 = r5.this$0
                    kotlinx.coroutines.channels.a r6 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r6)
                    if (r6 == 0) goto L5b
                    r5.L$0 = r3
                    r5.L$1 = r1
                    r5.label = r2
                    java.lang.Object r6 = r6.mo20630d(r5)
                    if (r6 != r0) goto L58
                    return r0
                L58:
                    r4 = r6
                    androidx.compose.foundation.gestures.DragEvent r4 = (androidx.compose.foundation.gestures.DragEvent) r4
                L5b:
                    r1.f23402c = r4
                    goto L27
                L5e:
                    qc.q r6 = p309qc.C10786q.f26013a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C13121.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C13121(InterfaceC11588c<? super C13121> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13121 c13121 = DragGestureNode.this.new C13121(interfaceC11588c);
            c13121.L$0 = obj;
            return c13121;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
        
            if (r7.processDragCancel(r6) != r0) goto L11;
         */
        /* JADX WARN: Path cross not found for [B:44:0x00da, B:40:0x00c1], limit reached: 56 */
        /* JADX WARN: Path cross not found for [B:46:0x00de, B:19:0x005e], limit reached: 56 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r1 r3
          0x0034: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r3v8 sd.i0) = (r3v5 sd.i0), (r3v11 sd.i0) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[PHI: r4
          0x005e: PHI (r4v7 sd.i0) = (r4v0 sd.i0), (r4v3 sd.i0), (r4v3 sd.i0), (r4v3 sd.i0), (r4v5 sd.i0), (r4v8 sd.i0) binds: [B:18:0x0056, B:45:0x00dc, B:47:0x00eb, B:41:0x00d5, B:30:0x008e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dc -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00eb -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fb -> B:11:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C13121.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13121) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public DragGestureNode(InterfaceC9540l interfaceC9540l, boolean z10, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = interfaceC9540l;
        this.enabled = z10;
        this.interactionSource = mutableInteractionSource;
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode.initializePointerInputNode.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", m26211f = "Draggable.kt", m26212l = {512}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC9544p $onDrag;
                final /* synthetic */ InterfaceC9529a $onDragCancel;
                final /* synthetic */ InterfaceC9540l $onDragEnd;
                final /* synthetic */ InterfaceC9545q $onDragStart;
                final /* synthetic */ InterfaceC9529a $shouldAwaitTouchSlop;
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DragGestureNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = dragGestureNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                    this.$onDragStart = interfaceC9545q;
                    this.$onDragEnd = interfaceC9540l;
                    this.$onDragCancel = interfaceC9529a;
                    this.$shouldAwaitTouchSlop = interfaceC9529a2;
                    this.$onDrag = interfaceC9544p;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                    /*
                        r11 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r11.label
                        r2 = 1
                        if (r1 == 0) goto L21
                        if (r1 != r2) goto L19
                        java.lang.Object r0 = r11.L$0
                        r1 = r0
                        sd.i0 r1 = (sd.InterfaceC11122i0) r1
                        kotlin.AbstractC9924b.m20071b(r12)     // Catch: java.util.concurrent.CancellationException -> L15
                        r10 = r11
                        goto L64
                    L15:
                        r0 = move-exception
                        r12 = r0
                        r10 = r11
                        goto L4d
                    L19:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L21:
                        kotlin.AbstractC9924b.m20071b(r12)
                        java.lang.Object r12 = r11.L$0
                        r1 = r12
                        sd.i0 r1 = (sd.InterfaceC11122i0) r1
                        androidx.compose.foundation.gestures.DragGestureNode r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L4a
                        androidx.compose.foundation.gestures.Orientation r8 = androidx.compose.foundation.gestures.DragGestureNode.access$getOrientationLock$p(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
                        androidx.compose.ui.input.pointer.PointerInputScope r3 = r11.$this_SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L4a
                        hd.q r4 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L4a
                        hd.l r5 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L4a
                        hd.a r6 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L4a
                        hd.a r7 = r11.$shouldAwaitTouchSlop     // Catch: java.util.concurrent.CancellationException -> L4a
                        hd.p r9 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> L4a
                        r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L4a
                        r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L4a
                        r10 = r11
                        java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L47
                        if (r12 != r0) goto L64
                        return r0
                    L47:
                        r0 = move-exception
                    L48:
                        r12 = r0
                        goto L4d
                    L4a:
                        r0 = move-exception
                        r10 = r11
                        goto L48
                    L4d:
                        androidx.compose.foundation.gestures.DragGestureNode r0 = r10.this$0
                        kotlinx.coroutines.channels.a r0 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r0)
                        if (r0 == 0) goto L5e
                        androidx.compose.foundation.gestures.DragEvent$DragCancelled r2 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE
                        java.lang.Object r0 = r0.mo33808trySendJP2dKIU(r2)
                        kotlinx.coroutines.channels.C10002c.m20724b(r0)
                    L5e:
                        boolean r0 = kotlinx.coroutines.AbstractC10006d.m20749f(r1)
                        if (r0 == 0) goto L67
                    L64:
                        qc.q r12 = p309qc.C10786q.f26013a
                        return r12
                    L67:
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C13071.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                final VelocityTracker velocityTracker = new VelocityTracker();
                final DragGestureNode dragGestureNode = DragGestureNode.this;
                InterfaceC9545q interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // p181hd.InterfaceC9545q
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m27176invoke0AR0LA0((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).m30647unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-0AR0LA0, reason: not valid java name */
                    public final void m27176invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j10) {
                        if (((Boolean) dragGestureNode.getCanDrag().invoke(pointerInputChange)).booleanValue()) {
                            if (!dragGestureNode.isListeningForEvents) {
                                if (dragGestureNode.channel == null) {
                                    dragGestureNode.channel = AbstractC10001b.m20722b(Integer.MAX_VALUE, null, null, 6, null);
                                }
                                dragGestureNode.startListeningForEvents();
                            }
                            VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                            long jM30641minusMKHz9U = Offset.m30641minusMKHz9U(pointerInputChange2.m32104getPositionF1C5BW0(), j10);
                            InterfaceC10000a interfaceC10000a = dragGestureNode.channel;
                            if (interfaceC10000a != null) {
                                C10002c.m20724b(interfaceC10000a.mo33808trySendJP2dKIU(new DragEvent.DragStarted(jM30641minusMKHz9U, null)));
                            }
                        }
                    }
                };
                final DragGestureNode dragGestureNode2 = DragGestureNode.this;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PointerInputChange) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(PointerInputChange pointerInputChange) {
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        float maximumFlingVelocity = pointerInputScope.getViewConfiguration().getMaximumFlingVelocity();
                        long jM32202calculateVelocityAH228Gc = velocityTracker.m32202calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                        velocityTracker.resetTracking();
                        InterfaceC10000a interfaceC10000a = dragGestureNode2.channel;
                        if (interfaceC10000a != null) {
                            C10002c.m20724b(interfaceC10000a.mo33808trySendJP2dKIU(new DragEvent.DragStopped(DraggableKt.m27186toValidVelocityTH1AsA0(jM32202calculateVelocityAH228Gc), null)));
                        }
                    }
                };
                final DragGestureNode dragGestureNode3 = DragGestureNode.this;
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27175invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27175invoke() {
                        InterfaceC10000a interfaceC10000a = dragGestureNode3.channel;
                        if (interfaceC10000a != null) {
                            C10002c.m20724b(interfaceC10000a.mo33808trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
                        }
                    }
                };
                final DragGestureNode dragGestureNode4 = DragGestureNode.this;
                InterfaceC9529a interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        return Boolean.valueOf(!dragGestureNode4.startDragImmediately());
                    }
                };
                final DragGestureNode dragGestureNode5 = DragGestureNode.this;
                Object objM20748e = AbstractC10006d.m20748e(new AnonymousClass1(DragGestureNode.this, pointerInputScope, interfaceC9545q, interfaceC9540l, interfaceC9529a, interfaceC9529a2, new InterfaceC9544p() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m27174invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m30647unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m27174invokeUv8p0NA(PointerInputChange pointerInputChange, long j10) {
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        InterfaceC10000a interfaceC10000a = dragGestureNode5.channel;
                        if (interfaceC10000a != null) {
                            C10002c.m20724b(interfaceC10000a.mo33808trySendJP2dKIU(new DragEvent.DragDelta(j10, null)));
                        }
                    }
                }, null), interfaceC11588c);
                return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode.C13091
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C13091) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r5.dragInteraction
            if (r6 == 0) goto L55
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L50
            androidx.compose.foundation.interaction.DragInteraction$Cancel r4 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r4.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r2.emit(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.dragInteraction = r6
            goto L56
        L55:
            r0 = r5
        L56:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.p014ui.unit.Velocity.Companion
            long r1 = r6.m33750getZero9UxMQ8M()
            r0.mo27118onDragStoppedTH1AsA0(r1)
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragCancel(vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(androidx.compose.foundation.gestures.DragEvent.DragStarted r7, vc.InterfaceC11588c<? super p309qc.C10786q> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode.C13101
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C13101) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$2
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = (androidx.compose.foundation.interaction.DragInteraction.Start) r7
            java.lang.Object r1 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r1 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r7
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6a
        L4c:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.dragInteraction
            if (r8 == 0) goto L69
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.interactionSource
            if (r2 == 0) goto L69
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r2.emit(r5, r0)
            if (r8 != r1) goto L69
            goto L81
        L69:
            r2 = r6
        L6a:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.interactionSource
            if (r4 == 0) goto L88
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r0 = r4.emit(r8, r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.dragInteraction = r8
            long r7 = r7.m27138getStartPointF1C5BW0()
            r2.mo27117onDragStartedk4lQ0M(r7)
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStart(androidx.compose.foundation.gestures.DragEvent$DragStarted, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(androidx.compose.foundation.gestures.DragEvent.DragStopped r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode.C13111
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode.C13111) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.AbstractC9924b.m20071b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.dragInteraction
            if (r7 == 0) goto L5b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.interactionSource
            if (r2 == 0) goto L56
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r2.emit(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.dragInteraction = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.m27139getVelocity9UxMQ8M()
            r0.mo27118onDragStoppedTH1AsA0(r6)
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStop(androidx.compose.foundation.gestures.DragEvent$DragStopped, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C13121(null), 3, null);
    }

    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, InterfaceC9540l interfaceC9540l, boolean z10, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i10 & 1) != 0) {
            interfaceC9540l = dragGestureNode.canDrag;
        }
        if ((i10 & 2) != 0) {
            z10 = dragGestureNode.enabled;
        }
        if ((i10 & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i10 & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        dragGestureNode.update(interfaceC9540l2, z10, mutableInteractionSource2, orientation, z12);
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

    public abstract Object drag(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c);

    public final InterfaceC9540l getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
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
    public abstract void mo27117onDragStartedk4lQ0M(long j10);

    /* renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo27118onDragStoppedTH1AsA0(long j10);

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        }
    }

    public abstract boolean startDragImmediately();

    public final void update(InterfaceC9540l interfaceC9540l, boolean z10, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z11) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.canDrag = interfaceC9540l;
        boolean z12 = true;
        if (this.enabled != z10) {
            this.enabled = z10;
            if (!z10) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    undelegate(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            z11 = true;
        }
        if (!AbstractC9979u.m20289b(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (this.orientationLock != orientation) {
            this.orientationLock = orientation;
        } else {
            z12 = z11;
        }
        if (!z12 || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
    }
}
