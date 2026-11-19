package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a$\u0010\u0018\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u001b\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001b\u0010\u0012\u001a$\u0010\u001c\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u0012\u001a,\u0010\u001d\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001d\u0010\u0016\u001a\u0014\u0010\u001e\u001a\u00020\u000f*\u00020\rH\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)\"\u0018\u0010*\u001a\u00020\u0002*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "Ld6/s;", "updateTouchMode", "updateSelectionTouchMode", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "selectionGestureInput", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "observer", "Landroidx/compose/ui/input/pointer/PointerEvent;", "down", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "clicksCounter", "mouseSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "selectionGesturePointerInputBtf2", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lh6/c;)Ljava/lang/Object;", "downEvent", "touchSelectionFirstPress", "touchSelectionSubsequentPress", "mouseSelectionBtf2", "awaitDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change1", "change2", "distanceIsTolerable", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "", "STATIC_KEY", "I", "isPrecisePointer", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n34#2,6:450\n34#2,6:456\n34#2,6:462\n34#2,6:468\n34#2,6:474\n34#2,6:480\n34#2,6:486\n87#2,2:492\n34#2,6:494\n89#2:500\n87#2,2:501\n34#2,6:503\n89#2:509\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n136#1:450,6\n166#1:456,6\n191#1:462,6\n248#1:468,6\n329#1:474,6\n364#1:480,6\n392#1:486,6\n431#1:492,2\n431#1:494,6\n431#1:500\n448#1:501,2\n448#1:503,6\n448#1:509\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m5303f = "SelectionGestures.kt", m5304i = {0}, m5305l = {430}, m5306m = "awaitDown", m5307n = {"$this$awaitDown"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 */
    public static final class C14501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14501(InterfaceC5631c<? super C14501> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.awaitDown(null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m5303f = "SelectionGestures.kt", m5304i = {0, 0, 1, 1, 1}, m5305l = {159, 183}, m5306m = "mouseSelection", m5307n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer", "dragConsumed"}, m5308s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 */
    public static final class C14511 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C14511(InterfaceC5631c<? super C14511> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m5303f = "SelectionGestures.kt", m5304i = {0, 0, 1, 1, 1}, m5305l = {357, 384}, m5306m = "mouseSelectionBtf2", m5307n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer", "dragConsumed"}, m5308s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1 */
    public static final class C14521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C14521(InterfaceC5631c<? super C14521> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", m5303f = "SelectionGestures.kt", m5304i = {0}, m5305l = {209, 217, 220, 221}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture"}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n*L\n215#1:450,2\n215#1:452,6\n215#1:458\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2 */
    public static final class C14542 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14542(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, InterfaceC5631c<? super C14542> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$clicksCounter = clicksCounter;
            this.$mouseSelectionObserver = mouseSelectionObserver;
            this.$textDragObserver = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C14542 c14542 = new C14542(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, interfaceC5631c);
            c14542.L$0 = obj;
            return c14542;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C14542) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(r1, r2, r3, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(r1, r2, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        
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
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L20
                if (r1 == r4) goto L1b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                kotlin.AbstractC5774b.m5119b(r13)
                goto La1
            L20:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r13)
                goto L3b
            L28:
                kotlin.AbstractC5774b.m5119b(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                r12.L$0 = r1
                r12.label = r5
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r12)
                if (r13 != r0) goto L3b
                goto La0
            L3b:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p011ui.input.pointer.PointerEvent) r13
                androidx.compose.foundation.text.selection.ClicksCounter r6 = r12.$clicksCounter
                r6.update(r13)
                boolean r6 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r13)
                r7 = 0
                if (r6 == 0) goto L7d
                int r8 = r13.getButtons()
                boolean r8 = androidx.compose.p011ui.input.pointer.PointerEvent_androidKt.m11881isPrimaryPressedaHzCxE(r8)
                if (r8 == 0) goto L7d
                java.util.List r8 = r13.getChanges()
                int r9 = r8.size()
                r10 = 0
            L5c:
                if (r10 >= r9) goto L6e
                java.lang.Object r11 = r8.get(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
                boolean r11 = r11.isConsumed()
                if (r11 == 0) goto L6b
                goto L7d
            L6b:
                int r10 = r10 + 1
                goto L5c
            L6e:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.$mouseSelectionObserver
                androidx.compose.foundation.text.selection.ClicksCounter r3 = r12.$clicksCounter
                r12.L$0 = r7
                r12.label = r4
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelectionBtf2(r1, r2, r3, r13, r12)
                if (r13 != r0) goto La1
                goto La0
            L7d:
                if (r6 != 0) goto La1
                androidx.compose.foundation.text.selection.ClicksCounter r4 = r12.$clicksCounter
                int r4 = r4.getClicks()
                if (r4 != r5) goto L94
                androidx.compose.foundation.text.TextDragObserver r2 = r12.$textDragObserver
                r12.L$0 = r7
                r12.label = r3
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionFirstPress(r1, r2, r13, r12)
                if (r13 != r0) goto La1
                goto La0
            L94:
                androidx.compose.foundation.text.TextDragObserver r3 = r12.$textDragObserver
                r12.L$0 = r7
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(r1, r3, r13, r12)
                if (r13 != r0) goto La1
            La0:
                return r0
            La1:
                d6.s r13 = p045d6.C5443s.f8405a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C14542.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m5303f = "SelectionGestures.kt", m5304i = {0, 0, 0, 1, 1}, m5305l = {126, 130}, m5306m = "touchSelection", m5307n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, m5308s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 */
    public static final class C14551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C14551(InterfaceC5631c<? super C14551> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelection(null, null, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m5303f = "SelectionGestures.kt", m5304i = {0, 0, 0, 1, 1}, m5305l = {238, 242}, m5306m = "touchSelectionFirstPress", m5307n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, m5308s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 */
    public static final class C14571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C14571(InterfaceC5631c<? super C14571> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m5303f = "SelectionGestures.kt", m5304i = {0, 0, 0, 0, 0, 1, 1}, m5305l = {281, 322}, m5306m = "touchSelectionSubsequentPress", m5307n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1 */
    public static final class C14591 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C14591(InterfaceC5631c<? super C14591> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.touchSelectionSubsequentPress(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDown(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r7, p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerEvent> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C14501
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C14501) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.AbstractC5774b.m5119b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.AbstractC5774b.m5119b(r8)
        L36:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p011ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p011ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            int r4 = r2.size()
            r5 = 0
        L4e:
            if (r5 >= r4) goto L60
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.p011ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L5d
            goto L36
        L5d:
            int r5 = r5 + 1
            goto L4e
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m10439getDistanceimpl(Offset.m10445minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.m6963pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.getType());
    }

    public static final boolean isPrecisePointer(@NotNull PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m11979equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m11984getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelection(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.p011ui.input.pointer.PointerEvent r11, p075h6.InterfaceC5631c<? super p045d6.C5443s> r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:20:0x004c, B:31:0x0089, B:33:0x0091, B:35:0x009f, B:37:0x00ab, B:28:0x006f), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0033, B:54:0x010f, B:56:0x0117, B:58:0x011b, B:60:0x0129, B:62:0x0135, B:50:0x00e0), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.p011ui.input.pointer.PointerEvent r11, p075h6.InterfaceC5631c<? super p045d6.C5443s> r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, h6.c):java.lang.Object");
    }

    @NotNull
    public static final Modifier selectionGestureInput(@NotNull Modifier modifier, @NotNull final MouseSelectionObserver mouseSelectionObserver, @NotNull final TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.selectionGestureInput.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", m5303f = "SelectionGestures.kt", m5304i = {0}, m5305l = {107, 113, 115}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture"}, m5308s = {"L$0"})
            @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n111#1:450,2\n111#1:452,6\n111#1:458\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6473e {
                final /* synthetic */ ClicksCounter $clicksCounter;
                final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
                final /* synthetic */ TextDragObserver $textDragObserver;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$mouseSelectionObserver = mouseSelectionObserver;
                    this.$clicksCounter = clicksCounter;
                    this.$textDragObserver = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, interfaceC5631c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(r1, r2, r4, r10, r9) == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
                
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
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r9.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L25
                        if (r1 == r4) goto L1d
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        goto L18
                    L10:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L18:
                        kotlin.AbstractC5774b.m5119b(r10)
                        goto L88
                    L1d:
                        java.lang.Object r1 = r9.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC5774b.m5119b(r10)
                        goto L38
                    L25:
                        kotlin.AbstractC5774b.m5119b(r10)
                        java.lang.Object r10 = r9.L$0
                        r1 = r10
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                        r9.L$0 = r1
                        r9.label = r4
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r9)
                        if (r10 != r0) goto L38
                        goto L87
                    L38:
                        androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p011ui.input.pointer.PointerEvent) r10
                        boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        r5 = 0
                        if (r4 == 0) goto L75
                        int r4 = r10.getButtons()
                        boolean r4 = androidx.compose.p011ui.input.pointer.PointerEvent_androidKt.m11881isPrimaryPressedaHzCxE(r4)
                        if (r4 == 0) goto L75
                        java.util.List r4 = r10.getChanges()
                        int r6 = r4.size()
                        r7 = 0
                    L54:
                        if (r7 >= r6) goto L66
                        java.lang.Object r8 = r4.get(r7)
                        androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r8
                        boolean r8 = r8.isConsumed()
                        if (r8 == 0) goto L63
                        goto L75
                    L63:
                        int r7 = r7 + 1
                        goto L54
                    L66:
                        androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.$mouseSelectionObserver
                        androidx.compose.foundation.text.selection.ClicksCounter r4 = r9.$clicksCounter
                        r9.L$0 = r5
                        r9.label = r3
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelection(r1, r2, r4, r10, r9)
                        if (r10 != r0) goto L88
                        goto L87
                    L75:
                        boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        if (r3 != 0) goto L88
                        androidx.compose.foundation.text.TextDragObserver r3 = r9.$textDragObserver
                        r9.L$0 = r5
                        r9.label = r2
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelection(r1, r3, r10, r9)
                        if (r10 != r0) goto L88
                    L87:
                        return r0
                    L88:
                        d6.s r10 = p045d6.C5443s.f8405a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C14531.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(mouseSelectionObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), textDragObserver, null), interfaceC5631c);
                return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
            }
        });
    }

    @Nullable
    public static final Object selectionGesturePointerInputBtf2(@NotNull PointerInputScope pointerInputScope, @NotNull MouseSelectionObserver mouseSelectionObserver, @NotNull TextDragObserver textDragObserver, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C14542(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelection(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.p011ui.input.pointer.PointerEvent r10, p075h6.InterfaceC5631c<? super p045d6.C5443s> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C14551
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C14551) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L9f
        L33:
            r8 = move-exception
            goto Ld2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.util.concurrent.CancellationException -> L33
            r7 = r10
            r10 = r8
            r8 = r7
            goto L71
        L51:
            kotlin.AbstractC5774b.m5119b(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r10 = kotlin.collections.AbstractC5805t.m5228h0(r10)     // Catch: java.util.concurrent.CancellationException -> L33
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L33
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L33
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6950awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r11 != r1) goto L71
            goto L9e
        L71:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L33
            if (r11 == 0) goto Lcf
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L33
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r10 == 0) goto Lcf
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L33
            r9.mo7694onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L33
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L33
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> L33
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L33
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L33
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6960dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L33
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L33
            if (r10 == 0) goto Lcc
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L33
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L33
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L33
            r11 = 0
        Lb4:
            if (r11 >= r10) goto Lc8
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L33
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L33
            boolean r1 = androidx.compose.p011ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r1 == 0) goto Lc5
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L33
        Lc5:
            int r11 = r11 + 1
            goto Lb4
        Lc8:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L33
            goto Lcf
        Lcc:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L33
        Lcf:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        Ld2:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.p011ui.input.pointer.PointerEvent r10, p075h6.InterfaceC5631c<? super p045d6.C5443s> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt.C14571
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt.C14571) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L9f
        L33:
            r8 = move-exception
            goto Ld2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.util.concurrent.CancellationException -> L33
            r7 = r10
            r10 = r8
            r8 = r7
            goto L71
        L51:
            kotlin.AbstractC5774b.m5119b(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r10 = kotlin.collections.AbstractC5805t.m5228h0(r10)     // Catch: java.util.concurrent.CancellationException -> L33
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L33
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L33
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6950awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r11 != r1) goto L71
            goto L9e
        L71:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L33
            if (r11 == 0) goto Lcf
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L33
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r10 == 0) goto Lcf
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L33
            r9.mo7694onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L33
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L33
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> L33
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L33
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L33
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L33
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6960dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L33
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L33
            if (r10 == 0) goto Lcc
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L33
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L33
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L33
            r11 = 0
        Lb4:
            if (r11 >= r10) goto Lc8
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L33
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L33
            boolean r1 = androidx.compose.p011ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r1 == 0) goto Lc5
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L33
        Lc5:
            int r11 = r11 + 1
            goto Lb4
        Lc8:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L33
            goto Lcf
        Lcc:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L33
        Lcf:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        Ld2:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: CancellationException -> 0x00aa, TryCatch #3 {CancellationException -> 0x00aa, blocks: (B:29:0x00a3, B:31:0x00a7, B:34:0x00ac, B:37:0x00b1, B:39:0x00bc, B:41:0x00c0, B:43:0x00c4, B:44:0x00c9), top: B:68:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[Catch: CancellationException -> 0x00aa, TryCatch #3 {CancellationException -> 0x00aa, blocks: (B:29:0x00a3, B:31:0x00a7, B:34:0x00ac, B:37:0x00b1, B:39:0x00bc, B:41:0x00c0, B:43:0x00c4, B:44:0x00c9), top: B:68:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9 A[Catch: CancellationException -> 0x0038, TryCatch #2 {CancellationException -> 0x0038, blocks: (B:13:0x0033, B:48:0x00e1, B:50:0x00e9, B:52:0x00f8, B:54:0x0104, B:55:0x0107, B:56:0x010a, B:57:0x010e), top: B:67:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e A[Catch: CancellationException -> 0x0038, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0038, blocks: (B:13:0x0033, B:48:0x00e1, B:50:0x00e9, B:52:0x00f8, B:54:0x0104, B:55:0x0107, B:56:0x010a, B:57:0x010e), top: B:67:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionSubsequentPress(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r14, androidx.compose.foundation.text.TextDragObserver r15, androidx.compose.p011ui.input.pointer.PointerEvent r16, p075h6.InterfaceC5631c<? super p045d6.C5443s> r17) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, h6.c):java.lang.Object");
    }

    @NotNull
    public static final Modifier updateSelectionTouchMode(@NotNull Modifier modifier, @NotNull final InterfaceC6471c interfaceC6471c) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m5303f = "SelectionGestures.kt", m5304i = {0}, m5305l = {94}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope"}, m5308s = {"L$0"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6471c $updateTouchMode;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$updateTouchMode = interfaceC6471c;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, interfaceC5631c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L19
                        if (r1 != r2) goto L11
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC5774b.m5119b(r5)
                        goto L2e
                    L11:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L19:
                        kotlin.AbstractC5774b.m5119b(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L21:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                        if (r5 != r0) goto L2e
                        return r0
                    L2e:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p011ui.input.pointer.PointerEvent) r5
                        r6.c r3 = r4.$updateTouchMode
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        r3.invoke(r5)
                        goto L21
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.C14631.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(interfaceC6471c, null), interfaceC5631c);
                return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : C5443s.f8405a;
            }
        });
    }
}
