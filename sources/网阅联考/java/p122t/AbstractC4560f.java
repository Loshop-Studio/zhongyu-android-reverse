package p122t;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import p062g0.AbstractC3750j;
import p076j.InterfaceC3797g;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;

/* renamed from: t.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4560f implements InterfaceC3797g {
    @Override // p076j.InterfaceC3797g
    /* renamed from: a */
    public final InterfaceC4361j mo4955a(Context context, InterfaceC4361j interfaceC4361j, int i4, int i5) {
        if (!AbstractC3750j.m4787r(i4, i5)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i4 + " or height: " + i5 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC4395d interfaceC4395dM1691f = ComponentCallbacks2C2858c.m1680c(context).m1691f();
        Bitmap bitmap = (Bitmap) interfaceC4361j.get();
        if (i4 == Integer.MIN_VALUE) {
            i4 = bitmap.getWidth();
        }
        if (i5 == Integer.MIN_VALUE) {
            i5 = bitmap.getHeight();
        }
        Bitmap bitmapMo6282c = mo6282c(interfaceC4395dM1691f, bitmap, i4, i5);
        return bitmap.equals(bitmapMo6282c) ? interfaceC4361j : C4559e.m6280d(bitmapMo6282c, interfaceC4395dM1691f);
    }

    /* renamed from: c */
    public abstract Bitmap mo6282c(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4, int i5);
}
