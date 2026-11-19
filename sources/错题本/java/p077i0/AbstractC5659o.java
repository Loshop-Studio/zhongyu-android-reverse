package p077i0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p024c0.InterfaceC3205b;

/* renamed from: i0.o */
/* loaded from: classes2.dex */
public abstract class AbstractC5659o {

    /* renamed from: a */
    public static final C5658n f8815a = new C5658n();

    /* renamed from: a */
    public static C5647c m4992a(InterfaceC3205b interfaceC3205b, Drawable drawable, int i, int i8) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z8 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i8 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i8 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC5665u.f8827b;
                    lock.lock();
                    Bitmap bitmapMo2145i = interfaceC3205b.mo2145i(i, i8, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo2145i);
                        current.setBounds(0, 0, i, i8);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo2145i;
                        z8 = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z8 = true;
        }
        if (!z8) {
            interfaceC3205b = f8815a;
        }
        return C5647c.m4972b(bitmap, interfaceC3205b);
    }
}
