package p259u;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p182n.InterfaceC9357j;
import p193o.C9501e;
import p193o.InterfaceC9500d;

/* renamed from: u.s */
/* loaded from: classes3.dex */
public abstract class AbstractC10155s {

    /* renamed from: a */
    public static final InterfaceC9500d f20272a = new a();

    /* renamed from: a */
    public static InterfaceC9357j m19009a(InterfaceC9500d interfaceC9500d, Drawable drawable, int i10, int i11) {
        Bitmap bitmapM19010b;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM19010b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM19010b = null;
        } else {
            bitmapM19010b = m19010b(interfaceC9500d, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            interfaceC9500d = f20272a;
        }
        return C10142f.m18997c(bitmapM19010b, interfaceC9500d);
    }

    /* renamed from: b */
    public static Bitmap m19010b(InterfaceC9500d interfaceC9500d, Drawable drawable, int i10, int i11) {
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
        Lock lockM18980i = AbstractC10137c0.m18980i();
        lockM18980i.lock();
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo17621c);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo17621c;
        } finally {
            lockM18980i.unlock();
        }
    }

    /* renamed from: u.s$a */
    public class a extends C9501e {
        @Override // p193o.C9501e, p193o.InterfaceC9500d
        /* renamed from: b */
        public void mo17620b(Bitmap bitmap) {
        }
    }
}
