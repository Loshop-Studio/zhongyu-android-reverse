package p030c0;

import android.os.StatFs;
import java.io.File;
import okio.FileSystem;
import okio.Path;

/* renamed from: c0.j */
/* loaded from: classes3.dex */
public abstract class AbstractC5085j {
    /* renamed from: a */
    public static final long m2686a(FileSystem fileSystem, Path path) {
        File file = path.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
