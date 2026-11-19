package androidx.compose.p013ui.text.intl;

/* loaded from: classes2.dex */
public final class PlatformLocaleKt {
    private static final PlatformLocaleDelegate platformLocaleDelegate = AndroidPlatformLocale_androidKt.createPlatformLocaleDelegate();

    public static final PlatformLocaleDelegate getPlatformLocaleDelegate() {
        return platformLocaleDelegate;
    }
}
