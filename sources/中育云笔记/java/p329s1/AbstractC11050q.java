package p329s1;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;

/* renamed from: s1.q */
/* loaded from: classes3.dex */
public abstract class AbstractC11050q {
    /* renamed from: a */
    public static File m24490a(Context context, boolean z10) {
        String externalStorageState;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            externalStorageState = "";
        }
        File fileM24491b = (z10 && "mounted".equals(externalStorageState) && Build.VERSION.SDK_INT <= 28) ? m24491b(context) : null;
        if (fileM24491b == null) {
            fileM24491b = context.getCacheDir();
        }
        if (fileM24491b != null) {
            return fileM24491b;
        }
        String str = "/data/data/" + context.getPackageName() + "/cache/";
        AbstractC11039f.m24406f("Can't define system cache directory! '" + str + "%s' will be used.");
        return new File(str);
    }

    /* renamed from: b */
    public static File m24491b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        AbstractC11039f.m24406f("Unable to create external cache directory");
        return null;
    }

    /* renamed from: c */
    public static File m24492c(Context context) {
        return new File(m24490a(context, true), "video-cache");
    }
}
