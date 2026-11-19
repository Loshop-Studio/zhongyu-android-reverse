package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.ExperimentalComposeUiApi;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;

@Immutable
/* loaded from: classes2.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private ConsumedData _consumed;
    private List<HistoricalChange> _historical;
    private PointerInputChange consumedDelegate;
    private boolean downChange;

    /* renamed from: id */
    private final long f1326id;
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

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m25488copy0GkPj7c$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.f1326id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m25494copy0GkPj7c(j17, j18, j19, z12, j20, j21, z13, consumedData, i12, j16);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m25490copyJKmWfYY$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? pointerInputChange.f1326id : j10;
        long j19 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j20 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j21 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j22 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 256) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return pointerInputChange.m25496copyJKmWfYY(j17, j19, j20, z12, j21, j22, z13, i12, j16);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m25491copyOHpmEuE$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.f1326id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m25497copyOHpmEuE(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m25492copyTn9QgHE$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? pointerInputChange.f1326id : j10;
        long j19 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j20 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        float f11 = (i11 & 16) != 0 ? pointerInputChange.pressure : f10;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j22 = (i11 & 64) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 128) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return pointerInputChange.m25498copyTn9QgHE(j17, j19, j20, z12, f11, j21, j22, z13, i12, j16);
    }

    /* renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m25493copywbzehF4$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        List list2;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.f1326id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        float f11 = (i11 & 16) != 0 ? pointerInputChange.pressure : f10;
        long j20 = (i11 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 64) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 128) != 0 ? pointerInputChange.previousPressed : z11;
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
        return pointerInputChange.m25499copywbzehF4(j22, j18, j19, z12, f11, j20, j21, z13, i12, list2, j16);
    }

    @InterfaceC8721a
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

    @InterfaceC8721a
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m25494copy0GkPj7c(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, long j15) {
        PointerInputChange pointerInputChange = new PointerInputChange(j10, j11, j12, z10, this.pressure, j13, j14, z11, consumedData.getDownChange() || consumedData.getPositionChange(), i10, getHistorical(), j15, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @InterfaceC8721a
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m25495copyEzrO64(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10) {
        PointerInputChange pointerInputChange = new PointerInputChange(j10, j11, j12, z10, this.pressure, j13, j14, z11, consumedData.getDownChange() || consumedData.getPositionChange(), i10, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m25496copyJKmWfYY(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15) {
        PointerInputChange pointerInputChangeM25499copywbzehF4 = m25499copywbzehF4(j10, j11, j12, z10, this.pressure, j13, j14, z11, i10, getHistorical(), j15);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM25499copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM25499copywbzehF4;
    }

    @ExperimentalComposeUiApi
    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m25497copyOHpmEuE(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List<HistoricalChange> list, long j15) {
        PointerInputChange pointerInputChangeM25499copywbzehF4 = m25499copywbzehF4(j10, j11, j12, z10, this.pressure, j13, j14, z11, i10, list, j15);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM25499copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM25499copywbzehF4;
    }

    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m25498copyTn9QgHE(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, long j15) {
        PointerInputChange pointerInputChange = new PointerInputChange(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, getHistorical(), j15, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m25499copywbzehF4(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List<HistoricalChange> list, long j15) {
        PointerInputChange pointerInputChange = new PointerInputChange(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.originalEventPosition, null);
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
        AbstractC9133u.m16130d(consumedData);
        return consumedData;
    }

    public final PointerInputChange getConsumedDelegate$ui_release() {
        return this.consumedDelegate;
    }

    public final boolean getDownChange$ui_release() {
        return this.downChange;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? AbstractC8809v.m14771n() : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m25500getIdJ3iCeTQ() {
        return this.f1326id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m25501getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m25502getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPositionChange$ui_release() {
        return this.positionChange;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m25503getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m25504getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m25505getTypeT8wyACA() {
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

    public final void setDownChange$ui_release(boolean z10) {
        this.downChange = z10;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m25506setOriginalEventPositionk4lQ0M$ui_release(long j10) {
        this.originalEventPosition = j10;
    }

    public final void setPositionChange$ui_release(boolean z10) {
        this.positionChange = z10;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m25486toStringimpl(this.f1326id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m24043toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m24043toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m25575toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m24043toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15, j16);
    }

    @InterfaceC8721a
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, j13, j14, z11, consumedData, i10);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f1326id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z10;
        this.pressure = f10;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z11;
        this.type = i10;
        this.scrollDelta = j15;
        this.originalEventPosition = Offset.Companion.m24051getZeroF1C5BW0();
        this.downChange = z12;
        this.positionChange = z12;
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? PointerType.Companion.m25580getTouchT8wyACA() : i10, (i11 & 1024) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j15, (AbstractC9126n) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & 256) != 0 ? PointerType.Companion.m25580getTouchT8wyACA() : i10, (i11 & 512) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j15, (AbstractC9126n) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, j15, (AbstractC9126n) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, z10, j13, j14, z11, consumedData, (i11 & 256) != 0 ? PointerType.Companion.m25580getTouchT8wyACA() : i10, (AbstractC9126n) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, consumedData.getDownChange() || consumedData.getPositionChange(), i10, Offset.Companion.m24051getZeroF1C5BW0(), (AbstractC9126n) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (AbstractC9126n) null);
        this._historical = list;
        this.originalEventPosition = j16;
    }
}
