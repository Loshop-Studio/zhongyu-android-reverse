package p298q0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p198j0.InterfaceC9657j;
import p213k0.C9773e;
import p213k0.InterfaceC9772d;

/* renamed from: q0.o */
/* loaded from: classes3.dex */
public abstract class AbstractC10706o {

    /* renamed from: a */
    public static final InterfaceC9772d f25767a = new a();

    /* renamed from: a */
    public static InterfaceC9657j m22669a(InterfaceC9772d interfaceC9772d, Drawable drawable, int i10, int i11) {
        Bitmap bitmapM22670b;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM22670b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM22670b = null;
        } else {
            bitmapM22670b = m22670b(interfaceC9772d, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            interfaceC9772d = f25767a;
        }
        return C10697f.m22659c(bitmapM22670b, interfaceC9772d);
    }

    /* renamed from: b */
    public static Bitmap m22670b(InterfaceC9772d interfaceC9772d, Drawable drawable, int i10, int i11) {
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
        Lock lockM22697h = AbstractC10716y.m22697h();
        lockM22697h.lock();
        Bitmap bitmapMo19711d = interfaceC9772d.mo19711d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo19711d);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo19711d;
        } finally {
            lockM22697h.unlock();
        }
    }

    /* renamed from: q0.o$a */
    public class a extends C9773e {
        @Override // p213k0.C9773e, p213k0.InterfaceC9772d
        /* renamed from: c */
        public void mo19710c(Bitmap bitmap) {
        }
    }
}
