package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedEndDate;
    private MutableState<CalendarDate> _selectedStartDate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<DateRangePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$Saver$1
                @Override // p300x7.InterfaceC10574p
                public final List<Object> invoke(SaverScope saverScope, DateRangePickerStateImpl dateRangePickerStateImpl) {
                    return AbstractC8809v.m14774q(dateRangePickerStateImpl.getSelectedStartDateMillis(), dateRangePickerStateImpl.getSelectedEndDateMillis(), Long.valueOf(dateRangePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().m13496b()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().m13497c()), Integer.valueOf(dateRangePickerStateImpl.mo22038getDisplayModejFl4v0()));
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final DateRangePickerStateImpl invoke(List<? extends Object> list) {
                    Long l10 = (Long) list.get(0);
                    Long l11 = (Long) list.get(1);
                    Long l12 = (Long) list.get(2);
                    Object obj = list.get(3);
                    AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(4);
                    AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    C8321f c8321f = new C8321f(iIntValue, ((Integer) obj2).intValue());
                    Object obj3 = list.get(5);
                    AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new DateRangePickerStateImpl(l10, l11, l12, c8321f, DisplayMode.m22051constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ DateRangePickerStateImpl(Long l10, Long l11, Long l12, C8321f c8321f, int i10, SelectableDates selectableDates, Locale locale, AbstractC9126n abstractC9126n) {
        this(l10, l11, l12, c8321f, i10, selectableDates, locale);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo22038getDisplayModejFl4v0() {
        return this._displayMode.getValue().m22056unboximpl();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedEndDateMillis() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedStartDateMillis() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo22039setDisplayModevCnGnXg(int i10) {
        Long selectedStartDateMillis = getSelectedStartDateMillis();
        if (selectedStartDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedStartDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m22050boximpl(i10));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(Long l10, Long l11) {
        CalendarDate canonicalDate = l10 != null ? getCalendarModel().getCanonicalDate(l10.longValue()) : null;
        CalendarDate canonicalDate2 = l11 != null ? getCalendarModel().getCanonicalDate(l11.longValue()) : null;
        if (canonicalDate != null && !getYearRange().m13502g(canonicalDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (canonicalDate2 != null && !getYearRange().m13502g(canonicalDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + canonicalDate2.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (canonicalDate2 != null) {
            if (canonicalDate == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (canonicalDate.getUtcTimeMillis() > canonicalDate2.getUtcTimeMillis()) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        this._selectedStartDate.setValue(canonicalDate);
        this._selectedEndDate.setValue(canonicalDate2);
    }

    private DateRangePickerStateImpl(Long l10, Long l11, Long l12, C8321f c8321f, int i10, SelectableDates selectableDates, Locale locale) {
        super(l12, c8321f, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l10, l11);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m22050boximpl(i10), null, 2, null);
    }
}
