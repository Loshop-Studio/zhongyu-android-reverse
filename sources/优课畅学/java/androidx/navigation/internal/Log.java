package androidx.navigation.internal;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class Log {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: i */
        public final void m1822i(String tag, String message) {
            AbstractC9133u.m16133g(tag, "tag");
            AbstractC9133u.m16133g(message, "message");
            android.util.Log.i(tag, message);
        }

        private Companion() {
        }
    }
}
