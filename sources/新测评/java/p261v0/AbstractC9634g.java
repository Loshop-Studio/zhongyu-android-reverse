package p261v0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import p117i1.AbstractC7652k;
import p162m0.InterfaceC8542g;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;

/* renamed from: v0.g */
/* loaded from: classes3.dex */
public abstract class AbstractC9634g implements InterfaceC8542g {
    @Override // p162m0.InterfaceC8542g
    /* renamed from: b */
    public final InterfaceC8690j mo14061b(Context context, InterfaceC8690j interfaceC8690j, int i10, int i11) {
        if (!AbstractC7652k.m12704t(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC8804d interfaceC8804dM3302f = ComponentCallbacks2C5342b.m3291c(context).m3302f();
        Bitmap bitmap = (Bitmap) interfaceC8690j.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapMo16004c = mo16004c(interfaceC8804dM3302f, bitmap, i10, i11);
        return bitmap.equals(bitmapMo16004c) ? interfaceC8690j : C9633f.m16002c(bitmapMo16004c, interfaceC8804dM3302f);
    }

    /* renamed from: c */
    public abstract Bitmap mo16004c(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10, int i11);
}
