package androidx.compose.p014ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m32037constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m32166constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m32043calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m32043calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                PointerInputChange pointerInputChange = list.get(i10);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m32061getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m32060getPress7fucELk();
                }
            }
            return PointerEventType.Companion.m32059getMove7fucELk();
        }
        int actionMasked = motionEvent$ui_release.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return PointerEventType.Companion.m32062getScroll7fucELk();
                        case 9:
                            return PointerEventType.Companion.m32057getEnter7fucELk();
                        case 10:
                            return PointerEventType.Companion.m32058getExit7fucELk();
                        default:
                            return PointerEventType.Companion.m32063getUnknown7fucELk();
                    }
                }
                return PointerEventType.Companion.m32059getMove7fucELk();
            }
            return PointerEventType.Companion.m32061getRelease7fucELk();
        }
        return PointerEventType.Companion.m32060getPress7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (AbstractC9979u.m20289b(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            PointerInputChange pointerInputChange = list.get(i10);
            longSparseArray.put(pointerInputChange.m32102getIdJ3iCeTQ(), pointerInputChange);
            long jM32102getIdJ3iCeTQ = pointerInputChange.m32102getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long jM32104getPositionF1C5BW0 = pointerInputChange.m32104getPositionF1C5BW0();
            long jM32104getPositionF1C5BW02 = pointerInputChange.m32104getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int iM32107getTypeT8wyACA = pointerInputChange.m32107getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i11 = i10;
            arrayList.add(new PointerInputEventData(jM32102getIdJ3iCeTQ, uptimeMillis, jM32104getPositionF1C5BW0, jM32104getPositionF1C5BW02, pressed, pressure, iM32107getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m32032activeHoverEvent0FcD4WY(pointerInputChange.m32102getIdJ3iCeTQ()), null, 0L, 0L, 1792, null));
            i10 = i11 + 1;
        }
        return new PointerEvent(list, new InternalPointerEvent(longSparseArray, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m32044getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final int getClassification() {
        MotionEvent motionEvent$ui_release;
        if (Build.VERSION.SDK_INT < 29 || (motionEvent$ui_release = getMotionEvent$ui_release()) == null) {
            return 0;
        }
        return motionEvent$ui_release.getClassification();
    }

    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m32045getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m32046getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m32047setTypeEhbLWgg$ui_release(int i10) {
        this.type = i10;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }
}
