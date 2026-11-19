package coil3.network;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSource;

/* renamed from: coil3.network.n */
/* loaded from: classes2.dex */
public final class C3325n implements AutoCloseable {

    /* renamed from: a */
    public final BufferedSource f2030a;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2030a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3325n) {
            return AbstractC5830k.m5325b(this.f2030a, ((C3325n) obj).f2030a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2030a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f2030a + ')';
    }
}
