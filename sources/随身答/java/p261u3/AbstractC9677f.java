package p261u3;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.imageview.crop.CropOverlayView;
import com.xuexiang.xui.widget.imageview.crop.Handle;

/* renamed from: u3.f */
/* loaded from: classes4.dex */
public abstract class AbstractC9677f {

    /* renamed from: u3.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17112a;

        static {
            int[] iArr = new int[Handle.values().length];
            f17112a = iArr;
            try {
                iArr[Handle.f7588b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17112a[Handle.f7589c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17112a[Handle.f7590d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17112a[Handle.f7591e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17112a[Handle.f7592f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17112a[Handle.f7593g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17112a[Handle.f7594h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17112a[Handle.f7595i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17112a[Handle.f7596j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m16144a() {
        return !CropOverlayView.m6771k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m16145b(Handle handle, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        if (handle == null) {
            return null;
        }
        float f17 = 0.0f;
        switch (a.f17112a[handle.ordinal()]) {
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
    public static Handle m16146c(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (m16149f(f10, f11, f12, f13, f16)) {
            return Handle.f7588b;
        }
        if (m16149f(f10, f11, f14, f13, f16)) {
            return Handle.f7589c;
        }
        if (m16149f(f10, f11, f12, f15, f16)) {
            return Handle.f7590d;
        }
        if (m16149f(f10, f11, f14, f15, f16)) {
            return Handle.f7591e;
        }
        if (m16148e(f10, f11, f12, f13, f14, f15) && m16144a()) {
            return Handle.f7596j;
        }
        if (m16150g(f10, f11, f12, f14, f13, f16)) {
            return Handle.f7593g;
        }
        if (m16150g(f10, f11, f12, f14, f15, f16)) {
            return Handle.f7595i;
        }
        if (m16151h(f10, f11, f12, f13, f15, f16)) {
            return Handle.f7592f;
        }
        if (m16151h(f10, f11, f14, f13, f15, f16)) {
            return Handle.f7594h;
        }
        if (!m16148e(f10, f11, f12, f13, f14, f15) || m16144a()) {
            return null;
        }
        return Handle.f7596j;
    }

    /* renamed from: d */
    public static float m16147d(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static boolean m16148e(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f14 && f11 > f13 && f11 < f15;
    }

    /* renamed from: f */
    public static boolean m16149f(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    /* renamed from: g */
    public static boolean m16150g(float f10, float f11, float f12, float f13, float f14, float f15) {
        return f10 > f12 && f10 < f13 && Math.abs(f11 - f14) <= f15;
    }

    /* renamed from: h */
    public static boolean m16151h(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(f10 - f12) <= f15 && f11 > f13 && f11 < f14;
    }
}
