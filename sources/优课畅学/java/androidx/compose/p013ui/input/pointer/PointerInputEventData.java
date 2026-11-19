package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;

    /* renamed from: id */
    private final long f1327id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    /* renamed from: copy-rc8HELY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m25508copyrc8HELY$default(PointerInputEventData pointerInputEventData, long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20 = (i11 & 1) != 0 ? pointerInputEventData.f1327id : j10;
        long j21 = (i11 & 2) != 0 ? pointerInputEventData.uptime : j11;
        long j22 = (i11 & 4) != 0 ? pointerInputEventData.positionOnScreen : j12;
        long j23 = (i11 & 8) != 0 ? pointerInputEventData.position : j13;
        boolean z12 = (i11 & 16) != 0 ? pointerInputEventData.down : z10;
        float f11 = (i11 & 32) != 0 ? pointerInputEventData.pressure : f10;
        int i12 = (i11 & 64) != 0 ? pointerInputEventData.type : i10;
        boolean z13 = (i11 & 128) != 0 ? pointerInputEventData.activeHover : z11;
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
        return pointerInputEventData.m25515copyrc8HELY(j16, j21, j22, j23, z12, f11, i12, z13, list2, j19, j18);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m25509component1J3iCeTQ() {
        return this.f1327id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m25510component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m25511component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m25512component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m25513component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m25514component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m25515copyrc8HELY(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<HistoricalChange> list, long j14, long j15) {
        return new PointerInputEventData(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m25484equalsimpl0(this.f1327id, pointerInputEventData.f1327id) && this.uptime == pointerInputEventData.uptime && Offset.m24032equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m24032equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m25573equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && AbstractC9133u.m16128b(this.historical, pointerInputEventData.historical) && Offset.m24032equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m24032equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
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
    public final long m25516getIdJ3iCeTQ() {
        return this.f1327id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m25517getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m25518getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m25519getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m25520getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m25521getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m25485hashCodeimpl(this.f1327id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m24037hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m24037hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m25574hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + Offset.m24037hashCodeimpl(this.scrollDelta)) * 31) + Offset.m24037hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m25486toStringimpl(this.f1327id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m24043toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m24043toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m25575toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m24043toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m24043toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<HistoricalChange> list, long j14, long j15) {
        this.f1327id = j10;
        this.uptime = j11;
        this.positionOnScreen = j12;
        this.position = j13;
        this.down = z10;
        this.pressure = f10;
        this.type = i10;
        this.activeHover = z11;
        this.historical = list;
        this.scrollDelta = j14;
        this.originalEventPosition = j15;
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, int i11, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, z10, f10, i10, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? new ArrayList() : list, (i11 & 512) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j14, (i11 & 1024) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j15, null);
    }
}
