package p118o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p067h0.InterfaceC6440j;
import p074i0.C6500e;
import p074i0.InterfaceC6499d;

/* renamed from: o0.p */
/* loaded from: classes3.dex */
public abstract class AbstractC7505p {

    /* renamed from: a */
    public static final InterfaceC6499d f9684a = new a();

    /* renamed from: a */
    public static InterfaceC6440j m8629a(InterfaceC6499d interfaceC6499d, Drawable drawable, int i6, int i7) {
        Bitmap bitmapM8630b;
        Drawable current = drawable.getCurrent();
        boolean z6 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM8630b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM8630b = null;
        } else {
            bitmapM8630b = m8630b(interfaceC6499d, current, i6, i7);
            z6 = true;
        }
        if (!z6) {
            interfaceC6499d = f9684a;
        }
        return C7495f.m8619c(bitmapM8630b, interfaceC6499d);
    }

    /* renamed from: b */
    public static Bitmap m8630b(InterfaceC6499d interfaceC6499d, Drawable drawable, int i6, int i7) {
        if (i6 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i7 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i6 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i7 = drawable.getIntrinsicHeight();
        }
        Lock lockM8658i = AbstractC7514y.m8658i();
        lockM8658i.lock();
        Bitmap bitmapMo7198d = interfaceC6499d.mo7198d(i6, i7, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo7198d);
            drawable.setBounds(0, 0, i6, i7);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo7198d;
        } finally {
            lockM8658i.unlock();
        }
    }

    /* renamed from: o0.p$a */
    public class a extends C6500e {
        @Override // p074i0.C6500e, p074i0.InterfaceC6499d
        /* renamed from: c */
        public void mo7197c(Bitmap bitmap) {
        }
    }
}
