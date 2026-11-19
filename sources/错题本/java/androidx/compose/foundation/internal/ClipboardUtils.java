package androidx.compose.foundation.internal;

import android.content.ClipData;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\r"}, m5110d2 = {"Landroidx/compose/foundation/internal/ClipboardUtils;", "", "()V", "hasText", "", "clipEntry", "Landroidx/compose/ui/platform/ClipEntry;", "readAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "readText", "", "toClipEntry", "annotatedString", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ClipboardUtils {
    public static final int $stable = 0;

    @NotNull
    public static final ClipboardUtils INSTANCE = new ClipboardUtils();

    private ClipboardUtils() {
    }

    @JvmStatic
    public static final boolean hasText(@Nullable ClipEntry clipEntry) {
        if (clipEntry == null) {
            return false;
        }
        return clipEntry.getClipData().getDescription().hasMimeType("text/*");
    }

    @JvmStatic
    @Nullable
    public static final AnnotatedString readAnnotatedString(@NotNull ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return ClipboardUtils_androidKt.convertToAnnotatedString(text);
    }

    @JvmStatic
    @Nullable
    public static final String readText(@NotNull ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @JvmStatic
    @Nullable
    public static final ClipEntry toClipEntry(@Nullable AnnotatedString annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new ClipEntry(ClipData.newPlainText("plain text", ClipboardUtils_androidKt.convertToCharSequence(annotatedString)));
    }
}
