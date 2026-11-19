package p186w;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: w.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6692g {

    /* renamed from: a */
    public static final Charset f11306a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m6397a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m6397a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
