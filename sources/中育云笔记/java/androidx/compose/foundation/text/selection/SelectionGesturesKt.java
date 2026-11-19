package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.platform.ViewConfiguration;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m26211f = "SelectionGestures.kt", m26212l = {430}, m26213m = "awaitDown")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 */
    public static final class C19631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19631(InterfaceC11588c<? super C19631> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.awaitDown(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m26211f = "SelectionGestures.kt", m26212l = {Opcodes.IF_ICMPEQ, Opcodes.INVOKESPECIAL}, m26213m = "mouseSelection")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 */
    public static final class C19641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19641(InterfaceC11588c<? super C19641> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m26211f = "SelectionGestures.kt", m26212l = {357, 384}, m26213m = "mouseSelectionBtf2")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1 */
    public static final class C19651 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19651(InterfaceC11588c<? super C19651> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", m26211f = "SelectionGestures.kt", m26212l = {209, 217, 220, 221}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2 */
    public static final class C19672 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19672(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, InterfaceC11588c<? super C19672> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$clicksCounter = clicksCounter;
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C19672 c19672 = new C19672(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, interfaceC11588c);
            c19672.L$0 = obj;
            return c19672;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C19672) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(r1, r2, r3, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(r1, r2, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(r1, r3, r13, r12) == r0) goto L37;
         */
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
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.AbstractC9924b.m20071b(r13)
                goto La6
            L22:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r13)
                goto L3d
            L2a:
                kotlin.AbstractC9924b.m20071b(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                r12.L$0 = r1
                r12.label = r5
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r12)
                if (r13 != r0) goto L3d
                goto La5
            L3d:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p014ui.input.pointer.PointerEvent) r13
                androidx.compose.foundation.text.selection.ClicksCounter r6 = r12.$clicksCounter
                r6.update(r13)
                boolean r6 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r13)
                r7 = 0
                if (r6 == 0) goto L82
                int r8 = r13.m32044getButtonsry648PA()
                boolean r8 = androidx.compose.p014ui.input.pointer.PointerEvent_androidKt.m32077isPrimaryPressedaHzCxE(r8)
                if (r8 == 0) goto L82
                java.util.List r8 = r13.getChanges()
                r9 = r8
                java.util.Collection r9 = (java.util.Collection) r9
                int r9 = r9.size()
                r10 = 0
            L61:
                if (r10 >= r9) goto L73
                java.lang.Object r11 = r8.get(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11
                boolean r11 = r11.isConsumed()
                if (r11 == 0) goto L70
                goto L82
            L70:
                int r10 = r10 + 1
                goto L61
            L73:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.$mouseSelectionObserver
                androidx.compose.foundation.text.selection.ClicksCounter r3 = r12.$clicksCounter
                r12.L$0 = r7
                r12.label = r4
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelectionBtf2(r1, r2, r3, r13, r12)
                if (r13 != r0) goto La6
                goto La5
            L82:
                if (r6 != 0) goto La6
                androidx.compose.foundation.text.selection.ClicksCounter r4 = r12.$clicksCounter
                int r4 = r4.getClicks()
                if (r4 != r5) goto L99
                androidx.compose.foundation.text.TextDragObserver r2 = r12.$textDragObserver
                r12.L$0 = r7
                r12.label = r3
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionFirstPress(r1, r2, r13, r12)
                if (r13 != r0) goto La6
                goto La5
            L99:
                androidx.compose.foundation.text.TextDragObserver r3 = r12.$textDragObserver
                r12.L$0 = r7
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(r1, r3, r13, r12)
                if (r13 != r0) goto La6
            La5:
                return r0
            La6:
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C19672.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m26211f = "SelectionGestures.kt", m26212l = {Opcodes.IAND, 130}, m26213m = "touchSelection")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 */
    public static final class C19681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19681(InterfaceC11588c<? super C19681> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelection(null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m26211f = "SelectionGestures.kt", m26212l = {238, 242}, m26213m = "touchSelectionFirstPress")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 */
    public static final class C19701 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19701(InterfaceC11588c<? super C19701> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m26211f = "SelectionGestures.kt", m26212l = {281, 322}, m26213m = "touchSelectionSubsequentPress")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1 */
    public static final class C19721 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C19721(InterfaceC11588c<? super C19721> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionSubsequentPress(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDown(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r7, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerEvent> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C19631
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C19631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.AbstractC9924b.m20071b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.AbstractC9924b.m20071b(r8)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p014ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p014ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L53:
            if (r5 >= r4) goto L65
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.p014ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L62
            goto L38
        L62:
            int r5 = r5 + 1
            goto L53
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m30635getDistanceimpl(Offset.m30641minusMKHz9U(pointerInputChange.m32104getPositionF1C5BW0(), pointerInputChange2.m32104getPositionF1C5BW0())) < DragGestureDetectorKt.m27159pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.m32107getTypeT8wyACA());
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!PointerType.m32175equalsimpl0(changes.get(i10).m32107getTypeT8wyACA(), PointerType.Companion.m32180getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelection(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.p014ui.input.pointer.PointerEvent r11, vc.InterfaceC11588c<? super p309qc.C10786q> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008b, B:33:0x0093, B:35:0x00a4, B:37:0x00b0, B:28:0x0071), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x0114, B:56:0x011c, B:58:0x0120, B:60:0x0131, B:62:0x013d, B:50:0x00e5), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.p014ui.input.pointer.PointerEvent r11, vc.InterfaceC11588c<? super p309qc.C10786q> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, vc.c):java.lang.Object");
    }

    public static final Modifier selectionGestureInput(Modifier modifier, final MouseSelectionObserver mouseSelectionObserver, final TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", m26211f = "SelectionGestures.kt", m26212l = {PatchStatus.CODE_PRELOAD_OPT_MERGED, 113, 115}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ ClicksCounter $clicksCounter;
                final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
                final /* synthetic */ TextDragObserver $textDragObserver;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$mouseSelectionObserver = mouseSelectionObserver;
                    this.$clicksCounter = clicksCounter;
                    this.$textDragObserver = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(r1, r2, r4, r10, r9) == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(r1, r3, r10, r9) == r0) goto L32;
                 */
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
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1f
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        goto L1a
                    L12:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1a:
                        kotlin.AbstractC9924b.m20071b(r10)
                        goto L8d
                    L1f:
                        java.lang.Object r1 = r9.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC9924b.m20071b(r10)
                        goto L3a
                    L27:
                        kotlin.AbstractC9924b.m20071b(r10)
                        java.lang.Object r10 = r9.L$0
                        r1 = r10
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                        r9.L$0 = r1
                        r9.label = r4
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r9)
                        if (r10 != r0) goto L3a
                        goto L8c
                    L3a:
                        androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p014ui.input.pointer.PointerEvent) r10
                        boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        r5 = 0
                        if (r4 == 0) goto L7a
                        int r4 = r10.m32044getButtonsry648PA()
                        boolean r4 = androidx.compose.p014ui.input.pointer.PointerEvent_androidKt.m32077isPrimaryPressedaHzCxE(r4)
                        if (r4 == 0) goto L7a
                        java.util.List r4 = r10.getChanges()
                        r6 = r4
                        java.util.Collection r6 = (java.util.Collection) r6
                        int r6 = r6.size()
                        r7 = 0
                    L59:
                        if (r7 >= r6) goto L6b
                        java.lang.Object r8 = r4.get(r7)
                        androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
                        boolean r8 = r8.isConsumed()
                        if (r8 == 0) goto L68
                        goto L7a
                    L68:
                        int r7 = r7 + 1
                        goto L59
                    L6b:
                        androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.$mouseSelectionObserver
                        androidx.compose.foundation.text.selection.ClicksCounter r4 = r9.$clicksCounter
                        r9.L$0 = r5
                        r9.label = r3
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelection(r1, r2, r4, r10, r9)
                        if (r10 != r0) goto L8d
                        goto L8c
                    L7a:
                        boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        if (r3 != 0) goto L8d
                        androidx.compose.foundation.text.TextDragObserver r3 = r9.$textDragObserver
                        r9.L$0 = r5
                        r9.label = r2
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelection(r1, r3, r10, r9)
                        if (r10 != r0) goto L8d
                    L8c:
                        return r0
                    L8d:
                        qc.q r10 = p309qc.C10786q.f26013a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C19661.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), textDragObserver, null), interfaceC11588c);
                return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
            }
        });
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C19672(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelection(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.p014ui.input.pointer.PointerEvent r10, vc.InterfaceC11588c<? super p309qc.C10786q> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C19681
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C19681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld7
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.AbstractC9924b.m20071b(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = p325rc.AbstractC10947g0.m23944m0(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.m32102getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27146awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld4
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld4
            long r4 = r11.m32104getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.mo27890onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.m32102getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27156dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb9:
            if (r11 >= r10) goto Lcd
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = androidx.compose.p014ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lca
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L35
        Lca:
            int r11 = r11 + 1
            goto Lb9
        Lcd:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld4
        Ld1:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld4:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        Ld7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.p014ui.input.pointer.PointerEvent r10, vc.InterfaceC11588c<? super p309qc.C10786q> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C19701
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C19701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld7
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.AbstractC9924b.m20071b(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = p325rc.AbstractC10947g0.m23944m0(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.m32102getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27146awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld4
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld4
            long r4 = r11.m32104getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.mo27890onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.m32102getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27156dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb9:
            if (r11 >= r10) goto Lcd
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = androidx.compose.p014ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lca
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L35
        Lca:
            int r11 = r11 + 1
            goto Lb9
        Lcd:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld4
        Ld1:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld4:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        Ld7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionSubsequentPress(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r12, final androidx.compose.foundation.text.TextDragObserver r13, androidx.compose.p014ui.input.pointer.PointerEvent r14, vc.InterfaceC11588c<? super p309qc.C10786q> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, vc.c):java.lang.Object");
    }

    public static final Modifier updateSelectionTouchMode(Modifier modifier, final InterfaceC9540l interfaceC9540l) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m26211f = "SelectionGestures.kt", m26212l = {94}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC9540l $updateTouchMode;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$updateTouchMode = interfaceC9540l;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC9924b.m20071b(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.AbstractC9924b.m20071b(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p014ui.input.pointer.PointerEvent) r5
                        hd.l r3 = r4.$updateTouchMode
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = p409xc.AbstractC11826a.m26206a(r5)
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C19761.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(interfaceC9540l, null), interfaceC11588c);
                return objAwaitPointerEventScope == AbstractC11725a.m25952f() ? objAwaitPointerEventScope : C10786q.f26013a;
            }
        });
    }
}
