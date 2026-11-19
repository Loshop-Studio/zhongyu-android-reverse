package p169x0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: x0.d */
/* loaded from: classes.dex */
public final class C3435d {

    /* renamed from: a */
    private final Set<a> f12054a = new HashSet();

    /* renamed from: x0.d$a */
    public static final class a {

        /* renamed from: a */
        private final Uri f12055a;

        /* renamed from: b */
        private final boolean f12056b;

        a(Uri uri, boolean z3) {
            this.f12055a = uri;
            this.f12056b = z3;
        }

        /* renamed from: a */
        public Uri m10491a() {
            return this.f12055a;
        }

        /* renamed from: b */
        public boolean m10492b() {
            return this.f12056b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12056b == aVar.f12056b && this.f12055a.equals(aVar.f12055a);
        }

        public int hashCode() {
            return (this.f12055a.hashCode() * 31) + (this.f12056b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void m10488a(Uri uri, boolean z3) {
        this.f12054a.add(new a(uri, z3));
    }

    /* renamed from: b */
    public Set<a> m10489b() {
        return this.f12054a;
    }

    /* renamed from: c */
    public int m10490c() {
        return this.f12054a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3435d.class != obj.getClass()) {
            return false;
        }
        return this.f12054a.equals(((C3435d) obj).f12054a);
    }

    public int hashCode() {
        return this.f12054a.hashCode();
    }
}
