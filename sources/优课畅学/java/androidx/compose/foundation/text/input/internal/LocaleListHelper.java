package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.intl.Locale;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8811w;

@StabilityInferred(parameters = 1)
@RequiresApi(24)
/* loaded from: classes.dex */
public final class LocaleListHelper {
    public static final int $stable = 0;
    public static final LocaleListHelper INSTANCE = new LocaleListHelper();

    private LocaleListHelper() {
    }

    @RequiresApi(24)
    public final void setHintLocales(EditorInfo editorInfo, LocaleList localeList) {
        if (AbstractC9133u.m16128b(localeList, LocaleList.Companion.getEmpty())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
