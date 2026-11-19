package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.p014ui.text.style.TextDirection;
import java.util.Locale;

/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(Locale locale) {
        byte bResolve = Build.VERSION.SDK_INT >= 28 ? DigitDirectionalityApi28.INSTANCE.resolve(locale) : DigitDirectionalityApi24.INSTANCE.resolve(locale);
        return (bResolve == 1 || bResolve == 2) ? TextDirection.Companion.m33403getRtls_7Xco() : TextDirection.Companion.m33402getLtrs_7Xco();
    }
}
