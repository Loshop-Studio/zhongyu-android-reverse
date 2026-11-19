package p262n8;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/* renamed from: n8.h */
/* loaded from: classes5.dex */
public abstract class AbstractC10334h {
    /* renamed from: a */
    public static Rect m21583a(int i10, int i11, int i12, int i13) {
        return m21585c(i10, i11, i12, i13);
    }

    /* renamed from: b */
    public static Rect m21584b(Bitmap bitmap, View view) {
        return m21585c(bitmap.getWidth(), bitmap.getHeight(), view.getWidth(), view.getHeight());
    }

    /* renamed from: c */
    public static Rect m21585c(int i10, int i11, int i12, int i13) {
        double d10;
        double d11;
        long jRound;
        int i14;
        double d12 = i12 < i10 ? i12 / i10 : Double.POSITIVE_INFINITY;
        double d13 = i13 < i11 ? i13 / i11 : Double.POSITIVE_INFINITY;
        if (d12 == Double.POSITIVE_INFINITY && d13 == Double.POSITIVE_INFINITY) {
            d10 = i11;
            d11 = i10;
        } else if (d12 <= d13) {
            double d14 = i12;
            d10 = (i11 * d14) / i10;
            d11 = d14;
        } else {
            d10 = i13;
            d11 = (i10 * d10) / i11;
        }
        double d15 = i12;
        int iRound = 0;
        if (d11 == d15) {
            jRound = Math.round((i13 - d10) / 2.0d);
        } else {
            double d16 = i13;
            if (d10 == d16) {
                iRound = (int) Math.round((d15 - d11) / 2.0d);
                i14 = 0;
                return new Rect(iRound, i14, ((int) Math.ceil(d11)) + iRound, ((int) Math.ceil(d10)) + i14);
            }
            iRound = (int) Math.round((d15 - d11) / 2.0d);
            jRound = Math.round((d16 - d10) / 2.0d);
        }
        i14 = (int) jRound;
        return new Rect(iRound, i14, ((int) Math.ceil(d11)) + iRound, ((int) Math.ceil(d10)) + i14);
    }
}
