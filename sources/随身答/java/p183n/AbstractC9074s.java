package p183n;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import p183n.InterfaceC9073r;

/* renamed from: n.s */
/* loaded from: classes3.dex */
public abstract class AbstractC9074s {
    /* renamed from: a */
    public static final InterfaceC9073r m14552a(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC9073r.a aVar) {
        return new C9076u(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: b */
    public static final InterfaceC9073r m14553b(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC9073r.a aVar) {
        return new C9072q(path, fileSystem, str, autoCloseable, aVar);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC9073r m14554c(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC9073r.a aVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            aVar = null;
        }
        return m14552a(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9073r m14555d(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC9073r.a aVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            str = null;
        }
        if ((i9 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i9 & 16) != 0) {
            aVar = null;
        }
        return m14553b(path, fileSystem, str, autoCloseable, aVar);
    }
}
