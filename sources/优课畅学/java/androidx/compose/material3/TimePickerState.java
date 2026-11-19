package androidx.compose.material3;

import androidx.annotation.IntRange;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface TimePickerState {
    @IntRange(from = 0, m244to = 23)
    int getHour();

    @IntRange(from = 0, m244to = 59)
    int getMinute();

    /* renamed from: getSelection-yecRtBI */
    int mo21736getSelectionyecRtBI();

    boolean is24hour();

    boolean isAfternoon();

    void set24hour(boolean z10);

    void setAfternoon(boolean z10);

    void setHour(@IntRange(from = 0, m244to = 23) int i10);

    void setMinute(@IntRange(from = 0, m244to = 59) int i10);

    /* renamed from: setSelection-6_8s6DQ */
    void mo21737setSelection6_8s6DQ(int i10);
}
