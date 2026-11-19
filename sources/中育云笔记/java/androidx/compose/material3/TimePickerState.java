package androidx.compose.material3;

import androidx.annotation.IntRange;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface TimePickerState {
    @IntRange(from = 0, m338to = 23)
    int getHour();

    @IntRange(from = 0, m338to = 59)
    int getMinute();

    /* renamed from: getSelection-yecRtBI */
    int mo28338getSelectionyecRtBI();

    boolean is24hour();

    boolean isAfternoon();

    void set24hour(boolean z10);

    void setAfternoon(boolean z10);

    void setHour(@IntRange(from = 0, m338to = 23) int i10);

    void setMinute(@IntRange(from = 0, m338to = 59) int i10);

    /* renamed from: setSelection-6_8s6DQ */
    void mo28339setSelection6_8s6DQ(int i10);
}
