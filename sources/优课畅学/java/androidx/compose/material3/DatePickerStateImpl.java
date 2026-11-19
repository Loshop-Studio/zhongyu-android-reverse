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
/* loaded from: classes2.dex */
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedDate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<DatePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$1
                @Override // p300x7.InterfaceC10574p
                public final List<Object> invoke(SaverScope saverScope, DatePickerStateImpl datePickerStateImpl) {
                    return AbstractC8809v.m14774q(datePickerStateImpl.getSelectedDateMillis(), Long.valueOf(datePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(datePickerStateImpl.getYearRange().m13496b()), Integer.valueOf(datePickerStateImpl.getYearRange().m13497c()), Integer.valueOf(datePickerStateImpl.mo22024getDisplayModejFl4v0()));
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final DatePickerStateImpl invoke(List<? extends Object> list) {
                    Long l10 = (Long) list.get(0);
                    Long l11 = (Long) list.get(1);
                    Object obj = list.get(2);
                    AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(3);
                    AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    C8321f c8321f = new C8321f(iIntValue, ((Integer) obj2).intValue());
                    Object obj3 = list.get(4);
                    AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new DatePickerStateImpl(l10, l11, c8321f, DisplayMode.m22051constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ DatePickerStateImpl(Long l10, Long l11, C8321f c8321f, int i10, SelectableDates selectableDates, Locale locale, AbstractC9126n abstractC9126n) {
        this(l10, l11, c8321f, i10, selectableDates, locale);
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo22024getDisplayModejFl4v0() {
        return this._displayMode.getValue().m22056unboximpl();
    }

    @Override // androidx.compose.material3.DatePickerState
    public Long getSelectedDateMillis() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo22025setDisplayModevCnGnXg(int i10) {
        Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m22050boximpl(i10));
    }

    @Override // androidx.compose.material3.DatePickerState
    public void setSelectedDateMillis(Long l10) {
        if (l10 == null) {
            this._selectedDate.setValue(null);
            return;
        }
        CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l10.longValue());
        if (getYearRange().m13502g(canonicalDate.getYear())) {
            this._selectedDate.setValue(canonicalDate);
            return;
        }
        throw new IllegalArgumentException(("The provided date's year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
    }

    private DatePickerStateImpl(Long l10, Long l11, C8321f c8321f, int i10, SelectableDates selectableDates, Locale locale) {
        CalendarDate canonicalDate;
        super(l11, c8321f, selectableDates, locale);
        if (l10 != null) {
            canonicalDate = getCalendarModel().getCanonicalDate(l10.longValue());
            if (!c8321f.m13502g(canonicalDate.getYear())) {
                throw new IllegalArgumentException(("The provided initial date's year (" + canonicalDate.getYear() + ") is out of the years range of " + c8321f + '.').toString());
            }
        } else {
            canonicalDate = null;
        }
        this._selectedDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(canonicalDate, null, 2, null);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m22050boximpl(i10), null, 2, null);
    }
}
