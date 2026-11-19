package androidx.navigation.internal;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class Log {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: i */
        public final void m1940i(String tag, String message) {
            AbstractC9979u.m20294g(tag, "tag");
            AbstractC9979u.m20294g(message, "message");
            android.util.Log.i(tag, message);
        }

        private Companion() {
        }
    }
}
