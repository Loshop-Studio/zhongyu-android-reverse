package p027b8;

import android.net.Uri;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: b8.r */
/* loaded from: classes5.dex */
public abstract class AbstractC5061r {
    /* renamed from: a */
    public static final Uri m2569a() {
        File externalCacheDir = Utils.getApp().getExternalCacheDir();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File file = new File(externalCacheDir, StringsKt.replace$default(string, "-", "", false, 4, (Object) null) + ".webp");
        FileUtils.createOrExistsFile(file);
        Uri uriFile2Uri = UriUtils.file2Uri(file);
        Intrinsics.checkNotNullExpressionValue(uriFile2Uri, "let(...)");
        return uriFile2Uri;
    }
}
