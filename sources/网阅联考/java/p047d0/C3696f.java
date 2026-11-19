package p047d0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: d0.f */
/* loaded from: classes2.dex */
public class C3696f {
    /* renamed from: a */
    public AbstractC3699i m4680a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C3692b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C3694d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
