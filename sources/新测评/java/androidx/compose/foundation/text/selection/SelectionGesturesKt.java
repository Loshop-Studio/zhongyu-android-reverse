package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.PointerType;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.platform.ViewConfiguration;
import java.util.List;
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

@Metadata(m13557d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\rH\u0082@¢\u0006\u0002\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\"\u0010\u001d\u001a\u00020\u0010*\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0080@¢\u0006\u0002\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010\"\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010$\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a \u0010%\u001a\u00020\u0019*\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100'H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006("}, m13558d2 = {"STATIC_KEY", "", "isPrecisePointer", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "distanceIsTolerable", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "change1", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change2", "awaitDown", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelection", "", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "clicksCounter", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "down", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionBtf2", "selectionGestureInput", "Landroidx/compose/ui/Modifier;", "mouseSelectionObserver", "textDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "selectionGesturePointerInputBtf2", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelectionFirstPress", "downEvent", "touchSelectionSubsequentPress", "updateSelectionTouchMode", "updateTouchMode", "Lkotlin/Function1;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n34#2,6:450\n34#2,6:456\n34#2,6:462\n34#2,6:468\n34#2,6:474\n34#2,6:480\n34#2,6:486\n87#2,2:492\n34#2,6:494\n89#2:500\n87#2,2:501\n34#2,6:503\n89#2:509\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n136#1:450,6\n166#1:456,6\n191#1:462,6\n248#1:468,6\n329#1:474,6\n364#1:480,6\n392#1:486,6\n431#1:492,2\n431#1:494,6\n431#1:500\n448#1:501,2\n448#1:503,6\n448#1:509\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m13596f = "SelectionGestures.kt", m13597i = {0}, m13598l = {430}, m13599m = "awaitDown", m13600n = {"$this$awaitDown"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 */
    public static final class C19041 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19041(Continuation<? super C19041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.awaitDown(null, this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m13596f = "SelectionGestures.kt", m13597i = {0, 0, 1, 1, 1}, m13598l = {159, 183}, m13599m = "mouseSelection", m13600n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer", "dragConsumed"}, m13601s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 */
    public static final class C19051 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19051(Continuation<? super C19051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m13596f = "SelectionGestures.kt", m13597i = {0, 0, 1, 1, 1}, m13598l = {357, 384}, m13599m = "mouseSelectionBtf2", m13600n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer", "dragConsumed"}, m13601s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1 */
    public static final class C19061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19061(Continuation<? super C19061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", m13596f = "SelectionGestures.kt", m13597i = {0}, m13598l = {209, 217, 220, 221}, m13599m = "invokeSuspend", m13600n = {"$this$awaitEachGesture"}, m13601s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n*L\n215#1:450,2\n215#1:452,6\n215#1:458\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2 */
    public static final class C19082 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19082(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super C19082> continuation) {
            super(2, continuation);
            this.$clicksCounter = clicksCounter;
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C19082 c19082 = new C19082(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, continuation);
            c19082.L$0 = obj;
            return c19082;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C19082) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(r1, r2, r3, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(r1, r2, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(r1, r3, r13, r12) == r0) goto L37;
         */
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
                kotlin.ResultKt.throwOnFailure(r13)
                goto La3
            L22:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L3d
            L2a:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                r12.L$0 = r1
                r12.label = r5
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r12)
                if (r13 != r0) goto L3d
                goto La2
            L3d:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p013ui.input.pointer.PointerEvent) r13
                androidx.compose.foundation.text.selection.ClicksCounter r6 = r12.$clicksCounter
                r6.update(r13)
                boolean r6 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r13)
                r7 = 0
                if (r6 == 0) goto L7f
                int r8 = r13.getButtons()
                boolean r8 = androidx.compose.p013ui.input.pointer.PointerEvent_androidKt.m22172isPrimaryPressedaHzCxE(r8)
                if (r8 == 0) goto L7f
                java.util.List r8 = r13.getChanges()
                int r9 = r8.size()
                r10 = 0
            L5e:
                if (r10 >= r9) goto L70
                java.lang.Object r11 = r8.get(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11
                boolean r11 = r11.isConsumed()
                if (r11 == 0) goto L6d
                goto L7f
            L6d:
                int r10 = r10 + 1
                goto L5e
            L70:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.$mouseSelectionObserver
                androidx.compose.foundation.text.selection.ClicksCounter r3 = r12.$clicksCounter
                r12.L$0 = r7
                r12.label = r4
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelectionBtf2(r1, r2, r3, r13, r12)
                if (r13 != r0) goto La3
                goto La2
            L7f:
                if (r6 != 0) goto La3
                androidx.compose.foundation.text.selection.ClicksCounter r4 = r12.$clicksCounter
                int r4 = r4.getClicks()
                if (r4 != r5) goto L96
                androidx.compose.foundation.text.TextDragObserver r2 = r12.$textDragObserver
                r12.L$0 = r7
                r12.label = r3
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionFirstPress(r1, r2, r13, r12)
                if (r13 != r0) goto La3
                goto La2
            L96:
                androidx.compose.foundation.text.TextDragObserver r3 = r12.$textDragObserver
                r12.L$0 = r7
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(r1, r3, r13, r12)
                if (r13 != r0) goto La3
            La2:
                return r0
            La3:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C19082.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m13596f = "SelectionGestures.kt", m13597i = {0, 0, 0, 1, 1}, m13598l = {126, 130}, m13599m = "touchSelection", m13600n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 */
    public static final class C19091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19091(Continuation<? super C19091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelection(null, null, null, this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m13596f = "SelectionGestures.kt", m13597i = {0, 0, 0, 1, 1}, m13598l = {238, 242}, m13599m = "touchSelectionFirstPress", m13600n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 */
    public static final class C19111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19111(Continuation<? super C19111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m13596f = "SelectionGestures.kt", m13597i = {0, 0, 0, 0, 0, 1, 1}, m13598l = {281, 322}, m13599m = "touchSelectionSubsequentPress", m13600n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1 */
    public static final class C19131 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C19131(Continuation<? super C19131> continuation) {
            super(continuation);
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDown(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.Continuation<? super androidx.compose.p013ui.input.pointer.PointerEvent> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C19041
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C19041) r0
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p013ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p013ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.p013ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m20733getDistanceimpl(Offset.m20739minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.m17391pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.getType());
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!PointerType.m22270equalsimpl0(changes.get(i10).getType(), PointerType.INSTANCE.m22275getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelection(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.p013ui.input.pointer.PointerEvent r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008b, B:33:0x0093, B:35:0x00a1, B:37:0x00ad, B:28:0x0071), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x0111, B:56:0x0119, B:58:0x011d, B:60:0x012b, B:62:0x0137, B:50:0x00e2), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.p013ui.input.pointer.PointerEvent r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier selectionGestureInput(Modifier modifier, final MouseSelectionObserver mouseSelectionObserver, final TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput.1

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", m13596f = "SelectionGestures.kt", m13597i = {0}, m13598l = {107, 113, 115}, m13599m = "invokeSuspend", m13600n = {"$this$awaitEachGesture"}, m13601s = {"L$0"})
            @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n111#1:450,2\n111#1:452,6\n111#1:458\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ ClicksCounter $clicksCounter;
                final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
                final /* synthetic */ TextDragObserver $textDragObserver;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$mouseSelectionObserver = mouseSelectionObserver;
                    this.$clicksCounter = clicksCounter;
                    this.$textDragObserver = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(r1, r2, r4, r10, r9) == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(r1, r3, r10, r9) == r0) goto L32;
                 */
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
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L8a
                    L1f:
                        java.lang.Object r1 = r9.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L3a
                    L27:
                        kotlin.ResultKt.throwOnFailure(r10)
                        java.lang.Object r10 = r9.L$0
                        r1 = r10
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                        r9.L$0 = r1
                        r9.label = r4
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r9)
                        if (r10 != r0) goto L3a
                        goto L89
                    L3a:
                        androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p013ui.input.pointer.PointerEvent) r10
                        boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        r5 = 0
                        if (r4 == 0) goto L77
                        int r4 = r10.getButtons()
                        boolean r4 = androidx.compose.p013ui.input.pointer.PointerEvent_androidKt.m22172isPrimaryPressedaHzCxE(r4)
                        if (r4 == 0) goto L77
                        java.util.List r4 = r10.getChanges()
                        int r6 = r4.size()
                        r7 = 0
                    L56:
                        if (r7 >= r6) goto L68
                        java.lang.Object r8 = r4.get(r7)
                        androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                        boolean r8 = r8.isConsumed()
                        if (r8 == 0) goto L65
                        goto L77
                    L65:
                        int r7 = r7 + 1
                        goto L56
                    L68:
                        androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.$mouseSelectionObserver
                        androidx.compose.foundation.text.selection.ClicksCounter r4 = r9.$clicksCounter
                        r9.L$0 = r5
                        r9.label = r3
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelection(r1, r2, r4, r10, r9)
                        if (r10 != r0) goto L8a
                        goto L89
                    L77:
                        boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        if (r3 != 0) goto L8a
                        androidx.compose.foundation.text.TextDragObserver r3 = r9.$textDragObserver
                        r9.L$0 = r5
                        r9.label = r2
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelection(r1, r3, r10, r9)
                        if (r10 != r0) goto L8a
                    L89:
                        return r0
                    L8a:
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C19071.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), textDragObserver, null), continuation);
                return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
            }
        });
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C19082(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
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
    public static final java.lang.Object touchSelection(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.p013ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C19091
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C19091) r0
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld4
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m17378awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld1
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.mo18089onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m17388dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Lce
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb6:
            if (r11 >= r10) goto Lca
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = androidx.compose.p013ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lc7
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L35
        Lc7:
            int r11 = r11 + 1
            goto Lb6
        Lca:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld1
        Lce:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld1:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Ld4:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
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
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.p013ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C19111
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C19111) r0
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld4
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m17378awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld1
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.mo18089onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m17388dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Lce
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb6:
            if (r11 >= r10) goto Lca
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = androidx.compose.p013ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lc7
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L35
        Lc7:
            int r11 = r11 + 1
            goto Lb6
        Lca:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld1
        Lce:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld1:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Ld4:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
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
    public static final java.lang.Object touchSelectionSubsequentPress(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r12, final androidx.compose.foundation.text.TextDragObserver r13, androidx.compose.p013ui.input.pointer.PointerEvent r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier updateSelectionTouchMode(Modifier modifier, final Function1<? super Boolean, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode.1

            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m13596f = "SelectionGestures.kt", m13597i = {0}, m13598l = {94}, m13599m = "invokeSuspend", m13600n = {"$this$awaitPointerEventScope"}, m13601s = {"L$0"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Boolean, Unit> $updateTouchMode;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$updateTouchMode = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.ResultKt.throwOnFailure(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p013ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p013ui.input.pointer.PointerEvent) r5
                        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.$updateTouchMode
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C19171.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(function1, null), continuation);
                return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
            }
        });
    }
}
