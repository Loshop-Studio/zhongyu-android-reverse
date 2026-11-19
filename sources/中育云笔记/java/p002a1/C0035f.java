package p002a1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: a1.f */
/* loaded from: classes3.dex */
public class C0035f {
    /* renamed from: a */
    public AbstractC0038i m74a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C0031b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C0033d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
