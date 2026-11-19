package p176z;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p011b0.C1025h;

/* renamed from: z.f */
/* loaded from: classes.dex */
public class C3504f {

    /* renamed from: z.f$a */
    public static class a {

        /* renamed from: a */
        private final int f12272a;

        /* renamed from: b */
        private final b[] f12273b;

        @Deprecated
        public a(int i4, b[] bVarArr) {
            this.f12272a = i4;
            this.f12273b = bVarArr;
        }

        /* renamed from: a */
        static a m10668a(int i4, b[] bVarArr) {
            return new a(i4, bVarArr);
        }

        /* renamed from: b */
        public b[] m10669b() {
            return this.f12273b;
        }

        /* renamed from: c */
        public int m10670c() {
            return this.f12272a;
        }
    }

    /* renamed from: z.f$b */
    public static class b {

        /* renamed from: a */
        private final Uri f12274a;

        /* renamed from: b */
        private final int f12275b;

        /* renamed from: c */
        private final int f12276c;

        /* renamed from: d */
        private final boolean f12277d;

        /* renamed from: e */
        private final int f12278e;

        @Deprecated
        public b(Uri uri, int i4, int i5, boolean z3, int i6) {
            this.f12274a = (Uri) C1025h.m4782f(uri);
            this.f12275b = i4;
            this.f12276c = i5;
            this.f12277d = z3;
            this.f12278e = i6;
        }

        /* renamed from: a */
        static b m10671a(Uri uri, int i4, int i5, boolean z3, int i6) {
            return new b(uri, i4, i5, z3, i6);
        }

        /* renamed from: b */
        public int m10672b() {
            return this.f12278e;
        }

        /* renamed from: c */
        public int m10673c() {
            return this.f12275b;
        }

        /* renamed from: d */
        public Uri m10674d() {
            return this.f12274a;
        }

        /* renamed from: e */
        public int m10675e() {
            return this.f12276c;
        }

        /* renamed from: f */
        public boolean m10676f() {
            return this.f12277d;
        }
    }

    /* renamed from: z.f$c */
    public static class c {
        /* renamed from: a */
        public void mo10331a(int i4) {
            throw null;
        }

        /* renamed from: b */
        public void mo10332b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m10667a(Context context, C3502d c3502d, int i4, boolean z3, int i5, Handler handler, c cVar) {
        C3499a c3499a = new C3499a(cVar, handler);
        return z3 ? C3503e.m10661e(context, c3502d, c3499a, i4, i5) : C3503e.m10660d(context, c3502d, i4, null, c3499a);
    }
}
