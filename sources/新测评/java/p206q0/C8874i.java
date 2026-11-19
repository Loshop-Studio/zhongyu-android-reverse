package p206q0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: q0.i */
/* loaded from: classes3.dex */
public final class C8874i {

    /* renamed from: a */
    public final int f15086a;

    /* renamed from: b */
    public final int f15087b;

    /* renamed from: c */
    public final Context f15088c;

    /* renamed from: d */
    public final int f15089d;

    /* renamed from: q0.i$a */
    public static final class a {

        /* renamed from: i */
        public static final int f15090i;

        /* renamed from: a */
        public final Context f15091a;

        /* renamed from: b */
        public ActivityManager f15092b;

        /* renamed from: c */
        public c f15093c;

        /* renamed from: e */
        public float f15095e;

        /* renamed from: d */
        public float f15094d = 2.0f;

        /* renamed from: f */
        public float f15096f = 0.4f;

        /* renamed from: g */
        public float f15097g = 0.33f;

        /* renamed from: h */
        public int f15098h = 4194304;

        static {
            f15090i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f15095e = f15090i;
            this.f15091a = context;
            this.f15092b = (ActivityManager) context.getSystemService("activity");
            this.f15093c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C8874i.m14885e(this.f15092b)) {
                return;
            }
            this.f15095e = 0.0f;
        }

        /* renamed from: a */
        public C8874i m14890a() {
            return new C8874i(this);
        }
    }

    /* renamed from: q0.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final DisplayMetrics f15099a;

        public b(DisplayMetrics displayMetrics) {
            this.f15099a = displayMetrics;
        }

        @Override // p206q0.C8874i.c
        /* renamed from: a */
        public int mo14891a() {
            return this.f15099a.heightPixels;
        }

        @Override // p206q0.C8874i.c
        /* renamed from: b */
        public int mo14892b() {
            return this.f15099a.widthPixels;
        }
    }

    /* renamed from: q0.i$c */
    public interface c {
        /* renamed from: a */
        int mo14891a();

        /* renamed from: b */
        int mo14892b();
    }

    public C8874i(a aVar) {
        this.f15088c = aVar.f15091a;
        int i10 = m14885e(aVar.f15092b) ? aVar.f15098h / 2 : aVar.f15098h;
        this.f15089d = i10;
        int iM14884c = m14884c(aVar.f15092b, aVar.f15096f, aVar.f15097g);
        float fMo14892b = aVar.f15093c.mo14892b() * aVar.f15093c.mo14891a() * 4;
        int iRound = Math.round(aVar.f15095e * fMo14892b);
        int iRound2 = Math.round(fMo14892b * aVar.f15094d);
        int i11 = iM14884c - i10;
        if (iRound2 + iRound <= i11) {
            this.f15087b = iRound2;
            this.f15086a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f15095e;
            float f12 = aVar.f15094d;
            float f13 = f10 / (f11 + f12);
            this.f15087b = Math.round(f12 * f13);
            this.f15086a = Math.round(f13 * aVar.f15095e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m14889f(this.f15087b);
            m14889f(this.f15086a);
            m14889f(i10);
            m14889f(iM14884c);
            aVar.f15092b.getMemoryClass();
            m14885e(aVar.f15092b);
        }
    }

    /* renamed from: c */
    public static int m14884c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m14885e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    /* renamed from: e */
    public static boolean m14885e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m14886a() {
        return this.f15089d;
    }

    /* renamed from: b */
    public int m14887b() {
        return this.f15086a;
    }

    /* renamed from: d */
    public int m14888d() {
        return this.f15087b;
    }

    /* renamed from: f */
    public final String m14889f(int i10) {
        return Formatter.formatFileSize(this.f15088c, i10);
    }
}
