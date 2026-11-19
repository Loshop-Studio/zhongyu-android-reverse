package p229l0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import org.android.agoo.common.AgooConstants;

/* renamed from: l0.i */
/* loaded from: classes3.dex */
public final class C10102i {

    /* renamed from: a */
    public final int f24130a;

    /* renamed from: b */
    public final int f24131b;

    /* renamed from: c */
    public final Context f24132c;

    /* renamed from: d */
    public final int f24133d;

    /* renamed from: l0.i$a */
    public static final class a {

        /* renamed from: i */
        public static final int f24134i;

        /* renamed from: a */
        public final Context f24135a;

        /* renamed from: b */
        public ActivityManager f24136b;

        /* renamed from: c */
        public c f24137c;

        /* renamed from: e */
        public float f24139e;

        /* renamed from: d */
        public float f24138d = 2.0f;

        /* renamed from: f */
        public float f24140f = 0.4f;

        /* renamed from: g */
        public float f24141g = 0.33f;

        /* renamed from: h */
        public int f24142h = 4194304;

        static {
            f24134i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f24139e = f24134i;
            this.f24135a = context;
            this.f24136b = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
            this.f24137c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C10102i.m21123e(this.f24136b)) {
                return;
            }
            this.f24139e = 0.0f;
        }

        /* renamed from: a */
        public C10102i m21128a() {
            return new C10102i(this);
        }
    }

    /* renamed from: l0.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final DisplayMetrics f24143a;

        public b(DisplayMetrics displayMetrics) {
            this.f24143a = displayMetrics;
        }

        @Override // p229l0.C10102i.c
        /* renamed from: a */
        public int mo21129a() {
            return this.f24143a.heightPixels;
        }

        @Override // p229l0.C10102i.c
        /* renamed from: b */
        public int mo21130b() {
            return this.f24143a.widthPixels;
        }
    }

    /* renamed from: l0.i$c */
    public interface c {
        /* renamed from: a */
        int mo21129a();

        /* renamed from: b */
        int mo21130b();
    }

    public C10102i(a aVar) {
        this.f24132c = aVar.f24135a;
        int i10 = m21123e(aVar.f24136b) ? aVar.f24142h / 2 : aVar.f24142h;
        this.f24133d = i10;
        int iM21122c = m21122c(aVar.f24136b, aVar.f24140f, aVar.f24141g);
        float fMo21130b = aVar.f24137c.mo21130b() * aVar.f24137c.mo21129a() * 4;
        int iRound = Math.round(aVar.f24139e * fMo21130b);
        int iRound2 = Math.round(fMo21130b * aVar.f24138d);
        int i11 = iM21122c - i10;
        if (iRound2 + iRound <= i11) {
            this.f24131b = iRound2;
            this.f24130a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f24139e;
            float f12 = aVar.f24138d;
            float f13 = f10 / (f11 + f12);
            this.f24131b = Math.round(f12 * f13);
            this.f24130a = Math.round(f13 * aVar.f24139e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m21127f(this.f24131b);
            m21127f(this.f24130a);
            m21127f(i10);
            m21127f(iM21122c);
            aVar.f24136b.getMemoryClass();
            m21123e(aVar.f24136b);
        }
    }

    /* renamed from: c */
    public static int m21122c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m21123e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    /* renamed from: e */
    public static boolean m21123e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m21124a() {
        return this.f24133d;
    }

    /* renamed from: b */
    public int m21125b() {
        return this.f24130a;
    }

    /* renamed from: d */
    public int m21126d() {
        return this.f24131b;
    }

    /* renamed from: f */
    public final String m21127f(int i10) {
        return Formatter.formatFileSize(this.f24132c, i10);
    }
}
