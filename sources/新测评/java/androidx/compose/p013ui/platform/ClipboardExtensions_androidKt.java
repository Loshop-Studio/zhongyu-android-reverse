package androidx.compose.p013ui.platform;

import android.net.Uri;
import androidx.compose.p013ui.ExperimentalComposeUiApi;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m13558d2 = {"firstUriOrNull", "Landroid/net/Uri;", "Landroidx/compose/ui/platform/ClipEntry;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ClipboardExtensions_androidKt {
    @ExperimentalComposeUiApi
    public static final Uri firstUriOrNull(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = clipEntry.getClipData().getItemAt(i10).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
