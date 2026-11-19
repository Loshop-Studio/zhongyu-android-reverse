package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@¢\u0006\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a&\u0010\f\u001a\u00020\t*\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0081@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m13558d2 = {"awaitFirstRightClickDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contextMenuGestures", "Landroidx/compose/ui/Modifier;", "onOpenGesture", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "onRightClickDown", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDown", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nContextMenuGestures.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,77:1\n87#2,2:78\n34#2,6:80\n89#2:86\n*S KotlinDebug\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n*L\n72#1:78,2\n72#1:80,6\n72#1:86\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuGestures_androidKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", m13596f = "ContextMenuGestures.android.kt", m13597i = {0}, m13598l = {71}, m13599m = "awaitFirstRightClickDown", m13600n = {"$this$awaitFirstRightClickDown"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 */
    public static final class C11781 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11781(Continuation<? super C11781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenuGestures_androidKt.awaitFirstRightClickDown(null, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", m13596f = "ContextMenuGestures.android.kt", m13597i = {0}, m13598l = {58, 61}, m13599m = "invokeSuspend", m13600n = {"$this$awaitEachGesture"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2 */
    public static final class C11812 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onDown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11812(Function1<? super Offset, Unit> function1, Continuation<? super C11812> continuation) {
            super(2, continuation);
            this.$onDown = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11812 c11812 = new C11812(this.$onDown, continuation);
            c11812.L$0 = obj;
            return c11812;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C11812) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L35
            L22:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.access$awaitFirstRightClickDown(r1, r7)
                if (r8 != r0) goto L35
                goto L52
            L35:
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                r8.consume()
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r4 = r7.$onDown
                long r5 = r8.getPosition()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m20724boximpl(r5)
                r4.invoke(r8)
                r8 = 0
                r7.L$0 = r8
                r7.label = r2
                java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                if (r8 == 0) goto L5a
                r8.consume()
            L5a:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C11812.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstRightClickDown(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.Continuation<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C11781
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C11781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 r0 = new androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p013ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p013ui.input.pointer.PointerEvent) r9
            int r2 = r9.getButtons()
            boolean r2 = androidx.compose.p013ui.input.pointer.PointerEvent_androidKt.m22174isSecondaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r7
            boolean r7 = androidx.compose.p013ui.input.pointer.PointerEventKt.changedToDown(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.getChanges()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final ContextMenuState contextMenuState) {
        return contextMenuGestures(modifier, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.contextMenuGestures.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m17300invokek4lQ0M(offset.m20745unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m17300invokek4lQ0M(long j10) {
                contextMenuState.setStatus(new ContextMenuState.Status.Open(j10, null));
            }
        });
    }

    @VisibleForTesting
    public static final Object onRightClickDown(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C11812(function1, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final Function1<? super Offset, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, ContextMenuKey.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.contextMenuGestures.2
            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objOnRightClickDown = ContextMenuGestures_androidKt.onRightClickDown(pointerInputScope, function1, continuation);
                return objOnRightClickDown == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnRightClickDown : Unit.INSTANCE;
            }
        });
    }
}
