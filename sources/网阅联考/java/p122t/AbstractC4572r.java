package p122t;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p093m.InterfaceC4361j;
import p098n.C4396e;
import p098n.InterfaceC4395d;

/* renamed from: t.r */
/* loaded from: classes2.dex */
public abstract class AbstractC4572r {

    /* renamed from: a */
    public static final InterfaceC4395d f5744a = new a();

    /* renamed from: t.r$a */
    public class a extends C4396e {
        @Override // p098n.C4396e, p098n.InterfaceC4395d
        /* renamed from: c */
        public void mo5392c(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    public static InterfaceC4361j m6293a(InterfaceC4395d interfaceC4395d, Drawable drawable, int i4, int i5) {
        Bitmap bitmapM6294b;
        Drawable current = drawable.getCurrent();
        boolean z3 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM6294b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM6294b = null;
        } else {
            bitmapM6294b = m6294b(interfaceC4395d, current, i4, i5);
            z3 = true;
        }
        if (!z3) {
            interfaceC4395d = f5744a;
        }
        return C4559e.m6280d(bitmapM6294b, interfaceC4395d);
    }

    /* renamed from: b */
    public static Bitmap m6294b(InterfaceC4395d interfaceC4395d, Drawable drawable, int i4, int i5) {
        if (i4 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i5 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        Lock lockM6253i = AbstractC4552a0.m6253i();
        lockM6253i.lock();
        Bitmap bitmapMo5393d = interfaceC4395d.mo5393d(i4, i5, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo5393d);
            drawable.setBounds(0, 0, i4, i5);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo5393d;
        } finally {
            lockM6253i.unlock();
        }
    }
}
