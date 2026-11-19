package p077i0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import p016b0.InterfaceC3072g0;
import p024c0.InterfaceC3205b;
import p180v0.AbstractC6664k;
import p202y.InterfaceC6766i;

/* renamed from: i0.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5648d implements InterfaceC6766i {
    @Override // p202y.InterfaceC6766i
    /* renamed from: a */
    public final InterfaceC3072g0 mo4937a(Context context, InterfaceC3072g0 interfaceC3072g0, int i, int i8) {
        if (!AbstractC6664k.m6327g(i, i8)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i8 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC3205b interfaceC3205b = ComponentCallbacks2C3408b.m2360c(context).f2199b;
        Bitmap bitmap = (Bitmap) interfaceC3072g0.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = bitmap.getHeight();
        }
        Bitmap bitmapMo4973c = mo4973c(interfaceC3205b, bitmap, i, i8);
        return bitmap.equals(bitmapMo4973c) ? interfaceC3072g0 : C5647c.m4972b(bitmapMo4973c, interfaceC3205b);
    }

    /* renamed from: c */
    public abstract Bitmap mo4973c(InterfaceC3205b interfaceC3205b, Bitmap bitmap, int i, int i8);
}
