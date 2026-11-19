package coil3.disk;

import kotlin.coroutines.EmptyCoroutineContext;
import okio.FileSystem;
import okio.Path;

/* renamed from: coil3.disk.j */
/* loaded from: classes2.dex */
public final class C3292j implements InterfaceC3283a {

    /* renamed from: a */
    public final FileSystem f1973a;

    /* renamed from: b */
    public final C3288f f1974b;

    public C3292j(long j7, Path path, FileSystem fileSystem, EmptyCoroutineContext emptyCoroutineContext) {
        this.f1973a = fileSystem;
        this.f1974b = new C3288f(fileSystem, path, emptyCoroutineContext, j7);
    }
}
