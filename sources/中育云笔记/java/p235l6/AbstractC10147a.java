package p235l6;

import android.content.Intent;
import android.net.Uri;

/* renamed from: l6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10147a {
    /* renamed from: a */
    public static Throwable m21163a(Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    /* renamed from: b */
    public static Uri m21164b(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("output");
        return uri == null ? (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri") : uri;
    }

    /* renamed from: c */
    public static float m21165c(Intent intent) {
        return intent.getFloatExtra("com.yalantis.ucrop.CropAspectRatio", 0.0f);
    }

    /* renamed from: d */
    public static String m21166d(Intent intent) {
        return intent.getStringExtra("customExtraData");
    }

    /* renamed from: e */
    public static int m21167e(Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1);
    }

    /* renamed from: f */
    public static int m21168f(Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetX", 0);
    }

    /* renamed from: g */
    public static int m21169g(Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetY", 0);
    }

    /* renamed from: h */
    public static int m21170h(Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1);
    }
}
