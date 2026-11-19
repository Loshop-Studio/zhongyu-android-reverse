package p215k2;

import android.os.SystemClock;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: k2.m */
/* loaded from: classes3.dex */
public abstract class AbstractC9795m {

    /* renamed from: a */
    public static final a f22988a = new a(null);

    /* renamed from: b */
    public static long f22989b;

    /* renamed from: k2.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final boolean m19787a() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - AbstractC9795m.f22989b < 1500) {
                return true;
            }
            AbstractC9795m.f22989b = jElapsedRealtime;
            return false;
        }

        public a() {
        }
    }
}
