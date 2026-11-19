package androidx.compose.p014ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j10, long j11, boolean z10, AbstractC9972n abstractC9972n) {
            this(j10, j11, z10);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m32109getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j10, long j11, boolean z10) {
            this.uptime = j10;
            this.positionOnScreen = j11;
            this.down = z10;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long jMo32185screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputEventData pointerInputEventData = pointers.get(i10);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m32118getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jMo32185screenToLocalMKHz9U = pointerInputEventData.m32120getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                jMo32185screenToLocalMKHz9U = positionCalculator.mo32185screenToLocalMKHz9U(pointerInputData.m32109getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m32118getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m32118getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m32120getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jMo32185screenToLocalMKHz9U, down, false, pointerInputEventData.m32123getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m32122getScrollDeltaF1C5BW0(), pointerInputEventData.m32119getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(pointerInputEventData.m32118getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m32121getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                this.previousPointerInputData.remove(pointerInputEventData.m32118getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
