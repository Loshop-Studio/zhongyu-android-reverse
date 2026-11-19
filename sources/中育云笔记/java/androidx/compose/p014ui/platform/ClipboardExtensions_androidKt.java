package androidx.compose.p014ui.platform;

import android.net.Uri;
import androidx.compose.p014ui.ExperimentalComposeUiApi;

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
