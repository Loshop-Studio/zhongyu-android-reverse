package androidx.compose.p013ui.text.intl;

import android.os.LocaleList;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.platform.SynchronizedObject;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@RequiresApi(api = 24)
/* loaded from: classes2.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    public static final int $stable = 8;
    private LocaleList lastLocaleList;
    private LocaleList lastPlatformLocaleList;
    private final SynchronizedObject lock = new SynchronizedObject();

    @Override // androidx.compose.p013ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new Locale(localeList.get(i10)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }

    @Override // androidx.compose.p013ui.text.intl.PlatformLocaleDelegate
    public Locale parseLanguageTag(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC9133u.m16128b(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(AndroidLocaleDelegate_androidKt.TAG, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
