package p259u;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import p116h0.AbstractC8707k;
import p160l.InterfaceC9233g;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;

/* renamed from: u.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10143g implements InterfaceC9233g {
    @Override // p160l.InterfaceC9233g
    /* renamed from: a */
    public final InterfaceC9357j mo16944a(Context context, InterfaceC9357j interfaceC9357j, int i10, int i11) {
        if (!AbstractC8707k.m14203u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC9500d interfaceC9500dM2743f = ComponentCallbacks2C5391b.m2732c(context).m2743f();
        Bitmap bitmap = (Bitmap) interfaceC9357j.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapMo18969c = mo18969c(interfaceC9500dM2743f, bitmap, i10, i11);
        return bitmap.equals(bitmapMo18969c) ? interfaceC9357j : C10142f.m18997c(bitmapMo18969c, interfaceC9500dM2743f);
    }

    /* renamed from: c */
    public abstract Bitmap mo18969c(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11);
}
