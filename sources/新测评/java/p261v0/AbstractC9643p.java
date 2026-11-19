package p261v0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p184o0.InterfaceC8690j;
import p195p0.C8805e;
import p195p0.InterfaceC8804d;

/* renamed from: v0.p */
/* loaded from: classes3.dex */
public abstract class AbstractC9643p {

    /* renamed from: a */
    public static final InterfaceC8804d f16827a = new a();

    /* renamed from: a */
    public static InterfaceC8690j m16012a(InterfaceC8804d interfaceC8804d, Drawable drawable, int i10, int i11) {
        Bitmap bitmapM16013b;
        Drawable current = drawable.getCurrent();
        boolean z9 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM16013b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM16013b = null;
        } else {
            bitmapM16013b = m16013b(interfaceC8804d, current, i10, i11);
            z9 = true;
        }
        if (!z9) {
            interfaceC8804d = f16827a;
        }
        return C9633f.m16002c(bitmapM16013b, interfaceC8804d);
    }

    /* renamed from: b */
    public static Bitmap m16013b(InterfaceC8804d interfaceC8804d, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock lockM16041i = AbstractC9652y.m16041i();
        lockM16041i.lock();
        Bitmap bitmapMo14713d = interfaceC8804d.mo14713d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo14713d);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo14713d;
        } finally {
            lockM16041i.unlock();
        }
    }

    /* renamed from: v0.p$a */
    public class a extends C8805e {
        @Override // p195p0.C8805e, p195p0.InterfaceC8804d
        /* renamed from: c */
        public void mo14712c(Bitmap bitmap) {
        }
    }
}
