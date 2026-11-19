package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u008d\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0087@¢\u0006\u0004\b\u001a\u0010\u001b\u001a(\u0010\u001a\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001a\u0010\u001e\u001a(\u0010\u001f\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b\u001f\u0010\u001e\u001a%\u0010\"\u001a\u00020\u0018*\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0016\u0010$\u001a\u0004\u0018\u00010\u0012*\u00020\u000fH\u0087@¢\u0006\u0004\b$\u0010\u0011\u001a \u0010$\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b$\u0010%\u001a\u001e\u0010'\u001a\u00020&*\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b'\u0010%\u001aN\u0010/\u001a\u00020)*\u00020(2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2'\u0010.\u001a#\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0-¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b/\u00100\";\u00101\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\"*\u0010:\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00188G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107\"\u001a\u0010>\u001a\u00020+8BX\u0082\u0004¢\u0006\f\u0012\u0004\b=\u00109\u001a\u0004\b;\u0010<¨\u0006?"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Ld6/s;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/c;Lr6/c;Lr6/f;Lr6/c;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "awaitSecondDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lh6/c;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/f;Lr6/c;Lh6/c;)Ljava/lang/Object;", "", "requireUnconsumed", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;", "awaitPrimaryFirstDown", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onlyPrimaryMouseButton", "isChangedToDown", "(Landroidx/compose/ui/input/pointer/PointerEvent;ZZ)Z", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/LongPressResult;", "waitForLongPress", "Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/w0;", "resetJob", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "block", "launchAwaitingReset", "(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;)Lkotlinx/coroutines/w0;", "NoPressGesture", "Lr6/f;", "value", "getDetectTapGesturesEnableNewDispatchingBehavior", "()Z", "setDetectTapGesturesEnableNewDispatchingBehavior", "(Z)V", "getDetectTapGesturesEnableNewDispatchingBehavior$annotations", "()V", "DetectTapGesturesEnableNewDispatchingBehavior", "getCoroutineStartForCurrentDispatchBehavior", "()Lkotlinx/coroutines/CoroutineStart;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "coroutineStartForCurrentDispatchBehavior", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n34#2,6:551\n102#2,2:557\n34#2,6:559\n104#2:565\n87#2,2:566\n34#2,6:568\n89#2:574\n87#2,2:575\n34#2,6:577\n89#2:583\n87#2,2:584\n34#2,6:586\n89#2:592\n102#2,2:593\n34#2,6:595\n104#2:601\n102#2,2:602\n34#2,6:604\n104#2:610\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n210#1:551,6\n211#1:557,2\n211#1:559,6\n211#1:565\n321#1:566,2\n321#1:568,6\n321#1:574\n324#1:575,2\n324#1:577,6\n324#1:583\n353#1:584,2\n353#1:586,6\n353#1:592\n359#1:593,2\n359#1:595,6\n359#1:601\n367#1:602,2\n367#1:604,6\n367#1:610\n*E\n"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {

    @NotNull
    private static final InterfaceC6474f NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m5303f = "TapGestureDetector.kt", m5304i = {0, 0, 0}, m5305l = {291}, m5306m = "awaitFirstDown", m5307n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, m5308s = {"L$0", "L$1", "Z$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 */
    public static final class C09022 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C09022(InterfaceC5631c<? super C09022> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m5303f = "TapGestureDetector.kt", m5304i = {0, 0, 0}, m5305l = {304}, m5306m = "awaitPrimaryFirstDown", m5307n = {"$this$awaitPrimaryFirstDown", "pass", "requireUnconsumed"}, m5308s = {"L$0", "L$1", "Z$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 */
    public static final class C09031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C09031(InterfaceC5631c<? super C09031> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitPrimaryFirstDown(null, false, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m5303f = "TapGestureDetector.kt", m5304i = {0, 0}, m5305l = {227}, m5306m = "invokeSuspend", m5307n = {"$this$withTimeoutOrNull", "minUptime"}, m5308s = {"L$0", "J$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 */
    public static final class C09042 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09042(PointerInputChange pointerInputChange, InterfaceC5631c<? super C09042> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$firstUp = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09042 c09042 = new C09042(this.$firstUp, interfaceC5631c);
            c09042.L$0 = obj;
            return c09042;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
            return ((C09042) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:12:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r13.label
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                long r3 = r13.J$0
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r14)
                r7 = r1
                goto L46
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                kotlin.AbstractC5774b.m5119b(r14)
                java.lang.Object r14 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r14
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r13.$firstUp
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.ViewConfiguration r1 = r14.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r5 = r5 + r3
                r7 = r14
                r3 = r5
            L34:
                r13.L$0 = r7
                r13.J$0 = r3
                r13.label = r2
                r8 = 0
                r9 = 0
                r11 = 3
                r12 = 0
                r10 = r13
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L46
                return r0
            L46:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r14
                long r5 = r14.getUptimeMillis()
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 < 0) goto L34
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C09042.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m5303f = "TapGestureDetector.kt", m5304i = {0}, m5305l = {209}, m5306m = "consumeUntilUp", m5307n = {"$this$consumeUntilUp"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 */
    public static final class C09051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09051(InterfaceC5631c<? super C09051> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.consumeUntilUp(null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {247}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2 */
    public static final class C09062 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6474f $onPress;
        final /* synthetic */ InterfaceC6471c $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m5303f = "TapGestureDetector.kt", m5304i = {0, 0, 1}, m5305l = {251, 257}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, m5308s = {"L$0", "L$1", "L$0"})
        @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
            final /* synthetic */ InterfaceC6474f $onPress;
            final /* synthetic */ InterfaceC6471c $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {254}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68511 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ InterfaceC6474f $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68511(InterfaceC6474f interfaceC6474f, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC5631c<? super C68511> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$onPress = interfaceC6474f;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new C68511(this.$onPress, this.$pressScope, this.$down, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6474f interfaceC6474f = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM10430boximpl = Offset.m10430boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (interfaceC6474f.invoke(pressGestureScopeImpl, offsetM10430boximpl, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68511) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass2(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.cancel();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass3> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass3(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.release();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6009v interfaceC6009v, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$$this$coroutineScope = interfaceC6009v;
                this.$onPress = interfaceC6474f;
                this.$onTap = interfaceC6471c;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
            
                if (r0 == r6) goto L19;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [kotlinx.coroutines.w0] */
            /* JADX WARN: Type inference failed for: r0v15, types: [kotlinx.coroutines.w0] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r3 = r16
                    kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r0 = r3.label
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L32
                    if (r0 == r8) goto L22
                    if (r0 != r7) goto L1a
                    java.lang.Object r0 = r3.L$0
                    kotlinx.coroutines.w0 r0 = (kotlinx.coroutines.InterfaceC6013w0) r0
                    kotlin.AbstractC5774b.m5119b(r17)
                    r11 = r0
                    r0 = r17
                    goto L87
                L1a:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L22:
                    java.lang.Object r0 = r3.L$1
                    kotlinx.coroutines.w0 r0 = (kotlinx.coroutines.InterfaceC6013w0) r0
                    java.lang.Object r1 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.AbstractC5774b.m5119b(r17)
                    r11 = r0
                    r0 = r1
                    r1 = r17
                    goto L5c
                L32:
                    kotlin.AbstractC5774b.m5119b(r17)
                    java.lang.Object r0 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r0
                    kotlinx.coroutines.v r1 = r3.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior()
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r4 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r3.$pressScope
                    r4.<init>(r5, r9)
                    kotlinx.coroutines.k1 r10 = kotlinx.coroutines.AbstractC6014x.m5651v(r1, r9, r2, r4, r8)
                    r3.L$0 = r0
                    r3.L$1 = r10
                    r3.label = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L5b
                    goto L86
                L5b:
                    r11 = r10
                L5c:
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r1
                    r1.consume()
                    r6.f r2 = r3.$onPress
                    r6.f r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                    if (r2 == r4) goto L7a
                    kotlinx.coroutines.v r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                    r6.f r2 = r3.$onPress
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r3.$pressScope
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                L7a:
                    r3.L$0 = r11
                    r3.L$1 = r9
                    r3.label = r7
                    java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L87
                L86:
                    return r6
                L87:
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r0
                    if (r0 != 0) goto L9b
                    kotlinx.coroutines.v r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r3.$pressScope
                    r13.<init>(r0, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                    goto Lbc
                L9b:
                    r0.consume()
                    kotlinx.coroutines.v r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r13.<init>(r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                    r6.c r1 = r3.$onTap
                    if (r1 == 0) goto Lbc
                    long r4 = r0.getPosition()
                    androidx.compose.ui.geometry.Offset r0 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r4)
                    r1.invoke(r0)
                Lbc:
                    d6.s r0 = p045d6.C5443s.f8405a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C09062.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09062(PointerInputScope pointerInputScope, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super C09062> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = interfaceC6474f;
            this.$onTap = interfaceC6471c;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09062 c09062 = new C09062(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, interfaceC5631c);
            c09062.L$0 = obj;
            return c09062;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC6009v, this.$onPress, this.$onTap, this.$pressScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09062) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {LocationRequestCompat.QUALITY_LOW_POWER}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2 */
    public static final class C09072 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6471c $onDoubleTap;
        final /* synthetic */ InterfaceC6471c $onLongPress;
        final /* synthetic */ InterfaceC6474f $onPress;
        final /* synthetic */ InterfaceC6471c $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m5303f = "TapGestureDetector.kt", m5304i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, m5305l = {105, 116, 119, 122, 149, 167, 169, 180}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", "down", "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, m5308s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
            final /* synthetic */ InterfaceC6471c $onDoubleTap;
            final /* synthetic */ InterfaceC6471c $onLongPress;
            final /* synthetic */ InterfaceC6474f $onPress;
            final /* synthetic */ InterfaceC6471c $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {110}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68521 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ InterfaceC6474f $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68521(InterfaceC6474f interfaceC6474f, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC5631c<? super C68521> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$onPress = interfaceC6474f;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new C68521(this.$onPress, this.$pressScope, this.$down, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6474f interfaceC6474f = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM10430boximpl = Offset.m10430boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (interfaceC6474f.invoke(pressGestureScopeImpl, offsetM10430boximpl, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68521) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass2(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.release();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass3> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass3(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.cancel();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass4> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass4(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.release();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass4) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {157, 158}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6013w0 $cancelOrReleaseJob;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(InterfaceC6013w0 interfaceC6013w0, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass5> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$cancelOrReleaseJob = interfaceC6013w0;
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, interfaceC5631c);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
                
                    if (r5.reset(r4) == r0) goto L15;
                 */
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
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1c
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        kotlin.AbstractC5774b.m5119b(r5)
                        goto L35
                    L10:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L18:
                        kotlin.AbstractC5774b.m5119b(r5)
                        goto L2a
                    L1c:
                        kotlin.AbstractC5774b.m5119b(r5)
                        kotlinx.coroutines.w0 r5 = r4.$cancelOrReleaseJob
                        r4.label = r3
                        java.lang.Object r5 = r5.mo5456e(r4)
                        if (r5 != r0) goto L2a
                        goto L34
                    L2a:
                        androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4.$pressScope
                        r4.label = r2
                        java.lang.Object r5 = r5.reset(r4)
                        if (r5 != r0) goto L35
                    L34:
                        return r0
                    L35:
                        d6.s r5 = p045d6.C5443s.f8405a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C09072.AnonymousClass1.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass5) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {161}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6474f $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(InterfaceC6474f interfaceC6474f, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC5631c<? super AnonymousClass6> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$onPress = interfaceC6474f;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6474f interfaceC6474f = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM10430boximpl = Offset.m10430boximpl(this.$secondDown.getPosition());
                        this.label = 1;
                        if (interfaceC6474f.invoke(pressGestureScopeImpl, offsetM10430boximpl, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass6) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass7> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass7(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.release();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass7) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass8> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass8(this.$pressScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    this.$pressScope.cancel();
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass8) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6009v interfaceC6009v, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$$this$coroutineScope = interfaceC6009v;
                this.$onPress = interfaceC6474f;
                this.$onLongPress = interfaceC6471c;
                this.$onDoubleTap = interfaceC6471c2;
                this.$onTap = interfaceC6471c3;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:73:0x01fb, code lost:
            
                if (r0 == r6) goto L84;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0268  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0288  */
            /* JADX WARN: Type inference failed for: r0v17, types: [kotlinx.coroutines.w0] */
            /* JADX WARN: Type inference failed for: r0v34, types: [kotlinx.coroutines.w0] */
            /* JADX WARN: Type inference failed for: r0v38, types: [kotlinx.coroutines.w0] */
            /* JADX WARN: Type inference failed for: r0v74, types: [kotlinx.coroutines.w0] */
            /* JADX WARN: Type inference failed for: r1v26, types: [kotlinx.coroutines.w0] */
            /* JADX WARN: Type inference failed for: r2v17, types: [kotlinx.coroutines.w0] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instructions count: 714
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C09072.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09072(PointerInputScope pointerInputScope, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC5631c<? super C09072> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onPress = interfaceC6474f;
            this.$onLongPress = interfaceC6471c;
            this.$onDoubleTap = interfaceC6471c2;
            this.$onTap = interfaceC6471c3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09072 c09072 = new C09072(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, interfaceC5631c);
            c09072.L$0 = obj;
            return c09072;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                PointerInputScope pointerInputScope = this.$this_detectTapGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC6009v, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09072) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", m5303f = "TapGestureDetector.kt", m5304i = {0}, m5305l = {TypedValues.PositionType.TYPE_DRAWPATH, TypedValues.PositionType.TYPE_PERCENT_HEIGHT}, m5306m = "invokeSuspend", m5307n = {"$this$launch"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1 */
    public static final class C09081 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ InterfaceC6013w0 $resetJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09081(InterfaceC6013w0 interfaceC6013w0, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C09081> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$resetJob = interfaceC6013w0;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09081 c09081 = new C09081(this.$resetJob, this.$block, interfaceC5631c);
            c09081.L$0 = obj;
            return c09081;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.AbstractC5774b.m5119b(r5)
                goto L47
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                java.lang.Object r1 = r4.L$0
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                kotlin.AbstractC5774b.m5119b(r5)
                goto L39
            L20:
                kotlin.AbstractC5774b.m5119b(r5)
                java.lang.Object r5 = r4.L$0
                r1 = r5
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled
                if (r5 == 0) goto L39
                kotlinx.coroutines.w0 r5 = r4.$resetJob
                r4.L$0 = r1
                r4.label = r3
                java.lang.Object r5 = r5.mo5456e(r4)
                if (r5 != r0) goto L39
                goto L46
            L39:
                r6.e r5 = r4.$block
                r3 = 0
                r4.L$0 = r3
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                d6.s r5 = p045d6.C5443s.f8405a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C09081.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09081) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m5303f = "TapGestureDetector.kt", m5304i = {0}, m5305l = {384}, m5306m = "waitForLongPress", m5307n = {"result"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 */
    public static final class C09091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09091(InterfaceC5631c<? super C09091> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForLongPress(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", m5303f = "TapGestureDetector.kt", m5304i = {0, 1}, m5305l = {386, 409}, m5306m = "invokeSuspend", m5307n = {"$this$withTimeout", "$this$withTimeout"}, m5308s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n87#2,2:551\n34#2,6:553\n89#2:559\n102#2,2:560\n34#2,6:562\n104#2:568\n102#2,2:569\n34#2,6:571\n104#2:577\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n*L\n387#1:551,2\n387#1:553,6\n387#1:559\n399#1:560,2\n399#1:562,6\n399#1:568\n410#1:569,2\n410#1:571,6\n410#1:577\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 */
    public static final class C09102 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ PointerEventPass $pass;
        final /* synthetic */ Ref$ObjectRef<LongPressResult> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09102(PointerEventPass pointerEventPass, Ref$ObjectRef<LongPressResult> ref$ObjectRef, InterfaceC5631c<? super C09102> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$pass = pointerEventPass;
            this.$result = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09102 c09102 = new C09102(this.$pass, this.$result, interfaceC5631c);
            c09102.L$0 = obj;
            return c09102;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09102) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            r13.$result.element = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            r14 = r14.getChanges();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            if (r6 >= r5) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            if (r7.isConsumed() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        
            if (androidx.compose.p011ui.input.pointer.PointerEventKt.m11853isOutOfBoundsjwHxaWs(r7, r1.mo11816getSizeYbymL2g(), r1.mo11815getExtendedTouchPaddingNHjbRc()) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
        
            r13.$result.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        
            r14 = androidx.compose.p011ui.input.pointer.PointerEventPass.Final;
            r13.L$0 = r1;
            r13.label = 2;
            r14 = r1.awaitPointerEvent(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        
            if (r14 != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        
            r13.$result.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
        
            return p045d6.C5443s.f8405a;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.gestures.LongPressResult$Success] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Released] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009f -> B:34:0x00a2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r13.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r14)
                goto La2
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r14)
                goto L3e
            L26:
                kotlin.AbstractC5774b.m5119b(r14)
                java.lang.Object r14 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r14
            L2d:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = r13.$pass
                r13.L$0 = r14
                r13.label = r4
                java.lang.Object r1 = r14.awaitPointerEvent(r1, r13)
                if (r1 != r0) goto L3b
                goto La1
            L3b:
                r12 = r1
                r1 = r14
                r14 = r12
            L3e:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p011ui.input.pointer.PointerEvent) r14
                java.util.List r5 = r14.getChanges()
                int r6 = r5.size()
                r7 = r3
            L49:
                if (r7 >= r6) goto Lcc
                java.lang.Object r8 = r5.get(r7)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r8
                boolean r8 = androidx.compose.p011ui.input.pointer.PointerEventKt.changedToUp(r8)
                if (r8 != 0) goto Lc8
                boolean r5 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14)
                if (r5 == 0) goto L65
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r14 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Success r0 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
                r14.element = r0
                goto Ldf
            L65:
                java.util.List r14 = r14.getChanges()
                int r5 = r14.size()
                r6 = r3
            L6e:
                if (r6 >= r5) goto L95
                java.lang.Object r7 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r7
                boolean r8 = r7.isConsumed()
                if (r8 != 0) goto L8e
                long r8 = r1.mo11816getSizeYbymL2g()
                long r10 = r1.mo11815getExtendedTouchPaddingNHjbRc()
                boolean r7 = androidx.compose.p011ui.input.pointer.PointerEventKt.m11853isOutOfBoundsjwHxaWs(r7, r8, r10)
                if (r7 == 0) goto L8b
                goto L8e
            L8b:
                int r6 = r6 + 1
                goto L6e
            L8e:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r14 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Canceled r0 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
                r14.element = r0
                goto Ldf
            L95:
                androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.p011ui.input.pointer.PointerEventPass.Final
                r13.L$0 = r1
                r13.label = r2
                java.lang.Object r14 = r1.awaitPointerEvent(r14, r13)
                if (r14 != r0) goto La2
            La1:
                return r0
            La2:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p011ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.getChanges()
                int r5 = r14.size()
                r6 = r3
            Lad:
                if (r6 >= r5) goto Lc5
                java.lang.Object r7 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r7
                boolean r7 = r7.isConsumed()
                if (r7 == 0) goto Lc2
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r14 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Canceled r0 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
                r14.element = r0
                goto Ldf
            Lc2:
                int r6 = r6 + 1
                goto Lad
            Lc5:
                r14 = r1
                goto L2d
            Lc8:
                int r7 = r7 + 1
                goto L49
            Lcc:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r0 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Released r1 = new androidx.compose.foundation.gestures.LongPressResult$Released
                java.util.List r14 = r14.getChanges()
                java.lang.Object r14 = r14.get(r3)
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r14
                r1.<init>(r14)
                r0.element = r1
            Ldf:
                d6.s r14 = p045d6.C5443s.f8405a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C09102.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m5303f = "TapGestureDetector.kt", m5304i = {0, 0, 1, 1}, m5305l = {352, 366}, m5306m = "waitForUpOrCancellation", m5307n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, m5308s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 */
    public static final class C09112 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09112(InterfaceC5631c<? super C09112> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstDown(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r7, boolean r8, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerEventPass r9, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C09022
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C09022) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.AbstractC5774b.m5119b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L4f
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.AbstractC5774b.m5119b(r10)
        L40:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p011ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L40
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z8, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z8, interfaceC5631c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitPrimaryFirstDown(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r5, boolean r6, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerEventPass r7, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C09031
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C09031) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.AbstractC5774b.m5119b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4f
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.AbstractC5774b.m5119b(r8)
        L40:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p011ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown(r8, r6, r3)
            if (r2 == 0) goto L40
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z8, PointerEventPass pointerEventPass, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, z8, pointerEventPass, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C09042(pointerInputChange, null), interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[LOOP:0: B:19:0x004e->B:20:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r8, p075h6.InterfaceC5631c<? super p045d6.C5443s> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C09051
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C09051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC5774b.m5119b(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.AbstractC5774b.m5119b(r9)
        L36:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p011ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p011ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4e:
            if (r6 >= r4) goto L5c
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L4e
        L5c:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L64:
            if (r5 >= r2) goto L76
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L73
            goto L36
        L73:
            int r5 = r5 + 1
            goto L64
        L76:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, h6.c):java.lang.Object");
    }

    @Nullable
    public static final Object detectTapAndPress(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6474f interfaceC6474f, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C09062(pointerInputScope, interfaceC6474f, interfaceC6471c, new PressGestureScopeImpl(pointerInputScope), null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6474f = NoPressGesture;
        }
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        return detectTapAndPress(pointerInputScope, interfaceC6474f, interfaceC6471c, interfaceC5631c);
    }

    @Nullable
    public static final Object detectTapGestures(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6474f interfaceC6474f, @Nullable InterfaceC6471c interfaceC6471c3, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C09072(pointerInputScope, interfaceC6474f, interfaceC6471c2, interfaceC6471c, interfaceC6471c3, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6474f interfaceC6474f, InterfaceC6471c interfaceC6471c3, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 2) != 0) {
            interfaceC6471c2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC6474f = NoPressGesture;
        }
        if ((i & 8) != 0) {
            interfaceC6471c3 = null;
        }
        return detectTapGestures(pointerInputScope, interfaceC6471c, interfaceC6471c2, interfaceC6474f, interfaceC6471c3, interfaceC5631c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineStart getCoroutineStartForCurrentDispatchBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT;
    }

    private static /* synthetic */ void getCoroutineStartForCurrentDispatchBehavior$annotations() {
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    @Deprecated(message = "This flag has been moved to ComposeFoundationFlags and renamed to isDetectTapGesturesImmediateCoroutineDispatchEnabled. For compatibility,  DetectTapGesturesEnableNewDispatchingBehavior controls the new flag (isDetectTapGesturesImmediateCoroutineDispatchEnabled). Please use  isDetectTapGesturesImmediateCoroutineDispatchEnabled instead.", replaceWith = @ReplaceWith(expression = "isDetectTapGesturesImmediateCoroutineDispatchEnabled", imports = {"androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled"}))
    @ExperimentalTapGestureDetectorBehaviorApi
    public static /* synthetic */ void getDetectTapGesturesEnableNewDispatchingBehavior$annotations() {
    }

    private static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z8, boolean z9) {
        if (z9) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!PointerType.m11979equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m11984getMouseT8wyACA())) {
                        break;
                    }
                    i++;
                } else if (!PointerEvent_androidKt.m11881isPrimaryPressedaHzCxE(pointerEvent.getButtons())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            PointerInputChange pointerInputChange = changes2.get(i8);
            if (!(z8 ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 2) != 0) {
            z9 = TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
        }
        return isChangedToDown(pointerEvent, z8, z9);
    }

    private static final InterfaceC6013w0 launchAwaitingReset(InterfaceC6009v interfaceC6009v, InterfaceC6013w0 interfaceC6013w0, CoroutineStart coroutineStart, InterfaceC6473e interfaceC6473e) {
        return AbstractC6014x.m5651v(interfaceC6009v, null, coroutineStart, new C09081(interfaceC6013w0, interfaceC6473e, null), 1);
    }

    public static /* synthetic */ InterfaceC6013w0 launchAwaitingReset$default(InterfaceC6009v interfaceC6009v, InterfaceC6013w0 interfaceC6013w0, CoroutineStart coroutineStart, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineStart = getCoroutineStartForCurrentDispatchBehavior();
        }
        return launchAwaitingReset(interfaceC6009v, interfaceC6013w0, coroutineStart, interfaceC6473e);
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final void setDetectTapGesturesEnableNewDispatchingBehavior(boolean z8) {
        ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForLongPress(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r7, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerEventPass r8, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.foundation.gestures.LongPressResult> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C09091
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C09091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            goto L59
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.AbstractC5774b.m5119b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
            r9.element = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            long r4 = r2.getLongPressTimeoutMillis()     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            r0.L$0 = r9     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            r0.label = r3     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            java.lang.Object r7 = r7.withTimeout(r4, r2, r0)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L5c
            if (r7 != r1) goto L58
            return r1
        L58:
            r7 = r9
        L59:
            T r7 = r7.element
            return r7
        L5c:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00be -> B:13:0x0035). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r17, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerEventPass r18, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, interfaceC5631c);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z8, PointerEventPass pointerEventPass, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z8, pointerEventPass, interfaceC5631c);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z8, InterfaceC5631c interfaceC5631c) {
        return awaitFirstDown(awaitPointerEventScope, z8, PointerEventPass.Main, interfaceC5631c);
    }
}
