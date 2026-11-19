package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import p077d8.C8321f;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface DatePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo22024getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    SelectableDates getSelectableDates();

    Long getSelectedDateMillis();

    C8321f getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo22025setDisplayModevCnGnXg(int i10);

    void setDisplayedMonthMillis(long j10);

    void setSelectedDateMillis(Long l10);
}
