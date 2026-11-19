package androidx.compose.p013ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.intl.Locale;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.platform.AndroidTextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p134i7.AbstractC8811w;

@StabilityInferred(parameters = 1)
@RequiresApi(24)
/* loaded from: classes2.dex */
public final class LocaleListHelperMethods {
    public static final int $stable = 0;
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    @RequiresApi(24)
    public final Object localeSpan(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @RequiresApi(24)
    public final void setTextLocales(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
