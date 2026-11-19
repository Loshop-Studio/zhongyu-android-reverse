package p001a0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.size.Scale;
import coil3.util.AbstractC5491d;
import p211jd.AbstractC9719c;
import p228l.C10072h;
import p396x.C11749e;

/* renamed from: a0.g */
/* loaded from: classes3.dex */
public final class C0010g {

    /* renamed from: a */
    public static final C0010g f2a = new C0010g();

    /* renamed from: a */
    public final Bitmap m20a(Drawable drawable, Bitmap.Config config, C11749e c11749e, Scale scale, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m21b(bitmap, config) && m22c(z10, bitmap, c11749e, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iM3324g = AbstractC5491d.m3324g(drawableMutate);
        if (iM3324g <= 0) {
            iM3324g = 512;
        }
        int iM3319b = AbstractC5491d.m3319b(drawableMutate);
        int i10 = iM3319b > 0 ? iM3319b : 512;
        long jM21068b = C10072h.m21068b(iM3324g, i10, c11749e, scale, C11749e.f27923d);
        double dM21070d = C10072h.m21070d(iM3324g, i10, AbstractC0018o.m34c(jM21068b), AbstractC0018o.m35d(jM21068b), scale);
        int iM19281c = AbstractC9719c.m19281c(iM3324g * dM21070d);
        int iM19281c2 = AbstractC9719c.m19281c(dM21070d * i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM19281c, iM19281c2, AbstractC0003a.m7e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM19281c, iM19281c2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public final boolean m21b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC0003a.m7e(config);
    }

    /* renamed from: c */
    public final boolean m22c(boolean z10, Bitmap bitmap, C11749e c11749e, Scale scale) {
        if (z10) {
            return true;
        }
        long jM21068b = C10072h.m21068b(bitmap.getWidth(), bitmap.getHeight(), c11749e, scale, C11749e.f27923d);
        return C10072h.m21070d(bitmap.getWidth(), bitmap.getHeight(), AbstractC0018o.m34c(jM21068b), AbstractC0018o.m35d(jM21068b), scale) == 1.0d;
    }
}
