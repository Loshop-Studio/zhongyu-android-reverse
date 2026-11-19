package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private InterfaceC9540l canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private PointerInputModifierNode pointerInputModifierMouse;
    private ScrollConfig scrollConfig;
    private TransformableState state;
    private final InterfaceC9540l updatedCanPan = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m27262invokek4lQ0M(((Offset) obj).m30647unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final Boolean m27262invokek4lQ0M(long j10) {
            return (Boolean) this.this$0.canPan.invoke(Offset.m30626boximpl(j10));
        }
    };
    private final InterfaceC10000a channel = AbstractC10001b.m20722b(Integer.MAX_VALUE, null, null, 6, null);
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", m26211f = "Transformable.kt", m26212l = {196}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1 */
        public static final class C13631 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", m26211f = "Transformable.kt", m26212l = {175, Opcodes.GETSTATIC}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ TransformableNode this$0;

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", m26211f = "Transformable.kt", m26212l = {Opcodes.NEW}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C120691 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ Ref$ObjectRef<TransformEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C120691(Ref$ObjectRef<TransformEvent> ref$ObjectRef, TransformableNode transformableNode, InterfaceC11588c<? super C120691> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$event = ref$ObjectRef;
                        this.this$0 = transformableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        C120691 c120691 = new C120691(this.$event, this.this$0, interfaceC11588c);
                        c120691.L$0 = obj;
                        return c120691;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((C120691) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                        /*
                            r6 = this;
                            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            kotlin.AbstractC9924b.m20071b(r7)
                            goto L5d
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            kotlin.AbstractC9924b.m20071b(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                            r3 = r7
                        L27:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                            java.lang.Object r7 = r7.f23402c
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                            if (r1 != 0) goto L60
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                            if (r1 == 0) goto L36
                            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                            goto L37
                        L36:
                            r7 = 0
                        L37:
                            if (r7 == 0) goto L48
                            float r1 = r7.getZoomChange()
                            long r4 = r7.m27257getPanChangeF1C5BW0()
                            float r7 = r7.getRotationChange()
                            r3.mo27136transformByd4ec7I(r1, r4, r7)
                        L48:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                            androidx.compose.foundation.gestures.TransformableNode r7 = r6.this$0
                            kotlinx.coroutines.channels.a r7 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r7)
                            r6.L$0 = r3
                            r6.L$1 = r1
                            r6.label = r2
                            java.lang.Object r7 = r7.mo20630d(r6)
                            if (r7 != r0) goto L5d
                            return r0
                        L5d:
                            r1.f23402c = r7
                            goto L27
                        L60:
                            qc.q r7 = p309qc.C10786q.f26013a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.C13631.AnonymousClass1.C120691.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TransformableNode transformableNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
                
                    if (r10.transform(r1, r6, r9) == r0) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:13:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r9.L$0
                        sd.i0 r1 = (sd.InterfaceC11122i0) r1
                        kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.util.concurrent.CancellationException -> L15
                    L15:
                        r10 = r1
                        goto L36
                    L17:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1f:
                        java.lang.Object r1 = r9.L$2
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                        java.lang.Object r4 = r9.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                        java.lang.Object r5 = r9.L$0
                        sd.i0 r5 = (sd.InterfaceC11122i0) r5
                        kotlin.AbstractC9924b.m20071b(r10)
                        goto L59
                    L2f:
                        kotlin.AbstractC9924b.m20071b(r10)
                        java.lang.Object r10 = r9.L$0
                        sd.i0 r10 = (sd.InterfaceC11122i0) r10
                    L36:
                        boolean r1 = kotlinx.coroutines.AbstractC10006d.m20749f(r10)
                        if (r1 == 0) goto L82
                        kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                        r1.<init>()
                        androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                        kotlinx.coroutines.channels.a r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                        r9.L$0 = r10
                        r9.L$1 = r1
                        r9.L$2 = r1
                        r9.label = r3
                        java.lang.Object r4 = r4.mo20630d(r9)
                        if (r4 != r0) goto L56
                        goto L7f
                    L56:
                        r5 = r10
                        r10 = r4
                        r4 = r1
                    L59:
                        r1.f23402c = r10
                        java.lang.Object r10 = r4.f23402c
                        boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                        if (r10 == 0) goto L80
                        androidx.compose.foundation.gestures.TransformableNode r10 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.gestures.TransformableState r10 = androidx.compose.foundation.gestures.TransformableNode.access$getState$p(r10)     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r6 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L80
                        androidx.compose.foundation.gestures.TransformableNode r7 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L80
                        r8 = 0
                        r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L80
                        r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L80
                        java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L80
                        if (r10 != r0) goto L80
                    L7f:
                        return r0
                    L80:
                        r10 = r5
                        goto L36
                    L82:
                        qc.q r10 = p309qc.C10786q.f26013a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.C13631.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", m26211f = "Transformable.kt", m26212l = {Opcodes.IFNULL}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(TransformableNode transformableNode, InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = transformableNode;
                    this.$$this$coroutineScope = interfaceC11122i0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, interfaceC11588c);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    try {
                        try {
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                boolean z10 = this.this$0.lockRotationOnZoomPan;
                                InterfaceC10000a interfaceC10000a = this.this$0.channel;
                                InterfaceC9540l interfaceC9540l = this.this$0.updatedCanPan;
                                this.label = 1;
                                if (TransformableKt.detectZoom(awaitPointerEventScope, z10, interfaceC10000a, interfaceC9540l, this) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                        } catch (CancellationException e10) {
                            if (!AbstractC10006d.m20749f(this.$$this$coroutineScope)) {
                                throw e10;
                            }
                        }
                        return C10786q.f26013a;
                    } finally {
                        this.this$0.channel.mo33808trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13631(PointerInputScope pointerInputScope, TransformableNode transformableNode, InterfaceC11588c<? super C13631> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                C13631 c13631 = new C13631(this.$this_SuspendingPointerInputModifierNode, this.this$0, interfaceC11588c);
                c13631.L$0 = obj;
                return c13631;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new AnonymousClass1(this.this$0, null), 1, null);
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC11122i0, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((C13631) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            if (!this.this$0.enabled) {
                return C10786q.f26013a;
            }
            Object objM20748e = AbstractC10006d.m20748e(new C13631(pointerInputScope, this.this$0, null), interfaceC11588c);
            return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
        }
    }));

    public TransformableNode(TransformableState transformableState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        this.state = transformableState;
        this.canPan = interfaceC9540l;
        this.lockRotationOnZoomPan = z10;
        this.enabled = z11;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (!PointerType.m32175equalsimpl0(changes.get(i10).m32107getTypeT8wyACA(), PointerType.Companion.m32180getMouseT8wyACA())) {
                    i10++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    this.pointerInputModifierMouse = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objDetectZoomByCtrlMouseScroll = TransformableKt.detectZoomByCtrlMouseScroll(pointerInputScope, this.this$0.channel, scrollConfig, interfaceC11588c);
                            return objDetectZoomByCtrlMouseScroll == AbstractC11725a.m25952f() ? objDetectZoomByCtrlMouseScroll : C10786q.f26013a;
                        }
                    }));
                }
            }
        }
        this.pointerInputNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        }
    }

    public final void update(TransformableState transformableState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        this.canPan = interfaceC9540l;
        if (AbstractC9979u.m20289b(this.state, transformableState) && this.enabled == z11 && this.lockRotationOnZoomPan == z10) {
            return;
        }
        this.state = transformableState;
        this.enabled = z11;
        this.lockRotationOnZoomPan = z10;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
