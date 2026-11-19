package p228r0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p152k0.InterfaceC8259j;
import p164l0.C8868e;
import p164l0.InterfaceC8867d;

/* renamed from: r0.o */
/* loaded from: classes3.dex */
public abstract class AbstractC9405o {

    /* renamed from: a */
    public static final InterfaceC8867d f16394a = new a();

    /* renamed from: a */
    public static InterfaceC8259j m15474a(InterfaceC8867d interfaceC8867d, Drawable drawable, int i9, int i10) {
        Bitmap bitmapM15475b;
        Drawable current = drawable.getCurrent();
        boolean z9 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM15475b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM15475b = null;
        } else {
            bitmapM15475b = m15475b(interfaceC8867d, current, i9, i10);
            z9 = true;
        }
        if (!z9) {
            interfaceC8867d = f16394a;
        }
        return C9395e.m15464c(bitmapM15475b, interfaceC8867d);
    }

    /* renamed from: b */
    public static Bitmap m15475b(InterfaceC8867d interfaceC8867d, Drawable drawable, int i9, int i10) {
        if (i9 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i9 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i10 = drawable.getIntrinsicHeight();
        }
        Lock lockM15499i = AbstractC9414x.m15499i();
        lockM15499i.lock();
        Bitmap bitmapMo13733d = interfaceC8867d.mo13733d(i9, i10, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo13733d);
            drawable.setBounds(0, 0, i9, i10);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo13733d;
        } finally {
            lockM15499i.unlock();
        }
    }

    /* renamed from: r0.o$a */
    public class a extends C8868e {
        @Override // p164l0.C8868e, p164l0.InterfaceC8867d
        /* renamed from: c */
        public void mo13732c(Bitmap bitmap) {
        }
    }
}
