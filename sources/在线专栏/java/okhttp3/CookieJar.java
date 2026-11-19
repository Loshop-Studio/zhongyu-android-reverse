package okhttp3;

import java.util.List;
import kotlin.collections.C2730l;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface CookieJar {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            @NotNull
            public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
                C2769l.m9241e(url, "url");
                return C2730l.m9139f();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
                C2769l.m9241e(url, "url");
                C2769l.m9241e(cookies, "cookies");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    @NotNull
    List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl);

    void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list);
}
