package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.ExperimentalComposeUiApi;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(m13557d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B[\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0002\u0010\u001bBa\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u0006\u0010G\u001a\u00020HJt\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0084\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010QJl\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJt\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010UJj\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010WJz\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\b\u0010Z\u001a\u00020[H\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\f\u0012\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010+R\"\u0010\u001a\u001a\u00020\u0007X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b5\u00102\"\u0004\b6\u00107R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b8\u00102R\u001a\u00109\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b?\u00102R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0019\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\bB\u00102R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, m13558d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptimeMillis", "", RequestParameters.POSITION, "Landroidx/compose/ui/geometry/Offset;", "pressed", "", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "scrollDelta", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "pressure", "", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_consumed", "get_consumed$annotations", "()V", "_historical", "getConsumed$annotations", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "consumedDelegate", "getConsumedDelegate$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setConsumedDelegate$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "downChange", "getDownChange$ui_release", "()Z", "setDownChange$ui_release", "(Z)V", "getHistorical$annotations", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "isConsumed", "getOriginalEventPosition-F1C5BW0$ui_release", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "getPosition-F1C5BW0", "positionChange", "getPositionChange$ui_release", "setPositionChange$ui_release", "getPressed", "getPressure", "()F", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "getPreviousUptimeMillis", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptimeMillis", "consume", "", "copy", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "toString", "", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private ConsumedData _consumed;
    private List<HistoricalChange> _historical;
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

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, boolean z11, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, f10, j13, j14, z10, z11, i10, j15);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m22185copy0GkPj7c$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, ConsumedData consumedData, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z11 = (i11 & 8) != 0 ? pointerInputChange.pressed : z9;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z12 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z10;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m22191copy0GkPj7c(j17, j18, j19, z11, j20, j21, z12, consumedData, i12, j16);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m22187copyJKmWfYY$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j19 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j20 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z11 = (i11 & 8) != 0 ? pointerInputChange.pressed : z9;
        long j21 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j22 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z12 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z10;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 256) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return pointerInputChange.m22193copyJKmWfYY(j17, j19, j20, z11, j21, j22, z12, i12, j16);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m22188copyOHpmEuE$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z11 = (i11 & 8) != 0 ? pointerInputChange.pressed : z9;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z12 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z10;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m22194copyOHpmEuE(j17, j18, j19, z11, j20, j21, z12, i12, list, j16);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m22189copyTn9QgHE$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j19 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j20 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z11 = (i11 & 8) != 0 ? pointerInputChange.pressed : z9;
        float f11 = (i11 & 16) != 0 ? pointerInputChange.pressure : f10;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j22 = (i11 & 64) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z12 = (i11 & 128) != 0 ? pointerInputChange.previousPressed : z10;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return pointerInputChange.m22195copyTn9QgHE(j17, j19, j20, z11, f11, j21, j22, z12, i12, j16);
    }

    /* renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m22190copywbzehF4$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        List list2;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z11 = (i11 & 8) != 0 ? pointerInputChange.pressed : z9;
        float f11 = (i11 & 16) != 0 ? pointerInputChange.pressure : f10;
        long j20 = (i11 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 64) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z12 = (i11 & 128) != 0 ? pointerInputChange.previousPressed : z10;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        long j22 = j17;
        List historical = (i11 & 512) != 0 ? pointerInputChange.getHistorical() : list;
        if ((i11 & 1024) != 0) {
            list2 = historical;
            j16 = pointerInputChange.scrollDelta;
        } else {
            j16 = j15;
            list2 = historical;
        }
        return pointerInputChange.m22196copywbzehF4(j22, j18, j19, z11, f11, j20, j21, z12, i12, list2, j16);
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
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m22191copy0GkPj7c(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m22192copyEzrO64(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m22193copyJKmWfYY(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChangeM22196copywbzehF4 = m22196copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, getHistorical(), scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM22196copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM22196copywbzehF4;
    }

    @ExperimentalComposeUiApi
    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m22194copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChangeM22196copywbzehF4 = m22196copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM22196copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM22196copywbzehF4;
    }

    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m22195copyTn9QgHE(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m22196copywbzehF4(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    public final ConsumedData getConsumed() {
        if (this._consumed == null) {
            this._consumed = new ConsumedData(this);
        }
        ConsumedData consumedData = this._consumed;
        Intrinsics.checkNotNull(consumedData);
        return consumedData;
    }

    /* renamed from: getConsumedDelegate$ui_release, reason: from getter */
    public final PointerInputChange getConsumedDelegate() {
        return this.consumedDelegate;
    }

    /* renamed from: getDownChange$ui_release, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? CollectionsKt.emptyList() : list;
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

    public final void setConsumedDelegate$ui_release(PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void setDownChange$ui_release(boolean z9) {
        this.downChange = z9;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m22203setOriginalEventPositionk4lQ0M$ui_release(long j10) {
        this.originalEventPosition = j10;
    }

    public final void setPositionChange$ui_release(boolean z9) {
        this.positionChange = z9;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m22183toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m20743toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m20743toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m22272toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m20743toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, boolean z11, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, f10, j13, j14, z10, z11, i10, (List<HistoricalChange>) list, j15, j16);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, ConsumedData consumedData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, j13, j14, z10, consumedData, i10);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, boolean z11, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, j13, j14, z10, z11, i10, j15);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, boolean z11, int i10, long j15) {
        this.id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z9;
        this.pressure = f10;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z10;
        this.type = i10;
        this.scrollDelta = j15;
        this.originalEventPosition = Offset.INSTANCE.m20751getZeroF1C5BW0();
        this.downChange = z11;
        this.positionChange = z11;
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, boolean z11, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, f10, j13, j14, z10, z11, (i11 & 512) != 0 ? PointerType.INSTANCE.m22277getTouchT8wyACA() : i10, (i11 & 1024) != 0 ? Offset.INSTANCE.m20751getZeroF1C5BW0() : j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, boolean z11, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, j13, j14, z10, z11, (i11 & 256) != 0 ? PointerType.INSTANCE.m22277getTouchT8wyACA() : i10, (i11 & 512) != 0 ? Offset.INSTANCE.m20751getZeroF1C5BW0() : j15, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, boolean z11, int i10, long j15) {
        this(j10, j11, j12, z9, 1.0f, j13, j14, z10, z11, i10, j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, ConsumedData consumedData, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z9, j13, j14, z10, consumedData, (i11 & 256) != 0 ? PointerType.INSTANCE.m22277getTouchT8wyACA() : i10, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z9, long j13, long j14, boolean z10, ConsumedData consumedData, int i10) {
        this(j10, j11, j12, z9, 1.0f, j13, j14, z10, consumedData.getDownChange() || consumedData.getPositionChange(), i10, Offset.INSTANCE.m20751getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z9, float f10, long j13, long j14, boolean z10, boolean z11, int i10, List<HistoricalChange> list, long j15, long j16) {
        this(j10, j11, j12, z9, f10, j13, j14, z10, z11, i10, j15, (DefaultConstructorMarker) null);
        this._historical = list;
        this.originalEventPosition = j16;
    }
}
