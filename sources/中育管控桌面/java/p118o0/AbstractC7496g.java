package p118o0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import p016b1.AbstractC4409k;
import p053f0.InterfaceC6288g;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;

/* renamed from: o0.g */
/* loaded from: classes3.dex */
public abstract class AbstractC7496g implements InterfaceC6288g {
    @Override // p053f0.InterfaceC6288g
    /* renamed from: a */
    public final InterfaceC6440j mo6424a(Context context, InterfaceC6440j interfaceC6440j, int i6, int i7) {
        if (!AbstractC4409k.m1459t(i6, i7)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i6 + " or height: " + i7 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC6499d interfaceC6499dM2481f = ComponentCallbacks2C4678c.m2470c(context).m2481f();
        Bitmap bitmap = (Bitmap) interfaceC6440j.get();
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getWidth();
        }
        if (i7 == Integer.MIN_VALUE) {
            i7 = bitmap.getHeight();
        }
        Bitmap bitmapMo8621c = mo8621c(interfaceC6499dM2481f, bitmap, i6, i7);
        return bitmap.equals(bitmapMo8621c) ? interfaceC6440j : C7495f.m8619c(bitmapMo8621c, interfaceC6499dM2481f);
    }

    /* renamed from: c */
    public abstract Bitmap mo8621c(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6, int i7);
}
