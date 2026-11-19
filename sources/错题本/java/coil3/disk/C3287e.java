package coil3.disk;

import java.io.IOException;
import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* renamed from: coil3.disk.e */
/* loaded from: classes2.dex */
public final class C3287e extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink sink(Path path, boolean z8) throws IOException {
        Path pathParent = path.parent();
        if (pathParent != null) {
            createDirectories(pathParent);
        }
        return super.sink(path, z8);
    }
}
