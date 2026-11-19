package p090e0;

import coil3.util.AbstractC5348c;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.text.StringsKt;
import okio.FileSystem;
import okio.Path;

/* renamed from: e0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC7810h {
    /* renamed from: a */
    public static final void m12190a(FileSystem fileSystem, Path path, boolean z9) throws IOException {
        if (z9) {
            AbstractC5348c.m2931h(fileSystem.sink(path, true));
        } else {
            if (fileSystem.exists(path)) {
                return;
            }
            AbstractC5348c.m2931h(fileSystem.sink(path));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m12191b(FileSystem fileSystem, Path path, boolean z9, int i9, Object obj) throws IOException {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        m12190a(fileSystem, path, z9);
    }

    /* renamed from: c */
    public static final void m12192c(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        m12192c(fileSystem, path2);
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
    public static final String m12193d(Path path) {
        return StringsKt.substringAfterLast(path.name(), '.', "");
    }
}
