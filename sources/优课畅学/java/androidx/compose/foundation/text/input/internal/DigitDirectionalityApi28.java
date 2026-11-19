package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(28)
/* loaded from: classes.dex */
final class DigitDirectionalityApi28 {
    public static final DigitDirectionalityApi28 INSTANCE = new DigitDirectionalityApi28();

    private DigitDirectionalityApi28() {
    }

    public final byte resolve(Locale locale) {
        return Character.getDirectionality(CodepointHelpers_jvmKt.codePointAt(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
    }
}
