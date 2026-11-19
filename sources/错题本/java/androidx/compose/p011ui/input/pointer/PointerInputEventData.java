package androidx.compose.p011ui.input.pointer;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001c\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0016\u0010\u001e\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010%\u001a\u00020\rHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010*\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u0018J\u0016\u0010,\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0018J\u0087\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u0010$J\u001a\u00106\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010\u0018R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b;\u0010\u0018R\u001d\u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b<\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\"R\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010$R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bC\u0010 R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010(R\u001d\u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bF\u0010\u0018R\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bG\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006H"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", RequestParameters.POSITION, "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/PointerType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "activeHover", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/e;)V", "component1-J3iCeTQ", "()J", "component1", "component2", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "component5", "()Z", "component6", "()F", "component7-T8wyACA", "()I", "component7", "component8", "component9", "()Ljava/util/List;", "component10-F1C5BW0", "component10", "component11-F1C5BW0", "component11", "copy-rc8HELY", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId-J3iCeTQ", "getUptime", "getPositionOnScreen-F1C5BW0", "getPosition-F1C5BW0", "Z", "getDown", "F", "getPressure", "I", "getType-T8wyACA", "getActiveHover", "Ljava/util/List;", "getHistorical", "getScrollDelta-F1C5BW0", "getOriginalEventPosition-F1C5BW0", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;

    @NotNull
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j7, long j8, long j9, long j10, boolean z8, float f, int i, boolean z9, List list, long j11, long j12, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, z8, f, i, z9, list, j11, j12);
    }

    /* renamed from: copy-rc8HELY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m11914copyrc8HELY$default(PointerInputEventData pointerInputEventData, long j7, long j8, long j9, long j10, boolean z8, float f, int i, boolean z9, List list, long j11, long j12, int i8, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17 = (i8 & 1) != 0 ? pointerInputEventData.id : j7;
        long j18 = (i8 & 2) != 0 ? pointerInputEventData.uptime : j8;
        long j19 = (i8 & 4) != 0 ? pointerInputEventData.positionOnScreen : j9;
        long j20 = (i8 & 8) != 0 ? pointerInputEventData.position : j10;
        boolean z10 = (i8 & 16) != 0 ? pointerInputEventData.down : z8;
        float f7 = (i8 & 32) != 0 ? pointerInputEventData.pressure : f;
        int i9 = (i8 & 64) != 0 ? pointerInputEventData.type : i;
        boolean z11 = (i8 & 128) != 0 ? pointerInputEventData.activeHover : z9;
        List list2 = (i8 & 256) != 0 ? pointerInputEventData.historical : list;
        if ((i8 & 512) != 0) {
            j13 = j17;
            j14 = pointerInputEventData.scrollDelta;
        } else {
            j13 = j17;
            j14 = j11;
        }
        if ((i8 & 1024) != 0) {
            j16 = j14;
            j15 = pointerInputEventData.originalEventPosition;
        } else {
            j15 = j12;
            j16 = j14;
        }
        return pointerInputEventData.m11921copyrc8HELY(j13, j18, j19, j20, z10, f7, i9, z11, list2, j16, j15);
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

    @NotNull
    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    @NotNull
    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m11921copyrc8HELY(long id, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean activeHover, @NotNull List<HistoricalChange> historical, long scrollDelta, long originalEventPosition) {
        return new PointerInputEventData(id, uptime, positionOnScreen, position, down, pressure, type, activeHover, historical, scrollDelta, originalEventPosition, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return PointerId.m11890equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m10438equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m10438equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m11979equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && AbstractC5830k.m5325b(this.historical, pointerInputEventData.historical) && Offset.m10438equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m10438equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m11922getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m11923getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m11924getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m11925getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m11926getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m11927getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return Offset.m10443hashCodeimpl(this.originalEventPosition) + ((Offset.m10443hashCodeimpl(this.scrollDelta) + AbstractC0584a.m907h(this.historical, AbstractC0584a.m908i(this.activeHover, (PointerType.m11980hashCodeimpl(this.type) + AbstractC0584a.m901b(this.pressure, AbstractC0584a.m908i(this.down, (Offset.m10443hashCodeimpl(this.position) + ((Offset.m10443hashCodeimpl(this.positionOnScreen) + AbstractC0584a.m897B(this.uptime, PointerId.m11891hashCodeimpl(this.id) * 31, 31)) * 31)) * 31, 31), 31)) * 31, 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m11892toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m10449toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m10449toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m11981toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m10449toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m10449toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j7, long j8, long j9, long j10, boolean z8, float f, int i, boolean z9, List<HistoricalChange> list, long j11, long j12) {
        this.id = j7;
        this.uptime = j8;
        this.positionOnScreen = j9;
        this.position = j10;
        this.down = z8;
        this.pressure = f;
        this.type = i;
        this.activeHover = z9;
        this.historical = list;
        this.scrollDelta = j11;
        this.originalEventPosition = j12;
    }

    public /* synthetic */ PointerInputEventData(long j7, long j8, long j9, long j10, boolean z8, float f, int i, boolean z9, List list, long j11, long j12, int i8, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, z8, f, i, (i8 & 128) != 0 ? false : z9, (i8 & 256) != 0 ? new ArrayList() : list, (i8 & 512) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j11, (i8 & 1024) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j12, null);
    }
}
