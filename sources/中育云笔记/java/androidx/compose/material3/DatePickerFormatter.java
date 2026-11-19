package androidx.compose.material3;

import java.util.Locale;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface DatePickerFormatter {
    static /* synthetic */ String formatDate$default(DatePickerFormatter datePickerFormatter, Long l10, Locale locale, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return datePickerFormatter.formatDate(l10, locale, z10);
    }

    String formatDate(Long l10, Locale locale, boolean z10);

    String formatMonthYear(Long l10, Locale locale);
}
