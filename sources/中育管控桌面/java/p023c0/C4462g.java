package p023c0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.size.Scale;
import coil3.util.AbstractC4595d;
import kotlin.math.MathKt;
import p110n.C7422h;
import p194z.C7923e;

/* renamed from: c0.g */
/* loaded from: classes3.dex */
public final class C4462g {

    /* renamed from: a */
    public static final C4462g f1332a = new C4462g();

    /* renamed from: a */
    public final Bitmap m1536a(Drawable drawable, Bitmap.Config config, C7923e c7923e, Scale scale, boolean z6) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m1537b(bitmap, config) && m1538c(z6, bitmap, c7923e, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iM2056g = AbstractC4595d.m2056g(drawableMutate);
        if (iM2056g <= 0) {
            iM2056g = 512;
        }
        int iM2051b = AbstractC4595d.m2051b(drawableMutate);
        int i6 = iM2051b > 0 ? iM2051b : 512;
        long jM8456b = C7422h.m8456b(iM2056g, i6, c7923e, scale, C7923e.f10643d);
        double dM8458d = C7422h.m8458d(iM2056g, i6, AbstractC4470o.m1551c(jM8456b), AbstractC4470o.m1552d(jM8456b), scale);
        int iRoundToInt = MathKt.roundToInt(iM2056g * dM8458d);
        int iRoundToInt2 = MathKt.roundToInt(dM8458d * i6);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, AbstractC4455a.m1523e(config));
        Rect bounds = drawableMutate.getBounds();
        int i7 = bounds.left;
        int i8 = bounds.top;
        int i9 = bounds.right;
        int i10 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iRoundToInt, iRoundToInt2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i7, i8, i9, i10);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public final boolean m1537b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC4455a.m1523e(config);
    }

    /* renamed from: c */
    public final boolean m1538c(boolean z6, Bitmap bitmap, C7923e c7923e, Scale scale) {
        if (z6) {
            return true;
        }
        long jM8456b = C7422h.m8456b(bitmap.getWidth(), bitmap.getHeight(), c7923e, scale, C7923e.f10643d);
        return C7422h.m8458d(bitmap.getWidth(), bitmap.getHeight(), AbstractC4470o.m1551c(jM8456b), AbstractC4470o.m1552d(jM8456b), scale) == 1.0d;
    }
}
