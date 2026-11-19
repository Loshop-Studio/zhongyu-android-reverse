package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ZipFilesKt;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m13558d2 = {"openZip", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "okio"}, m13559k = 5, m13560mv = {2, 1, 0}, m13562xi = 48, m13563xs = "okio/Okio")
/* loaded from: classes5.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
