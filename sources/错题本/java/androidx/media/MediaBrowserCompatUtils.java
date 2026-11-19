package androidx.media;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MediaBrowserCompatUtils {
    private MediaBrowserCompatUtils() {
    }

    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i;
        int i8;
        int i9;
        int i10 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i11 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int i12 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i13 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i14 = Integer.MAX_VALUE;
        if (i10 == -1 || i12 == -1) {
            i = Integer.MAX_VALUE;
            i8 = 0;
        } else {
            i8 = i10 * i12;
            i = (i12 + i8) - 1;
        }
        if (i11 == -1 || i13 == -1) {
            i9 = 0;
        } else {
            i9 = i11 * i13;
            i14 = (i13 + i9) - 1;
        }
        return i >= i9 && i14 >= i8;
    }
}
