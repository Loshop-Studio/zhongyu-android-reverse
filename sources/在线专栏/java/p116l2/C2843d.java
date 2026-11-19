package p116l2;

import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: l2.d */
/* loaded from: classes.dex */
public final class C2843d {

    /* renamed from: a */
    @NotNull
    public static final C2843d f10944a = new C2843d();

    /* renamed from: b */
    private static long f10945b = 604800000;

    private C2843d() {
    }

    /* renamed from: a */
    public final void m9540a(@NotNull File file) {
        C2769l.m9241e(file, "file");
        if (file.exists()) {
            if (file.isFile()) {
                if (System.currentTimeMillis() - file.lastModified() >= f10945b) {
                    file.delete();
                    Log.i("clean", C2769l.m9248l("当前清除的是文件---->", file.getAbsolutePath()));
                    return;
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            boolean z3 = false;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i4 = 0;
                while (i4 < length) {
                    File it = fileArrListFiles[i4];
                    i4++;
                    C2843d c2843d = f10944a;
                    C2769l.m9240d(it, "it");
                    c2843d.m9540a(it);
                }
            }
            File[] fileArrListFiles2 = file.listFiles();
            if (fileArrListFiles2 != null) {
                if (fileArrListFiles2.length == 0) {
                    z3 = true;
                }
            }
            if (z3) {
                file.delete();
                Log.i("clean", C2769l.m9248l("当前清除的是文件夹---->", file.getAbsolutePath()));
            }
        }
    }

    /* renamed from: b */
    public final void m9541b(long j4) {
        f10945b = j4;
    }
}
