package p016b0;

import com.bumptech.glide.request.C3420a;
import java.util.concurrent.Executor;

/* renamed from: b0.u */
/* loaded from: classes2.dex */
public final class C3091u {

    /* renamed from: a */
    public final C3420a f1497a;

    /* renamed from: b */
    public final Executor f1498b;

    public C3091u(C3420a c3420a, Executor executor) {
        this.f1497a = c3420a;
        this.f1498b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3091u) {
            return this.f1497a.equals(((C3091u) obj).f1497a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1497a.hashCode();
    }
}
