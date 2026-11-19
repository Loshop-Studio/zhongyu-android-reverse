package p262n8;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.imageview.crop.CropOverlayView;
import com.xuexiang.xui.widget.imageview.crop.Handle;

/* renamed from: n8.f */
/* loaded from: classes5.dex */
public abstract class AbstractC10332f {

    /* renamed from: n8.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24617a;

        static {
            int[] iArr = new int[Handle.values().length];
            f24617a = iArr;
            try {
                iArr[Handle.f16118d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24617a[Handle.f16119e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24617a[Handle.f16120f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24617a[Handle.f16121g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24617a[Handle.f16122h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24617a[Handle.f16123i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24617a[Handle.f16124j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24617a[Handle.f16125k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24617a[Handle.f16126l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m21575a() {
        return !CropOverlayView.m12708m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m21576b(Handle handle, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        if (handle == null) {
            return null;
        }
        float f17 = 0.0f;
        switch (a.f24617a[handle.ordinal()]) {
            case 1:
                f17 = f12 - f10;
                f16 = f13 - f11;
                break;
            case 2:
                f17 = f14 - f10;
                f16 = f13 - f11;
                break;
            case 3:
                f17 = f12 - f10;
                f16 = f15 - f11;
                break;
            case 4:
                f17 = f14 - f10;
                f16 = f15 - f11;
                break;
            case 5:
                f16 = 0.0f;
                f17 = f12 - f10;
                break;
            case 6:
                f16 = f13 - f11;
                break;
            case 7:
                f16 = 0.0f;
                f17 = f14 - f10;
                break;
            case 8:
                f16 = f15 - f11;
                break;
            case 9:
                f14 = (f14 + f12) / 2.0f;
                f13 = (f13 + f15) / 2.0f;
                f17 = f14 - f10;
                f16 = f13 - f11;
                break;
            default:
                f16 = 0.0f;
                break;
        }
        return new Pair(Float.valueOf(f17), Float.valueOf(f16));
    }

    /* renamed from: c */
    public static Handle m21577c(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (m21580f(f10, f11, f12, f13, f16)) {
            return Handle.f16118d;
        }
        if (m21580f(f10, f11, f14, f13, f16)) {
            return Handle.f16119e;
        }
        if (m21580f(f10, f11, f12, f15, f16)) {
            return Handle.f16120f;
        }
        if (m21580f(f10, f11, f14, f15, f16)) {
            return Handle.f16121g;
        }
        if (m21579e(f10, f11, f12, f13, f14, f15) && m21575a()) {
            return Handle.f16126l;
        }
        if (m21581g(f10, f11, f12, f14, f13, f16)) {
            return Handle.f16123i;
        }
        if (m21581g(f10, f11, f12, f14, f15, f16)) {
            return Handle.f16125k;
        }
        if (m21582h(f10, f11, f12, f13, f15, f16)) {
            return Handle.f16122h;
        }
        if (m21582h(f10, f11, f14, f13, f15, f16)) {
            return Handle.f16124j;
        }
        if (!m21579e(f10, f11, f12, f13, f14, f15) || m21575a()) {
            return null;
        }
        return Handle.f16126l;
    }

    /* renamed from: d */
    public static float m21578d(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static boolean m21579e(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: f */
    public static boolean m21580f(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    /* renamed from: g */
    public static boolean m21581g(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: h */
    public static boolean m21582h(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }
}
