package p130e6;

import android.util.Log;
import java.io.File;

/* renamed from: e6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9106a {
    /* renamed from: a */
    public static void m17899a(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        Log.e("IOUtil", "deleteSecure exception");
    }
}
