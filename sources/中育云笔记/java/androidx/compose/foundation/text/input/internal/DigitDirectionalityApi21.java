package androidx.compose.foundation.text.input.internal;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes.dex */
final class DigitDirectionalityApi21 {
    public static final DigitDirectionalityApi21 INSTANCE = new DigitDirectionalityApi21();

    private DigitDirectionalityApi21() {
    }

    public final byte resolve(Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }
}
