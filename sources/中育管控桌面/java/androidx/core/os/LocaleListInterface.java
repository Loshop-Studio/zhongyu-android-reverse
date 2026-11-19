package androidx.core.os;

import androidx.annotation.IntRange;
import java.util.Locale;

/* loaded from: classes2.dex */
interface LocaleListInterface {
    Locale get(int i6);

    Locale getFirstMatch(String[] strArr);

    Object getLocaleList();

    @IntRange(from = -1)
    int indexOf(Locale locale);

    boolean isEmpty();

    @IntRange(from = 0)
    int size();

    String toLanguageTags();
}
