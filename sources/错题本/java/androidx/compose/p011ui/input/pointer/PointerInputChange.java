package androidx.compose.p011ui.input.pointer;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b1\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014B]\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015BS\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0018Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 Jl\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&Jj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b(\u0010)Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b,\u0010-Jz\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0084\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u00107R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b9\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b@\u00107R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\bA\u00107R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bB\u0010<R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bF\u00107R\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR(\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u00105\u001a\u0004\bI\u00107\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010OR$\u0010S\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010Y\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bY\u0010Z\u0012\u0004\b[\u0010 R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\f\u0012\u0004\b^\u0010 \u001a\u0004\b\\\u0010]R\u0011\u0010_\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b_\u0010<R\u001a\u0010\u0017\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010 \u001a\u0004\b`\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/PointerType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/e;)V", "(JJJZJJZZIJLkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/input/pointer/ConsumedData;", "consumed", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/e;)V", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/e;)V", "Ld6/s;", "consume", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "()Ljava/lang/String;", "J", "getId-J3iCeTQ", "()J", "getUptimeMillis", "getPosition-F1C5BW0", "Z", "getPressed", "()Z", "F", "getPressure", "()F", "getPreviousUptimeMillis", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "I", "getType-T8wyACA", "()I", "getScrollDelta-F1C5BW0", "_historical", "Ljava/util/List;", "getOriginalEventPosition-F1C5BW0$ui_release", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "downChange", "getDownChange$ui_release", "setDownChange$ui_release", "(Z)V", "positionChange", "getPositionChange$ui_release", "setPositionChange$ui_release", "consumedDelegate", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getConsumedDelegate$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setConsumedDelegate$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "_consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "get_consumed$annotations", "getHistorical", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PointerInputChange {
    public static final int $stable = 0;

    @Nullable
    private ConsumedData _consumed;

    @Nullable
    private List<HistoricalChange> _historical;

    @Nullable
    private PointerInputChange consumedDelegate;
    private boolean downChange;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, boolean z10, int i, long j12, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, f, j10, j11, z9, z10, i, j12);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m11894copy0GkPj7c$default(PointerInputChange pointerInputChange, long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, ConsumedData consumedData, int i, long j12, int i8, Object obj) {
        long j13;
        long j14 = (i8 & 1) != 0 ? pointerInputChange.id : j7;
        long j15 = (i8 & 2) != 0 ? pointerInputChange.uptimeMillis : j8;
        long j16 = (i8 & 4) != 0 ? pointerInputChange.position : j9;
        boolean z10 = (i8 & 8) != 0 ? pointerInputChange.pressed : z8;
        long j17 = (i8 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j10;
        long j18 = (i8 & 32) != 0 ? pointerInputChange.previousPosition : j11;
        boolean z11 = (i8 & 64) != 0 ? pointerInputChange.previousPressed : z9;
        int i9 = (i8 & 256) != 0 ? pointerInputChange.type : i;
        if ((i8 & 512) != 0) {
            j13 = pointerInputChange.scrollDelta;
            j14 = j14;
        } else {
            j13 = j12;
        }
        return pointerInputChange.m11900copy0GkPj7c(j14, j15, j16, z10, j17, j18, z11, consumedData, i9, j13);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m11896copyJKmWfYY$default(PointerInputChange pointerInputChange, long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, int i, long j12, int i8, Object obj) {
        long j13;
        long j14;
        long j15 = (i8 & 1) != 0 ? pointerInputChange.id : j7;
        long j16 = (i8 & 2) != 0 ? pointerInputChange.uptimeMillis : j8;
        long j17 = (i8 & 4) != 0 ? pointerInputChange.position : j9;
        boolean z10 = (i8 & 8) != 0 ? pointerInputChange.pressed : z8;
        long j18 = (i8 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j10;
        long j19 = (i8 & 32) != 0 ? pointerInputChange.previousPosition : j11;
        boolean z11 = (i8 & 64) != 0 ? pointerInputChange.previousPressed : z9;
        int i9 = (i8 & 128) != 0 ? pointerInputChange.type : i;
        if ((i8 & 256) != 0) {
            j13 = pointerInputChange.scrollDelta;
            j14 = j15;
        } else {
            j13 = j12;
            j14 = j15;
        }
        return pointerInputChange.m11902copyJKmWfYY(j14, j16, j17, z10, j18, j19, z11, i9, j13);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m11897copyOHpmEuE$default(PointerInputChange pointerInputChange, long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, int i, List list, long j12, int i8, Object obj) {
        long j13;
        long j14 = (i8 & 1) != 0 ? pointerInputChange.id : j7;
        long j15 = (i8 & 2) != 0 ? pointerInputChange.uptimeMillis : j8;
        long j16 = (i8 & 4) != 0 ? pointerInputChange.position : j9;
        boolean z10 = (i8 & 8) != 0 ? pointerInputChange.pressed : z8;
        long j17 = (i8 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j10;
        long j18 = (i8 & 32) != 0 ? pointerInputChange.previousPosition : j11;
        boolean z11 = (i8 & 64) != 0 ? pointerInputChange.previousPressed : z9;
        int i9 = (i8 & 128) != 0 ? pointerInputChange.type : i;
        if ((i8 & 512) != 0) {
            j13 = pointerInputChange.scrollDelta;
            j14 = j14;
        } else {
            j13 = j12;
        }
        return pointerInputChange.m11903copyOHpmEuE(j14, j15, j16, z10, j17, j18, z11, i9, list, j13);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m11898copyTn9QgHE$default(PointerInputChange pointerInputChange, long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, int i, long j12, int i8, Object obj) {
        long j13;
        long j14;
        long j15 = (i8 & 1) != 0 ? pointerInputChange.id : j7;
        long j16 = (i8 & 2) != 0 ? pointerInputChange.uptimeMillis : j8;
        long j17 = (i8 & 4) != 0 ? pointerInputChange.position : j9;
        boolean z10 = (i8 & 8) != 0 ? pointerInputChange.pressed : z8;
        float f7 = (i8 & 16) != 0 ? pointerInputChange.pressure : f;
        long j18 = (i8 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j10;
        long j19 = (i8 & 64) != 0 ? pointerInputChange.previousPosition : j11;
        boolean z11 = (i8 & 128) != 0 ? pointerInputChange.previousPressed : z9;
        int i9 = (i8 & 256) != 0 ? pointerInputChange.type : i;
        if ((i8 & 512) != 0) {
            j13 = pointerInputChange.scrollDelta;
            j14 = j15;
        } else {
            j13 = j12;
            j14 = j15;
        }
        return pointerInputChange.m11904copyTn9QgHE(j14, j16, j17, z10, f7, j18, j19, z11, i9, j13);
    }

    /* renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m11899copywbzehF4$default(PointerInputChange pointerInputChange, long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, int i, List list, long j12, int i8, Object obj) {
        long j13;
        List list2;
        long j14 = (i8 & 1) != 0 ? pointerInputChange.id : j7;
        long j15 = (i8 & 2) != 0 ? pointerInputChange.uptimeMillis : j8;
        long j16 = (i8 & 4) != 0 ? pointerInputChange.position : j9;
        boolean z10 = (i8 & 8) != 0 ? pointerInputChange.pressed : z8;
        float f7 = (i8 & 16) != 0 ? pointerInputChange.pressure : f;
        long j17 = (i8 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j10;
        long j18 = (i8 & 64) != 0 ? pointerInputChange.previousPosition : j11;
        boolean z11 = (i8 & 128) != 0 ? pointerInputChange.previousPressed : z9;
        int i9 = (i8 & 256) != 0 ? pointerInputChange.type : i;
        long j19 = j14;
        List historical = (i8 & 512) != 0 ? pointerInputChange.getHistorical() : list;
        if ((i8 & 1024) != 0) {
            list2 = historical;
            j13 = pointerInputChange.scrollDelta;
        } else {
            j13 = j12;
            list2 = historical;
        }
        return pointerInputChange.m11905copywbzehF4(j19, j15, j16, z10, f7, j17, j18, z11, i9, list2, j13);
    }

    @Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_consumed$annotations() {
    }

    public final void consume() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.consume();
        }
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m11900copy0GkPj7c(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, @NotNull ConsumedData consumed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m11901copyEzrO64(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @NotNull
    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m11902copyJKmWfYY(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChangeM11905copywbzehF4 = m11905copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, getHistorical(), scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM11905copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM11905copywbzehF4;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m11903copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChangeM11905copywbzehF4 = m11905copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM11905copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM11905copywbzehF4;
    }

    @NotNull
    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m11904copyTn9QgHE(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    @NotNull
    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m11905copywbzehF4(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    @NotNull
    public final ConsumedData getConsumed() {
        if (this._consumed == null) {
            this._consumed = new ConsumedData(this);
        }
        ConsumedData consumedData = this._consumed;
        AbstractC5830k.m5327d(consumedData);
        return consumedData;
    }

    @Nullable
    /* renamed from: getConsumedDelegate$ui_release, reason: from getter */
    public final PointerInputChange getConsumedDelegate() {
        return this.consumedDelegate;
    }

    /* renamed from: getDownChange$ui_release, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name and from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: getPositionChange$ui_release, reason: from getter */
    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.isConsumed() : this.downChange || this.positionChange;
    }

    public final void setConsumedDelegate$ui_release(@Nullable PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void setDownChange$ui_release(boolean z8) {
        this.downChange = z8;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m11912setOriginalEventPositionk4lQ0M$ui_release(long j7) {
        this.originalEventPosition = j7;
    }

    public final void setPositionChange$ui_release(boolean z8) {
        this.positionChange = z8;
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m11892toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m10449toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m10449toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m11981toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m10449toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, boolean z10, int i, List list, long j12, long j13, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, f, j10, j11, z9, z10, i, (List<HistoricalChange>) list, j12, j13);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, ConsumedData consumedData, int i, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, j10, j11, z9, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, boolean z10, int i, long j12, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, j10, j11, z9, z10, i, j12);
    }

    private PointerInputChange(long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, boolean z10, int i, long j12) {
        this.id = j7;
        this.uptimeMillis = j8;
        this.position = j9;
        this.pressed = z8;
        this.pressure = f;
        this.previousUptimeMillis = j10;
        this.previousPosition = j11;
        this.previousPressed = z9;
        this.type = i;
        this.scrollDelta = j12;
        this.originalEventPosition = Offset.INSTANCE.m10457getZeroF1C5BW0();
        this.downChange = z10;
        this.positionChange = z10;
    }

    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, boolean z10, int i, long j12, int i8, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, f, j10, j11, z9, z10, (i8 & 512) != 0 ? PointerType.INSTANCE.m11986getTouchT8wyACA() : i, (i8 & 1024) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j12, (AbstractC5824e) null);
    }

    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, boolean z10, int i, long j12, int i8, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, j10, j11, z9, z10, (i8 & 256) != 0 ? PointerType.INSTANCE.m11986getTouchT8wyACA() : i, (i8 & 512) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j12, (AbstractC5824e) null);
    }

    private PointerInputChange(long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, boolean z10, int i, long j12) {
        this(j7, j8, j9, z8, 1.0f, j10, j11, z9, z10, i, j12, (AbstractC5824e) null);
    }

    public /* synthetic */ PointerInputChange(long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, ConsumedData consumedData, int i, int i8, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, z8, j10, j11, z9, consumedData, (i8 & 256) != 0 ? PointerType.INSTANCE.m11986getTouchT8wyACA() : i, (AbstractC5824e) null);
    }

    private PointerInputChange(long j7, long j8, long j9, boolean z8, long j10, long j11, boolean z9, ConsumedData consumedData, int i) {
        this(j7, j8, j9, z8, 1.0f, j10, j11, z9, consumedData.getDownChange() || consumedData.getPositionChange(), i, Offset.INSTANCE.m10457getZeroF1C5BW0(), (AbstractC5824e) null);
    }

    private PointerInputChange(long j7, long j8, long j9, boolean z8, float f, long j10, long j11, boolean z9, boolean z10, int i, List<HistoricalChange> list, long j12, long j13) {
        this(j7, j8, j9, z8, f, j10, j11, z9, z10, i, j12, (AbstractC5824e) null);
        this._historical = list;
        this.originalEventPosition = j13;
    }
}
