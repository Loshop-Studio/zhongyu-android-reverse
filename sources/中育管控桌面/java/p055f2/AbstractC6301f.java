package p055f2;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.imageview.crop.CropOverlayView;
import com.xuexiang.xui.widget.imageview.crop.Handle;

/* renamed from: f2.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6301f {

    /* renamed from: f2.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7676a;

        static {
            int[] iArr = new int[Handle.values().length];
            f7676a = iArr;
            try {
                iArr[Handle.f5055b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7676a[Handle.f5056c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7676a[Handle.f5057d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7676a[Handle.f5058e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7676a[Handle.f5059f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7676a[Handle.f5060g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7676a[Handle.f5061h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7676a[Handle.f5062i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7676a[Handle.f5063j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m6459a() {
        return !CropOverlayView.m4684k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m6460b(Handle handle, float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12;
        if (handle == null) {
            return null;
        }
        float f13 = 0.0f;
        switch (a.f7676a[handle.ordinal()]) {
            case 1:
                f13 = f8 - f6;
                f12 = f9 - f7;
                break;
            case 2:
                f13 = f10 - f6;
                f12 = f9 - f7;
                break;
            case 3:
                f13 = f8 - f6;
                f12 = f11 - f7;
                break;
            case 4:
                f13 = f10 - f6;
                f12 = f11 - f7;
                break;
            case 5:
                f12 = 0.0f;
                f13 = f8 - f6;
                break;
            case 6:
                f12 = f9 - f7;
                break;
            case 7:
                f12 = 0.0f;
                f13 = f10 - f6;
                break;
            case 8:
                f12 = f11 - f7;
                break;
            case 9:
                f10 = (f10 + f8) / 2.0f;
                f9 = (f9 + f11) / 2.0f;
                f13 = f10 - f6;
                f12 = f9 - f7;
                break;
            default:
                f12 = 0.0f;
                break;
        }
        return new Pair(Float.valueOf(f13), Float.valueOf(f12));
    }

    /* renamed from: c */
    public static Handle m6461c(float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        if (m6464f(f6, f7, f8, f9, f12)) {
            return Handle.f5055b;
        }
        if (m6464f(f6, f7, f10, f9, f12)) {
            return Handle.f5056c;
        }
        if (m6464f(f6, f7, f8, f11, f12)) {
            return Handle.f5057d;
        }
        if (m6464f(f6, f7, f10, f11, f12)) {
            return Handle.f5058e;
        }
        if (m6463e(f6, f7, f8, f9, f10, f11) && m6459a()) {
            return Handle.f5063j;
        }
        if (m6465g(f6, f7, f8, f10, f9, f12)) {
            return Handle.f5060g;
        }
        if (m6465g(f6, f7, f8, f10, f11, f12)) {
            return Handle.f5062i;
        }
        if (m6466h(f6, f7, f8, f9, f11, f12)) {
            return Handle.f5059f;
        }
        if (m6466h(f6, f7, f10, f9, f11, f12)) {
            return Handle.f5061h;
        }
        if (!m6463e(f6, f7, f8, f9, f10, f11) || m6459a()) {
            return null;
        }
        return Handle.f5063j;
    }

    /* renamed from: d */
    public static float m6462d(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    public static boolean m6463e(float f6, float f7, float f8, float f9, float f10, float f11) {
        return f6 > f8 && f6 < f10 && f7 > f9 && f7 < f11;
    }

    /* renamed from: f */
    public static boolean m6464f(float f6, float f7, float f8, float f9, float f10) {
        return Math.abs(f6 - f8) <= f10 && Math.abs(f7 - f9) <= f10;
    }

    /* renamed from: g */
    public static boolean m6465g(float f6, float f7, float f8, float f9, float f10, float f11) {
        return f6 > f8 && f6 < f9 && Math.abs(f7 - f10) <= f11;
    }

    /* renamed from: h */
    public static boolean m6466h(float f6, float f7, float f8, float f9, float f10, float f11) {
        return Math.abs(f6 - f8) <= f11 && f7 > f9 && f7 < f10;
    }
}
