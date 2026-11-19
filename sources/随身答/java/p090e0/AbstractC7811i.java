package p090e0;

import android.os.StatFs;
import java.io.File;
import okio.FileSystem;
import okio.Path;

/* renamed from: e0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC7811i {
    /* renamed from: a */
    public static final long m12194a(FileSystem fileSystem, Path path) {
        File file = path.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
