package p071d2;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.imageview.crop.CropOverlayView;
import com.xuexiang.xui.widget.imageview.crop.Handle;

/* renamed from: d2.f */
/* loaded from: classes4.dex */
public abstract class AbstractC8283f {

    /* renamed from: d2.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15688a;

        static {
            int[] iArr = new int[Handle.values().length];
            f15688a = iArr;
            try {
                iArr[Handle.f7747b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15688a[Handle.f7748c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15688a[Handle.f7749d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15688a[Handle.f7750e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15688a[Handle.f7751f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15688a[Handle.f7752g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15688a[Handle.f7753h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15688a[Handle.f7754i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15688a[Handle.f7755j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m13443a() {
        return !CropOverlayView.m6857m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m13444b(Handle handle, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        if (handle == null) {
            return null;
        }
        float f17 = 0.0f;
        switch (a.f15688a[handle.ordinal()]) {
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
    public static Handle m13445c(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (m13448f(f10, f11, f12, f13, f16)) {
            return Handle.f7747b;
        }
        if (m13448f(f10, f11, f14, f13, f16)) {
            return Handle.f7748c;
        }
        if (m13448f(f10, f11, f12, f15, f16)) {
            return Handle.f7749d;
        }
        if (m13448f(f10, f11, f14, f15, f16)) {
            return Handle.f7750e;
        }
        if (m13447e(f10, f11, f12, f13, f14, f15) && m13443a()) {
            return Handle.f7755j;
        }
        if (m13449g(f10, f11, f12, f14, f13, f16)) {
            return Handle.f7752g;
        }
        if (m13449g(f10, f11, f12, f14, f15, f16)) {
            return Handle.f7754i;
        }
        if (m13450h(f10, f11, f12, f13, f15, f16)) {
            return Handle.f7751f;
        }
        if (m13450h(f10, f11, f14, f13, f15, f16)) {
            return Handle.f7753h;
        }
        if (!m13447e(f10, f11, f12, f13, f14, f15) || m13443a()) {
            return null;
        }
        return Handle.f7755j;
    }

    /* renamed from: d */
    public static float m13446d(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static boolean m13447e(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: f */
    public static boolean m13448f(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    /* renamed from: g */
    public static boolean m13449g(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: h */
    public static boolean m13450h(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }
}
