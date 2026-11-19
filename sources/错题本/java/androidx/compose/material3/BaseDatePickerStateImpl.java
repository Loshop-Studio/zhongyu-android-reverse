package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200x6.C6756f;

@Stable
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R$\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m5110d2 = {"Landroidx/compose/material3/BaseDatePickerStateImpl;", "", "", "initialDisplayedMonthMillis", "Lx6/f;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lx6/f;Landroidx/compose/material3/SelectableDates;Ljava/util/Locale;)V", "Lx6/f;", "getYearRange", "()Lx6/f;", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/internal/CalendarModel;", "<set-?>", "selectableDates$delegate", "Landroidx/compose/runtime/MutableState;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "setSelectableDates", "(Landroidx/compose/material3/SelectableDates;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/internal/CalendarMonth;", "_displayedMonth", "monthMillis", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "displayedMonthMillis", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/BaseDatePickerStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2272:1\n81#2:2273\n107#2,2:2274\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/BaseDatePickerStateImpl\n*L\n1083#1:2273\n1083#1:2274,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;

    @NotNull
    private MutableState<CalendarMonth> _displayedMonth;

    @NotNull
    private final CalendarModel calendarModel;

    /* renamed from: selectableDates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState selectableDates;

    @NotNull
    private final C6756f yearRange;

    public BaseDatePickerStateImpl(@Nullable Long l, @NotNull C6756f c6756f, @NotNull SelectableDates selectableDates, @NotNull Locale locale) {
        CalendarMonth month;
        this.yearRange = c6756f;
        CalendarModel calendarModelCreateCalendarModel = CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = calendarModelCreateCalendarModel;
        this.selectableDates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(selectableDates, null, 2, null);
        if (l != null) {
            month = calendarModelCreateCalendarModel.getMonth(l.longValue());
            if (!c6756f.m6434b(month.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + month.getYear() + ") is out of the years range of " + c6756f + '.').toString());
            }
        } else {
            month = calendarModelCreateCalendarModel.getMonth(calendarModelCreateCalendarModel.getToday());
        }
        this._displayedMonth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
    }

    @NotNull
    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final long getDisplayedMonthMillis() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    @NotNull
    public final SelectableDates getSelectableDates() {
        return (SelectableDates) this.selectableDates.getValue();
    }

    @NotNull
    public final C6756f getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayedMonthMillis(long j7) {
        CalendarMonth month = this.calendarModel.getMonth(j7);
        if (this.yearRange.m6434b(month.getYear())) {
            this._displayedMonth.setValue(month);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + month.getYear() + ") is out of the years range of " + this.yearRange + '.').toString());
    }

    public final void setSelectableDates(@NotNull SelectableDates selectableDates) {
        this.selectableDates.setValue(selectableDates);
    }
}
