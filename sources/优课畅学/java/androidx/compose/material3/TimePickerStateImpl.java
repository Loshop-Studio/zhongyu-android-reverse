package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class TimePickerStateImpl implements TimePickerState {
    public static final Companion Companion = new Companion(null);
    private final MutableIntState hourState;
    private boolean is24hour;
    private final MutableState isAfternoon$delegate;
    private final MutableIntState minuteState;
    private final MutableState selection$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<TimePickerStateImpl, ?> Saver() {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$Saver$1
                @Override // p300x7.InterfaceC10574p
                public final List<Object> invoke(SaverScope saverScope, TimePickerStateImpl timePickerStateImpl) {
                    return AbstractC8809v.m14774q(Integer.valueOf(timePickerStateImpl.getHour()), Integer.valueOf(timePickerStateImpl.getMinute()), Boolean.valueOf(timePickerStateImpl.is24hour()));
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$Saver$2
                @Override // p300x7.InterfaceC10570l
                public final TimePickerStateImpl invoke(List<? extends Object> list) {
                    Object obj = list.get(0);
                    AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(1);
                    AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object obj3 = list.get(2);
                    AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    return new TimePickerStateImpl(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
                }
            });
        }

        private Companion() {
        }
    }

    public TimePickerStateImpl(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.is24hour = z10;
        this.selection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimePickerSelectionMode.m22753boximpl(TimePickerSelectionMode.Companion.m22760getHouryecRtBI()), null, 2, null);
        this.isAfternoon$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i10 >= 12), null, 2, null);
        this.hourState = SnapshotIntStateKt.mutableIntStateOf(i10 % 12);
        this.minuteState = SnapshotIntStateKt.mutableIntStateOf(i11);
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.hourState.getIntValue() + (isAfternoon() ? 12 : 0);
    }

    public final MutableIntState getHourState() {
        return this.hourState;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.minuteState.getIntValue();
    }

    public final MutableIntState getMinuteState() {
        return this.minuteState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI */
    public int mo21736getSelectionyecRtBI() {
        return ((TimePickerSelectionMode) this.selection$delegate.getValue()).m22759unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.is24hour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return ((Boolean) this.isAfternoon$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z10) {
        this.is24hour = z10;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z10) {
        this.isAfternoon$delegate.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i10) {
        setAfternoon(i10 >= 12);
        this.hourState.setIntValue(i10 % 12);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i10) {
        this.minuteState.setIntValue(i10);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ */
    public void mo21737setSelection6_8s6DQ(int i10) {
        this.selection$delegate.setValue(TimePickerSelectionMode.m22753boximpl(i10));
    }
}
