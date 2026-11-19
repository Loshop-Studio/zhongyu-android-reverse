package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0002\u0010\u0015J\u0016\u0010(\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJ\u0016\u0010*\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001cJ\u0016\u0010,\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001cJ\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u0016\u0010/\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001cJ\u0016\u00101\u001a\u00020\u0007HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJ\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\u0016\u00105\u001a\u00020\u000eHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010%J\t\u00107\u001a\u00020\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u0087\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0014\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0019\u0010\r\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m13558d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "down", "", "pressure", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "activeHover", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "scrollDelta", "originalEventPosition", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveHover", "()Z", "getDown", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "getOriginalEventPosition-F1C5BW0", "getPosition-F1C5BW0", "getPositionOnScreen-F1C5BW0", "getPressure", "()F", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptime", "component1", "component1-J3iCeTQ", "component10", "component10-F1C5BW0", "component11", "component11-F1C5BW0", "component2", "component3", "component3-F1C5BW0", "component4", "component4-F1C5BW0", "component5", "component6", "component7", "component7-T8wyACA", "component8", "component9", "copy", "copy-rc8HELY", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "equals", "other", "hashCode", "", "toString", "", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z9, float f10, int i10, boolean z10, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z9, f10, i10, z10, list, j14, j15);
    }

    /* renamed from: copy-rc8HELY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m22205copyrc8HELY$default(PointerInputEventData pointerInputEventData, long j10, long j11, long j12, long j13, boolean z9, float f10, int i10, boolean z10, List list, long j14, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20 = (i11 & 1) != 0 ? pointerInputEventData.id : j10;
        long j21 = (i11 & 2) != 0 ? pointerInputEventData.uptime : j11;
        long j22 = (i11 & 4) != 0 ? pointerInputEventData.positionOnScreen : j12;
        long j23 = (i11 & 8) != 0 ? pointerInputEventData.position : j13;
        boolean z11 = (i11 & 16) != 0 ? pointerInputEventData.down : z9;
        float f11 = (i11 & 32) != 0 ? pointerInputEventData.pressure : f10;
        int i12 = (i11 & 64) != 0 ? pointerInputEventData.type : i10;
        boolean z12 = (i11 & 128) != 0 ? pointerInputEventData.activeHover : z10;
        List list2 = (i11 & 256) != 0 ? pointerInputEventData.historical : list;
        if ((i11 & 512) != 0) {
            j16 = j20;
            j17 = pointerInputEventData.scrollDelta;
        } else {
            j16 = j20;
            j17 = j14;
        }
        if ((i11 & 1024) != 0) {
            j19 = j17;
            j18 = pointerInputEventData.originalEventPosition;
        } else {
            j18 = j15;
            j19 = j17;
        }
        return pointerInputEventData.m22212copyrc8HELY(j16, j21, j22, j23, z11, f11, i12, z12, list2, j19, j18);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name and from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name and from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* renamed from: component6, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m22212copyrc8HELY(long id, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean activeHover, List<HistoricalChange> historical, long scrollDelta, long originalEventPosition) {
        return new PointerInputEventData(id, uptime, positionOnScreen, position, down, pressure, type, activeHover, historical, scrollDelta, originalEventPosition, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return PointerId.m22181equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m20732equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m20732equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m22270equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && Offset.m20732equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m20732equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m22213getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m22214getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m22215getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m22216getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m22217getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m22218getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m22182hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m20737hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m20737hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m22271hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + Offset.m20737hashCodeimpl(this.scrollDelta)) * 31) + Offset.m20737hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m22183toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m20743toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m20743toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m22272toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m20743toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m20743toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j10, long j11, long j12, long j13, boolean z9, float f10, int i10, boolean z10, List<HistoricalChange> list, long j14, long j15) {
        this.id = j10;
        this.uptime = j11;
        this.positionOnScreen = j12;
        this.position = j13;
        this.down = z9;
        this.pressure = f10;
        this.type = i10;
        this.activeHover = z10;
        this.historical = list;
        this.scrollDelta = j14;
        this.originalEventPosition = j15;
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z9, float f10, int i10, boolean z10, List list, long j14, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z9, f10, i10, (i11 & 128) != 0 ? false : z10, (i11 & 256) != 0 ? new ArrayList() : list, (i11 & 512) != 0 ? Offset.INSTANCE.m20751getZeroF1C5BW0() : j14, (i11 & 1024) != 0 ? Offset.INSTANCE.m20751getZeroF1C5BW0() : j15, null);
    }
}
