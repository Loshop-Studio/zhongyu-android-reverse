package p084f1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: f1.f */
/* loaded from: classes3.dex */
public class C7429f {
    /* renamed from: a */
    public AbstractC7432i m11965a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C7425b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C7427d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
