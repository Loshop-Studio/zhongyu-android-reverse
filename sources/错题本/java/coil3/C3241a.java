package coil3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.a */
/* loaded from: classes2.dex */
public final class C3241a implements InterfaceC3305k {

    /* renamed from: a */
    public final Bitmap f1813a;

    public C3241a(Bitmap bitmap) {
        this.f1813a = bitmap;
    }

    @Override // coil3.InterfaceC3305k
    /* renamed from: a */
    public final boolean mo2175a() {
        return true;
    }

    @Override // coil3.InterfaceC3305k
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f1813a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3241a) && AbstractC5830k.m5325b(this.f1813a, ((C3241a) obj).f1813a);
    }

    @Override // coil3.InterfaceC3305k
    public final int getHeight() {
        return this.f1813a.getHeight();
    }

    @Override // coil3.InterfaceC3305k
    public final long getSize() {
        int allocationByteCount;
        Bitmap bitmap = this.f1813a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    @Override // coil3.InterfaceC3305k
    public final int getWidth() {
        return this.f1813a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1813a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f1813a + ", shareable=true)";
    }
}
