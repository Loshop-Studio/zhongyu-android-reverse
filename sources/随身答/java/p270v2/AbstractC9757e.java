package p270v2;

import android.content.Context;
import androidx.compose.material3.internal.CalendarModelKt;
import com.umeng.commonsdk.framework.AbstractC6782a;
import p186n2.AbstractC9087a;
import p290x2.C9867b;
import p300y2.C9946b;

/* renamed from: v2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC9757e {

    /* renamed from: v2.e$a */
    public static class a extends h {

        /* renamed from: a */
        public final long f17276a = 15000;

        /* renamed from: b */
        public C9867b f17277b;

        public a(C9867b c9867b) {
            this.f17277b = c9867b;
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return System.currentTimeMillis() - AbstractC6782a.m6272f(AbstractC9087a.m14580b()) >= 15000;
        }
    }

    /* renamed from: v2.e$b */
    public static class b extends h {

        /* renamed from: a */
        public C9946b f17278a;

        /* renamed from: b */
        public C9867b f17279b;

        public b(C9867b c9867b, C9946b c9946b) {
            this.f17279b = c9867b;
            this.f17278a = c9946b;
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: a */
        public boolean mo16420a() {
            return this.f17278a.m17148d();
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return System.currentTimeMillis() - AbstractC6782a.m6272f(AbstractC9087a.m14580b()) >= this.f17278a.m17147b();
        }

        /* renamed from: c */
        public boolean m16421c() {
            return System.currentTimeMillis() - AbstractC6782a.m6271e(AbstractC9087a.m14580b()) >= this.f17278a.m17147b();
        }
    }

    /* renamed from: v2.e$d */
    public static class d extends h {

        /* renamed from: c */
        public static long f17280c = 90000;

        /* renamed from: d */
        public static long f17281d = 86400000;

        /* renamed from: a */
        public long f17282a;

        /* renamed from: b */
        public C9867b f17283b;

        public d(C9867b c9867b, long j9) {
            this.f17283b = c9867b;
            m16423d(j9);
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return z9 || System.currentTimeMillis() - AbstractC6782a.m6272f(AbstractC9087a.m14580b()) >= this.f17282a;
        }

        /* renamed from: c */
        public long m16422c() {
            return this.f17282a;
        }

        /* renamed from: d */
        public void m16423d(long j9) {
            long j10 = f17280c;
            if (j9 < j10 || j9 > f17281d) {
                this.f17282a = j10;
            } else {
                this.f17282a = j9;
            }
        }
    }

    /* renamed from: v2.e$e */
    public static class e extends h {

        /* renamed from: a */
        public long f17284a = CalendarModelKt.MillisecondsIn24Hours;

        /* renamed from: b */
        public C9867b f17285b;

        public e(C9867b c9867b) {
            this.f17285b = c9867b;
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return System.currentTimeMillis() - AbstractC6782a.m6272f(AbstractC9087a.m14580b()) >= this.f17284a;
        }
    }

    /* renamed from: v2.e$f */
    public static class f extends h {

        /* renamed from: b */
        public static long f17286b = 15000;

        /* renamed from: c */
        public static long f17287c = 3000;

        /* renamed from: d */
        public static long f17288d = 90000;

        /* renamed from: a */
        public long f17289a;

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return true;
        }

        /* renamed from: c */
        public long m16424c() {
            return this.f17289a;
        }

        /* renamed from: d */
        public void m16425d(long j9) {
            if (j9 < f17287c || j9 > f17288d) {
                this.f17289a = f17286b;
            } else {
                this.f17289a = j9;
            }
        }
    }

    /* renamed from: v2.e$g */
    public static class g extends h {
        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return true;
        }
    }

    /* renamed from: v2.e$h */
    public static class h {
        /* renamed from: a */
        public boolean mo16420a() {
            return true;
        }

        /* renamed from: b */
        public abstract boolean mo16419b(boolean z9);
    }

    /* renamed from: v2.e$i */
    public static class i extends h {

        /* renamed from: a */
        public Context f17290a;

        public i(Context context) {
            this.f17290a = context;
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return AbstractC9754b.m16364S(this.f17290a);
        }
    }

    /* renamed from: v2.e$j */
    public static class j extends h {

        /* renamed from: a */
        public final long f17291a = 10800000;

        /* renamed from: b */
        public C9867b f17292b;

        public j(C9867b c9867b) {
            this.f17292b = c9867b;
        }

        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return System.currentTimeMillis() - AbstractC6782a.m6272f(AbstractC9087a.m14580b()) >= 10800000;
        }
    }

    /* renamed from: a */
    public static boolean m16418a(int i9) {
        if (i9 == 8 || i9 == 11) {
            return true;
        }
        switch (i9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: v2.e$c */
    public static class c extends h {
        @Override // p270v2.AbstractC9757e.h
        /* renamed from: b */
        public boolean mo16419b(boolean z9) {
            return z9;
        }
    }
}
