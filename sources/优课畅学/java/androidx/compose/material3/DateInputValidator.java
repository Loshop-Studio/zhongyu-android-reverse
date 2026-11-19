package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.C8321f;

@Stable
/* loaded from: classes2.dex */
public final class DateInputValidator {
    public static final int $stable = 0;
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final C8321f yearRange;

    public DateInputValidator(C8321f c8321f, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l10, Long l11) {
        this.yearRange = c8321f;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
        this.currentStartDateMillis = l10;
        this.currentEndDateMillis = l11;
    }

    public final Long getCurrentEndDateMillis$material3_release() {
        return this.currentEndDateMillis;
    }

    public final Long getCurrentStartDateMillis$material3_release() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentEndDateMillis$material3_release(Long l10) {
        this.currentEndDateMillis = l10;
    }

    public final void setCurrentStartDateMillis$material3_release(Long l10) {
        this.currentStartDateMillis = l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m21974validateXivgLIo(androidx.compose.material3.internal.CalendarDate r9, int r10, java.util.Locale r11) {
        /*
            r8 = this;
            r0 = 1
            java.lang.String r1 = "format(this, *args)"
            if (r9 != 0) goto L28
            java.lang.String r9 = r8.errorDatePattern
            androidx.compose.material3.internal.DateInputFormat r10 = r8.dateInputFormat
            java.lang.String r10 = r10.getPatternWithDelimiters()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toUpperCase(r11)
            java.lang.String r11 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r10, r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            java.lang.String r9 = java.lang.String.format(r9, r10)
            kotlin.jvm.internal.AbstractC9133u.m16132f(r9, r1)
            return r9
        L28:
            d8.f r2 = r8.yearRange
            int r3 = r9.getYear()
            boolean r2 = r2.m13502g(r3)
            if (r2 != 0) goto L60
            java.lang.String r9 = r8.errorDateOutOfYearRange
            d8.f r10 = r8.yearRange
            int r2 = r10.m13496b()
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r10 = androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(r2, r3, r4, r5, r6, r7)
            d8.f r11 = r8.yearRange
            int r2 = r11.m13497c()
            java.lang.String r11 = androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}
            r11 = 2
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            java.lang.String r9 = java.lang.String.format(r9, r10)
            kotlin.jvm.internal.AbstractC9133u.m16132f(r9, r1)
            return r9
        L60:
            androidx.compose.material3.SelectableDates r2 = r8.selectableDates
            int r3 = r9.getYear()
            boolean r3 = r2.isSelectableYear(r3)
            if (r3 == 0) goto Lbc
            long r3 = r9.getUtcTimeMillis()
            boolean r2 = r2.isSelectableDate(r3)
            if (r2 != 0) goto L77
            goto Lbc
        L77:
            androidx.compose.material3.InputIdentifier$Companion r11 = androidx.compose.material3.InputIdentifier.Companion
            int r0 = r11.m22170getStartDateInputJ2x2o4M()
            boolean r0 = androidx.compose.material3.InputIdentifier.m22164equalsimpl0(r10, r0)
            if (r0 == 0) goto L99
            long r0 = r9.getUtcTimeMillis()
            java.lang.Long r2 = r8.currentEndDateMillis
            if (r2 == 0) goto L90
            long r2 = r2.longValue()
            goto L95
        L90:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L95:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lb6
        L99:
            int r11 = r11.m22168getEndDateInputJ2x2o4M()
            boolean r10 = androidx.compose.material3.InputIdentifier.m22164equalsimpl0(r10, r11)
            if (r10 == 0) goto Lb9
            long r9 = r9.getUtcTimeMillis()
            java.lang.Long r11 = r8.currentStartDateMillis
            if (r11 == 0) goto Lb0
            long r0 = r11.longValue()
            goto Lb2
        Lb0:
            r0 = -9223372036854775808
        Lb2:
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto Lb9
        Lb6:
            java.lang.String r9 = r8.errorInvalidRangeInput
            return r9
        Lb9:
            java.lang.String r9 = ""
            return r9
        Lbc:
            java.lang.String r10 = r8.errorInvalidNotAllowed
            androidx.compose.material3.DatePickerFormatter r2 = r8.dateFormatter
            long r3 = r9.getUtcTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6 = 4
            r7 = 0
            r5 = 0
            r4 = r11
            java.lang.String r9 = androidx.compose.material3.DatePickerFormatter.formatDate$default(r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            java.lang.String r9 = java.lang.String.format(r10, r9)
            kotlin.jvm.internal.AbstractC9133u.m16132f(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.m21974validateXivgLIo(androidx.compose.material3.internal.CalendarDate, int, java.util.Locale):java.lang.String");
    }

    public /* synthetic */ DateInputValidator(C8321f c8321f, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l10, Long l11, int i10, AbstractC9126n abstractC9126n) {
        this(c8321f, selectableDates, dateInputFormat, datePickerFormatter, str, str2, str3, str4, (i10 & 256) != 0 ? null : l10, (i10 & 512) != 0 ? null : l11);
    }
}
