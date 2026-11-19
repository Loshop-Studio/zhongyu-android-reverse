package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import p265nd.C10405j;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface DatePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo28626getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    SelectableDates getSelectableDates();

    Long getSelectedDateMillis();

    C10405j getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo28627setDisplayModevCnGnXg(int i10);

    void setDisplayedMonthMillis(long j10);

    void setSelectedDateMillis(Long l10);
}
