package p102o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: o.i */
/* loaded from: classes2.dex */
public final class C4418i {

    /* renamed from: a */
    public final int f4962a;

    /* renamed from: b */
    public final int f4963b;

    /* renamed from: c */
    public final Context f4964c;

    /* renamed from: d */
    public final int f4965d;

    /* renamed from: o.i$a */
    public static final class a {

        /* renamed from: i */
        public static final int f4966i;

        /* renamed from: a */
        public final Context f4967a;

        /* renamed from: b */
        public ActivityManager f4968b;

        /* renamed from: c */
        public c f4969c;

        /* renamed from: e */
        public float f4971e;

        /* renamed from: d */
        public float f4970d = 2.0f;

        /* renamed from: f */
        public float f4972f = 0.4f;

        /* renamed from: g */
        public float f4973g = 0.33f;

        /* renamed from: h */
        public int f4974h = 4194304;

        static {
            f4966i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f4971e = f4966i;
            this.f4967a = context;
            this.f4968b = (ActivityManager) context.getSystemService("activity");
            this.f4969c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C4418i.m5514e(this.f4968b)) {
                return;
            }
            this.f4971e = 0.0f;
        }

        /* renamed from: a */
        public C4418i m5519a() {
            return new C4418i(this);
        }
    }

    /* renamed from: o.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final DisplayMetrics f4975a;

        public b(DisplayMetrics displayMetrics) {
            this.f4975a = displayMetrics;
        }

        @Override // p102o.C4418i.c
        /* renamed from: a */
        public int mo5520a() {
            return this.f4975a.heightPixels;
        }

        @Override // p102o.C4418i.c
        /* renamed from: b */
        public int mo5521b() {
            return this.f4975a.widthPixels;
        }
    }

    /* renamed from: o.i$c */
    public interface c {
        /* renamed from: a */
        int mo5520a();

        /* renamed from: b */
        int mo5521b();
    }

    public C4418i(a aVar) {
        this.f4964c = aVar.f4967a;
        int i4 = m5514e(aVar.f4968b) ? aVar.f4974h / 2 : aVar.f4974h;
        this.f4965d = i4;
        int iM5513c = m5513c(aVar.f4968b, aVar.f4972f, aVar.f4973g);
        float fMo5521b = aVar.f4969c.mo5521b() * aVar.f4969c.mo5520a() * 4;
        int iRound = Math.round(aVar.f4971e * fMo5521b);
        int iRound2 = Math.round(fMo5521b * aVar.f4970d);
        int i5 = iM5513c - i4;
        int i6 = iRound2 + iRound;
        if (i6 <= i5) {
            this.f4963b = iRound2;
            this.f4962a = iRound;
        } else {
            float f4 = i5;
            float f5 = aVar.f4971e;
            float f6 = aVar.f4970d;
            float f7 = f4 / (f5 + f6);
            this.f4963b = Math.round(f6 * f7);
            this.f4962a = Math.round(f7 * aVar.f4971e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m5518f(this.f4963b));
            sb.append(", pool size: ");
            sb.append(m5518f(this.f4962a));
            sb.append(", byte array size: ");
            sb.append(m5518f(i4));
            sb.append(", memory class limited? ");
            sb.append(i6 > iM5513c);
            sb.append(", max size: ");
            sb.append(m5518f(iM5513c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f4968b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m5514e(aVar.f4968b));
        }
    }

    /* renamed from: c */
    public static int m5513c(ActivityManager activityManager, float f4, float f5) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m5514e(activityManager)) {
            f4 = f5;
        }
        return Math.round(memoryClass * f4);
    }

    /* renamed from: e */
    public static boolean m5514e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m5515a() {
        return this.f4965d;
    }

    /* renamed from: b */
    public int m5516b() {
        return this.f4962a;
    }

    /* renamed from: d */
    public int m5517d() {
        return this.f4963b;
    }

    /* renamed from: f */
    public final String m5518f(int i4) {
        return Formatter.formatFileSize(this.f4964c, i4);
    }
}
