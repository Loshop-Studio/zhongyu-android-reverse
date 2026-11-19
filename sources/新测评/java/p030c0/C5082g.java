package p030c0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.size.Scale;
import coil3.util.AbstractC5214d;
import kotlin.math.MathKt;
import p172n.C8590h;
import p300z.C9958e;

/* renamed from: c0.g */
/* loaded from: classes3.dex */
public final class C5082g {

    /* renamed from: a */
    public static final C5082g f2652a = new C5082g();

    /* renamed from: a */
    public final Bitmap m2679a(Drawable drawable, Bitmap.Config config, C9958e c9958e, Scale scale, boolean z9) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m2680b(bitmap, config) && m2681c(z9, bitmap, c9958e, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iM3230g = AbstractC5214d.m3230g(drawableMutate);
        if (iM3230g <= 0) {
            iM3230g = 512;
        }
        int iM3225b = AbstractC5214d.m3225b(drawableMutate);
        int i10 = iM3225b > 0 ? iM3225b : 512;
        long jM14135b = C8590h.m14135b(iM3230g, i10, c9958e, scale, C9958e.f17800d);
        double dM14137d = C8590h.m14137d(iM3230g, i10, AbstractC5090o.m2693c(jM14135b), AbstractC5090o.m2694d(jM14135b), scale);
        int iRoundToInt = MathKt.roundToInt(iM3230g * dM14137d);
        int iRoundToInt2 = MathKt.roundToInt(dM14137d * i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, AbstractC5075a.m2666e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iRoundToInt, iRoundToInt2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public final boolean m2680b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC5075a.m2666e(config);
    }

    /* renamed from: c */
    public final boolean m2681c(boolean z9, Bitmap bitmap, C9958e c9958e, Scale scale) {
        if (z9) {
            return true;
        }
        long jM14135b = C8590h.m14135b(bitmap.getWidth(), bitmap.getHeight(), c9958e, scale, C9958e.f17800d);
        return C8590h.m14137d(bitmap.getWidth(), bitmap.getHeight(), AbstractC5090o.m2693c(jM14135b), AbstractC5090o.m2694d(jM14135b), scale) == 1.0d;
    }
}
