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
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(m13557d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J2\u0010\"\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m13558d2 = {"Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "lockRotationOnZoomPan", "enabled", "(Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "pointerInputModifierMouse", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "updatedCanPan", "onAttach", "", "onCancelPointerInput", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "update", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n102#2,2:400\n34#2,6:402\n104#2:408\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n*L\n238#1:400,2\n238#1:402,6\n238#1:408\n*E\n"})
/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private Function1<? super Offset, Boolean> canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private PointerInputModifierNode pointerInputModifierMouse;
    private ScrollConfig scrollConfig;
    private TransformableState state;
    private final Function1<Offset, Boolean> updatedCanPan = new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
            return m17485invokek4lQ0M(offset.m20745unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final Boolean m17485invokek4lQ0M(long j10) {
            return (Boolean) this.this$0.canPan.invoke(Offset.m20724boximpl(j10));
        }
    };
    private final Channel<TransformEvent> channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", m13596f = "Transformable.kt", m13597i = {}, m13598l = {196}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1 */
        public static final class C13041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", m13596f = "Transformable.kt", m13597i = {0, 0, 1}, m13598l = {175, 178}, m13599m = "invokeSuspend", m13600n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch"}, m13601s = {"L$0", "L$1", "L$0"})
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ TransformableNode this$0;

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", m13596f = "Transformable.kt", m13597i = {0}, m13598l = {187}, m13599m = "invokeSuspend", m13600n = {"$this$transform"}, m13601s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C101031 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C101031(Ref.ObjectRef<TransformEvent> objectRef, TransformableNode transformableNode, Continuation<? super C101031> continuation) {
                        super(2, continuation);
                        this.$event = objectRef;
                        this.this$0 = transformableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C101031 c101031 = new C101031(this.$event, this.this$0, continuation);
                        c101031.L$0 = obj;
                        return c101031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
                        return ((C101031) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            kotlin.ResultKt.throwOnFailure(r7)
                            goto L5d
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            kotlin.ResultKt.throwOnFailure(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                            r3 = r7
                        L27:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                            T r7 = r7.element
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
                            long r4 = r7.getPanChange()
                            float r7 = r7.getRotationChange()
                            r3.mo17368transformByd4ec7I(r1, r4, r7)
                        L48:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                            androidx.compose.foundation.gestures.TransformableNode r7 = r6.this$0
                            kotlinx.coroutines.channels.Channel r7 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r7)
                            r6.L$0 = r3
                            r6.L$1 = r1
                            r6.label = r2
                            java.lang.Object r7 = r7.receive(r6)
                            if (r7 != r0) goto L5d
                            return r0
                        L5d:
                            r1.element = r7
                            goto L27
                        L60:
                            kotlin.Unit r7 = kotlin.Unit.INSTANCE
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.C13041.AnonymousClass1.C101031.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TransformableNode transformableNode, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
                
                    if (r10.transform(r1, r6, r9) == r0) goto L23;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:13:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r9.L$0
                        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                        kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L15
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
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r4 = r9.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                        java.lang.Object r5 = r9.L$0
                        kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L59
                    L2f:
                        kotlin.ResultKt.throwOnFailure(r10)
                        java.lang.Object r10 = r9.L$0
                        kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                    L36:
                        boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r10)
                        if (r1 == 0) goto L82
                        kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                        r1.<init>()
                        androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                        kotlinx.coroutines.channels.Channel r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                        r9.L$0 = r10
                        r9.L$1 = r1
                        r9.L$2 = r1
                        r9.label = r3
                        java.lang.Object r4 = r4.receive(r9)
                        if (r4 != r0) goto L56
                        goto L7f
                    L56:
                        r5 = r10
                        r10 = r4
                        r4 = r1
                    L59:
                        r1.element = r10
                        T r10 = r4.element
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
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.C13041.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", m13596f = "Transformable.kt", m13597i = {}, m13598l = {198}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(TransformableNode transformableNode, CoroutineScope coroutineScope, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = transformableNode;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    try {
                        try {
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                boolean z9 = this.this$0.lockRotationOnZoomPan;
                                Channel channel = this.this$0.channel;
                                Function1 function1 = this.this$0.updatedCanPan;
                                this.label = 1;
                                if (TransformableKt.detectZoom(awaitPointerEventScope, z9, channel, function1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                        } catch (CancellationException e10) {
                            if (!CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                throw e10;
                            }
                        }
                        return Unit.INSTANCE;
                    } finally {
                        this.this$0.channel.mo24070trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13041(PointerInputScope pointerInputScope, TransformableNode transformableNode, Continuation<? super C13041> continuation) {
                super(2, continuation);
                this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C13041 c13041 = new C13041(this.$this_SuspendingPointerInputModifierNode, this.this$0, continuation);
                c13041.L$0 = obj;
                return c13041;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.this$0, null), 1, null);
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, coroutineScope, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C13041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            if (!this.this$0.enabled) {
                return Unit.INSTANCE;
            }
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C13041(pointerInputScope, this.this$0, null), continuation);
            return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
        }
    }));

    public TransformableNode(TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z9, boolean z10) {
        this.state = transformableState;
        this.canPan = function1;
        this.lockRotationOnZoomPan = z9;
        this.enabled = z10;
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
    public void mo17160onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (!PointerType.m22270equalsimpl0(changes.get(i10).getType(), PointerType.INSTANCE.m22275getMouseT8wyACA())) {
                    i10++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    this.pointerInputModifierMouse = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object objDetectZoomByCtrlMouseScroll = TransformableKt.detectZoomByCtrlMouseScroll(pointerInputScope, this.this$0.channel, scrollConfig, continuation);
                            return objDetectZoomByCtrlMouseScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectZoomByCtrlMouseScroll : Unit.INSTANCE;
                        }
                    }));
                }
            }
        }
        this.pointerInputNode.mo17160onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.mo17160onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    public final void update(TransformableState state, Function1<? super Offset, Boolean> canPan, boolean lockRotationOnZoomPan, boolean enabled) {
        this.canPan = canPan;
        if (Intrinsics.areEqual(this.state, state) && this.enabled == enabled && this.lockRotationOnZoomPan == lockRotationOnZoomPan) {
            return;
        }
        this.state = state;
        this.enabled = enabled;
        this.lockRotationOnZoomPan = lockRotationOnZoomPan;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
