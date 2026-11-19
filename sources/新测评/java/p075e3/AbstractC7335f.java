package p075e3;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.imageview.crop.CropOverlayView;
import com.xuexiang.xui.widget.imageview.crop.Handle;

/* renamed from: e3.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7335f {

    /* renamed from: e3.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11902a;

        static {
            int[] iArr = new int[Handle.values().length];
            f11902a = iArr;
            try {
                iArr[Handle.f6330b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11902a[Handle.f6331c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11902a[Handle.f6332d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11902a[Handle.f6333e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11902a[Handle.f6334f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11902a[Handle.f6335g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11902a[Handle.f6336h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11902a[Handle.f6337i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11902a[Handle.f6338j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m11727a() {
        return !CropOverlayView.m5665k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m11728b(Handle handle, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        if (handle == null) {
            return null;
        }
        float f17 = 0.0f;
        switch (a.f11902a[handle.ordinal()]) {
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
    public static Handle m11729c(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (m11732f(f10, f11, f12, f13, f16)) {
            return Handle.f6330b;
        }
        if (m11732f(f10, f11, f14, f13, f16)) {
            return Handle.f6331c;
        }
        if (m11732f(f10, f11, f12, f15, f16)) {
            return Handle.f6332d;
        }
        if (m11732f(f10, f11, f14, f15, f16)) {
            return Handle.f6333e;
        }
        if (m11731e(f10, f11, f12, f13, f14, f15) && m11727a()) {
            return Handle.f6338j;
        }
        if (m11733g(f10, f11, f12, f14, f13, f16)) {
            return Handle.f6335g;
        }
        if (m11733g(f10, f11, f12, f14, f15, f16)) {
            return Handle.f6337i;
        }
        if (m11734h(f10, f11, f12, f13, f15, f16)) {
            return Handle.f6334f;
        }
        if (m11734h(f10, f11, f14, f13, f15, f16)) {
            return Handle.f6336h;
        }
        if (!m11731e(f10, f11, f12, f13, f14, f15) || m11727a()) {
            return null;
        }
        return Handle.f6338j;
    }

    /* renamed from: d */
    public static float m11730d(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static boolean m11731e(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: f */
    public static boolean m11732f(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    /* renamed from: g */
    public static boolean m11733g(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: h */
    public static boolean m11734h(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }
}
