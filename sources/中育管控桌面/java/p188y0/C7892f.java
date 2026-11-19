package p188y0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: y0.f */
/* loaded from: classes3.dex */
public class C7892f {
    /* renamed from: a */
    public AbstractC7895i m9689a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C7888b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C7890d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
