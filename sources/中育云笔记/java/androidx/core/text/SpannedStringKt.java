package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i10, int i11) {
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) spanned.getSpans(i10, i11, Object.class);
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = spanned.length();
        }
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return spanned.getSpans(i10, i11, Object.class);
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
