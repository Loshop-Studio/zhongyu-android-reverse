package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SelectedRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            if (calendarDate.getUtcTimeMillis() > calendarMonth.getEndUtcTimeMillis() || calendarDate2.getUtcTimeMillis() < calendarMonth.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z10 = calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis();
            boolean z11 = calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis();
            int daysFromStartOfWeekToFirstOfMonth = z10 ? (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate.getDayOfMonth()) - 1 : calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
            int daysFromStartOfWeekToFirstOfMonth2 = z11 ? (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate2.getDayOfMonth()) - 1 : (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
            return new SelectedRangeInfo(IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth % 7, daysFromStartOfWeekToFirstOfMonth / 7), IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth2 % 7, daysFromStartOfWeekToFirstOfMonth2 / 7), z10, z11, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j10, long j11, boolean z10, boolean z11, AbstractC9126n abstractC9126n) {
        this(j10, j11, z10, z11);
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m22471getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    /* renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m22472getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    private SelectedRangeInfo(long j10, long j11, boolean z10, boolean z11) {
        this.gridStartCoordinates = j10;
        this.gridEndCoordinates = j11;
        this.firstIsSelectionStart = z10;
        this.lastIsSelectionEnd = z11;
    }
}
