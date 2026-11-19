package p078i4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p094io.CloseableKt;

/* renamed from: i4.p */
/* loaded from: classes4.dex */
public abstract class AbstractC6546p {
    /* renamed from: a */
    public static final Uri m7405a(Context context, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "cropped_image_" + string + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                return FileProvider.getUriForFile(context, "com.zykj.manage.fileprovider", file);
            } finally {
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
