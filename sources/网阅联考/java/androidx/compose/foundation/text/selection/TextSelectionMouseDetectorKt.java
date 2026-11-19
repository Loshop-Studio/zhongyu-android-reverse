package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m5175d2 = {"ClicksSlop", "", "awaitMouseEventDown", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionDetector", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextSelectionMouseDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n86#2,2:135\n33#2,6:137\n88#2:143\n*S KotlinDebug\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n*L\n128#1:135,2\n128#1:137,6\n128#1:143\n*E\n"})
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt {
    public static final double ClicksSlop = 100.0d;

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", m5192f = "TextSelectionMouseDetector.kt", m5193i = {0}, m5194l = {125}, m5195m = "awaitMouseEventDown", m5196n = {"$this$awaitMouseEventDown"}, m5197s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 */
    public static final class C09091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09091(Continuation<? super C09091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextSelectionMouseDetectorKt.awaitMouseEventDown(null, this);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", m5192f = "TextSelectionMouseDetector.kt", m5193i = {0, 0, 1, 1, 2, 2}, m5194l = {89, 96, UMErrorCode.E_UM_BE_CREATE_FAILED}, m5195m = "invokeSuspend", m5196n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, m5197s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2 */
    public static final class C09102 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MouseSelectionObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09102(MouseSelectionObserver mouseSelectionObserver, Continuation<? super C09102> continuation) {
            super(2, continuation);
            this.$observer = mouseSelectionObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09102 c09102 = new C09102(this.$observer, continuation);
            c09102.L$0 = obj;
            return c09102;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C09102) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                java.lang.Object r1 = r12.L$1
                androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
                java.lang.Object r5 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r5
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r5
                goto L44
            L27:
                java.lang.Object r1 = r12.L$1
                androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
                java.lang.Object r5 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r5
                kotlin.ResultKt.throwOnFailure(r13)
                r6 = r12
                goto L56
            L34:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r13
                androidx.compose.foundation.text.selection.ClicksCounter r1 = new androidx.compose.foundation.text.selection.ClicksCounter
                androidx.compose.ui.platform.ViewConfiguration r5 = r13.getViewConfiguration()
                r1.<init>(r5)
            L44:
                r5 = r12
            L45:
                r5.L$0 = r13
                r5.L$1 = r1
                r5.label = r4
                java.lang.Object r6 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.access$awaitMouseEventDown(r13, r5)
                if (r6 != r0) goto L52
                return r0
            L52:
                r11 = r5
                r5 = r13
                r13 = r6
                r6 = r11
            L56:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p006ui.input.pointer.PointerEvent) r13
                r1.update(r13)
                java.util.List r7 = r13.getChanges()
                r8 = 0
                java.lang.Object r7 = r7.get(r8)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r7
                boolean r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isShiftPressed(r13)
                if (r13 == 0) goto L93
                androidx.compose.foundation.text.selection.MouseSelectionObserver r13 = r6.$observer
                long r8 = r7.getPosition()
                boolean r13 = r13.mo7658onExtendk4lQ0M(r8)
                if (r13 == 0) goto Ld6
                r7.consume()
                long r7 = r7.getId()
                androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 r13 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1
                androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = r6.$observer
                r13.<init>()
                r6.L$0 = r5
                r6.L$1 = r1
                r6.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m7162dragjO51t88(r5, r7, r13, r6)
                if (r13 != r0) goto Ld6
                return r0
            L93:
                int r13 = r1.getClicks()
                if (r13 == r4) goto La9
                if (r13 == r3) goto La2
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getParagraph()
                goto Laf
            La2:
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getWord()
                goto Laf
            La9:
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getNone()
            Laf:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r8 = r6.$observer
                long r9 = r7.getPosition()
                boolean r8 = r8.mo7660onStart3MmeM6k(r9, r13)
                if (r8 == 0) goto Ld6
                r7.consume()
                long r7 = r7.getId()
                androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 r9 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2
                androidx.compose.foundation.text.selection.MouseSelectionObserver r10 = r6.$observer
                r9.<init>()
                r6.L$0 = r5
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m7162dragjO51t88(r5, r7, r9, r6)
                if (r13 != r0) goto Ld6
                return r0
            Ld6:
                r13 = r5
                r5 = r6
                goto L45
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.C09102.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitMouseEventDown(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r10, kotlin.coroutines.Continuation<? super androidx.compose.p006ui.input.pointer.PointerEvent> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.C09091
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.C09091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.ResultKt.throwOnFailure(r11)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p006ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r10.awaitPointerEvent(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.p006ui.input.pointer.PointerEvent) r11
            int r2 = r11.getButtons()
            boolean r2 = androidx.compose.p006ui.input.pointer.PointerEvent_androidKt.m10456isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r11.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5b:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r7
            int r8 = r7.getType()
            androidx.compose.ui.input.pointer.PointerType$Companion r9 = androidx.compose.p006ui.input.pointer.PointerType.INSTANCE
            int r9 = r9.m10543getMouseT8wyACA()
            boolean r8 = androidx.compose.p006ui.input.pointer.PointerType.m10538equalsimpl0(r8, r9)
            if (r8 == 0) goto L7b
            boolean r7 = androidx.compose.p006ui.input.pointer.PointerEventKt.changedToDown(r7)
            if (r7 == 0) goto L7b
            r7 = r3
            goto L7c
        L7b:
            r7 = r5
        L7c:
            if (r7 != 0) goto L7f
            goto L83
        L7f:
            int r6 = r6 + 1
            goto L5b
        L82:
            r5 = r3
        L83:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object mouseSelectionDetector(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C09102(mouseSelectionObserver, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
