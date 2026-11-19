package okio;

import kotlin.jvm.internal.AbstractC9133u;
import okio.internal.ZipFilesKt;

/* loaded from: classes5.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
