package androidx.compose.p013ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j10 = this.nextId;
                this.nextId = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j11 = this.nextId;
            this.nextId = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int i10, boolean z10) {
        long jMo25583screenToLocalMKHz9U;
        long jM25433toRawOffsetdBAh8RU;
        int i11;
        long jM25432getComposePointerId_I2yYro = m25432getComposePointerId_I2yYro(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        char c10 = ' ';
        long j10 = 4294967295L;
        long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(motionEvent.getY(i10)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i10)) << 32));
        long jM24029copydBAh8RU$default = Offset.m24029copydBAh8RU$default(jM24027constructorimpl, 0.0f, 0.0f, 3, null);
        if (i10 == 0) {
            jM25433toRawOffsetdBAh8RU = Offset.m24027constructorimpl((Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32));
            jMo25583screenToLocalMKHz9U = positionCalculator.mo25583screenToLocalMKHz9U(jM25433toRawOffsetdBAh8RU);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jM25433toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m25433toRawOffsetdBAh8RU(motionEvent, i10);
            jMo25583screenToLocalMKHz9U = positionCalculator.mo25583screenToLocalMKHz9U(jM25433toRawOffsetdBAh8RU);
        } else {
            long jMo25582localToScreenMKHz9U = positionCalculator.mo25582localToScreenMKHz9U(jM24027constructorimpl);
            jMo25583screenToLocalMKHz9U = jM24027constructorimpl;
            jM25433toRawOffsetdBAh8RU = jMo25582localToScreenMKHz9U;
        }
        int toolType = motionEvent.getToolType(i10);
        int iM25581getUnknownT8wyACA = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? PointerType.Companion.m25581getUnknownT8wyACA() : PointerType.Companion.m25577getEraserT8wyACA() : PointerType.Companion.m25578getMouseT8wyACA() : PointerType.Companion.m25579getStylusT8wyACA() : PointerType.Companion.m25580getTouchT8wyACA() : PointerType.Companion.m25581getUnknownT8wyACA();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i12 = 0;
        while (i12 < historySize) {
            float historicalX = motionEvent.getHistoricalX(i10, i12);
            float historicalY = motionEvent.getHistoricalY(i10, i12);
            char c11 = c10;
            long j11 = j10;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i11 = i12;
            } else {
                long jM24027constructorimpl2 = Offset.m24027constructorimpl((Float.floatToRawIntBits(historicalX) << c11) | (Float.floatToRawIntBits(historicalY) & j11));
                i11 = i12;
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i11), jM24027constructorimpl2, jM24027constructorimpl2, null));
            }
            i12 = i11 + 1;
            c10 = c11;
            j10 = j11;
        }
        return new PointerInputEventData(jM25432getComposePointerId_I2yYro, motionEvent.getEventTime(), jM25433toRawOffsetdBAh8RU, jMo25583screenToLocalMKHz9U, z10, pressure, iM25581getUnknownT8wyACA, this.activeHoverIds.get(motionEvent.getPointerId(i10), false), arrayList, motionEvent.getActionMasked() == 8 ? Offset.m24027constructorimpl((Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j10) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c10)) : Offset.Companion.m24051getZeroF1C5BW0(), jM24029copydBAh8RU$default, null);
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m25432getComposePointerId_I2yYro(int i10) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(i10, jValueAt);
        }
        return PointerId.m25482constructorimpl(jValueAt);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i10) {
        this.activeHoverIds.delete(i10);
        this.motionEventToComposePointerIdMap.delete(i10);
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }
}
