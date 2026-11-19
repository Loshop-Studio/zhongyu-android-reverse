package androidx.compose.foundation.gestures;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerEventType;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.C5803r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5878g;
import kotlinx.coroutines.channels.C5879h;
import kotlinx.coroutines.channels.InterfaceC5876e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p214z6.AbstractC6832j;
import p214z6.InterfaceC6830h;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001aBR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00121\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0018\u001a\u00020\f*\u00020\u00022'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u0004\u0018\u00010\"*\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0004\b%\u0010&J+\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010'2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000(H\u0002¢\u0006\u0004\b+\u0010,J\u001e\u00101\u001a\u00020\u001d*\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\u0006\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b2\u00103J,\u00107\u001a\u00020\f*\u00020\u00022\u0006\u0010.\u001a\u00020\"2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0082@¢\u0006\u0004\b7\u00108J[\u0010B\u001a\u00020\f*\u00020\u00152\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020:092\u0006\u0010<\u001a\u0002042\u0006\u0010>\u001a\u00020=2!\u0010A\u001a\u001d\u0012\u0013\u0012\u001104¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u001d0?H\u0082@¢\u0006\u0004\bB\u0010CJ\u001b\u00107\u001a\u000204*\u00020\u00152\u0006\u0010D\u001a\u000204H\u0002¢\u0006\u0004\b7\u0010EJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GJ(\u0010L\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010I\u001a\u00020H2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0015\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR?\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0019\u0010_\u001a\u00020\u001d*\u00020\u00128Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006b"}, m5110d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollConfig;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "Lh6/c;", "Ld6/s;", "onScrollStopped", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/ScrollConfig;Lr6/e;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "consume", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/ExtensionFunctionType;", "block", "userScroll", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lr6/e;Lh6/c;)Ljava/lang/Object;", "pointerEvent", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onMouseWheel-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "onMouseWheel", "Lkotlinx/coroutines/channels/e;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "sumOrNull", "(Lkotlinx/coroutines/channels/e;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "busyReceive", "(Lkotlinx/coroutines/channels/e;Lh6/c;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function0;", "builderAction", "Lz6/h;", "untilNull", "(Lr6/a;)Lz6/h;", "Landroidx/compose/ui/geometry/Offset;", "scrollDelta", "canConsumeDelta-Uv8p0NA", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "canConsumeDelta", "trackVelocity", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)V", "", "threshold", "speed", "dispatchMouseWheelScroll", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;FFLh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "animationState", "targetValue", "", "durationMillis", "Lkotlin/Function1;", "lastValue", "shouldCancelAnimation", "animateMouseWheelScroll", "(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILr6/c;Lh6/c;)Ljava/lang/Object;", "delta", "(Landroidx/compose/foundation/gestures/NestedScrollScope;F)F", "updateDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "Lkotlinx/coroutines/v;", "coroutineScope", "startReceivingMouseWheelEvents", "(Lkotlinx/coroutines/v;)V", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Lr6/e;", "Landroidx/compose/ui/unit/Density;", "channel", "Lkotlinx/coroutines/channels/e;", "isScrolling", "Z", "Lkotlinx/coroutines/w0;", "receivingMouseWheelEventsJob", "Lkotlinx/coroutines/w0;", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "velocityTracker", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "isConsumed", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "MouseWheelScrollDelta", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n73#1:364\n102#2,2:365\n34#2,6:367\n104#2:373\n102#2,2:374\n34#2,6:376\n104#2:382\n34#2,6:383\n1#3:389\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n*L\n63#1:364\n63#1:365,2\n63#1:367,6\n63#1:373\n73#1:374,2\n73#1:376,6\n73#1:382\n75#1:383,6\n*E\n"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic {
    public static final int $stable = 8;

    @NotNull
    private Density density;
    private boolean isScrolling;

    @NotNull
    private final ScrollConfig mouseWheelScrollConfig;

    @NotNull
    private final InterfaceC6473e onScrollStopped;

    @Nullable
    private InterfaceC6013w0 receivingMouseWheelEventsJob;

    @NotNull
    private final ScrollingLogic scrollingLogic;

    @NotNull
    private final InterfaceC5876e channel = AbstractC5882k.m5511a(Integer.MAX_VALUE, 6, null);

    @NotNull
    private final MouseWheelVelocityTracker velocityTracker = new MouseWheelVelocityTracker();

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m5110d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "Landroidx/compose/ui/geometry/Offset;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/e;)V", "other", "plus", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "component1-F1C5BW0", "()J", "component1", "component2", "component3", "()Z", "copy-9KIMszo", "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "getValue-F1C5BW0", "getTimeMillis", "Z", "getShouldApplyImmediately", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long j7, long j8, boolean z8, AbstractC5824e abstractC5824e) {
            this(j7, j8, z8);
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m6999copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j7, long j8, boolean z8, int i, Object obj) {
            if ((i & 1) != 0) {
                j7 = mouseWheelScrollDelta.value;
            }
            long j9 = j7;
            if ((i & 2) != 0) {
                j8 = mouseWheelScrollDelta.timeMillis;
            }
            long j10 = j8;
            if ((i & 4) != 0) {
                z8 = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m7001copy9KIMszo(j9, j10, z8);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
        public final long getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        @NotNull
        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m7001copy9KIMszo(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return Offset.m10438equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m7002getValueF1C5BW0() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldApplyImmediately) + AbstractC0584a.m897B(this.timeMillis, Offset.m10443hashCodeimpl(this.value) * 31, 31);
        }

        @NotNull
        public final MouseWheelScrollDelta plus(@NotNull MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(Offset.m10446plusMKHz9U(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) Offset.m10449toStringimpl(this.value));
            sb.append(", timeMillis=");
            sb.append(this.timeMillis);
            sb.append(", shouldApplyImmediately=");
            return AbstractC0037f.m93r(sb, this.shouldApplyImmediately, ')');
        }

        private MouseWheelScrollDelta(long j7, long j8, boolean z8) {
            this.value = j7;
            this.timeMillis = j8;
            this.shouldApplyImmediately = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "<anonymous>", "(Lkotlinx/coroutines/v;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", m5303f = "MouseWheelScrollable.kt", m5304i = {0}, m5305l = {170}, m5306m = "invokeSuspend", m5307n = {"job"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2 */
    public static final class C08752 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC5876e $this_busyReceive;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08752(InterfaceC5876e interfaceC5876e, InterfaceC5631c<? super C08752> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_busyReceive = interfaceC5876e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08752 c08752 = new C08752(this.$this_busyReceive, interfaceC5631c);
            c08752.L$0 = obj;
            return c08752;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6013w0 interfaceC6013w0;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                C5976k1 c5976k1M5651v = AbstractC6014x.m5651v((InterfaceC6009v) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3);
                try {
                    InterfaceC5876e interfaceC5876e = this.$this_busyReceive;
                    this.L$0 = c5976k1M5651v;
                    this.label = 1;
                    Object objMo5492o = interfaceC5876e.mo5492o(this);
                    if (objMo5492o == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC6013w0 = c5976k1M5651v;
                    obj = objMo5492o;
                } catch (Throwable th2) {
                    interfaceC6013w0 = c5976k1M5651v;
                    th = th2;
                    interfaceC6013w0.cancel(null);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6013w0 = (InterfaceC6013w0) this.L$0;
                try {
                    AbstractC5774b.m5119b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC6013w0.cancel(null);
                    throw th;
                }
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            interfaceC6013w0.cancel(null);
            return mouseWheelScrollDelta;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super MouseWheelScrollDelta> interfaceC5631c) {
            return ((C08752) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m5303f = "MouseWheelScrollable.kt", m5304i = {0, 0, 0, 0}, m5305l = {244, 295}, m5306m = "dispatchMouseWheelScroll", m5307n = {"this", "$this$dispatchMouseWheelScroll", "targetValue", "speed"}, m5308s = {"L$0", "L$1", "L$2", "F$0"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 */
    public static final class C08771 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C08771(InterfaceC5631c<? super C08771> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.dispatchMouseWheelScroll(null, null, 0.0f, 0.0f, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/NestedScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/NestedScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", m5303f = "MouseWheelScrollable.kt", m5304i = {0, 0, 1, 1, 1, 2, 2}, m5305l = {253, 266, 283}, m5306m = "invokeSuspend", m5307n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, m5308s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 */
    public static final class C08783 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> $animationState;
        final /* synthetic */ float $speed;
        final /* synthetic */ Ref$ObjectRef<MouseWheelScrollDelta> $targetScrollDelta;
        final /* synthetic */ Ref$FloatRef $targetValue;
        final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
        final /* synthetic */ float $threshold;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08783(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> ref$ObjectRef, Ref$ObjectRef<MouseWheelScrollDelta> ref$ObjectRef2, float f, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f7, ScrollingLogic scrollingLogic, InterfaceC5631c<? super C08783> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$targetValue = ref$FloatRef;
            this.$animationState = ref$ObjectRef;
            this.$targetScrollDelta = ref$ObjectRef2;
            this.$threshold = f;
            this.this$0 = mouseWheelScrollingLogic;
            this.$speed = f7;
            this.$this_dispatchMouseWheelScroll = scrollingLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08783 c08783 = new C08783(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, interfaceC5631c);
            c08783.L$0 = obj;
            return c08783;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08783) create(nestedScrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
        /* JADX WARN: Type inference failed for: r2v12, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x014e -> B:34:0x0150). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015c -> B:13:0x0065). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C08783.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", m5303f = "MouseWheelScrollable.kt", m5304i = {0, 1}, m5305l = {107, 110}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "$this$launch"}, m5308s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 */
    public static final class C08811 extends SuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;

        public C08811(InterfaceC5631c<? super C08811> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08811 c08811 = MouseWheelScrollingLogic.this.new C08811(interfaceC5631c);
            c08811.L$0 = obj;
            return c08811;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                java.lang.Object r1 = r12.L$0
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                kotlin.AbstractC5774b.m5119b(r13)     // Catch: java.lang.Throwable -> L17
                r10 = r12
            L15:
                r13 = r1
                goto L33
            L17:
                r0 = move-exception
                r13 = r0
                r10 = r12
                goto L92
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L24:
                java.lang.Object r1 = r12.L$0
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                kotlin.AbstractC5774b.m5119b(r13)     // Catch: java.lang.Throwable -> L17
                goto L52
            L2c:
                kotlin.AbstractC5774b.m5119b(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.v r13 = (kotlinx.coroutines.InterfaceC6009v) r13
            L33:
                h6.h r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L86
                boolean r1 = kotlinx.coroutines.AbstractC6014x.m5647r(r1)     // Catch: java.lang.Throwable -> L86
                if (r1 == 0) goto L89
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L86
                kotlinx.coroutines.channels.e r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getChannel$p(r1)     // Catch: java.lang.Throwable -> L86
                r12.L$0 = r13     // Catch: java.lang.Throwable -> L86
                r12.label = r4     // Catch: java.lang.Throwable -> L86
                java.lang.Object r1 = r1.mo5492o(r12)     // Catch: java.lang.Throwable -> L86
                if (r1 != r0) goto L4f
                r10 = r12
                goto L82
            L4f:
                r11 = r1
                r1 = r13
                r13 = r11
            L52:
                r7 = r13
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r7 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L86
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L86
                androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L86
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationThreshold$p()     // Catch: java.lang.Throwable -> L86
                float r8 = r13.mo6903toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L86
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L86
                androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L86
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationSpeed$p()     // Catch: java.lang.Throwable -> L86
                float r9 = r13.mo6903toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L86
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L86
                androidx.compose.foundation.gestures.ScrollingLogic r6 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getScrollingLogic$p(r5)     // Catch: java.lang.Throwable -> L86
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L86
                r12.label = r3     // Catch: java.lang.Throwable -> L86
                r10 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
                if (r13 != r0) goto L15
            L82:
                return r0
            L83:
                r0 = move-exception
            L84:
                r13 = r0
                goto L92
            L86:
                r0 = move-exception
                r10 = r12
                goto L84
            L89:
                r10 = r12
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r13, r2)
                d6.s r13 = p045d6.C5443s.f8405a
                return r13
            L92:
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C08811.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08811) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.LONGITUDE_EAST, "Lz6/j;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", m5303f = "MouseWheelScrollable.kt", m5304i = {0}, m5305l = {179}, m5306m = "invokeSuspend", m5307n = {"$this$sequence"}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1 */
    public static final class C08831 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6469a $builderAction;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08831(InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super C08831> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$builderAction = interfaceC6469a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08831 c08831 = new C08831(this.$builderAction, interfaceC5631c);
            c08831.L$0 = obj;
            return c08831;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:15:0x0039). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:15:0x0039). Please report as a decompilation issue!!! */
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
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.L$1
                java.lang.Object r3 = r4.L$0
                z6.j r3 = (p214z6.AbstractC6832j) r3
                kotlin.AbstractC5774b.m5119b(r5)
                goto L39
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.AbstractC5774b.m5119b(r5)
                java.lang.Object r5 = r4.L$0
                z6.j r5 = (p214z6.AbstractC6832j) r5
                r3 = r5
            L23:
                r6.a r5 = r4.$builderAction
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L38
                r4.L$0 = r3
                r4.L$1 = r1
                r4.label = r2
                kotlin.coroutines.intrinsics.CoroutineSingletons r5 = r3.mo6491a(r4, r1)
                if (r5 != r0) goto L39
                return r0
            L38:
                r1 = 0
            L39:
                if (r1 != 0) goto L23
                d6.s r5 = p045d6.C5443s.f8405a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C08831.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08831) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m5303f = "MouseWheelScrollable.kt", m5304i = {0}, m5305l = {122}, m5306m = "userScroll", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 */
    public static final class C08841 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08841(InterfaceC5631c<? super C08841> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.userScroll(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", m5303f = "MouseWheelScrollable.kt", m5304i = {}, m5305l = {122}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 */
    public static final class C08852 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ ScrollingLogic $this_userScroll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08852(ScrollingLogic scrollingLogic, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C08852> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_userScroll = scrollingLogic;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C08852(this.$this_userScroll, this.$block, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                ScrollingLogic scrollingLogic = this.$this_userScroll;
                MutatePriority mutatePriority = MutatePriority.UserInput;
                InterfaceC6473e interfaceC6473e = this.$block;
                this.label = 1;
                if (scrollingLogic.scroll(mutatePriority, interfaceC6473e, this) == coroutineSingletons) {
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
            return ((C08852) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public MouseWheelScrollingLogic(@NotNull ScrollingLogic scrollingLogic, @NotNull ScrollConfig scrollConfig, @NotNull InterfaceC6473e interfaceC6473e, @NotNull Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = interfaceC6473e;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f, int i, final InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = animationState.getValue().floatValue();
        Object objAnimateTo = SuspendAnimationKt.animateTo(animationState, new Float(f), AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), true, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.animateMouseWheelScroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return C5443s.f8405a;
            }

            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                float fFloatValue = animationScope.getValue().floatValue() - ref$FloatRef.element;
                if (!MouseWheelScrollableKt.isLowScrollingDelta(fFloatValue)) {
                    if (!MouseWheelScrollableKt.isLowScrollingDelta(fFloatValue - this.dispatchMouseWheelScroll(nestedScrollScope, fFloatValue))) {
                        animationScope.cancelAnimation();
                        return;
                    } else {
                        ref$FloatRef.element += fFloatValue;
                    }
                }
                if (((Boolean) interfaceC6471c.invoke(Float.valueOf(ref$FloatRef.element))).booleanValue()) {
                    animationScope.cancelAnimation();
                }
            }
        }, interfaceC5631c);
        return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object busyReceive(InterfaceC5876e interfaceC5876e, InterfaceC5631c<? super MouseWheelScrollDelta> interfaceC5631c) {
        return AbstractC6014x.m5637h(new C08752(interfaceC5876e, null), interfaceC5631c);
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m6996canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j7) {
        float fM7051toFloatk4lQ0M = scrollingLogic.m7051toFloatk4lQ0M(scrollingLogic.m7049reverseIfNeededMKHz9U(j7));
        if (fM7051toFloatk4lQ0M == 0.0f) {
            return false;
        }
        return fM7051toFloatk4lQ0M > 0.0f ? scrollingLogic.getScrollableState().getCanScrollForward() : scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    private final void consume(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changes.get(i).consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic r24, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r25, float r26, float r27, p075h6.InterfaceC5631c<? super p045d6.C5443s> r28) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r20, kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> r21, kotlin.jvm.internal.Ref$FloatRef r22, androidx.compose.foundation.gestures.ScrollingLogic r23, kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r24, long r25, p075h6.InterfaceC5631c<? super java.lang.Boolean> r27) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, long, h6.c):java.lang.Object");
    }

    private final boolean isConsumed(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m6997onMouseWheelO0kMr_c(PointerEvent pointerEvent, long bounds) {
        if (m6996canConsumeDeltaUv8p0NA(this.scrollingLogic, this.mouseWheelScrollConfig.mo6925calculateMouseWheelScroll8xgXZGE(this.density, pointerEvent, bounds))) {
            return !(this.channel.mo5481a(new MouseWheelScrollDelta(r3, ((PointerInputChange) AbstractC5805t.m5228h0(pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)) instanceof C5878g);
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final InterfaceC5876e interfaceC5876e) {
        MouseWheelScrollDelta mouseWheelScrollDeltaPlus = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : untilNull(new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.sumOrNull.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final MouseWheelScrollDelta invoke() {
                return (MouseWheelScrollDelta) C5879h.m5504a(interfaceC5876e.mo5487j());
            }
        })) {
            mouseWheelScrollDeltaPlus = mouseWheelScrollDeltaPlus == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaPlus.plus(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta scrollDelta) {
        this.velocityTracker.m7003addDeltaUv8p0NA(scrollDelta.getTimeMillis(), scrollDelta.m7002getValueF1C5BW0());
    }

    private final <E> InterfaceC6830h untilNull(InterfaceC6469a builderAction) {
        return new C5803r(new C08831(builderAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userScroll(androidx.compose.foundation.gestures.ScrollingLogic r5, p152r6.InterfaceC6473e r6, p075h6.InterfaceC5631c<? super p045d6.C5443s> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C08841
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C08841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r5
            kotlin.AbstractC5774b.m5119b(r7)
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r7)
            r4.isScrolling = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.l1 r5 = new kotlinx.coroutines.l1
            h6.h r6 = r0.getContext()
            r2 = 0
            r5.<init>(r6, r0, r2)
            java.lang.Object r5 = coil3.network.AbstractC3315g.m2244m(r5, r3, r5, r7)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r4
        L54:
            r6 = 0
            r5.isScrolling = r6
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.userScroll(androidx.compose.foundation.gestures.ScrollingLogic, r6.e, h6.c):java.lang.Object");
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m6998onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.Main && PointerEventType.m11857equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m11866getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (changes.get(i).isConsumed()) {
                    return;
                }
            }
            if (m6997onMouseWheelO0kMr_c(pointerEvent, bounds)) {
                consume(pointerEvent);
            }
        }
    }

    public final void startReceivingMouseWheelEvents(@NotNull InterfaceC6009v coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = AbstractC6014x.m5651v(coroutineScope, null, null, new C08811(null), 3);
        }
    }

    public final void updateDensity(@NotNull Density density) {
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.m7051toFloatk4lQ0M(scrollingLogic.m7049reverseIfNeededMKHz9U(nestedScrollScope.mo7005scrollByOzD1aCk(scrollingLogic.m7052toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f)), NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI())));
    }
}
