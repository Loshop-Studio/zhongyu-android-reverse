package p030c0;

import coil3.util.AbstractC5213c;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.text.StringsKt;
import okio.FileSystem;
import okio.Path;

/* renamed from: c0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5084i {
    /* renamed from: a */
    public static final void m2682a(FileSystem fileSystem, Path path, boolean z9) throws IOException {
        if (z9) {
            AbstractC5213c.m3214h(fileSystem.sink(path, true));
        } else {
            if (fileSystem.exists(path)) {
                return;
            }
            AbstractC5213c.m3214h(fileSystem.sink(path));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m2683b(FileSystem fileSystem, Path path, boolean z9, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        m2682a(fileSystem, path, z9);
    }

    /* renamed from: c */
    public static final void m2684c(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        m2684c(fileSystem, path2);
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
    public static final String m2685d(Path path) {
        return StringsKt.substringAfterLast(path.name(), '.', "");
    }
}
