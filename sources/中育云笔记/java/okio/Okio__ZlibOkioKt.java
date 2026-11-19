package okio;

import kotlin.jvm.internal.AbstractC9979u;
import okio.internal.ZipFilesKt;

/* loaded from: classes6.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) {
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
