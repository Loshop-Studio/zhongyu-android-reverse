package p228r0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import p091e1.AbstractC7838j;
import p122h0.InterfaceC8087g;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;

/* renamed from: r0.f */
/* loaded from: classes3.dex */
public abstract class AbstractC9396f implements InterfaceC8087g {
    @Override // p122h0.InterfaceC8087g
    /* renamed from: b */
    public final InterfaceC8259j mo12912b(Context context, InterfaceC8259j interfaceC8259j, int i9, int i10) {
        if (!AbstractC7838j.m12275r(i9, i10)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i9 + " or height: " + i10 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC8867d interfaceC8867dM3017f = ComponentCallbacks2C5471b.m3006c(context).m3017f();
        Bitmap bitmap = (Bitmap) interfaceC8259j.get();
        if (i9 == Integer.MIN_VALUE) {
            i9 = bitmap.getWidth();
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getHeight();
        }
        Bitmap bitmapMo15466c = mo15466c(interfaceC8867dM3017f, bitmap, i9, i10);
        return bitmap.equals(bitmapMo15466c) ? interfaceC8259j : C9395e.m15464c(bitmapMo15466c, interfaceC8867dM3017f);
    }

    /* renamed from: c */
    public abstract Bitmap mo15466c(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10);
}
