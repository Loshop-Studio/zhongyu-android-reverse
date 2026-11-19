package p081e0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: e0.g */
/* loaded from: classes3.dex */
public class C8342g {
    /* renamed from: a */
    public AbstractC8345j m13573a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C8337b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C8340e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
