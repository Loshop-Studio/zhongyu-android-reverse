package p001a0;

import coil3.util.AbstractC5490c;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.FileSystem;
import okio.Path;
import p310qd.AbstractC10793c0;

/* renamed from: a0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC0012i {
    /* renamed from: a */
    public static final void m23a(FileSystem fileSystem, Path path, boolean z10) throws IOException {
        if (z10) {
            AbstractC5490c.m3308h(fileSystem.sink(path, true));
        } else {
            if (fileSystem.exists(path)) {
                return;
            }
            AbstractC5490c.m3308h(fileSystem.sink(path));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m24b(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m23a(fileSystem, path, z10);
    }

    /* renamed from: c */
    public static final void m25c(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).isDirectory()) {
                        m25c(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: d */
    public static final String m26d(Path path) {
        return AbstractC10793c0.m23107T0(path.name(), '.', "");
    }
}
