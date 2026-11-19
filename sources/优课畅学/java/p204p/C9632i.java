package p204p;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: p.i */
/* loaded from: classes3.dex */
public final class C9632i {

    /* renamed from: a */
    public final int f19259a;

    /* renamed from: b */
    public final int f19260b;

    /* renamed from: c */
    public final Context f19261c;

    /* renamed from: d */
    public final int f19262d;

    /* renamed from: p.i$a */
    public static final class a {

        /* renamed from: i */
        public static final int f19263i;

        /* renamed from: a */
        public final Context f19264a;

        /* renamed from: b */
        public ActivityManager f19265b;

        /* renamed from: c */
        public c f19266c;

        /* renamed from: e */
        public float f19268e;

        /* renamed from: d */
        public float f19267d = 2.0f;

        /* renamed from: f */
        public float f19269f = 0.4f;

        /* renamed from: g */
        public float f19270g = 0.33f;

        /* renamed from: h */
        public int f19271h = 4194304;

        static {
            f19263i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f19268e = f19263i;
            this.f19264a = context;
            this.f19265b = (ActivityManager) context.getSystemService("activity");
            this.f19266c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C9632i.m18186e(this.f19265b)) {
                return;
            }
            this.f19268e = 0.0f;
        }

        /* renamed from: a */
        public C9632i m18191a() {
            return new C9632i(this);
        }
    }

    /* renamed from: p.i$b */
    public static final class b implements c {

        /* renamed from: a */
        public final DisplayMetrics f19272a;

        public b(DisplayMetrics displayMetrics) {
            this.f19272a = displayMetrics;
        }

        @Override // p204p.C9632i.c
        /* renamed from: a */
        public int mo18192a() {
            return this.f19272a.heightPixels;
        }

        @Override // p204p.C9632i.c
        /* renamed from: b */
        public int mo18193b() {
            return this.f19272a.widthPixels;
        }
    }

    /* renamed from: p.i$c */
    public interface c {
        /* renamed from: a */
        int mo18192a();

        /* renamed from: b */
        int mo18193b();
    }

    public C9632i(a aVar) {
        this.f19261c = aVar.f19264a;
        int i10 = m18186e(aVar.f19265b) ? aVar.f19271h / 2 : aVar.f19271h;
        this.f19262d = i10;
        int iM18185c = m18185c(aVar.f19265b, aVar.f19269f, aVar.f19270g);
        float fMo18193b = aVar.f19266c.mo18193b() * aVar.f19266c.mo18192a() * 4;
        int iRound = Math.round(aVar.f19268e * fMo18193b);
        int iRound2 = Math.round(fMo18193b * aVar.f19267d);
        int i11 = iM18185c - i10;
        if (iRound2 + iRound <= i11) {
            this.f19260b = iRound2;
            this.f19259a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f19268e;
            float f12 = aVar.f19267d;
            float f13 = f10 / (f11 + f12);
            this.f19260b = Math.round(f12 * f13);
            this.f19259a = Math.round(f13 * aVar.f19268e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m18190f(this.f19260b);
            m18190f(this.f19259a);
            m18190f(i10);
            m18190f(iM18185c);
            aVar.f19265b.getMemoryClass();
            m18186e(aVar.f19265b);
        }
    }

    /* renamed from: c */
    public static int m18185c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m18186e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    /* renamed from: e */
    public static boolean m18186e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m18187a() {
        return this.f19262d;
    }

    /* renamed from: b */
    public int m18188b() {
        return this.f19259a;
    }

    /* renamed from: d */
    public int m18189d() {
        return this.f19260b;
    }

    /* renamed from: f */
    public final String m18190f(int i10) {
        return Formatter.formatFileSize(this.f19261c, i10);
    }
}
