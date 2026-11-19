package p019b1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: b1.f */
/* loaded from: classes3.dex */
public class C5095f {
    /* renamed from: a */
    public AbstractC5098i m2146a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C5091b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C5093d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
