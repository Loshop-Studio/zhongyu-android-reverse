package p163v2;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import p128o2.C2909b;

/* renamed from: v2.a */
/* loaded from: classes.dex */
public final class C3424a {
    /* renamed from: a */
    public static final void m10441a(@Nullable Closeable closeable, @Nullable Throwable th) throws IOException {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C2909b.m9982a(th, th2);
        }
    }
}
