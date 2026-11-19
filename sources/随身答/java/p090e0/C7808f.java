package p090e0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.size.Scale;
import coil3.util.AbstractC5349d;
import kotlin.math.MathKt;
import p183n.C9060h;
import p307z.C9975e;

/* renamed from: e0.f */
/* loaded from: classes3.dex */
public final class C7808f {

    /* renamed from: a */
    public static final C7808f f13124a = new C7808f();

    /* renamed from: a */
    public final Bitmap m12187a(Drawable drawable, Bitmap.Config config, C9975e c9975e, Scale scale, boolean z9) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m12188b(bitmap, config) && m12189c(z9, bitmap, c9975e, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iM2947g = AbstractC5349d.m2947g(drawableMutate);
        if (iM2947g <= 0) {
            iM2947g = 512;
        }
        int iM2942b = AbstractC5349d.m2942b(drawableMutate);
        int i9 = iM2942b > 0 ? iM2942b : 512;
        long jM14525b = C9060h.m14525b(iM2947g, i9, c9975e, scale, C9975e.f17944d);
        double dM14527d = C9060h.m14527d(iM2947g, i9, AbstractC7816n.m12201c(jM14525b), AbstractC7816n.m12202d(jM14525b), scale);
        int iRoundToInt = MathKt.roundToInt(iM2947g * dM14527d);
        int iRoundToInt2 = MathKt.roundToInt(dM14527d * i9);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, AbstractC7803a.m12174e(config));
        Rect bounds = drawableMutate.getBounds();
        int i10 = bounds.left;
        int i11 = bounds.top;
        int i12 = bounds.right;
        int i13 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iRoundToInt, iRoundToInt2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i10, i11, i12, i13);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public final boolean m12188b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC7803a.m12174e(config);
    }

    /* renamed from: c */
    public final boolean m12189c(boolean z9, Bitmap bitmap, C9975e c9975e, Scale scale) {
        if (z9) {
            return true;
        }
        long jM14525b = C9060h.m14525b(bitmap.getWidth(), bitmap.getHeight(), c9975e, scale, C9975e.f17944d);
        return C9060h.m14527d(bitmap.getWidth(), bitmap.getHeight(), AbstractC7816n.m12201c(jM14525b), AbstractC7816n.m12202d(jM14525b), scale) == 1.0d;
    }
}
