package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableKt", m17801f = "Transformable.kt", m17802l = {312}, m17803m = "awaitCtrlMouseScrollOrNull")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 */
    public static final class C13281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13281(InterfaceC9324c<? super C13281> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.awaitCtrlMouseScrollOrNull(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableKt", m17801f = "Transformable.kt", m17802l = {299}, m17803m = "awaitFirstCtrlMouseScroll")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 */
    public static final class C13291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13291(InterfaceC9324c<? super C13291> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.awaitFirstCtrlMouseScroll(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableKt", m17801f = "Transformable.kt", m17802l = {337, 339, 385}, m17803m = "detectZoom")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    public static final class C13301 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13301(InterfaceC9324c<? super C13301> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", m17801f = "Transformable.kt", m17802l = {272, 284}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2 */
    public static final class C13312 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9158a $channel;
        final /* synthetic */ InterfaceC9100d $currentContext;
        final /* synthetic */ ScrollConfig $scrollConfig;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13312(InterfaceC9100d interfaceC9100d, ScrollConfig scrollConfig, InterfaceC9158a interfaceC9158a, InterfaceC9324c<? super C13312> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$currentContext = interfaceC9100d;
            this.$scrollConfig = scrollConfig;
            this.$channel = interfaceC9158a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13312 c13312 = new C13312(this.$currentContext, this.$scrollConfig, this.$channel, interfaceC9324c);
            c13312.L$0 = obj;
            return c13312;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13312) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:26:0x008c, B:28:0x0090, B:23:0x0055, B:19:0x003b, B:22:0x0048, B:14:0x0027), top: B:35:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:26:0x008c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.lang.Throwable -> L17
                goto L8c
            L17:
                r0 = move-exception
                r13 = r0
                goto L9d
            L1b:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L23:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.lang.Throwable -> L17
                goto L48
            L2b:
                kotlin.AbstractC9079b.m15926b(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r13
                r1 = r13
            L33:
                kotlin.coroutines.d r13 = r12.$currentContext
                boolean r13 = p135i8.AbstractC8823b1.m14819o(r13)
                if (r13 == 0) goto La5
                androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L17
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L17
                r12.label = r3     // Catch: java.lang.Throwable -> L17
                java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitFirstCtrlMouseScroll(r1, r13, r12)     // Catch: java.lang.Throwable -> L17
                if (r13 != r0) goto L48
                goto L8b
            L48:
                androidx.compose.ui.geometry.Offset r13 = (androidx.compose.p013ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L17
                long r4 = r13.m24045unboximpl()     // Catch: java.lang.Throwable -> L17
                kotlinx.coroutines.channels.a r13 = r12.$channel     // Catch: java.lang.Throwable -> L17
                androidx.compose.foundation.gestures.TransformEvent$TransformStarted r6 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE     // Catch: java.lang.Throwable -> L17
                r13.mo27213trySendJP2dKIU(r6)     // Catch: java.lang.Throwable -> L17
            L55:
                r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r4 = r4 & r6
                int r13 = (int) r4     // Catch: java.lang.Throwable -> L17
                float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch: java.lang.Throwable -> L17
                r4 = 1141391360(0x44084000, float:545.0)
                float r13 = r13 / r4
                r4 = 1073741824(0x40000000, float:2.0)
                double r4 = (double) r4     // Catch: java.lang.Throwable -> L17
                double r6 = (double) r13     // Catch: java.lang.Throwable -> L17
                double r4 = java.lang.Math.pow(r4, r6)     // Catch: java.lang.Throwable -> L17
                float r7 = (float) r4     // Catch: java.lang.Throwable -> L17
                kotlinx.coroutines.channels.a r13 = r12.$channel     // Catch: java.lang.Throwable -> L17
                androidx.compose.foundation.gestures.TransformEvent$TransformDelta r6 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta     // Catch: java.lang.Throwable -> L17
                androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p013ui.geometry.Offset.Companion     // Catch: java.lang.Throwable -> L17
                long r8 = r4.m24051getZeroF1C5BW0()     // Catch: java.lang.Throwable -> L17
                r10 = 0
                r11 = 0
                r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L17
                r13.mo27213trySendJP2dKIU(r6)     // Catch: java.lang.Throwable -> L17
                androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L17
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L17
                r12.label = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitCtrlMouseScrollOrNull(r1, r13, r12)     // Catch: java.lang.Throwable -> L17
                if (r13 != r0) goto L8c
            L8b:
                return r0
            L8c:
                androidx.compose.ui.geometry.Offset r13 = (androidx.compose.p013ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L17
                if (r13 == 0) goto L95
                long r4 = r13.m24045unboximpl()     // Catch: java.lang.Throwable -> L17
                goto L55
            L95:
                kotlinx.coroutines.channels.a r13 = r12.$channel
                androidx.compose.foundation.gestures.TransformEvent$TransformStopped r4 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
                r13.mo27213trySendJP2dKIU(r4)
                goto L33
            L9d:
                kotlinx.coroutines.channels.a r0 = r12.$channel
                androidx.compose.foundation.gestures.TransformEvent$TransformStopped r1 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
                r0.mo27213trySendJP2dKIU(r1)
                throw r13
            La5:
                h7.p r13 = p123h7.C8736p.f16368a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.C13312.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitCtrlMouseScrollOrNull(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.geometry.Offset> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt.C13281
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt.C13281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.gestures.ScrollConfig r6 = (androidx.compose.foundation.gestures.ScrollConfig) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = androidx.compose.p013ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r3, r0, r4, r3)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.p013ui.input.pointer.PointerEvent) r7
            int r0 = r7.m25443getKeyboardModifiersk7X9c1A()
            boolean r0 = androidx.compose.p013ui.input.pointer.PointerEvent_androidKt.m25469isCtrlPressed5xRPYO0(r0)
            if (r0 == 0) goto L99
            int r0 = r7.m25444getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r1 = androidx.compose.p013ui.input.pointer.PointerEventType.Companion
            int r1 = r1.m25460getScroll7fucELk()
            boolean r0 = androidx.compose.p013ui.input.pointer.PointerEventType.m25451equalsimpl0(r0, r1)
            if (r0 != 0) goto L68
            goto L99
        L68:
            long r0 = r5.mo25410getSizeYbymL2g()
            long r5 = r6.mo20519calculateMouseWheelScroll8xgXZGE(r5, r7, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p013ui.geometry.Offset.Companion
            long r0 = r0.m24051getZeroF1C5BW0()
            boolean r0 = androidx.compose.p013ui.geometry.Offset.m24032equalsimpl0(r5, r0)
            if (r0 == 0) goto L7d
            return r3
        L7d:
            java.util.List r7 = r7.getChanges()
            int r0 = r7.size()
            r1 = 0
        L86:
            if (r1 >= r0) goto L94
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r2
            r2.consume()
            int r1 = r1 + 1
            goto L86
        L94:
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r5)
            return r5
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitCtrlMouseScrollOrNull(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, m7.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstCtrlMouseScroll(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt.C13291
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt.C13291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.AbstractC9079b.m15926b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L4c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.AbstractC9079b.m15926b(r7)
        L3f:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = awaitCtrlMouseScrollOrNull(r5, r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.p013ui.geometry.Offset) r7
            if (r7 == 0) goto L3f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b2, code lost:
    
        if (r6 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b4, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9 A[EDGE_INSN: B:103:0x02b9->B:92:0x02b9 BREAK  A[LOOP:0: B:86:0x02a4->B:91:0x02b6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0288 -> B:85:0x0297). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r30, boolean r31, kotlinx.coroutines.channels.InterfaceC9158a r32, p300x7.InterfaceC10570l r33, p179m7.InterfaceC9324c<? super p123h7.C8736p> r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.channels.a, x7.l, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectZoomByCtrlMouseScroll(PointerInputScope pointerInputScope, InterfaceC9158a interfaceC9158a, ScrollConfig scrollConfig, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C13312(interfaceC9324c.getContext(), scrollConfig, interfaceC9158a, null), interfaceC9324c);
        return objAwaitPointerEventScope == AbstractC9434a.m17291f() ? objAwaitPointerEventScope : C8736p.f16368a;
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z10, boolean z11) {
        return transformable(modifier, transformableState, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m20659invokek4lQ0M(((Offset) obj).m24045unboximpl());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m20659invokek4lQ0M(long j10) {
                return Boolean.TRUE;
            }
        }, z10, z11);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return transformable(modifier, transformableState, z10, z11);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11) {
        return modifier.then(new TransformableElement(transformableState, interfaceC10570l, z10, z11));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return transformable(modifier, transformableState, interfaceC10570l, z10, z11);
    }
}
