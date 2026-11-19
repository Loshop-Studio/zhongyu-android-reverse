package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class CalendarLocale_jvmKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    private static final NumberFormat getCachedDateTimeFormatter(int i10, int i11, boolean z10) {
        String str = i10 + '.' + i11 + '.' + z10 + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z10);
            integerInstance.setMinimumIntegerDigits(i10);
            integerInstance.setMaximumIntegerDigits(i11);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }

    public static final String toLocalString(int i10, int i11, int i12, boolean z10) {
        return getCachedDateTimeFormatter(i11, i12, z10).format(Integer.valueOf(i10));
    }

    public static /* synthetic */ String toLocalString$default(int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1;
        }
        if ((i13 & 2) != 0) {
            i12 = 40;
        }
        if ((i13 & 4) != 0) {
            z10 = false;
        }
        return toLocalString(i10, i11, i12, z10);
    }
}
