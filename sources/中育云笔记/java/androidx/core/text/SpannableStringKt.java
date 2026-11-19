package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import p265nd.C10405j;

/* loaded from: classes2.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i10, int i11, Object obj) {
        spannable.setSpan(obj, i10, i11, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, C10405j c10405j, Object obj) {
        spannable.setSpan(obj, c10405j.getStart().intValue(), c10405j.getEndInclusive().intValue(), 17);
    }
}
