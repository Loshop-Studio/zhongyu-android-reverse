package p081j0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: j0.i */
/* loaded from: classes3.dex */
public final class C6581i {

    /* renamed from: a */
    public final int f8531a;

    /* renamed from: b */
    public final int f8532b;

    /* renamed from: c */
    public final Context f8533c;

    /* renamed from: d */
    public final int f8534d;

    /* renamed from: j0.i$a */
    public static final class a {

        /* renamed from: i */
        public static final int f8535i;

        /* renamed from: a */
        public final Context f8536a;

        /* renamed from: b */
        public ActivityManager f8537b;

        /* renamed from: c */
        public c f8538c;

        /* renamed from: e */
        public float f8540e;

        /* renamed from: d */
        public float f8539d = 2.0f;

        /* renamed from: f */
        public float f8541f = 0.4f;

        /* renamed from: g */
        public float f8542g = 0.33f;

        /* renamed from: h */
        public int f8543h = 4194304;

        static {
            f8535i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f8540e = f8535i;
            this.f8536a = context;
            this.f8537b = (ActivityManager) context.getSystemService("activity");
            this.f8538c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C6581i.m7456e(this.f8537b)) {
                return;
            }
            this.f8540e = 0.0f;
        }

        /* renamed from: a */
        public C6581i m7461a() {
            return new C6581i(this);
        }
    }

    /* renamed from: j0.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final DisplayMetrics f8544a;

        public b(DisplayMetrics displayMetrics) {
            this.f8544a = displayMetrics;
        }

        @Override // p081j0.C6581i.c
        /* renamed from: a */
        public int mo7462a() {
            return this.f8544a.heightPixels;
        }

        @Override // p081j0.C6581i.c
        /* renamed from: b */
        public int mo7463b() {
            return this.f8544a.widthPixels;
        }
    }

    /* renamed from: j0.i$c */
    public interface c {
        /* renamed from: a */
        int mo7462a();

        /* renamed from: b */
        int mo7463b();
    }

    public C6581i(a aVar) {
        this.f8533c = aVar.f8536a;
        int i6 = m7456e(aVar.f8537b) ? aVar.f8543h / 2 : aVar.f8543h;
        this.f8534d = i6;
        int iM7455c = m7455c(aVar.f8537b, aVar.f8541f, aVar.f8542g);
        float fMo7463b = aVar.f8538c.mo7463b() * aVar.f8538c.mo7462a() * 4;
        int iRound = Math.round(aVar.f8540e * fMo7463b);
        int iRound2 = Math.round(fMo7463b * aVar.f8539d);
        int i7 = iM7455c - i6;
        if (iRound2 + iRound <= i7) {
            this.f8532b = iRound2;
            this.f8531a = iRound;
        } else {
            float f6 = i7;
            float f7 = aVar.f8540e;
            float f8 = aVar.f8539d;
            float f9 = f6 / (f7 + f8);
            this.f8532b = Math.round(f8 * f9);
            this.f8531a = Math.round(f9 * aVar.f8540e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m7460f(this.f8532b);
            m7460f(this.f8531a);
            m7460f(i6);
            m7460f(iM7455c);
            aVar.f8537b.getMemoryClass();
            m7456e(aVar.f8537b);
        }
    }

    /* renamed from: c */
    public static int m7455c(ActivityManager activityManager, float f6, float f7) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m7456e(activityManager)) {
            f6 = f7;
        }
        return Math.round(memoryClass * f6);
    }

    /* renamed from: e */
    public static boolean m7456e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m7457a() {
        return this.f8534d;
    }

    /* renamed from: b */
    public int m7458b() {
        return this.f8531a;
    }

    /* renamed from: d */
    public int m7459d() {
        return this.f8532b;
    }

    /* renamed from: f */
    public final String m7460f(int i6) {
        return Formatter.formatFileSize(this.f8533c, i6);
    }
}
