package p110n;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import p110n.InterfaceC7435r;

/* renamed from: n.s */
/* loaded from: classes3.dex */
public abstract class AbstractC7436s {
    /* renamed from: a */
    public static final InterfaceC7435r m8482a(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC7435r.a aVar) {
        return new C7438u(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: b */
    public static final InterfaceC7435r m8483b(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC7435r.a aVar) {
        return new C7434q(path, fileSystem, str, autoCloseable, aVar);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC7435r m8484c(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC7435r.a aVar, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            aVar = null;
        }
        return m8482a(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC7435r m8485d(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC7435r.a aVar, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            str = null;
        }
        if ((i6 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i6 & 16) != 0) {
            aVar = null;
        }
        return m8483b(path, fileSystem, str, autoCloseable, aVar);
    }
}
