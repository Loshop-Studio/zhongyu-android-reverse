package androidx.compose.p013ui.text.intl;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8807u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.p013ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        return new LocaleList((List<Locale>) AbstractC8807u.m14755e(new Locale(Locale.getDefault())));
    }

    @Override // androidx.compose.p013ui.text.intl.PlatformLocaleDelegate
    public Locale parseLanguageTag(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC9133u.m16128b(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(AndroidLocaleDelegate_androidKt.TAG, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
