package p180v0;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: v0.k */
/* loaded from: classes2.dex */
public abstract class AbstractC6664k {

    /* renamed from: a */
    public static final char[] f11243a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f11244b = new char[64];

    /* renamed from: a */
    public static boolean m6321a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m6322b(int i, int i8, Bitmap.Config config) {
        int i9 = i * i8;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = AbstractC6663j.f11242a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                i11 = 4;
                if (i10 == 4) {
                    i11 = 8;
                }
            }
        }
        return i9 * i11;
    }

    /* renamed from: c */
    public static int m6323c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: d */
    public static ArrayList m6324d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static int m6325e(int i, int i8) {
        return (i8 * 31) + i;
    }

    /* renamed from: f */
    public static int m6326f(int i, Object obj) {
        return m6325e(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: g */
    public static boolean m6327g(int i, int i8) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i8 > 0 || i8 == Integer.MIN_VALUE;
        }
        return false;
    }
}
