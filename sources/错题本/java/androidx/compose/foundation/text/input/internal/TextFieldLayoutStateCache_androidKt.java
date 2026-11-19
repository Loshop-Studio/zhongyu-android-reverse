package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.p011ui.text.style.TextDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"resolveTextDirectionForKeyboardTypePhone", "Landroidx/compose/ui/text/style/TextDirection;", "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "(Ljava/util/Locale;)I", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(@NotNull Locale locale) {
        byte bResolve = Build.VERSION.SDK_INT >= 28 ? DigitDirectionalityApi28.INSTANCE.resolve(locale) : DigitDirectionalityApi24.INSTANCE.resolve(locale);
        return (bResolve == 1 || bResolve == 2) ? TextDirection.INSTANCE.m13207getRtls_7Xco() : TextDirection.INSTANCE.m13206getLtrs_7Xco();
    }
}
