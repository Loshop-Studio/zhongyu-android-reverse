package p378vb;

import android.net.Uri;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

/* renamed from: vb.m */
/* loaded from: classes6.dex */
public abstract class AbstractC11583m {
    /* renamed from: a */
    public static final Uri m25503a() {
        File externalCacheDir = Utils.getApp().getExternalCacheDir();
        String string = UUID.randomUUID().toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        File file = new File(externalCacheDir, AbstractC10819z.m23238K(string, "-", "", false, 4, null) + ".webp");
        FileUtils.createOrExistsFile(file);
        Uri uriFile2Uri = UriUtils.file2Uri(file);
        AbstractC9979u.m20293f(uriFile2Uri, "let(...)");
        return uriFile2Uri;
    }
}
