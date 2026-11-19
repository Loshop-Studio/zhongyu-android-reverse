package androidx.compose.p013ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class Locale {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final java.util.Locale platformLocale;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        private Companion() {
        }
    }

    public Locale(java.util.Locale locale) {
        this.platformLocale = locale;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC9133u.m16128b(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public final String getRegion() {
        return PlatformLocale_jvmKt.getRegion(this.platformLocale);
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return PlatformLocale_jvmKt.getLanguageTag(this.platformLocale);
    }

    public String toString() {
        return toLanguageTag();
    }

    public Locale(String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }
}
