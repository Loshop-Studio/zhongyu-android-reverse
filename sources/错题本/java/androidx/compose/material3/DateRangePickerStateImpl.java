package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p200x6.C6756f;

@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'BI\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR*\u0010\"\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m5110d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DateRangePickerState;", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lx6/f;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lx6/f;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/e;)V", "startDateMillis", "endDateMillis", "Ld6/s;", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarDate;", "_selectedStartDate", "Landroidx/compose/runtime/MutableState;", "_selectedEndDate", "_displayMode", "getSelectedStartDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedEndDateMillis", "selectedEndDateMillis", "displayMode", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerStateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1072:1\n1#2:1073\n*E\n"})
/* loaded from: classes.dex */
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private MutableState<DisplayMode> _displayMode;

    @NotNull
    private MutableState<CalendarDate> _selectedEndDate;

    @NotNull
    private MutableState<CalendarDate> _selectedStartDate;

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DateRangePickerStateImpl;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<DateRangePickerStateImpl, Object> Saver(@NotNull final SelectableDates selectableDates, @NotNull final Locale locale) {
            return ListSaverKt.listSaver(new InterfaceC6473e() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$Saver$1
                @Override // p152r6.InterfaceC6473e
                @NotNull
                public final List<Object> invoke(@NotNull SaverScope saverScope, @NotNull DateRangePickerStateImpl dateRangePickerStateImpl) {
                    return AbstractC5806u.m5287z(dateRangePickerStateImpl.getSelectedStartDateMillis(), dateRangePickerStateImpl.getSelectedEndDateMillis(), Long.valueOf(dateRangePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().f11420a), Integer.valueOf(dateRangePickerStateImpl.getYearRange().f11421b), Integer.valueOf(dateRangePickerStateImpl.mo8444getDisplayModejFl4v0()));
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                @Nullable
                public final DateRangePickerStateImpl invoke(@NotNull List<? extends Object> list) {
                    Long l = (Long) list.get(0);
                    Long l3 = (Long) list.get(1);
                    Long l8 = (Long) list.get(2);
                    Object obj = list.get(3);
                    AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(4);
                    AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    C6756f c6756f = new C6756f(iIntValue, ((Integer) obj2).intValue(), 1);
                    Object obj3 = list.get(5);
                    AbstractC5830k.m5328e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new DateRangePickerStateImpl(l, l3, l8, c6756f, DisplayMode.m8457constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ DateRangePickerStateImpl(Long l, Long l3, Long l8, C6756f c6756f, int i, SelectableDates selectableDates, Locale locale, AbstractC5824e abstractC5824e) {
        this(l, l3, l8, c6756f, i, selectableDates, locale);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo8444getDisplayModejFl4v0() {
        return this._displayMode.getValue().getValue();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    @Nullable
    public Long getSelectedEndDateMillis() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    @Nullable
    public Long getSelectedStartDateMillis() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo8445setDisplayModevCnGnXg(int i) {
        Long selectedStartDateMillis = getSelectedStartDateMillis();
        if (selectedStartDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedStartDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m8456boximpl(i));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(@Nullable Long startDateMillis, @Nullable Long endDateMillis) {
        CalendarDate canonicalDate = startDateMillis != null ? getCalendarModel().getCanonicalDate(startDateMillis.longValue()) : null;
        CalendarDate canonicalDate2 = endDateMillis != null ? getCalendarModel().getCanonicalDate(endDateMillis.longValue()) : null;
        if (canonicalDate != null && !getYearRange().m6434b(canonicalDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
        }
        if (canonicalDate2 != null && !getYearRange().m6434b(canonicalDate2.getYear())) {
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

    private DateRangePickerStateImpl(Long l, Long l3, Long l8, C6756f c6756f, int i, SelectableDates selectableDates, Locale locale) {
        super(l8, c6756f, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l, l3);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m8456boximpl(i), null, 2, null);
    }
}
