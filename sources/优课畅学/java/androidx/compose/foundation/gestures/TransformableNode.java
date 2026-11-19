package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.PointerType;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private InterfaceC10570l canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private PointerInputModifierNode pointerInputModifierMouse;
    private ScrollConfig scrollConfig;
    private TransformableState state;
    private final InterfaceC10570l updatedCanPan = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m20660invokek4lQ0M(((Offset) obj).m24045unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final Boolean m20660invokek4lQ0M(long j10) {
            return (Boolean) this.this$0.canPan.invoke(Offset.m24024boximpl(j10));
        }
    };
    private final InterfaceC9158a channel = AbstractC9159b.m16529b(Integer.MAX_VALUE, null, null, 6, null);
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", m17801f = "Transformable.kt", m17802l = {196}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1 */
        public static final class C13331 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", m17801f = "Transformable.kt", m17802l = {175, 178}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ TransformableNode this$0;

                @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", m17801f = "Transformable.kt", m17802l = {187}, m17803m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C107611 extends SuspendLambda implements InterfaceC10574p {
                    final /* synthetic */ Ref$ObjectRef<TransformEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C107611(Ref$ObjectRef<TransformEvent> ref$ObjectRef, TransformableNode transformableNode, InterfaceC9324c<? super C107611> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.$event = ref$ObjectRef;
                        this.this$0 = transformableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        C107611 c107611 = new C107611(this.$event, this.this$0, interfaceC9324c);
                        c107611.L$0 = obj;
                        return c107611;
                    }

                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        return ((C107611) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            kotlin.AbstractC9079b.m15926b(r7)
                            goto L5d
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            kotlin.AbstractC9079b.m15926b(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                            r3 = r7
                        L27:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                            java.lang.Object r7 = r7.f17473a
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
                            long r4 = r7.m20655getPanChangeF1C5BW0()
                            float r7 = r7.getRotationChange()
                            r3.mo20534transformByd4ec7I(r1, r4, r7)
                        L48:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                            androidx.compose.foundation.gestures.TransformableNode r7 = r6.this$0
                            kotlinx.coroutines.channels.a r7 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r7)
                            r6.L$0 = r3
                            r6.L$1 = r1
                            r6.label = r2
                            java.lang.Object r7 = r7.mo15876f(r6)
                            if (r7 != r0) goto L5d
                            return r0
                        L5d:
                            r1.f17473a = r7
                            goto L27
                        L60:
                            h7.p r7 = p123h7.C8736p.f16368a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.C13331.AnonymousClass1.C107611.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TransformableNode transformableNode, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC9324c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                        java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r9.L$0
                        i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                        kotlin.AbstractC9079b.m15926b(r10)     // Catch: java.util.concurrent.CancellationException -> L15
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
                        i8.b0 r5 = (p135i8.InterfaceC8822b0) r5
                        kotlin.AbstractC9079b.m15926b(r10)
                        goto L59
                    L2f:
                        kotlin.AbstractC9079b.m15926b(r10)
                        java.lang.Object r10 = r9.L$0
                        i8.b0 r10 = (p135i8.InterfaceC8822b0) r10
                    L36:
                        boolean r1 = kotlinx.coroutines.AbstractC9165e.m16558g(r10)
                        if (r1 == 0) goto L82
                        kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                        r1.<init>()
                        androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                        kotlinx.coroutines.channels.a r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                        r9.L$0 = r10
                        r9.L$1 = r1
                        r9.L$2 = r1
                        r9.label = r3
                        java.lang.Object r4 = r4.mo15876f(r9)
                        if (r4 != r0) goto L56
                        goto L7f
                    L56:
                        r5 = r10
                        r10 = r4
                        r4 = r1
                    L59:
                        r1.f17473a = r10
                        java.lang.Object r10 = r4.f17473a
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
                        h7.p r10 = p123h7.C8736p.f16368a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.C13331.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", m17801f = "Transformable.kt", m17802l = {198}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends RestrictedSuspendLambda implements InterfaceC10574p {
                final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(TransformableNode transformableNode, InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = transformableNode;
                    this.$$this$coroutineScope = interfaceC8822b0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, interfaceC9324c);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    try {
                        try {
                            if (i10 == 0) {
                                AbstractC9079b.m15926b(obj);
                                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                boolean z10 = this.this$0.lockRotationOnZoomPan;
                                InterfaceC9158a interfaceC9158a = this.this$0.channel;
                                InterfaceC10570l interfaceC10570l = this.this$0.updatedCanPan;
                                this.label = 1;
                                if (TransformableKt.detectZoom(awaitPointerEventScope, z10, interfaceC9158a, interfaceC10570l, this) == objM17291f) {
                                    return objM17291f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9079b.m15926b(obj);
                            }
                        } catch (CancellationException e10) {
                            if (!AbstractC9165e.m16558g(this.$$this$coroutineScope)) {
                                throw e10;
                            }
                        }
                        return C8736p.f16368a;
                    } finally {
                        this.this$0.channel.mo27213trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13331(PointerInputScope pointerInputScope, TransformableNode transformableNode, InterfaceC9324c<? super C13331> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                C13331 c13331 = new C13331(this.$this_SuspendingPointerInputModifierNode, this.this$0, interfaceC9324c);
                c13331.L$0 = obj;
                return c13331;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((C13331) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                    AbstractC8839h.m14861d(interfaceC8822b0, null, CoroutineStart.f17555d, new AnonymousClass1(this.this$0, null), 1, null);
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC8822b0, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            if (!this.this$0.enabled) {
                return C8736p.f16368a;
            }
            Object objM16556e = AbstractC9165e.m16556e(new C13331(pointerInputScope, this.this$0, null), interfaceC9324c);
            return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
        }
    }));

    public TransformableNode(TransformableState transformableState, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11) {
        this.state = transformableState;
        this.canPan = interfaceC10570l;
        this.lockRotationOnZoomPan = z10;
        this.enabled = z11;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (!PointerType.m25573equalsimpl0(changes.get(i10).m25505getTypeT8wyACA(), PointerType.Companion.m25578getMouseT8wyACA())) {
                    i10++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    this.pointerInputModifierMouse = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            Object objDetectZoomByCtrlMouseScroll = TransformableKt.detectZoomByCtrlMouseScroll(pointerInputScope, this.this$0.channel, scrollConfig, interfaceC9324c);
                            return objDetectZoomByCtrlMouseScroll == AbstractC9434a.m17291f() ? objDetectZoomByCtrlMouseScroll : C8736p.f16368a;
                        }
                    }));
                }
            }
        }
        this.pointerInputNode.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
        }
    }

    public final void update(TransformableState transformableState, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11) {
        this.canPan = interfaceC10570l;
        if (AbstractC9133u.m16128b(this.state, transformableState) && this.enabled == z11 && this.lockRotationOnZoomPan == z10) {
            return;
        }
        this.state = transformableState;
        this.enabled = z11;
        this.lockRotationOnZoomPan = z10;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
