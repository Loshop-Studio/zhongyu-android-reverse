package p219k6;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: k6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9820b {
    /* renamed from: a */
    public static InputStream m19892a(Context context, Uri uri) {
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static OutputStream m19893b(Context context, Uri uri) {
        try {
            return context.getContentResolver().openOutputStream(uri);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
