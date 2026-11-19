package p172n;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import p172n.InterfaceC8603r;

/* renamed from: n.s */
/* loaded from: classes3.dex */
public abstract class AbstractC8604s {
    /* renamed from: a */
    public static final InterfaceC8603r m14161a(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC8603r.a aVar) {
        return new C8606u(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: b */
    public static final InterfaceC8603r m14162b(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC8603r.a aVar) {
        return new C8602q(path, fileSystem, str, autoCloseable, aVar);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC8603r m14163c(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC8603r.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return m14161a(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8603r m14164d(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC8603r.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return m14162b(path, fileSystem, str, autoCloseable, aVar);
    }
}
