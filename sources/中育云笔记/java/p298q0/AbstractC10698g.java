package p298q0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import p109d1.AbstractC8910k;
import p168h0.InterfaceC9441h;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;

/* renamed from: q0.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10698g implements InterfaceC9441h {
    @Override // p168h0.InterfaceC9441h
    /* renamed from: a */
    public final InterfaceC9657j mo18617a(Context context, InterfaceC9657j interfaceC9657j, int i10, int i11) {
        if (!AbstractC8910k.m17490u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC9772d interfaceC9772dM3952f = ComponentCallbacks2C5810b.m3940c(context).m3952f();
        Bitmap bitmap = (Bitmap) interfaceC9657j.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapMo22661c = mo22661c(interfaceC9772dM3952f, bitmap, i10, i11);
        return bitmap.equals(bitmapMo22661c) ? interfaceC9657j : C10697f.m22659c(bitmapMo22661c, interfaceC9772dM3952f);
    }

    /* renamed from: c */
    public abstract Bitmap mo22661c(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11);
}
