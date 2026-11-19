package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0086\b¨\u0006\u0005"}, m13558d2 = {"isDigitsOnly", "", "", "trimmedLength", "", "core-ktx_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
