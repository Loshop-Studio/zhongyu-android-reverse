package p174m0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: m0.i */
/* loaded from: classes3.dex */
public final class C8947i {

    /* renamed from: a */
    public final int f14990a;

    /* renamed from: b */
    public final int f14991b;

    /* renamed from: c */
    public final Context f14992c;

    /* renamed from: d */
    public final int f14993d;

    /* renamed from: m0.i$a */
    public static final class a {

        /* renamed from: i */
        public static final int f14994i;

        /* renamed from: a */
        public final Context f14995a;

        /* renamed from: b */
        public ActivityManager f14996b;

        /* renamed from: c */
        public c f14997c;

        /* renamed from: e */
        public float f14999e;

        /* renamed from: d */
        public float f14998d = 2.0f;

        /* renamed from: f */
        public float f15000f = 0.4f;

        /* renamed from: g */
        public float f15001g = 0.33f;

        /* renamed from: h */
        public int f15002h = 4194304;

        static {
            f14994i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f14999e = f14994i;
            this.f14995a = context;
            this.f14996b = (ActivityManager) context.getSystemService("activity");
            this.f14997c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C8947i.m14267e(this.f14996b)) {
                return;
            }
            this.f14999e = 0.0f;
        }

        /* renamed from: a */
        public C8947i m14272a() {
            return new C8947i(this);
        }
    }

    /* renamed from: m0.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final DisplayMetrics f15003a;

        public b(DisplayMetrics displayMetrics) {
            this.f15003a = displayMetrics;
        }

        @Override // p174m0.C8947i.c
        /* renamed from: a */
        public int mo14273a() {
            return this.f15003a.heightPixels;
        }

        @Override // p174m0.C8947i.c
        /* renamed from: b */
        public int mo14274b() {
            return this.f15003a.widthPixels;
        }
    }

    /* renamed from: m0.i$c */
    public interface c {
        /* renamed from: a */
        int mo14273a();

        /* renamed from: b */
        int mo14274b();
    }

    public C8947i(a aVar) {
        this.f14992c = aVar.f14995a;
        int i9 = m14267e(aVar.f14996b) ? aVar.f15002h / 2 : aVar.f15002h;
        this.f14993d = i9;
        int iM14266c = m14266c(aVar.f14996b, aVar.f15000f, aVar.f15001g);
        float fMo14274b = aVar.f14997c.mo14274b() * aVar.f14997c.mo14273a() * 4;
        int iRound = Math.round(aVar.f14999e * fMo14274b);
        int iRound2 = Math.round(fMo14274b * aVar.f14998d);
        int i10 = iM14266c - i9;
        if (iRound2 + iRound <= i10) {
            this.f14991b = iRound2;
            this.f14990a = iRound;
        } else {
            float f10 = i10;
            float f11 = aVar.f14999e;
            float f12 = aVar.f14998d;
            float f13 = f10 / (f11 + f12);
            this.f14991b = Math.round(f12 * f13);
            this.f14990a = Math.round(f13 * aVar.f14999e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m14271f(this.f14991b);
            m14271f(this.f14990a);
            m14271f(i9);
            m14271f(iM14266c);
            aVar.f14996b.getMemoryClass();
            m14267e(aVar.f14996b);
        }
    }

    /* renamed from: c */
    public static int m14266c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m14267e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    /* renamed from: e */
    public static boolean m14267e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m14268a() {
        return this.f14993d;
    }

    /* renamed from: b */
    public int m14269b() {
        return this.f14990a;
    }

    /* renamed from: d */
    public int m14270d() {
        return this.f14991b;
    }

    /* renamed from: f */
    public final String m14271f(int i9) {
        return Formatter.formatFileSize(this.f14992c, i9);
    }
}
