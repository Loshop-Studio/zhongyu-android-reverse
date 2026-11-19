package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0080\u0001\u0010\u000e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\t*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0015\u001a\u00020\t*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\t*\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u0011\u0010\u0017\u001a\u00020\u0004*\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "centroid", "pan", "", "zoom", Key.ROTATION, "Ld6/s;", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLr6/g;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "(Landroidx/compose/ui/input/pointer/PointerEvent;)F", "angle-k-4lQ0M", "(J)F", "angle", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,255:1\n133#2,3:256\n34#2,6:259\n136#2:265\n34#2,6:266\n34#2,6:277\n34#2,6:283\n65#3:272\n69#3:275\n60#4:273\n70#4:276\n22#5:274\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,6\n116#1:265\n131#1:266,6\n217#1:277,6\n242#1:283,6\n162#1:272\n162#1:275\n162#1:273\n162#1:276\n162#1:274\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m5303f = "TransformGestureDetector.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m5305l = {60, 62}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m5308s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n102#2,2:256\n34#2,6:258\n104#2:264\n34#2,6:265\n102#2,2:271\n34#2,6:273\n104#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n63#1:256,2\n63#1:258,6\n63#1:264\n95#1:265,6\n102#1:271,2\n102#1:273,6\n102#1:279\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    public static final class C09122 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6475g $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09122(boolean z8, InterfaceC6475g interfaceC6475g, InterfaceC5631c<? super C09122> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$panZoomLock = z8;
            this.$onGesture = interfaceC6475g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09122 c09122 = new C09122(this.$panZoomLock, this.$onGesture, interfaceC5631c);
            c09122.L$0 = obj;
            return c09122;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09122) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0091 -> B:17:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.C09122.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m7062anglek4lQ0M(long j7) {
        if (Float.intBitsToFloat((int) (j7 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j7 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j7 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent, boolean z8) {
        long jM10457getZeroF1C5BW0 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            PointerInputChange pointerInputChange = changes.get(i8);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM10457getZeroF1C5BW0 = Offset.m10446plusMKHz9U(jM10457getZeroF1C5BW0, z8 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i++;
            }
        }
        return i == 0 ? Offset.INSTANCE.m10456getUnspecifiedF1C5BW0() : Offset.m10436divtuRUvjQ(jM10457getZeroF1C5BW0, i);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        return calculateCentroid(pointerEvent, z8);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent, boolean z8) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z8);
        float fM10439getDistanceimpl = 0.0f;
        if (Offset.m10438equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m10456getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            PointerInputChange pointerInputChange = changes.get(i8);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                i++;
                fM10439getDistanceimpl = Offset.m10439getDistanceimpl(Offset.m10445minusMKHz9U(z8 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid)) + fM10439getDistanceimpl;
            }
        }
        return fM10439getDistanceimpl / i;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        return calculateCentroidSize(pointerEvent, z8);
    }

    public static final long calculatePan(@NotNull PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m10438equalsimpl0(jCalculateCentroid, companion.m10456getUnspecifiedF1C5BW0()) ? companion.m10457getZeroF1C5BW0() : Offset.m10445minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            int i9 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i9 = 0;
            }
            i8 += i9;
            i++;
        }
        if (i8 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < size2; i10++) {
            PointerInputChange pointerInputChange2 = changes2.get(i10);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM10445minusMKHz9U = Offset.m10445minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM10445minusMKHz9U2 = Offset.m10445minusMKHz9U(position, jCalculateCentroid);
                float fM7062anglek4lQ0M = m7062anglek4lQ0M(jM10445minusMKHz9U2) - m7062anglek4lQ0M(jM10445minusMKHz9U);
                float fM10439getDistanceimpl = Offset.m10439getDistanceimpl(Offset.m10446plusMKHz9U(jM10445minusMKHz9U2, jM10445minusMKHz9U)) / 2.0f;
                if (fM7062anglek4lQ0M > 180.0f) {
                    fM7062anglek4lQ0M -= 360.0f;
                } else if (fM7062anglek4lQ0M < -180.0f) {
                    fM7062anglek4lQ0M += 360.0f;
                }
                f7 += fM7062anglek4lQ0M * fM10439getDistanceimpl;
                f += fM10439getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f7 / f;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope, boolean z8, @NotNull InterfaceC6475g interfaceC6475g, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C09122(z8, interfaceC6475g, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z8, InterfaceC6475g interfaceC6475g, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        return detectTransformGestures(pointerInputScope, z8, interfaceC6475g, interfaceC5631c);
    }
}
