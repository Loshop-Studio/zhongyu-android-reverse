package p131v0;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.imageview.crop.CropOverlayView;
import com.xuexiang.xui.widget.imageview.crop.Handle;

/* renamed from: v0.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4623f {

    /* renamed from: v0.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5832a;

        static {
            int[] iArr = new int[Handle.values().length];
            f5832a = iArr;
            try {
                iArr[Handle.f3534b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5832a[Handle.f3535c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5832a[Handle.f3536d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5832a[Handle.f3537e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5832a[Handle.f3538f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5832a[Handle.f3539g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5832a[Handle.f3540h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5832a[Handle.f3541i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5832a[Handle.f3542j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m6401a() {
        return !CropOverlayView.m4307k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m6402b(Handle handle, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        if (handle == null) {
            return null;
        }
        float f11 = 0.0f;
        switch (a.f5832a[handle.ordinal()]) {
            case 1:
                f11 = f6 - f4;
                f10 = f7 - f5;
                break;
            case 2:
                f11 = f8 - f4;
                f10 = f7 - f5;
                break;
            case 3:
                f11 = f6 - f4;
                f10 = f9 - f5;
                break;
            case 4:
                f11 = f8 - f4;
                f10 = f9 - f5;
                break;
            case 5:
                f10 = 0.0f;
                f11 = f6 - f4;
                break;
            case 6:
                f10 = f7 - f5;
                break;
            case 7:
                f10 = 0.0f;
                f11 = f8 - f4;
                break;
            case 8:
                f10 = f9 - f5;
                break;
            case 9:
                f8 = (f8 + f6) / 2.0f;
                f7 = (f7 + f9) / 2.0f;
                f11 = f8 - f4;
                f10 = f7 - f5;
                break;
            default:
                f10 = 0.0f;
                break;
        }
        return new Pair(Float.valueOf(f11), Float.valueOf(f10));
    }

    /* renamed from: c */
    public static Handle m6403c(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        if (m6406f(f4, f5, f6, f7, f10)) {
            return Handle.f3534b;
        }
        if (m6406f(f4, f5, f8, f7, f10)) {
            return Handle.f3535c;
        }
        if (m6406f(f4, f5, f6, f9, f10)) {
            return Handle.f3536d;
        }
        if (m6406f(f4, f5, f8, f9, f10)) {
            return Handle.f3537e;
        }
        if (m6405e(f4, f5, f6, f7, f8, f9) && m6401a()) {
            return Handle.f3542j;
        }
        if (m6407g(f4, f5, f6, f8, f7, f10)) {
            return Handle.f3539g;
        }
        if (m6407g(f4, f5, f6, f8, f9, f10)) {
            return Handle.f3541i;
        }
        if (m6408h(f4, f5, f6, f7, f9, f10)) {
            return Handle.f3538f;
        }
        if (m6408h(f4, f5, f8, f7, f9, f10)) {
            return Handle.f3540h;
        }
        if (!m6405e(f4, f5, f6, f7, f8, f9) || m6401a()) {
            return null;
        }
        return Handle.f3542j;
    }

    /* renamed from: d */
    public static float m6404d(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static boolean m6405e(float f4, float f5, float f6, float f7, float f8, float f9) {
        return f4 > f6 && f4 < f8 && f5 > f7 && f5 < f9;
    }

    /* renamed from: f */
    public static boolean m6406f(float f4, float f5, float f6, float f7, float f8) {
        return Math.abs(f4 - f6) <= f8 && Math.abs(f5 - f7) <= f8;
    }

    /* renamed from: g */
    public static boolean m6407g(float f4, float f5, float f6, float f7, float f8, float f9) {
        return f4 > f6 && f4 < f7 && Math.abs(f5 - f8) <= f9;
    }

    /* renamed from: h */
    public static boolean m6408h(float f4, float f5, float f6, float f7, float f8, float f9) {
        return Math.abs(f4 - f6) <= f9 && f5 > f7 && f5 < f8;
    }
}
