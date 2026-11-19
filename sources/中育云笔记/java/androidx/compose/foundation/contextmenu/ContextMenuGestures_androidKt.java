package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ContextMenuGestures_androidKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", m26211f = "ContextMenuGestures.android.kt", m26212l = {PatchStatus.CODE_LOAD_UNDEFINED}, m26213m = "awaitFirstRightClickDown")
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 */
    public static final class C12371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12371(InterfaceC11588c<? super C12371> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenuGestures_androidKt.awaitFirstRightClickDown(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", m26211f = "ContextMenuGestures.android.kt", m26212l = {Opcodes.ASTORE, 61}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2 */
    public static final class C12402 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $onDown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12402(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C12402> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$onDown = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12402 c12402 = new C12402(this.$onDown, interfaceC11588c);
            c12402.L$0 = obj;
            return c12402;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12402) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r8)
                goto L35
            L22:
                kotlin.AbstractC9924b.m20071b(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.access$awaitFirstRightClickDown(r1, r7)
                if (r8 != r0) goto L35
                goto L52
            L35:
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
                r8.consume()
                hd.l r4 = r7.$onDown
                long r5 = r8.m32104getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r5)
                r4.invoke(r8)
                r8 = 0
                r7.L$0 = r8
                r7.label = r2
                java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
                if (r8 == 0) goto L5a
                r8.consume()
            L5a:
                qc.q r8 = p309qc.C10786q.f26013a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C12402.invokeSuspend(java.lang.Object):java.lang.Object");
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
    public static final java.lang.Object awaitFirstRightClickDown(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C12371
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C12371) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9924b.m20071b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.AbstractC9924b.m20071b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p014ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p014ui.input.pointer.PointerEvent) r9
            int r2 = r9.m32044getButtonsry648PA()
            boolean r2 = androidx.compose.p014ui.input.pointer.PointerEvent_androidKt.m32079isSecondaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L6f
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r7
            boolean r7 = androidx.compose.p014ui.input.pointer.PointerEventKt.changedToDown(r7)
            if (r7 != 0) goto L6c
            goto L38
        L6c:
            int r6 = r6 + 1
            goto L5d
        L6f:
            java.util.List r8 = r9.getChanges()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, vc.c):java.lang.Object");
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final ContextMenuState contextMenuState) {
        return contextMenuGestures(modifier, new InterfaceC9540l() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.contextMenuGestures.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27066invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27066invokek4lQ0M(long j10) {
                contextMenuState.setStatus(new ContextMenuState.Status.Open(j10, null));
            }
        });
    }

    @VisibleForTesting
    public static final Object onRightClickDown(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12402(interfaceC9540l, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final InterfaceC9540l interfaceC9540l) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, ContextMenuKey.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.contextMenuGestures.2
            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objOnRightClickDown = ContextMenuGestures_androidKt.onRightClickDown(pointerInputScope, interfaceC9540l, interfaceC11588c);
                return objOnRightClickDown == AbstractC11725a.m25952f() ? objOnRightClickDown : C10786q.f26013a;
            }
        });
    }
}
