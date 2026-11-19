package p228l;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import p228l.InterfaceC10085r;

/* renamed from: l.s */
/* loaded from: classes3.dex */
public abstract class AbstractC10086s {
    /* renamed from: a */
    public static final InterfaceC10085r m21094a(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC10085r.a aVar) {
        return new C10088u(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: b */
    public static final InterfaceC10085r m21095b(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC10085r.a aVar) {
        return new C10084q(path, fileSystem, str, autoCloseable, aVar);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10085r m21096c(BufferedSource bufferedSource, FileSystem fileSystem, InterfaceC10085r.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return m21094a(bufferedSource, fileSystem, aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10085r m21097d(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable, InterfaceC10085r.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return m21095b(path, fileSystem, str, autoCloseable, aVar);
    }
}
