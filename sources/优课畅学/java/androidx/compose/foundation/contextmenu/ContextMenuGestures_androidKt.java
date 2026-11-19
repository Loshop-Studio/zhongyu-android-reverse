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
import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class ContextMenuGestures_androidKt {

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", m17801f = "ContextMenuGestures.android.kt", m17802l = {71}, m17803m = "awaitFirstRightClickDown")
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 */
    public static final class C12071 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12071(InterfaceC9324c<? super C12071> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenuGestures_androidKt.awaitFirstRightClickDown(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", m17801f = "ContextMenuGestures.android.kt", m17802l = {C3721BR.versionViewModel, 61}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2 */
    public static final class C12102 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $onDown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12102(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C12102> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$onDown = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12102 c12102 = new C12102(this.$onDown, interfaceC9324c);
            c12102.L$0 = obj;
            return c12102;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12102) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r8)
                goto L35
            L22:
                kotlin.AbstractC9079b.m15926b(r8)
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
                x7.l r4 = r7.$onDown
                long r5 = r8.m25502getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r5)
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
                h7.p r8 = p123h7.C8736p.f16368a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C12102.invokeSuspend(java.lang.Object):java.lang.Object");
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
    public static final java.lang.Object awaitFirstRightClickDown(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C12071
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.C12071) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9079b.m15926b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.AbstractC9079b.m15926b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p013ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p013ui.input.pointer.PointerEvent) r9
            int r2 = r9.m25442getButtonsry648PA()
            boolean r2 = androidx.compose.p013ui.input.pointer.PointerEvent_androidKt.m25477isSecondaryPressedaHzCxE(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, m7.c):java.lang.Object");
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final ContextMenuState contextMenuState) {
        return contextMenuGestures(modifier, new InterfaceC10570l() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.contextMenuGestures.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m20464invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m20464invokek4lQ0M(long j10) {
                contextMenuState.setStatus(new ContextMenuState.Status.Open(j10, null));
            }
        });
    }

    @VisibleForTesting
    public static final Object onRightClickDown(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12102(interfaceC10570l, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }

    public static final Modifier contextMenuGestures(Modifier modifier, final InterfaceC10570l interfaceC10570l) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, ContextMenuKey.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.contextMenuGestures.2
            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                Object objOnRightClickDown = ContextMenuGestures_androidKt.onRightClickDown(pointerInputScope, interfaceC10570l, interfaceC9324c);
                return objOnRightClickDown == AbstractC9434a.m17291f() ? objOnRightClickDown : C8736p.f16368a;
            }
        });
    }
}
