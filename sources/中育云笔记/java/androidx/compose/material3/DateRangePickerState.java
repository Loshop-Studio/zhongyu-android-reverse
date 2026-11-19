package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import p265nd.C10405j;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface DateRangePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo28640getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    SelectableDates getSelectableDates();

    Long getSelectedEndDateMillis();

    Long getSelectedStartDateMillis();

    C10405j getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo28641setDisplayModevCnGnXg(int i10);

    void setDisplayedMonthMillis(long j10);

    void setSelection(Long l10, Long l11);
}
