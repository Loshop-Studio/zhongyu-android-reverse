package p110n;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* renamed from: n.r */
/* loaded from: classes3.dex */
public interface InterfaceC7435r extends AutoCloseable {

    /* renamed from: n.r$a */
    public static abstract class a {
    }

    /* renamed from: f */
    Path mo8480f();

    FileSystem getFileSystem();

    a getMetadata();

    BufferedSource source();
}
