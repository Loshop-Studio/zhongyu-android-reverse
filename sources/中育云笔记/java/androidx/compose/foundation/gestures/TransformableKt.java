package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableKt", m26211f = "Transformable.kt", m26212l = {312}, m26213m = "awaitCtrlMouseScrollOrNull")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 */
    public static final class C13581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13581(InterfaceC11588c<? super C13581> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.awaitCtrlMouseScrollOrNull(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableKt", m26211f = "Transformable.kt", m26212l = {299}, m26213m = "awaitFirstCtrlMouseScroll")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 */
    public static final class C13591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13591(InterfaceC11588c<? super C13591> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.awaitFirstCtrlMouseScroll(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableKt", m26211f = "Transformable.kt", m26212l = {337, 339, 385}, m26213m = "detectZoom")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    public static final class C13601 extends ContinuationImpl {
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

        public C13601(InterfaceC11588c<? super C13601> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", m26211f = "Transformable.kt", m26212l = {272, 284}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2 */
    public static final class C13612 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC10000a $channel;
        final /* synthetic */ InterfaceC9945d $currentContext;
        final /* synthetic */ ScrollConfig $scrollConfig;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13612(InterfaceC9945d interfaceC9945d, ScrollConfig scrollConfig, InterfaceC10000a interfaceC10000a, InterfaceC11588c<? super C13612> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$currentContext = interfaceC9945d;
            this.$scrollConfig = scrollConfig;
            this.$channel = interfaceC10000a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13612 c13612 = new C13612(this.$currentContext, this.$scrollConfig, this.$channel, interfaceC11588c);
            c13612.L$0 = obj;
            return c13612;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13612) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
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
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.lang.Throwable -> L17
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
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.lang.Throwable -> L17
                goto L48
            L2b:
                kotlin.AbstractC9924b.m20071b(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r13
                r1 = r13
            L33:
                kotlin.coroutines.d r13 = r12.$currentContext
                boolean r13 = sd.AbstractC11147o1.m24780n(r13)
                if (r13 == 0) goto La5
                androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L17
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L17
                r12.label = r3     // Catch: java.lang.Throwable -> L17
                java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitFirstCtrlMouseScroll(r1, r13, r12)     // Catch: java.lang.Throwable -> L17
                if (r13 != r0) goto L48
                goto L8b
            L48:
                androidx.compose.ui.geometry.Offset r13 = (androidx.compose.p014ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L17
                long r4 = r13.m30647unboximpl()     // Catch: java.lang.Throwable -> L17
                kotlinx.coroutines.channels.a r13 = r12.$channel     // Catch: java.lang.Throwable -> L17
                androidx.compose.foundation.gestures.TransformEvent$TransformStarted r6 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE     // Catch: java.lang.Throwable -> L17
                r13.mo33808trySendJP2dKIU(r6)     // Catch: java.lang.Throwable -> L17
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
                androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p014ui.geometry.Offset.Companion     // Catch: java.lang.Throwable -> L17
                long r8 = r4.m30653getZeroF1C5BW0()     // Catch: java.lang.Throwable -> L17
                r10 = 0
                r11 = 0
                r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L17
                r13.mo33808trySendJP2dKIU(r6)     // Catch: java.lang.Throwable -> L17
                androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L17
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L17
                r12.label = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitCtrlMouseScrollOrNull(r1, r13, r12)     // Catch: java.lang.Throwable -> L17
                if (r13 != r0) goto L8c
            L8b:
                return r0
            L8c:
                androidx.compose.ui.geometry.Offset r13 = (androidx.compose.p014ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L17
                if (r13 == 0) goto L95
                long r4 = r13.m30647unboximpl()     // Catch: java.lang.Throwable -> L17
                goto L55
            L95:
                kotlinx.coroutines.channels.a r13 = r12.$channel
                androidx.compose.foundation.gestures.TransformEvent$TransformStopped r4 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
                r13.mo33808trySendJP2dKIU(r4)
                goto L33
            L9d:
                kotlinx.coroutines.channels.a r0 = r12.$channel
                androidx.compose.foundation.gestures.TransformEvent$TransformStopped r1 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
                r0.mo33808trySendJP2dKIU(r1)
                throw r13
            La5:
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.C13612.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitCtrlMouseScrollOrNull(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, vc.InterfaceC11588c<? super androidx.compose.p014ui.geometry.Offset> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt.C13581
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt.C13581) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.gestures.ScrollConfig r6 = (androidx.compose.foundation.gestures.ScrollConfig) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.AbstractC9924b.m20071b(r7)
            goto L4b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.AbstractC9924b.m20071b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = androidx.compose.p014ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r3, r0, r4, r3)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.p014ui.input.pointer.PointerEvent) r7
            int r0 = r7.m32045getKeyboardModifiersk7X9c1A()
            boolean r0 = androidx.compose.p014ui.input.pointer.PointerEvent_androidKt.m32071isCtrlPressed5xRPYO0(r0)
            if (r0 == 0) goto L9c
            int r0 = r7.m32046getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r1 = androidx.compose.p014ui.input.pointer.PointerEventType.Companion
            int r1 = r1.m32062getScroll7fucELk()
            boolean r0 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r0, r1)
            if (r0 != 0) goto L68
            goto L9c
        L68:
            long r0 = r5.mo32012getSizeYbymL2g()
            long r5 = r6.mo27121calculateMouseWheelScroll8xgXZGE(r5, r7, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p014ui.geometry.Offset.Companion
            long r0 = r0.m30653getZeroF1C5BW0()
            boolean r0 = androidx.compose.p014ui.geometry.Offset.m30634equalsimpl0(r5, r0)
            if (r0 == 0) goto L7d
            return r3
        L7d:
            java.util.List r7 = r7.getChanges()
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L89:
            if (r1 >= r0) goto L97
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r2
            r2.consume()
            int r1 = r1 + 1
            goto L89
        L97:
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r5)
            return r5
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitCtrlMouseScrollOrNull(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, vc.c):java.lang.Object");
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
    public static final java.lang.Object awaitFirstCtrlMouseScroll(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, vc.InterfaceC11588c<? super androidx.compose.p014ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt.C13591
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt.C13591) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.AbstractC9924b.m20071b(r7)
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
            kotlin.AbstractC9924b.m20071b(r7)
        L3f:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = awaitCtrlMouseScrollOrNull(r5, r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.p014ui.geometry.Offset) r7
            if (r7 == 0) goto L3f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c0, code lost:
    
        if (r6 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c7 A[EDGE_INSN: B:103:0x02c7->B:92:0x02c7 BREAK  A[LOOP:0: B:86:0x02b2->B:91:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0294 -> B:85:0x02a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r29, boolean r30, kotlinx.coroutines.channels.InterfaceC10000a r31, p181hd.InterfaceC9540l r32, vc.InterfaceC11588c<? super p309qc.C10786q> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.channels.a, hd.l, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectZoomByCtrlMouseScroll(PointerInputScope pointerInputScope, InterfaceC10000a interfaceC10000a, ScrollConfig scrollConfig, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C13612(interfaceC11588c.getContext(), scrollConfig, interfaceC10000a, null), interfaceC11588c);
        return objAwaitPointerEventScope == AbstractC11725a.m25952f() ? objAwaitPointerEventScope : C10786q.f26013a;
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z10, boolean z11) {
        return transformable(modifier, transformableState, new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m27261invokek4lQ0M(((Offset) obj).m30647unboximpl());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m27261invokek4lQ0M(long j10) {
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

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        return modifier.then(new TransformableElement(transformableState, interfaceC9540l, z10, z11));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return transformable(modifier, transformableState, interfaceC9540l, z10, z11);
    }
}
