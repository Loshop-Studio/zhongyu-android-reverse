package p023c0;

import coil3.util.AbstractC4594c;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.text.StringsKt;
import okio.FileSystem;
import okio.Path;

/* renamed from: c0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4464i {
    /* renamed from: a */
    public static final void m1540a(FileSystem fileSystem, Path path, boolean z6) throws IOException {
        if (z6) {
            AbstractC4594c.m2040h(fileSystem.sink(path, true));
        } else {
            if (fileSystem.exists(path)) {
                return;
            }
            AbstractC4594c.m2040h(fileSystem.sink(path));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m1541b(FileSystem fileSystem, Path path, boolean z6, int i6, Object obj) throws IOException {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        m1540a(fileSystem, path, z6);
    }

    /* renamed from: c */
    public static final void m1542c(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        m1542c(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e6) {
                    if (iOException == null) {
                        iOException = e6;
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
    public static final String m1543d(Path path) {
        return StringsKt.substringAfterLast(path.name(), '.', "");
    }
}
